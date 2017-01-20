package test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;
import java.net.URI;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class IdeaResourceTest {

	    static final URI BASE_URI = getBaseURI();
	    HttpServer server;

	    private static URI getBaseURI() {
	        return UriBuilder.fromUri("http://localhost/").port(8080).build();
	    }

	    @Before
	    public void startServer() throws IOException {
	        System.out.println("Starting Server...");

	    }

		@After
	    public void stopServer() throws NullPointerException {
	        System.out.println("Stopping Server...");
	       // server.shutdownNow();
	    }

		// This is to test for a valid airport code
	    @Test
	    public void testIdeaResourcePositive() throws IOException {
	        Client client = Client.create(new DefaultClientConfig());
	        WebResource service = client.resource(getBaseURI());
	        ClientResponse resp = service.path("RestClientTest").path("rest").path("test").path("getInfo").queryParam("airportCode", "SFO")
	                .accept(MediaType.APPLICATION_XML)
	                .get(ClientResponse.class);
	        System.out.println("Got response: " + resp);
	        String response = resp.getEntity(String.class);
            assertNotNull(response);
	        assertEquals(200, resp.getStatus());
	    }
	    
		// This is to test when entered invalid airport code
	    @Test
	    public void testIdeaResourceNegative() throws IOException {
	        Client client = Client.create(new DefaultClientConfig());
	        WebResource service = client.resource(getBaseURI());
	        ClientResponse resp = service.path("RestClientTest").path("rest").path("test").path("getInfo").queryParam("airportCode", "abc")
	                .accept(MediaType.APPLICATION_XML)
	                .get(ClientResponse.class);
	        System.out.println("Got response: " + resp);
	        String response = resp.getEntity(String.class);
            assertNotNull(response);
	        assertEquals(500, resp.getStatus());
	    }
	    
		// This is to test that airport code doesn't accept numbers
	    @Test
	    public void testIdeaResourceNumber() throws IOException {
	        Client client = Client.create(new DefaultClientConfig());
	        WebResource service = client.resource(getBaseURI());
	        ClientResponse resp = service.path("RestClientTest").path("rest").path("test").path("getInfo").queryParam("airportCode", "123")
	                .accept(MediaType.APPLICATION_XML)
	                .get(ClientResponse.class);
	        System.out.println("Got response: " + resp);
	        String response = resp.getEntity(String.class);
            assertNotNull(response);
	        assertEquals(500, resp.getStatus());
	    }
	    
		// This is to test that airport code doesn't accept invalid characters
	    @Test
	    public void testIdeaResourceInvalid() throws IOException {
	        Client client = Client.create(new DefaultClientConfig());
	        WebResource service = client.resource(getBaseURI());
	        ClientResponse resp = service.path("RestClientTest").path("rest").path("test").path("getInfo").queryParam("airportCode", "@5j")
	                .accept(MediaType.APPLICATION_XML)
	                .get(ClientResponse.class);
	        System.out.println("Got response: " + resp);
	        String response = resp.getEntity(String.class);
            assertNotNull(response);
	        assertEquals(500, resp.getStatus());
	    }
	    
		// This is to test that airport code works both for upper and lower case
	    @Test
	    public void testIdeaResourceIgnoreCase() throws IOException {
	        Client client = Client.create(new DefaultClientConfig());
	        WebResource service = client.resource(getBaseURI());
	        ClientResponse resp = service.path("RestClientTest").path("rest").path("test").path("getInfo").queryParam("airportCode", "jfk")
	                .accept(MediaType.APPLICATION_XML)
	                .get(ClientResponse.class);
	        System.out.println("Got response: " + resp);
	        String response = resp.getEntity(String.class);
            assertNotNull(response);
	        assertEquals(200, resp.getStatus());
	    }
	}


