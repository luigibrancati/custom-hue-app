package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "beforeInAppMessageDisplayed", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "onInAppMessageClicked", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "Lcom/braze/models/inappmessage/MessageButton;", "button", "onInAppMessageButtonClicked", "(Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/models/inappmessage/MessageButton;)Z", "Lfc/H;", "onInAppMessageDismissed", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "Landroid/view/View;", "inAppMessageView", "beforeInAppMessageViewOpened", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;)V", "afterInAppMessageViewOpened", "beforeInAppMessageViewClosed", "afterInAppMessageViewClosed", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
    }

    default void afterInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
    }

    InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage);

    default void beforeInAppMessageViewClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
    }

    default void beforeInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage inAppMessage, MessageButton button) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(button, "button");
        return false;
    }

    default boolean onInAppMessageClicked(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        return false;
    }

    default void onInAppMessageDismissed(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
    }
}
