package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ToneMapper {
    private final long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ACES extends ToneMapper {
        public ACES() {
            super(ToneMapper.nCreateACESToneMapper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ACESLegacy extends ToneMapper {
        public ACESLegacy() {
            super(ToneMapper.nCreateACESLegacyToneMapper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Agx extends ToneMapper {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum AgxLook {
            NONE,
            PUNCHY,
            GOLDEN
        }

        public Agx() {
            this(AgxLook.NONE);
        }

        public Agx(AgxLook agxLook) {
            super(ToneMapper.nCreateAgxToneMapper(agxLook.ordinal()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Filmic extends ToneMapper {
        public Filmic() {
            super(ToneMapper.nCreateFilmicToneMapper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Generic extends ToneMapper {
        public Generic() {
            this(1.55f, 0.18f, 0.215f, 10.0f);
        }

        public float getContrast() {
            return ToneMapper.nGenericGetContrast(getNativeObject());
        }

        public float getHdrMax() {
            return ToneMapper.nGenericGetHdrMax(getNativeObject());
        }

        public float getMidGrayIn() {
            return ToneMapper.nGenericGetMidGrayIn(getNativeObject());
        }

        public float getMidGrayOut() {
            return ToneMapper.nGenericGetMidGrayOut(getNativeObject());
        }

        public void setContrast(float f10) {
            ToneMapper.nGenericSetContrast(getNativeObject(), f10);
        }

        public void setHdrMax(float f10) {
            ToneMapper.nGenericSetHdrMax(getNativeObject(), f10);
        }

        public void setMidGrayIn(float f10) {
            ToneMapper.nGenericSetMidGrayIn(getNativeObject(), f10);
        }

        public void setMidGrayOut(float f10) {
            ToneMapper.nGenericSetMidGrayOut(getNativeObject(), f10);
        }

        public Generic(float f10, float f11, float f12, float f13) {
            super(ToneMapper.nCreateGenericToneMapper(f10, f11, f12, f13));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Linear extends ToneMapper {
        public Linear() {
            super(ToneMapper.nCreateLinearToneMapper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PBRNeutralToneMapper extends ToneMapper {
        public PBRNeutralToneMapper() {
            super(ToneMapper.nCreatePBRNeutralToneMapper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESLegacyToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateAgxToneMapper(int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateFilmicToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateGenericToneMapper(float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreatePBRNeutralToneMapper();

    private static native void nDestroyToneMapper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetContrast(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetHdrMax(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayIn(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayOut(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetContrast(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetHdrMax(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayIn(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayOut(long j10, float f10);

    public void finalize() {
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(this.mNativeObject);
        }
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed ToneMapper");
    }

    private ToneMapper(long j10) {
        this.mNativeObject = j10;
    }
}
