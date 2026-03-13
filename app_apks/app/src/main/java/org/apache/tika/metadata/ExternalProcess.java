package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ExternalProcess {
    public static final String PREFIX_EXTERNAL_META = "external-process";
    public static final Property STD_OUT = Property.externalText("external-process:stdout");
    public static final Property STD_ERR = Property.externalText("external-process:stderr");
    public static final Property STD_OUT_IS_TRUNCATED = Property.externalBoolean("external-process:stdout-truncated");
    public static final Property STD_ERR_IS_TRUNCATED = Property.externalBoolean("external-process:stderr-truncated");
    public static final Property STD_OUT_LENGTH = Property.externalReal("external-process:stdout-length");
    public static final Property STD_ERR_LENGTH = Property.externalReal("external-process:stderr-length");
    public static final Property EXIT_VALUE = Property.externalInteger("external-process:exit-value");
    public static final Property IS_TIMEOUT = Property.externalBoolean("external-process:timeout");
}
