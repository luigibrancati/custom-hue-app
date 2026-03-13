package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Engine {
    private static final Backend[] sBackendValues = Backend.values();
    private static final FeatureLevel[] sFeatureLevelValues = FeatureLevel.values();
    private Config mConfig;
    private final EntityManager mEntityManager;
    private final LightManager mLightManager;
    private long mNativeObject;
    private final RenderableManager mRenderableManager;
    private final TransformManager mTransformManager;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Backend {
        DEFAULT,
        OPENGL,
        VULKAN,
        METAL,
        WEBGPU,
        NOOP
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private Config mConfig;
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
                Engine.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Engine.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder backend(Backend backend) {
            Engine.nSetBuilderBackend(this.mNativeBuilder, backend.ordinal());
            return this;
        }

        public Engine build() {
            long jNBuilderBuild = Engine.nBuilderBuild(this.mNativeBuilder);
            if (jNBuilderBuild != 0) {
                return new Engine(jNBuilderBuild, this.mConfig);
            }
            throw new IllegalStateException("Couldn't create Engine");
        }

        public Builder config(Config config) {
            this.mConfig = config;
            Engine.nSetBuilderConfig(this.mNativeBuilder, config.commandBufferSizeMB, config.perRenderPassArenaSizeMB, config.driverHandleArenaSizeMB, config.minCommandBufferSizeMB, config.perFrameCommandsSizeMB, config.jobSystemThreadCount, config.disableParallelShaderCompile, config.stereoscopicType.ordinal(), config.stereoscopicEyeCount, config.resourceAllocatorCacheSizeMB, config.resourceAllocatorCacheMaxAge, config.disableHandleUseAfterFreeCheck, config.preferredShaderLanguage.ordinal(), config.forceGLES2Context, config.assertNativeWindowIsValid, config.gpuContextPriority.ordinal(), config.sharedUboInitialSizeInBytes);
            return this;
        }

        public Builder feature(String str, boolean z10) {
            Engine.nSetBuilderFeature(this.mNativeBuilder, str, z10);
            return this;
        }

        public Builder featureLevel(FeatureLevel featureLevel) {
            Engine.nSetBuilderFeatureLevel(this.mNativeBuilder, featureLevel.ordinal());
            return this;
        }

        public Builder paused(boolean z10) {
            Engine.nSetBuilderPaused(this.mNativeBuilder, z10);
            return this;
        }

        public Builder sharedContext(Object obj) {
            if (Platform.get().validateSharedContext(obj)) {
                Engine.nSetBuilderSharedContext(this.mNativeBuilder, Platform.get().getSharedContextNativeHandle(obj));
                return this;
            }
            throw new IllegalArgumentException("Invalid shared context " + obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Config {
        private static final long FILAMENT_COMMAND_BUFFER_SIZE_IN_MB = 3;
        private static final long FILAMENT_MIN_COMMAND_BUFFERS_SIZE_IN_MB = 1;
        private static final long FILAMENT_PER_FRAME_COMMANDS_SIZE_IN_MB = 2;
        private static final long FILAMENT_PER_RENDER_PASS_ARENA_SIZE_IN_MB = 3;
        public long commandBufferSizeMB = 3;
        public long perRenderPassArenaSizeMB = 3;
        public long driverHandleArenaSizeMB = 0;
        public long minCommandBufferSizeMB = 1;
        public long perFrameCommandsSizeMB = 2;
        public long jobSystemThreadCount = 0;
        public long textureUseAfterFreePoolSize = 0;
        public boolean disableParallelShaderCompile = false;
        public StereoscopicType stereoscopicType = StereoscopicType.NONE;
        public long stereoscopicEyeCount = 2;
        public long resourceAllocatorCacheSizeMB = 64;
        public long resourceAllocatorCacheMaxAge = 1;
        public boolean disableHandleUseAfterFreeCheck = false;
        public ShaderLanguage preferredShaderLanguage = ShaderLanguage.DEFAULT;
        public boolean forceGLES2Context = false;
        public boolean assertNativeWindowIsValid = false;
        public GpuContextPriority gpuContextPriority = GpuContextPriority.DEFAULT;
        public long sharedUboInitialSizeInBytes = 16384;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum ShaderLanguage {
            DEFAULT,
            MSL,
            METAL_LIBRARY
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FeatureLevel {
        FEATURE_LEVEL_0,
        FEATURE_LEVEL_1,
        FEATURE_LEVEL_2,
        FEATURE_LEVEL_3
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum GpuContextPriority {
        DEFAULT,
        LOW,
        MEDIUM,
        HIGH,
        REALTIME
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StereoscopicType {
        NONE,
        INSTANCED,
        MULTIVIEW
    }

    private static void assertDestroy(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Object couldn't be destroyed (double destroy()?)");
        }
    }

    private void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public static Engine create() {
        return new Builder().build();
    }

    public static native long getSteadyClockTimeNano();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native long nCreateCamera(long j10, int i10);

    private static native long nCreateFence(long j10);

    private static native long nCreateRenderer(long j10);

    private static native long nCreateScene(long j10);

    private static native long nCreateSwapChain(long j10, Object obj, long j11);

    private static native long nCreateSwapChainFromRawPointer(long j10, long j11, long j12);

    private static native long nCreateSwapChainHeadless(long j10, int i10, int i11, long j11);

    private static native long nCreateView(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nDestroyCameraComponent(long j10, int i10);

    private static native boolean nDestroyColorGrading(long j10, long j11);

    private static native void nDestroyEngine(long j10);

    private static native void nDestroyEntity(long j10, int i10);

    private static native boolean nDestroyFence(long j10, long j11);

    private static native boolean nDestroyIndexBuffer(long j10, long j11);

    private static native boolean nDestroyIndirectLight(long j10, long j11);

    private static native boolean nDestroyMaterial(long j10, long j11);

    private static native boolean nDestroyMaterialInstance(long j10, long j11);

    private static native boolean nDestroyRenderTarget(long j10, long j11);

    private static native boolean nDestroyRenderer(long j10, long j11);

    private static native boolean nDestroyScene(long j10, long j11);

    private static native boolean nDestroySkinningBuffer(long j10, long j11);

    private static native boolean nDestroySkybox(long j10, long j11);

    private static native boolean nDestroyStream(long j10, long j11);

    private static native boolean nDestroySwapChain(long j10, long j11);

    private static native boolean nDestroyTexture(long j10, long j11);

    private static native boolean nDestroyVertexBuffer(long j10, long j11);

    private static native boolean nDestroyView(long j10, long j11);

    private static native void nFlush(long j10);

    private static native boolean nFlushAndWait(long j10, long j11);

    private static native int nGetActiveFeatureLevel(long j10);

    private static native long nGetBackend(long j10);

    private static native long nGetCameraComponent(long j10, int i10);

    private static native long nGetEntityManager(long j10);

    private static native boolean nGetFeatureFlag(long j10, String str);

    private static native long nGetJobSystem(long j10);

    private static native long nGetLightManager(long j10);

    private static native long nGetMaxStereoscopicEyes(long j10);

    private static native long nGetRenderableManager(long j10);

    private static native int nGetSupportedFeatureLevel(long j10);

    private static native long nGetTransformManager(long j10);

    private static native boolean nHasFeatureFlag(long j10, String str);

    private static native boolean nIsAutomaticInstancingEnabled(long j10);

    private static native boolean nIsPaused(long j10);

    private static native boolean nIsValidColorGrading(long j10, long j11);

    private static native boolean nIsValidExpensiveMaterialInstance(long j10, long j11);

    private static native boolean nIsValidFence(long j10, long j11);

    private static native boolean nIsValidIndexBuffer(long j10, long j11);

    private static native boolean nIsValidIndirectLight(long j10, long j11);

    private static native boolean nIsValidMaterial(long j10, long j11);

    private static native boolean nIsValidMaterialInstance(long j10, long j11, long j12);

    private static native boolean nIsValidRenderTarget(long j10, long j11);

    private static native boolean nIsValidRenderer(long j10, long j11);

    private static native boolean nIsValidScene(long j10, long j11);

    private static native boolean nIsValidSkinningBuffer(long j10, long j11);

    private static native boolean nIsValidSkybox(long j10, long j11);

    private static native boolean nIsValidStream(long j10, long j11);

    private static native boolean nIsValidSwapChain(long j10, long j11);

    private static native boolean nIsValidTexture(long j10, long j11);

    private static native boolean nIsValidVertexBuffer(long j10, long j11);

    private static native boolean nIsValidView(long j10, long j11);

    private static native int nSetActiveFeatureLevel(long j10, int i10);

    private static native void nSetAutomaticInstancingEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderBackend(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderConfig(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, int i10, long j17, long j18, long j19, boolean z11, int i11, boolean z12, boolean z13, int i12, long j20);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderFeature(long j10, String str, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderFeatureLevel(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderPaused(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderSharedContext(long j10, long j11);

    private static native boolean nSetFeatureFlag(long j10, String str, boolean z10);

    private static native void nSetPaused(long j10, boolean z10);

    private static native void nUnprotected(long j10);

    public Camera createCamera(@Entity int i10) {
        long jNCreateCamera = nCreateCamera(getNativeObject(), i10);
        if (jNCreateCamera != 0) {
            return new Camera(jNCreateCamera, i10);
        }
        throw new IllegalStateException("Couldn't create Camera");
    }

    public Fence createFence() {
        long jNCreateFence = nCreateFence(getNativeObject());
        if (jNCreateFence != 0) {
            return new Fence(jNCreateFence);
        }
        throw new IllegalStateException("Couldn't create Fence");
    }

    public Renderer createRenderer() {
        long jNCreateRenderer = nCreateRenderer(getNativeObject());
        if (jNCreateRenderer != 0) {
            return new Renderer(this, jNCreateRenderer);
        }
        throw new IllegalStateException("Couldn't create Renderer");
    }

    public Scene createScene() {
        long jNCreateScene = nCreateScene(getNativeObject());
        if (jNCreateScene != 0) {
            return new Scene(jNCreateScene);
        }
        throw new IllegalStateException("Couldn't create Scene");
    }

    public SwapChain createSwapChain(Object obj) {
        return createSwapChain(obj, 0L);
    }

    public SwapChain createSwapChainFromNativeSurface(NativeSurface nativeSurface, long j10) {
        long jNCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(getNativeObject(), nativeSurface.getNativeObject(), j10);
        if (jNCreateSwapChainFromRawPointer != 0) {
            return new SwapChain(jNCreateSwapChainFromRawPointer, nativeSurface);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    public View createView() {
        long jNCreateView = nCreateView(getNativeObject());
        if (jNCreateView != 0) {
            return new View(jNCreateView);
        }
        throw new IllegalStateException("Couldn't create View");
    }

    public void destroy() {
        nDestroyEngine(getNativeObject());
        clearNativeObject();
    }

    public void destroyCameraComponent(@Entity int i10) {
        nDestroyCameraComponent(getNativeObject(), i10);
    }

    public void destroyColorGrading(ColorGrading colorGrading) {
        assertDestroy(nDestroyColorGrading(getNativeObject(), colorGrading.getNativeObject()));
        colorGrading.clearNativeObject();
    }

    public void destroyEntity(@Entity int i10) {
        nDestroyEntity(getNativeObject(), i10);
    }

    public void destroyFence(Fence fence) {
        assertDestroy(nDestroyFence(getNativeObject(), fence.getNativeObject()));
        fence.clearNativeObject();
    }

    public void destroyIndexBuffer(IndexBuffer indexBuffer) {
        assertDestroy(nDestroyIndexBuffer(getNativeObject(), indexBuffer.getNativeObject()));
        indexBuffer.clearNativeObject();
    }

    public void destroyIndirectLight(IndirectLight indirectLight) {
        assertDestroy(nDestroyIndirectLight(getNativeObject(), indirectLight.getNativeObject()));
        indirectLight.clearNativeObject();
    }

    public void destroyMaterial(Material material) {
        assertDestroy(nDestroyMaterial(getNativeObject(), material.getNativeObject()));
        material.clearNativeObject();
    }

    public void destroyMaterialInstance(MaterialInstance materialInstance) {
        assertDestroy(nDestroyMaterialInstance(getNativeObject(), materialInstance.getNativeObject()));
        materialInstance.clearNativeObject();
    }

    public void destroyRenderTarget(RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.getNativeObject());
        renderTarget.clearNativeObject();
    }

    public void destroyRenderer(Renderer renderer) {
        assertDestroy(nDestroyRenderer(getNativeObject(), renderer.getNativeObject()));
        renderer.clearNativeObject();
    }

    public void destroyScene(Scene scene) {
        assertDestroy(nDestroyScene(getNativeObject(), scene.getNativeObject()));
        scene.clearNativeObject();
    }

    public void destroySkinningBuffer(SkinningBuffer skinningBuffer) {
        assertDestroy(nDestroySkinningBuffer(getNativeObject(), skinningBuffer.getNativeObject()));
        skinningBuffer.clearNativeObject();
    }

    public void destroySkybox(Skybox skybox) {
        assertDestroy(nDestroySkybox(getNativeObject(), skybox.getNativeObject()));
        skybox.clearNativeObject();
    }

    public void destroyStream(Stream stream) {
        assertDestroy(nDestroyStream(getNativeObject(), stream.getNativeObject()));
        stream.clearNativeObject();
    }

    public void destroySwapChain(SwapChain swapChain) {
        assertDestroy(nDestroySwapChain(getNativeObject(), swapChain.getNativeObject()));
        swapChain.clearNativeObject();
    }

    public void destroyTexture(Texture texture) {
        assertDestroy(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.clearNativeObject();
    }

    public void destroyVertexBuffer(VertexBuffer vertexBuffer) {
        assertDestroy(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject()));
        vertexBuffer.clearNativeObject();
    }

    public void destroyView(View view) {
        assertDestroy(nDestroyView(getNativeObject(), view.getNativeObject()));
        view.clearNativeObject();
    }

    public void enableAccurateTranslations() {
        getTransformManager().setAccurateTranslationsEnabled(true);
    }

    public void flush() {
        nFlush(getNativeObject());
    }

    public void flushAndWait() {
        flushAndWait(-1L);
    }

    public FeatureLevel getActiveFeatureLevel() {
        return sFeatureLevelValues[nGetActiveFeatureLevel(getNativeObject())];
    }

    public Backend getBackend() {
        return sBackendValues[(int) nGetBackend(getNativeObject())];
    }

    public Camera getCameraComponent(@Entity int i10) {
        long jNGetCameraComponent = nGetCameraComponent(getNativeObject(), i10);
        if (jNGetCameraComponent == 0) {
            return null;
        }
        return new Camera(jNGetCameraComponent, i10);
    }

    public Config getConfig() {
        if (this.mConfig == null) {
            this.mConfig = new Config();
        }
        return this.mConfig;
    }

    public EntityManager getEntityManager() {
        return this.mEntityManager;
    }

    public boolean getFeatureFlag(String str) {
        if (hasFeatureFlag(str)) {
            return nGetFeatureFlag(this.mNativeObject, str);
        }
        throw new IllegalArgumentException("The feature flag \"" + str + "\" doesn't exist");
    }

    public LightManager getLightManager() {
        return this.mLightManager;
    }

    public long getMaxStereoscopicEyes() {
        return nGetMaxStereoscopicEyes(getNativeObject());
    }

    @UsedByReflection("MaterialBuilder.java")
    public long getNativeJobSystem() {
        if (this.mNativeObject != 0) {
            return nGetJobSystem(getNativeObject());
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    public RenderableManager getRenderableManager() {
        return this.mRenderableManager;
    }

    public FeatureLevel getSupportedFeatureLevel() {
        return sFeatureLevelValues[nGetSupportedFeatureLevel(getNativeObject())];
    }

    public TransformManager getTransformManager() {
        return this.mTransformManager;
    }

    public boolean hasFeatureFlag(String str) {
        return nHasFeatureFlag(this.mNativeObject, str);
    }

    public boolean isAutomaticInstancingEnabled() {
        return nIsAutomaticInstancingEnabled(getNativeObject());
    }

    public boolean isPaused() {
        return nIsPaused(getNativeObject());
    }

    public boolean isValid() {
        return this.mNativeObject != 0;
    }

    public boolean isValidColorGrading(ColorGrading colorGrading) {
        return nIsValidColorGrading(getNativeObject(), colorGrading.getNativeObject());
    }

    public boolean isValidExpensiveMaterialInstance(MaterialInstance materialInstance) {
        return nIsValidExpensiveMaterialInstance(getNativeObject(), materialInstance.getNativeObject());
    }

    public boolean isValidFence(Fence fence) {
        return nIsValidFence(getNativeObject(), fence.getNativeObject());
    }

    public boolean isValidIndexBuffer(IndexBuffer indexBuffer) {
        return nIsValidIndexBuffer(getNativeObject(), indexBuffer.getNativeObject());
    }

    public boolean isValidIndirectLight(IndirectLight indirectLight) {
        return nIsValidIndirectLight(getNativeObject(), indirectLight.getNativeObject());
    }

    public boolean isValidMaterial(Material material) {
        return nIsValidMaterial(getNativeObject(), material.getNativeObject());
    }

    public boolean isValidMaterialInstance(Material material, MaterialInstance materialInstance) {
        return nIsValidMaterialInstance(getNativeObject(), material.getNativeObject(), materialInstance.getNativeObject());
    }

    public boolean isValidRenderTarget(RenderTarget renderTarget) {
        return nIsValidRenderTarget(getNativeObject(), renderTarget.getNativeObject());
    }

    public boolean isValidRenderer(Renderer renderer) {
        return nIsValidRenderer(getNativeObject(), renderer.getNativeObject());
    }

    public boolean isValidScene(Scene scene) {
        return nIsValidScene(getNativeObject(), scene.getNativeObject());
    }

    public boolean isValidSkinningBuffer(SkinningBuffer skinningBuffer) {
        return nIsValidSkinningBuffer(getNativeObject(), skinningBuffer.getNativeObject());
    }

    public boolean isValidSkybox(Skybox skybox) {
        return nIsValidSkybox(getNativeObject(), skybox.getNativeObject());
    }

    public boolean isValidStream(Stream stream) {
        return nIsValidStream(getNativeObject(), stream.getNativeObject());
    }

    public boolean isValidSwapChain(SwapChain swapChain) {
        return nIsValidSwapChain(getNativeObject(), swapChain.getNativeObject());
    }

    public boolean isValidTexture(Texture texture) {
        return nIsValidTexture(getNativeObject(), texture.getNativeObject());
    }

    public boolean isValidVertexBuffer(VertexBuffer vertexBuffer) {
        return nIsValidVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject());
    }

    public boolean isValidView(View view) {
        return nIsValidView(getNativeObject(), view.getNativeObject());
    }

    public FeatureLevel setActiveFeatureLevel(FeatureLevel featureLevel) {
        return sFeatureLevelValues[nSetActiveFeatureLevel(getNativeObject(), featureLevel.ordinal())];
    }

    public void setAutomaticInstancingEnabled(boolean z10) {
        nSetAutomaticInstancingEnabled(getNativeObject(), z10);
    }

    public boolean setFeatureFlag(String str, boolean z10) {
        return nSetFeatureFlag(this.mNativeObject, str, z10);
    }

    public void setPaused(boolean z10) {
        nSetPaused(getNativeObject(), z10);
    }

    public void unprotected() {
        nUnprotected(getNativeObject());
    }

    private Engine(long j10, Config config) {
        this.mNativeObject = j10;
        this.mTransformManager = new TransformManager(nGetTransformManager(j10));
        this.mLightManager = new LightManager(nGetLightManager(j10));
        this.mRenderableManager = new RenderableManager(nGetRenderableManager(j10));
        this.mEntityManager = new EntityManager(nGetEntityManager(j10));
        this.mConfig = config;
    }

    public static Engine create(Backend backend) {
        return new Builder().backend(backend).build();
    }

    public SwapChain createSwapChain(Object obj, long j10) {
        if (Platform.get().validateSurface(obj)) {
            long jNCreateSwapChain = nCreateSwapChain(getNativeObject(), obj, j10);
            if (jNCreateSwapChain != 0) {
                return new SwapChain(jNCreateSwapChain, obj);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid surface " + obj);
    }

    public boolean flushAndWait(long j10) {
        return nFlushAndWait(getNativeObject(), j10);
    }

    public static Engine create(Object obj) {
        return new Builder().sharedContext(obj).build();
    }

    public SwapChain createSwapChain(int i10, int i11, long j10) {
        if (i10 >= 0 && i11 >= 0) {
            long jNCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i10, i11, j10);
            if (jNCreateSwapChainHeadless != 0) {
                return new SwapChain(jNCreateSwapChainHeadless, null);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid parameters");
    }
}
