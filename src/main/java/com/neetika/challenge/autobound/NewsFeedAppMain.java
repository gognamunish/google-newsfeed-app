package com.neetika.challenge.autobound;


import com.neetika.challenge.autobound.repository.SpreadSheetRepository;
import com.neetika.challenge.autobound.service.SpreadSheetUpdaterService;
import com.neetika.challenge.autobound.service.SpreadsheetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewsFeedAppMain {

    public static void main(String[] args) {
        SpringApplication.run(NewsFeedAppMain.class, args);
    }


    @Bean
    CommandLineRunner initialize(SpreadSheetRepository spreadSheetRepository, SpreadSheetUpdaterService service, SpreadsheetService spreadsheetService) {
        return args -> {
            spreadsheetService.getOrCreateNewSheet();
            service.fetchAndUpdate();
        };
    }

}
