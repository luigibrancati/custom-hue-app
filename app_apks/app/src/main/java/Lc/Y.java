package Lc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1177e f8739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f8740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Dd.g f8741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f8742d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f8738f = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(Y.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8737e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Y a(InterfaceC1177e classDescriptor, Bd.n storageManager, Dd.g kotlinTypeRefinerForOwnerModule, vc.l scopeFactory) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            AbstractC4862t.e(storageManager, "storageManager");
            AbstractC4862t.e(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            AbstractC4862t.e(scopeFactory, "scopeFactory");
            return new Y(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Dd.g f8744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Dd.g gVar) {
            super(0);
            this.f8744b = gVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h invoke() {
            return (InterfaceC6099h) Y.this.f8740b.invoke(this.f8744b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h invoke() {
            return (InterfaceC6099h) Y.this.f8740b.invoke(Y.this.f8741c);
        }
    }

    public /* synthetic */ Y(InterfaceC1177e interfaceC1177e, Bd.n nVar, vc.l lVar, Dd.g gVar, AbstractC4854k abstractC4854k) {
        this(interfaceC1177e, nVar, lVar, gVar);
    }

    public final InterfaceC6099h c(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(AbstractC5823c.p(this.f8739a))) {
            return d();
        }
        Cd.e0 e0VarK = this.f8739a.k();
        AbstractC4862t.d(e0VarK, "classDescriptor.typeConstructor");
        return !kotlinTypeRefiner.e(e0VarK) ? d() : kotlinTypeRefiner.c(this.f8739a, new b(kotlinTypeRefiner));
    }

    public final InterfaceC6099h d() {
        return (InterfaceC6099h) Bd.m.a(this.f8742d, this, f8738f[0]);
    }

    public Y(InterfaceC1177e interfaceC1177e, Bd.n nVar, vc.l lVar, Dd.g gVar) {
        this.f8739a = interfaceC1177e;
        this.f8740b = lVar;
        this.f8741c = gVar;
        this.f8742d = nVar.f(new c());
    }
}
