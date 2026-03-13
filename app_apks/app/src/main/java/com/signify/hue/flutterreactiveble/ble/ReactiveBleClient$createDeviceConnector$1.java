package com.signify.hue.flutterreactiveble.ble;

import dc.C3890a;
import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class ReactiveBleClient$createDeviceConnector$1 extends AbstractC4860q implements vc.l {
    public ReactiveBleClient$createDeviceConnector$1(Object obj) {
        super(1, obj, C3890a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    @Override // vc.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConnectionUpdate) obj);
        return C4015H.f34254a;
    }

    public final void invoke(ConnectionUpdate p02) {
        AbstractC4862t.e(p02, "p0");
        ((C3890a) this.receiver).c(p02);
    }
}
