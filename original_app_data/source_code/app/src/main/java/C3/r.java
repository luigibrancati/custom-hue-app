package C3;

import C3.r;
import Rd.C2123d0;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import android.app.Activity;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;
import y3.AbstractC6395e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f1136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.a f1137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC6395e f1138d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f1140k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Activity f1142m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f1142m = activity;
        }

        public static final void j(Td.v vVar, s sVar) {
            vVar.n(sVar);
        }

        public static final C4015H k(r rVar, X0.a aVar) {
            rVar.f1137c.a(aVar);
            return C4015H.f34254a;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = r.this.new a(this.f1142m, interfaceC4988e);
            aVar.f1140k = obj;
            return aVar;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Td.v vVar, InterfaceC4988e interfaceC4988e) {
            return ((a) create(vVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f1139j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final Td.v vVar = (Td.v) this.f1140k;
                final X0.a aVar = new X0.a() { // from class: C3.p
                    @Override // X0.a
                    public final void accept(Object obj2) {
                        r.a.j(vVar, (s) obj2);
                    }
                };
                r.this.f1137c.b(this.f1142m, new X2.g(), aVar);
                final r rVar = r.this;
                InterfaceC6082a interfaceC6082a = new InterfaceC6082a() { // from class: C3.q
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return r.a.k(rVar, aVar);
                    }
                };
                this.f1139j = 1;
                if (Td.t.a(vVar, interfaceC6082a, this) == objF) {
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

    public r(v windowMetricsCalculator, D3.a windowBackend, AbstractC6395e windowSdkExtensions) {
        AbstractC4862t.e(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC4862t.e(windowBackend, "windowBackend");
        AbstractC4862t.e(windowSdkExtensions, "windowSdkExtensions");
        this.f1136b = windowMetricsCalculator;
        this.f1137c = windowBackend;
        this.f1138d = windowSdkExtensions;
    }

    @Override // C3.n
    public InterfaceC2313e a(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        return AbstractC2315g.t(AbstractC2315g.e(new a(activity, null)), C2123d0.c());
    }
}
