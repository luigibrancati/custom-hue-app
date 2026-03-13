package com.braze.ui.inappmessage.views;

import android.window.BackEvent;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "", "Landroid/window/BackEvent;", "backEvent", "Lfc/H;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackCancelled", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageBackEventListener {
    /* JADX INFO: Access modifiers changed from: private */
    static String onBackStarted$lambda$0() {
        return "IInAppMessageBackEventListener: onBackStarted() called.";
    }

    void onBackCancelled();

    void onBackProgressed(BackEvent backEvent);

    default void onBackStarted(BackEvent backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: N5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return IInAppMessageBackEventListener.onBackStarted$lambda$0();
            }
        }, 6, (Object) null);
    }
}
