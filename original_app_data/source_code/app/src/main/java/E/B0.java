package E;

import E.B0;
import L.T;
import L.Z0;
import L.l1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f2710a = new B0() { // from class: E.A0
        @Override // E.B0
        public final B0.c d(B0.b bVar) {
            return B0.c.f2715d;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f2711b = new T.b(c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f2712c = new L.T(c());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B0 f2713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f2714b;

        public a(B0 b02) {
            this.f2713a = b02;
            this.f2714b = b02.a();
        }

        public B0 a() {
            B0 b02 = this.f2713a;
            return b02 instanceof Z0 ? ((Z0) b02).b(this.f2714b) : new l1(this.f2714b, this.f2713a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        Throwable a();

        long b();

        int getStatus();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f2715d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f2716e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f2717f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static c f2718g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2721c;

        public c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f2719a;
        }

        public boolean c() {
            return this.f2721c;
        }

        public boolean d() {
            return this.f2720b;
        }

        public c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        public c(boolean z10, long j10, boolean z11) {
            this.f2720b = z10;
            this.f2719a = j10;
            if (z11) {
                X0.h.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f2721c = z11;
        }
    }

    static long c() {
        return 6000L;
    }

    default long a() {
        return 0L;
    }

    c d(b bVar);
}
