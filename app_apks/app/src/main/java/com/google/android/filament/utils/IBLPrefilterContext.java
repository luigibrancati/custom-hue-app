package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class IBLPrefilterContext {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class EquirectangularToCubemap {
        private long mNativeObject;

        public EquirectangularToCubemap(IBLPrefilterContext iBLPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.nCreateEquirectHelper(iBLPrefilterContext.getNativeObject());
        }

        public void destroy() {
            IBLPrefilterContext.nDestroyEquirectHelper(getNativeObject());
            this.mNativeObject = 0L;
        }

        public long getNativeObject() {
            long j10 = this.mNativeObject;
            if (j10 != 0) {
                return j10;
            }
            throw new IllegalStateException("Calling method on destroyed EquirectangularToCubemap");
        }

        public Texture run(Texture texture) {
            return new Texture(IBLPrefilterContext.nEquirectHelperRun(getNativeObject(), texture.getNativeObject()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SpecularFilter {
        private long mNativeObject;

        public SpecularFilter(IBLPrefilterContext iBLPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.nCreateSpecularFilter(iBLPrefilterContext.getNativeObject());
        }

        public void destroy() {
            IBLPrefilterContext.nDestroySpecularFilter(getNativeObject());
            this.mNativeObject = 0L;
        }

        public long getNativeObject() {
            long j10 = this.mNativeObject;
            if (j10 != 0) {
                return j10;
            }
            throw new IllegalStateException("Calling method on destroyed SpecularFilter");
        }

        public Texture run(Texture texture) {
            return new Texture(IBLPrefilterContext.nSpecularFilterRun(getNativeObject(), texture.getNativeObject()));
        }
    }

    public IBLPrefilterContext(Engine engine) {
        long jNCreate = nCreate(engine.getNativeObject());
        this.mNativeObject = jNCreate;
        if (jNCreate == 0) {
            throw new IllegalStateException("Couldn't create IBLPrefilterContext");
        }
    }

    private static native long nCreate(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateEquirectHelper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateSpecularFilter(long j10);

    private static native void nDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyEquirectHelper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroySpecularFilter(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nEquirectHelperRun(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nSpecularFilterRun(long j10, long j11);

    public void destroy() {
        nDestroy(getNativeObject());
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IBLPrefilterContext");
    }
}
