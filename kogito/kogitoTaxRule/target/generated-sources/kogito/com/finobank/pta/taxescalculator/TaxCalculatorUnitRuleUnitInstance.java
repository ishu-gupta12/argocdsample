package com.finobank.pta.taxescalculator;

public class TaxCalculatorUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<com.finobank.pta.taxescalculator.TaxCalculatorUnit> {

    public TaxCalculatorUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.finobank.pta.taxescalculator.TaxCalculatorUnit> unit, com.finobank.pta.taxescalculator.TaxCalculatorUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, com.finobank.pta.taxescalculator.TaxCalculatorUnit value) {
        if (value.getTaxRequest() == null) {
            value.setTaxRequest(org.kie.kogito.rules.DataSource.createSingleton());
        }
        value.getTaxRequest().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("taxRequest")));
        runtime.setGlobal("taxRequest", value.getTaxRequest());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (TaxCalculatorUnitQueryGettaxdetails.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new TaxCalculatorUnitQueryGettaxdetails(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
