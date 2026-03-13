package Rd;

import Rd.InterfaceC2166z0;
import fc.C4015H;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4860q;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class D0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4860q implements vc.l {
        public a(Object obj) {
            super(1, obj, E0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void i(Throwable th) {
            ((E0) this.receiver).w(th);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    public static final InterfaceC2163y a(InterfaceC2166z0 interfaceC2166z0) {
        return new B0(interfaceC2166z0);
    }

    public static /* synthetic */ InterfaceC2163y b(InterfaceC2166z0 interfaceC2166z0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2166z0 = null;
        }
        return C0.a(interfaceC2166z0);
    }

    public static final void c(InterfaceC4992i interfaceC4992i, CancellationException cancellationException) {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 != null) {
            interfaceC2166z0.a(cancellationException);
        }
    }

    public static final Object d(InterfaceC2166z0 interfaceC2166z0, InterfaceC4988e interfaceC4988e) {
        InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        Object objA0 = interfaceC2166z0.a0(interfaceC4988e);
        return objA0 == C5046c.f() ? objA0 : C4015H.f34254a;
    }

    public static final void e(InterfaceC2166z0 interfaceC2166z0, CancellationException cancellationException) {
        Iterator it = interfaceC2166z0.g().iterator();
        while (it.hasNext()) {
            ((InterfaceC2166z0) it.next()).a(cancellationException);
        }
    }

    public static final void f(InterfaceC4992i interfaceC4992i, CancellationException cancellationException) {
        Nd.h hVarG;
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 == null || (hVarG = interfaceC2166z0.g()) == null) {
            return;
        }
        Iterator it = hVarG.iterator();
        while (it.hasNext()) {
            ((InterfaceC2166z0) it.next()).a(cancellationException);
        }
    }

    public static /* synthetic */ void g(InterfaceC2166z0 interfaceC2166z0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C0.e(interfaceC2166z0, cancellationException);
    }

    public static /* synthetic */ void h(InterfaceC4992i interfaceC4992i, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C0.f(interfaceC4992i, cancellationException);
    }

    public static final InterfaceC2127f0 i(InterfaceC2166z0 interfaceC2166z0, InterfaceC2127f0 interfaceC2127f0) {
        return m(interfaceC2166z0, false, new C2131h0(interfaceC2127f0), 1, null);
    }

    public static final void j(InterfaceC2166z0 interfaceC2166z0) {
        if (!interfaceC2166z0.c()) {
            throw interfaceC2166z0.h();
        }
    }

    public static final void k(InterfaceC4992i interfaceC4992i) {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 != null) {
            C0.j(interfaceC2166z0);
        }
    }

    public static final InterfaceC2127f0 l(InterfaceC2166z0 interfaceC2166z0, boolean z10, E0 e02) {
        return interfaceC2166z0 instanceof F0 ? ((F0) interfaceC2166z0).n0(z10, e02) : interfaceC2166z0.d(e02.v(), z10, new a(e02));
    }

    public static /* synthetic */ InterfaceC2127f0 m(InterfaceC2166z0 interfaceC2166z0, boolean z10, E0 e02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return C0.l(interfaceC2166z0, z10, e02);
    }
}
