package vd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: vd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6098g extends AbstractC6092a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.i f46009b;

    /* JADX INFO: renamed from: vd.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f46010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6082a interfaceC6082a) {
            super(0);
            this.f46010a = interfaceC6082a;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h invoke() {
            InterfaceC6099h interfaceC6099h = (InterfaceC6099h) this.f46010a.invoke();
            return interfaceC6099h instanceof AbstractC6092a ? ((AbstractC6092a) interfaceC6099h).h() : interfaceC6099h;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6098g(InterfaceC6082a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC4862t.e(getScope, "getScope");
    }

    @Override // vd.AbstractC6092a
    public InterfaceC6099h i() {
        return (InterfaceC6099h) this.f46009b.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6098g(Bd.n NO_LOCKS, InterfaceC6082a interfaceC6082a, int i10, AbstractC4854k abstractC4854k) {
        if ((i10 & 1) != 0) {
            NO_LOCKS = Bd.f.f816e;
            AbstractC4862t.d(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, interfaceC6082a);
    }

    public C6098g(Bd.n storageManager, InterfaceC6082a getScope) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(getScope, "getScope");
        this.f46009b = storageManager.f(new a(getScope));
    }
}
