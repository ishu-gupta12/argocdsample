package com.finobank.pta.setsinglenullGLcode.P9D;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate9D239DDAD89F0182EEB34ECF73F1B53A implements org.drools.model.functions.Predicate1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A2E569A2B8E03EA518B324E5F079F4DE";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "SHGPNEFT");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"SHGPNEFT\"", "Rule For PARTNER SHIGHRAPAY – NEFT", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetSingleNullGLCode/src/main/resources/com/finobank/pta/setsinglenullGLcode/SingleNullGLCodeRule.xlsx");
    }
}
