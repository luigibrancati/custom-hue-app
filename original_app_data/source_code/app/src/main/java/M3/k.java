package M3;

import I3.AbstractC0890u;
import Q3.I;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import android.content.Context;
import android.net.ConnectivityManager;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9260a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9261j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j f9262k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I f9263l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f9264m;

        /* JADX INFO: renamed from: M3.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0141a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f9265a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f9266b;

            public C0141a(g gVar, I i10) {
                this.f9265a = gVar;
                this.f9266b = i10;
            }

            @Override // Ud.InterfaceC2314f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, InterfaceC4988e interfaceC4988e) {
                this.f9265a.b(this.f9266b, bVar);
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, I i10, g gVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f9262k = jVar;
            this.f9263l = i10;
            this.f9264m = gVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(this.f9262k, this.f9263l, this.f9264m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f9261j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e interfaceC2313eA = this.f9262k.a(this.f9263l);
                C0141a c0141a = new C0141a(this.f9264m, this.f9263l);
                this.f9261j = 1;
                if (interfaceC2313eA.collect(c0141a, this) == objF) {
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

    static {
        String strI = AbstractC0890u.i("WorkConstraintsTracker");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f9260a = strI;
    }

    public static final e a(Context context) {
        AbstractC4862t.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new e((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final InterfaceC2166z0 c(j jVar, I spec, Rd.I dispatcher, g listener) {
        AbstractC4862t.e(jVar, "<this>");
        AbstractC4862t.e(spec, "spec");
        AbstractC4862t.e(dispatcher, "dispatcher");
        AbstractC4862t.e(listener, "listener");
        return AbstractC2132i.d(N.a(dispatcher), null, null, new a(jVar, spec, listener, null), 3, null);
    }
}
