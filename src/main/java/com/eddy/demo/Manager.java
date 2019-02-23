package com.eddy.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

    @RequestMapping(value = "/getChart/{id}",method = RequestMethod.GET)
    public static  String getChart(@PathVariable("id") int id) throws JsonProcessingException {
        if(id==1){ //sales

            Chart sales = new Chart();

            Calendar cal = Calendar.getInstance();
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

            for( int i=0; i<12;i++){
                sales.dataXAddPoint(i+1);
            }
git commit

        }else if (id==2){ //day

            Random random = new Random();
            Chart days = new Chart();
            for( int i=0; i<12;i++){
                days.dataXAddPoint(i+1);
            }

            for( int i=0; i<12;i++){
                days.dataYAddPoint(random.nextInt()%100);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(days);

        }else if ( id ==3 ){
            // trends
            Random random2 = new Random();
            int start = random2.nextInt();
            Chart trends = new Chart();
            for( int i=2010; i<2019;i++){
                trends.dataXAddPoint(i);
            }

            for( int i=0; i<12;i++){
                start=start+(random2.nextInt()%20);
                trends.dataYAddPoint(start);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(trends);
        }
    }



}
