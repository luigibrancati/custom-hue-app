package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4205s;
import io.sentry.SentryOptions;
import io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\"\u0018\u0010(\u001a\u00020\u0012*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/view/View;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parentNode", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lfc/H;", "traverse", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/SentryOptions;)V", "Lfc/q;", "", "Landroid/graphics/Rect;", "isVisibleToUser", "(Landroid/view/View;)Lfc/q;", "Landroid/graphics/drawable/Drawable;", "isMaskable", "(Landroid/graphics/drawable/Drawable;)Z", "Lio/sentry/android/replay/util/TextLayout;", "globalRect", "", "paddingLeft", "paddingTop", "", "getVisibleRects", "(Lio/sentry/android/replay/util/TextLayout;Landroid/graphics/Rect;II)Ljava/util/List;", "toOpaque", "(I)I", "Landroid/view/ViewTreeObserver$OnDrawListener;", "listener", "addOnDrawListenerSafe", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "removeOnDrawListenerSafe", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "addOnPreDrawListenerSafe", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "removeOnPreDrawListenerSafe", "hasSize", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "getTotalPaddingTopSafe", "(Landroid/widget/TextView;)I", "totalPaddingTopSafe", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewsKt {
    public static final void addOnDrawListenerSafe(View view, ViewTreeObserver.OnDrawListener listener) {
        AbstractC4862t.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void addOnPreDrawListenerSafe(View view, ViewTreeObserver.OnPreDrawListener listener) {
        AbstractC4862t.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int getTotalPaddingTopSafe(TextView textView) {
        AbstractC4862t.e(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List<Rect> getVisibleRects(TextLayout textLayout, Rect globalRect, int i10, int i11) {
        AbstractC4862t.e(globalRect, "globalRect");
        if (textLayout == null) {
            return C4205s.d(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i12 = 0; i12 < lineCount; i12++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i12, textLayout.getLineStart(i12));
            int ellipsisCount = textLayout.getEllipsisCount(i12);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i12);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i12, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i12, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i12);
            int lineBottom = textLayout.getLineBottom(i12);
            Rect rect = new Rect();
            int i13 = globalRect.left + i10 + primaryHorizontal;
            rect.left = i13;
            rect.right = i13 + (primaryHorizontal2 - primaryHorizontal);
            int i14 = globalRect.top + i11 + lineTop;
            rect.top = i14;
            rect.bottom = i14 + (lineBottom - lineTop);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean hasSize(View view) {
        AbstractC4862t.e(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    @SuppressLint({"ObsoleteSdkInt", "UseRequiresApi"})
    @TargetApi(21)
    public static final boolean isMaskable(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final C4034q isVisibleToUser(View view) {
        AbstractC4862t.e(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return AbstractC4040w.a(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return AbstractC4040w.a(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = ((View) parent).getTransitionAlpha();
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return AbstractC4040w.a(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return AbstractC4040w.a(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void removeOnDrawListenerSafe(View view, ViewTreeObserver.OnDrawListener listener) {
        AbstractC4862t.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void removeOnPreDrawListenerSafe(View view, ViewTreeObserver.OnPreDrawListener listener) {
        AbstractC4862t.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int toOpaque(int i10) {
        return i10 | (-16777216);
    }

    @SuppressLint({"UseKtx"})
    public static final void traverse(View view, ViewHierarchyNode parentNode, SentryOptions options) {
        AbstractC4862t.e(view, "<this>");
        AbstractC4862t.e(parentNode, "parentNode");
        AbstractC4862t.e(options, "options");
        if ((view instanceof ViewGroup) && !ComposeViewHierarchyNode.INSTANCE.fromView(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(viewHierarchyNodeFromView);
                    traverse(childAt, viewHierarchyNodeFromView, options);
                }
            }
            parentNode.setChildren(arrayList);
        }
    }
}
