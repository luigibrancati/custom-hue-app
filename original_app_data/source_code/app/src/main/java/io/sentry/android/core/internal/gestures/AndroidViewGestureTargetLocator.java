package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidViewGestureTargetLocator implements GestureTargetLocator {
    private static final String ORIGIN = "old_view_system";
    private final LazyEvaluator<Boolean> isAndroidXAvailable;

    public AndroidViewGestureTargetLocator(LazyEvaluator<Boolean> lazyEvaluator) {
        this.isAndroidXAvailable = lazyEvaluator;
    }

    private UiElement createUiElement(View view) {
        try {
            return new UiElement(view, ClassUtil.getClassName(view), ViewUtils.getResourceId(view), null, ORIGIN);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean isJetpackScrollingView(View view, boolean z10) {
        if (z10) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean isViewScrollable(View view, boolean z10) {
        return (isJetpackScrollingView(view, z10) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean isViewTappable(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.GestureTargetLocator
    public UiElement locate(Object obj, float f10, float f11, UiElement.Type type) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (type == UiElement.Type.CLICKABLE && isViewTappable(view)) {
            return createUiElement(view);
        }
        if (type == UiElement.Type.SCROLLABLE && isViewScrollable(view, this.isAndroidXAvailable.getValue().booleanValue())) {
            return createUiElement(view);
        }
        return null;
    }
}
