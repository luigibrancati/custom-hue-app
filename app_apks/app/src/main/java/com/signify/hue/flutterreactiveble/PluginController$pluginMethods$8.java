package com.signify.hue.flutterreactiveble;

import fc.C4015H;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class PluginController$pluginMethods$8 extends AbstractC4860q implements vc.p {
    public PluginController$pluginMethods$8(Object obj) {
        super(2, obj, PluginController.class, "writeCharacteristicWithResponse", "writeCharacteristicWithResponse(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
    }

    @Override // vc.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MethodCall) obj, (MethodChannel.Result) obj2);
        return C4015H.f34254a;
    }

    public final void invoke(MethodCall p02, MethodChannel.Result p12) {
        AbstractC4862t.e(p02, "p0");
        AbstractC4862t.e(p12, "p1");
        ((PluginController) this.receiver).writeCharacteristicWithResponse(p02, p12);
    }
}
