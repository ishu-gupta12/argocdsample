package com.finobank.pta.chargeaccount.P46;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence462726BE87AB2EDDF060E681E1A6C003 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9407F0FC4D0062BC2AE358D4FBE4288B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("517");
        $request.setChargeTranType("CHGBENE");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("3213000733");
        $request.setTieredCharge(false);
        $request.setChargeType("F");
        $request.setRealChargeValue(2.36);
    }
}
