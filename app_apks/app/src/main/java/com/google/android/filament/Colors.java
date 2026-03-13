package com.google.android.filament;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Colors {

    /* JADX INFO: renamed from: com.google.android.filament.Colors$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$Conversion;
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$RgbaType;

        static {
            int[] iArr = new int[Conversion.values().length];
            $SwitchMap$com$google$android$filament$Colors$Conversion = iArr;
            try {
                iArr[Conversion.ACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$Conversion[Conversion.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RgbaType.values().length];
            $SwitchMap$com$google$android$filament$Colors$RgbaType = iArr2;
            try {
                iArr2[RgbaType.SRGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_SRGB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Conversion {
        ACCURATE,
        FAST
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinearColor {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RgbType {
        SRGB,
        LINEAR
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RgbaType {
        SRGB,
        LINEAR,
        PREMULTIPLIED_SRGB,
        PREMULTIPLIED_LINEAR
    }

    private Colors() {
    }

    public static float[] cct(float f10) {
        float[] fArr = new float[3];
        nCct(f10, fArr);
        return fArr;
    }

    public static float[] illuminantD(float f10) {
        float[] fArr = new float[3];
        nIlluminantD(f10, fArr);
        return fArr;
    }

    private static native void nCct(float f10, float[] fArr);

    private static native void nIlluminantD(float f10, float[] fArr);

    public static float[] toLinear(RgbType rgbType, float f10, float f11, float f12) {
        return toLinear(rgbType, new float[]{f10, f11, f12});
    }

    public static float[] toLinear(RgbType rgbType, float[] fArr) {
        return rgbType == RgbType.LINEAR ? fArr : toLinear(Conversion.ACCURATE, fArr);
    }

    public static float[] toLinear(RgbaType rgbaType, float f10, float f11, float f12, float f13) {
        return toLinear(rgbaType, new float[]{f10, f11, f12, f13});
    }

    public static float[] toLinear(RgbaType rgbaType, float[] fArr) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$filament$Colors$RgbaType[rgbaType.ordinal()];
        if (i10 == 1) {
            toLinear(Conversion.ACCURATE, fArr);
        } else if (i10 != 2) {
            return i10 != 3 ? fArr : toLinear(Conversion.ACCURATE, fArr);
        }
        float f10 = fArr[3];
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        return fArr;
    }

    public static float[] toLinear(Conversion conversion, float[] fArr) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$filament$Colors$Conversion[conversion.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            while (i11 < 3) {
                float f10 = fArr[i11];
                fArr[i11] = f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
                i11++;
            }
        } else if (i10 == 2) {
            while (i11 < 3) {
                fArr[i11] = (float) Math.sqrt(fArr[i11]);
                i11++;
            }
        }
        return fArr;
    }
}
