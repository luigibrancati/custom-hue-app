package g2;

import D1.K;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface H {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f35141a;

        public c(Throwable th, D1.o oVar) {
            super(th);
            this.f35141a = oVar;
        }
    }

    void T(float f10);

    void a(int i10, D1.o oVar, long j10, int i11, List list);

    boolean b();

    void c(a aVar, Executor executor);

    boolean d(long j10, b bVar);

    void e(long j10);

    void f();

    void g(long j10, long j11);

    void h(Surface surface, G1.D d10);

    void i(List list);

    boolean isInitialized();

    boolean j(boolean z10);

    void k();

    void l();

    Surface m();

    void n();

    void o();

    void p(int i10);

    boolean q(D1.o oVar);

    void r();

    void release();

    void s(boolean z10);

    void t(boolean z10);

    void u(r rVar);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35140a = new C0462a();

        /* JADX INFO: renamed from: g2.H$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0462a implements a {
        }

        default void a() {
        }

        default void b() {
        }

        default void onFirstFrameRendered() {
        }

        default void onVideoSizeChanged(K k10) {
        }
    }
}
