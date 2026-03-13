package Cd;

import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class H extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.n f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6082a f1282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f1283d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dd.g f1284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f1285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Dd.g gVar, H h10) {
            super(0);
            this.f1284a = gVar;
            this.f1285b = h10;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            return this.f1284a.a((Gd.i) this.f1285b.f1282c.invoke());
        }
    }

    public H(Bd.n storageManager, InterfaceC6082a computation) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(computation, "computation");
        this.f1281b = storageManager;
        this.f1282c = computation;
        this.f1283d = storageManager.f(computation);
    }

    @Override // Cd.v0
    public E R0() {
        return (E) this.f1283d.invoke();
    }

    @Override // Cd.v0
    public boolean S0() {
        return this.f1283d.m();
    }

    @Override // Cd.E
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public H X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new H(this.f1281b, new a(kotlinTypeRefiner, this));
    }
}
