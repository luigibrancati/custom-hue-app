package com.braze.managers;

import fc.C4015H;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 extends AbstractC4860q implements l {
    public d0(g0 g0Var) {
        super(1, g0Var, g0.class, "ingestDustMessages", "ingestDustMessages$android_sdk_base_release(Lcom/braze/models/dust/IDustMessage;)V", 0);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        com.braze.models.dust.g p02 = (com.braze.models.dust.g) obj;
        AbstractC4862t.e(p02, "p0");
        ((g0) this.receiver).a(p02);
        return C4015H.f34254a;
    }
}
