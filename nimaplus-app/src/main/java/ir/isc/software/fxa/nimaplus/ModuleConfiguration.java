package ir.isc.software.fxa.nimaplus;

import ir.isc.software.fxa.nimaplus.bim.config.BimMainConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(BimMainConfiguration.class)
public class ModuleConfiguration {
}
