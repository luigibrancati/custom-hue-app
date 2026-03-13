package io.flutter.plugin.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import io.flutter.embedding.android.FlutterImageView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformOverlayView extends FlutterImageView {
    private AccessibilityEventsDelegate accessibilityDelegate;

    public PlatformOverlayView(Context context, int i10, int i11, AccessibilityEventsDelegate accessibilityEventsDelegate) {
        super(context, i10, i11, FlutterImageView.SurfaceKind.overlay);
        this.accessibilityDelegate = accessibilityEventsDelegate;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        AccessibilityEventsDelegate accessibilityEventsDelegate = this.accessibilityDelegate;
        if (accessibilityEventsDelegate == null || !accessibilityEventsDelegate.onAccessibilityHoverEvent(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }

    public PlatformOverlayView(Context context) {
        this(context, 1, 1, null);
    }

    public PlatformOverlayView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }
}
