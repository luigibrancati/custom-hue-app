package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class FlutterViewFactory extends PlatformViewFactory {
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    public FlutterViewFactory(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.instanceManager = androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        final Object androidWebkitLibraryPigeonInstanceManager = this.instanceManager.getInstance(r3.intValue());
        if (androidWebkitLibraryPigeonInstanceManager instanceof PlatformView) {
            return (PlatformView) androidWebkitLibraryPigeonInstanceManager;
        }
        if (androidWebkitLibraryPigeonInstanceManager instanceof View) {
            return new PlatformView() { // from class: io.flutter.plugins.webviewflutter.FlutterViewFactory.1
                @Override // io.flutter.plugin.platform.PlatformView
                public View getView() {
                    return (View) androidWebkitLibraryPigeonInstanceManager;
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void dispose() {
                }
            };
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + androidWebkitLibraryPigeonInstanceManager);
    }
}
