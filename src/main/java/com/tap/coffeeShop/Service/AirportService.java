package com.tap.coffeeShop.Service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AirportService {

	public AirportService() {
		System.out.println("AirportService Created");
	}
	public boolean validate(@RequestParam String airportName,@RequestParam String location,
			@RequestParam int noofplanes, @RequestParam int noofrunways  ) {
			boolean flag=false;
			if(airportName!=null && !airportName.isEmpty()) {
				flag=true;
			}else {
				return flag;
			}
			if(location!=null && !location.isEmpty()) {
				flag=true;
			}else {
				return flag;
			}
			if(noofplanes>0) {
				flag=true;
			}else {
				return flag;
			}
			if(noofrunways>0) {
				flag=true;
			}else {
				return flag;
			}
		
		return flag;
	}
	
}
