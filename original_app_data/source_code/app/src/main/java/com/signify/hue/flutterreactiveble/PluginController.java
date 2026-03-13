package com.signify.hue.flutterreactiveble;

import android.content.Context;
import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.BleClient;
import com.signify.hue.flutterreactiveble.ble.CharOperationFailed;
import com.signify.hue.flutterreactiveble.ble.CharOperationResult;
import com.signify.hue.flutterreactiveble.ble.CharOperationSuccessful;
import com.signify.hue.flutterreactiveble.ble.MtuNegotiateFailed;
import com.signify.hue.flutterreactiveble.ble.MtuNegotiateResult;
import com.signify.hue.flutterreactiveble.ble.ReactiveBleClient;
import com.signify.hue.flutterreactiveble.ble.RequestConnectionPriorityFailed;
import com.signify.hue.flutterreactiveble.ble.RequestConnectionPriorityResult;
import com.signify.hue.flutterreactiveble.channelhandlers.BleStatusHandler;
import com.signify.hue.flutterreactiveble.channelhandlers.CharNotificationHandler;
import com.signify.hue.flutterreactiveble.channelhandlers.DeviceConnectionHandler;
import com.signify.hue.flutterreactiveble.channelhandlers.ScanDevicesHandler;
import com.signify.hue.flutterreactiveble.converters.ProtobufMessageConverter;
import com.signify.hue.flutterreactiveble.converters.UuidConverter;
import com.signify.hue.flutterreactiveble.model.ClearGattCacheErrorType;
import com.signify.hue.flutterreactiveble.utils.BleWrapperExtensionsKt;
import com.signify.hue.flutterreactiveble.utils.DiscardKt;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4032o;
import gc.C4179C;
import gc.C4204q;
import gc.Q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJQ\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000620\u0010\u001b\u001a,\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\nJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\nJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\nJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\nJ\u001f\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\bH\u0000¢\u0006\u0004\b+\u0010\u0003J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010\nR2\u00101\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/signify/hue/flutterreactiveble/PluginController;", "", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "Lfc/H;", "initializeClient", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "deinitializeClient", "scanForDevices", "connectToDevice", "clearGattCache", "disconnectFromDevice", "readCharacteristic", "writeCharacteristicWithResponse", "writeCharacteristicWithoutResponse", "Lkotlin/Function5;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "", "Ljava/util/UUID;", "", "", "LEb/r;", "Lcom/signify/hue/flutterreactiveble/ble/CharOperationResult;", "writeOperation", "executeWriteAndPropagateResultToChannel", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lvc/s;)V", "readNotifications", "stopNotifications", "negotiateMtuSize", "requestConnectionPriority", "discoverServices", "readRssi", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", "context", "initialize$reactive_ble_mobile_release", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V", "initialize", "deinitialize$reactive_ble_mobile_release", "deinitialize", "execute$reactive_ble_mobile_release", "execute", "", "Lkotlin/Function2;", "pluginMethods", "Ljava/util/Map;", "bleClient", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "Lio/flutter/plugin/common/EventChannel;", "scanchannel", "Lio/flutter/plugin/common/EventChannel;", "deviceConnectionChannel", "charNotificationChannel", "Lcom/signify/hue/flutterreactiveble/channelhandlers/ScanDevicesHandler;", "scanDevicesHandler", "Lcom/signify/hue/flutterreactiveble/channelhandlers/ScanDevicesHandler;", "Lcom/signify/hue/flutterreactiveble/channelhandlers/DeviceConnectionHandler;", "deviceConnectionHandler", "Lcom/signify/hue/flutterreactiveble/channelhandlers/DeviceConnectionHandler;", "Lcom/signify/hue/flutterreactiveble/channelhandlers/CharNotificationHandler;", "charNotificationHandler", "Lcom/signify/hue/flutterreactiveble/channelhandlers/CharNotificationHandler;", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "uuidConverter", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "protoConverter", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PluginController {
    private BleClient bleClient;
    private EventChannel charNotificationChannel;
    private CharNotificationHandler charNotificationHandler;
    private EventChannel deviceConnectionChannel;
    private DeviceConnectionHandler deviceConnectionHandler;
    private ScanDevicesHandler scanDevicesHandler;
    private EventChannel scanchannel;
    private final Map<String, vc.p> pluginMethods = Q.l(AbstractC4040w.a("initialize", new PluginController$pluginMethods$1(this)), AbstractC4040w.a("deinitialize", new PluginController$pluginMethods$2(this)), AbstractC4040w.a("scanForDevices", new PluginController$pluginMethods$3(this)), AbstractC4040w.a("connectToDevice", new PluginController$pluginMethods$4(this)), AbstractC4040w.a("clearGattCache", new PluginController$pluginMethods$5(this)), AbstractC4040w.a("disconnectFromDevice", new PluginController$pluginMethods$6(this)), AbstractC4040w.a("readCharacteristic", new PluginController$pluginMethods$7(this)), AbstractC4040w.a("writeCharacteristicWithResponse", new PluginController$pluginMethods$8(this)), AbstractC4040w.a("writeCharacteristicWithoutResponse", new PluginController$pluginMethods$9(this)), AbstractC4040w.a("readNotifications", new PluginController$pluginMethods$10(this)), AbstractC4040w.a("stopNotifications", new PluginController$pluginMethods$11(this)), AbstractC4040w.a("negotiateMtuSize", new PluginController$pluginMethods$12(this)), AbstractC4040w.a("requestConnectionPriority", new PluginController$pluginMethods$13(this)), AbstractC4040w.a("discoverServices", new PluginController$pluginMethods$14(this)), AbstractC4040w.a("getDiscoveredServices", new PluginController$pluginMethods$15(this)), AbstractC4040w.a("readRssi", new PluginController$pluginMethods$16(this)));
    private final UuidConverter uuidConverter = new UuidConverter();
    private final ProtobufMessageConverter protoConverter = new ProtobufMessageConverter();

    /* JADX INFO: renamed from: com.signify.hue.flutterreactiveble.PluginController$writeCharacteristicWithResponse$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends AbstractC4860q implements vc.s {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(5, BleClient.class, "writeCharacteristicWithResponse", "writeCharacteristicWithResponse(Ljava/lang/String;Ljava/util/UUID;I[B)Lio/reactivex/Single;", 0);
        }

        public final Eb.r invoke(BleClient p02, String p12, UUID p22, int i10, byte[] p42) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            AbstractC4862t.e(p22, "p2");
            AbstractC4862t.e(p42, "p4");
            return p02.writeCharacteristicWithResponse(p12, p22, i10, p42);
        }

        @Override // vc.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return invoke((BleClient) obj, (String) obj2, (UUID) obj3, ((Number) obj4).intValue(), (byte[]) obj5);
        }
    }

    /* JADX INFO: renamed from: com.signify.hue.flutterreactiveble.PluginController$writeCharacteristicWithoutResponse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C37531 extends AbstractC4860q implements vc.s {
        public static final C37531 INSTANCE = new C37531();

        public C37531() {
            super(5, BleClient.class, "writeCharacteristicWithoutResponse", "writeCharacteristicWithoutResponse(Ljava/lang/String;Ljava/util/UUID;I[B)Lio/reactivex/Single;", 0);
        }

        public final Eb.r invoke(BleClient p02, String p12, UUID p22, int i10, byte[] p42) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            AbstractC4862t.e(p22, "p2");
            AbstractC4862t.e(p42, "p4");
            return p02.writeCharacteristicWithoutResponse(p12, p22, i10, p42);
        }

        @Override // vc.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return invoke((BleClient) obj, (String) obj2, (UUID) obj3, ((Number) obj4).intValue(), (byte[]) obj5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearGattCache(MethodCall call, final MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.ClearGattCacheRequest from = ProtobufModel.ClearGattCacheRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        Eb.a aVarH = bleClient.clearGattCache(deviceId).h(Gb.a.a());
        Jb.a aVar = new Jb.a() { // from class: com.signify.hue.flutterreactiveble.z
            @Override // Jb.a
            public final void run() {
                PluginController.clearGattCache$lambda$0(result);
            }
        };
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.A
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.clearGattCache$lambda$1(this.f32488a, result, (Throwable) obj2);
            }
        };
        DiscardKt.discard(aVarH.l(aVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.b
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearGattCache$lambda$0(MethodChannel.Result result) {
        result.success(ProtobufModel.ClearGattCacheInfo.getDefaultInstance().toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H clearGattCache$lambda$1(PluginController pluginController, MethodChannel.Result result, Throwable th) {
        result.success(pluginController.protoConverter.convertClearGattCacheError(ClearGattCacheErrorType.UNKNOWN, th.getMessage()).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectToDevice(MethodCall call, MethodChannel.Result result) {
        DeviceConnectionHandler deviceConnectionHandler = null;
        result.success(null);
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.ConnectToDeviceRequest from = ProtobufModel.ConnectToDeviceRequest.parseFrom((byte[]) obj);
        DeviceConnectionHandler deviceConnectionHandler2 = this.deviceConnectionHandler;
        if (deviceConnectionHandler2 == null) {
            AbstractC4862t.p("deviceConnectionHandler");
        } else {
            deviceConnectionHandler = deviceConnectionHandler2;
        }
        AbstractC4862t.b(from);
        deviceConnectionHandler.connectToDevice(from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deinitializeClient(MethodCall call, MethodChannel.Result result) {
        deinitialize$reactive_ble_mobile_release();
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnectFromDevice(MethodCall call, MethodChannel.Result result) {
        DeviceConnectionHandler deviceConnectionHandler = null;
        result.success(null);
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.DisconnectFromDeviceRequest from = ProtobufModel.DisconnectFromDeviceRequest.parseFrom((byte[]) obj);
        DeviceConnectionHandler deviceConnectionHandler2 = this.deviceConnectionHandler;
        if (deviceConnectionHandler2 == null) {
            AbstractC4862t.p("deviceConnectionHandler");
        } else {
            deviceConnectionHandler = deviceConnectionHandler2;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        deviceConnectionHandler.disconnectDevice(deviceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discoverServices(MethodCall call, final MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        final ProtobufModel.DiscoverServicesRequest from = ProtobufModel.DiscoverServicesRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        Eb.r rVarY = bleClient.discoverServices(deviceId).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.k
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.discoverServices$lambda$19(result, this, from, (ka.Q) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.m
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.n
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.discoverServices$lambda$21(result, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.o
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H discoverServices$lambda$19(MethodChannel.Result result, PluginController pluginController, ProtobufModel.DiscoverServicesRequest discoverServicesRequest, ka.Q q10) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        String deviceId = discoverServicesRequest.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        AbstractC4862t.b(q10);
        result.success(protobufMessageConverter.convertDiscoverServicesInfo(deviceId, q10).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H discoverServices$lambda$21(MethodChannel.Result result, Throwable th) {
        String string = th.toString();
        StackTraceElement[] stackTrace = th.getStackTrace();
        AbstractC4862t.d(stackTrace, "getStackTrace(...)");
        result.error("service_discovery_failure", string, C4204q.O0(stackTrace).toString());
        return C4015H.f34254a;
    }

    private final void executeWriteAndPropagateResultToChannel(MethodCall call, final MethodChannel.Result result, vc.s writeOperation) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        final ProtobufModel.WriteCharacteristicRequest from = ProtobufModel.WriteCharacteristicRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        BleClient bleClient2 = bleClient;
        String deviceId = from.getCharacteristic().getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        UuidConverter uuidConverter = this.uuidConverter;
        byte[] bArrA = from.getCharacteristic().getCharacteristicUuid().getData().A();
        AbstractC4862t.d(bArrA, "toByteArray(...)");
        UUID uuidUuidFromByteArray = uuidConverter.uuidFromByteArray(bArrA);
        String characteristicInstanceId = from.getCharacteristic().getCharacteristicInstanceId();
        AbstractC4862t.d(characteristicInstanceId, "getCharacteristicInstanceId(...)");
        Integer numValueOf = Integer.valueOf(Integer.parseInt(characteristicInstanceId));
        byte[] bArrA2 = from.getValue().A();
        AbstractC4862t.d(bArrA2, "toByteArray(...)");
        Eb.r rVarY = ((Eb.r) writeOperation.invoke(bleClient2, deviceId, uuidUuidFromByteArray, numValueOf, bArrA2)).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.a
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.executeWriteAndPropagateResultToChannel$lambda$7(result, this, from, (CharOperationResult) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.l
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.t
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.executeWriteAndPropagateResultToChannel$lambda$9(result, this, from, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.u
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H executeWriteAndPropagateResultToChannel$lambda$7(MethodChannel.Result result, PluginController pluginController, ProtobufModel.WriteCharacteristicRequest writeCharacteristicRequest, CharOperationResult charOperationResult) {
        if (charOperationResult instanceof CharOperationSuccessful) {
            ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
            AbstractC4862t.b(writeCharacteristicRequest);
            result.success(protobufMessageConverter.convertWriteCharacteristicInfo(writeCharacteristicRequest, null).toByteArray());
        } else {
            if (!(charOperationResult instanceof CharOperationFailed)) {
                throw new C4032o();
            }
            ProtobufMessageConverter protobufMessageConverter2 = pluginController.protoConverter;
            AbstractC4862t.b(writeCharacteristicRequest);
            result.success(protobufMessageConverter2.convertWriteCharacteristicInfo(writeCharacteristicRequest, ((CharOperationFailed) charOperationResult).getErrorMessage()).toByteArray());
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H executeWriteAndPropagateResultToChannel$lambda$9(MethodChannel.Result result, PluginController pluginController, ProtobufModel.WriteCharacteristicRequest writeCharacteristicRequest, Throwable th) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        AbstractC4862t.b(writeCharacteristicRequest);
        result.success(protobufMessageConverter.convertWriteCharacteristicInfo(writeCharacteristicRequest, th.getMessage()).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeClient(MethodCall call, MethodChannel.Result result) {
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        bleClient.initializeClient();
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void negotiateMtuSize(MethodCall call, final MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        final ProtobufModel.NegotiateMtuRequest from = ProtobufModel.NegotiateMtuRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        Eb.r rVarY = bleClient.negotiateMtuSize(deviceId, from.getMtuSize()).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.v
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.negotiateMtuSize$lambda$11(result, this, (MtuNegotiateResult) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.w
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.x
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.negotiateMtuSize$lambda$13(result, this, from, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.y
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H negotiateMtuSize$lambda$11(MethodChannel.Result result, PluginController pluginController, MtuNegotiateResult mtuNegotiateResult) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        AbstractC4862t.b(mtuNegotiateResult);
        result.success(protobufMessageConverter.convertNegotiateMtuInfo(mtuNegotiateResult).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H negotiateMtuSize$lambda$13(MethodChannel.Result result, PluginController pluginController, ProtobufModel.NegotiateMtuRequest negotiateMtuRequest, Throwable th) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        String deviceId = negotiateMtuRequest.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        result.success(protobufMessageConverter.convertNegotiateMtuInfo(new MtuNegotiateFailed(deviceId, message)).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readCharacteristic(MethodCall call, MethodChannel.Result result) {
        BleClient bleClient = null;
        result.success(null);
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        final ProtobufModel.ReadCharacteristicRequest from = ProtobufModel.ReadCharacteristicRequest.parseFrom((byte[]) obj);
        String deviceId = from.getCharacteristic().getDeviceId();
        UuidConverter uuidConverter = this.uuidConverter;
        byte[] bArrA = from.getCharacteristic().getCharacteristicUuid().getData().A();
        AbstractC4862t.d(bArrA, "toByteArray(...)");
        UUID uuidUuidFromByteArray = uuidConverter.uuidFromByteArray(bArrA);
        String characteristicInstanceId = from.getCharacteristic().getCharacteristicInstanceId();
        AbstractC4862t.d(characteristicInstanceId, "getCharacteristicInstanceId(...)");
        int i10 = Integer.parseInt(characteristicInstanceId);
        BleClient bleClient2 = this.bleClient;
        if (bleClient2 == null) {
            AbstractC4862t.p("bleClient");
        } else {
            bleClient = bleClient2;
        }
        AbstractC4862t.b(deviceId);
        Eb.r rVarY = bleClient.readCharacteristic(deviceId, uuidUuidFromByteArray, i10).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.p
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.readCharacteristic$lambda$3(this.f32616a, from, (CharOperationResult) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.q
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.r
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.readCharacteristic$lambda$5(this.f32619a, from, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.s
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H readCharacteristic$lambda$3(PluginController pluginController, ProtobufModel.ReadCharacteristicRequest readCharacteristicRequest, CharOperationResult charOperationResult) {
        CharNotificationHandler charNotificationHandler = null;
        if (charOperationResult instanceof CharOperationSuccessful) {
            ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
            ProtobufModel.CharacteristicAddress characteristic = readCharacteristicRequest.getCharacteristic();
            AbstractC4862t.d(characteristic, "getCharacteristic(...)");
            ProtobufModel.CharacteristicValueInfo characteristicValueInfoConvertCharacteristicInfo = protobufMessageConverter.convertCharacteristicInfo(characteristic, C4179C.P0(((CharOperationSuccessful) charOperationResult).getValue()));
            CharNotificationHandler charNotificationHandler2 = pluginController.charNotificationHandler;
            if (charNotificationHandler2 == null) {
                AbstractC4862t.p("charNotificationHandler");
            } else {
                charNotificationHandler = charNotificationHandler2;
            }
            charNotificationHandler.addSingleReadToStream(characteristicValueInfoConvertCharacteristicInfo);
        } else {
            if (!(charOperationResult instanceof CharOperationFailed)) {
                throw new C4032o();
            }
            ProtobufMessageConverter protobufMessageConverter2 = pluginController.protoConverter;
            ProtobufModel.CharacteristicAddress characteristic2 = readCharacteristicRequest.getCharacteristic();
            AbstractC4862t.d(characteristic2, "getCharacteristic(...)");
            protobufMessageConverter2.convertCharacteristicError(characteristic2, "Failed to connect");
            CharNotificationHandler charNotificationHandler3 = pluginController.charNotificationHandler;
            if (charNotificationHandler3 == null) {
                AbstractC4862t.p("charNotificationHandler");
            } else {
                charNotificationHandler = charNotificationHandler3;
            }
            ProtobufModel.CharacteristicAddress characteristic3 = readCharacteristicRequest.getCharacteristic();
            AbstractC4862t.d(characteristic3, "getCharacteristic(...)");
            charNotificationHandler.addSingleErrorToStream(characteristic3, ((CharOperationFailed) charOperationResult).getErrorMessage());
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H readCharacteristic$lambda$5(PluginController pluginController, ProtobufModel.ReadCharacteristicRequest readCharacteristicRequest, Throwable th) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        ProtobufModel.CharacteristicAddress characteristic = readCharacteristicRequest.getCharacteristic();
        AbstractC4862t.d(characteristic, "getCharacteristic(...)");
        protobufMessageConverter.convertCharacteristicError(characteristic, th.getMessage());
        CharNotificationHandler charNotificationHandler = pluginController.charNotificationHandler;
        if (charNotificationHandler == null) {
            AbstractC4862t.p("charNotificationHandler");
            charNotificationHandler = null;
        }
        ProtobufModel.CharacteristicAddress characteristic2 = readCharacteristicRequest.getCharacteristic();
        AbstractC4862t.d(characteristic2, "getCharacteristic(...)");
        String message = th.getMessage();
        if (message == null) {
            message = "Failure";
        }
        charNotificationHandler.addSingleErrorToStream(characteristic2, message);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readNotifications(MethodCall call, MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.NotifyCharacteristicRequest from = ProtobufModel.NotifyCharacteristicRequest.parseFrom((byte[]) obj);
        CharNotificationHandler charNotificationHandler = this.charNotificationHandler;
        if (charNotificationHandler == null) {
            AbstractC4862t.p("charNotificationHandler");
            charNotificationHandler = null;
        }
        AbstractC4862t.b(from);
        charNotificationHandler.subscribeToNotifications(from);
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readRssi(MethodCall call, final MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.ReadRssiRequest from = ProtobufModel.ReadRssiRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        Eb.r rVarY = bleClient.readRssi(deviceId).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.c
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.readRssi$lambda$23(this.f32579a, result, (Integer) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.d
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.e
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.readRssi$lambda$25(result, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.f
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H readRssi$lambda$23(PluginController pluginController, MethodChannel.Result result, Integer num) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        AbstractC4862t.b(num);
        result.success(protobufMessageConverter.convertReadRssiResult(num.intValue()).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H readRssi$lambda$25(MethodChannel.Result result, Throwable th) {
        result.error("read_rssi_error", th.getMessage(), null);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestConnectionPriority(MethodCall call, final MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        final ProtobufModel.ChangeConnectionPriorityRequest from = ProtobufModel.ChangeConnectionPriorityRequest.parseFrom((byte[]) obj);
        BleClient bleClient = this.bleClient;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        String deviceId = from.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        Eb.r rVarY = bleClient.requestConnectionPriority(deviceId, BleWrapperExtensionsKt.toConnectionPriority(from.getPriority())).y(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.g
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.requestConnectionPriority$lambda$15(result, this, (RequestConnectionPriorityResult) obj2);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.h
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar.invoke(obj2);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.i
            @Override // vc.l
            public final Object invoke(Object obj2) {
                return PluginController.requestConnectionPriority$lambda$17(result, this, from, (Throwable) obj2);
            }
        };
        DiscardKt.discard(rVarY.B(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.j
            @Override // Jb.d
            public final void accept(Object obj2) {
                lVar2.invoke(obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestConnectionPriority$lambda$15(MethodChannel.Result result, PluginController pluginController, RequestConnectionPriorityResult requestConnectionPriorityResult) {
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        AbstractC4862t.b(requestConnectionPriorityResult);
        result.success(protobufMessageConverter.convertRequestConnectionPriorityInfo(requestConnectionPriorityResult).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestConnectionPriority$lambda$17(MethodChannel.Result result, PluginController pluginController, ProtobufModel.ChangeConnectionPriorityRequest changeConnectionPriorityRequest, Throwable th) {
        String message;
        ProtobufMessageConverter protobufMessageConverter = pluginController.protoConverter;
        String deviceId = changeConnectionPriorityRequest.getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        if (th == null || (message = th.getMessage()) == null) {
            message = "Unknown error";
        }
        result.success(protobufMessageConverter.convertRequestConnectionPriorityInfo(new RequestConnectionPriorityFailed(deviceId, message)).toByteArray());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scanForDevices(MethodCall call, MethodChannel.Result result) {
        ScanDevicesHandler scanDevicesHandler = this.scanDevicesHandler;
        if (scanDevicesHandler == null) {
            AbstractC4862t.p("scanDevicesHandler");
            scanDevicesHandler = null;
        }
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.ScanForDevicesRequest from = ProtobufModel.ScanForDevicesRequest.parseFrom((byte[]) obj);
        AbstractC4862t.d(from, "parseFrom(...)");
        scanDevicesHandler.prepareScan(from);
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopNotifications(MethodCall call, MethodChannel.Result result) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        ProtobufModel.NotifyNoMoreCharacteristicRequest from = ProtobufModel.NotifyNoMoreCharacteristicRequest.parseFrom((byte[]) obj);
        CharNotificationHandler charNotificationHandler = this.charNotificationHandler;
        if (charNotificationHandler == null) {
            AbstractC4862t.p("charNotificationHandler");
            charNotificationHandler = null;
        }
        AbstractC4862t.b(from);
        charNotificationHandler.unsubscribeFromNotifications(from);
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeCharacteristicWithResponse(MethodCall call, MethodChannel.Result result) {
        executeWriteAndPropagateResultToChannel(call, result, AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeCharacteristicWithoutResponse(MethodCall call, MethodChannel.Result result) {
        executeWriteAndPropagateResultToChannel(call, result, C37531.INSTANCE);
    }

    public final void deinitialize$reactive_ble_mobile_release() {
        ScanDevicesHandler scanDevicesHandler = this.scanDevicesHandler;
        DeviceConnectionHandler deviceConnectionHandler = null;
        if (scanDevicesHandler == null) {
            AbstractC4862t.p("scanDevicesHandler");
            scanDevicesHandler = null;
        }
        scanDevicesHandler.stopDeviceScan();
        DeviceConnectionHandler deviceConnectionHandler2 = this.deviceConnectionHandler;
        if (deviceConnectionHandler2 == null) {
            AbstractC4862t.p("deviceConnectionHandler");
        } else {
            deviceConnectionHandler = deviceConnectionHandler2;
        }
        deviceConnectionHandler.disconnectAll();
    }

    public final void execute$reactive_ble_mobile_release(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        vc.p pVar = this.pluginMethods.get(call.method);
        if (pVar != null) {
            pVar.invoke(call, result);
        } else {
            result.notImplemented();
        }
    }

    public final void initialize$reactive_ble_mobile_release(BinaryMessenger messenger, Context context) {
        AbstractC4862t.e(messenger, "messenger");
        AbstractC4862t.e(context, "context");
        this.bleClient = new ReactiveBleClient(context);
        this.scanchannel = new EventChannel(messenger, "flutter_reactive_ble_scan");
        this.deviceConnectionChannel = new EventChannel(messenger, "flutter_reactive_ble_connected_device");
        this.charNotificationChannel = new EventChannel(messenger, "flutter_reactive_ble_char_update");
        EventChannel eventChannel = new EventChannel(messenger, "flutter_reactive_ble_status");
        BleClient bleClient = this.bleClient;
        CharNotificationHandler charNotificationHandler = null;
        if (bleClient == null) {
            AbstractC4862t.p("bleClient");
            bleClient = null;
        }
        this.scanDevicesHandler = new ScanDevicesHandler(bleClient);
        BleClient bleClient2 = this.bleClient;
        if (bleClient2 == null) {
            AbstractC4862t.p("bleClient");
            bleClient2 = null;
        }
        this.deviceConnectionHandler = new DeviceConnectionHandler(bleClient2);
        BleClient bleClient3 = this.bleClient;
        if (bleClient3 == null) {
            AbstractC4862t.p("bleClient");
            bleClient3 = null;
        }
        this.charNotificationHandler = new CharNotificationHandler(bleClient3);
        BleClient bleClient4 = this.bleClient;
        if (bleClient4 == null) {
            AbstractC4862t.p("bleClient");
            bleClient4 = null;
        }
        BleStatusHandler bleStatusHandler = new BleStatusHandler(bleClient4);
        EventChannel eventChannel2 = this.scanchannel;
        if (eventChannel2 == null) {
            AbstractC4862t.p("scanchannel");
            eventChannel2 = null;
        }
        ScanDevicesHandler scanDevicesHandler = this.scanDevicesHandler;
        if (scanDevicesHandler == null) {
            AbstractC4862t.p("scanDevicesHandler");
            scanDevicesHandler = null;
        }
        eventChannel2.setStreamHandler(scanDevicesHandler);
        EventChannel eventChannel3 = this.deviceConnectionChannel;
        if (eventChannel3 == null) {
            AbstractC4862t.p("deviceConnectionChannel");
            eventChannel3 = null;
        }
        DeviceConnectionHandler deviceConnectionHandler = this.deviceConnectionHandler;
        if (deviceConnectionHandler == null) {
            AbstractC4862t.p("deviceConnectionHandler");
            deviceConnectionHandler = null;
        }
        eventChannel3.setStreamHandler(deviceConnectionHandler);
        EventChannel eventChannel4 = this.charNotificationChannel;
        if (eventChannel4 == null) {
            AbstractC4862t.p("charNotificationChannel");
            eventChannel4 = null;
        }
        CharNotificationHandler charNotificationHandler2 = this.charNotificationHandler;
        if (charNotificationHandler2 == null) {
            AbstractC4862t.p("charNotificationHandler");
        } else {
            charNotificationHandler = charNotificationHandler2;
        }
        eventChannel4.setStreamHandler(charNotificationHandler);
        eventChannel.setStreamHandler(bleStatusHandler);
    }
}
