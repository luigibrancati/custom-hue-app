package io.flutter.embedding.engine.deferredcomponents;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface DeferredComponentManager {
    void destroy();

    String getDeferredComponentInstallState(int i10, String str);

    void installDeferredComponent(int i10, String str);

    void loadAssets(int i10, String str);

    void loadDartLibrary(int i10, String str);

    void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel);

    void setJNI(FlutterJNI flutterJNI);

    boolean uninstallDeferredComponent(int i10, String str);
}
