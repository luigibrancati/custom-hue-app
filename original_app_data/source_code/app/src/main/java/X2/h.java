package X2;

import Rd.C2142n;
import Rd.M;
import Rd.N;
import U0.l;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f18099b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f18100j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f18101k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f18102l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, h hVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f18102l = hVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(null, this.f18102l, interfaceC4988e);
            aVar.f18101k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f18100j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            throw null;
        }
    }

    public h(MeasurementManager mMeasurementManager) {
        AbstractC4862t.e(mMeasurementManager, "mMeasurementManager");
        this.f18099b = mMeasurementManager;
    }

    public static /* synthetic */ Object h(h hVar, X2.a aVar, InterfaceC4988e interfaceC4988e) {
        new C2142n(C5045b.c(interfaceC4988e), 1).E();
        hVar.i();
        throw null;
    }

    public static /* synthetic */ Object j(h hVar, InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        hVar.i().getMeasurementApiStatus(new g(), l.a(c2142n));
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW;
    }

    public static /* synthetic */ Object k(h hVar, i iVar, InterfaceC4988e interfaceC4988e) {
        Object objD = N.d(new a(iVar, hVar, null), interfaceC4988e);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    public static /* synthetic */ Object l(h hVar, Uri uri, InputEvent inputEvent, InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        hVar.i().registerSource(uri, inputEvent, new g(), l.a(c2142n));
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public static /* synthetic */ Object m(h hVar, Uri uri, InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        hVar.i().registerTrigger(uri, new g(), l.a(c2142n));
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public static /* synthetic */ Object n(h hVar, j jVar, InterfaceC4988e interfaceC4988e) {
        new C2142n(C5045b.c(interfaceC4988e), 1).E();
        hVar.i();
        throw null;
    }

    public static /* synthetic */ Object o(h hVar, k kVar, InterfaceC4988e interfaceC4988e) {
        new C2142n(C5045b.c(interfaceC4988e), 1).E();
        hVar.i();
        throw null;
    }

    @Override // X2.b
    public Object a(X2.a aVar, InterfaceC4988e interfaceC4988e) {
        return h(this, aVar, interfaceC4988e);
    }

    @Override // X2.b
    public Object b(InterfaceC4988e interfaceC4988e) {
        return j(this, interfaceC4988e);
    }

    @Override // X2.b
    public Object c(i iVar, InterfaceC4988e interfaceC4988e) {
        return k(this, iVar, interfaceC4988e);
    }

    @Override // X2.b
    public Object d(Uri uri, InputEvent inputEvent, InterfaceC4988e interfaceC4988e) {
        return l(this, uri, inputEvent, interfaceC4988e);
    }

    @Override // X2.b
    public Object e(Uri uri, InterfaceC4988e interfaceC4988e) {
        return m(this, uri, interfaceC4988e);
    }

    @Override // X2.b
    public Object f(j jVar, InterfaceC4988e interfaceC4988e) {
        return n(this, jVar, interfaceC4988e);
    }

    @Override // X2.b
    public Object g(k kVar, InterfaceC4988e interfaceC4988e) {
        return o(this, kVar, interfaceC4988e);
    }

    public final MeasurementManager i() {
        return this.f18099b;
    }
}
