package com.braze.ui.inappmessage;

import Rd.M;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$2", f = "BrazeInAppMessageManager.kt", l = {252}, m = "invokeSuspend")
public final class BrazeInAppMessageManager$registerInAppMessageManager$5$2 extends m implements p {
    final /* synthetic */ IInAppMessage $it;
    int label;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$registerInAppMessageManager$5$2(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.this$0 = brazeInAppMessageManager;
        this.$it = iInAppMessage;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this.this$0, this.$it, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((BrazeInAppMessageManager$registerInAppMessageManager$5$2) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            BrazeInAppMessageManager brazeInAppMessageManager = this.this$0;
            IInAppMessage iInAppMessage = this.$it;
            this.label = 1;
            if (brazeInAppMessageManager.displayInAppMessage(iInAppMessage, true, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
        }
        return C4015H.f34254a;
    }
}
