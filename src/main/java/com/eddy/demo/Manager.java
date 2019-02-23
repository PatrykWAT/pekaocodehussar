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
        listOfShops.add(new Shop("Kebab Max", -33.836011, 150.990550));
        listOfShops.add(new Shop("Kuchnia chinska", -33.836461, 150.990319));
        listOfShops.add(new Shop("KFC", -33.837117, 150.991229));
        listOfShops.add(new Shop("Kebab Turkey", -33.837781, 150.988552));
        listOfShops.add(new Shop("Kuchnia Polska", -33.837086, 150.988756));
        listOfShops.add(new Shop("McDonald", -33.837861, 150.997790));

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(listOfShops);
    }

    @RequestMapping(value = "/getBestLocation",method = RequestMethod.GET)
    public static  String getBestLocation() throws JsonProcessingException {

        BestLocation bestLocation = new BestLocation(-33.834501, 150.995404,83);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(bestLocation);
    }

    @RequestMapping(value = "/getChart/{id}",method = RequestMethod.GET)
    public static  String getChart(@PathVariable("id") int id) throws JsonProcessingException {
        if(id==1){ //sales

            Chart sales = new Chart();

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -10);


            for( int i=0; i<10;i++){
                int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
                sales.dataXAddPoint(dayOfMonth);
                cal.add(Calendar.DATE, 1);
            }
            Random random3 = new Random();
            int next;
            for ( int i=0; i<10; i++) {

                 next= random3.nextInt(1000);
                if (next % 2 == 0)
                    sales.dataYAddPoint(1232 + next);
                else
                    sales.dataYAddPoint(1232 - next);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(sales);


        }else if (id==2){ //day

            Random random = new Random();
            Chart days = new Chart();
            for( int i=0; i<12;i++){
                days.dataXAddPoint(i+1);
            }

            for( int i=0; i<12;i++){
                days.dataYAddPoint(random.nextInt(Integer.SIZE - 1)%100);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(days);

        }else if ( id ==3 ){
            // trends
            Random random2 = new Random();
            int start = random2.nextInt(Integer.SIZE - 1)%30;
            Chart trends = new Chart();
            for( int i=2010; i<2019;i++){
                trends.dataXAddPoint(i);
            }

            for( int i=0; i<12;i++){
                start=start+(random2.nextInt(Integer.SIZE - 1)%20);
                trends.dataYAddPoint(start);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(trends);
        }
        return null;
    }



}
