package Rd;

import Rd.I;
import Wd.AbstractC2330j;
import Wd.AbstractC2333m;
import Wd.C2329i;
import Wd.C2332l;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.AbstractC4984a;
import lc.AbstractC4985b;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I extends AbstractC4984a implements InterfaceC4989f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15136a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4985b {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final I d(InterfaceC4992i.b bVar) {
            if (bVar instanceof I) {
                return (I) bVar;
            }
            return null;
        }

        public a() {
            super(InterfaceC4989f.f40086j0, new vc.l() { // from class: Rd.H
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return I.a.d((InterfaceC4992i.b) obj);
                }
            });
        }
    }

    public I() {
        super(InterfaceC4989f.f40086j0);
    }

    public static /* synthetic */ I G0(I i10, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        return i10.C0(i11, str);
    }

    public I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return new C2332l(this, i10, str);
    }

    @Override // lc.InterfaceC4989f
    public final InterfaceC4988e g0(InterfaceC4988e interfaceC4988e) {
        return new C2329i(this, interfaceC4988e);
    }

    @Override // lc.AbstractC4984a, lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return InterfaceC4989f.a.a(this, cVar);
    }

    public abstract void k0(InterfaceC4992i interfaceC4992i, Runnable runnable);

    @Override // lc.AbstractC4984a, lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC4989f.a.b(this, cVar);
    }

    @Override // lc.InterfaceC4989f
    public final void o(InterfaceC4988e interfaceC4988e) {
        AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2329i) interfaceC4988e).r();
    }

    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        AbstractC2330j.c(this, interfaceC4992i, runnable);
    }

    public String toString() {
        return Q.a(this) + '@' + Q.b(this);
    }

    public boolean v0(InterfaceC4992i interfaceC4992i) {
        return true;
    }

    public /* synthetic */ I x0(int i10) {
        return C0(i10, null);
    }
}
