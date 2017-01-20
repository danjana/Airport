package com.air.resource;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Table")
public class Table {
	
	private String airportCode;
	private String cityOrAirportName;
	private String country;
	private String countryAbbrviation;
	private String countryCode;
	private String gMTOffset;
	private String runwayLengthFeet;
	private String runwayElevationFeet;
	private String latitudeDegree;
	private String latitudeMinute;
	private String latitudeSecond;
	private String latitudeNpeerS;
	private String longitudeDegree;
	private String longitudeMinute;
	private String longitudeSeconds;
	private String longitudeEperW;
	
	private String name;
	private String currency;
	private String currencyCode;
	private String localTime;
	
	
	@XmlElement(name="DataAccessedTimestamp") 
	public String getLocaltime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	
		
	@XmlElement(name="Name") 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="Currency")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@XmlElement(name="CurrencyCode")
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
	@XmlElement(name="AirportCode")
	public String getAirportCode() {
		return airportCode;
	}	
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	@XmlElement(name="CityOrAirportName")	
	public String getCityOrAirportName() {
		return cityOrAirportName;
	}	
	public void setCityOrAirportName(String cityOrAirportName) {
		this.cityOrAirportName = cityOrAirportName;
	}
	
	@XmlElement(name="Country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@XmlElement(name="CountryAbbrviation")
	public String getCountryAbbrviation() {
		return countryAbbrviation;
	}
	public void setCountryAbbrviation(String countryAbbrviation) {
		this.countryAbbrviation = countryAbbrviation;
	}
	
	@XmlElement(name="CountryCode")
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@XmlElement(name="GMTOffset")
	public String getgMTOffset() {
		return gMTOffset;
	}
	public void setgMTOffset(String gMTOffset) {
		this.gMTOffset = gMTOffset;
	}
	
	@XmlElement(name="RunwayLengthFeet")
	public String getRunwayLengthFeet() {
		return runwayLengthFeet;
	}
	public void setRunwayLengthFeet(String runwayLengthFeet) {
		this.runwayLengthFeet = runwayLengthFeet;
	}
	
	@XmlElement(name="RunwayElevationFeet")
	public String getRunwayElevationFeet() {
		return runwayElevationFeet;
	}
	public void setRunwayElevationFeet(String runwayElevationFeet) {
		this.runwayElevationFeet = runwayElevationFeet;
	}
	
	@XmlElement(name="LatitudeDegree")
	public String getLatitudeDegree() {
		return latitudeDegree;
	}
	public void setLatitudeDegree(String latitudeDegree) {
		this.latitudeDegree = latitudeDegree;
	}
	
	@XmlElement(name="LatitudeMinute")
	public String getLatitudeMinute() {
		return latitudeMinute;
	}
	public void setLatitudeMinute(String latitudeMinute) {
		this.latitudeMinute = latitudeMinute;
	}
	
	@XmlElement(name="LatitudeSecond")
	public String getLatitudeSecond() {
		return latitudeSecond;
	}
	public void setLatitudeSecond(String latitudeSecond) {
		this.latitudeSecond = latitudeSecond;
	}
	
	@XmlElement(name="LatitudeNpeerS")
	public String getLatitudeNpeerS() {
		return latitudeNpeerS;
	}
	public void setLatitudeNpeerS(String latitudeNpeerS) {
		this.latitudeNpeerS = latitudeNpeerS;
	}
	
	@XmlElement(name="LongitudeDegree")
	public String getLongitudeDegree() {
		return longitudeDegree;
	}
	public void setLongitudeDegree(String longitudeDegree) {
		this.longitudeDegree = longitudeDegree;
	}
	
	@XmlElement(name="LongitudeMinute")
	public String getLongitudeMinute() {
		return longitudeMinute;
	}
	public void setLongitudeMinute(String longitudeMinute) {
		this.longitudeMinute = longitudeMinute;
	}
	
	@XmlElement(name="LongitudeSeconds")
	public String getLongitudeSeconds() {
		return longitudeSeconds;
	}
	public void setLongitudeSeconds(String longitudeSeconds) {
		this.longitudeSeconds = longitudeSeconds;
	}
	
	@XmlElement(name="LongitudeEperW")
	public String getLongitudeEperW() {
		return longitudeEperW;
	}
	public void setLongitudeEperW(String longitudeEperW) {
		this.longitudeEperW = longitudeEperW;
	}
  
}
