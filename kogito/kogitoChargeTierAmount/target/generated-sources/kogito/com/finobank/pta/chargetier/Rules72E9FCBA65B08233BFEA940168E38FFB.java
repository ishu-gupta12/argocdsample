package com.finobank.pta.chargetier;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargetier.ChargeTierRequest;

public abstract class Rules72E9FCBA65B08233BFEA940168E38FFB implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.finobank.pta.chargetier";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("chargeRequest"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.SingletonStore> var_chargeRequest = D.globalOf(org.kie.kogito.rules.SingletonStore.class,
                                                                                                                    "com.finobank.pta.chargetier",
                                                                                                                    "chargeRequest");

    public static final org.drools.model.Query0Def queryDef_chargetier = D.query("com.finobank.pta.chargetier",
                                                                                 "chargetier");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_chargeRequest);
    }
}
