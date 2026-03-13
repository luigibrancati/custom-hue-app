package com.signify.hue.flutterreactiveble.channelhandlers;

import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.BleClient;
import com.signify.hue.flutterreactiveble.ble.ConnectionUpdate;
import com.signify.hue.flutterreactiveble.ble.ConnectionUpdateError;
import com.signify.hue.flutterreactiveble.ble.ConnectionUpdateSuccess;
import com.signify.hue.flutterreactiveble.converters.ProtobufMessageConverter;
import com.signify.hue.flutterreactiveble.utils.Duration;
import fc.C4015H;
import fc.C4032o;
import io.flutter.plugin.common.EventChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/signify/hue/flutterreactiveble/channelhandlers/DeviceConnectionHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "bleClient", "<init>", "(Lcom/signify/hue/flutterreactiveble/ble/BleClient;)V", "LHb/c;", "kotlin.jvm.PlatformType", "listenToConnectionChanges", "()LHb/c;", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceInfo;", "connectionUpdateMessage", "Lfc/H;", "handleDeviceConnectionUpdateResult", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceInfo;)V", "", "objectSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ConnectToDeviceRequest;", "connectToDeviceMessage", "connectToDevice", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$ConnectToDeviceRequest;)V", "", "deviceId", "disconnectDevice", "(Ljava/lang/String;)V", "disconnectAll", "()V", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "connectDeviceSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "converter", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "connectionUpdatesDisposable", "LHb/c;", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceConnectionHandler implements EventChannel.StreamHandler {
    private final BleClient bleClient;
    private EventChannel.EventSink connectDeviceSink;
    private Hb.c connectionUpdatesDisposable;
    private final ProtobufMessageConverter converter;

    public DeviceConnectionHandler(BleClient bleClient) {
        AbstractC4862t.e(bleClient, "bleClient");
        this.bleClient = bleClient;
        this.converter = new ProtobufMessageConverter();
    }

    private final void handleDeviceConnectionUpdateResult(ProtobufModel.DeviceInfo connectionUpdateMessage) {
        EventChannel.EventSink eventSink = this.connectDeviceSink;
        if (eventSink != null) {
            eventSink.success(connectionUpdateMessage.toByteArray());
        }
    }

    private final Hb.c listenToConnectionChanges() {
        Eb.k kVarF0 = this.bleClient.getConnectionUpdateSubject().f0(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.k
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnectionHandler.listenToConnectionChanges$lambda$1(this.f32593a, (ConnectionUpdate) obj);
            }
        };
        return kVarF0.s0(new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.l
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H listenToConnectionChanges$lambda$1(DeviceConnectionHandler deviceConnectionHandler, ConnectionUpdate connectionUpdate) {
        if (connectionUpdate instanceof ConnectionUpdateSuccess) {
            deviceConnectionHandler.handleDeviceConnectionUpdateResult(deviceConnectionHandler.converter.convertToDeviceInfo((ConnectionUpdateSuccess) connectionUpdate));
        } else {
            if (!(connectionUpdate instanceof ConnectionUpdateError)) {
                throw new C4032o();
            }
            ConnectionUpdateError connectionUpdateError = (ConnectionUpdateError) connectionUpdate;
            deviceConnectionHandler.handleDeviceConnectionUpdateResult(deviceConnectionHandler.converter.convertConnectionErrorToDeviceInfo(connectionUpdateError.getDeviceId(), connectionUpdateError.getErrorMessage()));
        }
        return C4015H.f34254a;
    }

    public final void connectToDevice(ProtobufModel.ConnectToDeviceRequest connectToDeviceMessage) {
        AbstractC4862t.e(connectToDeviceMessage, "connectToDeviceMessage");
        BleClient bleClient = this.bleClient;
        String deviceId = connectToDeviceMessage.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        bleClient.connectToDevice(deviceId, new Duration(connectToDeviceMessage.getTimeoutInMs(), TimeUnit.MILLISECONDS));
    }

    public final void disconnectAll() {
        this.connectDeviceSink = null;
        this.bleClient.disconnectAllDevices();
    }

    public final void disconnectDevice(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        this.bleClient.disconnectDevice(deviceId);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object objectSink) {
        disconnectAll();
        Hb.c cVar = this.connectionUpdatesDisposable;
        if (cVar == null) {
            AbstractC4862t.p("connectionUpdatesDisposable");
            cVar = null;
        }
        cVar.dispose();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object objectSink, EventChannel.EventSink eventSink) {
        if (eventSink != null) {
            this.connectDeviceSink = eventSink;
            Hb.c cVarListenToConnectionChanges = listenToConnectionChanges();
            AbstractC4862t.d(cVarListenToConnectionChanges, "listenToConnectionChanges(...)");
            this.connectionUpdatesDisposable = cVarListenToConnectionChanges;
        }
    }
}
