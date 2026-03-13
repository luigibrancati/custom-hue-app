package com.google.android.filament.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import fc.C4032o;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t\u001a \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"SKIP_BITMAP_COPY", "", "loadTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "resources", "Landroid/content/res/Resources;", "resourceId", "", "type", "Lcom/google/android/filament/utils/TextureType;", "bytes", "", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, SentryEnvelopeItemHeader.JsonKeys.LENGTH, "buildTexture", "bitmap", "Landroid/graphics/Bitmap;", "internalFormat", "Lcom/google/android/filament/Texture$InternalFormat;", "format", "Lcom/google/android/filament/Texture$Format;", "Lcom/google/android/filament/Texture$Type;", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextureLoaderKt {
    public static final boolean SKIP_BITMAP_COPY = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextureType.values().length];
            try {
                iArr[TextureType.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextureType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextureType.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Texture buildTexture(Engine engine, Bitmap bitmap, TextureType textureType) {
        Texture textureBuild = new Texture.Builder().width(bitmap.getWidth()).height(bitmap.getHeight()).sampler(Texture.Sampler.SAMPLER_2D).format(internalFormat(textureType)).levels(255).usage(536).build(engine);
        AbstractC4862t.d(textureBuild, "build(...)");
        TextureHelper.setBitmap(engine, textureBuild, 0, bitmap);
        textureBuild.generateMipmaps(engine);
        return textureBuild;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.Format format(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.Format.ALPHA;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.Format.RGB;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown bitmap configuration");
    }

    private static final Texture.InternalFormat internalFormat(TextureType textureType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textureType.ordinal()];
        if (i10 == 1) {
            return Texture.InternalFormat.SRGB8_A8;
        }
        if (i10 == 2) {
            return Texture.InternalFormat.RGBA8;
        }
        if (i10 == 3) {
            return Texture.InternalFormat.RGBA8;
        }
        throw new C4032o();
    }

    public static final Texture loadTexture(Engine engine, Resources resources, int i10, TextureType type) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(resources, "resources");
        AbstractC4862t.e(type, "type");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = type == TextureType.COLOR;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i10, options);
        AbstractC4862t.b(bitmapDecodeResource);
        return buildTexture(engine, bitmapDecodeResource, type);
    }

    public static /* synthetic */ Texture loadTexture$default(Engine engine, byte[] bArr, TextureType textureType, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        if ((i12 & 16) != 0) {
            i11 = bArr.length;
        }
        return loadTexture(engine, bArr, textureType, i10, i11);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.Type type(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.Type.USHORT;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.Type.UBYTE;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.Type.HALF;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.Type.USHORT_565;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported bitmap configuration");
    }

    public static final Texture loadTexture(Engine engine, byte[] bytes, TextureType type, int i10, int i11) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(bytes, "bytes");
        AbstractC4862t.e(type, "type");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = type == TextureType.COLOR;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, i10, i11, options);
        AbstractC4862t.b(bitmapDecodeByteArray);
        return buildTexture(engine, bitmapDecodeByteArray, type);
    }
}
