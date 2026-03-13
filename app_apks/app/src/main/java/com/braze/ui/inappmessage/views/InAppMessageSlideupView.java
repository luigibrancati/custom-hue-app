package com.braze.ui.inappmessage.views;

import Y0.S;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageSlideupView;
import com.braze.ui.support.ViewUtils;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&¨\u00060"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", Session.JsonKeys.ATTRS, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lfc/H;", "applyInAppMessageParameters", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "color", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "setMessageChevron", "(ILcom/braze/enums/inappmessage/ClickAction;)V", "setMessageBackgroundColor", "(I)V", "", "imageRetrievalSuccessful", "resetMessageMargins", "(Z)V", "LY0/S;", "insets", "applyWindowInsets", "(LY0/S;)V", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Landroid/view/View;", "getMessageChevronView", "()Landroid/view/View;", "messageChevronView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageBackgroundObject", "messageBackgroundObject", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyWindowInsets$lambda$2() {
        return "Close button view is null or not of the expected class. Not applying window insets.";
    }

    private final View getMessageChevronView() {
        return findViewById(R$id.com_braze_inappmessage_slideup_chevron);
    }

    public final void applyInAppMessageParameters(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        }
        InAppMessageImageView inAppMessageImageView2 = this.inAppMessageImageView;
        if (inAppMessageImageView2 != null) {
            inAppMessageImageView2.setAltImageText(inAppMessage.getAltImageText());
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(S insets) {
        AbstractC4862t.e(insets, "insets");
        super.applyWindowInsets(insets);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: N5.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageSlideupView.applyWindowInsets$lambda$2();
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC4862t.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence text;
        super.resetMessageMargins(imageRetrievalSuccessful);
        TextView messageIconView = getMessageIconView();
        boolean z10 = false;
        if (messageIconView != null && (text = messageIconView.getText()) != null && text.length() != 0) {
            z10 = true;
        }
        if (imageRetrievalSuccessful || z10) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_slideup_image_layout);
        if (relativeLayout != null) {
            ViewUtils.removeViewFromParent(relativeLayout);
        }
        TextView textView = (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if (!((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable)) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View messageBackgroundObject2 = getMessageBackgroundObject();
        if (messageBackgroundObject2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject2, color);
        }
    }

    public final void setMessageChevron(int color, ClickAction clickAction) {
        AbstractC4862t.e(clickAction, "clickAction");
        if (clickAction == ClickAction.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView != null) {
                messageChevronView.setVisibility(8);
                return;
            }
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageChevronView2, color);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_slideup_container);
    }
}
