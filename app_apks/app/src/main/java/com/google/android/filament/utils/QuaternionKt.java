package com.google.android.filament.utils;

import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n\u001a\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\b\u001a\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\b\u001a\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0086\b\u001a#\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0086\b\u001a#\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0086\b\u001a#\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0086\b\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0015\u0010\u0014\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0014\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0015\u0010\u0016\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0016\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0015\u0010\u0017\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0017\u001a\u00020\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0012H\u0086\f\u001a\u0011\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a\u000e\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u001f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u0016\u0010 \u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a(\u0010!\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0002\u001a\u001e\u0010$\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0002\u001a\u001e\u0010%\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0002\u001a\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)¨\u0006*"}, d2 = {IPTC.PREFIX_PLUS, "Lcom/google/android/filament/utils/Quaternion;", "", "q", "minus", "times", "div", "lessThan", "Lcom/google/android/filament/utils/Bool4;", "a", "b", "lessThanEqual", "greaterThan", "greaterThanEqual", "equal", "delta", "notEqual", "lt", "Lcom/google/android/filament/utils/Float4;", "lte", "gt", "gte", "eq", "neq", "abs", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "length2", "dot", "normalize", "conjugate", "inverse", "cross", "angle", "slerp", "t", "dotThreshold", "lerp", "nlerp", "eulerAngles", "Lcom/google/android/filament/utils/Float3;", "order", "Lcom/google/android/filament/utils/RotationsOrder;", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuaternionKt {
    public static final Quaternion abs(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(Math.abs(q10.getX()), Math.abs(q10.getY()), Math.abs(q10.getZ()), Math.abs(q10.getW()));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0037 A[PHI: r3
      0x0037: PHI (r3v10 float) = (r3v3 float), (r3v4 float) binds: [B:3:0x0035, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float angle(com.google.android.filament.utils.Quaternion r3, com.google.android.filament.utils.Quaternion r4) {
        /*
            java.lang.String r0 = "a"
            kotlin.jvm.internal.AbstractC4862t.e(r3, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.AbstractC4862t.e(r4, r0)
            float r0 = r3.getX()
            float r1 = r4.getX()
            float r0 = r0 * r1
            float r1 = r3.getY()
            float r2 = r4.getY()
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r3.getZ()
            float r2 = r4.getZ()
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r3 = r3.getW()
            float r4 = r4.getW()
            float r3 = r3 * r4
            float r0 = r0 + r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L39
        L37:
            r0 = r3
            goto L40
        L39:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L40
            goto L37
        L40:
            float r3 = java.lang.Math.abs(r0)
            double r3 = (double) r3
            double r3 = java.lang.Math.acos(r3)
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.utils.QuaternionKt.angle(com.google.android.filament.utils.Quaternion, com.google.android.filament.utils.Quaternion):float");
    }

    public static final Quaternion conjugate(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(-q10.getX(), -q10.getY(), -q10.getZ(), q10.getW());
    }

    public static final Quaternion cross(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Quaternion quaternion = new Quaternion((((a10.getW() * b10.getX()) + (a10.getX() * b10.getW())) + (a10.getY() * b10.getZ())) - (a10.getZ() * b10.getY()), ((a10.getW() * b10.getY()) - (a10.getX() * b10.getZ())) + (a10.getY() * b10.getW()) + (a10.getZ() * b10.getX()), (((a10.getW() * b10.getZ()) + (a10.getX() * b10.getY())) - (a10.getY() * b10.getX())) + (a10.getZ() * b10.getW()), (((a10.getW() * b10.getW()) - (a10.getX() * b10.getX())) - (a10.getY() * b10.getY())) - (a10.getZ() * b10.getZ()));
        return new Quaternion(quaternion.getX(), quaternion.getY(), quaternion.getZ(), 0.0f);
    }

    public static final Quaternion div(float f10, Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(f10 / q10.getX(), f10 / q10.getY(), f10 / q10.getZ(), f10 / q10.getW());
    }

    public static final float dot(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return (a10.getX() * b10.getX()) + (a10.getY() * b10.getY()) + (a10.getZ() * b10.getZ()) + (a10.getW() * b10.getW());
    }

    public static final Bool4 eq(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(quaternion.getX() == f10, quaternion.getY() == f10, quaternion.getZ() == f10, quaternion.getW() == f10);
    }

    public static final Bool4 equal(Quaternion a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(Math.abs(a10.getX() - f10) < f11, Math.abs(a10.getY() - f10) < f11, Math.abs(a10.getZ() - f10) < f11, Math.abs(a10.getW() - f10) < f11);
    }

    public static /* synthetic */ Bool4 equal$default(Quaternion a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        return new Bool4(Math.abs(a10.getX() - f10) < f11, Math.abs(a10.getY() - f10) < f11, Math.abs(a10.getZ() - f10) < f11, Math.abs(a10.getW() - f10) < f11);
    }

    public static final Float3 eulerAngles(Quaternion q10, RotationsOrder order) {
        AbstractC4862t.e(q10, "q");
        AbstractC4862t.e(order, "order");
        return MatrixKt.eulerAngles(MatrixKt.rotation(q10), order);
    }

    public static /* synthetic */ Float3 eulerAngles$default(Quaternion quaternion, RotationsOrder rotationsOrder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return eulerAngles(quaternion, rotationsOrder);
    }

    public static final Bool4 greaterThan(Quaternion a10, float f10) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(a10.getX() > f10, a10.getY() > f10, a10.getZ() > f10, a10.getW() > f10);
    }

    public static final Bool4 greaterThanEqual(Quaternion a10, float f10) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(a10.getX() >= f10, a10.getY() >= f10, a10.getZ() >= f10, a10.getW() >= f10);
    }

    public static final Bool4 gt(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(quaternion.getX() > f10, quaternion.getY() > f10, quaternion.getZ() > f10, quaternion.getW() > f10);
    }

    public static final Bool4 gte(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(quaternion.getX() >= f10, quaternion.getY() >= f10, quaternion.getZ() >= f10, quaternion.getW() >= f10);
    }

    public static final Quaternion inverse(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        float x10 = 1.0f / ((((q10.getX() * q10.getX()) + (q10.getY() * q10.getY())) + (q10.getZ() * q10.getZ())) + (q10.getW() * q10.getW()));
        return new Quaternion((-q10.getX()) * x10, (-q10.getY()) * x10, (-q10.getZ()) * x10, q10.getW() * x10);
    }

    public static final float length(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return (float) Math.sqrt((q10.getX() * q10.getX()) + (q10.getY() * q10.getY()) + (q10.getZ() * q10.getZ()) + (q10.getW() * q10.getW()));
    }

    public static final float length2(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return (q10.getX() * q10.getX()) + (q10.getY() * q10.getY()) + (q10.getZ() * q10.getZ()) + (q10.getW() * q10.getW());
    }

    public static final Quaternion lerp(Quaternion a10, Quaternion b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        float f11 = 1.0f - f10;
        Quaternion quaternion = new Quaternion(a10.getX() * f11, a10.getY() * f11, a10.getZ() * f11, f11 * a10.getW());
        Quaternion quaternion2 = new Quaternion(b10.getX() * f10, b10.getY() * f10, b10.getZ() * f10, f10 * b10.getW());
        return new Quaternion(quaternion.getX() + quaternion2.getX(), quaternion.getY() + quaternion2.getY(), quaternion.getZ() + quaternion2.getZ(), quaternion.getW() + quaternion2.getW());
    }

    public static final Bool4 lessThan(Quaternion a10, float f10) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(a10.getX() < f10, a10.getY() < f10, a10.getZ() < f10, a10.getW() < f10);
    }

    public static final Bool4 lessThanEqual(Quaternion a10, float f10) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(a10.getX() <= f10, a10.getY() <= f10, a10.getZ() <= f10, a10.getW() <= f10);
    }

    public static final Bool4 lt(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(quaternion.getX() < f10, quaternion.getY() < f10, quaternion.getZ() < f10, quaternion.getW() < f10);
    }

    public static final Bool4 lte(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(quaternion.getX() <= f10, quaternion.getY() <= f10, quaternion.getZ() <= f10, quaternion.getW() <= f10);
    }

    public static final Quaternion minus(float f10, Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(f10 - q10.getX(), f10 - q10.getY(), f10 - q10.getZ(), f10 - q10.getW());
    }

    public static final Bool4 neq(Quaternion quaternion, float f10) {
        AbstractC4862t.e(quaternion, "<this>");
        return new Bool4(!(quaternion.getX() == f10), !(quaternion.getY() == f10), !(quaternion.getZ() == f10), !(quaternion.getW() == f10));
    }

    public static final Quaternion nlerp(Quaternion a10, Quaternion b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return normalize(lerp(a10, b10, f10));
    }

    public static final Quaternion normalize(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        float fSqrt = 1.0f / ((float) Math.sqrt((((q10.getX() * q10.getX()) + (q10.getY() * q10.getY())) + (q10.getZ() * q10.getZ())) + (q10.getW() * q10.getW())));
        return new Quaternion(q10.getX() * fSqrt, q10.getY() * fSqrt, q10.getZ() * fSqrt, q10.getW() * fSqrt);
    }

    public static final Bool4 notEqual(Quaternion a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        return new Bool4(!(Math.abs(a10.getX() - f10) < f11), !(Math.abs(a10.getY() - f10) < f11), !(Math.abs(a10.getZ() - f10) < f11), !(Math.abs(a10.getW() - f10) < f11));
    }

    public static /* synthetic */ Bool4 notEqual$default(Quaternion a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        return new Bool4(!(Math.abs(a10.getX() - f10) < f11), !(Math.abs(a10.getY() - f10) < f11), !(Math.abs(a10.getZ() - f10) < f11), !(Math.abs(a10.getW() - f10) < f11));
    }

    public static final Quaternion plus(float f10, Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(q10.getX() + f10, q10.getY() + f10, q10.getZ() + f10, f10 + q10.getW());
    }

    public static final Quaternion slerp(Quaternion a10, Quaternion b10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        float x10 = (a10.getX() * b10.getX()) + (a10.getY() * b10.getY()) + (a10.getZ() * b10.getZ()) + (a10.getW() * b10.getW());
        if (x10 < 0.0f) {
            x10 = -x10;
            b10 = b10.unaryMinus();
        }
        if (x10 >= f11) {
            return nlerp(a10, b10, f10);
        }
        float fSin = (float) Math.sin((float) Math.acos(x10));
        float fSin2 = (float) Math.sin((1.0f - f10) * r9);
        Quaternion quaternion = new Quaternion(a10.getX() * fSin2, a10.getY() * fSin2, a10.getZ() * fSin2, a10.getW() * fSin2);
        Quaternion quaternion2 = new Quaternion(quaternion.getX() / fSin, quaternion.getY() / fSin, quaternion.getZ() / fSin, quaternion.getW() / fSin);
        float fSin3 = (float) Math.sin(f10 * r9);
        Quaternion quaternion3 = new Quaternion(b10.getX() * fSin3, b10.getY() * fSin3, b10.getZ() * fSin3, b10.getW() * fSin3);
        Quaternion quaternion4 = new Quaternion(quaternion3.getX() / fSin, quaternion3.getY() / fSin, quaternion3.getZ() / fSin, quaternion3.getW() / fSin);
        return new Quaternion(quaternion2.getX() + quaternion4.getX(), quaternion2.getY() + quaternion4.getY(), quaternion2.getZ() + quaternion4.getZ(), quaternion2.getW() + quaternion4.getW());
    }

    public static /* synthetic */ Quaternion slerp$default(Quaternion quaternion, Quaternion quaternion2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f11 = 0.9995f;
        }
        return slerp(quaternion, quaternion2, f10, f11);
    }

    public static final Quaternion times(float f10, Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(q10.getX() * f10, q10.getY() * f10, q10.getZ() * f10, f10 * q10.getW());
    }

    public static final Bool4 eq(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(quaternion.getX() == b10.getX(), quaternion.getY() == b10.getY(), quaternion.getZ() == b10.getZ(), quaternion.getW() == b10.getW());
    }

    public static final Bool4 gt(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(quaternion.getX() > b10.getX(), quaternion.getY() > b10.getY(), quaternion.getZ() > b10.getZ(), quaternion.getW() > b10.getW());
    }

    public static final Bool4 gte(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(quaternion.getX() >= b10.getX(), quaternion.getY() >= b10.getY(), quaternion.getZ() >= b10.getZ(), quaternion.getW() >= b10.getW());
    }

    public static final Bool4 lt(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(quaternion.getX() < b10.getX(), quaternion.getY() < b10.getY(), quaternion.getZ() < b10.getZ(), quaternion.getW() < b10.getW());
    }

    public static final Bool4 lte(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(quaternion.getX() <= b10.getX(), quaternion.getY() <= b10.getY(), quaternion.getZ() <= b10.getZ(), quaternion.getW() <= b10.getW());
    }

    public static final Bool4 neq(Quaternion quaternion, Float4 b10) {
        AbstractC4862t.e(quaternion, "<this>");
        AbstractC4862t.e(b10, "b");
        return new Bool4(!(quaternion.getX() == b10.getX()), !(quaternion.getY() == b10.getY()), !(quaternion.getZ() == b10.getZ()), !(quaternion.getW() == b10.getW()));
    }

    public static final Bool4 greaterThan(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(a10.getX() > b10.getY(), a10.getY() > b10.getY(), a10.getZ() > b10.getZ(), a10.getW() > b10.getW());
    }

    public static final Bool4 greaterThanEqual(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(a10.getX() >= b10.getX(), a10.getY() >= b10.getY(), a10.getZ() >= b10.getZ(), a10.getW() >= b10.getW());
    }

    public static final Bool4 lessThan(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(a10.getX() < b10.getX(), a10.getY() < b10.getY(), a10.getZ() < b10.getZ(), a10.getW() < b10.getW());
    }

    public static final Bool4 lessThanEqual(Quaternion a10, Quaternion b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(a10.getX() <= b10.getX(), a10.getY() <= b10.getY(), a10.getZ() <= b10.getZ(), a10.getW() <= b10.getW());
    }

    public static final Bool4 equal(Quaternion a10, Quaternion b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(Math.abs(a10.getX() - b10.getX()) < f10, Math.abs(a10.getY() - b10.getY()) < f10, Math.abs(a10.getZ() - b10.getZ()) < f10, Math.abs(a10.getW() - b10.getW()) < f10);
    }

    public static /* synthetic */ Bool4 equal$default(Quaternion a10, Quaternion b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(Math.abs(a10.getX() - b10.getX()) < f10, Math.abs(a10.getY() - b10.getY()) < f10, Math.abs(a10.getZ() - b10.getZ()) < f10, Math.abs(a10.getW() - b10.getW()) < f10);
    }

    public static final Bool4 notEqual(Quaternion a10, Quaternion b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(!(Math.abs(a10.getX() - b10.getX()) < f10), !(Math.abs(a10.getY() - b10.getY()) < f10), !(Math.abs(a10.getZ() - b10.getZ()) < f10), !(Math.abs(a10.getW() - b10.getW()) < f10));
    }

    public static /* synthetic */ Bool4 notEqual$default(Quaternion a10, Quaternion b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return new Bool4(!(Math.abs(a10.getX() - b10.getX()) < f10), !(Math.abs(a10.getY() - b10.getY()) < f10), !(Math.abs(a10.getZ() - b10.getZ()) < f10), !(Math.abs(a10.getW() - b10.getW()) < f10));
    }
}
