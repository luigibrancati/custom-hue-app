package z0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6487a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0675a f48679b = new C0675a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48680a;

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0675a {
        public /* synthetic */ C0675a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0675a() {
        }
    }

    public /* synthetic */ C6487a(long j10) {
        this.f48680a = j10;
    }

    public static final /* synthetic */ C6487a a(long j10) {
        return new C6487a(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C6487a) && j10 == ((C6487a) obj).k();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int f(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int h(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        int iF = f(j10);
        String strValueOf = iF == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iF);
        int iE = e(j10);
        return "Constraints(minWidth = " + h(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + g(j10) + ", maxHeight = " + (iE != Integer.MAX_VALUE ? String.valueOf(iE) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f48680a, obj);
    }

    public int hashCode() {
        return i(this.f48680a);
    }

    public final /* synthetic */ long k() {
        return this.f48680a;
    }

    public String toString() {
        return j(this.f48680a);
    }

    public static long b(long j10) {
        return j10;
    }
}
