package io.flutter.util;

import C3.t;
import C3.v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.util.ViewUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DisplayUpdater {
        void updateDisplayMetrics(float f10, float f11, float f12);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ViewVisitor {
        boolean run(View view);
    }

    public static /* synthetic */ boolean b(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static void calculateMaximumDisplayMetrics(Context context, DisplayUpdater displayUpdater) {
        Activity activity = getActivity(context);
        if (activity != null) {
            t tVarB = v.a().b(activity);
            displayUpdater.updateDisplayMetrics(tVarB.a().width(), tVarB.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(View view) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ib.b
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return view2.hasFocus();
            }
        });
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(View view, final Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ib.a
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return ViewUtils.b(clsArr, view2);
            }
        });
    }

    public static boolean traverseHierarchy(View view, ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (traverseHierarchy(viewGroup.getChildAt(i10), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
