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
package com.finobank.pta.chargetier;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@QuarkusTest
public class kogitoChargeTierAmountTest {

    @Inject
    MyAgendaEventListener listener;



/////////////////////Valid/////////////////////


    @Test
    public void Rule1() throws IOException {

        byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/valid.json").toAbsolutePath());

      String bdy = new String(b);
      System.out.println("Body"+bdy);
    
      given().header("Content-type", "application/json").body(bdy)
                .when()
                .post("/chargetier")
                .then()
                .statusCode(200)
                .body(is("[{\"uniqueTransactionId\":\"464\",\"chargeID\":\"520\",\"transactionAmount\":1101.0,\"chargeAmount\":12.5,\"chargeType\":\"F\"}]"));
                System.out.println("Entered value are valid Rule1");
    }


       ////////////Null TransactionId////////////////////////

       @Test
       public void nullTransactionId() throws IOException {

           byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/nullTransactionId.json").toAbsolutePath());

         String bdy = new String(b);
         System.out.println("Body"+bdy);

         given().header("Content-type", "application/json").body(bdy)
                   .when()
                   .post("/chargetier")
                   .then()
                   .statusCode(200)
                   .body(is("[{\"uniqueTransactionId\":\"\",\"chargeID\":\"520\",\"transactionAmount\":1101.0,\"chargeAmount\":12.5,\"chargeType\":\"F\"}]"));
                   System.out.println("Entered value are invalid nullTransactionId");
       }

       ///////////Null TransactionId and Negative Transaction Amount//////////////

       @Test
       public void nullTransactionId_negativeTransactionAmount() throws IOException {

           byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/nullTransactionId_negativeTransactionAmount.json").toAbsolutePath());

         String bdy = new String(b);
         System.out.println("Body"+bdy);

         given().header("Content-type", "application/json").body(bdy)
                   .when()
                   .post("/chargetier")
                   .then()
                   .statusCode(200)
                   .body(is("[{\"uniqueTransactionId\":null,\"chargeID\":null,\"transactionAmount\":0.0,\"chargeAmount\":0.0,\"chargeType\":null}]"));
                   System.out.println("Entered value are invalid nullTransactionId_negativeTransactionAmount");
       }

       //////////Invalid ChargeId and Negative Transaction Amount//////////////



       @Test
       public void invalidChargeId_negativeTransactionAmount() throws IOException {

           byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/invalidChargeId_negativeTransactionAmount.json").toAbsolutePath());

         String bdy = new String(b);
         System.out.println("Body"+bdy);

         given().header("Content-type", "application/json").body(bdy)
                   .when()
                   .post("/chargetier")
                   .then()
                   .statusCode(200)
                   .body(is("[{\"uniqueTransactionId\":null,\"chargeID\":null,\"transactionAmount\":0.0,\"chargeAmount\":0.0,\"chargeType\":null}]"));
                   System.out.println("Entered value are invalid invalidChargeId_negativeTransactionId");
       }
    

         ////////////////Transaction Amount More Than Two Digit After Decimal/////////////////////////



       @Test
       public void transactionAmountMoreThanTwoDigitAfterDecimal() throws IOException {

           byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/transactionAmountMoreThanTwoDigitAfterDecimal.json").toAbsolutePath());

         String bdy = new String(b);
         System.out.println("Body"+bdy);

         given().header("Content-type", "application/json").body(bdy)
                   .when()
                   .post("/chargetier")
                   .then()
                   .statusCode(200)
                   .body(is("[{\"uniqueTransactionId\":\"464\",\"chargeID\":\"520\",\"transactionAmount\":1101.98765,\"chargeAmount\":12.5,\"chargeType\":\"F\"}]"));
                   System.out.println("Entered value are ivalid transactionAmountMoreThanTwoDigitAfterDecimal");
       }

       /////////////////Charge  Id   Missing  Test case //////////////////////////////

       @Test
       public void chargeIdMissing() throws IOException {

           byte[] b = Files.readAllBytes(Paths.get("src/test/java/com/finobank/pta/chargetier/testJSON/chargeIdMissing.json").toAbsolutePath());

         String bdy = new String(b);
         System.out.println("Body"+bdy);

         given().header("Content-type", "application/json").body(bdy)
                   .when()
                   .post("/chargetier")
                   .then()
                   .statusCode(200)
                   .body(is("[{\"uniqueTransactionId\":null,\"chargeID\":null,\"transactionAmount\":0.0,\"chargeAmount\":0.0,\"chargeType\":null}]"));
                   System.out.println("Entered value are ivalid charge Id Missing");
       }
}
