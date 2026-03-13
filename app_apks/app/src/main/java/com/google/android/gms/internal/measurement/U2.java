package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U2 extends X4 implements D5 {
    public /* synthetic */ U2(byte[] bArr) {
        super(X2.zzh);
    }

    public final int A() {
        return ((X2) this.f29387b).E();
    }

    public final Z2 B(int i10) {
        return ((X2) this.f29387b).F(i10);
    }

    public final U2 C(int i10, Y2 y22) {
        s();
        ((X2) this.f29387b).M(i10, (Z2) y22.w());
        return this;
    }

    public final U2 D(Y2 y22) {
        s();
        ((X2) this.f29387b).N((Z2) y22.w());
        return this;
    }

    public final U2 E(Iterable iterable) {
        s();
        ((X2) this.f29387b).O(iterable);
        return this;
    }

    public final U2 F() {
        s();
        ((X2) this.f29387b).P();
        return this;
    }

    public final String G() {
        return ((X2) this.f29387b).H();
    }

    public final U2 H(String str) {
        s();
        ((X2) this.f29387b).Q(str);
        return this;
    }

    public final U2 I(String str) {
        s();
        ((X2) this.f29387b).R(str);
        return this;
    }

    public final List z() {
        return Collections.unmodifiableList(((X2) this.f29387b).D());
    }
}
