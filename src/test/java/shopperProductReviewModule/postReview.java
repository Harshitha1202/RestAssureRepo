package shopperProductReviewModule;
//Harshitha
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class postReview 
{
	@Test
	public void test()
	{
		File file= new File("C:\\Users\\MBA-Student110\\Desktop\\Eclipse Workspace\\Selenium Workspace\\SDET Workspace\\ShoppersStack\\src\\test\\resources\\review.json");
		baseURI="https://www.shoppersstack.com/shopping/";
		given().body(file).contentType(ContentType.JSON)
		.queryParam("productId", 373).auth()
		.oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbXJAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzM1NjQsImlhdCI6MTY4MTg5NzU2NH0.V4KWfdAAWLJgPNT5oBR2_kSSjLkEwD8x3nkRoSQDiik")
		.when().post("/reviews")
		.then().log().all();
	}
}

//Internal Server Error