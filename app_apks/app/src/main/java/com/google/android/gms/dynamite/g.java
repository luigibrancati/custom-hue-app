package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0357b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0357b c0357b = new DynamiteModule.b.C0357b();
        int iB = aVar.b(context, str);
        c0357b.f29130a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0357b.f29131b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0357b.f29131b = iA;
        }
        int i12 = c0357b.f29130a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0357b.f29132c = i10;
            return c0357b;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        c0357b.f29132c = i10;
        return c0357b;
    }
}
