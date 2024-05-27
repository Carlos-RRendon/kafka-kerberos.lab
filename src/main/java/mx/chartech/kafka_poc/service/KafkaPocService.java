package mx.chartech.kafka_poc.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.chartech.kafka_poc.configuration.properties.KafkaProps;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaPocService implements IKafkaPocService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaProps kafkaProps;

    @Override
    public void sendAudit( String message) {
        kafkaTemplate.send(kafkaProps.getAuditTrialsTopic(), message);
    }
    @Override
    public void sendLogs( String message) {
        kafkaTemplate.send(kafkaProps.getEventLogsTopic(), message);
    }
}
