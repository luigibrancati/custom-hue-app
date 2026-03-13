package K1;

import D1.C0744b;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import K1.C1007l;
import K1.InterfaceC1032y;
import a2.InterfaceC2611D;
import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import i2.C4333m;

/* JADX INFO: renamed from: K1.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1032y extends D1.z {

    /* JADX INFO: renamed from: K1.y$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public D0 f7360A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public long f7361B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public long f7362C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f7363D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f7364E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public b1 f7365F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f7366G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f7367H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public String f7368I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public boolean f7369J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public u1 f7370K;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC0860h f7372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public J7.t f7374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public J7.t f7375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public J7.t f7376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public J7.t f7377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public J7.t f7378h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public J7.f f7379i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Looper f7380j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7381k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public D1.A f7382l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C0744b f7383m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f7384n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7385o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f7386p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f7387q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f7388r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7389s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7390t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f7391u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public k1 f7392v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public j1 f7393w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f7394x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f7395y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f7396z;

        public b(final Context context) {
            this(context, new J7.t() { // from class: K1.A
                @Override // J7.t
                public final Object get() {
                    return InterfaceC1032y.b.b(context);
                }
            }, new J7.t() { // from class: K1.B
                @Override // J7.t
                public final Object get() {
                    return InterfaceC1032y.b.c(context);
                }
            });
        }

        public static /* synthetic */ i1 b(Context context) {
            return new C1013o(context);
        }

        public static /* synthetic */ InterfaceC2611D.a c(Context context) {
            return new a2.r(context, new C4333m());
        }

        public static /* synthetic */ d2.x f(Context context) {
            return new d2.n(context);
        }

        public InterfaceC1032y g() {
            AbstractC0853a.g(!this.f7366G);
            this.f7366G = true;
            return new C1004j0(this, null);
        }

        public b h(final InterfaceC2611D.a aVar) {
            AbstractC0853a.g(!this.f7366G);
            AbstractC0853a.e(aVar);
            this.f7375e = new J7.t() { // from class: K1.z
                @Override // J7.t
                public final Object get() {
                    return InterfaceC1032y.b.d(aVar);
                }
            };
            return this;
        }

        public b i(final i1 i1Var) {
            AbstractC0853a.g(!this.f7366G);
            AbstractC0853a.e(i1Var);
            this.f7374d = new J7.t() { // from class: K1.C
                @Override // J7.t
                public final Object get() {
                    return InterfaceC1032y.b.a(i1Var);
                }
            };
            return this;
        }

        public b(final Context context, J7.t tVar, J7.t tVar2) {
            this(context, tVar, tVar2, new J7.t() { // from class: K1.D
                @Override // J7.t
                public final Object get() {
                    return InterfaceC1032y.b.f(context);
                }
            }, new J7.t() { // from class: K1.E
                @Override // J7.t
                public final Object get() {
                    return new C1009m();
                }
            }, new J7.t() { // from class: K1.F
                @Override // J7.t
                public final Object get() {
                    return e2.i.n(context);
                }
            }, new J7.f() { // from class: K1.G
                @Override // J7.f
                public final Object apply(Object obj) {
                    return new L1.r0((InterfaceC0860h) obj);
                }
            });
        }

        public b(Context context, J7.t tVar, J7.t tVar2, J7.t tVar3, J7.t tVar4, J7.t tVar5, J7.f fVar) {
            this.f7371a = (Context) AbstractC0853a.e(context);
            this.f7374d = tVar;
            this.f7375e = tVar2;
            this.f7376f = tVar3;
            this.f7377g = tVar4;
            this.f7378h = tVar5;
            this.f7379i = fVar;
            this.f7380j = G1.M.Y();
            this.f7383m = C0744b.f1660h;
            this.f7385o = 0;
            this.f7389s = 1;
            this.f7390t = 0;
            this.f7391u = true;
            this.f7392v = k1.f7220g;
            this.f7394x = 5000L;
            this.f7395y = 15000L;
            this.f7396z = 3000L;
            this.f7393w = j1.f7191i;
            this.f7360A = new C1007l.b().a();
            this.f7372b = InterfaceC0860h.f4292a;
            this.f7361B = 500L;
            this.f7362C = 2000L;
            this.f7364E = true;
            this.f7368I = "";
            this.f7381k = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            this.f7370K = new C1015p();
        }

        public static /* synthetic */ i1 a(i1 i1Var) {
            return i1Var;
        }

        public static /* synthetic */ InterfaceC2611D.a d(InterfaceC2611D.a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: renamed from: K1.y$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f7397b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7398a;

        public c(long j10) {
            this.f7398a = j10;
        }
    }

    D1.o a();

    k1 b();

    void c(k1 k1Var);

    void release();

    /* JADX INFO: renamed from: K1.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void y(boolean z10);

        default void w(boolean z10) {
        }
    }
}
