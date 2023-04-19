package com.finobank.pta.chargeaccount;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import org.drools.model.Query;

public class RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnit extends RulesC7DF8C050BB15943859DD690572C5AE9 {

    @Override
    public String getName() {
        return super.getName() + ".ChargeAccountCalculatorUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@5488f63e
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32DHANUPAY_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32DHANUPAY_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32DHANUPAY_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SHIGHRAPAY_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SHIGHRAPAY_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SHIGHRAPAY_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SI_32ONLINE_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SI_32ONLINE_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32SI_32ONLINE_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_323LINE_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_323LINE_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_323LINE_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods0.rule_Rule1_32For_32PARTNER_32BHOOPALAM_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1.rule_Rule1_32For_32PARTNER_32BHOOPALAM_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1.rule_Rule1_32For_32PARTNER_32BHOOPALAM_32_8211_32NEFTCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1.rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32BENECHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1.rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32IMPSCHARGED(),
                                       RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1.rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32NEFTCHARGED());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_chargeaccount = query_chargeaccount();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_chargeaccount() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_GENERATED_$pattern_ChargeAccountRequest$2$ = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                                                              DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                                                              "GENERATED_$pattern_ChargeAccountRequest$2$",
                                                                                                                                                              D.entryPoint("chargeRequest"));
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountResponse> var_$response = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountResponse.class,
                                                                                                                              DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountResponse_Metadata_INSTANCE,
                                                                                                                              "$response",
                                                                                                                              D.reactiveFrom(var_GENERATED_$pattern_ChargeAccountRequest$2$,
                                                                                                                                             com.finobank.pta.chargeaccount.P15.LambdaExtractor157F113A73B1C897192708EA16A95990.INSTANCE));
        org.drools.model.Query chargeaccount_build = queryDef_chargeaccount.build(D.pattern(var_GENERATED_$pattern_ChargeAccountRequest$2$,
                                                                                            D.entryPoint("chargeRequest")),
                                                                                  D.pattern(var_$response));
        return chargeaccount_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_chargeaccount);
    }
}
