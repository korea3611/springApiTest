package com.example.test.api;

import com.example.test.entity.KickboardCompany;
import com.example.test.entity.KickboardLocation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class KickboardCompanyApi {

        @RequestMapping(value = "/restTest", produces = "application/json; charset=utf8")
        @ResponseBody
        public List<Object> restTest() {

                List<Object> kickboardcompany = new ArrayList<>();

                KickboardCompany kickboardCompany1 = new KickboardCompany();
                kickboardCompany1.setCompanyname("씽씽");
                kickboardCompany1.setPricePerHour(10000L);
                kickboardCompany1.setHelmet(false);
                kickboardCompany1.setLicense(true);

                List<String> serviceLocation = new ArrayList<>();
                serviceLocation.add("관악구");
                serviceLocation.add("서초구");
                serviceLocation.add("강남구");
                kickboardCompany1.setServicelocation(serviceLocation);

                kickboardcompany.add(kickboardCompany1);

                return kickboardcompany;
        }

        @RequestMapping(value = "/kickboard/location", produces = "application/json; charset=utf8")
        @ResponseBody
        public List<Object> kickboardlocation() {

                List<Object> kickboardlocation = new ArrayList<>();

                KickboardLocation kickboardLocation1 = new KickboardLocation();
                kickboardLocation1.setCompany_name("씽씽");
                kickboardLocation1.setLat(37.566571);
                kickboardLocation1.setLng(126.978441);
                kickboardLocation1.setBattery(80L);
                kickboardLocation1.setModel("AAAAA");
                kickboardLocation1.setImg_url("http://****.jpg");

                KickboardLocation kickboardLocation2 = new KickboardLocation();
                kickboardLocation2.setCompany_name("킥고잉");
                kickboardLocation2.setLat(37.566572);
                kickboardLocation2.setLng(126.978442);
                kickboardLocation2.setBattery(90L);
                kickboardLocation2.setModel("CCCCC");
                kickboardLocation2.setImg_url("http://****.jpg");

                KickboardLocation kickboardLocation3 = new KickboardLocation();
                kickboardLocation3.setCompany_name("라임");
                kickboardLocation3.setLat(37.566573);
                kickboardLocation3.setLng(126.978443);
                kickboardLocation3.setBattery(100L);
                kickboardLocation3.setModel("BBBBB");
                kickboardLocation3.setImg_url("http://****.jpg");

                kickboardlocation.add(kickboardLocation1);
                kickboardlocation.add(kickboardLocation2);
                kickboardlocation.add(kickboardLocation3);

                return kickboardlocation;

        }

}
