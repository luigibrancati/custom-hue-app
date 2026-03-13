package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0357b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0357b c0357b = new DynamiteModule.b.C0357b();
        int iA = aVar.a(context, str, false);
        c0357b.f29131b = iA;
        c0357b.f29132c = iA != 0 ? 1 : 0;
        return c0357b;
    }
}
