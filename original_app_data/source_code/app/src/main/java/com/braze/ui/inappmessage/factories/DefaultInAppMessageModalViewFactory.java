package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageModalViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "<init>", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getAppropriateModalView", "isGraphic", "", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageModalViewFactory implements IInAppMessageViewFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$2(DefaultInAppMessageModalViewFactory defaultInAppMessageModalViewFactory, View view) {
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.INSTANCE;
        if (companion.getInstance().getDoesClickOutsideModalViewDismissInAppMessageViewField()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) defaultInAppMessageModalViewFactory, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: K5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2$lambda$1();
                }
            }, 6, (Object) null);
            companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$2$lambda$1() {
        return "Dismissing modal after frame click";
    }

    @SuppressLint({"InflateParams"})
    private final InAppMessageModalView getAppropriateModalView(Activity activity, boolean isGraphic) {
        if (isGraphic) {
            View viewInflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            AbstractC4862t.c(viewInflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
            return (InAppMessageModalView) viewInflate;
        }
        View viewInflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal, (ViewGroup) null);
        AbstractC4862t.c(viewInflate2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        return (InAppMessageModalView) viewInflate2;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        InAppMessageModal inAppMessageModal = (InAppMessageModal) inAppMessage;
        boolean z10 = inAppMessageModal.getImageStyle() == ImageStyle.GRAPHIC;
        InAppMessageModalView appropriateModalView = getAppropriateModalView(activity, z10);
        AbstractC4862t.b(applicationContext);
        appropriateModalView.applyInAppMessageParameters(applicationContext, inAppMessageModal);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageModal);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateModalView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_MODAL);
            }
        }
        View frameView = appropriateModalView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(new View.OnClickListener() { // from class: K5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2(this.f7484a, view);
                }
            });
        }
        appropriateModalView.setMessageBackgroundColor(inAppMessageModal.getBackgroundColor());
        Integer frameColor = inAppMessageModal.getFrameColor();
        if (frameColor != null) {
            appropriateModalView.setFrameColor(frameColor.intValue());
        }
        appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
        appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
        if (!z10) {
            String message = inAppMessageModal.getMessage();
            if (message != null) {
                appropriateModalView.setMessage(message);
            }
            appropriateModalView.setMessageTextColor(inAppMessageModal.getMessageTextColor());
            String header = inAppMessageModal.getHeader();
            if (header != null) {
                appropriateModalView.setMessageHeaderText(header);
            }
            appropriateModalView.setMessageHeaderTextColor(inAppMessageModal.getHeaderTextColor());
            String icon = inAppMessageModal.getIcon();
            if (icon != null) {
                appropriateModalView.setMessageIcon(icon, inAppMessageModal.getIconColor(), inAppMessageModal.getIconBackgroundColor());
            }
            appropriateModalView.setMessageHeaderTextAlignment(inAppMessageModal.getHeaderTextAlign());
            appropriateModalView.setMessageTextAlign(inAppMessageModal.getMessageTextAlign());
            appropriateModalView.resetMessageMargins(inAppMessageModal.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateModalView.getMessageImageView();
            AbstractC4862t.c(messageImageView2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            ((InAppMessageImageView) messageImageView2).setAspectRatio(2.9f);
        }
        appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
        appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
        return appropriateModalView;
    }
}
