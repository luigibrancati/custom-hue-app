package com.signify.hue.flutterreactiveble.channelhandlers;

import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.BleClient;
import com.signify.hue.flutterreactiveble.ble.BleStatus;
import fc.C4015H;
import io.flutter.plugin.common.EventChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/signify/hue/flutterreactiveble/channelhandlers/BleStatusHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "bleClient", "<init>", "(Lcom/signify/hue/flutterreactiveble/ble/BleClient;)V", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "LHb/c;", "listenToBleStatus", "(Lio/flutter/plugin/common/EventChannel$EventSink;)LHb/c;", "", "arg", "Lfc/H;", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "LHb/g;", "subscriptionDisposable", "LHb/g;", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BleStatusHandler implements EventChannel.StreamHandler {
    private static final long delayListenBleStatus = 500;
    private final BleClient bleClient;
    private final Hb.g subscriptionDisposable;

    public BleStatusHandler(BleClient bleClient) {
        AbstractC4862t.e(bleClient, "bleClient");
        this.bleClient = bleClient;
        this.subscriptionDisposable = new Hb.g();
    }

    private final Hb.c listenToBleStatus(final EventChannel.EventSink eventSink) {
        Eb.k kVarI0 = Eb.k.I0(delayListenBleStatus, TimeUnit.MILLISECONDS);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return BleStatusHandler.listenToBleStatus$lambda$0(this.f32581a, (Long) obj);
            }
        };
        Eb.k kVarF0 = kVarI0.y0(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.b
            @Override // Jb.e
            public final Object apply(Object obj) {
                return BleStatusHandler.listenToBleStatus$lambda$1(lVar, obj);
            }
        }).f0(Gb.a.a());
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return BleStatusHandler.listenToBleStatus$lambda$2(eventSink, (BleStatus) obj);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.d
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar2.invoke(obj);
            }
        };
        final vc.l lVar3 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.e
            @Override // vc.l
            public final Object invoke(Object obj) {
                return BleStatusHandler.listenToBleStatus$lambda$4(eventSink, (Throwable) obj);
            }
        };
        Hb.c cVarT0 = kVarF0.t0(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.f
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        });
        AbstractC4862t.d(cVarT0, "subscribe(...)");
        return cVarT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n listenToBleStatus$lambda$0(BleStatusHandler bleStatusHandler, Long it) {
        AbstractC4862t.e(it, "it");
        return bleStatusHandler.bleClient.observeBleStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n listenToBleStatus$lambda$1(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H listenToBleStatus$lambda$2(EventChannel.EventSink eventSink, BleStatus bleStatus) {
        eventSink.success(((ProtobufModel.BleStatusInfo) ProtobufModel.BleStatusInfo.newBuilder().setStatus(bleStatus.getCode()).build()).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H listenToBleStatus$lambda$4(EventChannel.EventSink eventSink, Throwable th) {
        eventSink.error("ObserveBleStatusFailure", th.getMessage(), null);
        return C4015H.f34254a;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arg) {
        this.subscriptionDisposable.a(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arg, EventChannel.EventSink eventSink) {
        this.subscriptionDisposable.a(eventSink != null ? listenToBleStatus(eventSink) : null);
    }
}
