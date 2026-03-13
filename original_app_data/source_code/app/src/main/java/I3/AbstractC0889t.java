package I3;

import B0.c;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: I3.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0889t {

    /* JADX INFO: renamed from: I3.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f5633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f5634k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ vc.p f5635l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c.a f5636m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.p pVar, c.a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f5635l = pVar;
            this.f5636m = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f5635l, this.f5636m, interfaceC4988e);
            aVar.f5634k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f5633j;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    Rd.M m10 = (Rd.M) this.f5634k;
                    vc.p pVar = this.f5635l;
                    this.f5633j = 1;
                    obj = pVar.invoke(m10, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                this.f5636m.c(obj);
            } catch (CancellationException unused) {
                this.f5636m.d();
            } catch (Throwable th) {
                this.f5636m.f(th);
            }
            return C4015H.f34254a;
        }
    }

    public static final O7.e f(final Executor executor, final String debugTag, final InterfaceC6082a block) {
        AbstractC4862t.e(executor, "<this>");
        AbstractC4862t.e(debugTag, "debugTag");
        AbstractC4862t.e(block, "block");
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: I3.o
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return AbstractC0889t.g(executor, debugTag, block, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture(...)");
        return eVarA;
    }

    public static final Object g(Executor executor, String str, final InterfaceC6082a interfaceC6082a, final c.a completer) {
        AbstractC4862t.e(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: I3.q
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0889t.h(atomicBoolean);
            }
        }, EnumC0878h.INSTANCE);
        executor.execute(new Runnable() { // from class: I3.r
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0889t.i(atomicBoolean, completer, interfaceC6082a);
            }
        });
        return str;
    }

    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void i(AtomicBoolean atomicBoolean, c.a aVar, InterfaceC6082a interfaceC6082a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(interfaceC6082a.invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    public static final O7.e j(final InterfaceC4992i context, final Rd.O start, final vc.p block) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(start, "start");
        AbstractC4862t.e(block, "block");
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: I3.p
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return AbstractC0889t.l(context, start, block, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture(...)");
        return eVarA;
    }

    public static /* synthetic */ O7.e k(InterfaceC4992i interfaceC4992i, Rd.O o10, vc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4992i = C4993j.f40088a;
        }
        if ((i10 & 2) != 0) {
            o10 = Rd.O.DEFAULT;
        }
        return j(interfaceC4992i, o10, pVar);
    }

    public static final Object l(InterfaceC4992i interfaceC4992i, Rd.O o10, vc.p pVar, c.a completer) {
        AbstractC4862t.e(completer, "completer");
        final InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M);
        completer.a(new Runnable() { // from class: I3.s
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0889t.m(interfaceC2166z0);
            }
        }, EnumC0878h.INSTANCE);
        return AbstractC2132i.d(Rd.N.a(interfaceC4992i), null, o10, new a(pVar, completer, null), 1, null);
    }

    public static final void m(InterfaceC2166z0 interfaceC2166z0) {
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
    }
}
