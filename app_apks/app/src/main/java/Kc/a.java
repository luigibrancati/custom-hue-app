package Kc;

import Bd.n;
import Lc.AbstractC1191t;
import Lc.D;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.a0;
import Oc.G;
import gc.C4205s;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.AbstractC6096e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC6096e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0123a f7788e = new C0123a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kd.f f7789f;

    /* JADX INFO: renamed from: Kc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0123a {
        public /* synthetic */ C0123a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final kd.f a() {
            return a.f7789f;
        }

        public C0123a() {
        }
    }

    static {
        kd.f fVarS = kd.f.s("clone");
        AbstractC4862t.d(fVarS, "identifier(\"clone\")");
        f7789f = fVarS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n storageManager, InterfaceC1177e containingClass) {
        super(storageManager, containingClass);
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingClass, "containingClass");
    }

    @Override // vd.AbstractC6096e
    public List i() {
        G gL1 = G.l1(l(), Mc.g.f9435K.b(), f7789f, InterfaceC1174b.a.DECLARATION, a0.f8746a);
        gL1.R0(null, l().J0(), C4206t.k(), C4206t.k(), C4206t.k(), AbstractC5823c.j(l()).i(), D.OPEN, AbstractC1191t.f8773c);
        return C4205s.d(gL1);
    }
}
