package io.flutter.plugins.webviewflutter;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class DisplayListenerProxy {
    private static final String TAG = "DisplayListenerProxy";
    private ArrayList<DisplayManager.DisplayListener> listenersBeforeWebView;

    private static ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners(DisplayManager displayManager) {
        return new ArrayList<>();
    }

    public void onPostWebViewInitialization(final DisplayManager displayManager) {
        final ArrayList<DisplayManager.DisplayListener> arrayListYoinkDisplayListeners = yoinkDisplayListeners(displayManager);
        arrayListYoinkDisplayListeners.removeAll(this.listenersBeforeWebView);
        if (arrayListYoinkDisplayListeners.isEmpty()) {
            return;
        }
        Iterator<DisplayManager.DisplayListener> it = arrayListYoinkDisplayListeners.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener(it.next());
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: io.flutter.plugins.webviewflutter.DisplayListenerProxy.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i10) {
                    Iterator it2 = arrayListYoinkDisplayListeners.iterator();
                    while (it2.hasNext()) {
                        ((DisplayManager.DisplayListener) it2.next()).onDisplayAdded(i10);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i10) {
                    if (displayManager.getDisplay(i10) == null) {
                        return;
                    }
                    Iterator it2 = arrayListYoinkDisplayListeners.iterator();
                    while (it2.hasNext()) {
                        ((DisplayManager.DisplayListener) it2.next()).onDisplayChanged(i10);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i10) {
                    Iterator it2 = arrayListYoinkDisplayListeners.iterator();
                    while (it2.hasNext()) {
                        ((DisplayManager.DisplayListener) it2.next()).onDisplayRemoved(i10);
                    }
                }
            }, null);
        }
    }

    public void onPreWebViewInitialization(DisplayManager displayManager) {
        this.listenersBeforeWebView = yoinkDisplayListeners(displayManager);
    }
}
