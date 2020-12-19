package ir.isc.software.fxa.nimaplus.bim.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("ir.isc.software.fxa.nimaplus.bim")
@EnableJpaRepositories("ir.isc.software.fxa.nimaplus.bim")
@EntityScan("ir.isc.software.fxa.nimaplus.bim")
@Import(DBConfiguration.class)
public class BimMainConfiguration {

}
