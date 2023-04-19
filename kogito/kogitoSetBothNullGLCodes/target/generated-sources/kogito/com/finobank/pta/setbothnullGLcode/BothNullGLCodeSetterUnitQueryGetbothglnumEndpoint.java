/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/getbothglnum")
public class BothNullGLCodeSetterUnitQueryGetbothglnumEndpoint {

    @javax.inject.Inject
    RuleUnit<com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit> ruleUnit;

    public BothNullGLCodeSetterUnitQueryGetbothglnumEndpoint() {
    }

    public BothNullGLCodeSetterUnitQueryGetbothglnumEndpoint(RuleUnit<com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse> executeQuery(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit unitDTO) {
        RuleUnitInstance<com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit> instance = ruleUnit.createInstance(unitDTO);
        // Do not return the result directly to allow post execution codegen (like monitoring)
        List<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse> response = instance.executeQuery(BothNullGLCodeSetterUnitQueryGetbothglnum.class);
        return response;
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse executeQueryFirst(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit unitDTO) {
        List<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse> results = executeQuery(unitDTO);
        com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}
