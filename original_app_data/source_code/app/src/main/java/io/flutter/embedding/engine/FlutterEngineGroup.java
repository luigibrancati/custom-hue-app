package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineGroup {
    final List<FlutterEngine> activeEngines;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Options {
        private Context context;
        private DartExecutor.DartEntrypoint dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private String initialRoute;
        private PlatformViewsController platformViewsController;
        private boolean automaticallyRegisterPlugins = true;
        private boolean waitForRestorationData = false;

        public Options(Context context) {
            this.context = context;
        }

        public boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public Context getContext() {
            return this.context;
        }

        public DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public String getInitialRoute() {
            return this.initialRoute;
        }

        public PlatformViewsController getPlatformViewsController() {
            return this.platformViewsController;
        }

        public boolean getWaitForRestorationData() {
            return this.waitForRestorationData;
        }

        public Options setAutomaticallyRegisterPlugins(boolean z10) {
            this.automaticallyRegisterPlugins = z10;
            return this;
        }

        public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint) {
            this.dartEntrypoint = dartEntrypoint;
            return this;
        }

        public Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public Options setPlatformViewsController(PlatformViewsController platformViewsController) {
            this.platformViewsController = platformViewsController;
            return this;
        }

        public Options setWaitForRestorationData(boolean z10) {
            this.waitForRestorationData = z10;
            return this;
        }
    }

    public FlutterEngineGroup(Context context) {
        this(context, null);
    }

    public FlutterEngine createAndRunDefaultEngine(Context context) {
        return createAndRunEngine(context, null);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, null);
    }

    public FlutterEngine createEngine(Context context, PlatformViewsController platformViewsController, boolean z10, boolean z11) {
        return new FlutterEngine(context, null, null, platformViewsController, null, z10, z11, this);
    }

    public FlutterEngineGroup(Context context, String[] strArr) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        if (flutterLoader.initialized()) {
            return;
        }
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str) {
        return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str));
    }

    public FlutterEngine createAndRunEngine(Options options) {
        final FlutterEngine flutterEngineSpawn;
        Context context = options.getContext();
        DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        String initialRoute = options.getInitialRoute();
        List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
        PlatformViewsController platformViewsController = options.getPlatformViewsController();
        if (platformViewsController == null) {
            platformViewsController = new PlatformViewsController();
        }
        PlatformViewsController platformViewsController2 = platformViewsController;
        boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
        boolean waitForRestorationData = options.getWaitForRestorationData();
        if (dartEntrypoint == null) {
            dartEntrypoint = DartExecutor.DartEntrypoint.createDefault();
        }
        DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            flutterEngineSpawn = createEngine(context, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
            if (initialRoute != null) {
                flutterEngineSpawn.getNavigationChannel().setInitialRoute(initialRoute);
            }
            flutterEngineSpawn.getDartExecutor().executeDartEntrypoint(dartEntrypoint2, dartEntrypointArgs);
        } else {
            flutterEngineSpawn = this.activeEngines.get(0).spawn(context, dartEntrypoint2, initialRoute, dartEntrypointArgs, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
        }
        this.activeEngines.add(flutterEngineSpawn);
        flutterEngineSpawn.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                FlutterEngineGroup.this.activeEngines.remove(flutterEngineSpawn);
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        return flutterEngineSpawn;
    }
}
