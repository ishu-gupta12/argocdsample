package com.finobank.pta.taxescalculator;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import org.drools.model.Query;

public class Rules124468C2FDDEC2D953291DFF095CD58B_TaxCalculatorUnit extends Rules124468C2FDDEC2D953291DFF095CD58B {

    @Override
    public String getName() {
        return super.getName() + ".TaxCalculatorUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@5f896c16
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules124468C2FDDEC2D953291DFF095CD58B_TaxCalculatorUnitRuleMethods0.rule_Rule1(),
                                       Rules124468C2FDDEC2D953291DFF095CD58B_TaxCalculatorUnitRuleMethods0.rule_Rule2());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_gettaxdetails = query_gettaxdetails();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_gettaxdetails() {
        final org.drools.model.Variable<com.finobank.pta.taxescalculator.TaxCalculationRequest> var_GENERATED_$pattern_TaxCalculationRequest$1$ = D.declarationOf(com.finobank.pta.taxescalculator.TaxCalculationRequest.class,
                                                                                                                                                                  DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE,
                                                                                                                                                                  "GENERATED_$pattern_TaxCalculationRequest$1$",
                                                                                                                                                                  D.entryPoint("taxRequest"));
        final org.drools.model.Variable<com.finobank.pta.taxescalculator.TaxCalculationResponse> var_$response = D.declarationOf(com.finobank.pta.taxescalculator.TaxCalculationResponse.class,
                                                                                                                                 DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationResponse_Metadata_INSTANCE,
                                                                                                                                 "$response",
                                                                                                                                 D.reactiveFrom(var_GENERATED_$pattern_TaxCalculationRequest$1$,
                                                                                                                                                com.finobank.pta.taxescalculator.P12.LambdaExtractor12E8D24243FB1175758095960460F165.INSTANCE));
        org.drools.model.Query gettaxdetails_build = queryDef_gettaxdetails.build(D.pattern(var_GENERATED_$pattern_TaxCalculationRequest$1$,
                                                                                            D.entryPoint("taxRequest")),
                                                                                  D.pattern(var_$response));
        return gettaxdetails_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_gettaxdetails);
    }
}
