package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TextureSampler {
    long mSampler;

    /* JADX INFO: renamed from: com.google.android.filament.TextureSampler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$TextureSampler$MagFilter;

        static {
            int[] iArr = new int[MagFilter.values().length];
            $SwitchMap$com$google$android$filament$TextureSampler$MagFilter = iArr;
            try {
                iArr[MagFilter.NEAREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$TextureSampler$MagFilter[MagFilter.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CompareFunction {
        LESS_EQUAL,
        GREATER_EQUAL,
        LESS,
        GREATER,
        EQUAL,
        NOT_EQUAL,
        ALWAYS,
        NEVER
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CompareMode {
        NONE,
        COMPARE_TO_TEXTURE
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EnumCache {
        static final MinFilter[] sMinFilterValues = MinFilter.values();
        static final MagFilter[] sMagFilterValues = MagFilter.values();
        static final WrapMode[] sWrapModeValues = WrapMode.values();
        static final CompareMode[] sCompareModeValues = CompareMode.values();
        static final CompareFunction[] sCompareFunctionValues = CompareFunction.values();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum MagFilter {
        NEAREST,
        LINEAR
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum MinFilter {
        NEAREST,
        LINEAR,
        NEAREST_MIPMAP_NEAREST,
        LINEAR_MIPMAP_NEAREST,
        NEAREST_MIPMAP_LINEAR,
        LINEAR_MIPMAP_LINEAR
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum WrapMode {
        CLAMP_TO_EDGE,
        REPEAT,
        MIRRORED_REPEAT
    }

    public TextureSampler() {
        this(MinFilter.LINEAR_MIPMAP_LINEAR, MagFilter.LINEAR, WrapMode.REPEAT);
    }

    private static MinFilter minFilterFromMagFilter(MagFilter magFilter) {
        return AnonymousClass1.$SwitchMap$com$google$android$filament$TextureSampler$MagFilter[magFilter.ordinal()] != 1 ? MinFilter.LINEAR : MinFilter.NEAREST;
    }

    private static native long nCreateCompareSampler(int i10, int i11);

    private static native long nCreateSampler(int i10, int i11, int i12, int i13, int i14);

    private static native float nGetAnisotropy(long j10);

    private static native int nGetCompareFunction(long j10);

    private static native int nGetCompareMode(long j10);

    private static native int nGetMagFilter(long j10);

    private static native int nGetMinFilter(long j10);

    private static native int nGetWrapModeR(long j10);

    private static native int nGetWrapModeS(long j10);

    private static native int nGetWrapModeT(long j10);

    private static native long nSetAnisotropy(long j10, float f10);

    private static native long nSetCompareFunction(long j10, int i10);

    private static native long nSetCompareMode(long j10, int i10);

    private static native long nSetMagFilter(long j10, int i10);

    private static native long nSetMinFilter(long j10, int i10);

    private static native long nSetWrapModeR(long j10, int i10);

    private static native long nSetWrapModeS(long j10, int i10);

    private static native long nSetWrapModeT(long j10, int i10);

    public float getAnisotropy() {
        return nGetAnisotropy(this.mSampler);
    }

    public CompareFunction getCompareFunction() {
        return EnumCache.sCompareFunctionValues[nGetCompareFunction(this.mSampler)];
    }

    public CompareMode getCompareMode() {
        return EnumCache.sCompareModeValues[nGetCompareMode(this.mSampler)];
    }

    public MagFilter getMagFilter() {
        return EnumCache.sMagFilterValues[nGetMagFilter(this.mSampler)];
    }

    public MinFilter getMinFilter() {
        return EnumCache.sMinFilterValues[nGetMinFilter(this.mSampler)];
    }

    public WrapMode getWrapModeR() {
        return EnumCache.sWrapModeValues[nGetWrapModeR(this.mSampler)];
    }

    public WrapMode getWrapModeS() {
        return EnumCache.sWrapModeValues[nGetWrapModeS(this.mSampler)];
    }

    public WrapMode getWrapModeT() {
        return EnumCache.sWrapModeValues[nGetWrapModeT(this.mSampler)];
    }

    public void setAnisotropy(float f10) {
        this.mSampler = nSetAnisotropy(this.mSampler, f10);
    }

    public void setCompareFunction(CompareFunction compareFunction) {
        this.mSampler = nSetCompareFunction(this.mSampler, compareFunction.ordinal());
    }

    public void setCompareMode(CompareMode compareMode) {
        this.mSampler = nSetCompareMode(this.mSampler, compareMode.ordinal());
    }

    public void setMagFilter(MagFilter magFilter) {
        this.mSampler = nSetMagFilter(this.mSampler, magFilter.ordinal());
    }

    public void setMinFilter(MinFilter minFilter) {
        this.mSampler = nSetMinFilter(this.mSampler, minFilter.ordinal());
    }

    public void setWrapModeR(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeR(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeS(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeS(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeT(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeT(this.mSampler, wrapMode.ordinal());
    }

    public TextureSampler(MagFilter magFilter) {
        this(magFilter, WrapMode.CLAMP_TO_EDGE);
    }

    public TextureSampler(MagFilter magFilter, WrapMode wrapMode) {
        this(minFilterFromMagFilter(magFilter), magFilter, wrapMode);
    }

    public TextureSampler(MinFilter minFilter, MagFilter magFilter, WrapMode wrapMode) {
        this(minFilter, magFilter, wrapMode, wrapMode, wrapMode);
    }

    public TextureSampler(MinFilter minFilter, MagFilter magFilter, WrapMode wrapMode, WrapMode wrapMode2, WrapMode wrapMode3) {
        this.mSampler = 0L;
        this.mSampler = nCreateSampler(minFilter.ordinal(), magFilter.ordinal(), wrapMode.ordinal(), wrapMode2.ordinal(), wrapMode3.ordinal());
    }

    public TextureSampler(CompareMode compareMode) {
        this(compareMode, CompareFunction.LESS_EQUAL);
    }

    public TextureSampler(CompareMode compareMode, CompareFunction compareFunction) {
        this.mSampler = 0L;
        this.mSampler = nCreateCompareSampler(compareMode.ordinal(), compareFunction.ordinal());
    }
}
