package o0;

import fc.AbstractC4017J;
import fc.C4009B;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;
import p0.AbstractC5369c;
import p0.AbstractC5370d;

/* JADX INFO: renamed from: o0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5188e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f41072a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f41073b = AbstractC5189f.c(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f41074c = AbstractC5189f.c(4282664004L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f41075d = AbstractC5189f.c(4287137928L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f41076e = AbstractC5189f.c(4291611852L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f41077f = AbstractC5189f.c(KeyboardMap.kValueMask);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f41078g = AbstractC5189f.c(4294901760L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f41079h = AbstractC5189f.c(4278255360L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f41080i = AbstractC5189f.c(4278190335L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f41081j = AbstractC5189f.c(4294967040L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f41082k = AbstractC5189f.c(4278255615L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f41083l = AbstractC5189f.c(4294902015L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f41084m = AbstractC5189f.b(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f41085n = AbstractC5189f.a(0.0f, 0.0f, 0.0f, 0.0f, p0.k.f42078a.r());

    /* JADX INFO: renamed from: o0.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC5188e.f41073b;
        }

        public final long b() {
            return AbstractC5188e.f41078g;
        }

        public a() {
        }
    }

    public static final long d(long j10, AbstractC5369c abstractC5369c) {
        return AbstractC5370d.i(g(j10), abstractC5369c, 0, 2, null).a(j10);
    }

    public static final float e(long j10) {
        float fC;
        float f10;
        if (C4009B.b(63 & j10) == 0) {
            fC = (float) AbstractC4017J.c(C4009B.b(C4009B.b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fC = (float) AbstractC4017J.c(C4009B.b(C4009B.b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fC / f10;
    }

    public static final float f(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4009B.b(63 & j10) == 0) {
            return ((float) AbstractC4017J.c(C4009B.b(C4009B.b(j10 >>> 32) & 255))) / 255.0f;
        }
        short sB = (short) C4009B.b(C4009B.b(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC5191h.f41090a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final AbstractC5369c g(long j10) {
        p0.k kVar = p0.k.f42078a;
        return kVar.m()[(int) C4009B.b(j10 & 63)];
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4009B.b(63 & j10) == 0) {
            return ((float) AbstractC4017J.c(C4009B.b(C4009B.b(j10 >>> 40) & 255))) / 255.0f;
        }
        short sB = (short) C4009B.b(C4009B.b(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC5191h.f41090a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float i(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4009B.b(63 & j10) == 0) {
            return ((float) AbstractC4017J.c(C4009B.b(C4009B.b(j10 >>> 48) & 255))) / 255.0f;
        }
        short sB = (short) C4009B.b(C4009B.b(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC5191h.f41090a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int j(long j10) {
        return C4009B.p(j10);
    }

    public abstract /* synthetic */ long k();

    public static long c(long j10) {
        return j10;
    }
}
