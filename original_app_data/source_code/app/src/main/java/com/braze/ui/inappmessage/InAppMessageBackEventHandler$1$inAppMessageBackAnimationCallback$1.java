package com.braze.ui.inappmessage;

import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"com/braze/ui/inappmessage/InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1", "Landroid/window/OnBackAnimationCallback;", "Lfc/H;", "onBackInvoked", "()V", "Landroid/window/BackEvent;", "backEvent", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackCancelled", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 implements OnBackAnimationCallback {
    final /* synthetic */ Activity $it;
    final /* synthetic */ InAppMessageBackEventHandler this$0;

    public InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(Activity activity, InAppMessageBackEventHandler inAppMessageBackEventHandler) {
        this.$it = activity;
        this.this$0 = inAppMessageBackEventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackCancelled$lambda$3() {
        return "Back button intercepted by in-app message back animation callback, back event cancelled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackInvoked$lambda$0() {
        return "Back button intercepted by in-app message back animation callback, closing in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackProgressed$lambda$2() {
        return "Back button intercepted by in-app message back animation callback, back event in progress.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackStarted$lambda$1() {
        return "Back button intercepted by in-app message back animation callback, back event started.";
    }

    public void onBackCancelled() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.L0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackCancelled$lambda$3();
            }
        }, 7, (Object) null);
        super.onBackCancelled();
        IInAppMessageBackEventListener iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackCancelled();
        }
    }

    public void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.J0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackInvoked$lambda$0();
            }
        }, 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        this.$it.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this);
    }

    public void onBackProgressed(BackEvent backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.K0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackProgressed$lambda$2();
            }
        }, 7, (Object) null);
        super.onBackProgressed(backEvent);
        IInAppMessageBackEventListener iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackProgressed(backEvent);
        }
    }

    public void onBackStarted(BackEvent backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.M0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackStarted$lambda$1();
            }
        }, 7, (Object) null);
        super.onBackStarted(backEvent);
        IInAppMessageBackEventListener iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackStarted(backEvent);
        }
    }
}
