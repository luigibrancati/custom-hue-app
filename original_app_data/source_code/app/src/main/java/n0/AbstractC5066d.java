package n0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: n0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5066d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40480a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f40481b = b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f40482c = b(9187343241974906880L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f40483d = b(9205357640488583168L);

    /* JADX INFO: renamed from: n0.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC5066d.f40481b;
        }

        public a() {
        }
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static final long e(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)) - Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask));
        return b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & KeyboardMap.kValueMask));
    }

    public static final long f(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)) + Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask));
        return b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & KeyboardMap.kValueMask));
    }

    public static long b(long j10) {
        return j10;
    }
}
