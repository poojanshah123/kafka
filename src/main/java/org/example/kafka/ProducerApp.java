package org.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ProducerApp implements CommandLineRunner
{
    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    public static void main( String[] args )
    {
        SpringApplication.run(ProducerApp.class);
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
