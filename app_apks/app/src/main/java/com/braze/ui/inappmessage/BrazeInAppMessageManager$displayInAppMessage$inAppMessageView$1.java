package com.braze.ui.inappmessage;

import Rd.M;
import android.app.Activity;
import com.braze.models.inappmessage.IInAppMessage;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.Metadata;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.f;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Landroid/view/View;", "<anonymous>", "(LRd/M;)Landroid/view/View;"}, k = 3, mv = {2, 0, 0})
@f(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1", f = "BrazeInAppMessageManager.kt", l = {}, m = "invokeSuspend")
public final class BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1 extends m implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ IInAppMessage $inAppMessage;
    final /* synthetic */ IInAppMessageViewFactory $inAppMessageViewFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(IInAppMessageViewFactory iInAppMessageViewFactory, Activity activity, IInAppMessage iInAppMessage, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.$inAppMessageViewFactory = iInAppMessageViewFactory;
        this.$activity = activity;
        this.$inAppMessage = iInAppMessage;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(this.$inAppMessageViewFactory, this.$activity, this.$inAppMessage, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC4036s.b(obj);
        return this.$inAppMessageViewFactory.createInAppMessageView(this.$activity, this.$inAppMessage);
    }
}
