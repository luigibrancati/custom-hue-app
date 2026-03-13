package a2;

import F2.s;
import L1.B0;
import android.os.Handler;

/* JADX INFO: renamed from: a2.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2611D {

    /* JADX INFO: renamed from: a2.D$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f20525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20526e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f20522a.equals(obj) ? this : new b(obj, this.f20523b, this.f20524c, this.f20525d, this.f20526e);
        }

        public boolean b() {
            return this.f20523b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20522a.equals(bVar.f20522a) && this.f20523b == bVar.f20523b && this.f20524c == bVar.f20524c && this.f20525d == bVar.f20525d && this.f20526e == bVar.f20526e;
        }

        public int hashCode() {
            return ((((((((527 + this.f20522a.hashCode()) * 31) + this.f20523b) * 31) + this.f20524c) * 31) + ((int) this.f20525d)) * 31) + this.f20526e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public b(Object obj, int i10, int i11, long j10, int i12) {
            this.f20522a = obj;
            this.f20523b = i10;
            this.f20524c = i11;
            this.f20525d = j10;
            this.f20526e = i12;
        }
    }

    /* JADX INFO: renamed from: a2.D$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(InterfaceC2611D interfaceC2611D, D1.D d10);
    }

    void c(Handler handler, L l10);

    void d(c cVar);

    void e(c cVar);

    D1.r f();

    void h(InterfaceC2610C interfaceC2610C);

    void i(L l10);

    void j(c cVar);

    InterfaceC2610C k(b bVar, e2.b bVar2, long j10);

    void l(Handler handler, P1.t tVar);

    void m(c cVar, I1.x xVar, B0 b02);

    void n();

    default boolean p() {
        return true;
    }

    default D1.D q() {
        return null;
    }

    void r(P1.t tVar);

    /* JADX INFO: renamed from: a2.D$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20521a = M.f20554b;

        a d(P1.w wVar);

        a e(e2.k kVar);

        InterfaceC2611D f(D1.r rVar);

        default a a(s.a aVar) {
            return this;
        }

        default a b(boolean z10) {
            return this;
        }

        default a c(int i10) {
            return this;
        }
    }

    default void b(D1.r rVar) {
    }
}
