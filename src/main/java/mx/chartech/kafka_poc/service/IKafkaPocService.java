package mx.chartech.kafka_poc.service;

public interface IKafkaPocService {
    void sendAudit(String message);
    void sendLogs(String message);
}
