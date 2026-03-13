package I3;

import B0.c;
import I3.y;
import fc.C4015H;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final y c(final I tracer, final String label, final Executor executor, final InterfaceC6082a block) {
        AbstractC4862t.e(tracer, "tracer");
        AbstractC4862t.e(label, "label");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(block, "block");
        final androidx.lifecycle.w wVar = new androidx.lifecycle.w(y.f5644b);
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: I3.A
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return C.d(executor, tracer, label, block, wVar, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture(...)");
        return new z(wVar, eVarA);
    }

    public static final C4015H d(Executor executor, final I i10, final String str, final InterfaceC6082a interfaceC6082a, final androidx.lifecycle.w wVar, final c.a completer) {
        AbstractC4862t.e(completer, "completer");
        executor.execute(new Runnable() { // from class: I3.B
            @Override // java.lang.Runnable
            public final void run() {
                C.e(i10, str, interfaceC6082a, wVar, completer);
            }
        });
        return C4015H.f34254a;
    }

    public static final void e(I i10, String str, InterfaceC6082a interfaceC6082a, androidx.lifecycle.w wVar, c.a aVar) {
        boolean zIsEnabled = i10.isEnabled();
        if (zIsEnabled) {
            try {
                i10.a(str);
            } finally {
                if (zIsEnabled) {
                    i10.d();
                }
            }
        }
        try {
            interfaceC6082a.invoke();
            y.b.c cVar = y.f5643a;
            wVar.postValue(cVar);
            aVar.c(cVar);
        } catch (Throwable th) {
            wVar.postValue(new y.b.a(th));
            aVar.f(th);
        }
        C4015H c4015h = C4015H.f34254a;
    }
}
