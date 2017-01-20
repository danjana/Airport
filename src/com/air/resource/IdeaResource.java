package com.air.resource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.Country;
import net.webservicex.CountrySoap;

import com.sun.jndi.toolkit.url.Uri;


@Path("/test")
public class IdeaResource {


	@GET
	@Produces(MediaType.APPLICATION_XML)

	@Path("/getInfo")
	public String getInfo(@QueryParam("airportCode")String airportCode ) throws JAXBException {
		//call web service here 
		String country = "";
	    String airportCd = "";
	    String airportName = "";
	    String currencyCode = "";
	    String currencyName = "";
		String result ="";
		URL url;
		final String AIRPORT_WSDL_URL = "http://www.webservicex.net/airport.asmx?WSDL";
		try {
			url = new URL(AIRPORT_WSDL_URL);
			Airport airport=new Airport(url);
			AirportSoap soap=airport.getAirportSoap();
			result=soap.getAirportInformationByAirportCode(airportCode);
			
			List<Table> airportInfolist= IdeaUtil.parseTheXML(result);         
	        for(Table airportInfo:airportInfolist){  
	        	country  = airportInfo.getCountry();	
	        	airportCd = airportInfo.getAirportCode();
	        	airportName = airportInfo.getCityOrAirportName();
	        } 
	        
	        //Pass the country name retruned in getAirportInformationByAirportCode to getCurrencyByCountry()
	        result = getCurrencyByCountry(country);   
	        
	        // Prase the out put return by getCurrencyByCountry
	        List<Table> currencyInfoList = IdeaUtil.parseTheXML(result);
	       	        
	        for(Table currencyInfo:currencyInfoList){  
	        	currencyCode = currencyInfo.getCurrencyCode();
	        	currencyName = currencyInfo.getCurrency();
	        }
	        
	        //Create a custom Response.
	       	        
	        Table table = new Table();
	        table.setAirportCode(airportCd);
	        table.setCountry(country);
	        table.setCityOrAirportName(airportName);
	        table.setCurrency(currencyName);
	        table.setCurrencyCode(currencyCode);
	        table.setLocalTime(IdeaUtil.getCurrentDate());
	        
	        JAXBContext jaxbContext = JAXBContext.newInstance(Table.class);
	        result = IdeaUtil.asString(jaxbContext,table);			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}




	@GET
	@Produces(MediaType.APPLICATION_XML)

	@Path("/getAirportInformationByAirportCode")
	public String getAirportInformationByAirportCode(@QueryParam("airportCode")String airportCode ) {
		//call web service here 

		String result ="";
		URL url;
		try {
			url = new URL("http://www.webservicex.net/airport.asmx?WSDL");
			Airport airport=new Airport(url);
			AirportSoap soap=airport.getAirportSoap();
			result=soap.getAirportInformationByAirportCode(airportCode);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getAirportInformationByISOCountryCode")

	public String getInformation(@QueryParam("CountryAbbrviation")String CountryAbbrviation ) {
		//call web service here 

		String result ="";
		URL url;
		try {
			url = new URL("http://www.webservicex.net/airport.asmx?WSDL");
			Airport airport=new Airport(url);
			AirportSoap soap=airport.getAirportSoap();
			result=soap.getAirportInformationByISOCountryCode(CountryAbbrviation);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return result;

	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getAirportInformationByCountry")

	public String getAirportInformationByCountry(@QueryParam("country")String country ) {
		//call web service here 

		String result ="";
		URL url;
		try {
			url = new URL("http://www.webservicex.net/airport.asmx?WSDL");
			Airport airport=new Airport(url);
			AirportSoap soap=airport.getAirportSoap();
			result=soap.getAirportInformationByCountry(country);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return result;

	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getCurrencies")
	public String getCurrencies() {  
		String result ="";
		URL url;
		try {
			url = new URL("http://www.webservicex.net/country.asmx?WSDL");
			Country country=new Country();
			CountrySoap soap=country.getCountrySoap();
			result=soap.getCurrencies();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getCurrencyByCountry")
	public String getCurrencyByCountry(@QueryParam("CountryName")String countryName) {  
		String result ="";
		URL url;
		try {
			url = new URL("http://www.webservicex.net/country.asmx?WSDL");
			Country country=new Country();
			CountrySoap soap=country.getCountrySoap();
			result=soap.getCurrencyByCountry(countryName);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
