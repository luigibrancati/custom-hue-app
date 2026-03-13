package com.google.android.filament.utils;

import Od.C1821a;
import Od.o;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.C4012E;
import fc.C4043z;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087@\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b#\u0010!J\r\u0010&\u001a\u00020\u001f¢\u0006\u0004\b%\u0010!J\r\u0010(\u001a\u00020\u001f¢\u0006\u0004\b'\u0010!J\r\u0010*\u001a\u00020\u001f¢\u0006\u0004\b)\u0010!J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000¢\u0006\u0004\b,\u0010-J\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b/\u0010\u0005J\r\u00102\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u0005J\u0015\u00105\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000¢\u0006\u0004\b4\u0010-J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b6\u0010\bJ\r\u00109\u001a\u00020\u0013¢\u0006\u0004\b8\u0010\u0015J\u0010\u0010;\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b:\u0010\u0005J\u0010\u0010=\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b<\u0010\u0005J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b?\u0010-J\u0018\u0010B\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bA\u0010-J\u0018\u0010D\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bC\u0010-J\u0018\u0010F\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bE\u0010-J\u0010\u0010H\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bG\u0010\u0005J\u0010\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bI\u0010\u0005J\u0018\u0010M\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010Q\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\r\u0010S\u001a\u00020N¢\u0006\u0004\bR\u0010PJ\u0010\u0010U\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bT\u0010\bJ\u001a\u0010Y\u001a\u00020\u001f2\b\u0010>\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0011\u0010+\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b[\u0010\u0005R\u0011\u0010]\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\\\u0010\bR\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010\bR\u0011\u0010a\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010\u0005R\u0011\u0010c\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\bb\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006e"}, d2 = {"Lcom/google/android/filament/utils/Half;", "", "Lfc/E;", "v", "constructor-impl", "(S)S", "", "toBits-impl", "(S)I", "toBits", "", "toByte-impl", "(S)B", "toByte", "", "toShort-impl", "toShort", "toInt-impl", "toInt", "", "toLong-impl", "(S)J", "toLong", "", "toFloat-impl", "(S)F", "toFloat", "", "toDouble-impl", "(S)D", "toDouble", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isZero-impl", "isZero", "isNormalized-impl", "isNormalized", "sign", "withSign-5SPjhV8", "(SS)S", "withSign", "nextUp-SjiOe_E", "nextUp", "nextDown-SjiOe_E", "nextDown", "to", "nextTowards-5SPjhV8", "nextTowards", "roundToInt-impl", "roundToInt", "roundToLong-impl", "roundToLong", "unaryMinus-SjiOe_E", "unaryMinus", "unaryPlus-SjiOe_E", "unaryPlus", Request.JsonKeys.OTHER, "plus-5SPjhV8", IPTC.PREFIX_PLUS, "minus-5SPjhV8", "minus", "times-5SPjhV8", "times", "div-5SPjhV8", "div", "inc-SjiOe_E", "inc", "dec-SjiOe_E", "dec", "compareTo-FqSqZzs", "(SS)I", "compareTo", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "toHexString-impl", "toHexString", "hashCode-impl", "hashCode", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "S", "getSign-SjiOe_E", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "getAbsoluteValue-SjiOe_E", "absoluteValue", "getUlp-SjiOe_E", "ulp", "Companion", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Half implements Comparable<Half> {
    public static final int MAX_EXPONENT = 15;
    public static final int MIN_EXPONENT = -14;
    public static final int SIZE = 16;
    private final short v;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short EPSILON = m11constructorimpl(C4012E.b((short) 5120));
    private static final short LOWEST_VALUE = m11constructorimpl(C4012E.b((short) 64511));
    private static final short MAX_VALUE = m11constructorimpl(C4012E.b((short) 31743));
    private static final short MIN_NORMAL = m11constructorimpl(C4012E.b((short) RecognitionOptions.UPC_E));
    private static final short MIN_VALUE = m11constructorimpl(C4012E.b((short) 1));
    private static final short NaN = m11constructorimpl(C4012E.b((short) 32256));
    private static final short NEGATIVE_INFINITY = m11constructorimpl(C4012E.b((short) 64512));
    private static final short NEGATIVE_ZERO = m11constructorimpl(C4012E.b((short) 32768));
    private static final short POSITIVE_INFINITY = m11constructorimpl(C4012E.b((short) 31744));
    private static final short POSITIVE_ZERO = m11constructorimpl(C4012E.b((short) 0));

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\tR\u0013\u0010\u000f\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0010\u0010\tR\u0013\u0010\u0011\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\tR\u0013\u0010\u0013\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0014\u0010\tR\u0013\u0010\u0015\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0016\u0010\tR\u0013\u0010\u0017\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\tR\u0013\u0010\u0019\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u001a\u0010\tR\u0013\u0010\u001b\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u001c\u0010\tR\u0013\u0010\u001d\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u001e\u0010\t¨\u0006#"}, d2 = {"Lcom/google/android/filament/utils/Half$Companion;", "", "<init>", "()V", "SIZE", "", "EPSILON", "Lcom/google/android/filament/utils/Half;", "getEPSILON-SjiOe_E", "()S", "S", "MAX_EXPONENT", "MIN_EXPONENT", "LOWEST_VALUE", "getLOWEST_VALUE-SjiOe_E", "MAX_VALUE", "getMAX_VALUE-SjiOe_E", "MIN_NORMAL", "getMIN_NORMAL-SjiOe_E", "MIN_VALUE", "getMIN_VALUE-SjiOe_E", "NaN", "getNaN-SjiOe_E", "NEGATIVE_INFINITY", "getNEGATIVE_INFINITY-SjiOe_E", "NEGATIVE_ZERO", "getNEGATIVE_ZERO-SjiOe_E", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY-SjiOe_E", "POSITIVE_ZERO", "getPOSITIVE_ZERO-SjiOe_E", "fromBits", "bits", "fromBits-YoEgL-c", "(I)S", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: renamed from: fromBits-YoEgL-c, reason: not valid java name */
        public final short m50fromBitsYoEgLc(int bits) {
            return Half.m11constructorimpl(C4012E.b((short) (65535 & bits)));
        }

        /* JADX INFO: renamed from: getEPSILON-SjiOe_E, reason: not valid java name */
        public final short m51getEPSILONSjiOe_E() {
            return Half.EPSILON;
        }

        /* JADX INFO: renamed from: getLOWEST_VALUE-SjiOe_E, reason: not valid java name */
        public final short m52getLOWEST_VALUESjiOe_E() {
            return Half.LOWEST_VALUE;
        }

        /* JADX INFO: renamed from: getMAX_VALUE-SjiOe_E, reason: not valid java name */
        public final short m53getMAX_VALUESjiOe_E() {
            return Half.MAX_VALUE;
        }

        /* JADX INFO: renamed from: getMIN_NORMAL-SjiOe_E, reason: not valid java name */
        public final short m54getMIN_NORMALSjiOe_E() {
            return Half.MIN_NORMAL;
        }

        /* JADX INFO: renamed from: getMIN_VALUE-SjiOe_E, reason: not valid java name */
        public final short m55getMIN_VALUESjiOe_E() {
            return Half.MIN_VALUE;
        }

        /* JADX INFO: renamed from: getNEGATIVE_INFINITY-SjiOe_E, reason: not valid java name */
        public final short m56getNEGATIVE_INFINITYSjiOe_E() {
            return Half.NEGATIVE_INFINITY;
        }

        /* JADX INFO: renamed from: getNEGATIVE_ZERO-SjiOe_E, reason: not valid java name */
        public final short m57getNEGATIVE_ZEROSjiOe_E() {
            return Half.NEGATIVE_ZERO;
        }

        /* JADX INFO: renamed from: getNaN-SjiOe_E, reason: not valid java name */
        public final short m58getNaNSjiOe_E() {
            return Half.NaN;
        }

        /* JADX INFO: renamed from: getPOSITIVE_INFINITY-SjiOe_E, reason: not valid java name */
        public final short m59getPOSITIVE_INFINITYSjiOe_E() {
            return Half.POSITIVE_INFINITY;
        }

        /* JADX INFO: renamed from: getPOSITIVE_ZERO-SjiOe_E, reason: not valid java name */
        public final short m60getPOSITIVE_ZEROSjiOe_E() {
            return Half.POSITIVE_ZERO;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Half(short s10) {
        this.v = s10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Half m9boximpl(short s10) {
        return new Half(s10);
    }

    /* JADX INFO: renamed from: compareTo-FqSqZzs, reason: not valid java name */
    public static int m10compareToFqSqZzs(short s10, short s11) {
        if ((s10 & Short.MAX_VALUE) > 31744) {
            s10 = 32256;
        }
        if ((s11 & Short.MAX_VALUE) > 31744) {
            s11 = 32256;
        }
        if (s10 == s11) {
            return 0;
        }
        int i10 = s10 >> 15;
        int i11 = (s10 ^ ((32768 - i10) | 32768)) + i10;
        int i12 = s11 >> 15;
        return i11 < (s11 ^ (32768 | (32768 - i12))) + i12 ? -1 : 1;
    }

    /* JADX INFO: renamed from: dec-SjiOe_E, reason: not valid java name */
    public static final short m12decSjiOe_E(short s10) {
        return m32plus5SPjhV8(s10, m11constructorimpl(C4012E.b((short) 48128)));
    }

    /* JADX INFO: renamed from: div-5SPjhV8, reason: not valid java name */
    public static final short m13div5SPjhV8(short s10, short s11) {
        int iM36toBitsimpl = m36toBitsimpl(s10);
        int iM36toBitsimpl2 = m36toBitsimpl(s11);
        int i10 = (iM36toBitsimpl ^ iM36toBitsimpl2) & 32768;
        int i11 = iM36toBitsimpl & 32767;
        int i12 = 32767;
        int i13 = iM36toBitsimpl2 & 32767;
        if (i11 >= 31744 || i13 >= 31744) {
            if (i11 > 31744 || i13 > 31744) {
                if ((iM36toBitsimpl & 32767) <= 31744) {
                    i11 = i13;
                }
                i12 = i11 | 512;
            } else if (i11 != i13) {
                i12 = i10 | (i11 == 31744 ? 31744 : 0);
            }
            return m11constructorimpl(C4012E.b((short) i12));
        }
        if (i11 == 0) {
            if (i13 == 0) {
                i10 = 32767;
            }
            return m11constructorimpl(C4012E.b((short) i10));
        }
        if (i13 == 0) {
            return m11constructorimpl(C4012E.b((short) (i10 | 31744)));
        }
        int i14 = 14;
        while (i11 < 1024) {
            i11 <<= 1;
            i14--;
        }
        while (i13 < 1024) {
            i13 <<= 1;
            i14++;
        }
        int iB = C4043z.b((i11 & 1023) | RecognitionOptions.UPC_E);
        int iB2 = C4043z.b(1024 | (i13 & 1023));
        int i15 = Integer.compareUnsigned(iB, iB2) < 0 ? 1 : 0;
        int i16 = i14 + (((i11 >> 10) - (i13 >> 10)) - i15);
        if (i16 > 29) {
            return m11constructorimpl(C4012E.b((short) (i10 | 31744)));
        }
        if (i16 < -11) {
            return m11constructorimpl(C4012E.b((short) i10));
        }
        int iB3 = C4043z.b(iB << (i15 + 12));
        int iB4 = C4043z.b(iB2 << 1);
        return HalfKt.m173fixedToHalfyOCu0fQ(i10, i16, Integer.divideUnsigned(iB3, iB4), Integer.remainderUnsigned(iB3, iB4) != 0 ? 1 : 0, 11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m14equalsimpl(short s10, Object obj) {
        return (obj instanceof Half) && s10 == ((Half) obj).getV();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m15equalsimpl0(short s10, short s11) {
        return C4012E.p(s10, s11);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-SjiOe_E, reason: not valid java name */
    public static final short m16getAbsoluteValueSjiOe_E(short s10) {
        return m11constructorimpl(C4012E.b((short) (s10 & Short.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m17getExponentimpl(short s10) {
        return (((s10 & 65535) >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSign-SjiOe_E, reason: not valid java name */
    public static final short m18getSignSjiOe_E(short s10) {
        int i10 = s10 & Short.MAX_VALUE;
        if (i10 > 31744) {
            return NaN;
        }
        if (i10 == 0) {
            return POSITIVE_ZERO;
        }
        return HalfKt.Half((s10 & Short.MIN_VALUE) != 0 ? -1.0f : 1.0f);
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m19getSignificandimpl(short s10) {
        return s10 & 1023;
    }

    /* JADX INFO: renamed from: getUlp-SjiOe_E, reason: not valid java name */
    public static final short m20getUlpSjiOe_E(short s10) {
        if (m25isNaNimpl(s10)) {
            return NaN;
        }
        if (m24isInfiniteimpl(s10)) {
            return POSITIVE_INFINITY;
        }
        if ((s10 & Short.MAX_VALUE) == 31743) {
            return m11constructorimpl(C4012E.b((short) 19456));
        }
        short sM16getAbsoluteValueSjiOe_E = m16getAbsoluteValueSjiOe_E(s10);
        return m28minus5SPjhV8(m31nextUpSjiOe_E(sM16getAbsoluteValueSjiOe_E), sM16getAbsoluteValueSjiOe_E);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m21hashCodeimpl(short s10) {
        return C4012E.q(s10);
    }

    /* JADX INFO: renamed from: inc-SjiOe_E, reason: not valid java name */
    public static final short m22incSjiOe_E(short s10) {
        return m32plus5SPjhV8(s10, m11constructorimpl(C4012E.b((short) 15360)));
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m23isFiniteimpl(short s10) {
        return (s10 & 31744) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m24isInfiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m25isNaNimpl(short s10) {
        return (s10 & Short.MAX_VALUE) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m26isNormalizedimpl(short s10) {
        int i10 = s10 & 31744;
        return (i10 == 0 || i10 == 31744) ? false : true;
    }

    /* JADX INFO: renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m27isZeroimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == 0;
    }

    /* JADX INFO: renamed from: minus-5SPjhV8, reason: not valid java name */
    public static final short m28minus5SPjhV8(short s10, short s11) {
        return m32plus5SPjhV8(s10, m45unaryMinusSjiOe_E(s11));
    }

    /* JADX INFO: renamed from: nextDown-SjiOe_E, reason: not valid java name */
    public static final short m29nextDownSjiOe_E(short s10) {
        if (m25isNaNimpl(s10) || s10 == NEGATIVE_INFINITY) {
            return s10;
        }
        if (m27isZeroimpl(s10)) {
            return m45unaryMinusSjiOe_E(MIN_VALUE);
        }
        return m11constructorimpl(C4012E.b((short) (m36toBitsimpl(s10) + ((s10 & Short.MIN_VALUE) == 0 ? -1 : 1))));
    }

    /* JADX INFO: renamed from: nextTowards-5SPjhV8, reason: not valid java name */
    public static final short m30nextTowards5SPjhV8(short s10, short s11) {
        return (m25isNaNimpl(s10) || m25isNaNimpl(s11)) ? NaN : m15equalsimpl0(s11, s10) ? s10 : m10compareToFqSqZzs(s11, s10) > 0 ? m31nextUpSjiOe_E(s10) : m29nextDownSjiOe_E(s10);
    }

    /* JADX INFO: renamed from: nextUp-SjiOe_E, reason: not valid java name */
    public static final short m31nextUpSjiOe_E(short s10) {
        if (m25isNaNimpl(s10) || s10 == POSITIVE_INFINITY) {
            return s10;
        }
        if (m27isZeroimpl(s10)) {
            return MIN_VALUE;
        }
        return m11constructorimpl(C4012E.b((short) (m36toBitsimpl(s10) + ((s10 & Short.MIN_VALUE) == 0 ? 1 : -1))));
    }

    /* JADX INFO: renamed from: plus-5SPjhV8, reason: not valid java name */
    public static final short m32plus5SPjhV8(short s10, short s11) {
        int i10;
        int i11;
        int iM36toBitsimpl = m36toBitsimpl(s10);
        int iM36toBitsimpl2 = m36toBitsimpl(s11);
        boolean z10 = ((iM36toBitsimpl ^ iM36toBitsimpl2) & 32768) != 0;
        int i12 = iM36toBitsimpl & 32767;
        int i13 = iM36toBitsimpl2 & 32767;
        if (i12 >= 31744 || i13 >= 31744) {
            if (i12 > 31744 || i13 > 31744) {
                if ((iM36toBitsimpl & 32767) <= 31744) {
                    i12 = i13;
                }
                iM36toBitsimpl = i12 | 512;
            } else if (i13 == 31744) {
                iM36toBitsimpl = (z10 && i12 == 31744) ? 32767 : iM36toBitsimpl2;
            }
            return m11constructorimpl(C4012E.b((short) iM36toBitsimpl));
        }
        if (i12 == 0) {
            return i13 != 0 ? s11 : m11constructorimpl(C4012E.b((short) (iM36toBitsimpl & iM36toBitsimpl2)));
        }
        if (i13 == 0) {
            return s10;
        }
        if (z10 && i13 > i12) {
            iM36toBitsimpl = iM36toBitsimpl2;
        }
        int i14 = iM36toBitsimpl & 32768;
        if (i13 > i12) {
            i13 = i12;
            i12 = i13;
        }
        int i15 = (i12 >> 10) + (i12 <= 1023 ? 1 : 0);
        int i16 = (i15 - (i13 >> 10)) - (i13 <= 1023 ? 1 : 0);
        int i17 = ((i12 & 1023) | ((i12 > 1023 ? 1 : 0) << 10)) << 3;
        if (i16 < 13) {
            int i18 = (((i13 > 1023 ? 1 : 0) << 10) | (i13 & 1023)) << 3;
            i10 = ((i18 & ((1 << i16) - 1)) != 0 ? 1 : 0) | (i18 >> i16);
        } else {
            i10 = 1;
        }
        if (z10) {
            i11 = i17 - i10;
            if (i11 == 0) {
                return POSITIVE_ZERO;
            }
            while (i11 < 8192 && i15 > 1) {
                i11 <<= 1;
                i15--;
            }
        } else {
            int i19 = i17 + i10;
            int i20 = i19 >> 14;
            i15 += i20;
            if (i15 > 30) {
                return m11constructorimpl(C4012E.b((short) (i14 | 31744)));
            }
            i11 = (i19 >> i20) | (i20 & i19);
        }
        int i21 = i14 + ((i15 - 1) << 10) + (i11 >> 3);
        return m11constructorimpl(C4012E.b((short) (i21 + ((i11 >> 2) & 1 & (((i11 & 3) != 0 ? 1 : 0) | i21)))));
    }

    /* JADX INFO: renamed from: roundToInt-impl, reason: not valid java name */
    public static final int m33roundToIntimpl(short s10) {
        if (m25isNaNimpl(s10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return m41toIntimpl(HalfKt.m178roundFqSqZzs(s10));
    }

    /* JADX INFO: renamed from: roundToLong-impl, reason: not valid java name */
    public static final long m34roundToLongimpl(short s10) {
        if (m25isNaNimpl(s10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return m42toLongimpl(HalfKt.m178roundFqSqZzs(s10));
    }

    /* JADX INFO: renamed from: times-5SPjhV8, reason: not valid java name */
    public static final short m35times5SPjhV8(short s10, short s11) {
        int iM36toBitsimpl = m36toBitsimpl(s10);
        int iM36toBitsimpl2 = m36toBitsimpl(s11);
        int i10 = (iM36toBitsimpl ^ iM36toBitsimpl2) & 32768;
        int i11 = iM36toBitsimpl & 32767;
        int i12 = 32767;
        int i13 = iM36toBitsimpl2 & 32767;
        if (i11 >= 31744 || i13 >= 31744) {
            if (i11 > 31744 || i13 > 31744) {
                if ((iM36toBitsimpl & 32767) <= 31744) {
                    i11 = i13;
                }
                i12 = i11 | 512;
            } else if ((i11 != 31744 || i13 != 0) && (i13 != 31744 || i11 != 0)) {
                i12 = i10 | 31744;
            }
            return m11constructorimpl(C4012E.b((short) i12));
        }
        if (i11 == 0 || i13 == 0) {
            return m11constructorimpl(C4012E.b((short) i10));
        }
        int i14 = -16;
        while (i11 < 1024) {
            i11 <<= 1;
            i14--;
        }
        while (i13 < 1024) {
            i13 <<= 1;
            i14--;
        }
        int iB = C4043z.b(C4043z.b((i11 & 1023) | RecognitionOptions.UPC_E) * C4043z.b(1024 | (i13 & 1023)));
        int iB2 = C4043z.b(iB >>> 21);
        int i15 = i14 + (i11 >> 10) + (i13 >> 10) + iB2;
        return i15 > 29 ? m11constructorimpl(C4012E.b((short) (i10 | 31744))) : i15 < -11 ? m11constructorimpl(C4012E.b((short) i10)) : HalfKt.m173fixedToHalfyOCu0fQ(i10, i15, C4043z.b(iB >>> iB2), C4043z.b(iB & iB2), 20);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m36toBitsimpl(short s10) {
        return s10 & 65535;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m37toByteimpl(short s10) {
        return (byte) HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m38toDoubleimpl(short s10) {
        return HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m39toFloatimpl(short s10) {
        return HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m40toHexStringimpl(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, C1821a.a(16));
                AbstractC4862t.d(string, "toString(...)");
                sb2.append(new o("0{2,}$").l(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, C1821a.a(16));
                AbstractC4862t.d(string2, "toString(...)");
                sb2.append(new o("0{2,}$").l(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        String string3 = sb2.toString();
        AbstractC4862t.d(string3, "toString(...)");
        return string3;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m41toIntimpl(short s10) {
        return (int) HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m42toLongimpl(short s10) {
        return (long) HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m43toShortimpl(short s10) {
        return (short) HalfKt.m175halfToShortxj2QHRw(s10);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m44toStringimpl(short s10) {
        return String.valueOf(m39toFloatimpl(s10));
    }

    /* JADX INFO: renamed from: unaryMinus-SjiOe_E, reason: not valid java name */
    public static final short m45unaryMinusSjiOe_E(short s10) {
        return m11constructorimpl(C4012E.b((short) ((s10 & 65535) ^ 32768)));
    }

    /* JADX INFO: renamed from: unaryPlus-SjiOe_E, reason: not valid java name */
    public static final short m46unaryPlusSjiOe_E(short s10) {
        return m11constructorimpl(s10);
    }

    /* JADX INFO: renamed from: withSign-5SPjhV8, reason: not valid java name */
    public static final short m47withSign5SPjhV8(short s10, short s11) {
        return m11constructorimpl(C4012E.b((short) ((s10 & Short.MAX_VALUE) | (s11 & Short.MIN_VALUE))));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Half half) {
        return m48compareToFqSqZzs(half.getV());
    }

    public boolean equals(Object obj) {
        return m14equalsimpl(this.v, obj);
    }

    public int hashCode() {
        return m21hashCodeimpl(this.v);
    }

    public String toString() {
        return m44toStringimpl(this.v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: compareTo-FqSqZzs, reason: not valid java name */
    public int m48compareToFqSqZzs(short s10) {
        return m10compareToFqSqZzs(this.v, s10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m11constructorimpl(short s10) {
        return s10;
    }
}
