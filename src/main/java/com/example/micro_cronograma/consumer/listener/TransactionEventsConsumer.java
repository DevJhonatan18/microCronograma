package com.example.micro_cronograma.consumer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.micro_cronograma.service.TransactionEvents;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TransactionEventsConsumer {

	private Logger log =LoggerFactory.getLogger(TransactionEventsConsumer.class) ;
	
	 @Autowired
	 private TransactionEvents transactionEvents;
	
	@KafkaListener(topics= {"loan-transaction-events"})
	public void onMessage(ConsumerRecord<Integer,String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		
		log.info("ConsumerRecord account : {} ",consumerRecord);
		
		transactionEvents.processTransactionEvent(consumerRecord);
	}
	
}