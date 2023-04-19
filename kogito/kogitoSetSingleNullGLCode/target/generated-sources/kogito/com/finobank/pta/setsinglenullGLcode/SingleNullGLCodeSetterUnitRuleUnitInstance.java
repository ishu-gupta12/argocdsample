package com.finobank.pta.setsinglenullGLcode;

public class SingleNullGLCodeSetterUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit> {

    public SingleNullGLCodeSetterUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit> unit, com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit value) {
        if (value.getSingleCodeRequest() == null) {
            value.setSingleCodeRequest(org.kie.kogito.rules.DataSource.createSingleton());
        }
        value.getSingleCodeRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("singleCodeRequest")));
        runtime.setGlobal("singleCodeRequest", value.getSingleCodeRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (SingleNullGLCodeSetterUnitQueryGetsingleglnum.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new SingleNullGLCodeSetterUnitQueryGetsingleglnum(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
