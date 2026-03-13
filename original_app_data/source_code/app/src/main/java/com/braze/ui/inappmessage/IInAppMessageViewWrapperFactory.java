package com.braze.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H&J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "", "createInAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageView", "Landroid/view/View;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "openingAnimation", "Landroid/view/animation/Animation;", "closingAnimation", "clickableInAppMessageView", "buttons", "", "closeButton", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageViewWrapperFactory {
    IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation openingAnimation, Animation closingAnimation, View clickableInAppMessageView);

    IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation openingAnimation, Animation closingAnimation, View clickableInAppMessageView, List<? extends View> buttons, View closeButton);
}
