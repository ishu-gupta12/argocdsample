package com.finobank.pta.chargeaccount;

public class ChargeAccountCalculatorUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit> {

    public ChargeAccountCalculatorUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit> unit, com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit value) {
        value.getChargeRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("chargeRequest")));
        runtime.setGlobal("chargeRequest", value.getChargeRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (ChargeAccountCalculatorUnitQueryChargeaccount.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new ChargeAccountCalculatorUnitQueryChargeaccount(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
