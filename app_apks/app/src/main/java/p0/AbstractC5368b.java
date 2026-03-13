package p0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: p0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5368b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42065a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f42066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f42067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f42068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f42069e;

    /* JADX INFO: renamed from: p0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC5368b.f42068d;
        }

        public final long b() {
            return AbstractC5368b.f42066b;
        }

        public final long c() {
            return AbstractC5368b.f42067c;
        }

        public a() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f42066b = d((((long) 0) & KeyboardMap.kValueMask) | j11);
        f42067c = d((((long) 1) & KeyboardMap.kValueMask) | j11);
        f42068d = d(j11 | (((long) 2) & KeyboardMap.kValueMask));
        f42069e = d((j10 & KeyboardMap.kValueMask) | (((long) 4) << 32));
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f42066b) ? "Rgb" : e(j10, f42067c) ? "Xyz" : e(j10, f42068d) ? "Lab" : e(j10, f42069e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j10) {
        return j10;
    }
}
