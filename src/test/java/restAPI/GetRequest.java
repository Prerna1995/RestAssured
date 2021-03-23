package restAPI;



	
	//import org.hamcrest.Matchers;
	import org.testng.annotations.Test;

	//import org.junit.Test;

	import io.restassured.RestAssured;


	public class GetRequest {
		
		@Test
		
		
		public void test1() {
			
			RestAssured.given()
			           .baseUri("http://localhost:8088/employees")
			           .queryParam("id", "1")
			           .when()
			           .get()
			           .then()
			           .statusCode(200)
			           .log()
			           .all();
		}
		
		

	}

