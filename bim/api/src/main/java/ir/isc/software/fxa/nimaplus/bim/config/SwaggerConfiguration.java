package ir.isc.software.fxa.nimaplus.bim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api2() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("BIM-V1")
                .select()
                .paths(PathSelectors.ant("/api/bim/v1/**"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API Nima Plus")
                .description("Description of API Documentation")
                .version("0.0.1")
                .build();
    }
}
