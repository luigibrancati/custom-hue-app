package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "", "Landroid/view/View;", "inAppMessageView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lfc/H;", "beforeOpened", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;)V", "afterOpened", "beforeClosed", "afterClosed", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "onClicked", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "inAppMessageImmersive", "onButtonClicked", "(Lcom/braze/models/inappmessage/MessageButton;Lcom/braze/models/inappmessage/IInAppMessageImmersive;)V", "onDismissed", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(IInAppMessage inAppMessage);

    void afterOpened(View inAppMessageView, IInAppMessage inAppMessage);

    void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage);

    void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage);

    void onButtonClicked(MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive);

    void onClicked(View inAppMessageView, IInAppMessage inAppMessage);

    void onDismissed(View inAppMessageView, IInAppMessage inAppMessage);
}
