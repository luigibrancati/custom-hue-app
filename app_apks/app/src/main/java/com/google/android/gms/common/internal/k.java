package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.Objects;
import s6.C5783b;
import v6.D;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f29105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, int i10, Bundle bundle) {
        super(aVar, i10, bundle);
        Objects.requireNonNull(aVar);
        this.f29105g = aVar;
    }

    @Override // v6.D
    public final boolean e() {
        this.f29105g.f29060p.a(C5783b.f44145f);
        return true;
    }

    @Override // v6.D
    public final void f(C5783b c5783b) {
        a aVar = this.f29105g;
        if (aVar.s() && aVar.Z()) {
            aVar.Y(16);
        } else {
            aVar.f29060p.a(c5783b);
            aVar.K(c5783b);
        }
    }
}
