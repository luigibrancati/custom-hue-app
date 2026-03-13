package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3454r0 implements J1 {
    protected int zza = 0;

    public int c(InterfaceC3382c2 interfaceC3382c2) {
        throw null;
    }

    public final byte[] d() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            L0 l02 = new L0(bArr, 0, iA);
            e(l02);
            l02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final G0 w() {
        try {
            int iA = a();
            G0 g02 = G0.f29754b;
            byte[] bArr = new byte[iA];
            L0 l02 = new L0(bArr, 0, iA);
            e(l02);
            l02.c();
            return new F0(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
