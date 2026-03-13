package n0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: n0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5069g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40490a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f40491b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f40492c = c(9205357640488583168L);

    /* JADX INFO: renamed from: n0.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC5069g.f40492c;
        }

        public final long b() {
            return AbstractC5069g.f40491b;
        }

        public a() {
        }
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC5063a.a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + AbstractC5063a.a(Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)), 1) + ')';
    }

    public static long c(long j10) {
        return j10;
    }
}
