package z0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: z0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6493g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48683a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f48684b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f48685c = c(9223372034707292159L);

    /* JADX INFO: renamed from: z0.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC6493g.f48685c;
        }

        public final long b() {
            return AbstractC6493g.f48684b;
        }

        public a() {
        }
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    public static final long g(long j10, long j11) {
        return c((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & KeyboardMap.kValueMask)) - ((int) (j11 & KeyboardMap.kValueMask)))) & KeyboardMap.kValueMask));
    }

    public static final long h(long j10, long j11) {
        return c((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & KeyboardMap.kValueMask)) + ((int) (j11 & KeyboardMap.kValueMask)))) & KeyboardMap.kValueMask));
    }

    public static long c(long j10) {
        return j10;
    }
}
