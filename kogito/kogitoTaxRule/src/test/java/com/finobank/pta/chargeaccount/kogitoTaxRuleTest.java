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

import com.finobank.pta.taxescalculator.MyAgendaEventListener;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@QuarkusTest
public class kogitoTaxRuleTest {

    @Inject
    MyAgendaEventListener listener;

    ///////////////invalid Data////////////////////

    @Test
    public void invalidData() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/invalidData.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":0.0,\"taxIGSTTranType\":null,\"taxCGSTAmount\":0.0,\"taxCGSTTranType\":null,\"taxSGSTAmount\":0.0,\"taxSGSTTranType\":null}]"));
                System.out.println("Entered value are valid invalidData");
    }
    /////////////Rule1 Inclusive False/////////////////////

    @Test
    public void Rule1_InclusiveFalse() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/Rule1_InclusiveFalse.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":0.0,\"taxIGSTTranType\":\"IGSTTran\",\"taxCGSTAmount\":1.11,\"taxCGSTTranType\":\"CGSTTran\",\"taxSGSTAmount\":1.11,\"taxSGSTTranType\":\"SGSTTran\"}]"));
                System.out.println("Entered value are valid Rule1_InclusiveFalse");
    }

    //////////////////////Rule1 Inclusive True///////////////////////////

    @Test
    public void Rule1_InclusiveTrue() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/Rule1_InclusiveTrue.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":0.0,\"taxIGSTTranType\":\"IGSTTran\",\"taxCGSTAmount\":0.94,\"taxCGSTTranType\":\"CGSTTran\",\"taxSGSTAmount\":0.94,\"taxSGSTTranType\":\"SGSTTran\"}]"));
                System.out.println("Entered value are valid Rule1_InclusiveTrue");
    }

    ////////////////////Rule2 Inclusive False////////////////////////////

    @Test
    public void Rule2_InclusiveFalse() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/Rule2_InclusiveFalse.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":261.42,\"taxIGSTTranType\":\"IGSTTran\",\"taxCGSTAmount\":0.0,\"taxCGSTTranType\":\"CGSTTran\",\"taxSGSTAmount\":0.0,\"taxSGSTTranType\":\"SGSTTran\"}]"));
                System.out.println("Entered value are valid Rule2_InclusiveFalse");
    }

    ////////////////////Rule2 Inclusive True/////////////////////////

    @Test
    public void Rule2_InclusiveTrue() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/Rule2_InclusiveTrue.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":221.55,\"taxIGSTTranType\":\"IGSTTran\",\"taxCGSTAmount\":0.0,\"taxCGSTTranType\":\"CGSTTran\",\"taxSGSTAmount\":0.0,\"taxSGSTTranType\":\"SGSTTran\"}]"));
                System.out.println("Entered value are valid Rule2_InclusiveTrue");
    }

    ///////////////Rule1 Inclusive True_ Negative Charge Amount/////////////////

    @Test
    public void Rule1_InclusiveTrue_NegativeChargeAmount() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/Rule1_InclusiveTrue_NegativeChargeAmount.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":0.0,\"taxIGSTTranType\":\"IGSTTran\",\"taxCGSTAmount\":-955.83,\"taxCGSTTranType\":\"CGSTTran\",\"taxSGSTAmount\":-955.83,\"taxSGSTTranType\":\"SGSTTran\"}]"));
                System.out.println("Entered value are valid Rule1_InclusiveTrue_NegativeChargeAmount");
    }


    ////////////////////fino Branch State Code Missing//////////////////////

    @Test
    public void finoBranchStateCodeMissing() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargeaccount/testJSON/finoBranchStateCodeMissing.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/gettaxdetails")
                .then()
                .statusCode(200)
                .body(is("[{\"taxIGSTAmount\":0.0,\"taxIGSTTranType\":null,\"taxCGSTAmount\":0.0,\"taxCGSTTranType\":null,\"taxSGSTAmount\":0.0,\"taxSGSTTranType\":null}]"));
                System.out.println("Entered value are ivalid finoBranchStateCodeMissing");
    }


    
}


