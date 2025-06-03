package br.pucpr.devops.controller;


import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metrics")
public class MetricController {

    @Autowired
    private TelemetryClient telemetryClient;

    @GetMapping("/insights")
    public String testarAppInsights() {
        telemetryClient.trackEvent("Chamada manual ao /insights");
        telemetryClient.trackTrace("Trace de teste");
        telemetryClient.trackMetric("somas_realizadas", 1);
        return "Telemetry enviada!";
    }
}
