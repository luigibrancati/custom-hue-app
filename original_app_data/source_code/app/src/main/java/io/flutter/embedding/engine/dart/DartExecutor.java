package io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StringCodec;
import io.flutter.util.TraceSection;
import io.flutter.view.FlutterCallbackInformation;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DartExecutor implements BinaryMessenger {
    private static final String TAG = "DartExecutor";
    private final AssetManager assetManager;
    private final BinaryMessenger binaryMessenger;
    private final DartMessenger dartMessenger;
    private final long engineId;
    private final FlutterJNI flutterJNI;
    private boolean isApplicationRunning;
    private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
    private String isolateServiceId;
    private IsolateServiceIdListener isolateServiceIdListener;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DartCallback {
        public final AssetManager androidAssetManager;
        public final FlutterCallbackInformation callbackHandle;
        public final String pathToBundle;

        public DartCallback(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.androidAssetManager = assetManager;
            this.pathToBundle = str;
            this.callbackHandle = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.pathToBundle + ", library path: " + this.callbackHandle.callbackLibraryPath + ", function: " + this.callbackHandle.callbackName + " )";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DefaultBinaryMessenger implements BinaryMessenger {
        private final DartMessenger messenger;

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void disableBufferingIncomingMessages() {
            this.messenger.disableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void enableBufferingIncomingMessages() {
            this.messenger.enableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return this.messenger.makeBackgroundTaskQueue(taskQueueOptions);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void send(String str, ByteBuffer byteBuffer) {
            this.messenger.send(str, byteBuffer, null);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
            this.messenger.setMessageHandler(str, binaryMessageHandler);
        }

        private DefaultBinaryMessenger(DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            this.messenger.send(str, byteBuffer, binaryReply);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
            this.messenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IsolateServiceIdListener {
        void onIsolateServiceIdAvailable(String str);
    }

    public DartExecutor(FlutterJNI flutterJNI, AssetManager assetManager) {
        this(flutterJNI, assetManager, 0L);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void disableBufferingIncomingMessages() {
        this.dartMessenger.disableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void enableBufferingIncomingMessages() {
        this.dartMessenger.enableBufferingIncomingMessages();
    }

    public void executeDartCallback(DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartCallback");
        try {
            Log.v(TAG, "Executing Dart callback: " + dartCallback);
            FlutterJNI flutterJNI = this.flutterJNI;
            String str = dartCallback.pathToBundle;
            FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, null, this.engineId);
            this.isApplicationRunning = true;
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } finally {
        }
    }

    public void executeDartEntrypoint(DartEntrypoint dartEntrypoint) {
        executeDartEntrypoint(dartEntrypoint, null);
    }

    public BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.binaryMessenger.makeBackgroundTaskQueue(taskQueueOptions);
    }

    public void notifyLowMemoryWarning() {
        if (this.flutterJNI.isAttached()) {
            this.flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void onAttachedToJNI() {
        Log.v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
    }

    public void onDetachedFromJNI() {
        Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void send(String str, ByteBuffer byteBuffer) {
        this.binaryMessenger.send(str, byteBuffer);
    }

    public void setIsolateServiceIdListener(IsolateServiceIdListener isolateServiceIdListener) {
        String str;
        this.isolateServiceIdListener = isolateServiceIdListener;
        if (isolateServiceIdListener == null || (str = this.isolateServiceId) == null) {
            return;
        }
        isolateServiceIdListener.onIsolateServiceIdAvailable(str);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler);
    }

    public DartExecutor(FlutterJNI flutterJNI, AssetManager assetManager, long j10) {
        this.isApplicationRunning = false;
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = new BinaryMessenger.BinaryMessageHandler() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
            public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
                DartExecutor.this.isolateServiceId = StringCodec.INSTANCE.decodeMessage(byteBuffer);
                if (DartExecutor.this.isolateServiceIdListener != null) {
                    DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.isolateChannelMessageHandler = binaryMessageHandler;
        this.flutterJNI = flutterJNI;
        this.assetManager = assetManager;
        this.engineId = j10;
        DartMessenger dartMessenger = new DartMessenger(flutterJNI);
        this.dartMessenger = dartMessenger;
        dartMessenger.setMessageHandler("flutter/isolate", binaryMessageHandler);
        this.binaryMessenger = new DefaultBinaryMessenger(dartMessenger);
        if (flutterJNI.isAttached()) {
            this.isApplicationRunning = true;
        }
    }

    public void executeDartEntrypoint(DartEntrypoint dartEntrypoint, List<String> list) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartEntrypoint");
        try {
            Log.v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list, this.engineId);
            this.isApplicationRunning = true;
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } finally {
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        this.binaryMessenger.send(str, byteBuffer, binaryReply);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DartEntrypoint {
        public final String dartEntrypointFunctionName;
        public final String dartEntrypointLibrary;
        public final String pathToBundle;

        public DartEntrypoint(String str, String str2) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = null;
            this.dartEntrypointFunctionName = str2;
        }

        public static DartEntrypoint createDefault() {
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            if (flutterLoader.initialized()) {
                return new DartEntrypoint(flutterLoader.findAppBundlePath(), SentryThread.JsonKeys.MAIN);
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DartEntrypoint dartEntrypoint = (DartEntrypoint) obj;
            if (this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
                return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
            }
            return false;
        }

        public int hashCode() {
            return (this.pathToBundle.hashCode() * 31) + this.dartEntrypointFunctionName.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.pathToBundle + ", function: " + this.dartEntrypointFunctionName + " )";
        }

        public DartEntrypoint(String str, String str2, String str3) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = str2;
            this.dartEntrypointFunctionName = str3;
        }
    }
}
