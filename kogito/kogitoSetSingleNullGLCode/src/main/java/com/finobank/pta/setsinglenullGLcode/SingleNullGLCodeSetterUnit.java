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


import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.SingletonStore;


public class SingleNullGLCodeSetterUnit implements RuleUnitData {


    private SingletonStore<SetSingleNullGLCodeRequest> singleCodeRequest = DataSource.createSingleton();

    
    /**
     * 
     */
    public SingleNullGLCodeSetterUnit() {
    }

    /**
     * @return the singleCodeRequest
     */
    public SingletonStore<SetSingleNullGLCodeRequest> getSingleCodeRequest() {
        return singleCodeRequest;
    }

    /**
     * @param singleCodeRequest the singleCodeRequest to set
     */
    public void setSingleCodeRequest(SingletonStore<SetSingleNullGLCodeRequest> singleCodeRequest) {
        this.singleCodeRequest = singleCodeRequest;
    }
    
    
}
