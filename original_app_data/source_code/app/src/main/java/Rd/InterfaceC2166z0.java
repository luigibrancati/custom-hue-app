package Rd;

import java.util.concurrent.CancellationException;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2166z0 extends InterfaceC4992i.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final b f15218M = b.f15219a;

    /* JADX INFO: renamed from: Rd.z0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC2166z0 interfaceC2166z0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC2166z0.a(cancellationException);
        }

        public static Object b(InterfaceC2166z0 interfaceC2166z0, Object obj, vc.p pVar) {
            return InterfaceC4992i.b.a.a(interfaceC2166z0, obj, pVar);
        }

        public static InterfaceC4992i.b c(InterfaceC2166z0 interfaceC2166z0, InterfaceC4992i.c cVar) {
            return InterfaceC4992i.b.a.b(interfaceC2166z0, cVar);
        }

        public static InterfaceC4992i d(InterfaceC2166z0 interfaceC2166z0, InterfaceC4992i.c cVar) {
            return InterfaceC4992i.b.a.c(interfaceC2166z0, cVar);
        }

        public static InterfaceC4992i e(InterfaceC2166z0 interfaceC2166z0, InterfaceC4992i interfaceC4992i) {
            return InterfaceC4992i.b.a.d(interfaceC2166z0, interfaceC4992i);
        }
    }

    /* JADX INFO: renamed from: Rd.z0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC4992i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f15219a = new b();
    }

    boolean F();

    InterfaceC2151s K(InterfaceC2155u interfaceC2155u);

    void a(CancellationException cancellationException);

    Object a0(InterfaceC4988e interfaceC4988e);

    boolean c();

    InterfaceC2127f0 d(boolean z10, boolean z11, vc.l lVar);

    Nd.h g();

    CancellationException h();

    boolean isCancelled();

    boolean start();

    InterfaceC2127f0 u(vc.l lVar);
}
