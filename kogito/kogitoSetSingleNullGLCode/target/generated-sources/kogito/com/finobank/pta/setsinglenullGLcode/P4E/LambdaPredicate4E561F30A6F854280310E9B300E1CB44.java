package com.finobank.pta.setsinglenullGLcode.P4E;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate4E561F30A6F854280310E9B300E1CB44 implements org.drools.model.functions.Predicate1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "891FDC7195392259ED81B3B84D09EF22";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getFlagDebitCredit(), "C");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("flagDebitCredit == \"C\"", "Rule For PARTNER SHIGHRAPAY– BENEVERIFICATION", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetSingleNullGLCode/src/main/resources/com/finobank/pta/setsinglenullGLcode/SingleNullGLCodeRule.xlsx");
    }
}
