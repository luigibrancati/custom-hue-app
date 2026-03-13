package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3181e2 extends X4 implements D5 {
    public /* synthetic */ C3181e2(byte[] bArr) {
        super(C3190f2.zzu);
    }

    public final C3172d2 A(int i10) {
        return ((C3190f2) this.f29387b).J(i10);
    }

    public final C3181e2 B(int i10, C3163c2 c3163c2) {
        s();
        ((C3190f2) this.f29387b).V(i10, (C3172d2) c3163c2.w());
        return this;
    }

    public final List C() {
        return Collections.unmodifiableList(((C3190f2) this.f29387b).K());
    }

    public final C3181e2 D() {
        s();
        ((C3190f2) this.f29387b).W();
        return this;
    }

    public final C3181e2 E() {
        s();
        ((C3190f2) this.f29387b).X();
        return this;
    }

    public final List F() {
        return Collections.unmodifiableList(((C3190f2) this.f29387b).N());
    }

    public final String G() {
        return ((C3190f2) this.f29387b).O();
    }

    public final int z() {
        return ((C3190f2) this.f29387b).I();
    }
}
