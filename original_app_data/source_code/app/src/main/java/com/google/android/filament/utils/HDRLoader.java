package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 ¨\u0006\u0013"}, d2 = {"Lcom/google/android/filament/utils/HDRLoader;", "", "<init>", "()V", "createTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", RRWebOptionsEvent.EVENT_TAG, "Lcom/google/android/filament/utils/HDRLoader$Options;", "nCreateHDRTexture", "", "nativeEngine", "remaining", "", "format", "Options", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HDRLoader {
    public static final HDRLoader INSTANCE = new HDRLoader();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/filament/utils/HDRLoader$Options;", "", "<init>", "()V", "desiredFormat", "Lcom/google/android/filament/Texture$InternalFormat;", "getDesiredFormat", "()Lcom/google/android/filament/Texture$InternalFormat;", "setDesiredFormat", "(Lcom/google/android/filament/Texture$InternalFormat;)V", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Options {
        private Texture.InternalFormat desiredFormat = Texture.InternalFormat.RGB16F;

        public final Texture.InternalFormat getDesiredFormat() {
            return this.desiredFormat;
        }

        public final void setDesiredFormat(Texture.InternalFormat internalFormat) {
            AbstractC4862t.e(internalFormat, "<set-?>");
            this.desiredFormat = internalFormat;
        }
    }

    private HDRLoader() {
    }

    public static /* synthetic */ Texture createTexture$default(HDRLoader hDRLoader, Engine engine, Buffer buffer, Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = new Options();
        }
        return hDRLoader.createTexture(engine, buffer, options);
    }

    private final native long nCreateHDRTexture(long nativeEngine, Buffer buffer, int remaining, int format);

    public final Texture createTexture(Engine engine, Buffer buffer, Options options) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(options, "options");
        long jNCreateHDRTexture = nCreateHDRTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getDesiredFormat().ordinal());
        if (jNCreateHDRTexture == 0) {
            return null;
        }
        return new Texture(jNCreateHDRTexture);
    }
}
