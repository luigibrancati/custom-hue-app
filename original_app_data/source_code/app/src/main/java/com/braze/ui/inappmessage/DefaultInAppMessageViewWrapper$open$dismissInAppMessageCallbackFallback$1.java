package com.braze.ui.inappmessage;

import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import d.AbstractC3785D;
import kotlin.Metadata;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1", "Ld/D;", "Lfc/H;", "handleOnBackPressed", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 extends AbstractC3785D {
    public DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1() {
        super(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleOnBackPressed$lambda$0() {
        return "Fallback Back button intercepted by in-app message";
    }

    @Override // d.AbstractC3785D
    public void handleOnBackPressed() throws Exception {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.I0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1.handleOnBackPressed$lambda$0();
            }
        }, 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        remove();
    }
}
