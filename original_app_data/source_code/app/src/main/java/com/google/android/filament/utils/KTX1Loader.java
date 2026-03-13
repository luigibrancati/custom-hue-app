package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001f !B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tJ)\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0082 J!\u0010\u001c\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0082 J\u0019\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0082 ¨\u0006\""}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader;", "", "<init>", "()V", "createTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", RRWebOptionsEvent.EVENT_TAG, "Lcom/google/android/filament/utils/KTX1Loader$Options;", "createIndirectLight", "Lcom/google/android/filament/utils/KTX1Loader$IndirectLightBundle;", "createSkybox", "Lcom/google/android/filament/utils/KTX1Loader$SkyboxBundle;", "getSphericalHarmonics", "", "nCreateKTXTexture", "", "nativeEngine", "remaining", "", "srgb", "", "nCreateIndirectLight", "ktxTexture", "sphericalHarmonics", "nGetSphericalHarmonics", "outSphericalHarmonics", "nCreateSkybox", "Options", "IndirectLightBundle", "SkyboxBundle", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KTX1Loader {
    public static final KTX1Loader INSTANCE = new KTX1Loader();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader$IndirectLightBundle;", "", "indirectLight", "Lcom/google/android/filament/IndirectLight;", "cubemap", "Lcom/google/android/filament/Texture;", "<init>", "(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Texture;)V", "getIndirectLight", "()Lcom/google/android/filament/IndirectLight;", "getCubemap", "()Lcom/google/android/filament/Texture;", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndirectLightBundle {
        private final Texture cubemap;
        private final IndirectLight indirectLight;

        public IndirectLightBundle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Texture getCubemap() {
            return this.cubemap;
        }

        public final IndirectLight getIndirectLight() {
            return this.indirectLight;
        }

        public IndirectLightBundle(IndirectLight indirectLight, Texture texture) {
            this.indirectLight = indirectLight;
            this.cubemap = texture;
        }

        public /* synthetic */ IndirectLightBundle(IndirectLight indirectLight, Texture texture, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? null : indirectLight, (i10 & 2) != 0 ? null : texture);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader$Options;", "", "<init>", "()V", "srgb", "", "getSrgb", "()Z", "setSrgb", "(Z)V", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Options {
        private boolean srgb;

        public final boolean getSrgb() {
            return this.srgb;
        }

        public final void setSrgb(boolean z10) {
            this.srgb = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader$SkyboxBundle;", "", "skybox", "Lcom/google/android/filament/Skybox;", "cubemap", "Lcom/google/android/filament/Texture;", "<init>", "(Lcom/google/android/filament/Skybox;Lcom/google/android/filament/Texture;)V", "getSkybox", "()Lcom/google/android/filament/Skybox;", "getCubemap", "()Lcom/google/android/filament/Texture;", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SkyboxBundle {
        private final Texture cubemap;
        private final Skybox skybox;

        public SkyboxBundle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Texture getCubemap() {
            return this.cubemap;
        }

        public final Skybox getSkybox() {
            return this.skybox;
        }

        public SkyboxBundle(Skybox skybox, Texture texture) {
            this.skybox = skybox;
            this.cubemap = texture;
        }

        public /* synthetic */ SkyboxBundle(Skybox skybox, Texture texture, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? null : skybox, (i10 & 2) != 0 ? null : texture);
        }
    }

    private KTX1Loader() {
    }

    public static /* synthetic */ IndirectLightBundle createIndirectLight$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createIndirectLight(engine, buffer, options);
    }

    public static /* synthetic */ SkyboxBundle createSkybox$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createSkybox(engine, buffer, options);
    }

    public static /* synthetic */ Texture createTexture$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createTexture(engine, buffer, options);
    }

    private final native long nCreateIndirectLight(long nativeEngine, long ktxTexture, float[] sphericalHarmonics);

    private final native long nCreateKTXTexture(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native long nCreateSkybox(long nativeEngine, long ktxTexture);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int remaining, float[] outSphericalHarmonics);

    public final IndirectLightBundle createIndirectLight(Engine engine, Buffer buffer, Options options) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(options, "options");
        long nativeObject = engine.getNativeObject();
        float[] sphericalHarmonics = getSphericalHarmonics(buffer);
        if (sphericalHarmonics != null) {
            Texture textureCreateTexture = createTexture(engine, buffer, options);
            return new IndirectLightBundle(new IndirectLight(nCreateIndirectLight(nativeObject, textureCreateTexture.getNativeObject(), sphericalHarmonics)), textureCreateTexture);
        }
        return new IndirectLightBundle(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final SkyboxBundle createSkybox(Engine engine, Buffer buffer, Options options) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(options, "options");
        long nativeObject = engine.getNativeObject();
        Texture textureCreateTexture = createTexture(engine, buffer, options);
        return new SkyboxBundle(new Skybox(nCreateSkybox(nativeObject, textureCreateTexture.getNativeObject())), textureCreateTexture);
    }

    public final Texture createTexture(Engine engine, Buffer buffer, Options options) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(options, "options");
        return new Texture(nCreateKTXTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    public final float[] getSphericalHarmonics(Buffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        float[] fArr = new float[27];
        if (nGetSphericalHarmonics(buffer, buffer.remaining(), fArr)) {
            return fArr;
        }
        return null;
    }
}
