package org.example;

import io.restassured.path.json.JsonPath;

import java.util.List;

public class PracticeArrayConcepts {
    public static void main(String[] args) {
        String Palyload = "{\n" +
                "  \"next\": \"page2\",\n" +
                "  \"previous\": null,\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"huid\": \"be7d-794186bda2d3\",\n" +
                "      \"name\": \"John\",\n" +
                "      \"language\": \"eng\",\n" +
                "      \"arns\": [\"doodle:123456\", \"doodle:789101\"],\n" +
                "      \"groups\": [\"admin\", \"manager\"],\n" +
                "      \"fields\": {\n" +
                "        \"consent\": \"TRUE\",\n" +
                "        \"failure_count\": 2,\n" +
                "        \"timestamp\": \"2020-04-17T12:04:04.978887Z\",\n" +
                "        \"registration_type\": \"normal\"\n" +
                "      },\n" +
                "      \"blocked\": false,\n" +
                "      \"stopped\": false,\n" +
                "      \"created_on\": \"2020-04-17T12:04:04.978887Z\",\n" +
                "      \"modified_on\": \"2020-04-17T12:04:05.692949Z\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"huid\": \"aa11-2233445566\",\n" +
                "      \"name\": \"David\",\n" +
                "      \"language\": \"eng\",\n" +
                "      \"arns\": [\"doodle:55555\"],\n" +
                "      \"groups\": [\"user\"],\n" +
                "      \"fields\": {\n" +
                "        \"consent\": \"FALSE\",\n" +
                "        \"failure_count\": 5,\n" +
                "        \"timestamp\": \"2021-05-10T10:00:00.000000Z\",\n" +
                "        \"registration_type\": \"social\"\n" +
                "      },\n" +
                "      \"blocked\": true,\n" +
                "      \"stopped\": false,\n" +
                "      \"created_on\": \"2021-05-10T10:00:00.000000Z\",\n" +
                "      \"modified_on\": \"2021-05-11T11:00:00.000000Z\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JsonPath jsonPath = new JsonPath(Palyload);
        int failurecount = jsonPath.getInt("results[0].fields.failure_count");
        System.out.println(failurecount);

        int failurecount1 = jsonPath.getInt("results[1].fields.failure_count");
        System.out.println(failurecount1);

        List<Integer>count = jsonPath.getList("results.fields.failure_count");
        System.out.println(count);


        String name = jsonPath.getString("results[0].name");
        String Langauage = jsonPath.getString("results[0].language");
        System.out.println(name);
        System.out.println(Langauage);

    }
}

