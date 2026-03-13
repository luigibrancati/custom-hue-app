package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3507b2 implements InterfaceC3568l3 {
    protected int zza = 0;

    public static void c(Iterable iterable, List list) {
        AbstractC3501a2.m(iterable, list);
    }

    public int b(InterfaceC3633w3 interfaceC3633w3) {
        throw null;
    }

    public final byte[] d() {
        try {
            int iH = h();
            byte[] bArr = new byte[iH];
            C3620u2 c3620u2 = new C3620u2(bArr, 0, iH);
            a(c3620u2);
            c3620u2.b();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3568l3
    public final AbstractC3597q2 e() {
        try {
            int iH = h();
            AbstractC3597q2 abstractC3597q2 = AbstractC3597q2.f30229b;
            byte[] bArr = new byte[iH];
            C3620u2 c3620u2 = new C3620u2(bArr, 0, iH);
            a(c3620u2);
            c3620u2.b();
            return new C3585o2(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
