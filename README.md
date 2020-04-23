docker build -t servicio-cronograma:v1

docker run -d -p 8012:8012 --name servicio-cronograma --network demo_deposit_kafka-local servicio-cronograma:v1
