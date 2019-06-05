Requirements

Java 1.8+
Maven 3+
Lombok

SOCTest Application

	Frameworks utilizados 
		Spring Boot 2.1.5
		Spring WS
		Struts2
		JDBC
		
	Artefatos
		sboot-soctest-web - Executa na porta 8000
		sboot-soctest-service - Executa na porta 8001

	O projeto consiste em duas aplicações Spring Boot.
	A aplicação WEB é responsavel pelo client web Struts2 e consumidora do WS exposto
	pela segunda aplicação Spring Boot Service que por sua vez é responsavel 
	por expor EndPoint SOAP que recebe chamadas e raliza consultas em banco de dados.
