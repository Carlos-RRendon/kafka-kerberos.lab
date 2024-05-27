package mx.chartech.kafka_poc.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "spring.kafka")
public class KafkaProps {
    private boolean mock;
    private String bootstrapServers;
    private String auditTrialsTopic;
    private String eventLogsTopic;
}
