package com.signify.hue.flutterreactiveble.channelhandlers;

import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.BleClient;
import com.signify.hue.flutterreactiveble.converters.ProtobufMessageConverter;
import com.signify.hue.flutterreactiveble.converters.UuidConverter;
import fc.C4015H;
import io.flutter.plugin.common.EventChannel;
import io.sentry.SentryBaseEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import la.C4973e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/signify/hue/flutterreactiveble/channelhandlers/CharNotificationHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "bleClient", "<init>", "(Lcom/signify/hue/flutterreactiveble/ble/BleClient;)V", "Lfc/H;", "unsubscribeFromAllNotifications", "()V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;", "subscriptionRequest", "", "value", "handleNotificationValue", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;[B)V", "", "error", "handleNotificationError", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;Ljava/lang/Throwable;)V", "", "objectSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$NotifyCharacteristicRequest;", SentryBaseEvent.JsonKeys.REQUEST, "subscribeToNotifications", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$NotifyCharacteristicRequest;)V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$NotifyNoMoreCharacteristicRequest;", "unsubscribeFromNotifications", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$NotifyNoMoreCharacteristicRequest;)V", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicValueInfo;", "charInfo", "addSingleReadToStream", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicValueInfo;)V", "", "addSingleErrorToStream", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;Ljava/lang/String;)V", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "uuidConverter", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "protobufConverter", "Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharNotificationHandler implements EventChannel.StreamHandler {
    private static EventChannel.EventSink charNotificationSink;
    private final BleClient bleClient;
    private final ProtobufMessageConverter protobufConverter;
    private final UuidConverter uuidConverter;
    private static final Map<ProtobufModel.CharacteristicAddress, Hb.c> subscriptionMap = new LinkedHashMap();

    public CharNotificationHandler(BleClient bleClient) {
        AbstractC4862t.e(bleClient, "bleClient");
        this.bleClient = bleClient;
        this.uuidConverter = new UuidConverter();
        this.protobufConverter = new ProtobufMessageConverter();
    }

    private final void handleNotificationError(ProtobufModel.CharacteristicAddress subscriptionRequest, Throwable error) {
        ProtobufMessageConverter protobufMessageConverter = this.protobufConverter;
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        ProtobufModel.CharacteristicValueInfo characteristicValueInfoConvertCharacteristicError = protobufMessageConverter.convertCharacteristicError(subscriptionRequest, message);
        EventChannel.EventSink eventSink = charNotificationSink;
        if (eventSink != null) {
            eventSink.success(characteristicValueInfoConvertCharacteristicError.toByteArray());
        }
    }

    private final void handleNotificationValue(ProtobufModel.CharacteristicAddress subscriptionRequest, byte[] value) {
        ProtobufModel.CharacteristicValueInfo characteristicValueInfoConvertCharacteristicInfo = this.protobufConverter.convertCharacteristicInfo(subscriptionRequest, value);
        EventChannel.EventSink eventSink = charNotificationSink;
        if (eventSink != null) {
            eventSink.success(characteristicValueInfoConvertCharacteristicInfo.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToNotifications$lambda$1(CharNotificationHandler charNotificationHandler, ProtobufModel.NotifyCharacteristicRequest notifyCharacteristicRequest, byte[] bArr) {
        ProtobufModel.CharacteristicAddress characteristic = notifyCharacteristicRequest.getCharacteristic();
        AbstractC4862t.d(characteristic, "getCharacteristic(...)");
        AbstractC4862t.b(bArr);
        charNotificationHandler.handleNotificationValue(characteristic, bArr);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToNotifications$lambda$3(ProtobufModel.NotifyCharacteristicRequest notifyCharacteristicRequest, CharNotificationHandler charNotificationHandler, Throwable th) {
        if (th instanceof C4973e) {
            Hb.c cVarRemove = subscriptionMap.remove(notifyCharacteristicRequest.getCharacteristic());
            if (cVarRemove != null) {
                cVarRemove.dispose();
            }
        } else {
            ProtobufModel.CharacteristicAddress characteristic = notifyCharacteristicRequest.getCharacteristic();
            AbstractC4862t.d(characteristic, "getCharacteristic(...)");
            AbstractC4862t.b(th);
            charNotificationHandler.handleNotificationError(characteristic, th);
        }
        return C4015H.f34254a;
    }

    private final void unsubscribeFromAllNotifications() {
        charNotificationSink = null;
        Iterator<Map.Entry<ProtobufModel.CharacteristicAddress, Hb.c>> it = subscriptionMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
    }

    public final void addSingleErrorToStream(ProtobufModel.CharacteristicAddress subscriptionRequest, String error) {
        AbstractC4862t.e(subscriptionRequest, "subscriptionRequest");
        AbstractC4862t.e(error, "error");
        ProtobufModel.CharacteristicValueInfo characteristicValueInfoConvertCharacteristicError = this.protobufConverter.convertCharacteristicError(subscriptionRequest, error);
        EventChannel.EventSink eventSink = charNotificationSink;
        if (eventSink != null) {
            eventSink.success(characteristicValueInfoConvertCharacteristicError.toByteArray());
        }
    }

    public final void addSingleReadToStream(ProtobufModel.CharacteristicValueInfo charInfo) {
        AbstractC4862t.e(charInfo, "charInfo");
        ProtobufModel.CharacteristicAddress characteristic = charInfo.getCharacteristic();
        AbstractC4862t.d(characteristic, "getCharacteristic(...)");
        byte[] bArrA = charInfo.getValue().A();
        AbstractC4862t.d(bArrA, "toByteArray(...)");
        handleNotificationValue(characteristic, bArrA);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object objectSink) {
        unsubscribeFromAllNotifications();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object objectSink, EventChannel.EventSink eventSink) {
        if (eventSink != null) {
            charNotificationSink = eventSink;
        }
    }

    public final void subscribeToNotifications(final ProtobufModel.NotifyCharacteristicRequest request) {
        AbstractC4862t.e(request, "request");
        UuidConverter uuidConverter = this.uuidConverter;
        byte[] bArrA = request.getCharacteristic().getCharacteristicUuid().getData().A();
        AbstractC4862t.d(bArrA, "toByteArray(...)");
        UUID uuidUuidFromByteArray = uuidConverter.uuidFromByteArray(bArrA);
        BleClient bleClient = this.bleClient;
        String deviceId = request.getCharacteristic().getDeviceId();
        AbstractC4862t.d(deviceId, "getDeviceId(...)");
        String characteristicInstanceId = request.getCharacteristic().getCharacteristicInstanceId();
        AbstractC4862t.d(characteristicInstanceId, "getCharacteristicInstanceId(...)");
        Eb.k kVarF0 = bleClient.setupNotification(deviceId, uuidUuidFromByteArray, Integer.parseInt(characteristicInstanceId)).f0(Gb.a.a());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.g
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CharNotificationHandler.subscribeToNotifications$lambda$1(this.f32587a, request, (byte[]) obj);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.h
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.i
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CharNotificationHandler.subscribeToNotifications$lambda$3(request, this, (Throwable) obj);
            }
        };
        subscriptionMap.put(request.getCharacteristic(), kVarF0.t0(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.channelhandlers.j
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar2.invoke(obj);
            }
        }));
    }

    public final void unsubscribeFromNotifications(ProtobufModel.NotifyNoMoreCharacteristicRequest request) {
        AbstractC4862t.e(request, "request");
        Hb.c cVarRemove = subscriptionMap.remove(request.getCharacteristic());
        if (cVarRemove != null) {
            cVarRemove.dispose();
        }
    }
}
