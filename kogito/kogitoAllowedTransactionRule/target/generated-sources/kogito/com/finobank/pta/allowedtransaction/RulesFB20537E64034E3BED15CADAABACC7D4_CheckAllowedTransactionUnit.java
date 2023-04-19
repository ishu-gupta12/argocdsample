package com.finobank.pta.allowedtransaction;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import org.drools.model.Query;

public class RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnit extends RulesFB20537E64034E3BED15CADAABACC7D4 {

    @Override
    public String getName() {
        return super.getName() + ".CheckAllowedTransactionUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@1db78c3a
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32DHANUPAY_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32PTACASHIN_32_8211_32ALLOWED_32_8211_32PADDF_32_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32PTACASHOUT_32_8211_32ALLOWED_32_8211_32PWTDF_32_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_323LINE_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_323LINE_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_323LINE_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods0.rule_Rule_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32FORMAX_32IT_32SOLUTIONS_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32SI_32ONLINE_32_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32SI_32ONLINE_32_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32SI_32ONLINE_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32BHOOPALAM_32_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32BHOOPALAM_32_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32BHOOPALAM_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32ALLOWED_32_8211_32IMPS_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_32_32_8211_32ALLOWED_32_8211_32NEFT_32_8211_321003(),
                                       RulesFB20537E64034E3BED15CADAABACC7D4_CheckAllowedTransactionUnitRuleMethods1.rule_Rule_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32ALLOWED_32_8211_32BENE_32_8211_321003());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_checkallowedtrantype = query_checkallowedtrantype();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_checkallowedtrantype() {
        final org.drools.model.Variable<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest> var_GENERATED_$pattern_CheckAllowedTransactionRequest$2$ = D.declarationOf(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest.class,
                                                                                                                                                                                       DomainClassesMetadataFB20537E64034E3BED15CADAABACC7D4.com_finobank_pta_allowedtransaction_CheckAllowedTransactionRequest_Metadata_INSTANCE,
                                                                                                                                                                                       "GENERATED_$pattern_CheckAllowedTransactionRequest$2$",
                                                                                                                                                                                       D.entryPoint("checkRequest"));
        final org.drools.model.Variable<com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse> var_$response = D.declarationOf(com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse.class,
                                                                                                                                             DomainClassesMetadataFB20537E64034E3BED15CADAABACC7D4.com_finobank_pta_allowedtransaction_CheckAllowedTransactionResponse_Metadata_INSTANCE,
                                                                                                                                             "$response",
                                                                                                                                             D.reactiveFrom(var_GENERATED_$pattern_CheckAllowedTransactionRequest$2$,
                                                                                                                                                            com.finobank.pta.allowedtransaction.P74.LambdaExtractor7474330E9C775A1F30C761CE3A36A065.INSTANCE));
        org.drools.model.Query checkallowedtrantype_build = queryDef_checkallowedtrantype.build(D.pattern(var_GENERATED_$pattern_CheckAllowedTransactionRequest$2$,
                                                                                                          D.entryPoint("checkRequest")),
                                                                                                D.pattern(var_$response));
        return checkallowedtrantype_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_checkallowedtrantype);
    }
}
