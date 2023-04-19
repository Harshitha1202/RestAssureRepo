package shopperProductReviewModule;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getMerchant 
{
	@Test
	public void test()
	{
		File file = new File("C:\\Users\\MBA-Student110\\Desktop\\Eclipse Workspace\\Selenium Workspace\\SDET Workspace\\ShoppersStack\\src\\test\\resources\\postproduct.json");
		baseURI="https://www.shoppersstack.com/shopping/";
		given().body(file).contentType(ContentType.JSON)
		.when().post("/merchants")
		.then().log().all();
	}

}
