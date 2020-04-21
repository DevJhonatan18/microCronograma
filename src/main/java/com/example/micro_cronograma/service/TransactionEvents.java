package com.example.micro_cronograma.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.micro_cronograma.entity.TablaCronogramaPrestamos;
import com.example.micro_cronograma.entity.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class TransactionEvents {

	private Logger log = LoggerFactory.getLogger(TransactionEvents.class);
	
	@Autowired
	private ICronogramaService repository;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		
		double newmonto = 0;
		// int nroprestamo = 0;
		boolean isPagado = false;
		
		TablaCronogramaPrestamos objAccount = new TablaCronogramaPrestamos();
		Transaction transactionEvent = objectMapper.readValue(consumerRecord.value(), Transaction.class);
		log.info("transactionEvent : {} ", transactionEvent.getId());
		log.info("transactionEvent : {} ", transactionEvent.getNroprestamo());
		log.info("transactionEvent : {} ", transactionEvent.getCuota());
		objAccount = repository.findByNroprestamoAndCuota(transactionEvent.getNroprestamo(), transactionEvent.getCuota());
		
	
		log.info(" xxxxxxx Cronograma get amout xxxxxxxxxxxxxx: ",  String.valueOf( objAccount.getImporteCuota() ) );
		
		if( Double.compare( objAccount.getImporteCuota()  , transactionEvent.getImporteCuota()) == 0) {
			log.info(" couta = transaccion cuota ");
			log.info("get amout : ", objAccount.getImporteCuota());
			objAccount.setPagado(true);
		}
		// objAccount.setPagado(true);
		/*switch (transactionEvent.getType()) {
		case "deposito":
			newmonto = objAccount.getTotalAmount() + transactionEvent.getAmount();
			break;
		case "retiro":
			newmonto = objAccount.getTotalAmount() - transactionEvent.getAmount();
			break;
		default:
			log.info("Invalid Library Event type");
		}
		*/
		/*log.info("set new amount {}",newmonto);*/
		//objAccount.setTotalAmount(newmonto);
		
		repository.save(objAccount);
		
	}
	
	
	
}
