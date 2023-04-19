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
package com.finobank.pta.chargeaccount;

import javax.inject.Inject;


import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@QuarkusTest
public class kogitoChargeAccountRuleTest {

    @Inject
    MyAgendaEventListener listener;

   /////////////////// valid ///////////////////

    @Test
    public void rule1() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/valid.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/chargeaccount")
                .then()
                .statusCode(200)
                .body(is("[{\"chargeID\":\"521\",\"chargeAccount\":\"3213000720\",\"tieredCharge\":false,\"chargeType\":\"F\",\"chargeValue\":1.42,\"chargeTranType\":\"CHGBENE\",\"taxInclusiveInCharge\":true}]"));
                System.out.println("Entered value are valid for rule1");
    }
    
    

     ///////////////////Invalid Input /////////////////// 

    @Test
    public void inValidInput() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/inValidInput.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/chargeaccount")
                .then()
                .statusCode(200)
                .body(is("[{\"chargeID\":null,\"chargeAccount\":null,\"tieredCharge\":false,\"chargeType\":null,\"chargeValue\":0.0,\"chargeTranType\":null,\"taxInclusiveInCharge\":false}]"));
                System.out.println("Entered value are invalid");
    }

    ///////////////////Request With Null Input/////////////////// 
    
    @Test
    public void requestWithNullInput() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/requestWithNullInput.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/chargeaccount")
                .then()
                .statusCode(200)
                .body(is("[{\"chargeID\":null,\"chargeAccount\":null,\"tieredCharge\":false,\"chargeType\":null,\"chargeValue\":0.0,\"chargeTranType\":null,\"taxInclusiveInCharge\":false}]"));
                System.out.println("Entered value are request With Null Input");
    }

   ///////////////////appId Missin/////////////////// 
    
    @Test
    public void appIdMissing() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/appIdMissing.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/chargeaccount")
                .then()
                .statusCode(200)
                .body(is("[{\"chargeID\":null,\"chargeAccount\":null,\"tieredCharge\":false,\"chargeType\":null,\"chargeValue\":0.0,\"chargeTranType\":null,\"taxInclusiveInCharge\":false}]"));
                System.out.println("Entered value  With app Id Missing");
    }

}
