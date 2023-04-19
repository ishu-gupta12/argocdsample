package com.finobank.pta.setbothnullGLcode.PE0;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateE0AB28306A5E5CD40C17DBAF3E6D49F6 implements org.drools.model.functions.Predicate1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "620262B42BA4A7625B334E677D53B436";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getAppId(), "FINOTLR");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("appId == \"FINOTLR\"", "Rule8", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoSetBothNullGLCodes/src/main/resources/com/finobank/pta/setbothnullGLcode/BothNullGLCodeRule.xlsx");
    }
}
