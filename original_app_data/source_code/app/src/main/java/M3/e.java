package M3;

import I3.AbstractC0890u;
import I3.C0874d;
import M3.b;
import M3.e;
import Q3.I;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.X;
import Td.t;
import Td.v;
import Td.y;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements N3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f9234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9235b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9236j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f9237k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0874d f9238l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f9239m;

        /* JADX INFO: renamed from: M3.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0139a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f9240j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ e f9241k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ v f9242l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0139a(e eVar, v vVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f9241k = eVar;
                this.f9242l = vVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new C0139a(this.f9241k, this.f9242l, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0139a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f9240j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    long j10 = this.f9241k.f9235b;
                    this.f9240j = 1;
                    if (X.a(j10, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f9241k.f9235b + " ms");
                this.f9242l.n(new b.C0138b(7));
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0874d c0874d, e eVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f9238l = c0874d;
            this.f9239m = eVar;
        }

        public static final C4015H k(InterfaceC2166z0 interfaceC2166z0, v vVar, b bVar) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
            vVar.n(bVar);
            return C4015H.f34254a;
        }

        public static final C4015H n(InterfaceC6082a interfaceC6082a) {
            interfaceC6082a.invoke();
            return C4015H.f34254a;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f9238l, this.f9239m, interfaceC4988e);
            aVar.f9237k = obj;
            return aVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f9236j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final v vVar = (v) this.f9237k;
                NetworkRequest networkRequestD = this.f9238l.d();
                if (networkRequestD == null) {
                    y.a.a(vVar.j(), null, 1, null);
                    return C4015H.f34254a;
                }
                final InterfaceC2166z0 interfaceC2166z0D = AbstractC2132i.d(vVar, null, null, new C0139a(this.f9239m, vVar, null), 3, null);
                final InterfaceC6082a interfaceC6082aB = i.f9249a.b(this.f9239m.f9234a, networkRequestD, new l() { // from class: M3.c
                    @Override // vc.l
                    public final Object invoke(Object obj2) {
                        return e.a.k(interfaceC2166z0D, vVar, (b) obj2);
                    }
                });
                InterfaceC6082a interfaceC6082a = new InterfaceC6082a() { // from class: M3.d
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return e.a.n(interfaceC6082aB);
                    }
                };
                this.f9236j = 1;
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

        @Override // vc.p
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC4988e interfaceC4988e) {
            return ((a) create(vVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    public e(ConnectivityManager connManager, long j10) {
        AbstractC4862t.e(connManager, "connManager");
        this.f9234a = connManager;
        this.f9235b = j10;
    }

    @Override // N3.e
    public boolean a(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        return workSpec.f13597j.d() != null;
    }

    @Override // N3.e
    public InterfaceC2313e b(C0874d constraints) {
        AbstractC4862t.e(constraints, "constraints");
        return AbstractC2315g.e(new a(constraints, this, null));
    }

    public /* synthetic */ e(ConnectivityManager connectivityManager, long j10, int i10, AbstractC4854k abstractC4854k) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
