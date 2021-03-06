//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "airportHttpGet", targetNamespace = "http://www.webserviceX.NET")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AirportHttpGet {


    /**
     * 
     * 				Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * 				CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * 				Feet,Latitude in Degree,Latitude in Minute Latitude in
     * 				Second,Latitude in N/S, Longitude in Degree, Longitude in Minute,
     * 				Longitude in Seconds and longitude E/W by ISO country code
     * 			
     * 
     * @param countryAbbrviation
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAirportInformationByISOCountryCode(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryAbbrviation")
        String countryAbbrviation);

    /**
     * 
     * 				Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * 				CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * 				Feet,Latitude in Degree,Latitude in Minute Latitude in
     * 				Second,Latitude in N/S, Longitude in Degree, Longitude in Minute,
     * 				Longitude in Seconds and longitude E/W by city or airport name
     * 			
     * 
     * @param cityOrAirportName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAirportInformationByCityOrAirportName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "cityOrAirportName")
        String cityOrAirportName);

    /**
     * 
     * 				Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * 				CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * 				Feet,Latitude in Degree,Latitude in Minute Latitude in
     * 				Second,Latitude in N/S, Longitude in Degree, Longitude in Minute,
     * 				Longitude in Seconds and longitude E/W by country name
     * 			
     * 
     * @param country
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAirportInformationByCountry")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAirportInformationByCountry(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "country")
        String country);

    /**
     * 
     * 				Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * 				CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * 				Feet,Latitude in Degree,Latitude in Minute Latitude in
     * 				Second,Latitude in N/S, Longitude in Degree, Longitude in Minute,
     * 				Longitude in Seconds and longitude E/W by airport code
     * 			
     * 
     * @param airportCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAirportInformationByAirportCode(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "airportCode")
        String airportCode);

}
