package com.finobank.pta.chargeaccount.P1D;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence1DEC0F718E72D1BC54F3236CD573EA18 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8F8FDD5B0E8C3BDCFFF6761F999DB72D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("433");
        $request.setChargeTranType("CHGIMPS");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("4102000526");
        $request.setTieredCharge(true);
        $request.setChargeType("F");
        $request.setRealChargeValue(0);
    }
}
