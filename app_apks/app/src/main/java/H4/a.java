package H4;

import E4.h;
import Rd.AbstractC2132i;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends F4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F4.b f5306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G4.d f5307f;

    /* JADX INFO: renamed from: H4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0086a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f5308j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E4.a f5310l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0086a(E4.a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f5310l = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C0086a(this.f5310l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0086a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f5308j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                G4.d dVar = a.this.f5307f;
                if (dVar == null) {
                    AbstractC4862t.p("identifyInterceptor");
                    dVar = null;
                }
                E4.a aVar = this.f5310l;
                this.f5308j = 1;
                obj = dVar.f(aVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            E4.a aVar2 = (E4.a) obj;
            if (aVar2 != null) {
                a.this.n(aVar2);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f5311j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f5311j;
            F4.b bVar = null;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                G4.d dVar = a.this.f5307f;
                if (dVar == null) {
                    AbstractC4862t.p("identifyInterceptor");
                    dVar = null;
                }
                this.f5311j = 1;
                if (dVar.o(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            F4.b bVar2 = a.this.f5306e;
            if (bVar2 == null) {
                AbstractC4862t.p("pipeline");
            } else {
                bVar = bVar2;
            }
            bVar.o();
            return C4015H.f34254a;
        }
    }

    @Override // F4.c
    public E4.a b(E4.a payload) {
        AbstractC4862t.e(payload, "payload");
        m(payload);
        return payload;
    }

    @Override // F4.c
    public E4.d c(E4.d payload) {
        AbstractC4862t.e(payload, "payload");
        m(payload);
        return payload;
    }

    @Override // F4.c
    public h d(h payload) {
        AbstractC4862t.e(payload, "payload");
        m(payload);
        return payload;
    }

    @Override // F4.a, F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        F4.b bVar = new F4.b(amplitude, null, null, null, null, null, null, null, null, 510, null);
        this.f5306e = bVar;
        bVar.v();
        this.f5307f = new G4.d(amplitude.p(), amplitude, amplitude.r(), amplitude.l(), this);
        h(new c());
    }

    @Override // F4.c
    public E4.c f(E4.c payload) {
        AbstractC4862t.e(payload, "payload");
        m(payload);
        return payload;
    }

    @Override // F4.c
    public void flush() {
        AbstractC2132i.d(i().k(), i().v(), null, new b(null), 2, null);
    }

    public final void m(E4.a aVar) {
        if (aVar != null) {
            if (aVar.J0()) {
                AbstractC2132i.d(i().k(), i().v(), null, new C0086a(aVar, null), 2, null);
                return;
            }
            i().r().c("Event is invalid for missing information like userId and deviceId. Dropping event: " + aVar.F0());
        }
    }

    public final void n(E4.a event) {
        AbstractC4862t.e(event, "event");
        F4.b bVar = this.f5306e;
        if (bVar == null) {
            AbstractC4862t.p("pipeline");
            bVar = null;
        }
        bVar.s(event);
    }
}
