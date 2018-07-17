# Pgd Sample

## webservice soap
  vat check: http://ec.europa.eu/taxation_customs/vies/checkVatTestService.wsdl
  
  call saop webservice: https://spring.io/guides/gs/consuming-web-service/
  
  
## create compagny

curl -X POST http://localhost:8080/compagny -H "Content-Type:application/json" -d "{ \"vatnumber\" : \"123455\", \"name\" : \"Spectre\" }"  


## test VAT

curl -X POST "http://localhost:8080/vat/checkvat" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"countryCode\": \"LU\", \"vatNumber\": \"21747447\"}"

curl -X POST "http://localhost:8080/service/vat/checkvat" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"countryCode\": \"LU\", \"vatNumber\": \"21747447\"}"



## links

https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html

https://springfox.github.io/springfox/docs/current/


docker build -t abiline/pgd-service .
docker run -p 8080:8080 -it abiline/pgd-service

avec exec

PID   USER     TIME   COMMAND
    1 root       0:42 java -Djava.security.egd=file:/dev/./urandom -jar /servic
   42 root       0:00 sh
   47 root       0:00 ps
/ # MdJ:netflix Jocelyn$ 


sans

PID   USER     TIME   COMMAND
    1 root       0:00 sh -c java $JAVA_OPTS -Djava.security.egd=file:/dev/./ura
    5 root       0:39 java -Djava.security.egd=file:/dev/./urandom -jar /servic
   42 root       0:00 sh
   47 root       0:00 ps