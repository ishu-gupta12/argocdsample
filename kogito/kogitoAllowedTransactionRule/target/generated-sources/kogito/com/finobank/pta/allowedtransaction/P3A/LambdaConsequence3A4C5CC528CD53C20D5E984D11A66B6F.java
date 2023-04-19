package com.finobank.pta.allowedtransaction.P3A;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence3A4C5CC528CD53C20D5E984D11A66B6F implements org.drools.model.functions.Block1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "132AE6C58E7DDF2D914E916CAB014DC8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest $request) throws java.lang.Exception {
        $request.setAllowed(true);
    }
}
