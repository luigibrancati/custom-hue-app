package com.google.android.filament.utils;

import fc.C4032o;
import io.sentry.ProfilingTraceData;
import io.sentry.metrics.MetricsUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a.\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0005\u001a\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000b\u001a\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a \u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u0011\u001a \u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u0011\u001a&\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005\u001a6\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005¨\u00061"}, d2 = {"equal", "Lcom/google/android/filament/utils/Bool2;", "a", "Lcom/google/android/filament/utils/Mat2;", "b", "", "delta", "notEqual", "Lcom/google/android/filament/utils/Bool3;", "Lcom/google/android/filament/utils/Mat3;", "Lcom/google/android/filament/utils/Bool4;", "Lcom/google/android/filament/utils/Mat4;", "transpose", "m", "inverse", "scale", "s", "Lcom/google/android/filament/utils/Float3;", "translation", "t", "rotation", "d", "order", "Lcom/google/android/filament/utils/RotationsOrder;", "yaw", "pitch", "roll", "axis", "angle", "quaternion", "Lcom/google/android/filament/utils/Quaternion;", "eulerAngles", ProfilingTraceData.TRUNCATION_REASON_NORMAL, "lookAt", "eye", "target", "up", "lookTowards", "forward", "perspective", "fov", MetricsUnit.Fraction.RATIO, "near", "far", "ortho", "l", "r", "n", "f", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MatrixKt {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RotationsOrder.values().length];
            try {
                iArr[RotationsOrder.XZY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RotationsOrder.XYZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RotationsOrder.YXZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RotationsOrder.YZX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RotationsOrder.ZYX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RotationsOrder.ZXY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Bool2 equal(Mat2 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float2 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11;
        Float2 y10 = a10.getY();
        if (Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11) {
            z10 = true;
        }
        return new Bool2(z11, z10);
    }

    public static /* synthetic */ Bool2 equal$default(Mat2 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float2 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11;
        Float2 y10 = a10.getY();
        if (Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11) {
            z10 = true;
        }
        return new Bool2(z11, z10);
    }

    public static final Float3 eulerAngles(Mat4 m10, RotationsOrder order) {
        AbstractC4862t.e(m10, "m");
        AbstractC4862t.e(order, "order");
        Float3 float3 = new Float3(0.0f, 0.0f, 0.0f, 7, null);
        float f10 = 1.0f;
        switch (WhenMappings.$EnumSwitchMapping$0[order.ordinal()]) {
            case 1:
                VectorComponent pitch = order.getPitch();
                float x10 = m10.getY().getX();
                if (x10 < -1.0f) {
                    f10 = -1.0f;
                } else if (x10 <= 1.0f) {
                    f10 = x10;
                }
                float3.set(pitch, (float) Math.asin(-f10));
                if (Math.abs(m10.getY().getX()) >= 0.9999999f) {
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getZ().getY(), m10.getZ().getZ()));
                    float3.set(order.getRoll(), 0.0f);
                } else {
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getY().getZ(), m10.getY().getY()));
                    float3.set(order.getRoll(), (float) Math.atan2(m10.getZ().getX(), m10.getX().getX()));
                }
                break;
            case 2:
                VectorComponent pitch2 = order.getPitch();
                float x11 = m10.getZ().getX();
                if (x11 < -1.0f) {
                    f10 = -1.0f;
                } else if (x11 <= 1.0f) {
                    f10 = x11;
                }
                float3.set(pitch2, (float) Math.asin(f10));
                if (Math.abs(m10.getZ().getX()) >= 0.9999999f) {
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getY().getZ(), m10.getY().getY()));
                    float3.set(order.getRoll(), 0.0f);
                } else {
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getZ().getY(), m10.getZ().getZ()));
                    float3.set(order.getRoll(), (float) Math.atan2(-m10.getY().getX(), m10.getX().getX()));
                }
                break;
            case 3:
                VectorComponent pitch3 = order.getPitch();
                float y10 = m10.getZ().getY();
                if (y10 < -1.0f) {
                    f10 = -1.0f;
                } else if (y10 <= 1.0f) {
                    f10 = y10;
                }
                float3.set(pitch3, (float) Math.asin(-f10));
                if (Math.abs(m10.getZ().getY()) >= 0.9999999f) {
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getX().getZ(), m10.getX().getX()));
                    float3.set(order.getRoll(), 0.0f);
                } else {
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getZ().getX(), m10.getZ().getZ()));
                    float3.set(order.getRoll(), (float) Math.atan2(m10.getX().getY(), m10.getY().getY()));
                }
                break;
            case 4:
                VectorComponent pitch4 = order.getPitch();
                float y11 = m10.getX().getY();
                if (y11 < -1.0f) {
                    f10 = -1.0f;
                } else if (y11 <= 1.0f) {
                    f10 = y11;
                }
                float3.set(pitch4, (float) Math.asin(f10));
                if (Math.abs(m10.getX().getY()) >= 0.9999999f) {
                    float3.set(order.getRoll(), 0.0f);
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getZ().getX(), m10.getZ().getZ()));
                } else {
                    float3.set(order.getRoll(), (float) Math.atan2(-m10.getZ().getY(), m10.getY().getY()));
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getX().getZ(), m10.getX().getX()));
                }
                break;
            case 5:
                VectorComponent pitch5 = order.getPitch();
                float z10 = m10.getX().getZ();
                if (z10 < -1.0f) {
                    f10 = -1.0f;
                } else if (z10 <= 1.0f) {
                    f10 = z10;
                }
                float3.set(pitch5, (float) Math.asin(-f10));
                if (Math.abs(m10.getX().getZ()) >= 0.9999999f) {
                    float3.set(order.getRoll(), 0.0f);
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getY().getX(), m10.getY().getY()));
                } else {
                    float3.set(order.getRoll(), (float) Math.atan2(m10.getY().getZ(), m10.getZ().getZ()));
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getX().getY(), m10.getX().getX()));
                }
                break;
            case 6:
                VectorComponent pitch6 = order.getPitch();
                float z11 = m10.getY().getZ();
                if (z11 < -1.0f) {
                    f10 = -1.0f;
                } else if (z11 <= 1.0f) {
                    f10 = z11;
                }
                float3.set(pitch6, (float) Math.asin(f10));
                if (Math.abs(m10.getY().getZ()) >= 0.9999999f) {
                    float3.set(order.getRoll(), 0.0f);
                    float3.set(order.getYaw(), (float) Math.atan2(m10.getX().getY(), m10.getX().getX()));
                } else {
                    float3.set(order.getRoll(), (float) Math.atan2(-m10.getX().getZ(), m10.getZ().getZ()));
                    float3.set(order.getYaw(), (float) Math.atan2(-m10.getY().getX(), m10.getY().getY()));
                }
                break;
            default:
                throw new C4032o();
        }
        Float3 float3Copy$default = Float3.copy$default(float3, 0.0f, 0.0f, 0.0f, 7, null);
        float3Copy$default.setX(float3Copy$default.getX() * 57.295776f);
        float3Copy$default.setY(float3Copy$default.getY() * 57.295776f);
        float3Copy$default.setZ(float3Copy$default.getZ() * 57.295776f);
        return float3Copy$default;
    }

    public static /* synthetic */ Float3 eulerAngles$default(Mat4 mat4, RotationsOrder rotationsOrder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return eulerAngles(mat4, rotationsOrder);
    }

    public static final Mat3 inverse(Mat3 m10) {
        AbstractC4862t.e(m10, "m");
        float x10 = m10.getX().getX();
        float y10 = m10.getX().getY();
        float z10 = m10.getX().getZ();
        float x11 = m10.getY().getX();
        float y11 = m10.getY().getY();
        float z11 = m10.getY().getZ();
        float x12 = m10.getZ().getX();
        float y12 = m10.getZ().getY();
        float z12 = m10.getZ().getZ();
        float f10 = (y11 * z12) - (z11 * y12);
        float f11 = (z11 * x12) - (x11 * z12);
        float f12 = (x11 * y12) - (y11 * x12);
        float f13 = (x10 * f10) + (y10 * f11) + (z10 * f12);
        return Mat3.INSTANCE.of(f10 / f13, f11 / f13, f12 / f13, ((z10 * y12) - (y10 * z12)) / f13, ((z12 * x10) - (z10 * x12)) / f13, ((x12 * y10) - (y12 * x10)) / f13, ((y10 * z11) - (z10 * y11)) / f13, ((z10 * x11) - (z11 * x10)) / f13, ((x10 * y11) - (y10 * x11)) / f13);
    }

    public static final Mat4 lookAt(Float3 eye, Float3 target, Float3 up) {
        AbstractC4862t.e(eye, "eye");
        AbstractC4862t.e(target, "target");
        AbstractC4862t.e(up, "up");
        return lookTowards(eye, new Float3(target.getX() - eye.getX(), target.getY() - eye.getY(), target.getZ() - eye.getZ()), up);
    }

    public static /* synthetic */ Mat4 lookAt$default(Float3 float3, Float3 float32, Float3 float33, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            float33 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookAt(float3, float32, float33);
    }

    public static final Mat4 lookTowards(Float3 eye, Float3 forward, Float3 up) {
        AbstractC4862t.e(eye, "eye");
        AbstractC4862t.e(forward, "forward");
        AbstractC4862t.e(up, "up");
        Float3 float3Normalize = VectorKt.normalize(forward);
        Float3 float3Normalize2 = VectorKt.normalize(new Float3((float3Normalize.getY() * up.getZ()) - (float3Normalize.getZ() * up.getY()), (float3Normalize.getZ() * up.getX()) - (float3Normalize.getX() * up.getZ()), (float3Normalize.getX() * up.getY()) - (float3Normalize.getY() * up.getX())));
        return new Mat4(new Float4(float3Normalize2, 0.0f, 2, (AbstractC4854k) null), new Float4(VectorKt.normalize(new Float3((float3Normalize2.getY() * float3Normalize.getZ()) - (float3Normalize2.getZ() * float3Normalize.getY()), (float3Normalize2.getZ() * float3Normalize.getX()) - (float3Normalize2.getX() * float3Normalize.getZ()), (float3Normalize2.getX() * float3Normalize.getY()) - (float3Normalize2.getY() * float3Normalize.getX()))), 0.0f, 2, (AbstractC4854k) null), new Float4(float3Normalize.unaryMinus(), 0.0f, 2, (AbstractC4854k) null), new Float4(eye, 1.0f));
    }

    public static /* synthetic */ Mat4 lookTowards$default(Float3 float3, Float3 float32, Float3 float33, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            float33 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookTowards(float3, float32, float33);
    }

    public static final Mat4 normal(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        Float4 x10 = m10.getX();
        Float3 float3 = new Float3(x10.getX(), x10.getY(), x10.getZ());
        float x11 = (float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ());
        Float4 y10 = m10.getY();
        Float3 float32 = new Float3(y10.getX(), y10.getY(), y10.getZ());
        float x12 = (float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ());
        Float4 z10 = m10.getZ();
        Float3 float33 = new Float3(z10.getX(), z10.getY(), z10.getZ());
        Float3 float34 = new Float3(x11, x12, (float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ()));
        return scale(new Float3(1.0f / float34.getX(), 1.0f / float34.getY(), 1.0f / float34.getZ())).times(m10);
    }

    public static final Bool2 notEqual(Mat2 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float2 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11);
        Float2 y10 = a10.getY();
        if (Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11) {
            z10 = true;
        }
        return new Bool2(z11, !z10);
    }

    public static /* synthetic */ Bool2 notEqual$default(Mat2 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float2 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11);
        Float2 y10 = a10.getY();
        if (Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11) {
            z10 = true;
        }
        return new Bool2(z11, !z10);
    }

    public static final Mat4 ortho(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 - f10;
        float f17 = f13 - f12;
        float f18 = f15 - f14;
        return new Mat4(new Float4(2.0f / f16, 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, 2.0f / f17, 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, (-2.0f) / f18, 0.0f, 11, null), new Float4((-(f11 + f10)) / f16, (-(f13 + f12)) / f17, (-(f15 + f14)) / f18, 1.0f));
    }

    public static final Mat4 perspective(float f10, float f11, float f12, float f13) {
        float fTan = 1.0f / ((float) Math.tan((f10 * 0.017453292f) * 0.5f));
        float f14 = f13 - f12;
        return new Mat4(new Float4(fTan / f11, 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, fTan, 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, (f13 + f12) / f14, 1.0f, 3, null), new Float4(0.0f, 0.0f, -(((f13 * 2.0f) * f12) / f14), 0.0f, 11, null));
    }

    public static final Quaternion quaternion(Mat4 m10) {
        Quaternion quaternion;
        AbstractC4862t.e(m10, "m");
        if (m10.getX().getX() + m10.getY().getY() + m10.getZ().getZ() > 0.0f) {
            float fSqrt = ((float) Math.sqrt(r0 + 1.0f)) * 2.0f;
            quaternion = new Quaternion((m10.getY().getZ() - m10.getZ().getY()) / fSqrt, (m10.getZ().getX() - m10.getX().getZ()) / fSqrt, (m10.getX().getY() - m10.getY().getX()) / fSqrt, fSqrt * 0.25f);
        } else if (m10.getX().getX() > m10.getY().getY() && m10.getX().getX() > m10.getZ().getZ()) {
            float fSqrt2 = ((float) Math.sqrt(((m10.getX().getX() + 1.0f) - m10.getY().getY()) - m10.getZ().getZ())) * 2.0f;
            quaternion = new Quaternion(0.25f * fSqrt2, (m10.getY().getX() + m10.getX().getY()) / fSqrt2, (m10.getZ().getX() + m10.getX().getZ()) / fSqrt2, (m10.getY().getZ() - m10.getZ().getY()) / fSqrt2);
        } else if (m10.getY().getY() > m10.getZ().getZ()) {
            float fSqrt3 = ((float) Math.sqrt(((m10.getY().getY() + 1.0f) - m10.getX().getX()) - m10.getZ().getZ())) * 2.0f;
            quaternion = new Quaternion((m10.getY().getX() + m10.getX().getY()) / fSqrt3, 0.25f * fSqrt3, (m10.getZ().getY() + m10.getY().getZ()) / fSqrt3, (m10.getZ().getX() - m10.getX().getZ()) / fSqrt3);
        } else {
            float fSqrt4 = ((float) Math.sqrt(((m10.getZ().getZ() + 1.0f) - m10.getX().getX()) - m10.getY().getY())) * 2.0f;
            quaternion = new Quaternion((m10.getZ().getX() + m10.getX().getZ()) / fSqrt4, (m10.getZ().getY() + m10.getY().getZ()) / fSqrt4, 0.25f * fSqrt4, (m10.getX().getY() - m10.getY().getX()) / fSqrt4);
        }
        return QuaternionKt.normalize(quaternion);
    }

    public static final Mat4 rotation(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        Float4 x10 = m10.getX();
        Float3 float3Normalize = VectorKt.normalize(new Float3(x10.getX(), x10.getY(), x10.getZ()));
        Float4 y10 = m10.getY();
        Float3 float3Normalize2 = VectorKt.normalize(new Float3(y10.getX(), y10.getY(), y10.getZ()));
        Float4 z10 = m10.getZ();
        return new Mat4(float3Normalize, float3Normalize2, VectorKt.normalize(new Float3(z10.getX(), z10.getY(), z10.getZ())), (Float3) null, 8, (AbstractC4854k) null);
    }

    public static /* synthetic */ Mat4 rotation$default(Float3 float3, RotationsOrder rotationsOrder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return rotation(float3, rotationsOrder);
    }

    public static final Mat4 scale(Float3 s10) {
        AbstractC4862t.e(s10, "s");
        return new Mat4(new Float4(s10.getX(), 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, s10.getY(), 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, s10.getZ(), 0.0f, 11, null), (Float4) null, 8, (AbstractC4854k) null);
    }

    public static final Mat4 translation(Float3 t10) {
        AbstractC4862t.e(t10, "t");
        return new Mat4((Float4) null, (Float4) null, (Float4) null, new Float4(t10, 1.0f), 7, (AbstractC4854k) null);
    }

    public static final Mat2 transpose(Mat2 m10) {
        AbstractC4862t.e(m10, "m");
        return new Mat2(new Float2(m10.getX().getX(), m10.getY().getX()), new Float2(m10.getX().getY(), m10.getY().getY()));
    }

    public static /* synthetic */ Mat4 rotation$default(float f10, float f11, float f12, RotationsOrder rotationsOrder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return rotation(f10, f11, f12, rotationsOrder);
    }

    public static final Mat4 scale(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        Float4 x10 = m10.getX();
        Float3 float3 = new Float3(x10.getX(), x10.getY(), x10.getZ());
        float fSqrt = (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
        Float4 y10 = m10.getY();
        Float3 float32 = new Float3(y10.getX(), y10.getY(), y10.getZ());
        float fSqrt2 = (float) Math.sqrt((float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ()));
        Float4 z10 = m10.getZ();
        Float3 float33 = new Float3(z10.getX(), z10.getY(), z10.getZ());
        return scale(new Float3(fSqrt, fSqrt2, (float) Math.sqrt((float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ()))));
    }

    public static final Mat4 translation(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        Float4 w10 = m10.getW();
        return translation(new Float3(w10.getX(), w10.getY(), w10.getZ()));
    }

    public static final Mat3 transpose(Mat3 m10) {
        AbstractC4862t.e(m10, "m");
        return new Mat3(new Float3(m10.getX().getX(), m10.getY().getX(), m10.getZ().getX()), new Float3(m10.getX().getY(), m10.getY().getY(), m10.getZ().getY()), new Float3(m10.getX().getZ(), m10.getY().getZ(), m10.getZ().getZ()));
    }

    public static final Mat4 transpose(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        return new Mat4(new Float4(m10.getX().getX(), m10.getY().getX(), m10.getZ().getX(), m10.getW().getX()), new Float4(m10.getX().getY(), m10.getY().getY(), m10.getZ().getY(), m10.getW().getY()), new Float4(m10.getX().getZ(), m10.getY().getZ(), m10.getZ().getZ(), m10.getW().getZ()), new Float4(m10.getX().getW(), m10.getY().getW(), m10.getZ().getW(), m10.getW().getW()));
    }

    public static final Mat4 rotation(float f10, float f11, float f12, RotationsOrder order) {
        AbstractC4862t.e(order, "order");
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        double d11 = f11;
        float fCos2 = (float) Math.cos(d11);
        float fSin2 = (float) Math.sin(d11);
        double d12 = f12;
        float fCos3 = (float) Math.cos(d12);
        float fSin3 = (float) Math.sin(d12);
        switch (WhenMappings.$EnumSwitchMapping$0[order.ordinal()]) {
            case 1:
                float f13 = fCos * fCos3;
                float f14 = fCos3 * fSin;
                return Mat4.INSTANCE.of(fCos2 * fCos3, -fSin2, fCos2 * fSin3, 0.0f, (fSin * fSin3) + (f13 * fSin2), fCos * fCos2, ((fCos * fSin2) * fSin3) - f14, 0.0f, (f14 * fSin2) - (fCos * fSin3), fCos2 * fSin, f13 + (fSin * fSin2 * fSin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 2:
                float f15 = -fCos2;
                float f16 = fCos3 * fSin;
                float f17 = fCos3 * fCos;
                return Mat4.INSTANCE.of(fCos2 * fCos3, f15 * fSin3, fSin2, 0.0f, (fCos * fSin3) + (f16 * fSin2), f17 - ((fSin * fSin2) * fSin3), f15 * fSin, 0.0f, (fSin * fSin3) - (f17 * fSin2), f16 + (fCos * fSin2 * fSin3), fCos * fCos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 3:
                float f18 = fCos * fCos3;
                float f19 = fCos3 * fSin;
                return Mat4.INSTANCE.of(f18 + (fSin * fSin2 * fSin3), (f19 * fSin2) - (fCos * fSin3), fCos2 * fSin, 0.0f, fCos2 * fSin3, fCos3 * fCos2, -fSin2, 0.0f, ((fCos * fSin2) * fSin3) - f19, (f18 * fSin2) + (fSin * fSin3), fCos * fCos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 4:
                float f20 = fCos * fCos3;
                float f21 = fCos3 * fSin;
                float f22 = fCos3 * fCos2;
                float f23 = -fCos2;
                return Mat4.INSTANCE.of(fCos * fCos2, (fSin * fSin3) - (f20 * fSin2), f21 + (fCos * fSin2 * fSin3), 0.0f, fSin2, f22, f23 * fSin3, 0.0f, f23 * fSin, (fCos * fSin3) + (f21 * fSin2), f20 - ((fSin * fSin2) * fSin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 5:
                float f24 = fCos3 * fSin;
                float f25 = fCos * fCos3;
                return Mat4.INSTANCE.of(fCos * fCos2, ((fCos * fSin2) * fSin3) - f24, (fSin * fSin3) + (f25 * fSin2), 0.0f, fCos2 * fSin, f25 + (fSin * fSin2 * fSin3), (f24 * fSin2) - (fCos * fSin3), 0.0f, -fSin2, fSin3 * fCos2, fCos2 * fCos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 6:
                float f26 = fCos * fCos3;
                float f27 = -fCos2;
                float f28 = fCos3 * fSin;
                return Mat4.INSTANCE.of(f26 - ((fSin * fSin2) * fSin3), f27 * fSin, (fCos * fSin3) + (f28 * fSin2), 0.0f, f28 + (fCos * fSin2 * fSin3), fCos * fCos2, (fSin * fSin3) - (f26 * fSin2), 0.0f, f27 * fSin3, fSin2, fCos2 * fCos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            default:
                throw new C4032o();
        }
    }

    public static final Bool2 equal(Mat2 a10, Mat2 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float2 x10 = a10.getX();
        Float2 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10;
        Float2 y10 = a10.getY();
        Float2 y11 = b10.getY();
        if (Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10) {
            z10 = true;
        }
        return new Bool2(z11, z10);
    }

    public static /* synthetic */ Bool2 equal$default(Mat2 a10, Mat2 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float2 x10 = a10.getX();
        Float2 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10;
        Float2 y10 = a10.getY();
        Float2 y11 = b10.getY();
        if (Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10) {
            z10 = true;
        }
        return new Bool2(z11, z10);
    }

    public static final Mat4 inverse(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        Mat4 mat4 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (AbstractC4854k) null);
        float z10 = m10.getZ().getZ() * m10.getW().getW();
        float z11 = m10.getW().getZ() * m10.getZ().getW();
        float z12 = m10.getY().getZ() * m10.getW().getW();
        float z13 = m10.getW().getZ() * m10.getY().getW();
        float z14 = m10.getY().getZ() * m10.getZ().getW();
        float z15 = m10.getZ().getZ() * m10.getY().getW();
        float z16 = m10.getX().getZ() * m10.getW().getW();
        float z17 = m10.getW().getZ() * m10.getX().getW();
        float z18 = m10.getX().getZ() * m10.getZ().getW();
        float z19 = m10.getZ().getZ() * m10.getX().getW();
        float z20 = m10.getX().getZ() * m10.getY().getW();
        float z21 = m10.getY().getZ() * m10.getX().getW();
        mat4.getX().setX((m10.getY().getY() * z10) + (m10.getZ().getY() * z13) + (m10.getW().getY() * z14));
        Float4 x10 = mat4.getX();
        x10.setX(x10.getX() - (((m10.getY().getY() * z11) + (m10.getZ().getY() * z12)) + (m10.getW().getY() * z15)));
        mat4.getX().setY((m10.getX().getY() * z11) + (m10.getZ().getY() * z16) + (m10.getW().getY() * z19));
        Float4 x11 = mat4.getX();
        x11.setY(x11.getY() - (((m10.getX().getY() * z10) + (m10.getZ().getY() * z17)) + (m10.getW().getY() * z18)));
        mat4.getX().setZ((m10.getX().getY() * z12) + (m10.getY().getY() * z17) + (m10.getW().getY() * z20));
        Float4 x12 = mat4.getX();
        x12.setZ(x12.getZ() - (((m10.getX().getY() * z13) + (m10.getY().getY() * z16)) + (m10.getW().getY() * z21)));
        mat4.getX().setW((m10.getX().getY() * z15) + (m10.getY().getY() * z18) + (m10.getZ().getY() * z21));
        Float4 x13 = mat4.getX();
        x13.setW(x13.getW() - (((m10.getX().getY() * z14) + (m10.getY().getY() * z19)) + (m10.getZ().getY() * z20)));
        mat4.getY().setX((m10.getY().getX() * z11) + (m10.getZ().getX() * z12) + (m10.getW().getX() * z15));
        Float4 y10 = mat4.getY();
        y10.setX(y10.getX() - (((m10.getY().getX() * z10) + (m10.getZ().getX() * z13)) + (m10.getW().getX() * z14)));
        mat4.getY().setY((z10 * m10.getX().getX()) + (m10.getZ().getX() * z17) + (m10.getW().getX() * z18));
        Float4 y11 = mat4.getY();
        y11.setY(y11.getY() - (((z11 * m10.getX().getX()) + (m10.getZ().getX() * z16)) + (m10.getW().getX() * z19)));
        mat4.getY().setZ((z13 * m10.getX().getX()) + (z16 * m10.getY().getX()) + (m10.getW().getX() * z21));
        Float4 y12 = mat4.getY();
        y12.setZ(y12.getZ() - (((z12 * m10.getX().getX()) + (z17 * m10.getY().getX())) + (m10.getW().getX() * z20)));
        mat4.getY().setW((z14 * m10.getX().getX()) + (z19 * m10.getY().getX()) + (z20 * m10.getZ().getX()));
        Float4 y13 = mat4.getY();
        y13.setW(y13.getW() - (((z15 * m10.getX().getX()) + (z18 * m10.getY().getX())) + (z21 * m10.getZ().getX())));
        float x14 = m10.getZ().getX() * m10.getW().getY();
        float x15 = m10.getW().getX() * m10.getZ().getY();
        float x16 = m10.getY().getX() * m10.getW().getY();
        float x17 = m10.getW().getX() * m10.getY().getY();
        float x18 = m10.getY().getX() * m10.getZ().getY();
        float x19 = m10.getZ().getX() * m10.getY().getY();
        float x20 = m10.getX().getX() * m10.getW().getY();
        float x21 = m10.getW().getX() * m10.getX().getY();
        float x22 = m10.getX().getX() * m10.getZ().getY();
        float x23 = m10.getZ().getX() * m10.getX().getY();
        float x24 = m10.getX().getX() * m10.getY().getY();
        float x25 = m10.getY().getX() * m10.getX().getY();
        mat4.getZ().setX((m10.getY().getW() * x14) + (m10.getZ().getW() * x17) + (m10.getW().getW() * x18));
        Float4 z22 = mat4.getZ();
        z22.setX(z22.getX() - (((m10.getY().getW() * x15) + (m10.getZ().getW() * x16)) + (m10.getW().getW() * x19)));
        mat4.getZ().setY((m10.getX().getW() * x15) + (m10.getZ().getW() * x20) + (m10.getW().getW() * x23));
        Float4 z23 = mat4.getZ();
        z23.setY(z23.getY() - (((m10.getX().getW() * x14) + (m10.getZ().getW() * x21)) + (m10.getW().getW() * x22)));
        mat4.getZ().setZ((m10.getX().getW() * x16) + (m10.getY().getW() * x21) + (m10.getW().getW() * x24));
        Float4 z24 = mat4.getZ();
        z24.setZ(z24.getZ() - (((m10.getX().getW() * x17) + (m10.getY().getW() * x20)) + (m10.getW().getW() * x25)));
        mat4.getZ().setW((m10.getX().getW() * x19) + (m10.getY().getW() * x22) + (m10.getZ().getW() * x25));
        Float4 z25 = mat4.getZ();
        z25.setW(z25.getW() - (((m10.getX().getW() * x18) + (m10.getY().getW() * x23)) + (m10.getZ().getW() * x24)));
        mat4.getW().setX((m10.getZ().getZ() * x16) + (m10.getW().getZ() * x19) + (m10.getY().getZ() * x15));
        Float4 w10 = mat4.getW();
        w10.setX(w10.getX() - (((m10.getW().getZ() * x18) + (m10.getY().getZ() * x14)) + (m10.getZ().getZ() * x17)));
        mat4.getW().setY((m10.getW().getZ() * x22) + (x14 * m10.getX().getZ()) + (m10.getZ().getZ() * x21));
        Float4 w11 = mat4.getW();
        w11.setY(w11.getY() - (((m10.getZ().getZ() * x20) + (m10.getW().getZ() * x23)) + (x15 * m10.getX().getZ())));
        mat4.getW().setZ((x20 * m10.getY().getZ()) + (m10.getW().getZ() * x25) + (x17 * m10.getX().getZ()));
        Float4 w12 = mat4.getW();
        w12.setZ(w12.getZ() - (((m10.getW().getZ() * x24) + (x16 * m10.getX().getZ())) + (x21 * m10.getY().getZ())));
        mat4.getW().setW((x24 * m10.getZ().getZ()) + (x18 * m10.getX().getZ()) + (x23 * m10.getY().getZ()));
        Float4 w13 = mat4.getW();
        w13.setW(w13.getW() - (((x22 * m10.getY().getZ()) + (x25 * m10.getZ().getZ())) + (x19 * m10.getX().getZ())));
        return mat4.div((m10.getX().getX() * mat4.getX().getX()) + (m10.getY().getX() * mat4.getX().getY()) + (m10.getZ().getX() * mat4.getX().getZ()) + (m10.getW().getX() * mat4.getX().getW()));
    }

    public static final Bool2 notEqual(Mat2 a10, Mat2 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float2 x10 = a10.getX();
        Float2 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10);
        Float2 y10 = a10.getY();
        Float2 y11 = b10.getY();
        if (Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10) {
            z10 = true;
        }
        return new Bool2(z11, !z10);
    }

    public static /* synthetic */ Bool2 notEqual$default(Mat2 a10, Mat2 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float2 x10 = a10.getX();
        Float2 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10);
        Float2 y10 = a10.getY();
        Float2 y11 = b10.getY();
        if (Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10) {
            z10 = true;
        }
        return new Bool2(z11, !z10);
    }

    public static final Bool3 equal(Mat3 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float3 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11;
        Float3 y10 = a10.getY();
        boolean z12 = Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11;
        Float3 z13 = a10.getZ();
        if (Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11) {
            z10 = true;
        }
        return new Bool3(z11, z12, z10);
    }

    public static /* synthetic */ Bool3 equal$default(Mat3 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float3 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11;
        Float3 y10 = a10.getY();
        boolean z12 = Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11;
        Float3 z13 = a10.getZ();
        if (Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11) {
            z10 = true;
        }
        return new Bool3(z11, z12, z10);
    }

    public static final Bool3 notEqual(Mat3 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float3 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11);
        Float3 y10 = a10.getY();
        boolean z12 = !(Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11);
        Float3 z13 = a10.getZ();
        if (Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11) {
            z10 = true;
        }
        return new Bool3(z11, z12, !z10);
    }

    public static /* synthetic */ Bool3 notEqual$default(Mat3 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float3 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11);
        Float3 y10 = a10.getY();
        boolean z12 = !(Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11);
        Float3 z13 = a10.getZ();
        if (Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11) {
            z10 = true;
        }
        return new Bool3(z11, z12, !z10);
    }

    public static final Mat4 rotation(Float3 axis, float f10) {
        AbstractC4862t.e(axis, "axis");
        float x10 = axis.getX();
        float y10 = axis.getY();
        float z10 = axis.getZ();
        double d10 = f10 * 0.017453292f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = 1.0f - fCos;
        float f12 = x10 * y10 * f11;
        float f13 = z10 * fSin;
        float f14 = x10 * z10 * f11;
        float f15 = y10 * fSin;
        float f16 = f12 + f13;
        float f17 = (y10 * y10 * f11) + fCos;
        float f18 = y10 * z10 * f11;
        float f19 = x10 * fSin;
        return Mat4.INSTANCE.of((x10 * x10 * f11) + fCos, f12 - f13, f14 + f15, 0.0f, f16, f17, f18 - f19, 0.0f, f14 - f15, f18 + f19, (z10 * z10 * f11) + fCos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static final Mat4 rotation(Quaternion quaternion) {
        AbstractC4862t.e(quaternion, "quaternion");
        Quaternion quaternionNormalize = QuaternionKt.normalize(quaternion);
        return new Mat4(new Float4(1.0f - (((quaternionNormalize.getY() * quaternionNormalize.getY()) + (quaternionNormalize.getZ() * quaternionNormalize.getZ())) * 2.0f), ((quaternionNormalize.getX() * quaternionNormalize.getY()) + (quaternionNormalize.getZ() * quaternionNormalize.getW())) * 2.0f, ((quaternionNormalize.getX() * quaternionNormalize.getZ()) - (quaternionNormalize.getY() * quaternionNormalize.getW())) * 2.0f, 0.0f, 8, null), new Float4(((quaternionNormalize.getX() * quaternionNormalize.getY()) - (quaternionNormalize.getZ() * quaternionNormalize.getW())) * 2.0f, 1.0f - (((quaternionNormalize.getX() * quaternionNormalize.getX()) + (quaternionNormalize.getZ() * quaternionNormalize.getZ())) * 2.0f), ((quaternionNormalize.getY() * quaternionNormalize.getZ()) + (quaternionNormalize.getX() * quaternionNormalize.getW())) * 2.0f, 0.0f, 8, null), new Float4(((quaternionNormalize.getX() * quaternionNormalize.getZ()) + (quaternionNormalize.getY() * quaternionNormalize.getW())) * 2.0f, ((quaternionNormalize.getY() * quaternionNormalize.getZ()) - (quaternionNormalize.getX() * quaternionNormalize.getW())) * 2.0f, 1.0f - (((quaternionNormalize.getX() * quaternionNormalize.getX()) + (quaternionNormalize.getY() * quaternionNormalize.getY())) * 2.0f), 0.0f, 8, null), (Float4) null, 8, (AbstractC4854k) null);
    }

    public static final Bool3 equal(Mat3 a10, Mat3 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float3 x10 = a10.getX();
        Float3 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10;
        Float3 y10 = a10.getY();
        Float3 y11 = b10.getY();
        boolean z12 = Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10;
        Float3 z13 = a10.getZ();
        Float3 z14 = b10.getZ();
        if (Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10) {
            z10 = true;
        }
        return new Bool3(z11, z12, z10);
    }

    public static /* synthetic */ Bool3 equal$default(Mat3 a10, Mat3 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float3 x10 = a10.getX();
        Float3 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10;
        Float3 y10 = a10.getY();
        Float3 y11 = b10.getY();
        boolean z12 = Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10;
        Float3 z13 = a10.getZ();
        Float3 z14 = b10.getZ();
        if (Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10) {
            z10 = true;
        }
        return new Bool3(z11, z12, z10);
    }

    public static final Bool3 notEqual(Mat3 a10, Mat3 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float3 x10 = a10.getX();
        Float3 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10);
        Float3 y10 = a10.getY();
        Float3 y11 = b10.getY();
        boolean z12 = !(Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10);
        Float3 z13 = a10.getZ();
        Float3 z14 = b10.getZ();
        if (Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10) {
            z10 = true;
        }
        return new Bool3(z11, z12, !z10);
    }

    public static /* synthetic */ Bool3 notEqual$default(Mat3 a10, Mat3 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float3 x10 = a10.getX();
        Float3 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10);
        Float3 y10 = a10.getY();
        Float3 y11 = b10.getY();
        boolean z12 = !(Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10);
        Float3 z13 = a10.getZ();
        Float3 z14 = b10.getZ();
        if (Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10) {
            z10 = true;
        }
        return new Bool3(z11, z12, !z10);
    }

    public static final Mat4 rotation(Float3 d10, RotationsOrder order) {
        AbstractC4862t.e(d10, "d");
        AbstractC4862t.e(order, "order");
        Float3 float3Copy$default = Float3.copy$default(d10, 0.0f, 0.0f, 0.0f, 7, null);
        float3Copy$default.setX(float3Copy$default.getX() * 0.017453292f);
        float3Copy$default.setY(float3Copy$default.getY() * 0.017453292f);
        float3Copy$default.setZ(float3Copy$default.getZ() * 0.017453292f);
        return rotation(float3Copy$default.get(order.getYaw()), float3Copy$default.get(order.getPitch()), float3Copy$default.get(order.getRoll()), order);
    }

    public static final Bool4 equal(Mat4 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float4 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11 && Math.abs(x10.getW() - f10) < f11;
        Float4 y10 = a10.getY();
        boolean z12 = Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11 && Math.abs(y10.getW() - f10) < f11;
        Float4 z13 = a10.getZ();
        boolean z14 = Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11 && Math.abs(z13.getW() - f10) < f11;
        Float4 w10 = a10.getW();
        if (Math.abs(w10.getX() - f10) < f11 && Math.abs(w10.getY() - f10) < f11 && Math.abs(w10.getZ() - f10) < f11 && Math.abs(w10.getW() - f10) < f11) {
            z10 = true;
        }
        return new Bool4(z11, z12, z14, z10);
    }

    public static /* synthetic */ Bool4 equal$default(Mat4 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float4 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11 && Math.abs(x10.getW() - f10) < f11;
        Float4 y10 = a10.getY();
        boolean z12 = Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11 && Math.abs(y10.getW() - f10) < f11;
        Float4 z13 = a10.getZ();
        boolean z14 = Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11 && Math.abs(z13.getW() - f10) < f11;
        Float4 w10 = a10.getW();
        if (Math.abs(w10.getX() - f10) < f11 && Math.abs(w10.getY() - f10) < f11 && Math.abs(w10.getZ() - f10) < f11 && Math.abs(w10.getW() - f10) < f11) {
            z10 = true;
        }
        return new Bool4(z11, z12, z14, z10);
    }

    public static final Bool4 notEqual(Mat4 a10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        Float4 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11 && Math.abs(x10.getW() - f10) < f11);
        Float4 y10 = a10.getY();
        boolean z12 = !(Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11 && Math.abs(y10.getW() - f10) < f11);
        Float4 z13 = a10.getZ();
        boolean z14 = !(Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11 && Math.abs(z13.getW() - f10) < f11);
        Float4 w10 = a10.getW();
        if (Math.abs(w10.getX() - f10) < f11 && Math.abs(w10.getY() - f10) < f11 && Math.abs(w10.getZ() - f10) < f11 && Math.abs(w10.getW() - f10) < f11) {
            z10 = true;
        }
        return new Bool4(z11, z12, z14, !z10);
    }

    public static /* synthetic */ Bool4 notEqual$default(Mat4 a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        Float4 x10 = a10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - f10) < f11 && Math.abs(x10.getY() - f10) < f11 && Math.abs(x10.getZ() - f10) < f11 && Math.abs(x10.getW() - f10) < f11);
        Float4 y10 = a10.getY();
        boolean z12 = !(Math.abs(y10.getX() - f10) < f11 && Math.abs(y10.getY() - f10) < f11 && Math.abs(y10.getZ() - f10) < f11 && Math.abs(y10.getW() - f10) < f11);
        Float4 z13 = a10.getZ();
        boolean z14 = !(Math.abs(z13.getX() - f10) < f11 && Math.abs(z13.getY() - f10) < f11 && Math.abs(z13.getZ() - f10) < f11 && Math.abs(z13.getW() - f10) < f11);
        Float4 w10 = a10.getW();
        if (Math.abs(w10.getX() - f10) < f11 && Math.abs(w10.getY() - f10) < f11 && Math.abs(w10.getZ() - f10) < f11 && Math.abs(w10.getW() - f10) < f11) {
            z10 = true;
        }
        return new Bool4(z11, z12, z14, !z10);
    }

    public static final Bool4 equal(Mat4 a10, Mat4 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float4 x10 = a10.getX();
        Float4 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10 && Math.abs(x10.getW() - x11.getW()) < f10;
        Float4 y10 = a10.getY();
        Float4 y11 = b10.getY();
        boolean z12 = Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10 && Math.abs(y10.getW() - y11.getW()) < f10;
        Float4 z13 = a10.getZ();
        Float4 z14 = b10.getZ();
        boolean z15 = Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10 && Math.abs(z13.getW() - z14.getW()) < f10;
        Float4 w10 = a10.getW();
        Float4 w11 = b10.getW();
        if (Math.abs(w10.getX() - w11.getX()) < f10 && Math.abs(w10.getY() - w11.getY()) < f10 && Math.abs(w10.getZ() - w11.getZ()) < f10 && Math.abs(w10.getW() - w11.getW()) < f10) {
            z10 = true;
        }
        return new Bool4(z11, z12, z15, z10);
    }

    public static /* synthetic */ Bool4 equal$default(Mat4 a10, Mat4 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float4 x10 = a10.getX();
        Float4 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10 && Math.abs(x10.getW() - x11.getW()) < f10;
        Float4 y10 = a10.getY();
        Float4 y11 = b10.getY();
        boolean z12 = Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10 && Math.abs(y10.getW() - y11.getW()) < f10;
        Float4 z13 = a10.getZ();
        Float4 z14 = b10.getZ();
        boolean z15 = Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10 && Math.abs(z13.getW() - z14.getW()) < f10;
        Float4 w10 = a10.getW();
        Float4 w11 = b10.getW();
        if (Math.abs(w10.getX() - w11.getX()) < f10 && Math.abs(w10.getY() - w11.getY()) < f10 && Math.abs(w10.getZ() - w11.getZ()) < f10 && Math.abs(w10.getW() - w11.getW()) < f10) {
            z10 = true;
        }
        return new Bool4(z11, z12, z15, z10);
    }

    public static final Bool4 notEqual(Mat4 a10, Mat4 b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float4 x10 = a10.getX();
        Float4 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10 && Math.abs(x10.getW() - x11.getW()) < f10);
        Float4 y10 = a10.getY();
        Float4 y11 = b10.getY();
        boolean z12 = !(Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10 && Math.abs(y10.getW() - y11.getW()) < f10);
        Float4 z13 = a10.getZ();
        Float4 z14 = b10.getZ();
        boolean z15 = !(Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10 && Math.abs(z13.getW() - z14.getW()) < f10);
        Float4 w10 = a10.getW();
        Float4 w11 = b10.getW();
        if (Math.abs(w10.getX() - w11.getX()) < f10 && Math.abs(w10.getY() - w11.getY()) < f10 && Math.abs(w10.getZ() - w11.getZ()) < f10 && Math.abs(w10.getW() - w11.getW()) < f10) {
            z10 = true;
        }
        return new Bool4(z11, z12, z15, !z10);
    }

    public static /* synthetic */ Bool4 notEqual$default(Mat4 a10, Mat4 b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Float4 x10 = a10.getX();
        Float4 x11 = b10.getX();
        boolean z10 = false;
        boolean z11 = !(Math.abs(x10.getX() - x11.getX()) < f10 && Math.abs(x10.getY() - x11.getY()) < f10 && Math.abs(x10.getZ() - x11.getZ()) < f10 && Math.abs(x10.getW() - x11.getW()) < f10);
        Float4 y10 = a10.getY();
        Float4 y11 = b10.getY();
        boolean z12 = !(Math.abs(y10.getX() - y11.getX()) < f10 && Math.abs(y10.getY() - y11.getY()) < f10 && Math.abs(y10.getZ() - y11.getZ()) < f10 && Math.abs(y10.getW() - y11.getW()) < f10);
        Float4 z13 = a10.getZ();
        Float4 z14 = b10.getZ();
        boolean z15 = !(Math.abs(z13.getX() - z14.getX()) < f10 && Math.abs(z13.getY() - z14.getY()) < f10 && Math.abs(z13.getZ() - z14.getZ()) < f10 && Math.abs(z13.getW() - z14.getW()) < f10);
        Float4 w10 = a10.getW();
        Float4 w11 = b10.getW();
        if (Math.abs(w10.getX() - w11.getX()) < f10 && Math.abs(w10.getY() - w11.getY()) < f10 && Math.abs(w10.getZ() - w11.getZ()) < f10 && Math.abs(w10.getW() - w11.getW()) < f10) {
            z10 = true;
        }
        return new Bool4(z11, z12, z15, !z10);
    }
}
