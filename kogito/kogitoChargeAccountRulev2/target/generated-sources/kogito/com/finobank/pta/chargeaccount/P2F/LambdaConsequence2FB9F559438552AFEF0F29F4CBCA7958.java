package com.finobank.pta.chargeaccount.P2F;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence2FB9F559438552AFEF0F29F4CBCA7958 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "663762417660B8C7387E87C37A7CC44F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("548");
        $request.setChargeTranType("CHGBENE");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("3213000719");
        $request.setTieredCharge(false);
        $request.setChargeType("F");
        $request.setRealChargeValue(1.77);
    }
}
