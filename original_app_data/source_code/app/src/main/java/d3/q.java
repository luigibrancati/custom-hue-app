package d3;

import Rd.AbstractC2128g;
import Rd.AbstractC2130h;
import Rd.AbstractC2161x;
import Rd.C2154t0;
import Rd.InterfaceC2157v;
import Rd.M;
import Rd.O;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33095j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f33096k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ vc.p f33097l;

        /* JADX INFO: renamed from: d3.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0398a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f33098j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f33099k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f33100l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ vc.p f33101m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398a(InterfaceC2157v interfaceC2157v, vc.p pVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f33100l = interfaceC2157v;
                this.f33101m = pVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C0398a c0398a = new C0398a(this.f33100l, this.f33101m, interfaceC4988e);
                c0398a.f33099k = obj;
                return c0398a;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0398a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC2157v interfaceC2157v;
                Object objB;
                Object objF = C5046c.f();
                int i10 = this.f33098j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    M m10 = (M) this.f33099k;
                    InterfaceC2157v interfaceC2157v2 = this.f33100l;
                    vc.p pVar = this.f33101m;
                    try {
                        C4035r.a aVar = C4035r.f34274b;
                        this.f33099k = interfaceC2157v2;
                        this.f33098j = 1;
                        obj = pVar.invoke(m10, this);
                        if (obj == objF) {
                            return objF;
                        }
                        interfaceC2157v = interfaceC2157v2;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC2157v = interfaceC2157v2;
                        C4035r.a aVar2 = C4035r.f34274b;
                        objB = C4035r.b(AbstractC4036s.a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2157v = (InterfaceC2157v) this.f33099k;
                    try {
                        AbstractC4036s.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        C4035r.a aVar22 = C4035r.f34274b;
                        objB = C4035r.b(AbstractC4036s.a(th));
                    }
                }
                objB = C4035r.b(obj);
                AbstractC2161x.c(interfaceC2157v, objB);
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f33102j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f33103k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC2157v interfaceC2157v, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f33103k = interfaceC2157v;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new b(this.f33103k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f33102j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    return obj;
                }
                AbstractC4036s.b(obj);
                InterfaceC2157v interfaceC2157v = this.f33103k;
                this.f33102j = 1;
                Object objI = interfaceC2157v.i(this);
                return objI == objF ? objF : objI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.p pVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f33097l = pVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f33097l, interfaceC4988e);
            aVar.f33096k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f33095j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            InterfaceC4992i.b bVar = ((M) this.f33096k).getCoroutineContext().get(InterfaceC4989f.f40086j0);
            AbstractC4862t.b(bVar);
            InterfaceC4989f interfaceC4989f = (InterfaceC4989f) bVar;
            InterfaceC2157v interfaceC2157vB = AbstractC2161x.b(null, 1, null);
            AbstractC2128g.c(C2154t0.f15207a, interfaceC4989f, O.UNDISPATCHED, new C0398a(interfaceC2157vB, this.f33097l, null));
            while (!interfaceC2157vB.F()) {
                try {
                    return AbstractC2128g.e(interfaceC4989f, new b(interfaceC2157vB, null));
                } catch (InterruptedException unused) {
                }
            }
            return interfaceC2157vB.f();
        }
    }

    public static final Object a(vc.p block) {
        AbstractC4862t.e(block, "block");
        Thread.interrupted();
        return AbstractC2130h.b(null, new a(block, null), 1, null);
    }
}
