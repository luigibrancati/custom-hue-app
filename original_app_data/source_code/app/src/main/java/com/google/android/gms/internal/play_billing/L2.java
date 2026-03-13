package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L2 extends AbstractC3501a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O2 f30062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O2 f30063b;

    public L2(O2 o22) {
        this.f30062a = o22;
        if (o22.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f30063b = o22.r();
    }

    public static void n(Object obj, Object obj2) {
        C3615t3.a().b(obj.getClass()).f(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3501a2
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final L2 clone() {
        L2 l22 = (L2) this.f30062a.l(5, null, null);
        l22.f30063b = f();
        return l22;
    }

    public final L2 q(O2 o22) {
        if (!this.f30062a.equals(o22)) {
            if (!this.f30063b.i()) {
                u();
            }
            n(this.f30063b, o22);
        }
        return this;
    }

    public final O2 r() {
        O2 o2F = f();
        if (O2.B(o2F, true)) {
            return o2F;
        }
        throw new H3(o2F);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3562k3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public O2 f() {
        if (!this.f30063b.i()) {
            return this.f30063b;
        }
        this.f30063b.x();
        return this.f30063b;
    }

    public final void t() {
        if (this.f30063b.i()) {
            return;
        }
        u();
    }

    public void u() {
        O2 o2R = this.f30062a.r();
        n(o2R, this.f30063b);
        this.f30063b = o2R;
    }
}
