package com.finobank.pta.allowedtransaction;

public class CheckAllowedTransactionUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.allowedtransaction.CheckAllowedTransactionUnit> {

    public CheckAllowedTransactionUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.allowedtransaction.CheckAllowedTransactionUnit> unit, com.finobank.pta.allowedtransaction.CheckAllowedTransactionUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.allowedtransaction.CheckAllowedTransactionUnit value) {
        if (value.getCheckRequest() == null) {
            value.setCheckRequest(org.kie.kogito.rules.DataSource.createSingleton());
        }
        value.getCheckRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("checkRequest")));
        runtime.setGlobal("checkRequest", value.getCheckRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (CheckAllowedTransactionUnitQueryCheckallowedtrantype.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new CheckAllowedTransactionUnitQueryCheckallowedtrantype(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
