package Cd;

import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class T extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lc.f0 f1295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f1296b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            return U.b(T.this.f1295a);
        }
    }

    public T(Lc.f0 typeParameter) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        this.f1295a = typeParameter;
        this.f1296b = C4029l.a(EnumC4031n.PUBLICATION, new a());
    }

    @Override // Cd.i0
    public boolean a() {
        return true;
    }

    @Override // Cd.i0
    public u0 b() {
        return u0.OUT_VARIANCE;
    }

    public final E d() {
        return (E) this.f1296b.getValue();
    }

    @Override // Cd.i0
    public E getType() {
        return d();
    }

    @Override // Cd.i0
    public i0 p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
