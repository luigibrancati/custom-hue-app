package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    public static UiElement findTarget(SentryAndroidOptions sentryAndroidOptions, View view, float f10, float f11, UiElement.Type type) {
        List<GestureTargetLocator> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (touchWithinBounds(view2, f10, f11)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
                for (int i11 = 0; i11 < gestureTargetLocators.size(); i11++) {
                    UiElement uiElementLocate = gestureTargetLocators.get(i11).locate(view2, f10, f11, type);
                    if (uiElementLocate != null) {
                        if (type == UiElement.Type.CLICKABLE) {
                            uiElement = uiElementLocate;
                        } else if (type == UiElement.Type.SCROLLABLE) {
                            return uiElementLocate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(View view) {
        int id2 = view.getId();
        if (id2 == -1 || isViewIdGenerated(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    public static String getResourceIdWithFallback(View view) {
        try {
            return getResourceId(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i10) {
        return ((-16777216) & i10) == 0 && (i10 & 16777215) != 0;
    }

    private static boolean touchWithinBounds(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        int[] iArr = coordinates;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return f10 >= ((float) i10) && f10 <= ((float) (i10 + view.getWidth())) && f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getHeight()));
    }
}
