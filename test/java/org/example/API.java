package org.example;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API {

    public static void main(String[] args){
        Response response = given()
                .when().get("https://jsonplaceholder.typicode.com/posts/2/comments")
                .then().statusCode(200)
                .extract().response();
        System.out.println(response);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        String name = response.jsonPath().getString("find { it.postId == 2 && it.id == 10 }.name");
        String email = response.jsonPath().getString("find { it.postId == 2 && it.id == 10 }.email");

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    }


