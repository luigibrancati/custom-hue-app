package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", "url", "Landroid/os/Bundle;", "queryBundle", "Lfc/H;", "onCloseClicked", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/os/Bundle;)V", "", "onCustomEventFired", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/os/Bundle;)Z", "onOtherUrlAction", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
    }

    default boolean onCustomEventFired(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        return false;
    }

    default boolean onOtherUrlAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        return false;
    }
}
