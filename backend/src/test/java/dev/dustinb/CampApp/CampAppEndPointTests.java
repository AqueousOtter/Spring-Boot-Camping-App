package dev.dustinb.CampApp;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class CampAppEndPointTests {

	@LocalServerPort
	int randomServerPort;

	@DisplayName("Test retrieving all reservations, status code 200")
	@Test
	public void testGetReservationsAndStatusCode() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:" + randomServerPort +"/reservations/allReservations";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		System.out.println(result.getBody());
		Assert.assertTrue(result.getBody().contains("reservationId"));
	}



}
