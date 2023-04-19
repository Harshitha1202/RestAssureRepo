package shopperProductReviewModule;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getProductAnsGetReveiw {
	@Test
	public void test()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		Response resp = given().queryParam("zoneId", "ALPHA")
		.auth()
		.oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbXJAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzM1NjQsImlhdCI6MTY4MTg5NzU2NH0.V4KWfdAAWLJgPNT5oBR2_kSSjLkEwD8x3nkRoSQDiik")
		.when().get("/products");
		
		Object pid = resp.jsonPath().get("data[0].productId");
		
		given().pathParam("productId", pid)
		.when().get("/reviews/{productId}")
		.then().log().all();
	}

}
