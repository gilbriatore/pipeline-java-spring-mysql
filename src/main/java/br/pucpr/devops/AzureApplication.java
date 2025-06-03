package br.pucpr.devops;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import com.microsoft.applicationinsights.connectionstring.ConnectionString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureApplication {

    public static void main(String[] args) {
        System.setProperty("applicationinsights.runtime-attach.configuration.classpath.file", "applicationinsights.json");
        ApplicationInsights.attach();
        ConnectionString.configure("InstrumentationKey=c4d73764-91fc-46b0-bf01-359883323bad;IngestionEndpoint=https://brazilsouth-0.in.applicationinsights.azure.com/");
        SpringApplication.run(AzureApplication.class, args);
    }
}
