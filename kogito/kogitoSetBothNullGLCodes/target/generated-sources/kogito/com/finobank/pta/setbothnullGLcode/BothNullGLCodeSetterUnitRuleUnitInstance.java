package com.finobank.pta.setbothnullGLcode;

public class BothNullGLCodeSetterUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit> {

    public BothNullGLCodeSetterUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit> unit, com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit value) {
        if (value.getBothCodeRequest() == null) {
            value.setBothCodeRequest(org.kie.kogito.rules.DataSource.createSingleton());
        }
        value.getBothCodeRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("bothCodeRequest")));
        runtime.setGlobal("bothCodeRequest", value.getBothCodeRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (BothNullGLCodeSetterUnitQueryGetbothglnum.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new BothNullGLCodeSetterUnitQueryGetbothglnum(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
