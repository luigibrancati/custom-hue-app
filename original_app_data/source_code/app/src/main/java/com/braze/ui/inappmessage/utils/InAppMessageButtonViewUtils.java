package com.braze.ui.inappmessage.utils;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.R$dimen;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageButtonViewUtils;", "", "<init>", "()V", "", "Landroid/view/View;", "buttonViews", "Lcom/braze/models/inappmessage/MessageButton;", "messageButtons", "Lfc/H;", "setButtons", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/widget/Button;", "button", "messageButton", "", "strokeWidth", "strokeFocusedWidth", "setButton", "(Landroid/widget/Button;Lcom/braze/models/inappmessage/MessageButton;II)V", "Landroid/content/Context;", "context", "drawableId", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "newStrokeWidth", "", "isFocused", "getButtonDrawable", "(Landroid/content/Context;Lcom/braze/models/inappmessage/MessageButton;IIZ)Landroid/graphics/drawable/Drawable;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageButtonViewUtils {
    public static final InAppMessageButtonViewUtils INSTANCE = new InAppMessageButtonViewUtils();

    private InAppMessageButtonViewUtils() {
    }

    public static final Drawable getButtonDrawable(Context context, MessageButton messageButton, int newStrokeWidth, int strokeFocusedWidth, boolean isFocused) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(messageButton, "messageButton");
        Drawable drawable = getDrawable(context, R$drawable.com_braze_inappmessage_button_background);
        drawable.mutate();
        AbstractC4862t.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        Drawable drawableFindDrawableByLayerId = ((RippleDrawable) drawable).findDrawableByLayerId(R$id.com_braze_inappmessage_button_background_ripple_internal_gradient);
        AbstractC4862t.c(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
        if (isFocused) {
            newStrokeWidth = strokeFocusedWidth;
        }
        gradientDrawable.setStroke(newStrokeWidth, messageButton.getBorderColor());
        gradientDrawable.setColor(messageButton.getBackgroundColor());
        return drawable;
    }

    public static final Drawable getDrawable(Context context, int drawableId) {
        AbstractC4862t.e(context, "context");
        Drawable drawable = context.getResources().getDrawable(drawableId, null);
        AbstractC4862t.d(drawable, "getDrawable(...)");
        return drawable;
    }

    public static final void setButton(Button button, MessageButton messageButton, int strokeWidth, int strokeFocusedWidth) {
        AbstractC4862t.e(button, "button");
        AbstractC4862t.e(messageButton, "messageButton");
        button.setText(messageButton.getText());
        button.setContentDescription(messageButton.getText());
        InAppMessageViewUtils.setTextViewColor(button, messageButton.getTextColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator(null);
        Context context = button.getContext();
        AbstractC4862t.d(context, "getContext(...)");
        Drawable buttonDrawable = getButtonDrawable(context, messageButton, strokeWidth, strokeFocusedWidth, false);
        Context context2 = button.getContext();
        AbstractC4862t.d(context2, "getContext(...)");
        stateListDrawable.addState(new int[]{R.attr.state_focused}, getButtonDrawable(context2, messageButton, strokeWidth, strokeFocusedWidth, true));
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, buttonDrawable);
        button.setBackground(stateListDrawable);
    }

    public static final void setButtons(List<? extends View> buttonViews, List<? extends MessageButton> messageButtons) {
        AbstractC4862t.e(buttonViews, "buttonViews");
        AbstractC4862t.e(messageButtons, "messageButtons");
        int size = buttonViews.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = buttonViews.get(i10);
            MessageButton messageButton = messageButtons.get(i10);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (messageButtons.size() <= i10) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                setButton((Button) view, messageButton, dimensionPixelSize, dimensionPixelSize2);
            }
        }
    }
}
