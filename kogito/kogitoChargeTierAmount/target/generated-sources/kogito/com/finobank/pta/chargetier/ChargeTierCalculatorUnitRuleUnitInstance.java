package com.finobank.pta.chargetier;

public class ChargeTierCalculatorUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.chargetier.ChargeTierCalculatorUnit> {

    public ChargeTierCalculatorUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.chargetier.ChargeTierCalculatorUnit> unit, com.finobank.pta.chargetier.ChargeTierCalculatorUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.chargetier.ChargeTierCalculatorUnit value) {
        if (value.getChargeRequest() == null) {
            value.setChargeRequest(org.kie.kogito.rules.DataSource.createSingleton());
        }
        value.getChargeRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("chargeRequest")));
        runtime.setGlobal("chargeRequest", value.getChargeRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (ChargeTierCalculatorUnitQueryChargetier.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new ChargeTierCalculatorUnitQueryChargetier(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
