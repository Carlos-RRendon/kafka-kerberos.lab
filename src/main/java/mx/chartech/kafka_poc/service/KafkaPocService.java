package mx.chartech.kafka_poc.service;

import lombok.RequiredArgsConstructor;
import mx.chartech.kafka_poc.configuration.properties.KafkaProps;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaPocService implements  IKafkaPocService{

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaProps kafkaProps;

    @Override
    public void sendAudit(String message) {
        kafkaTemplate.send(kafkaProps.getAuditTrials().getTopic(),message);
    }

    @Override
    public void sendLogs(String message) {
        kafkaTemplate.send(kafkaProps.getEventLogs().getTopic(),message);
    }
}
