package com.finobank.pta.setsinglenullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import org.drools.model.Query;

public class Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnit extends Rules7980478CABA2C3A392A747C896CBF5E1 {

    @Override
    public String getName() {
        return super.getName() + ".SingleNullGLCodeSetterUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@76f25a0a
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_32_8211_32IMPS(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_32_8211_32NEFT(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_8211_32BENEVERIFICATION(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32CASHIN_32_8211_32CASHIN(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32CASHOUT_32_8211_32CASHOUT(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_8211_32IMPS(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_8211_32NEFT(),
                                       Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_8211_32BENEVERIFICATION());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_getsingleglnum = query_getsingleglnum();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_getsingleglnum() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_GENERATED_$pattern_SetSingleNullGLCodeRequest$1$ = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                                                                DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                                                                "GENERATED_$pattern_SetSingleNullGLCodeRequest$1$",
                                                                                                                                                                                D.entryPoint("singleCodeRequest"));
        final org.drools.model.Variable<java.util.Map> var_$r = D.declarationOf(java.util.Map.class,
                                                                                DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.java_util_Map_Metadata_INSTANCE,
                                                                                "$r",
                                                                                D.reactiveFrom(var_GENERATED_$pattern_SetSingleNullGLCodeRequest$1$,
                                                                                               (com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) -> _this.getApiResponse()));
        org.drools.model.Query getsingleglnum_build = queryDef_getsingleglnum.build(D.pattern(var_GENERATED_$pattern_SetSingleNullGLCodeRequest$1$,
                                                                                              D.entryPoint("singleCodeRequest")),
                                                                                    D.pattern(var_$r));
        return getsingleglnum_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_getsingleglnum);
    }
}
