package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0726i extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc.g f1372a;

    public C0726i(Mc.g annotations) {
        AbstractC4862t.e(annotations, "annotations");
        this.f1372a = annotations;
    }

    @Override // Cd.Y
    public Cc.d b() {
        return kotlin.jvm.internal.M.b(C0726i.class);
    }

    @Override // Cd.Y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0726i a(C0726i c0726i) {
        return c0726i == null ? this : new C0726i(Mc.i.a(this.f1372a, c0726i.f1372a));
    }

    public final Mc.g e() {
        return this.f1372a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0726i) {
            return AbstractC4862t.a(((C0726i) obj).f1372a, this.f1372a);
        }
        return false;
    }

    @Override // Cd.Y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0726i c(C0726i c0726i) {
        if (AbstractC4862t.a(c0726i, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f1372a.hashCode();
    }
}
