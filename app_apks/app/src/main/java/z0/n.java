package z0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48691b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f48692c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f48693d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f48694e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48695a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return n.f48694e;
        }

        public final long b() {
            return n.f48693d;
        }

        public final long c() {
            return n.f48692c;
        }

        public a() {
        }
    }

    public /* synthetic */ n(long j10) {
        this.f48695a = j10;
    }

    public static final /* synthetic */ n d(long j10) {
        return new n(j10);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f48692c) ? "Unspecified" : g(j10, f48693d) ? "Sp" : g(j10, f48694e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f48695a, obj);
    }

    public int hashCode() {
        return h(this.f48695a);
    }

    public final /* synthetic */ long j() {
        return this.f48695a;
    }

    public String toString() {
        return i(this.f48695a);
    }

    public static long e(long j10) {
        return j10;
    }
}
