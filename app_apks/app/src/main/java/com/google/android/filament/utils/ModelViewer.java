package com.google.android.filament.utils;

import Rd.AbstractC2128g;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.filament.Camera;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityManager;
import com.google.android.filament.Fence;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TransformManager;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.DisplayHelper;
import com.google.android.filament.android.UiHelper;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.MaterialProvider;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
import com.google.android.filament.utils.Manipulator;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4204q;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.J;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.f;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\f\u0018\u0000 ¥\u00012\u00020\u0001:\u0004¦\u0001¥\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fB1\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010 J\r\u0010.\u001a\u00020\u0012¢\u0006\u0004\b.\u0010 J\u0015\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020:2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010A\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR(\u0010F\u001a\u0004\u0018\u00010E2\b\u0010A\u001a\u0004\u0018\u00010E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\"\u0010J\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010Q\u001a\u00020P2\u0006\u0010A\u001a\u00020P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010W\u001a\u00020P2\u0006\u0010A\u001a\u00020P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010R\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR*\u0010Z\u001a\u00020P2\u0006\u0010A\u001a\u00020P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR\u0017\u0010^\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u0016\u001a\u00020b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010l\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010q\u001a\u00020p8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R$\u0010|\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010w\u001a\u0004\b}\u0010y\"\u0004\b~\u0010{R\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0087\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009d\u0001R'\u0010 \u0001\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010¤\u0001\u001a\u00020P8F¢\u0006\u000e\u0012\u0005\b£\u0001\u0010 \u001a\u0005\b¢\u0001\u0010T¨\u0006§\u0001"}, d2 = {"Lcom/google/android/filament/utils/ModelViewer;", "Landroid/view/View$OnTouchListener;", "Lcom/google/android/filament/Engine;", "engine", "Lcom/google/android/filament/android/UiHelper;", "uiHelper", "<init>", "(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/google/android/filament/utils/Manipulator;", "manipulator", "(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "Landroid/view/TextureView;", "textureView", "(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "Lcom/google/android/filament/gltfio/FilamentAsset;", "asset", "Lfc/H;", "populateScene", "(Lcom/google/android/filament/gltfio/FilamentAsset;)V", "Landroid/view/View;", "view", "addDetachListener", "(Landroid/view/View;)V", "Lkotlin/Function1;", "", "Ljava/nio/Buffer;", "callback", "fetchResources", "(Lcom/google/android/filament/gltfio/FilamentAsset;Lvc/l;Llc/e;)Ljava/lang/Object;", "updateCameraProjection", "()V", "synchronizePendingFrames", "(Lcom/google/android/filament/Engine;)V", "buffer", "loadModelGlb", "(Ljava/nio/Buffer;)V", "loadModelGltf", "(Ljava/nio/Buffer;Lvc/l;)V", "loadModelGltfAsync", "Lcom/google/android/filament/utils/Float3;", "centerPoint", "transformToUnitCube", "(Lcom/google/android/filament/utils/Float3;)V", "clearRootTransform", "destroyModel", "", "frameTimeNanos", "render", "(J)V", "Landroid/graphics/Bitmap;", "debugGetNextFrameCallback", "(Lvc/l;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/google/android/filament/Engine;", "getEngine", "()Lcom/google/android/filament/Engine;", "Lcom/google/android/filament/android/UiHelper;", "value", "Lcom/google/android/filament/gltfio/FilamentAsset;", "getAsset", "()Lcom/google/android/filament/gltfio/FilamentAsset;", "Lcom/google/android/filament/gltfio/Animator;", "animator", "Lcom/google/android/filament/gltfio/Animator;", "getAnimator", "()Lcom/google/android/filament/gltfio/Animator;", "normalizeSkinningWeights", "Z", "getNormalizeSkinningWeights", "()Z", "setNormalizeSkinningWeights", "(Z)V", "", "cameraFocalLength", "F", "getCameraFocalLength", "()F", "setCameraFocalLength", "(F)V", "cameraNear", "getCameraNear", "setCameraNear", "cameraFar", "getCameraFar", "setCameraFar", "Lcom/google/android/filament/Scene;", "scene", "Lcom/google/android/filament/Scene;", "getScene", "()Lcom/google/android/filament/Scene;", "Lcom/google/android/filament/View;", "Lcom/google/android/filament/View;", "getView", "()Lcom/google/android/filament/View;", "Lcom/google/android/filament/Camera;", "camera", "Lcom/google/android/filament/Camera;", "getCamera", "()Lcom/google/android/filament/Camera;", "Lcom/google/android/filament/Renderer;", "renderer", "Lcom/google/android/filament/Renderer;", "getRenderer", "()Lcom/google/android/filament/Renderer;", "", "light", "I", "getLight", "()I", "Lcom/google/android/filament/Texture;", "indirectLightCubemap", "Lcom/google/android/filament/Texture;", "getIndirectLightCubemap", "()Lcom/google/android/filament/Texture;", "setIndirectLightCubemap", "(Lcom/google/android/filament/Texture;)V", "skyboxCubemap", "getSkyboxCubemap", "setSkyboxCubemap", "Lcom/google/android/filament/android/DisplayHelper;", "displayHelper", "Lcom/google/android/filament/android/DisplayHelper;", "cameraManipulator", "Lcom/google/android/filament/utils/Manipulator;", "Lcom/google/android/filament/utils/GestureDetector;", "gestureDetector", "Lcom/google/android/filament/utils/GestureDetector;", "Landroid/view/SurfaceView;", "Landroid/view/TextureView;", "LRd/z0;", "fetchResourcesJob", "LRd/z0;", "Lcom/google/android/filament/SwapChain;", "swapChain", "Lcom/google/android/filament/SwapChain;", "Lcom/google/android/filament/gltfio/AssetLoader;", "assetLoader", "Lcom/google/android/filament/gltfio/AssetLoader;", "Lcom/google/android/filament/gltfio/MaterialProvider;", "materialProvider", "Lcom/google/android/filament/gltfio/MaterialProvider;", "Lcom/google/android/filament/gltfio/ResourceLoader;", "resourceLoader", "Lcom/google/android/filament/gltfio/ResourceLoader;", "", "readyRenderables", "[I", "", "eyePos", "[D", "target", "upward", "debugFrameCallback", "Lvc/l;", "getProgress", "getProgress$annotations", "progress", "Companion", "SurfaceCallback", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModelViewer implements View.OnTouchListener {
    private static final Float3 kDefaultObjectPosition = new Float3(0.0f, 0.0f, -4.0f);
    private Animator animator;
    private FilamentAsset asset;
    private AssetLoader assetLoader;
    private final Camera camera;
    private float cameraFar;
    private float cameraFocalLength;
    private Manipulator cameraManipulator;
    private float cameraNear;
    private l debugFrameCallback;
    private DisplayHelper displayHelper;
    private final Engine engine;
    private final double[] eyePos;
    private InterfaceC2166z0 fetchResourcesJob;
    private GestureDetector gestureDetector;
    private Texture indirectLightCubemap;

    @Entity
    private final int light;
    private MaterialProvider materialProvider;
    private boolean normalizeSkinningWeights;
    private final int[] readyRenderables;
    private final Renderer renderer;
    private ResourceLoader resourceLoader;
    private final Scene scene;
    private Texture skyboxCubemap;
    private SurfaceView surfaceView;
    private SwapChain swapChain;
    private final double[] target;
    private TextureView textureView;
    private final UiHelper uiHelper;
    private final double[] upward;
    private final com.google.android.filament.View view;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;", "Lcom/google/android/filament/android/UiHelper$RendererCallback;", "<init>", "(Lcom/google/android/filament/utils/ModelViewer;)V", "Landroid/view/Surface;", "surface", "Lfc/H;", "onNativeWindowChanged", "(Landroid/view/Surface;)V", "onDetachedFromSurface", "()V", "", "width", "height", "onResized", "(II)V", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SurfaceCallback implements UiHelper.RendererCallback {
        public SurfaceCallback() {
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onDetachedFromSurface() {
            DisplayHelper displayHelper = ModelViewer.this.displayHelper;
            if (displayHelper == null) {
                AbstractC4862t.p("displayHelper");
                displayHelper = null;
            }
            displayHelper.detach();
            SwapChain swapChain = ModelViewer.this.swapChain;
            if (swapChain != null) {
                ModelViewer modelViewer = ModelViewer.this;
                modelViewer.getEngine().destroySwapChain(swapChain);
                modelViewer.getEngine().flushAndWait();
                modelViewer.swapChain = null;
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onNativeWindowChanged(Surface surface) {
            AbstractC4862t.e(surface, "surface");
            SwapChain swapChain = ModelViewer.this.swapChain;
            if (swapChain != null) {
                ModelViewer.this.getEngine().destroySwapChain(swapChain);
            }
            ModelViewer modelViewer = ModelViewer.this;
            modelViewer.swapChain = modelViewer.getEngine().createSwapChain(surface);
            SurfaceView surfaceView = ModelViewer.this.surfaceView;
            DisplayHelper displayHelper = null;
            if (surfaceView != null) {
                ModelViewer modelViewer2 = ModelViewer.this;
                DisplayHelper displayHelper2 = modelViewer2.displayHelper;
                if (displayHelper2 == null) {
                    AbstractC4862t.p("displayHelper");
                    displayHelper2 = null;
                }
                displayHelper2.attach(modelViewer2.getRenderer(), surfaceView.getDisplay());
            }
            TextureView textureView = ModelViewer.this.textureView;
            if (textureView != null) {
                ModelViewer modelViewer3 = ModelViewer.this;
                DisplayHelper displayHelper3 = modelViewer3.displayHelper;
                if (displayHelper3 == null) {
                    AbstractC4862t.p("displayHelper");
                } else {
                    displayHelper = displayHelper3;
                }
                displayHelper.attach(modelViewer3.getRenderer(), textureView.getDisplay());
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onResized(int width, int height) {
            ModelViewer.this.getView().setViewport(new Viewport(0, 0, width, height));
            Manipulator manipulator = ModelViewer.this.cameraManipulator;
            if (manipulator == null) {
                AbstractC4862t.p("cameraManipulator");
                manipulator = null;
            }
            manipulator.setViewport(width, height);
            ModelViewer.this.updateCameraProjection();
            ModelViewer modelViewer = ModelViewer.this;
            modelViewer.synchronizePendingFrames(modelViewer.getEngine());
        }
    }

    /* JADX INFO: renamed from: com.google.android.filament.utils.ModelViewer$fetchResources$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.google.android.filament.utils.ModelViewer$fetchResources$2", f = "ModelViewer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends m implements p {
        final /* synthetic */ FilamentAsset $asset;
        final /* synthetic */ HashMap<String, Buffer> $items;
        int label;
        final /* synthetic */ ModelViewer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HashMap<String, Buffer> map, ModelViewer modelViewer, FilamentAsset filamentAsset, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$items = map;
            this.this$0 = modelViewer;
            this.$asset = filamentAsset;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new AnonymousClass2(this.$items, this.this$0, this.$asset, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass2) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            for (Map.Entry<String, Buffer> entry : this.$items.entrySet()) {
                this.this$0.resourceLoader.addResourceData(entry.getKey(), entry.getValue());
            }
            this.this$0.resourceLoader.asyncBeginLoad(this.$asset);
            this.this$0.animator = this.$asset.getInstance().getAnimator();
            this.$asset.releaseSourceData();
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.filament.utils.ModelViewer$loadModelGltfAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.google.android.filament.utils.ModelViewer$loadModelGltfAsync$1", f = "ModelViewer.kt", l = {240}, m = "invokeSuspend")
    public static final class C31411 extends m implements p {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31411(l lVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$callback = lVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return ModelViewer.this.new C31411(this.$callback, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C31411) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                ModelViewer modelViewer = ModelViewer.this;
                FilamentAsset asset = modelViewer.getAsset();
                AbstractC4862t.b(asset);
                l lVar = this.$callback;
                this.label = 1;
                if (modelViewer.fetchResources(asset, lVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public ModelViewer(Engine engine, UiHelper uiHelper) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(uiHelper, "uiHelper");
        this.engine = engine;
        this.uiHelper = uiHelper;
        this.normalizeSkinningWeights = true;
        this.cameraFocalLength = 28.0f;
        this.cameraNear = 0.05f;
        this.cameraFar = 1000.0f;
        this.readyRenderables = new int[128];
        this.eyePos = new double[3];
        this.target = new double[3];
        this.upward = new double[3];
        this.renderer = engine.createRenderer();
        Scene sceneCreateScene = engine.createScene();
        this.scene = sceneCreateScene;
        Camera cameraCreateCamera = engine.createCamera(engine.getEntityManager().create());
        AbstractC4862t.d(cameraCreateCamera, "createCamera(...)");
        cameraCreateCamera.setExposure(16.0f, 0.008f, 100.0f);
        this.camera = cameraCreateCamera;
        com.google.android.filament.View viewCreateView = engine.createView();
        this.view = viewCreateView;
        viewCreateView.setScene(sceneCreateScene);
        viewCreateView.setCamera(cameraCreateCamera);
        UbershaderProvider ubershaderProvider = new UbershaderProvider(engine);
        this.materialProvider = ubershaderProvider;
        this.assetLoader = new AssetLoader(engine, ubershaderProvider, EntityManager.get());
        this.resourceLoader = new ResourceLoader(engine, this.normalizeSkinningWeights);
        int iCreate = EntityManager.get().create();
        this.light = iCreate;
        float[] fArrCct = Colors.cct(6500.0f);
        AbstractC4862t.d(fArrCct, "cct(...)");
        new LightManager.Builder(LightManager.Type.DIRECTIONAL).color(fArrCct[0], fArrCct[1], fArrCct[2]).intensity(100000.0f).direction(0.0f, -1.0f, 0.0f).castShadows(true).build(engine, iCreate);
        sceneCreateScene.addEntity(iCreate);
    }

    private final void addDetachListener(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.filament.utils.ModelViewer.addDetachListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
                AbstractC4862t.e(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                AbstractC4862t.e(v10, "v");
                ModelViewer.this.uiHelper.detach();
                ModelViewer.this.destroyModel();
                ModelViewer.this.assetLoader.destroy();
                ModelViewer.this.materialProvider.destroyMaterials();
                ModelViewer.this.materialProvider.destroy();
                ModelViewer.this.resourceLoader.destroy();
                if (ModelViewer.this.getIndirectLightCubemap() != null) {
                    Engine engine = ModelViewer.this.getEngine();
                    Texture indirectLightCubemap = ModelViewer.this.getIndirectLightCubemap();
                    AbstractC4862t.b(indirectLightCubemap);
                    engine.destroyTexture(indirectLightCubemap);
                    ModelViewer.this.setIndirectLightCubemap(null);
                }
                if (ModelViewer.this.getSkyboxCubemap() != null) {
                    Engine engine2 = ModelViewer.this.getEngine();
                    Texture skyboxCubemap = ModelViewer.this.getSkyboxCubemap();
                    AbstractC4862t.b(skyboxCubemap);
                    engine2.destroyTexture(skyboxCubemap);
                    ModelViewer.this.setSkyboxCubemap(null);
                }
                ModelViewer.this.getEngine().destroyEntity(ModelViewer.this.getLight());
                ModelViewer.this.getEngine().destroyRenderer(ModelViewer.this.getRenderer());
                ModelViewer.this.getEngine().destroyView(ModelViewer.this.getView());
                ModelViewer.this.getEngine().destroyScene(ModelViewer.this.getScene());
                ModelViewer.this.getEngine().destroyCameraComponent(ModelViewer.this.getCamera().getEntity());
                EntityManager.get().destroy(ModelViewer.this.getCamera().getEntity());
                EntityManager.get().destroy(ModelViewer.this.getLight());
                ModelViewer.this.getEngine().destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchResources(FilamentAsset filamentAsset, l lVar, InterfaceC4988e interfaceC4988e) {
        HashMap map = new HashMap();
        String[] resourceUris = filamentAsset.getResourceUris();
        AbstractC4862t.d(resourceUris, "getResourceUris(...)");
        for (String str : resourceUris) {
            AbstractC4862t.b(str);
            map.put(str, lVar.invoke(str));
        }
        Object objG = AbstractC2128g.g(C2123d0.c(), new AnonymousClass2(map, this, filamentAsset, null), interfaceC4988e);
        return objG == C5046c.f() ? objG : C4015H.f34254a;
    }

    private final void populateScene(final FilamentAsset asset) {
        RenderableManager renderableManager = this.engine.getRenderableManager();
        AbstractC4862t.d(renderableManager, "getRenderableManager(...)");
        final J j10 = new J();
        InterfaceC6082a interfaceC6082a = new InterfaceC6082a() { // from class: com.google.android.filament.utils.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(ModelViewer.populateScene$lambda$11(j10, asset, this));
            }
        };
        while (((Boolean) interfaceC6082a.invoke()).booleanValue()) {
            int i10 = j10.f39774a;
            for (int i11 = 0; i11 < i10; i11++) {
                renderableManager.setScreenSpaceContactShadows(renderableManager.getInstance(this.readyRenderables[i11]), true);
            }
            this.scene.addEntities(C4179C.U0(C4204q.E0(this.readyRenderables, j10.f39774a)));
        }
        this.scene.addEntities(asset.getLightEntities());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean populateScene$lambda$11(J j10, FilamentAsset filamentAsset, ModelViewer modelViewer) {
        int iPopRenderables = filamentAsset.popRenderables(modelViewer.readyRenderables);
        j10.f39774a = iPopRenderables;
        return iPopRenderables != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$10$lambda$9(ByteBuffer byteBuffer, Bitmap bitmap, l lVar) {
        byteBuffer.rewind();
        bitmap.copyPixelsFromBuffer(byteBuffer);
        lVar.invoke(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizePendingFrames(Engine engine) {
        Fence fenceCreateFence = engine.createFence();
        AbstractC4862t.d(fenceCreateFence, "createFence(...)");
        fenceCreateFence.wait(Fence.Mode.FLUSH, -1L);
        engine.destroyFence(fenceCreateFence);
    }

    public static /* synthetic */ void transformToUnitCube$default(ModelViewer modelViewer, Float3 float3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            float3 = kDefaultObjectPosition;
        }
        modelViewer.transformToUnitCube(float3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraProjection() {
        this.camera.setLensProjection(this.cameraFocalLength, ((double) this.view.getViewport().width) / ((double) this.view.getViewport().height), this.cameraNear, this.cameraFar);
    }

    public final void clearRootTransform() {
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            TransformManager transformManager = this.engine.getTransformManager();
            AbstractC4862t.d(transformManager, "getTransformManager(...)");
            transformManager.setTransform(transformManager.getInstance(filamentAsset.getRoot()), new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (AbstractC4854k) null).toFloatArray());
        }
    }

    public final void debugGetNextFrameCallback(l callback) {
        AbstractC4862t.e(callback, "callback");
        this.debugFrameCallback = callback;
    }

    public final void destroyModel() {
        InterfaceC2166z0 interfaceC2166z0 = this.fetchResourcesJob;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.resourceLoader.asyncCancelLoad();
        this.resourceLoader.evictResourceData();
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            this.scene.removeEntities(filamentAsset.getEntities());
            this.assetLoader.destroyAsset(filamentAsset);
            this.asset = null;
            this.animator = null;
        }
    }

    public final Animator getAnimator() {
        return this.animator;
    }

    public final FilamentAsset getAsset() {
        return this.asset;
    }

    public final Camera getCamera() {
        return this.camera;
    }

    public final float getCameraFar() {
        return this.cameraFar;
    }

    public final float getCameraFocalLength() {
        return this.cameraFocalLength;
    }

    public final float getCameraNear() {
        return this.cameraNear;
    }

    public final Engine getEngine() {
        return this.engine;
    }

    public final Texture getIndirectLightCubemap() {
        return this.indirectLightCubemap;
    }

    public final int getLight() {
        return this.light;
    }

    public final boolean getNormalizeSkinningWeights() {
        return this.normalizeSkinningWeights;
    }

    public final float getProgress() {
        return this.resourceLoader.asyncGetLoadProgress();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final Texture getSkyboxCubemap() {
        return this.skyboxCubemap;
    }

    public final com.google.android.filament.View getView() {
        return this.view;
    }

    public final void loadModelGlb(Buffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        destroyModel();
        FilamentAsset filamentAssetCreateAsset = this.assetLoader.createAsset(buffer);
        this.asset = filamentAssetCreateAsset;
        if (filamentAssetCreateAsset != null) {
            this.resourceLoader.asyncBeginLoad(filamentAssetCreateAsset);
            this.animator = filamentAssetCreateAsset.getInstance().getAnimator();
            filamentAssetCreateAsset.releaseSourceData();
        }
    }

    public final void loadModelGltf(Buffer buffer, l callback) {
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(callback, "callback");
        destroyModel();
        FilamentAsset filamentAssetCreateAsset = this.assetLoader.createAsset(buffer);
        this.asset = filamentAssetCreateAsset;
        if (filamentAssetCreateAsset != null) {
            for (String str : filamentAssetCreateAsset.getResourceUris()) {
                AbstractC4862t.b(str);
                Buffer buffer2 = (Buffer) callback.invoke(str);
                if (buffer2 == null) {
                    this.asset = null;
                    return;
                }
                this.resourceLoader.addResourceData(str, buffer2);
            }
            this.resourceLoader.asyncBeginLoad(filamentAssetCreateAsset);
            this.animator = filamentAssetCreateAsset.getInstance().getAnimator();
            filamentAssetCreateAsset.releaseSourceData();
        }
    }

    public final void loadModelGltfAsync(Buffer buffer, l callback) {
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(callback, "callback");
        destroyModel();
        this.asset = this.assetLoader.createAsset(buffer);
        this.fetchResourcesJob = AbstractC2132i.d(N.a(C2123d0.b()), null, null, new C31411(callback, null), 3, null);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        AbstractC4862t.e(view, "view");
        AbstractC4862t.e(event, "event");
        onTouchEvent(event);
        return true;
    }

    public final void onTouchEvent(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            AbstractC4862t.p("gestureDetector");
            gestureDetector = null;
        }
        gestureDetector.onTouchEvent(event);
    }

    public final void render(long frameTimeNanos) {
        if (this.uiHelper.isReadyToRender()) {
            this.resourceLoader.asyncUpdateLoad();
            FilamentAsset filamentAsset = this.asset;
            if (filamentAsset != null) {
                populateScene(filamentAsset);
            }
            Manipulator manipulator = this.cameraManipulator;
            if (manipulator == null) {
                AbstractC4862t.p("cameraManipulator");
                manipulator = null;
            }
            manipulator.getLookAt(this.eyePos, this.target, this.upward);
            Camera camera = this.camera;
            double[] dArr = this.eyePos;
            double d10 = dArr[0];
            double d11 = dArr[1];
            double d12 = dArr[2];
            double[] dArr2 = this.target;
            double d13 = dArr2[0];
            double d14 = dArr2[1];
            double d15 = dArr2[2];
            double[] dArr3 = this.upward;
            camera.lookAt(d10, d11, d12, d13, d14, d15, dArr3[0], dArr3[1], dArr3[2]);
            Renderer renderer = this.renderer;
            SwapChain swapChain = this.swapChain;
            AbstractC4862t.b(swapChain);
            if (renderer.beginFrame(swapChain, frameTimeNanos)) {
                this.renderer.render(this.view);
                final l lVar = this.debugFrameCallback;
                if (lVar != null) {
                    Viewport viewport = this.view.getViewport();
                    AbstractC4862t.d(viewport, "getViewport(...)");
                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewport.width, viewport.height, Bitmap.Config.ARGB_8888);
                    AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
                    final ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(viewport.width * viewport.height * 4);
                    this.renderer.readPixels(viewport.left, viewport.bottom, viewport.width, viewport.height, new Texture.PixelBufferDescriptor(byteBufferAllocateDirect, Texture.Format.RGBA, Texture.Type.UBYTE, 1, 0, 0, 0, new Handler(Looper.getMainLooper()), new Runnable() { // from class: com.google.android.filament.utils.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ModelViewer.render$lambda$10$lambda$9(byteBufferAllocateDirect, bitmapCreateBitmap, lVar);
                        }
                    }));
                    this.debugFrameCallback = null;
                }
                this.renderer.endFrame();
            }
        }
    }

    public final void setCameraFar(float f10) {
        this.cameraFar = f10;
        updateCameraProjection();
    }

    public final void setCameraFocalLength(float f10) {
        this.cameraFocalLength = f10;
        updateCameraProjection();
    }

    public final void setCameraNear(float f10) {
        this.cameraNear = f10;
        updateCameraProjection();
    }

    public final void setIndirectLightCubemap(Texture texture) {
        this.indirectLightCubemap = texture;
    }

    public final void setNormalizeSkinningWeights(boolean z10) {
        this.normalizeSkinningWeights = z10;
    }

    public final void setSkyboxCubemap(Texture texture) {
        this.skyboxCubemap = texture;
    }

    public final void transformToUnitCube(Float3 centerPoint) {
        AbstractC4862t.e(centerPoint, "centerPoint");
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            TransformManager transformManager = this.engine.getTransformManager();
            AbstractC4862t.d(transformManager, "getTransformManager(...)");
            float[] center = filamentAsset.getBoundingBox().getCenter();
            Float3 float3 = new Float3(center[0], center[1], center[2]);
            float[] halfExtent = filamentAsset.getBoundingBox().getHalfExtent();
            Float3 float32 = new Float3(halfExtent[0], halfExtent[1], halfExtent[2]);
            float fMax = 2.0f / (Math.max(float32.getX(), Math.max(float32.getY(), float32.getZ())) * 2.0f);
            Float3 float33 = new Float3(centerPoint.getX() / fMax, centerPoint.getY() / fMax, centerPoint.getZ() / fMax);
            transformManager.setTransform(transformManager.getInstance(filamentAsset.getRoot()), MatrixKt.transpose(MatrixKt.scale(new Float3(fMax)).times(MatrixKt.translation(new Float3(float3.getX() - float33.getX(), float3.getY() - float33.getY(), float3.getZ() - float33.getZ()).unaryMinus()))).toFloatArray());
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ ModelViewer(SurfaceView surfaceView, Engine engine, UiHelper uiHelper, Manipulator manipulator, int i10, AbstractC4854k abstractC4854k) {
        this(surfaceView, (i10 & 2) != 0 ? Engine.create() : engine, (i10 & 4) != 0 ? new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK) : uiHelper, (i10 & 8) != 0 ? null : manipulator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelViewer(SurfaceView surfaceView, Engine engine, UiHelper uiHelper, Manipulator manipulator) {
        this(engine, uiHelper);
        AbstractC4862t.e(surfaceView, "surfaceView");
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.Builder builder = new Manipulator.Builder();
            Float3 float3 = kDefaultObjectPosition;
            manipulator = builder.targetPosition(float3.getX(), float3.getY(), float3.getZ()).viewport(surfaceView.getWidth(), surfaceView.getHeight()).build(Manipulator.Mode.ORBIT);
            AbstractC4862t.d(manipulator, "build(...)");
        }
        this.cameraManipulator = manipulator;
        this.surfaceView = surfaceView;
        if (manipulator == null) {
            AbstractC4862t.p("cameraManipulator");
            manipulator = null;
        }
        this.gestureDetector = new GestureDetector(surfaceView, manipulator);
        this.displayHelper = new DisplayHelper(surfaceView.getContext());
        uiHelper.setRenderCallback(new SurfaceCallback());
        uiHelper.attachTo(surfaceView);
        addDetachListener(surfaceView);
    }

    public /* synthetic */ ModelViewer(TextureView textureView, Engine engine, UiHelper uiHelper, Manipulator manipulator, int i10, AbstractC4854k abstractC4854k) {
        this(textureView, (i10 & 2) != 0 ? Engine.create() : engine, (i10 & 4) != 0 ? new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK) : uiHelper, (i10 & 8) != 0 ? null : manipulator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelViewer(TextureView textureView, Engine engine, UiHelper uiHelper, Manipulator manipulator) {
        this(engine, uiHelper);
        AbstractC4862t.e(textureView, "textureView");
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.Builder builder = new Manipulator.Builder();
            Float3 float3 = kDefaultObjectPosition;
            manipulator = builder.targetPosition(float3.getX(), float3.getY(), float3.getZ()).viewport(textureView.getWidth(), textureView.getHeight()).build(Manipulator.Mode.ORBIT);
            AbstractC4862t.d(manipulator, "build(...)");
        }
        this.cameraManipulator = manipulator;
        this.textureView = textureView;
        if (manipulator == null) {
            AbstractC4862t.p("cameraManipulator");
            manipulator = null;
        }
        this.gestureDetector = new GestureDetector(textureView, manipulator);
        this.displayHelper = new DisplayHelper(textureView.getContext());
        uiHelper.setRenderCallback(new SurfaceCallback());
        uiHelper.attachTo(textureView);
        addDetachListener(textureView);
    }
}
