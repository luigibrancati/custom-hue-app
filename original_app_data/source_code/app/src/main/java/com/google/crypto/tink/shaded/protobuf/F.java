package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements E {
    public static AbstractC3678z.d d(Object obj, long j10) {
        return (AbstractC3678z.d) p0.C(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public void a(Object obj, long j10) {
        d(obj, j10).i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public void b(Object obj, Object obj2, long j10) {
        AbstractC3678z.d dVarD = d(obj, j10);
        AbstractC3678z.d dVarD2 = d(obj2, j10);
        int size = dVarD.size();
        int size2 = dVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!dVarD.m()) {
                dVarD = dVarD.a(size2 + size);
            }
            dVarD.addAll(dVarD2);
        }
        if (size > 0) {
            dVarD2 = dVarD;
        }
        p0.R(obj, j10, dVarD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public List c(Object obj, long j10) {
        AbstractC3678z.d dVarD = d(obj, j10);
        if (dVarD.m()) {
            return dVarD;
        }
        int size = dVarD.size();
        AbstractC3678z.d dVarA = dVarD.a(size == 0 ? 10 : size * 2);
        p0.R(obj, j10, dVarA);
        return dVarA;
    }
}
