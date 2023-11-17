package com.tap.coffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tap.coffeeShop.Service.AirportService;
@Controller()
public class CoffeeShopController {

	private AirportService airportService;
	
	
	@Autowired
	public CoffeeShopController(AirportService airportService) {
		this.airportService = airportService;
	}
	public CoffeeShopController() {
		System.out.println("Object created by Spring IOC Container....ThankYou");
	}
	@RequestMapping(value="/gotojavaProgram")
	public void acceptFirstRequest() {
		System.out.println("accepted First Request");
	}
	@RequestMapping(value="/gotojavaProgramSreenu")
	public void acceptSecondRequest() {
		System.out.println("accepted Second Request");
	}
	@RequestMapping(value="/getDataFormHtml")
	public void acceptDataRequest(@RequestParam String airportName,@RequestParam String location,
			@RequestParam int noofplanes, @RequestParam int noofrunways  ) {
		System.out.println("accepted Data Request");
		System.out.println("Airport Name: "+airportName);
		System.out.println("Airport Location: "+location);
		System.out.println("No Of Planes: "+noofplanes);
		System.out.println("No OF Runways: "+noofrunways);
	}
	 
}
