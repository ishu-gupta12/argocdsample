package com.finobank.pta.chargeaccount.PFD;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFD36465953EB063083E5C1F2CCCEBCA1 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9CCEC76C7966E9ED163CFD291F0D4C92";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("388");
        $request.setChargeTranType("CHGBENE");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("3211000115");
        $request.setTieredCharge(false);
        $request.setChargeType("F");
        $request.setRealChargeValue(1.18);
    }
}
