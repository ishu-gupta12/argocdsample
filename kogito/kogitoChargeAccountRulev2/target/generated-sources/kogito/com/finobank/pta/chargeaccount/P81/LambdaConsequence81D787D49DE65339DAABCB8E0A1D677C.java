package com.finobank.pta.chargeaccount.P81;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence81D787D49DE65339DAABCB8E0A1D677C implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9F1FD21FAF5DBF2371A0EE86D0033138";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("519");
        $request.setChargeTranType("CHGNEFT");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("4102000566");
        $request.setTieredCharge(true);
        $request.setChargeType("F");
        $request.setRealChargeValue(0);
    }
}
