package mx.chartech.kafka_poc.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "kafka")
@Data
public class KafkaProps {
    private boolean mock;
    private String bootstrapServers;
    private Audit auditTrials;
    private Event eventLogs;
}
