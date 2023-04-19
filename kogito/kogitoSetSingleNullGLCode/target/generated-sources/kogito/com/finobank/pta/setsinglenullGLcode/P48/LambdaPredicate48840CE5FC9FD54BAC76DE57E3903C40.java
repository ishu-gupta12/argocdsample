package com.finobank.pta.setsinglenullGLcode.P48;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate48840CE5FC9FD54BAC76DE57E3903C40 implements org.drools.model.functions.Predicate1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6D6A52F428D1B0B71FD7BC5F7D89D538";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "DHAPIMPS");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"DHAPIMPS\"", "Rule For PARTNER DHANUPAY – IMPS", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetSingleNullGLCode/src/main/resources/com/finobank/pta/setsinglenullGLcode/SingleNullGLCodeRule.xlsx");
    }
}
