package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3282p4 implements C5 {
    protected int zza = 0;

    public static void d(Iterable iterable, List list) {
        AbstractC3273o4.q(iterable, list);
    }

    public final byte[] b() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            Logger logger = J4.f29243b;
            H4 h42 = new H4(bArr, 0, iA);
            g(h42);
            h42.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public int c(N5 n52) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final E4 e() {
        try {
            int iA = a();
            E4 e42 = E4.f29169b;
            byte[] bArr = new byte[iA];
            Logger logger = J4.f29243b;
            H4 h42 = new H4(bArr, 0, iA);
            g(h42);
            return B4.a(h42, bArr);
        } catch (IOException e10) {
            String name = this.getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
