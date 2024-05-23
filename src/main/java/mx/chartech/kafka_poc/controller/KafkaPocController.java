package mx.chartech.kafka_poc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.chartech.kafka_poc.service.IKafkaPocService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/poc")
@Slf4j
@RequiredArgsConstructor
public class KafkaPocController {



    @PostMapping("/")
    public ResponseEntity kafkaPoc(){
        log.info("Kafka Poc");

        return ResponseEntity.ok("Kafka Poc");
    }


}
