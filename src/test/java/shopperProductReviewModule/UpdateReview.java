package shopperProductReviewModule;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UpdateReview 
{
	@Test
	public void test()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		File file = new File("C:\\Users\\MBA-Student110\\Desktop\\Eclipse Workspace\\Selenium Workspace\\SDET Workspace\\ShoppersStack\\src\\test\\resources\\updatereview.json");
		given().body(file).contentType(ContentType.JSON).queryParam("productId", 115).pathParam("reviewId", 40)
		.when().put("/reviews/{reviewId}")
		.then().log().all();
	}

}
