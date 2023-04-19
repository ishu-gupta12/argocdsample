package com.finobank.pta.chargeaccount.PA0;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceA05F11379D26059E4A2C8684DD97AFFA implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "EE5A08E58BBBFB0C60CF01CD9D3A7DBA";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("541");
        $request.setChargeTranType("CHGIMPS");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("4102000592");
        $request.setTieredCharge(true);
        $request.setChargeType("F");
        $request.setRealChargeValue(0);
    }
}
