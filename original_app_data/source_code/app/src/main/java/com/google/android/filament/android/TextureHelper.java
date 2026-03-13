package com.google.android.filament.android;

import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureHelper {
    private static final int BITMAP_CONFIG_ALPHA_8 = 0;
    private static final int BITMAP_CONFIG_HARDWARE = 5;
    private static final int BITMAP_CONFIG_RGBA_4444 = 2;
    private static final int BITMAP_CONFIG_RGBA_8888 = 3;
    private static final int BITMAP_CONFIG_RGBA_F16 = 4;
    private static final int BITMAP_CONFIG_RGB_565 = 1;

    /* JADX INFO: renamed from: com.google.android.filament.android.TextureHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private TextureHelper() {
    }

    private static native void nSetBitmap(long j10, long j11, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap, int i15);

    private static native void nSetBitmapWithCallback(long j10, long j11, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap, int i15, Object obj, Runnable runnable);

    public static void setBitmap(Engine engine, Texture texture, int i10, Bitmap bitmap) {
        setBitmap(engine, texture, i10, 0, 0, texture.getWidth(i10), texture.getHeight(i10), bitmap);
    }

    private static int toNativeFormat(Bitmap.Config config) {
        int i10 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 5) {
            return i10 != 6 ? 3 : 5;
        }
        return 4;
    }

    public static void setBitmap(Engine engine, Texture texture, int i10, Bitmap bitmap, Object obj, Runnable runnable) {
        setBitmap(engine, texture, i10, 0, 0, texture.getWidth(i10), texture.getHeight(i10), bitmap, obj, runnable);
    }

    public static void setBitmap(Engine engine, Texture texture, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), i10, i11, i12, i13, i14, bitmap, nativeFormat);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }

    public static void setBitmap(Engine engine, Texture texture, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap, Object obj, Runnable runnable) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmapWithCallback(texture.getNativeObject(), engine.getNativeObject(), i10, i11, i12, i13, i14, bitmap, nativeFormat, obj, runnable);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }
}
