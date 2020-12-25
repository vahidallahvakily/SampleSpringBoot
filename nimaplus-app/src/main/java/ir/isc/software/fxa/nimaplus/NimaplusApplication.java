package ir.isc.software.fxa.nimaplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NimaplusApplication {
	//TODO
	// 1- Swagger - ***DONE***
	// 2- DTO / Spring Mapper - ***Done***
	// 3 - Test / Integration Test ( repository / database) ***DONE***
	// ----  3-1 Junit4 / Junit 5- jupiter ?
	// ----- 3-2 Assert Library
	// ------ 3-3 Rest Test / WireMock (Spring cloud contract)
	// 4 - Logger -> Probbely log4j2 -> Use Lombok ***DONE***
	// 5- Pageable plus filter
	// ---- Good Article = https://blog.tratif.com/2017/11/23/effective-restful-search-api-in-spring/
	// ---- Good Github project : https://github.com/nilestanner/spring-filter-sort-page-sample
	// 6- PropertySource => PropertyConfig @ConfigurationProperties **DONE***
	// ----- 6-1 Loader yaml -> have to activate @PropertySource doesn't load yaml
	// 7 - Queue - rabbit MQ => Using amqp rather than jms
	//        For Redis Pub/sub => We have library in Spring as spring-data-redis but redis doesn't support persistence
	//------- For ActiveMQ / IBM WebMQ Sphere => Spring Boot JMS
	// 8-  MicroMeter / Spring Boot Actuator / Prometheus / Grafana
	// 9-  FlyWheel **DONE***
	// 10- Swagger Api / Api Group - What tag of Swagger should we use ?
	// 11- Define generic ModelMapper
	// 12 - Transactional Test => Not Use @Transactional for Now **DONE**
	// 13 - exception or (OperationResult include validationErrors Not throwing exceptioon -> Transactional Rollback)
	// 14 - generic problem mapping in web layer
	// 15 - dependancy management
	// 16- hystrix
	public static void main(String[] args) {
		SpringApplication.run(NimaplusApplication.class, args);
	}

}
