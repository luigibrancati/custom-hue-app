package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Texture {
    public static final int BASE_LEVEL = 0;
    private long mNativeObject;
    private static final Sampler[] sSamplerValues = Sampler.values();
    private static final InternalFormat[] sInternalFormatValues = InternalFormat.values();

    /* JADX INFO: renamed from: com.google.android.filament.Texture$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Texture$Format;
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Texture$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$google$android$filament$Texture$Type = iArr;
            try {
                iArr[Type.UBYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.USHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.HALF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.UINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.UINT_10F_11F_11F_REV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Type[Type.USHORT_565.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[Format.values().length];
            $SwitchMap$com$google$android$filament$Texture$Format = iArr2;
            try {
                iArr2[Format.R.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.R_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.DEPTH_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RG.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RG_INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.DEPTH_STENCIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.STENCIL_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RGB.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RGB_INTEGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RGBA.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$android$filament$Texture$Format[Format.RGBA_INTEGER.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j10) {
                this.mNativeObject = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Texture.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Texture.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Texture build(Engine engine) {
            long jNBuilderBuild = Texture.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Texture(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Texture");
        }

        public Builder depth(int i10) {
            Texture.nBuilderDepth(this.mNativeBuilder, i10);
            return this;
        }

        public Builder external() {
            Texture.nBuilderExternal(this.mNativeBuilder);
            return this;
        }

        public Builder format(InternalFormat internalFormat) {
            Texture.nBuilderFormat(this.mNativeBuilder, internalFormat.ordinal());
            return this;
        }

        public Builder height(int i10) {
            Texture.nBuilderHeight(this.mNativeBuilder, i10);
            return this;
        }

        public Builder importTexture(long j10) {
            Texture.nBuilderImportTexture(this.mNativeBuilder, j10);
            return this;
        }

        public Builder levels(int i10) {
            Texture.nBuilderLevels(this.mNativeBuilder, i10);
            return this;
        }

        public Builder sampler(Sampler sampler) {
            Texture.nBuilderSampler(this.mNativeBuilder, sampler.ordinal());
            return this;
        }

        public Builder swizzle(Swizzle swizzle, Swizzle swizzle2, Swizzle swizzle3, Swizzle swizzle4) {
            Texture.nBuilderSwizzle(this.mNativeBuilder, swizzle.ordinal(), swizzle2.ordinal(), swizzle3.ordinal(), swizzle4.ordinal());
            return this;
        }

        public Builder usage(int i10) {
            Texture.nBuilderUsage(this.mNativeBuilder, i10);
            return this;
        }

        public Builder width(int i10) {
            Texture.nBuilderWidth(this.mNativeBuilder, i10);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CompressedFormat {
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12,
        RED_RGTC1,
        SIGNED_RED_RGTC1,
        RED_GREEN_RGTC2,
        SIGNED_RED_GREEN_RGTC2,
        RGB_BPTC_SIGNED_FLOAT,
        RGB_BPTC_UNSIGNED_FLOAT,
        RGBA_BPTC_UNORM,
        SRGB_ALPHA_BPTC_UNORM
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CubemapFace {
        POSITIVE_X,
        NEGATIVE_X,
        POSITIVE_Y,
        NEGATIVE_Y,
        POSITIVE_Z,
        NEGATIVE_Z
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Format {
        R,
        R_INTEGER,
        RG,
        RG_INTEGER,
        RGB,
        RGB_INTEGER,
        RGBA,
        RGBA_INTEGER,
        UNUSED,
        DEPTH_COMPONENT,
        DEPTH_STENCIL,
        STENCIL_INDEX,
        ALPHA
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum InternalFormat {
        R8,
        R8_SNORM,
        R8UI,
        R8I,
        STENCIL8,
        R16F,
        R16UI,
        R16I,
        RG8,
        RG8_SNORM,
        RG8UI,
        RG8I,
        RGB565,
        RGB9_E5,
        RGB5_A1,
        RGBA4,
        DEPTH16,
        RGB8,
        SRGB8,
        RGB8_SNORM,
        RGB8UI,
        RGB8I,
        DEPTH24,
        R32F,
        R32UI,
        R32I,
        RG16F,
        RG16UI,
        RG16I,
        R11F_G11F_B10F,
        RGBA8,
        SRGB8_A8,
        RGBA8_SNORM,
        UNUSED,
        RGB10_A2,
        RGBA8UI,
        RGBA8I,
        DEPTH32F,
        DEPTH24_STENCIL8,
        DEPTH32F_STENCIL8,
        RGB16F,
        RGB16UI,
        RGB16I,
        RG32F,
        RG32UI,
        RG32I,
        RGBA16F,
        RGBA16UI,
        RGBA16I,
        RGB32F,
        RGB32UI,
        RGB32I,
        RGBA32F,
        RGBA32UI,
        RGBA32I,
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12,
        RED_RGTC1,
        SIGNED_RED_RGTC1,
        RED_GREEN_RGTC2,
        SIGNED_RED_GREEN_RGTC2,
        RGB_BPTC_SIGNED_FLOAT,
        RGB_BPTC_UNSIGNED_FLOAT,
        RGBA_BPTC_UNORM,
        SRGB_ALPHA_BPTC_UNORM
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PrefilterOptions {
        public int sampleCount = 8;
        public boolean mirror = true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Sampler {
        SAMPLER_2D,
        SAMPLER_2D_ARRAY,
        SAMPLER_CUBEMAP,
        SAMPLER_EXTERNAL,
        SAMPLER_3D
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Swizzle {
        SUBSTITUTE_ZERO,
        SUBSTITUTE_ONE,
        CHANNEL_0,
        CHANNEL_1,
        CHANNEL_2,
        CHANNEL_3
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Type {
        UBYTE,
        BYTE,
        USHORT,
        SHORT,
        UINT,
        INT,
        HALF,
        FLOAT,
        COMPRESSED,
        UINT_10F_11F_11F_REV,
        USHORT_565
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Usage {
        public static final int BLIT_DST = 128;
        public static final int BLIT_SRC = 64;
        public static final int COLOR_ATTACHMENT = 1;
        public static final int DEFAULT = 24;
        public static final int DEPTH_ATTACHMENT = 2;
        public static final int GEN_MIPMAPPABLE = 512;
        public static final int PROTECTED = 256;
        public static final int SAMPLEABLE = 16;
        public static final int STENCIL_ATTACHMENT = 4;
        public static final int SUBPASS_INPUT = 32;
        public static final int UPLOADABLE = 8;
    }

    public Texture(long j10) {
        this.mNativeObject = j10;
    }

    public static int getMaxArrayTextureLayers(Engine engine) {
        return nGetMaxArrayTextureLayers(engine.getNativeObject());
    }

    public static int getMaxTextureSize(Engine engine, Sampler sampler) {
        return nGetMaxTextureSize(engine.getNativeObject(), sampler.ordinal());
    }

    public static boolean isTextureFormatMipmappable(Engine engine, InternalFormat internalFormat) {
        return nIsTextureFormatMipmappable(engine.getNativeObject(), internalFormat.ordinal());
    }

    public static boolean isTextureFormatSupported(Engine engine, InternalFormat internalFormat) {
        return nIsTextureFormatSupported(engine.getNativeObject(), internalFormat.ordinal());
    }

    public static boolean isTextureSwizzleSupported(Engine engine) {
        return nIsTextureSwizzleSupported(engine.getNativeObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDepth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExternal(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderImportTexture(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSwizzle(long j10, int i10, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUsage(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGenerateMipmaps(long j10, long j11);

    private static native int nGeneratePrefilterMipmap(long j10, long j11, int i10, int i11, Buffer buffer, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, Object obj, Runnable runnable, int i19, boolean z10);

    private static native int nGetDepth(long j10, int i10);

    private static native int nGetHeight(long j10, int i10);

    private static native int nGetInternalFormat(long j10);

    private static native int nGetLevels(long j10);

    private static native int nGetMaxArrayTextureLayers(long j10);

    private static native int nGetMaxTextureSize(long j10, int i10);

    private static native int nGetTarget(long j10);

    private static native int nGetWidth(long j10, int i10);

    private static native boolean nIsStreamValidForTexture(long j10, long j11);

    private static native boolean nIsTextureFormatMipmappable(long j10, int i10);

    private static native boolean nIsTextureFormatSupported(long j10, int i10);

    private static native boolean nIsTextureSwizzleSupported(long j10);

    private static native void nSetExternalImage(long j10, long j11, long j12);

    private static native void nSetExternalStream(long j10, long j11, long j12);

    private static native int nSetImage3D(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj, Runnable runnable);

    private static native int nSetImage3DCompressed(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj, Runnable runnable);

    private static native int nSetImageCubemap(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, Object obj, Runnable runnable);

    private static native int nSetImageCubemapCompressed(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, Object obj, Runnable runnable);

    private static native boolean nValidatePixelFormatAndType(int i10, int i11, int i12);

    public static boolean validatePixelFormatAndType(InternalFormat internalFormat, Format format, Type type) {
        return nValidatePixelFormatAndType(internalFormat.ordinal(), format.ordinal(), type.ordinal());
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void generateMipmaps(Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public void generatePrefilterMipmap(Engine engine, PixelBufferDescriptor pixelBufferDescriptor, int[] iArr, PrefilterOptions prefilterOptions) {
        int i10;
        boolean z10;
        int width = getWidth(0);
        int height = getHeight(0);
        if (prefilterOptions != null) {
            i10 = prefilterOptions.sampleCount;
            z10 = prefilterOptions.mirror;
        } else {
            i10 = 8;
            z10 = true;
        }
        boolean z11 = z10;
        int i11 = i10;
        long nativeObject = getNativeObject();
        long nativeObject2 = engine.getNativeObject();
        Buffer buffer = pixelBufferDescriptor.storage;
        if (nGeneratePrefilterMipmap(nativeObject, nativeObject2, width, height, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback, i11, z11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public int getDepth(int i10) {
        return nGetDepth(getNativeObject(), i10);
    }

    public InternalFormat getFormat() {
        return sInternalFormatValues[nGetInternalFormat(getNativeObject())];
    }

    public int getHeight(int i10) {
        return nGetHeight(getNativeObject(), i10);
    }

    public int getLevels() {
        return nGetLevels(getNativeObject());
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Texture");
    }

    public Sampler getTarget() {
        return sSamplerValues[nGetTarget(getNativeObject())];
    }

    public int getWidth(int i10) {
        return nGetWidth(getNativeObject(), i10);
    }

    public void setExternalImage(Engine engine, long j10) {
        nSetExternalImage(getNativeObject(), engine.getNativeObject(), j10);
    }

    public void setExternalStream(Engine engine, Stream stream) {
        long nativeObject = getNativeObject();
        long nativeObject2 = stream.getNativeObject();
        if (!nIsStreamValidForTexture(nativeObject, nativeObject2)) {
            throw new IllegalStateException("Invalid texture sampler: When used with a stream, a texture must use a SAMPLER_EXTERNAL");
        }
        nSetExternalStream(nativeObject, engine.getNativeObject(), nativeObject2);
    }

    public void setImage(Engine engine, int i10, PixelBufferDescriptor pixelBufferDescriptor) {
        setImage(engine, i10, 0, 0, 0, getWidth(i10), getHeight(i10), 1, pixelBufferDescriptor);
    }

    public void setImage(Engine engine, int i10, int i11, int i12, int i13, int i14, PixelBufferDescriptor pixelBufferDescriptor) {
        setImage(engine, i10, i11, i12, 0, i13, i14, 1, pixelBufferDescriptor);
    }

    public void setImage(Engine engine, int i10, int i11, int i12, int i13, int i14, int i15, int i16, PixelBufferDescriptor pixelBufferDescriptor) {
        int iNSetImage3D;
        if (pixelBufferDescriptor.type == Type.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            iNSetImage3D = nSetImage3DCompressed(nativeObject, nativeObject2, i10, i11, i12, i13, i14, i15, i16, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.compressedSizeInBytes, pixelBufferDescriptor.compressedFormat.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = pixelBufferDescriptor.storage;
            iNSetImage3D = nSetImage3D(nativeObject3, nativeObject4, i10, i11, i12, i13, i14, i15, i16, buffer2, buffer2.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        }
        if (iNSetImage3D < 0) {
            throw new BufferOverflowException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PixelBufferDescriptor {
        public int alignment;
        public Runnable callback;
        public CompressedFormat compressedFormat;
        public int compressedSizeInBytes;
        public Format format;
        public Object handler;
        public int left;
        public Buffer storage;
        public int stride;
        public int top;
        public Type type;

        public PixelBufferDescriptor(Buffer buffer, Format format, Type type, int i10, int i11, int i12, int i13, Object obj, Runnable runnable) {
            this.storage = buffer;
            this.left = i11;
            this.top = i12;
            this.type = type;
            this.alignment = i10;
            this.stride = i13;
            this.format = format;
            this.handler = obj;
            this.callback = runnable;
        }

        public static int computeDataSize(Format format, Type type, int i10, int i11, int i12) {
            int i13;
            if (type == Type.COMPRESSED) {
                return 0;
            }
            int i14 = 2;
            switch (AnonymousClass1.$SwitchMap$com$google$android$filament$Texture$Format[format.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    i13 = 1;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    i13 = 2;
                    break;
                case 9:
                case 10:
                    i13 = 3;
                    break;
                case 11:
                case 12:
                    i13 = 4;
                    break;
                default:
                    throw new IllegalStateException("unsupported format enum");
            }
            switch (AnonymousClass1.$SwitchMap$com$google$android$filament$Texture$Type[type.ordinal()]) {
                case 4:
                case 5:
                case 6:
                    i14 = i13 * 2;
                    break;
                case 7:
                case 8:
                case 9:
                    i14 = i13 * 4;
                    break;
                case 10:
                    i14 = 4;
                    break;
                case 11:
                    break;
                default:
                    i14 = i13;
                    break;
            }
            return ((-i12) & ((i14 * i10) + (i12 - 1))) * i11;
        }

        public void setCallback(Object obj, Runnable runnable) {
            this.handler = obj;
            this.callback = runnable;
        }

        public PixelBufferDescriptor(Buffer buffer, Format format, Type type) {
            this(buffer, format, type, 1, 0, 0, 0, null, null);
        }

        public PixelBufferDescriptor(Buffer buffer, Format format, Type type, int i10) {
            this(buffer, format, type, i10, 0, 0, 0, null, null);
        }

        public PixelBufferDescriptor(Buffer buffer, Format format, Type type, int i10, int i11, int i12) {
            this(buffer, format, type, i10, i11, i12, 0, null, null);
        }

        public PixelBufferDescriptor(ByteBuffer byteBuffer, CompressedFormat compressedFormat, int i10) {
            this.alignment = 1;
            this.left = 0;
            this.top = 0;
            this.stride = 0;
            this.storage = byteBuffer;
            this.type = Type.COMPRESSED;
            this.alignment = 1;
            this.compressedFormat = compressedFormat;
            this.compressedSizeInBytes = i10;
        }
    }

    @Deprecated
    public void setImage(Engine engine, int i10, PixelBufferDescriptor pixelBufferDescriptor, int[] iArr) {
        int iNSetImageCubemap;
        if (pixelBufferDescriptor.type == Type.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            iNSetImageCubemap = nSetImageCubemapCompressed(nativeObject, nativeObject2, i10, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.compressedSizeInBytes, pixelBufferDescriptor.compressedFormat.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = pixelBufferDescriptor.storage;
            iNSetImageCubemap = nSetImageCubemap(nativeObject3, nativeObject4, i10, buffer2, buffer2.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        }
        if (iNSetImageCubemap < 0) {
            throw new BufferOverflowException();
        }
    }
}
