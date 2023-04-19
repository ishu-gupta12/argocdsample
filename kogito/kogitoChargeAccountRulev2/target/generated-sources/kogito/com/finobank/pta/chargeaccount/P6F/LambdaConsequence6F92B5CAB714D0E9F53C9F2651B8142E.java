package com.finobank.pta.chargeaccount.P6F;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence6F92B5CAB714D0E9F53C9F2651B8142E implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "77BC51AC2EF432417348BE216CE076C4";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("521");
        $request.setChargeTranType("CHGBENE");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("3213000720");
        $request.setTieredCharge(false);
        $request.setChargeType("F");
        $request.setRealChargeValue(1.42);
    }
}
