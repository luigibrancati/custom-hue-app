package B0;

import Rd.C2142n;
import fc.C4015H;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import nc.h;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O7.e f564a;

        public a(O7.e eVar) {
            this.f564a = eVar;
        }

        public final void a(Throwable th) {
            this.f564a.cancel(false);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    public static final Object a(O7.e eVar, InterfaceC4988e interfaceC4988e) throws Throwable {
        try {
            if (eVar.isDone()) {
                return B0.a.z(eVar);
            }
            C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
            c2142n.E();
            eVar.b(new g(eVar, c2142n), d.INSTANCE);
            c2142n.b(new a(eVar));
            Object objW = c2142n.w();
            if (objW == C5046c.f()) {
                h.c(interfaceC4988e);
            }
            return objW;
        } catch (ExecutionException e10) {
            throw b(e10);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        AbstractC4862t.b(cause);
        return cause;
    }
}
