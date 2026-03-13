package com.google.android.filament.utils;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import fc.C4012E;
import fc.C4043z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4856m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\t\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\b¢\u0006\u0004\b\u0005\u0010\t\u001a\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\f\u001a\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\f\u001a\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\f\u001a\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\f\u001a\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0007\u001a\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0018\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020%H\u0082\b¢\u0006\u0004\b&\u0010'\u001a \u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020%H\u0082\b¢\u0006\u0004\b&\u0010(\u001a7\u00101\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100\"\u0014\u00102\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00104\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00103\"\u0014\u00105\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00103\"\u0014\u00106\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00103\"\u0014\u00107\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00103\"\u0014\u00108\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00103\"\u0014\u00109\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00103\"\u0014\u0010:\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00103\"\u0014\u0010;\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00103\"\u0014\u0010<\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00103\"\u0014\u0010=\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00103\"\u0014\u0010>\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00103\"\u0014\u0010?\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00103\"\u0014\u0010@\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00103\"\u0014\u0010A\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00103\"\u0014\u0010B\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00103\"\u0014\u0010C\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00103\"\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\"\u0015\u0010!\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010\u0004\"\u0015\u0010!\u001a\u00020\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bF\u0010\u0007¨\u0006G"}, d2 = {"", "value", "Lcom/google/android/filament/utils/Half;", "Half", "(D)S", "toHalf", "", "(F)S", "", "(Ljava/lang/String;)S", "x", "sqrt-FqSqZzs", "(S)S", "sqrt", "abs-FqSqZzs", "abs", "y", "min-IX2I5L0", "(SS)S", "min", "max-IX2I5L0", "max", "round-FqSqZzs", "round", "floor-FqSqZzs", "floor", "ceil-FqSqZzs", "ceil", "truncate-FqSqZzs", "truncate", "f", "Lfc/E;", "floatToHalf", "h", "halfToShort-xj2QHRw", "(S)F", "halfToShort", "", "quiet", "(I)I", "(II)I", "sign", "e", "Lfc/z;", "m", "s", "fraction", "fixedToHalf-yOCu0fQ", "(IIIII)S", "fixedToHalf", "FP16_SIGN_SHIFT", "I", "FP16_SIGN_MASK", "FP16_EXPONENT_SHIFT", "FP16_EXPONENT_MASK", "FP16_SIGNIFICAND_MASK", "FP16_EXPONENT_BIAS", "FP16_ABS", "FP16_EXPONENT_MAX", "FP16_NAN", "FP16_QUIET_NAN", "FP32_SIGN_SHIFT", "FP32_EXPONENT_SHIFT", "FP32_EXPONENT_MASK", "FP32_SIGNIFICAND_MASK", "FP32_EXPONENT_BIAS", "FP32_QNAN_MASK", "FP32_DENORMAL_MAGIC", "FP32_DENORMAL_FLOAT", "F", "getH", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HalfKt {
    private static final int FP16_ABS = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_NAN = 32256;
    private static final int FP16_QUIET_NAN = 32767;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;

    static {
        C4856m c4856m = C4856m.f39795a;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    public static final short Half(double d10) {
        return Half.m11constructorimpl(floatToHalf((float) d10));
    }

    /* JADX INFO: renamed from: abs-FqSqZzs, reason: not valid java name */
    public static final short m169absFqSqZzs(short s10) {
        return Half.m16getAbsoluteValueSjiOe_E(s10);
    }

    /* JADX INFO: renamed from: ceil-FqSqZzs, reason: not valid java name */
    public static final short m172ceilFqSqZzs(short s10) {
        int iM36toBitsimpl = Half.m36toBitsimpl(s10);
        int i10 = iM36toBitsimpl & 32767;
        if (i10 < 15360) {
            iM36toBitsimpl = ((-((~(iM36toBitsimpl >> 15)) & (i10 == 0 ? 0 : 1))) & 15360) | (32768 & iM36toBitsimpl);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            iM36toBitsimpl = (iM36toBitsimpl + (i11 & ((iM36toBitsimpl >> 15) - 1))) & (~i11);
        } else if (i10 > FP16_EXPONENT_MAX) {
            iM36toBitsimpl |= 512;
        }
        return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fixedToHalf-yOCu0fQ, reason: not valid java name */
    public static final short m173fixedToHalfyOCu0fQ(int i10, int i11, int i12, int i13, int i14) {
        int iB;
        int iB2;
        int iB3;
        if (i11 < 0) {
            iB = C4043z.b(C4043z.b(i10) + C4043z.b(i12 >>> ((i14 - 10) - i11)));
            int i15 = (i14 - 11) - i11;
            iB2 = C4043z.b(C4043z.b(i12 >>> i15) & 1);
            iB3 = C4043z.b(C4043z.b(C4043z.b(i12 & C4043z.b(C4043z.b(1 << i15) - C4043z.b(1))) != 0 ? 1 : 0) | i13);
        } else {
            iB = C4043z.b(C4043z.b(C4043z.b(i10) + C4043z.b(C4043z.b(i11) << 10)) + C4043z.b(i12 >>> (i14 - 10)));
            int i16 = i14 - 11;
            iB2 = C4043z.b(C4043z.b(i12 >>> i16) & 1);
            iB3 = C4043z.b(C4043z.b(C4043z.b(i12 & C4043z.b(C4043z.b(1 << i16) - C4043z.b(1))) != 0 ? 1 : 0) | i13);
        }
        return Half.m11constructorimpl(C4012E.b((short) C4043z.b(iB + C4043z.b(iB2 & C4043z.b(iB3 | iB)))));
    }

    private static final short floatToHalf(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        int i10 = iFloatToIntBits >>> 31;
        int i11 = (iFloatToIntBits >>> 23) & FP32_EXPONENT_MASK;
        int i12 = FP32_SIGNIFICAND_MASK & iFloatToIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != FP32_EXPONENT_MASK) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else if (i15 > 0) {
                i14 = i12 >> 13;
                if ((iFloatToIntBits & RecognitionOptions.AZTEC) != 0) {
                    return C4012E.b((short) ((((i15 << 10) | i14) + 1) | (i10 << 15)));
                }
                i13 = i15;
            } else if (i15 >= -10) {
                int i16 = (8388608 | i12) >> (1 - i15);
                if ((i16 & RecognitionOptions.AZTEC) != 0) {
                    i16 += 8192;
                }
                i13 = 0;
                i14 = i16 >> 13;
            } else {
                i13 = 0;
            }
        } else if (i12 != 0) {
            i14 = 512;
        }
        return C4012E.b((short) ((i10 << 15) | (i13 << 10) | i14));
    }

    /* JADX INFO: renamed from: floor-FqSqZzs, reason: not valid java name */
    public static final short m174floorFqSqZzs(short s10) {
        int iM36toBitsimpl = Half.m36toBitsimpl(s10);
        int i10 = iM36toBitsimpl & 32767;
        if (i10 < 15360) {
            iM36toBitsimpl = ((iM36toBitsimpl > 32768 ? 65535 : 0) & 15360) | (iM36toBitsimpl & 32768);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            iM36toBitsimpl = (iM36toBitsimpl + ((-(iM36toBitsimpl >> 15)) & i11)) & (~i11);
        } else if (i10 > FP16_EXPONENT_MAX) {
            iM36toBitsimpl |= 512;
        }
        return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
    }

    public static final short getH(double d10) {
        return Half.m11constructorimpl(floatToHalf((float) d10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: halfToShort-xj2QHRw, reason: not valid java name */
    public static final float m175halfToShortxj2QHRw(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = FP32_EXPONENT_MASK;
                if (i16 != 0) {
                    i16 |= FP32_QNAN_MASK;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                C4856m c4856m = C4856m.f39795a;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        int i18 = (i12 << 23) | (i13 << 16) | i11;
        C4856m c4856m2 = C4856m.f39795a;
        return Float.intBitsToFloat(i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[RETURN] */
    /* JADX INFO: renamed from: max-IX2I5L0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final short m176maxIX2I5L0(short r5, short r6) {
        /*
            int r0 = com.google.android.filament.utils.Half.m36toBitsimpl(r5)
            r1 = r0 & 32767(0x7fff, float:4.5916E-41)
            r2 = 31744(0x7c00, float:4.4483E-41)
            if (r1 <= r2) goto L11
            com.google.android.filament.utils.Half$Companion r5 = com.google.android.filament.utils.Half.Companion
            short r5 = r5.m58getNaNSjiOe_E()
            return r5
        L11:
            int r3 = com.google.android.filament.utils.Half.m36toBitsimpl(r6)
            r4 = r3 & 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r2) goto L20
            com.google.android.filament.utils.Half$Companion r5 = com.google.android.filament.utils.Half.Companion
            short r5 = r5.m58getNaNSjiOe_E()
            return r5
        L20:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r1 != 0) goto L2b
            if (r4 != 0) goto L2b
            r0 = r0 & r2
            if (r0 == 0) goto L41
            goto L42
        L2b:
            r1 = r0 & r2
            r4 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r4
            if (r1 == 0) goto L35
            int r0 = r2 - r0
        L35:
            r1 = r3 & r2
            if (r1 == 0) goto L3d
            r1 = r3 & r4
            int r2 = r2 - r1
            goto L3f
        L3d:
            r2 = r3 & r4
        L3f:
            if (r0 <= r2) goto L42
        L41:
            return r5
        L42:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.utils.HalfKt.m176maxIX2I5L0(short, short):short");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[RETURN] */
    /* JADX INFO: renamed from: min-IX2I5L0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final short m177minIX2I5L0(short r5, short r6) {
        /*
            int r0 = com.google.android.filament.utils.Half.m36toBitsimpl(r5)
            r1 = r0 & 32767(0x7fff, float:4.5916E-41)
            r2 = 31744(0x7c00, float:4.4483E-41)
            if (r1 <= r2) goto L11
            com.google.android.filament.utils.Half$Companion r5 = com.google.android.filament.utils.Half.Companion
            short r5 = r5.m58getNaNSjiOe_E()
            return r5
        L11:
            int r3 = com.google.android.filament.utils.Half.m36toBitsimpl(r6)
            r4 = r3 & 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r2) goto L20
            com.google.android.filament.utils.Half$Companion r5 = com.google.android.filament.utils.Half.Companion
            short r5 = r5.m58getNaNSjiOe_E()
            return r5
        L20:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r1 != 0) goto L2b
            if (r4 != 0) goto L2b
            r0 = r0 & r2
            if (r0 == 0) goto L42
            goto L41
        L2b:
            r1 = r0 & r2
            r4 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r4
            if (r1 == 0) goto L35
            int r0 = r2 - r0
        L35:
            r1 = r3 & r2
            if (r1 == 0) goto L3d
            r1 = r3 & r4
            int r2 = r2 - r1
            goto L3f
        L3d:
            r2 = r3 & r4
        L3f:
            if (r0 >= r2) goto L42
        L41:
            return r5
        L42:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.utils.HalfKt.m177minIX2I5L0(short, short):short");
    }

    private static final int quiet(int i10) {
        return i10 | 512;
    }

    /* JADX INFO: renamed from: round-FqSqZzs, reason: not valid java name */
    public static final short m178roundFqSqZzs(short s10) {
        int iM36toBitsimpl = Half.m36toBitsimpl(s10);
        int i10 = iM36toBitsimpl & 32767;
        if (i10 < 15360) {
            iM36toBitsimpl = (iM36toBitsimpl & 32768) | ((i10 >= 14336 ? 65535 : 0) & 15360);
        } else if (i10 < 25600) {
            int i11 = i10 >> 10;
            iM36toBitsimpl = (iM36toBitsimpl + (1 << (24 - i11))) & (~((1 << (25 - i11)) - 1));
        } else if (i10 > FP16_EXPONENT_MAX) {
            iM36toBitsimpl |= 512;
        }
        return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
    }

    /* JADX INFO: renamed from: sqrt-FqSqZzs, reason: not valid java name */
    public static final short m179sqrtFqSqZzs(short s10) {
        int iM36toBitsimpl = Half.m36toBitsimpl(s10);
        int i10 = iM36toBitsimpl & 32767;
        if (i10 == 0 || i10 >= FP16_EXPONENT_MAX) {
            if (i10 > FP16_EXPONENT_MAX) {
                iM36toBitsimpl |= 512;
            } else if (iM36toBitsimpl > 32768) {
                iM36toBitsimpl = 32767;
            }
            return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
        }
        int i11 = 15;
        while (i10 < 1024) {
            i10 <<= 1;
            i11--;
        }
        int iB = C4043z.b(C4043z.b(1024 | (i10 & FP16_SIGNIFICAND_MASK)) << 10);
        int i12 = i11 + (i10 >> 10);
        int i13 = i12 & 1;
        int iB2 = C4043z.b(iB << i13);
        int i14 = (i12 - i13) / 2;
        int iB3 = 0;
        for (int iB4 = C4043z.b(ImageMetadata.SHADING_MODE); iB4 != 0; iB4 = C4043z.b(iB4 >>> 2)) {
            int i15 = iB3 + iB4;
            if (Integer.compareUnsigned(iB2, C4043z.b(i15)) < 0) {
                iB3 = C4043z.b(iB3 >>> 1);
            } else {
                iB2 = C4043z.b(iB2 - C4043z.b(i15));
                iB3 = C4043z.b(C4043z.b(iB3 >>> 1) + iB4);
            }
        }
        int iB5 = C4043z.b(C4043z.b(i14 << 10) + C4043z.b(iB3 & FP16_SIGNIFICAND_MASK));
        return Half.m11constructorimpl(C4012E.b((short) C4043z.b(iB5 + C4043z.b((Integer.compareUnsigned(iB2, iB3) > 0 ? 1 : 0) & C4043z.b((iB2 != 0 ? 1 : 0) | iB5)))));
    }

    public static final short toHalf(double d10) {
        return Half.m11constructorimpl(floatToHalf((float) d10));
    }

    /* JADX INFO: renamed from: truncate-FqSqZzs, reason: not valid java name */
    public static final short m180truncateFqSqZzs(short s10) {
        int i10;
        int iM36toBitsimpl = Half.m36toBitsimpl(s10);
        int i11 = iM36toBitsimpl & 32767;
        if (i11 < 15360) {
            i10 = 32768;
        } else {
            if (i11 >= 25600) {
                if (i11 > FP16_EXPONENT_MAX) {
                    iM36toBitsimpl |= 512;
                }
                return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
            }
            i10 = ~((1 << (25 - (i11 >> 10))) - 1);
        }
        iM36toBitsimpl &= i10;
        return Half.m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
    }

    public static final short Half(float f10) {
        return Half.m11constructorimpl(floatToHalf(f10));
    }

    public static final short getH(float f10) {
        return Half.m11constructorimpl(floatToHalf(f10));
    }

    private static final int quiet(int i10, int i11) {
        if ((i10 & 32767) <= FP16_EXPONENT_MAX) {
            i10 = i11;
        }
        return i10 | 512;
    }

    public static final short toHalf(float f10) {
        return Half.m11constructorimpl(floatToHalf(f10));
    }

    public static final short Half(String value) {
        AbstractC4862t.e(value, "value");
        return Half.m11constructorimpl(floatToHalf(Float.parseFloat(value)));
    }

    public static final short toHalf(String str) {
        AbstractC4862t.e(str, "<this>");
        return Half.m11constructorimpl(floatToHalf(Float.parseFloat(str)));
    }
}
