package br.pucpr.devops.config;

import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelemetryConfiguration {

    @Bean
    public TelemetryClient telemetryClient() {
        return new TelemetryClient();
    }
}
