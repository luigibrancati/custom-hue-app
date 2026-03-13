package D;

import D.l;
import E.K;
import L.InterfaceC1099g0;
import L.L0;
import L.M0;
import L.R0;
import L.Y0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l implements Y0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final InterfaceC1099g0 f1430P;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M0 f1431a = M0.g0();

        public static /* synthetic */ boolean c(a aVar, InterfaceC1099g0 interfaceC1099g0, InterfaceC1099g0.a aVar2) {
            aVar.a().Y(aVar2, interfaceC1099g0.f(aVar2), interfaceC1099g0.a(aVar2));
            return true;
        }

        public static a e(final InterfaceC1099g0 interfaceC1099g0) {
            final a aVar = new a();
            interfaceC1099g0.e("camera2.captureRequest.option.", new InterfaceC1099g0.b() { // from class: D.k
                @Override // L.InterfaceC1099g0.b
                public final boolean a(InterfaceC1099g0.a aVar2) {
                    return l.a.c(this.f1428a, interfaceC1099g0, aVar2);
                }
            });
            return aVar;
        }

        @Override // E.K
        public L0 a() {
            return this.f1431a;
        }

        public l d() {
            return new l(R0.f0(this.f1431a));
        }
    }

    public l(InterfaceC1099g0 interfaceC1099g0) {
        this.f1430P = interfaceC1099g0;
    }

    @Override // L.Y0
    public InterfaceC1099g0 getConfig() {
        return this.f1430P;
    }
}
