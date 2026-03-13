package io.flutter.embedding.android;

import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;
import z7.ApplicationC6530b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterPlayStoreSplitApplication extends ApplicationC6530b {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        FlutterInjector.setInstance(new FlutterInjector.Builder().setDeferredComponentManager(new PlayStoreDeferredComponentManager(this, null)).build());
    }
}
