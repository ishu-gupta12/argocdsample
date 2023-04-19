package com.finobank.pta.setsinglenullGLcode.PD4;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD41E2C7F8DF2CB15683C2A90DF92940D implements org.drools.model.functions.Predicate1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4AFD08ABC4E504C7263339E6EE3F3E77";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "PTACASHIN");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"PTACASHIN\"", "Rule For PARTNER CASHIN – CASHIN", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetSingleNullGLCode/src/main/resources/com/finobank/pta/setsinglenullGLcode/SingleNullGLCodeRule.xlsx");
    }
}
