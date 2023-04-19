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
package com.finobank.pta.chargeaccount;

import java.util.List;
import java.util.Map;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

public class ChargeAccountCalculatorUnitQueryChargeaccount implements org.kie.kogito.rules.RuleUnitQuery<List<com.finobank.pta.chargeaccount.ChargeAccountResponse>> {

    private final RuleUnitInstance<com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit> instance;

    public ChargeAccountCalculatorUnitQueryChargeaccount(RuleUnitInstance<com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit> instance) {
        this.instance = instance;
    }

    @Override
    public List<com.finobank.pta.chargeaccount.ChargeAccountResponse> execute() {
        return instance.executeQuery("chargeaccount").stream().map(this::toResult).collect(toList());
    }

    private com.finobank.pta.chargeaccount.ChargeAccountResponse toResult(Map<String, Object> tuple) {
        return (com.finobank.pta.chargeaccount.ChargeAccountResponse) tuple.get("$response");
    }
}
