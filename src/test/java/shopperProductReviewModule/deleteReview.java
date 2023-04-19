package shopperProductReviewModule;
//Harshitha
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteReview 
{
	@Test
	public void test()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		given().queryParam("productId", 115).pathParam("reviewId", 40)
		.when().delete("/reviews/{reviewId}")
		.then().log().all();
	}


}
