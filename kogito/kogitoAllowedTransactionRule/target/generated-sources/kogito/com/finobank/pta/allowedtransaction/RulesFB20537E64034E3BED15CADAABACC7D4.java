package com.finobank.pta.allowedtransaction;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;

public abstract class RulesFB20537E64034E3BED15CADAABACC7D4 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.finobank.pta.allowedtransaction";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("checkRequest"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.SingletonStore> var_checkRequest = D.globalOf(org.kie.kogito.rules.SingletonStore.class,
                                                                                                                   "com.finobank.pta.allowedtransaction",
                                                                                                                   "checkRequest");

    public static final org.drools.model.Query0Def queryDef_checkallowedtrantype = D.query("com.finobank.pta.allowedtransaction",
                                                                                           "checkallowedtrantype");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_checkRequest);
    }
}
