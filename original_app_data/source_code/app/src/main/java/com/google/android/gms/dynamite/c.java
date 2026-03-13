package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0357b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0357b c0357b = new DynamiteModule.b.C0357b();
        int iA = aVar.a(context, str, true);
        c0357b.f29131b = iA;
        if (iA != 0) {
            c0357b.f29132c = 1;
            return c0357b;
        }
        int iB = aVar.b(context, str);
        c0357b.f29130a = iB;
        if (iB != 0) {
            c0357b.f29132c = -1;
        }
        return c0357b;
    }
}
