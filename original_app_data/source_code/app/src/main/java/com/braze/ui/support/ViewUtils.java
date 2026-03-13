package com.braze.ui.support;

import Y0.C2553g;
import Y0.S;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.ViewUtils;
import io.sentry.ProfileChunk;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!\u001a\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!\u001a\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!\u001a\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroid/view/View;", "Lfc/H;", "removeViewFromParent", "(Landroid/view/View;)V", "setFocusableInTouchModeAndRequestFocus", "Landroid/content/Context;", "context", "", "valueInDp", "convertDpToPixels", "(Landroid/content/Context;D)D", "Landroid/app/Activity;", "", "isRunningOnTablet", "(Landroid/app/Activity;)Z", "", "requestedOrientation", "setActivityRequestedOrientation", "(Landroid/app/Activity;I)V", "view", "height", "setHeightOnViewLayoutParams", "(Landroid/view/View;I)V", "isDeviceInNightMode", "(Landroid/content/Context;)Z", "currentScreenOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "preferredOrientation", "isCurrentOrientationValid", "(ILcom/braze/enums/inappmessage/Orientation;)Z", "LY0/S;", "windowInsets", "getMaxSafeLeftInset", "(LY0/S;)I", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "(Landroid/view/View;)Z", "getStatusBarHeight", "(Landroid/content/Context;)I", "", "TAG", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ViewUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(Context context, double d10) {
        AbstractC4862t.e(context, "context");
        return d10 * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static final int getMaxSafeBottomInset(S windowInsets) {
        AbstractC4862t.e(windowInsets, "windowInsets");
        C2553g c2553gE = windowInsets.e();
        return Math.max(c2553gE != null ? c2553gE.a() : 0, windowInsets.f(S.o.h()).f10749d);
    }

    public static final int getMaxSafeLeftInset(S windowInsets) {
        AbstractC4862t.e(windowInsets, "windowInsets");
        C2553g c2553gE = windowInsets.e();
        return Math.max(c2553gE != null ? c2553gE.b() : 0, windowInsets.f(S.o.h()).f10746a);
    }

    public static final int getMaxSafeRightInset(S windowInsets) {
        AbstractC4862t.e(windowInsets, "windowInsets");
        C2553g c2553gE = windowInsets.e();
        return Math.max(c2553gE != null ? c2553gE.c() : 0, windowInsets.f(S.o.h()).f10748c);
    }

    public static final int getMaxSafeTopInset(S windowInsets) {
        AbstractC4862t.e(windowInsets, "windowInsets");
        C2553g c2553gE = windowInsets.e();
        return Math.max(c2553gE != null ? c2553gE.d() : 0, windowInsets.f(S.o.h()).f10747b);
    }

    public static final int getStatusBarHeight(Context context) {
        AbstractC4862t.e(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", ProfileChunk.PLATFORM_ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean isCurrentOrientationValid(final int i10, final Orientation preferredOrientation) {
        AbstractC4862t.e(preferredOrientation, "preferredOrientation");
        if (i10 == 2 && preferredOrientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: O5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ViewUtils.isCurrentOrientationValid$lambda$5();
                }
            }, 12, (Object) null);
            return true;
        }
        if (i10 == 1 && preferredOrientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: O5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ViewUtils.isCurrentOrientationValid$lambda$6();
                }
            }, 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: O5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ViewUtils.isCurrentOrientationValid$lambda$7(i10, preferredOrientation);
            }
        }, 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$5() {
        return "Current and preferred orientation are landscape.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$6() {
        return "Current and preferred orientation are portrait.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$7(int i10, Orientation orientation) {
        return "Current orientation " + i10 + " and preferred orientation " + orientation + " don't match";
    }

    public static final boolean isDeviceInNightMode(Context context) {
        AbstractC4862t.e(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        AbstractC4862t.e(view, "view");
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        AbstractC4862t.e(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static final void removeViewFromParent(final View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: O5.e
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return ViewUtils.removeViewFromParent$lambda$0();
                    }
                }, 12, (Object) null);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: O5.g
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return ViewUtils.removeViewFromParent$lambda$2();
                    }
                }, 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            AbstractC4862t.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            final ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: O5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ViewUtils.removeViewFromParent$lambda$1(view, viewGroup);
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    public static final void setActivityRequestedOrientation(final Activity activity, final int i10) {
        AbstractC4862t.e(activity, "<this>");
        try {
            activity.setRequestedOrientation(i10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: O5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ViewUtils.setActivityRequestedOrientation$lambda$4(i10, activity);
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setActivityRequestedOrientation$lambda$4(int i10, Activity activity) {
        return "Failed to set requested orientation " + i10 + " for activity class: " + activity.getLocalClassName();
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        AbstractC4862t.e(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: O5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ViewUtils.setFocusableInTouchModeAndRequestFocus$lambda$3();
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFocusableInTouchModeAndRequestFocus$lambda$3() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final void setHeightOnViewLayoutParams(View view, int i10) {
        AbstractC4862t.e(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }
}
