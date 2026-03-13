package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H3 extends RuntimeException {
    public H3(InterfaceC3568l3 interfaceC3568l3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final V2 a() {
        return new V2(getMessage());
    }
}
