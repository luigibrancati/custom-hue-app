package com.braze.ui.inappmessage.listeners;

import android.content.Context;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageThemeable;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "<init>", "()V", "beforeInAppMessageDisplayed", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageManagerListener implements IInAppMessageManagerListener {
    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
        Context mApplicationContext;
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        if ((inAppMessage instanceof IInAppMessageThemeable) && (mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext()) != null && ViewUtils.isDeviceInNightMode(mApplicationContext)) {
            ((IInAppMessageThemeable) inAppMessage).enableDarkTheme();
        }
        return InAppMessageOperation.DISPLAY_NOW;
    }
}
