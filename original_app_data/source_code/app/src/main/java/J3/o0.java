package J3;

import I3.AbstractC0890u;
import I3.EnumC0878h;
import Rd.C2142n;
import fc.C4015H;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6065a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f6066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O7.e f6067b;

        public a(androidx.work.c cVar, O7.e eVar) {
            this.f6066a = cVar;
            this.f6067b = eVar;
        }

        public final void a(Throwable th) {
            if (th instanceof i0) {
                this.f6066a.J(((i0) th).a());
            }
            this.f6067b.cancel(false);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    static {
        String strI = AbstractC0890u.i("WorkerWrapper");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f6065a = strI;
    }

    public static final Object d(O7.e eVar, androidx.work.c cVar, InterfaceC4988e interfaceC4988e) throws Throwable {
        try {
            if (eVar.isDone()) {
                return e(eVar);
            }
            C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
            c2142n.E();
            eVar.b(new C(eVar, c2142n), EnumC0878h.INSTANCE);
            c2142n.b(new a(cVar, eVar));
            Object objW = c2142n.w();
            if (objW == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objW;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    public static final Object e(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        AbstractC4862t.b(cause);
        return cause;
    }
}
