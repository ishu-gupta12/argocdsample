package com.finobank.pta.chargeaccount.P5C;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence5C0F28FB039D87C6CA42E56E22D52D69 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "961FDFDE6DA520FB61FB1B3E81BD3CD2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("546");
        $request.setChargeTranType("CHGNEFT");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("4102000565");
        $request.setTieredCharge(true);
        $request.setChargeType("F");
        $request.setRealChargeValue(0);
    }
}
