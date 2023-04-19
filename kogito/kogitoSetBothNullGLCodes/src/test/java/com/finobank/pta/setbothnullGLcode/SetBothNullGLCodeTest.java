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

package com.finobank.pta.setbothnullGLcode;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class SetBothNullGLCodeTest {

   
  //When both account is valid  
    @Test
    public void validBothNullGLCode() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/validGLCode.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":\"2346\",\"drAccountOrGLCode\":\"20020845341\"}]"));
    }


   //When both account is valid         
    @Test
    public void validBothNullGLCode1() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/validGLCode1.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":\"12345678\",\"drAccountOrGLCode\":\"3233000104\"}]"));
    }


  //When request have missing Attribute  
    @Test
    public void missingAttribute() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/missingAttribute.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":null,\"drAccountOrGLCode\":null}]"));
    }



  //When request have missing Attribute  
    @Test
    public void missingAttribute1() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/missingAttribute1.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":null,\"drAccountOrGLCode\":null}]"));
    }



  //When request have invalid Attribute value 
    @Test
    public void invalidAttribute() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/invalidAttribute.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":null,\"drAccountOrGLCode\":null}]"));
    }



    //When request have missing Attribute value 
  @Test
    public void missingAttributeValue() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setbothnullGLcode/resources/testJSON/missingValue.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getbothglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"crAccountOrGLCode\":null,\"drAccountOrGLCode\":null}]"));
    }


   

}

