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
package com.finobank.pta.allowedtransaction;

import org.kie.kogito.rules.DataSource;

import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.SingletonStore;


public class CheckAllowedTransactionUnit implements RuleUnitData {

    // private DataStore<CheckAllowedTransactionRequest> checkRequest;
    // private DataStore<CheckAllowedTransactionResponse> checkResponse;

    private SingletonStore<CheckAllowedTransactionRequest> checkRequest = DataSource.createSingleton();

    /**
     * @return the checkRequest
     */
    public SingletonStore<CheckAllowedTransactionRequest> getCheckRequest() {
        return checkRequest;
    }

    /**
     * @param checkRequest the checkRequest to set
     */
    public void setCheckRequest(SingletonStore<CheckAllowedTransactionRequest> checkRequest) {
        this.checkRequest = checkRequest;
    }
    
    
}
