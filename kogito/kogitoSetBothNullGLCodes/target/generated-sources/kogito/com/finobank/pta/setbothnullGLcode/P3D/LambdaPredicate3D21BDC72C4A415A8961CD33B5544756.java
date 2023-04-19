package com.finobank.pta.setbothnullGLcode.P3D;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate3D21BDC72C4A415A8961CD33B5544756 implements org.drools.model.functions.Predicate1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "65C64DEB0B9CC994D91C5EDE91D9C8B3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "DHAPIMPS");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"DHAPIMPS\"", "Rule5", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetBothNullGLCodes/src/main/resources/com/finobank/pta/setbothnullGLcode/BothNullGLCodeRule.xlsx");
    }
}
