package com.braze.ui.inappmessage;

import android.app.Activity;
import android.os.Build;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "", "activity", "Landroid/app/Activity;", "inAppMessageView", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "<init>", "(Landroid/app/Activity;Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageBackEventHandler {
    private final IInAppMessageBackEventListener inAppMessageView;

    public InAppMessageBackEventHandler(Activity activity, IInAppMessageBackEventListener iInAppMessageBackEventListener) {
        AbstractC4862t.e(activity, "activity");
        this.inAppMessageView = iInAppMessageBackEventListener;
        if (Build.VERSION.SDK_INT < 34 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return;
        }
        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(activity, this));
    }
}
