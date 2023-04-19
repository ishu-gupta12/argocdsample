package com.finobank.pta.chargeaccount.P67;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence67ACAA88B30B5BE9C4540F6606417428 implements org.drools.model.functions.Block1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3F25E5F7BBB5975442224C664576B2F3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargeaccount.ChargeAccountRequest $request) throws java.lang.Exception {
        $request.setChargeID("582");
        $request.setChargeTranType("CHGBENE");
        $request.setTaxInclusiveInCharge(true);
        $request.setChargeAccount("3213000765");
        $request.setTieredCharge(false);
        $request.setChargeType("F");
        $request.setRealChargeValue(2.36);
    }
}
