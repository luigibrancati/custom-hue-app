package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3381c1 extends AbstractC3450q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3406h1 f29839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3406h1 f29840b;

    public AbstractC3381c1(AbstractC3406h1 abstractC3406h1) {
        this.f29839a = abstractC3406h1;
        if (abstractC3406h1.F()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f29840b = abstractC3406h1.m();
    }

    public static void i(Object obj, Object obj2) {
        R1.a().b(obj.getClass()).f(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3450q0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC3381c1 clone() {
        AbstractC3381c1 abstractC3381c1 = (AbstractC3381c1) this.f29839a.I(5, null, null);
        abstractC3381c1.f29840b = h();
        return abstractC3381c1;
    }

    public final AbstractC3381c1 m(AbstractC3406h1 abstractC3406h1) {
        if (!this.f29839a.equals(abstractC3406h1)) {
            if (!this.f29840b.F()) {
                q();
            }
            i(this.f29840b, abstractC3406h1);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC3406h1 k() {
        AbstractC3406h1 abstractC3406h1H = h();
        if (AbstractC3406h1.E(abstractC3406h1H, true)) {
            return abstractC3406h1H;
        }
        throw new C3442o2(abstractC3406h1H);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3406h1 h() {
        if (!this.f29840b.F()) {
            return this.f29840b;
        }
        this.f29840b.A();
        return this.f29840b;
    }

    public final void p() {
        if (this.f29840b.F()) {
            return;
        }
        q();
    }

    public void q() {
        AbstractC3406h1 abstractC3406h1M = this.f29839a.m();
        i(abstractC3406h1M, this.f29840b);
        this.f29840b = abstractC3406h1M;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final boolean v() {
        return AbstractC3406h1.E(this.f29840b, false);
    }
}
