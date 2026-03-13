package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import fc.C4032o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010#¨\u0006."}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "Lfc/H;", "setImage", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "Landroid/content/Context;", "context", "", "icon", "", "iconColor", "iconBackgroundColor", "Landroid/widget/TextView;", "textView", "setIcon", "(Landroid/content/Context;Ljava/lang/String;IILandroid/widget/TextView;)V", "Landroid/view/View;", "view", "color", "setFrameColor", "(Landroid/view/View;Ljava/lang/Integer;)V", "setTextViewColor", "(Landroid/widget/TextView;I)V", "setViewBackgroundColor", "(Landroid/view/View;I)V", "setViewBackgroundColorFilter", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawableColor", "(Landroid/graphics/drawable/Drawable;I)V", "messageView", "headerView", "resetMessageMarginsIfNecessary", "(Landroid/widget/TextView;Landroid/widget/TextView;)V", "closeInAppMessageOnKeycodeBack", "Lcom/braze/enums/inappmessage/TextAlign;", "textAlign", "setTextAlignment", "(Landroid/widget/TextView;Lcom/braze/enums/inappmessage/TextAlign;)V", "setDrawableColorFilter", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppMessageViewUtils() {
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return InAppMessageViewUtils.closeInAppMessageOnKeycodeBack$lambda$3();
            }
        }, 7, (Object) null);
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageOnKeycodeBack$lambda$3() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }

    public static final void resetMessageMarginsIfNecessary(TextView messageView, TextView headerView) {
        if (headerView != null || messageView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageView.getLayoutParams().width, messageView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        messageView.setLayoutParams(layoutParams);
    }

    public static final void setDrawableColor(Drawable drawable, int color) {
        AbstractC4862t.e(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.v
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return InAppMessageViewUtils.setDrawableColor$lambda$2();
                    }
                }, 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                AbstractC4862t.d(drawable2, "getDrawable(...)");
                setDrawableColor(drawable2, color);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDrawableColor$lambda$2() {
        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
    }

    private final void setDrawableColorFilter(Drawable drawable, int color) {
        drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
    }

    public static final void setFrameColor(View view, Integer color) {
        AbstractC4862t.e(view, "view");
        if (color != null) {
            view.setBackgroundColor(color.intValue());
        }
    }

    public static final void setIcon(Context context, String icon, int iconColor, int iconBackgroundColor, TextView textView) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(textView, "textView");
        if (icon != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(icon);
                setTextViewColor(textView, iconColor);
                if (textView.getBackground() == null) {
                    setViewBackgroundColor(textView, iconBackgroundColor);
                    return;
                }
                Drawable background = textView.getBackground();
                AbstractC4862t.d(background, "getBackground(...)");
                setDrawableColor(background, iconBackgroundColor);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: M5.u
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return InAppMessageViewUtils.setIcon$lambda$0();
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setIcon$lambda$0() {
        return "Caught exception setting icon typeface. Not rendering icon.";
    }

    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        AbstractC4862t.e(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        int i10;
        AbstractC4862t.e(textView, "textView");
        AbstractC4862t.e(textAlign, "textAlign");
        int i11 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i11 == 1) {
            i10 = 8388611;
        } else if (i11 == 2) {
            i10 = 8388613;
        } else {
            if (i11 != 3) {
                throw new C4032o();
            }
            i10 = 17;
        }
        textView.setGravity(i10);
    }

    public static final void setTextViewColor(TextView textView, int color) {
        AbstractC4862t.e(textView, "textView");
        textView.setTextColor(color);
    }

    public static final void setViewBackgroundColor(View view, int color) {
        AbstractC4862t.e(view, "view");
        view.setBackgroundColor(color);
    }

    public static final void setViewBackgroundColorFilter(View view, int color) {
        AbstractC4862t.e(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        AbstractC4862t.d(background, "getBackground(...)");
        inAppMessageViewUtils.setDrawableColorFilter(background, color);
        view.getBackground().setAlpha(Color.alpha(color));
    }
}
