package org.example;

import io.restassured.path.json.JsonPath;

public class NestedArray {
    public static void main(String[] args) {
        String playload = "{\n" +
                "  \"docSetGeneral\": {\n" +
                "    \"billsOfLading\": [],\n" +
                "    \"invoices\": [\n" +
                "      {\n" +
                "        \"invoiceId\": \"HBRG26A-1047\",\n" +
                "        \"amount\": 28735,\n" +
                "        \"senderCountryCode\": \"VN\",\n" +
                "        \"buyerName\": \"DELTA CANAL TRADING B.V.\",\n" +
                "        \"buyerCity\": \"Rotterdam\",\n" +
                "        \"deliveryTerms\": \"5\\\" trailer\",\n" +
                "        \"netWeight\": \"1620.5 KGS\",\n" +
                "        \"grossWeight\": \"1779.0 KGS\",\n" +
                "        \"invoiceDate\": \"2026-01-08\",\n" +
                "        \"numberOfPieces\": 2460,\n" +
                "        \"numberOfCartons\": 132,\n" +
                "        \"currency\": \"EUR\",\n" +
                "        \"reference\": \"HBRG26A-1047\",\n" +
                "        \"shipper\": \"HARBORIDGE IMPORT EXPORT CO., LTD.\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"packingLists\": [\n" +
                "      {\"reference\": \"PL-740211-A\"},\n" +
                "      {\"reference\": \"PL-740211-B\"},\n" +
                "      {\"reference\": \"PL-740211-C\"},\n" +
                "      {\"reference\": \"PL-740211-D\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        JsonPath jsonPath = new JsonPath(playload);

        // Extract 3rd packing list reference (index 2)
        String thirdPackingListReference = jsonPath.getString("docSetGeneral.packingLists[2].reference");

        System.out.println("Reference of 3rd packing list: " + thirdPackingListReference);
    }
}
