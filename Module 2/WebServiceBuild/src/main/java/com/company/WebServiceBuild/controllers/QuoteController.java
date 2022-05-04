package com.company.WebServiceBuild.controllers;

import com.company.WebServiceBuild.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class QuoteController {
    private static int idCounter = 1;
    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(

            new Quote (idCounter ++, "Honorine", "roses are red"),
            new Quote (idCounter ++, "Honorine","cakes are tasteful"),
            new Quote (idCounter ++, "Honorine"," beautiful days are made"),
            new Quote (idCounter ++, "Honorine","Eat for your health"),
            new Quote (idCounter ++, "Honorine","Repeat until you get there"),
            new Quote (idCounter ++, "Honorine","tomorrow will be better"),
            new Quote (idCounter ++, "Honorine","Sunny beach"),
            new Quote (idCounter ++, "Honorine","Rainy days"),
            new Quote (idCounter ++, "Honorine","Beatiful flowers"),
            new Quote (idCounter ++, "Honorine","Bright face"),
            ));

    @RequestMapping(value="quote",method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public List<Quote> getQuoteList(){
        return quoteList;
    }

}
