package io.flutter.embedding.engine.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.util.HandlerCompat;
import io.flutter.util.TraceSection;
import io.flutter.view.VsyncWaiter;
import io.sentry.protocol.SdkVersion;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterLoader {
    static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String DISABLE_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.DisableMergedPlatformUIThread";
    private static final String ENABLE_FLUTTER_GPU = "io.flutter.embedding.android.EnableFlutterGPU";
    private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
    private static final String ENABLE_SURFACE_CONTROL = "io.flutter.embedding.android.EnableSurfaceControl";
    private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
    static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final String IMPELLER_ANTIALIAS_LINES = "io.flutter.embedding.android.ImpellerAntialiasLines";
    private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
    private static final String IMPELLER_LAZY_SHADER_MODE = "io.flutter.embedding.android.ImpellerLazyShaderInitialization";
    private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
    private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
    static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
    private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    static final String aotSharedLibraryNameFlag = "--aot-shared-library-name=";
    private static FlutterLoader instance;
    private ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    boolean initialized;
    private Settings settings;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class AnonymousClass1 implements Callable<InitResult> {
        final /* synthetic */ Context val$appContext;

        public AnonymousClass1(Context context) {
            this.val$appContext = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.flutter.embedding.engine.loader.FlutterLoader.InitResult call() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 411
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.loader.FlutterLoader.AnonymousClass1.call():io.flutter.embedding.engine.loader.FlutterLoader$InitResult");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        public /* synthetic */ InitResult(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    public static /* synthetic */ void a(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        flutterLoader.getClass();
        flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    public static /* synthetic */ void b(final FlutterLoader flutterLoader, final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        flutterLoader.getClass();
        try {
            flutterLoader.initResultFuture.get();
            HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.embedding.engine.loader.b
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterLoader.a(this.f37587a, context, strArr, handler, runnable);
                }
            });
        } catch (Exception e10) {
            Log.e(TAG, "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    private String fullAssetPathFrom(String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + File.separator + str;
    }

    private String getSafeAotSharedLibraryNameFlag(Context context, String str) throws IOException {
        if (!str.startsWith(aotSharedLibraryNameFlag)) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File fileFromPath = getFileFromPath(str.substring(26));
        try {
            String canonicalPath = fileFromPath.getCanonicalPath();
            boolean zStartsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return aotSharedLibraryNameFlag + canonicalPath;
            }
            Log.e(TAG, "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e(TAG, "External path " + fileFromPath.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceExtractor initResources(Context context) {
        return null;
    }

    private static boolean isLeakVM(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(Context context, String[] strArr) {
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
            try {
                InitResult initResult = this.initResultFuture.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.flutterApplicationInfo.nativeLibraryDir + File.separator + DEFAULT_LIBRARY);
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith(aotSharedLibraryNameFlag)) {
                            String safeAotSharedLibraryNameFlag = getSafeAotSharedLibraryNameFlag(context, str);
                            if (safeAotSharedLibraryNameFlag != null) {
                                str = safeAotSharedLibraryNameFlag;
                                arrayList.add(str);
                            } else {
                                Log.w(TAG, "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add(aotSharedLibraryNameFlag + this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add(aotSharedLibraryNameFlag + this.flutterApplicationInfo.nativeLibraryDir + File.separator + this.flutterApplicationInfo.aotSharedLibraryName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(initResult.engineCachesPath);
                arrayList.add(sb2.toString());
                if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                    arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                }
                if (this.settings.getLogTag() != null) {
                    arrayList.add("--log-tag=" + this.settings.getLogTag());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i10 = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
                if (i10 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i10 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i10);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey(ENABLE_IMPELLER_META_DATA_KEY)) {
                        if (bundle.getBoolean(ENABLE_IMPELLER_META_DATA_KEY)) {
                            arrayList.add(FlutterShellArgs.ARG_ENABLE_IMPELLER);
                        } else {
                            arrayList.add(FlutterShellArgs.ARG_DISABLE_IMPELLER);
                        }
                    }
                    if (bundle.getBoolean(ENABLE_VULKAN_VALIDATION_META_DATA_KEY, false)) {
                        arrayList.add(FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION);
                    }
                    if (bundle.getBoolean(IMPELLER_OPENGL_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean(IMPELLER_VULKAN_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean(DISABLE_MERGED_PLATFORM_UI_THREAD_KEY, false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean(ENABLE_FLUTTER_GPU, false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean(ENABLE_SURFACE_CONTROL, false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString(IMPELLER_BACKEND_META_DATA_KEY);
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean(IMPELLER_LAZY_SHADER_MODE)) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean(IMPELLER_ANTIALIAS_LINES)) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (isLeakVM(bundle) ? "true" : "false"));
                this.flutterJNI.init(context, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis, Build.VERSION.SDK_INT);
                this.initialized = true;
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                }
            } finally {
            }
        } catch (Exception e10) {
            Log.e(TAG, "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public void ensureInitializationCompleteAsync(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.a
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterLoader.b(this.f37582a, context, strArr, handler, runnable);
                }
            });
        }
    }

    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public File getFileFromPath(String str) {
        return new File(str);
    }

    public String getLookupKeyForAsset(String str) {
        return fullAssetPathFrom(str);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(Context context) {
        startInitialization(context, new Settings());
    }

    public FlutterLoader(FlutterJNI flutterJNI) {
        this(flutterJNI, FlutterInjector.instance().executorService());
    }

    public String getLookupKeyForAsset(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SdkVersion.JsonKeys.PACKAGES);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        return getLookupKeyForAsset(sb2.toString());
    }

    public void startInitialization(Context context, Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = SystemClock.uptimeMillis();
            this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
            VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
            this.initResultFuture = this.executorService.submit(new AnonymousClass1(applicationContext));
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } catch (Throwable th) {
            if (traceSectionScoped != null) {
                try {
                    traceSectionScoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public FlutterLoader(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }
}
