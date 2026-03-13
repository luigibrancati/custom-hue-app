package J3;

import I3.AbstractC0890u;
import Ud.AbstractC2315g;
import Ud.InterfaceC2314f;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5950b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.r {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f5951j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f5952k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ long f5953l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(4, interfaceC4988e);
        }

        public final Object a(InterfaceC2314f interfaceC2314f, Throwable th, long j10, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(interfaceC4988e);
            aVar.f5952k = th;
            aVar.f5953l = j10;
            return aVar.invokeSuspend(C4015H.f34254a);
        }

        @Override // vc.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((InterfaceC2314f) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC4988e) obj4);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f5951j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Throwable th = (Throwable) this.f5952k;
                long j10 = this.f5953l;
                AbstractC0890u.e().d(D.f5949a, "Cannot check for unfinished work", th);
                long jMin = Math.min(j10 * ((long) 30000), D.f5950b);
                this.f5951j = 1;
                if (Rd.X.a(jMin, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return AbstractC5158b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f5954j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ boolean f5955k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f5956l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f5956l = context;
        }

        public final Object a(boolean z10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(Boolean.valueOf(z10), interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = new b(this.f5956l, interfaceC4988e);
            bVar.f5955k = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (InterfaceC4988e) obj2);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f5954j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            R3.r.c(this.f5956l, RescheduleReceiver.class, this.f5955k);
            return C4015H.f34254a;
        }
    }

    static {
        String strI = AbstractC0890u.i("UnfinishedWorkListener");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f5949a = strI;
        f5950b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(Rd.M m10, Context appContext, androidx.work.a configuration, WorkDatabase db2) {
        AbstractC4862t.e(m10, "<this>");
        AbstractC4862t.e(appContext, "appContext");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(db2, "db");
        if (R3.t.b(appContext, configuration)) {
            AbstractC2315g.u(AbstractC2315g.z(AbstractC2315g.l(AbstractC2315g.k(AbstractC2315g.B(db2.W().q(), new a(null)))), new b(appContext, null)), m10);
        }
    }
}
