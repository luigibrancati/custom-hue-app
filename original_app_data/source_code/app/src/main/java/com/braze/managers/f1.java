package com.braze.managers;

import com.braze.support.BrazeLogger;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 extends AbstractC4860q implements vc.r {
    public f1(h1 h1Var) {
        super(4, h1Var, h1.class, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // vc.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String p02 = (String) obj;
        BrazeLogger.Priority p12 = (BrazeLogger.Priority) obj2;
        String p22 = (String) obj3;
        AbstractC4862t.e(p02, "p0");
        AbstractC4862t.e(p12, "p1");
        AbstractC4862t.e(p22, "p2");
        ((h1) this.receiver).a(p02, p12, p22, (Throwable) obj4);
        return C4015H.f34254a;
    }
}
