package I3;

import B0.c;
import fc.C4015H;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final O7.e e(final Executor executor, final InterfaceC6082a interfaceC6082a) {
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: I3.T
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return W.f(executor, interfaceC6082a, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture(...)");
        return eVarA;
    }

    public static final C4015H f(Executor executor, final InterfaceC6082a interfaceC6082a, final c.a it) {
        AbstractC4862t.e(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: I3.U
            @Override // java.lang.Runnable
            public final void run() {
                W.g(atomicBoolean);
            }
        }, EnumC0878h.INSTANCE);
        executor.execute(new Runnable() { // from class: I3.V
            @Override // java.lang.Runnable
            public final void run() {
                W.h(atomicBoolean, it, interfaceC6082a);
            }
        });
        return C4015H.f34254a;
    }

    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void h(AtomicBoolean atomicBoolean, c.a aVar, InterfaceC6082a interfaceC6082a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(interfaceC6082a.invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }
}
