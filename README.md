# Pgd Sample

## webservice soap
  vat check: http://ec.europa.eu/taxation_customs/vies/checkVatTestService.wsdl
  
  call saop webservice: https://spring.io/guides/gs/consuming-web-service/
  
  
## create compagny

curl -X POST http://localhost:8080/compagny -H "Content-Type:application/json" -d "{ \"vatnumber\" : \"123455\", \"name\" : \"Spectre\" }"  


## test VAT

curl -X POST "http://localhost:8080/vat/checkvat" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"countryCode\": \"LU\", \"vatNumber\": \"21747447\"}"

