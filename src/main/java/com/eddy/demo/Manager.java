package com.eddy.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Manager {

    @RequestMapping(value = "/getShopLocation",method = RequestMethod.GET)
    public static  String getShopLocation() throws JsonProcessingException {

        List<Shop> listOfShops = new ArrayList<Shop>();
        listOfShops.add(new Shop("Zabka", 34.456f, (float) 43.341));
        listOfShops.add(new Shop("Zabka2", 34.453f, (float) 43.342));
        listOfShops.add(new Shop("Zabka3", 34.454f, (float) 43.343));
        listOfShops.add(new Shop("Zabka4", 34.455f, (float) 43.344));
        listOfShops.add(new Shop("Zabka5", 34.456f, (float) 43.345));
        listOfShops.add(new Shop("Zabka6", 34.457f, (float) 43.348));

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(listOfShops);
    }

    @RequestMapping(value = "/getBestLocation",method = RequestMethod.GET)
    public static  String getBestLocation() throws JsonProcessingException {

        BestLocation bestLocation = new BestLocation(45.45,454.34,43);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(bestLocation);
    }



}
