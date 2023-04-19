package com.finobank.pta.setbothnullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import org.drools.model.Query;

public class RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnit extends RulesF08758C3B0C48D1A8FEEB907D51082A5 {

    @Override
    public String getName() {
        return super.getName() + ".BothNullGLCodeSetterUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@6845740d
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule1(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule2(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule3(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule4(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule5(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule6(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule7(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule8(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule9(),
                                       RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0.rule_Rule10());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_getbothglnum = query_getbothglnum();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_getbothglnum() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_GENERATED_$pattern_SetBothNullGLCodeRequest$2$ = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                                                          DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                                                          "GENERATED_$pattern_SetBothNullGLCodeRequest$2$",
                                                                                                                                                                          D.entryPoint("bothCodeRequest"));
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse> var_$response = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse.class,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeResponse_Metadata_INSTANCE,
                                                                                                                                      "$response",
                                                                                                                                      D.reactiveFrom(var_GENERATED_$pattern_SetBothNullGLCodeRequest$2$,
                                                                                                                                                     com.finobank.pta.setbothnullGLcode.P73.LambdaExtractor7367C89F50F1E2052775764DE2376655.INSTANCE));
        org.drools.model.Query getbothglnum_build = queryDef_getbothglnum.build(D.pattern(var_GENERATED_$pattern_SetBothNullGLCodeRequest$2$,
                                                                                          D.entryPoint("bothCodeRequest")),
                                                                                D.pattern(var_$response));
        return getbothglnum_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_getbothglnum);
    }
}
