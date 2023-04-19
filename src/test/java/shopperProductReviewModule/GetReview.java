package shopperProductReviewModule;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetReview 
{
	@Test
	public void test()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		given().pathParam("productId", 115)
		.when().get("/reviews/{productId}")
		.then().log().all();
	}

}

