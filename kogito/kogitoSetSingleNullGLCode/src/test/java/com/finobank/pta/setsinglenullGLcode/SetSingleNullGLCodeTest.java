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
package com.finobank.pta.setsinglenullGLcode;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
//import static org.hamcrest.MatcherAssert.assertThat;

@QuarkusTest
public class SetSingleNullGLCodeTest {

   
  //When account is valid  
    @Test
    public void validGLCode() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/validGLCode.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"accountOrGLCode\":\"3210000101\"}]"));
    }

   
  //When account is valid  
    @Test
    public void validGLCode1() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/validGLCode1.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[{\"accountOrGLCode\":\"3233000104\"}]"));
    }

    
   
     //When account is invalid 
    @Test
    public void inValidGLCode() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/inValidGLCode.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }


  //When request has some missing attribute  
    @Test
    public void missingAttributeGLCode() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/missingAttribute.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }

  //When request has some missing attribute  
    @Test
    public void missingAttributeGLCode1() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/missingAttribute1.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }



  //When request has some missing attribute  Value
    @Test
    public void missingAttributeValue() throws IOException {


        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/setsinglenullGLcode/resources/testJSON/missingValue.json").toAbsolutePath());
      String bdy = new String(b);
      System.out.println("Body"+bdy);


      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/getsingleglnum")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }

}
