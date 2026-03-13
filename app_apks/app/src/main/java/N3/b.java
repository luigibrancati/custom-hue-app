package N3;

import I3.C0874d;
import M3.b;
import N3.b;
import Td.t;
import Td.v;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O3.h f9592a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9593j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f9594k;

        /* JADX INFO: renamed from: N3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0152a implements M3.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f9596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9597b;

            public C0152a(b bVar, v vVar) {
                this.f9596a = bVar;
                this.f9597b = vVar;
            }

            @Override // M3.a
            public void a(Object obj) {
                this.f9597b.j().n(this.f9596a.e(obj) ? new b.C0138b(this.f9596a.d()) : b.a.f9229a);
            }
        }

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        public static final C4015H i(b bVar, C0152a c0152a) {
            bVar.f9592a.f(c0152a);
            return C4015H.f34254a;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = b.this.new a(interfaceC4988e);
            aVar.f9594k = obj;
            return aVar;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC4988e interfaceC4988e) {
            return ((a) create(vVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f9593j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                v vVar = (v) this.f9594k;
                final C0152a c0152a = new C0152a(b.this, vVar);
                b.this.f9592a.c(c0152a);
                final b bVar = b.this;
                InterfaceC6082a interfaceC6082a = new InterfaceC6082a() { // from class: N3.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return b.a.i(bVar, c0152a);
                    }
                };
                this.f9593j = 1;
                if (t.a(vVar, interfaceC6082a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public b(O3.h tracker) {
        AbstractC4862t.e(tracker, "tracker");
        this.f9592a = tracker;
    }

    @Override // N3.e
    public InterfaceC2313e b(C0874d constraints) {
        AbstractC4862t.e(constraints, "constraints");
        return AbstractC2315g.e(new a(null));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
