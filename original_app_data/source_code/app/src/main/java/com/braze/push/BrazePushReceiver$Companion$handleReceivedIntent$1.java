package com.braze.push;

import Rd.M;
import android.content.Context;
import android.content.Intent;
import com.braze.push.BrazePushReceiver;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.f;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", f = "BrazePushReceiver.kt", l = {}, m = "invokeSuspend")
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends m implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC4036s.b(obj);
        BrazePushReceiver.Companion companion = BrazePushReceiver.INSTANCE;
        Context applicationContext = this.$context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        companion.handlePush(applicationContext, this.$intent);
        return C4015H.f34254a;
    }
}
