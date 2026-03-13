package com.google.android.filament.utils;

import fc.C4012E;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001a(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a(\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u001b\u0010\u0014\u001a\u0011\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\b\u001a\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0086\b¢\u0006\u0004\b!\u0010\u0017\u001a\u0019\u0010\"\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\r\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006$"}, d2 = {"FPI", "", "HALF_PI", "TWO_PI", "FOUR_PI", "INV_PI", "INV_TWO_PI", "INV_FOUR_PI", "HALF_ONE", "Lcom/google/android/filament/utils/Half;", "getHALF_ONE", "()S", "S", "HALF_TWO", "getHALF_TWO", "clamp", "x", "min", "max", "clamp-rDq7ZDw", "(SSS)S", "saturate", "saturate-FqSqZzs", "(S)S", "mix", "a", "b", "mix-rDq7ZDw", "degrees", "v", "radians", "fract", "sqr", "sqr-FqSqZzs", "pow", "y", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ScalarKt {
    public static final float FOUR_PI = 12.566371f;
    public static final float FPI = 3.1415927f;
    public static final float HALF_PI = 1.5707964f;
    public static final float INV_FOUR_PI = 0.07957747f;
    public static final float INV_PI = 0.31830987f;
    public static final float INV_TWO_PI = 0.15915494f;
    public static final float TWO_PI = 6.2831855f;
    private static final short HALF_ONE = Half.m11constructorimpl(C4012E.b((short) 15360));
    private static final short HALF_TWO = Half.m11constructorimpl(C4012E.b((short) 16384));

    public static final float clamp(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    /* JADX INFO: renamed from: clamp-rDq7ZDw, reason: not valid java name */
    public static final short m181clamprDq7ZDw(short s10, short s11, short s12) {
        return Half.m10compareToFqSqZzs(s10, s11) < 0 ? s11 : Half.m10compareToFqSqZzs(s10, s12) > 0 ? s12 : s10;
    }

    public static final float degrees(float f10) {
        return f10 * 57.295776f;
    }

    public static final float fract(float f10) {
        return f10 % 1;
    }

    public static final short getHALF_ONE() {
        return HALF_ONE;
    }

    public static final short getHALF_TWO() {
        return HALF_TWO;
    }

    public static final float mix(float f10, float f11, float f12) {
        return (f10 * (1.0f - f12)) + (f11 * f12);
    }

    /* JADX INFO: renamed from: mix-rDq7ZDw, reason: not valid java name */
    public static final short m182mixrDq7ZDw(short s10, short s11, short s12) {
        return Half.m32plus5SPjhV8(Half.m35times5SPjhV8(s10, Half.m28minus5SPjhV8(getHALF_ONE(), s12)), Half.m35times5SPjhV8(s11, s12));
    }

    public static final float pow(float f10, float f11) {
        return (float) Math.pow(f10, f11);
    }

    public static final float radians(float f10) {
        return f10 * 0.017453292f;
    }

    public static final float saturate(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    /* JADX INFO: renamed from: saturate-FqSqZzs, reason: not valid java name */
    public static final short m183saturateFqSqZzs(short s10) {
        short sM60getPOSITIVE_ZEROSjiOe_E = Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E();
        short half_one = getHALF_ONE();
        return Half.m10compareToFqSqZzs(s10, sM60getPOSITIVE_ZEROSjiOe_E) < 0 ? sM60getPOSITIVE_ZEROSjiOe_E : Half.m10compareToFqSqZzs(s10, half_one) > 0 ? half_one : s10;
    }

    public static final float sqr(float f10) {
        return f10 * f10;
    }

    /* JADX INFO: renamed from: sqr-FqSqZzs, reason: not valid java name */
    public static final short m184sqrFqSqZzs(short s10) {
        return Half.m35times5SPjhV8(s10, s10);
    }
}
