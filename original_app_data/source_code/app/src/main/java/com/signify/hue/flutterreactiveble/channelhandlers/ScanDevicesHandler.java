package com.signify.hue.flutterreactiveble.channelhandlers;

import android.os.ParcelUuid;
import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.BleClient;
import com.signify.hue.flutterreactiveble.ble.ScanInfo;
import com.signify.hue.flutterreactiveble.converters.ProtobufMessageConverter;
import com.signify.hue.flutterreactiveble.converters.UuidConverter;
import com.signify.hue.flutterreactiveble.model.ScanModeKt;
import fc.C4015H;
import gc.C4207u;
import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/signify/hue/flutterreactiveble/channelhandlers/ScanDevicesHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "bleClient", "<init>", "(Lcom/signify/hue/flutterreactiveble/ble/BleClient;)V", "Lfc/H;", "startDeviceScan", "()V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceScanInfo;", "discoveryMessage", "handleDeviceScanResult", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceScanInfo;)V", "", "objectSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "stopDeviceScan", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ScanForDevicesRequest;", "scanMessage", "prepareScan", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$ScanForDevicesRequest;)V", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "scanDevicesSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "LHb/c;", "scanForDevicesDisposable", "LHb/c;", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "converter", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanDevicesHandler implements EventChannel.StreamHandler {
    private static ScanParameters scanParameters;
    private final BleClient bleClient;
    private final ProtobufMessageConverter converter;
    private EventChannel.EventSink scanDevicesSink;
    private Hb.c scanForDevicesDisposable;

    public ScanDevicesHandler(BleClient bleClient) {
        AbstractC4862t.e(bleClient, "bleClient");
        this.bleClient = bleClient;
        this.converter = new ProtobufMessageConverter();
    }

    private final void handleDeviceScanResult(ProtobufModel.DeviceScanInfo discoveryMessage) {
        EventChannel.EventSink eventSink = this.scanDevicesSink;
        if (eventSink != null) {
            eventSink.success(discoveryMessage.toByteArray());
        }
    }

    private final void startDeviceScan() {
        ScanParameters scanParameters2 = scanParameters;
        if (scanParameters2 == null) {
            handleDeviceScanResult(this.converter.convertScanErrorInfo("Scanning parameters are not set"));
            return;
        }
        Eb.k kVarF0 = this.bleClient.scanForDevices(scanParameters2.getFilter(), scanParameters2.getMode(), scanParameters2.getLocationServiceIsMandatory()).f0(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.m
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ScanDevicesHandler.startDeviceScan$lambda$5$lambda$1(this.f32595a, (ScanInfo) obj);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.n
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.o
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ScanDevicesHandler.startDeviceScan$lambda$5$lambda$3(this.f32597a, (Throwable) obj);
            }
        };
        Hb.c cVarT0 = kVarF0.t0(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.p
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar2.invoke(obj);
            }
        });
        AbstractC4862t.d(cVarT0, "subscribe(...)");
        this.scanForDevicesDisposable = cVarT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H startDeviceScan$lambda$5$lambda$1(ScanDevicesHandler scanDevicesHandler, ScanInfo scanInfo) {
        ProtobufMessageConverter protobufMessageConverter = scanDevicesHandler.converter;
        AbstractC4862t.b(scanInfo);
        scanDevicesHandler.handleDeviceScanResult(protobufMessageConverter.convertScanInfo(scanInfo));
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H startDeviceScan$lambda$5$lambda$3(ScanDevicesHandler scanDevicesHandler, Throwable th) {
        scanDevicesHandler.handleDeviceScanResult(scanDevicesHandler.converter.convertScanErrorInfo(th.getMessage()));
        return C4015H.f34254a;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object objectSink) {
        stopDeviceScan();
        this.scanDevicesSink = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object objectSink, EventChannel.EventSink eventSink) {
        if (eventSink != null) {
            this.scanDevicesSink = eventSink;
            startDeviceScan();
        }
    }

    public final void prepareScan(ProtobufModel.ScanForDevicesRequest scanMessage) {
        AbstractC4862t.e(scanMessage, "scanMessage");
        stopDeviceScan();
        List<ProtobufModel.Uuid> serviceUuidsList = scanMessage.getServiceUuidsList();
        AbstractC4862t.d(serviceUuidsList, "getServiceUuidsList(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(serviceUuidsList, 10));
        for (ProtobufModel.Uuid uuid : serviceUuidsList) {
            UuidConverter uuidConverter = new UuidConverter();
            byte[] bArrA = uuid.getData().A();
            AbstractC4862t.d(bArrA, "toByteArray(...)");
            arrayList.add(new ParcelUuid(uuidConverter.uuidFromByteArray(bArrA)));
        }
        scanParameters = new ScanParameters(arrayList, ScanModeKt.createScanMode(scanMessage.getScanMode()), scanMessage.getRequireLocationServicesEnabled());
    }

    public final void stopDeviceScan() {
        Hb.c cVar = this.scanForDevicesDisposable;
        if (cVar != null) {
            if (cVar == null) {
                AbstractC4862t.p("scanForDevicesDisposable");
                cVar = null;
            }
            if (cVar.j()) {
                return;
            }
            cVar.dispose();
            scanParameters = null;
        }
    }
}
