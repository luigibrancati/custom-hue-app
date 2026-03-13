package Rd;

import Wd.C2329i;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2117a0 extends Yd.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15160c;

    public AbstractC2117a0(int i10) {
        this.f15160c = i10;
    }

    public abstract InterfaceC4988e d();

    public Throwable f(Object obj) {
        A a10 = obj instanceof A ? (A) obj : null;
        if (a10 != null) {
            return a10.f15106a;
        }
        return null;
    }

    public final void h(Throwable th) {
        K.a(d().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC4988e interfaceC4988eD = d();
            AbstractC4862t.c(interfaceC4988eD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2329i c2329i = (C2329i) interfaceC4988eD;
            InterfaceC4988e interfaceC4988e = c2329i.f17926e;
            Object obj = c2329i.f17928g;
            InterfaceC4992i context = interfaceC4988e.getContext();
            Object objI = Wd.L.i(context, obj);
            InterfaceC2166z0 interfaceC2166z0 = null;
            c1 c1VarM = objI != Wd.L.f17903a ? G.m(interfaceC4988e, context, objI) : null;
            try {
                InterfaceC4992i context2 = interfaceC4988e.getContext();
                Object objI2 = i();
                Throwable thF = f(objI2);
                if (thF == null && AbstractC2119b0.b(this.f15160c)) {
                    interfaceC2166z0 = (InterfaceC2166z0) context2.get(InterfaceC2166z0.f15218M);
                }
                if (interfaceC2166z0 != null && !interfaceC2166z0.c()) {
                    CancellationException cancellationExceptionH = interfaceC2166z0.h();
                    a(objI2, cancellationExceptionH);
                    C4035r.a aVar = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(cancellationExceptionH)));
                } else if (thF != null) {
                    C4035r.a aVar2 = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(thF)));
                } else {
                    C4035r.a aVar3 = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(g(objI2)));
                }
                C4015H c4015h = C4015H.f34254a;
                if (c1VarM == null || c1VarM.U0()) {
                    Wd.L.f(context, objI);
                }
            } catch (Throwable th) {
                if (c1VarM == null || c1VarM.U0()) {
                    Wd.L.f(context, objI);
                }
                throw th;
            }
        } catch (Y e10) {
            K.a(d().getContext(), e10.getCause());
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public Object g(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
