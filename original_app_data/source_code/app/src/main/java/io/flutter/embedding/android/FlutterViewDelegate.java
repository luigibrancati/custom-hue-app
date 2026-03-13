package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.util.ViewUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterViewDelegate {
    public List<Rect> getCaptionBarInsets(Context context) {
        WindowInsets windowInsets = getWindowInsets(context);
        return windowInsets == null ? Collections.EMPTY_LIST : windowInsets.getBoundingRects(WindowInsets.Type.captionBar());
    }

    public WindowInsets getWindowInsets(Context context) {
        Window window;
        Activity activity = ViewUtils.getActivity(context);
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    public void growViewportMetricsToCaptionBar(Context context, FlutterRenderer.ViewportMetrics viewportMetrics) {
        List<Rect> captionBarInsets = getCaptionBarInsets(context);
        int iMax = viewportMetrics.viewPaddingTop;
        Iterator<Rect> it = captionBarInsets.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().bottom);
        }
        viewportMetrics.viewPaddingTop = iMax;
    }
}
