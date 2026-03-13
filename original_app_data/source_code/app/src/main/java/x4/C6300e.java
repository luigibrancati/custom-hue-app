package x4;

import F4.f;
import Rd.AbstractC2132i;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.m;
import q4.C5488d;
import vc.p;
import z4.C6507f;
import z4.C6508g;

/* JADX INFO: renamed from: x4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6300e implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47464d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Void f47465e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f47466a = f.a.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f47467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C6508g f47468c;

    /* JADX INFO: renamed from: x4.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Void a() {
            return C6300e.f47465e;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: x4.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f47469j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ D4.a f47470k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C6507f f47471l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D4.a aVar, C6507f c6507f, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f47470k = aVar;
            this.f47471l = c6507f;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f47470k, this.f47471l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f47469j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            this.f47470k.l().z(AbstractC5158b.a(!this.f47471l.b()));
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: x4.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements C6508g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D4.a f47472a;

        public c(D4.a aVar) {
            this.f47472a = aVar;
        }

        @Override // z4.C6508g.a
        public void a() {
            this.f47472a.r().a("AndroidNetworkListener, onNetworkUnavailable.");
            this.f47472a.l().z(Boolean.TRUE);
        }

        @Override // z4.C6508g.a
        public void b() {
            this.f47472a.r().a("AndroidNetworkListener, onNetworkAvailable.");
            this.f47472a.l().z(Boolean.FALSE);
            this.f47472a.i();
        }
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f47467b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        amplitude.r().a("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        D4.b bVarL = amplitude.l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        AbstractC2132i.d(amplitude.k(), amplitude.v(), null, new b(amplitude, new C6507f(((C5488d) bVarL).C(), amplitude.r()), null), 2, null);
        c cVar = new c(amplitude);
        D4.b bVarL2 = amplitude.l();
        AbstractC4862t.c(bVarL2, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        j(new C6508g(((C5488d) bVarL2).C(), amplitude.r(), cVar));
        i().c();
    }

    @Override // F4.f
    public f.a getType() {
        return this.f47466a;
    }

    public final C6508g i() {
        C6508g c6508g = this.f47468c;
        if (c6508g != null) {
            return c6508g;
        }
        AbstractC4862t.p("networkListener");
        return null;
    }

    public final void j(C6508g c6508g) {
        AbstractC4862t.e(c6508g, "<set-?>");
        this.f47468c = c6508g;
    }
}
