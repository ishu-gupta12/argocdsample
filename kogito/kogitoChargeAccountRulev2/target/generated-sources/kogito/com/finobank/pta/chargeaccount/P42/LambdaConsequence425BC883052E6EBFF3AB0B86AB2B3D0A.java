package com.finobank.pta.chargeaccount.P42;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence425BC883052E6EBFF3AB0B86AB2B3D0A implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A657FE4BDF9049C432804E75D3C22157";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("540");
        $request.setChargeTranType("CHGNEFT");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("4102000592");
        $request.setTieredCharge(true);
        $request.setChargeType("F");
        $request.setRealChargeValue(0);
    }
}
