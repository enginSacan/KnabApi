package client;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

import java.util.Map;

import static generic.PropertyNames.REST_API_KEY;
import static generic.PropertyNames.REST_API_TOKEN;

public class RestRequestHandler {

    public static ResponseOptions responseOptions;

    public void post (String requestUrl, Map<String, String> params) {
        RestAssured.baseURI = requestUrl;
        responseOptions = RestAssured
                .given()
                .log().all(true)
                .queryParams(params)
                .noContentType()
                .post();
    }
    public void get (String requestUrl, Map<String, String> params) {
        RestAssured.baseURI = requestUrl;
        responseOptions = RestAssured
                .given()
                .log().all(true)
                .queryParams(params)
                .get();
    }
    public void put (String requestUrl, Map<String, String> params) {
        RestAssured.baseURI = requestUrl;
        responseOptions = RestAssured
                .given()
                .log().all(true)
                .queryParams(params)
                .put();
    }
    public void delete (String requestUrl, Map<String, String> params) {
        RestAssured.baseURI = requestUrl;
        responseOptions = RestAssured
                .given()
                .log().all(true)
                .queryParams(params)
                .delete();
    }
}
