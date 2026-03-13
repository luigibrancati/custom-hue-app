package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3442o2 extends RuntimeException {
    public C3442o2(J1 j12) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C3455r1 a() {
        return new C3455r1(getMessage());
    }
}
