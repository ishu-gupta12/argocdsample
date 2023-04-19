/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.finobank.pta.allowedTransaction;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AllowedTransactionTest {

   // @Inject
   // MyAgendaEventListener listener;


 //When account is allowed  
  @Test
    public void isAllowedTest() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/resources/testJSON/isAllowed.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/checkallowedtrantype")
                .then()
                .statusCode(200)
                .body(is("[{\"allowed\":true}]"));
                System.out.println("Entered value are valid");
    }


    //When account is not allowed  
  @Test
    public void notAllowedTest() throws IOException{
        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/resources/testJSON/notAllowed.json").toAbsolutePath());
        String bdy = new String(b);
        System.out.println("Body"+bdy);
        given().header("Content-type", "application/json").body(bdy)
        .when()
        .post("/checkallowedtrantype")
        .then()
        .statusCode(200)
        .body(is("[{\"allowed\":true}]"));

        System.out.println("Entered value are invalid");
    }



    //When request has missing attribute  
   @Test
    public void missingAttributeTest() throws IOException{
        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/resources/testJSON/missingAttribute.json").toAbsolutePath());
        String bdy = new String(b);
        System.out.println("Body"+bdy);
        given().header("Content-type", "application/json").body(bdy)
        .when()
        .post("/checkallowedtrantype")
        .then()
        .statusCode(200)
        .body(is("[{\"allowed\":false}]"));
        System.out.println("Attribute value is missing");
    }


 //When request has incorrect attribute value  
  @Test
    public void incorrectAttributeValueTest() throws IOException{
        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/resources/testJSON/incorrectValue.json").toAbsolutePath());
        String bdy = new String(b);
        System.out.println("Body"+bdy);
        given().header("Content-type", "application/json").body(bdy)
        .when()
        .post("/checkallowedtrantype")
        .then()
        .statusCode(200)
        .body(is("[{\"allowed\":false}]"));
        System.out.println("The value you entered is incorrect");
    }


//When request has missing attribute value 
    @Test
    public void missingAttributeValueTest() throws IOException{
        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/resources/testJSON/missingValue.json").toAbsolutePath());
        String bdy = new String(b);
        System.out.println("Body"+bdy);
        given().header("Content-type", "application/json").body(bdy)
        .when()
        .post("/checkallowedtrantype")
        .then()
        .statusCode(200)
        .body(is("[{\"allowed\":false}]"));
        System.out.println("The value is missing");
    }



}
