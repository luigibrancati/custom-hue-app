package com.signify.hue.flutterreactiveble.converters;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.GeneratedMessageLite;
import com.signify.hue.flutterreactiveble.ProtobufModel;
import com.signify.hue.flutterreactiveble.ble.ConnectionUpdateSuccess;
import com.signify.hue.flutterreactiveble.ble.MtuNegotiateFailed;
import com.signify.hue.flutterreactiveble.ble.MtuNegotiateResult;
import com.signify.hue.flutterreactiveble.ble.MtuNegotiateSuccessful;
import com.signify.hue.flutterreactiveble.ble.RequestConnectionPriorityFailed;
import com.signify.hue.flutterreactiveble.ble.RequestConnectionPriorityResult;
import com.signify.hue.flutterreactiveble.ble.RequestConnectionPrioritySuccess;
import com.signify.hue.flutterreactiveble.ble.ScanInfo;
import com.signify.hue.flutterreactiveble.model.CharacteristicErrorType;
import com.signify.hue.flutterreactiveble.model.ClearGattCacheErrorType;
import com.signify.hue.flutterreactiveble.model.ConnectionErrorType;
import com.signify.hue.flutterreactiveble.model.ConnectionState;
import com.signify.hue.flutterreactiveble.model.NegotiateMtuErrorType;
import com.signify.hue.flutterreactiveble.model.ScanErrorType;
import fc.C4032o;
import gc.C4207u;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ka.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 V2\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010#¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0011¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010#¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u000b\u001a\u00020<2\b\u00109\u001a\u0004\u0018\u00010#¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u001d\u0010L\u001a\u00020K2\u0006\u0010,\u001a\u00020#2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bL\u0010MJ\u0015\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/signify/hue/flutterreactiveble/converters/ProtobufMessageConverter;", "", "<init>", "()V", "Landroid/bluetooth/BluetoothGattService;", "gattService", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DiscoveredService;", "fromBluetoothGattService", "(Landroid/bluetooth/BluetoothGattService;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DiscoveredService;", "convertInternalService", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;", SentryBaseEvent.JsonKeys.REQUEST, "Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress$Builder;", "createCharacteristicAddress", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress$Builder;", "", "Ljava/util/UUID;", "", "serviceData", "", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ServiceDataEntry;", "createServiceDataEntry", "(Ljava/util/Map;)Ljava/util/List;", "serviceUuids", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$Uuid;", "createServiceUuids", "(Ljava/util/List;)Ljava/util/List;", DebugImage.JsonKeys.UUID, "createUuidFromParcelUuid", "(Ljava/util/UUID;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$Uuid;", "Lcom/signify/hue/flutterreactiveble/ble/ScanInfo;", "scanInfo", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceScanInfo;", "convertScanInfo", "(Lcom/signify/hue/flutterreactiveble/ble/ScanInfo;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceScanInfo;", "", "errorMessage", "convertScanErrorInfo", "(Ljava/lang/String;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceScanInfo;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdateSuccess;", "connection", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceInfo;", "convertToDeviceInfo", "(Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdateSuccess;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceInfo;", "deviceId", "convertConnectionErrorToDeviceInfo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DeviceInfo;", "Lcom/signify/hue/flutterreactiveble/model/ClearGattCacheErrorType;", "code", "message", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ClearGattCacheInfo;", "convertClearGattCacheError", "(Lcom/signify/hue/flutterreactiveble/model/ClearGattCacheErrorType;Ljava/lang/String;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$ClearGattCacheInfo;", "value", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicValueInfo;", "convertCharacteristicInfo", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;[B)Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicValueInfo;", "error", "convertCharacteristicError", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicAddress;Ljava/lang/String;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$CharacteristicValueInfo;", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$WriteCharacteristicRequest;", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$WriteCharacteristicInfo;", "convertWriteCharacteristicInfo", "(Lcom/signify/hue/flutterreactiveble/ProtobufModel$WriteCharacteristicRequest;Ljava/lang/String;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$WriteCharacteristicInfo;", "Lcom/signify/hue/flutterreactiveble/ble/MtuNegotiateResult;", FeatureFlag.JsonKeys.RESULT, "Lcom/signify/hue/flutterreactiveble/ProtobufModel$NegotiateMtuInfo;", "convertNegotiateMtuInfo", "(Lcom/signify/hue/flutterreactiveble/ble/MtuNegotiateResult;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$NegotiateMtuInfo;", "Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPriorityResult;", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ChangeConnectionPriorityInfo;", "convertRequestConnectionPriorityInfo", "(Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPriorityResult;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$ChangeConnectionPriorityInfo;", "Lka/Q;", "services", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$DiscoverServicesInfo;", "convertDiscoverServicesInfo", "(Ljava/lang/String;Lka/Q;)Lcom/signify/hue/flutterreactiveble/ProtobufModel$DiscoverServicesInfo;", "", "rssi", "Lcom/signify/hue/flutterreactiveble/ProtobufModel$ReadRssiResult;", "convertReadRssiResult", "(I)Lcom/signify/hue/flutterreactiveble/ProtobufModel$ReadRssiResult;", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "uuidConverter", "Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProtobufMessageConverter {
    private static final int positionLeastSignificantBit = 3;
    private static final int positionMostSignificantBit = 2;
    private final UuidConverter uuidConverter = new UuidConverter();

    private final ProtobufModel.DiscoveredService convertInternalService(BluetoothGattService gattService) {
        ProtobufModel.DiscoveredService.Builder builderNewBuilder = ProtobufModel.DiscoveredService.newBuilder();
        UUID uuid = gattService.getUuid();
        AbstractC4862t.d(uuid, "getUuid(...)");
        ProtobufModel.DiscoveredService.Builder serviceUuid = builderNewBuilder.setServiceUuid(createUuidFromParcelUuid(uuid));
        List<BluetoothGattCharacteristic> characteristics = gattService.getCharacteristics();
        AbstractC4862t.d(characteristics, "getCharacteristics(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(characteristics, 10));
        Iterator<T> it = characteristics.iterator();
        while (it.hasNext()) {
            UUID uuid2 = ((BluetoothGattCharacteristic) it.next()).getUuid();
            AbstractC4862t.d(uuid2, "getUuid(...)");
            arrayList.add(createUuidFromParcelUuid(uuid2));
        }
        ProtobufModel.DiscoveredService.Builder builderAddAllCharacteristicUuids = serviceUuid.addAllCharacteristicUuids(arrayList);
        List<BluetoothGattService> includedServices = gattService.getIncludedServices();
        AbstractC4862t.d(includedServices, "getIncludedServices(...)");
        ArrayList arrayList2 = new ArrayList(C4207u.v(includedServices, 10));
        for (BluetoothGattService bluetoothGattService : includedServices) {
            AbstractC4862t.b(bluetoothGattService);
            arrayList2.add(convertInternalService(bluetoothGattService));
        }
        GeneratedMessageLite generatedMessageLiteBuild = builderAddAllCharacteristicUuids.addAllIncludedServices(arrayList2).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DiscoveredService) generatedMessageLiteBuild;
    }

    private final ProtobufModel.CharacteristicAddress.Builder createCharacteristicAddress(ProtobufModel.CharacteristicAddress request) {
        return ProtobufModel.CharacteristicAddress.newBuilder().setDeviceId(request.getDeviceId()).setServiceUuid(request.getServiceUuid()).setServiceInstanceId(request.getServiceInstanceId()).setCharacteristicInstanceId(request.getCharacteristicInstanceId()).setCharacteristicUuid(request.getCharacteristicUuid());
    }

    private final List<ProtobufModel.ServiceDataEntry> createServiceDataEntry(Map<UUID, byte[]> serviceData) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<UUID, byte[]> entry : serviceData.entrySet()) {
            GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.ServiceDataEntry.newBuilder().setServiceUuid(createUuidFromParcelUuid(entry.getKey())).setData(AbstractC3722j.k(entry.getValue())).build();
            AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
            arrayList.add(generatedMessageLiteBuild);
        }
        return arrayList;
    }

    private final List<ProtobufModel.Uuid> createServiceUuids(List<UUID> serviceUuids) {
        ArrayList arrayList = new ArrayList(C4207u.v(serviceUuids, 10));
        Iterator<T> it = serviceUuids.iterator();
        while (it.hasNext()) {
            arrayList.add(createUuidFromParcelUuid((UUID) it.next()));
        }
        return arrayList;
    }

    private final ProtobufModel.Uuid createUuidFromParcelUuid(UUID uuid) {
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.Uuid.newBuilder().setData(AbstractC3722j.k(this.uuidConverter.byteArrayFromUuid(uuid))).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.Uuid) generatedMessageLiteBuild;
    }

    private final ProtobufModel.DiscoveredService fromBluetoothGattService(BluetoothGattService gattService) {
        ProtobufModel.DiscoveredService.Builder builderNewBuilder = ProtobufModel.DiscoveredService.newBuilder();
        UUID uuid = gattService.getUuid();
        AbstractC4862t.d(uuid, "getUuid(...)");
        ProtobufModel.DiscoveredService.Builder serviceInstanceId = builderNewBuilder.setServiceUuid(createUuidFromParcelUuid(uuid)).setServiceInstanceId(String.valueOf(gattService.getInstanceId()));
        List<BluetoothGattCharacteristic> characteristics = gattService.getCharacteristics();
        AbstractC4862t.d(characteristics, "getCharacteristics(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(characteristics, 10));
        Iterator<T> it = characteristics.iterator();
        while (it.hasNext()) {
            UUID uuid2 = ((BluetoothGattCharacteristic) it.next()).getUuid();
            AbstractC4862t.d(uuid2, "getUuid(...)");
            arrayList.add(createUuidFromParcelUuid(uuid2));
        }
        ProtobufModel.DiscoveredService.Builder builderAddAllCharacteristicUuids = serviceInstanceId.addAllCharacteristicUuids(arrayList);
        List<BluetoothGattCharacteristic> characteristics2 = gattService.getCharacteristics();
        AbstractC4862t.d(characteristics2, "getCharacteristics(...)");
        ArrayList arrayList2 = new ArrayList(C4207u.v(characteristics2, 10));
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics2) {
            int properties = bluetoothGattCharacteristic.getProperties();
            boolean z10 = false;
            boolean z11 = (properties & 2) > 0;
            boolean z12 = (properties & 8) > 0;
            boolean z13 = (properties & 4) > 0;
            boolean z14 = (properties & 16) > 0;
            if ((properties & 32) > 0) {
                z10 = true;
            }
            ProtobufModel.DiscoveredCharacteristic.Builder builderNewBuilder2 = ProtobufModel.DiscoveredCharacteristic.newBuilder();
            UUID uuid3 = bluetoothGattCharacteristic.getUuid();
            AbstractC4862t.d(uuid3, "getUuid(...)");
            ProtobufModel.DiscoveredCharacteristic.Builder characteristicInstanceId = builderNewBuilder2.setCharacteristicId(createUuidFromParcelUuid(uuid3)).setCharacteristicInstanceId(String.valueOf(bluetoothGattCharacteristic.getInstanceId()));
            UUID uuid4 = bluetoothGattCharacteristic.getService().getUuid();
            AbstractC4862t.d(uuid4, "getUuid(...)");
            arrayList2.add((ProtobufModel.DiscoveredCharacteristic) characteristicInstanceId.setServiceId(createUuidFromParcelUuid(uuid4)).setIsReadable(z11).setIsWritableWithResponse(z12).setIsWritableWithoutResponse(z13).setIsNotifiable(z14).setIsIndicatable(z10).build());
        }
        ProtobufModel.DiscoveredService.Builder builderAddAllCharacteristics = builderAddAllCharacteristicUuids.addAllCharacteristics(arrayList2);
        List<BluetoothGattService> includedServices = gattService.getIncludedServices();
        AbstractC4862t.d(includedServices, "getIncludedServices(...)");
        ArrayList arrayList3 = new ArrayList(C4207u.v(includedServices, 10));
        for (BluetoothGattService bluetoothGattService : includedServices) {
            AbstractC4862t.b(bluetoothGattService);
            arrayList3.add(convertInternalService(bluetoothGattService));
        }
        GeneratedMessageLite generatedMessageLiteBuild = builderAddAllCharacteristics.addAllIncludedServices(arrayList3).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DiscoveredService) generatedMessageLiteBuild;
    }

    public final ProtobufModel.CharacteristicValueInfo convertCharacteristicError(ProtobufModel.CharacteristicAddress request, String error) {
        AbstractC4862t.e(request, "request");
        ProtobufModel.CharacteristicAddress.Builder builderCreateCharacteristicAddress = createCharacteristicAddress(request);
        ProtobufModel.GenericFailure.Builder code = ProtobufModel.GenericFailure.newBuilder().setCode(CharacteristicErrorType.UNKNOWN.getCode());
        if (error == null) {
            error = "Unknown error";
        }
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.CharacteristicValueInfo.newBuilder().setCharacteristic(builderCreateCharacteristicAddress).setFailure(code.setMessage(error)).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.CharacteristicValueInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.CharacteristicValueInfo convertCharacteristicInfo(ProtobufModel.CharacteristicAddress request, byte[] value) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(value, "value");
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.CharacteristicValueInfo.newBuilder().setCharacteristic(createCharacteristicAddress(request)).setValue(AbstractC3722j.k(value)).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.CharacteristicValueInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.ClearGattCacheInfo convertClearGattCacheError(ClearGattCacheErrorType code, String message) {
        AbstractC4862t.e(code, "code");
        ProtobufModel.GenericFailure.Builder code2 = ProtobufModel.GenericFailure.newBuilder().setCode(code.getCode());
        if (message != null) {
            code2.setMessage(message);
        }
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.ClearGattCacheInfo.newBuilder().setFailure(code2).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.ClearGattCacheInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.DeviceInfo convertConnectionErrorToDeviceInfo(String deviceId, String errorMessage) {
        AbstractC4862t.e(deviceId, "deviceId");
        ProtobufModel.DeviceInfo.Builder connectionState = ProtobufModel.DeviceInfo.newBuilder().setId(deviceId).setConnectionState(ConnectionState.DISCONNECTED.getCode());
        ProtobufModel.GenericFailure.Builder code = ProtobufModel.GenericFailure.newBuilder().setCode(ConnectionErrorType.FAILEDTOCONNECT.getCode());
        if (errorMessage == null) {
            errorMessage = "";
        }
        GeneratedMessageLite generatedMessageLiteBuild = connectionState.setFailure((ProtobufModel.GenericFailure) code.setMessage(errorMessage).build()).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DeviceInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.DiscoverServicesInfo convertDiscoverServicesInfo(String deviceId, Q services) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(services, "services");
        ProtobufModel.DiscoverServicesInfo.Builder deviceId2 = ProtobufModel.DiscoverServicesInfo.newBuilder().setDeviceId(deviceId);
        List<BluetoothGattService> listA = services.a();
        AbstractC4862t.d(listA, "getBluetoothGattServices(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(listA, 10));
        for (BluetoothGattService bluetoothGattService : listA) {
            AbstractC4862t.b(bluetoothGattService);
            arrayList.add(fromBluetoothGattService(bluetoothGattService));
        }
        GeneratedMessageLite generatedMessageLiteBuild = deviceId2.addAllServices(arrayList).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DiscoverServicesInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.NegotiateMtuInfo convertNegotiateMtuInfo(MtuNegotiateResult result) {
        AbstractC4862t.e(result, "result");
        if (result instanceof MtuNegotiateSuccessful) {
            MtuNegotiateSuccessful mtuNegotiateSuccessful = (MtuNegotiateSuccessful) result;
            GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.NegotiateMtuInfo.newBuilder().setDeviceId(mtuNegotiateSuccessful.getDeviceId()).setMtuSize(mtuNegotiateSuccessful.getSize()).build();
            AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
            return (ProtobufModel.NegotiateMtuInfo) generatedMessageLiteBuild;
        }
        if (!(result instanceof MtuNegotiateFailed)) {
            throw new C4032o();
        }
        MtuNegotiateFailed mtuNegotiateFailed = (MtuNegotiateFailed) result;
        GeneratedMessageLite generatedMessageLiteBuild2 = ProtobufModel.NegotiateMtuInfo.newBuilder().setDeviceId(mtuNegotiateFailed.getDeviceId()).setFailure((ProtobufModel.GenericFailure) ProtobufModel.GenericFailure.newBuilder().setCode(NegotiateMtuErrorType.UNKNOWN.getCode()).setMessage(mtuNegotiateFailed.getErrorMessage()).build()).build();
        AbstractC4862t.b(generatedMessageLiteBuild2);
        return (ProtobufModel.NegotiateMtuInfo) generatedMessageLiteBuild2;
    }

    public final ProtobufModel.ReadRssiResult convertReadRssiResult(int rssi) {
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.ReadRssiResult.newBuilder().setRssi(rssi).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.ReadRssiResult) generatedMessageLiteBuild;
    }

    public final ProtobufModel.ChangeConnectionPriorityInfo convertRequestConnectionPriorityInfo(RequestConnectionPriorityResult result) {
        AbstractC4862t.e(result, "result");
        if (result instanceof RequestConnectionPrioritySuccess) {
            GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.ChangeConnectionPriorityInfo.newBuilder().setDeviceId(((RequestConnectionPrioritySuccess) result).getDeviceId()).build();
            AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
            return (ProtobufModel.ChangeConnectionPriorityInfo) generatedMessageLiteBuild;
        }
        if (!(result instanceof RequestConnectionPriorityFailed)) {
            throw new C4032o();
        }
        RequestConnectionPriorityFailed requestConnectionPriorityFailed = (RequestConnectionPriorityFailed) result;
        GeneratedMessageLite generatedMessageLiteBuild2 = ProtobufModel.ChangeConnectionPriorityInfo.newBuilder().setDeviceId(requestConnectionPriorityFailed.getDeviceId()).setFailure((ProtobufModel.GenericFailure) ProtobufModel.GenericFailure.newBuilder().setCode(0).setMessage(requestConnectionPriorityFailed.getErrorMessage()).build()).build();
        AbstractC4862t.b(generatedMessageLiteBuild2);
        return (ProtobufModel.ChangeConnectionPriorityInfo) generatedMessageLiteBuild2;
    }

    public final ProtobufModel.DeviceScanInfo convertScanErrorInfo(String errorMessage) {
        ProtobufModel.DeviceScanInfo.Builder builderNewBuilder = ProtobufModel.DeviceScanInfo.newBuilder();
        ProtobufModel.GenericFailure.Builder code = ProtobufModel.GenericFailure.newBuilder().setCode(ScanErrorType.UNKNOWN.getCode());
        if (errorMessage == null) {
            errorMessage = "";
        }
        GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder.setFailure((ProtobufModel.GenericFailure) code.setMessage(errorMessage).build()).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DeviceScanInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.DeviceScanInfo convertScanInfo(ScanInfo scanInfo) {
        AbstractC4862t.e(scanInfo, "scanInfo");
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.DeviceScanInfo.newBuilder().setId(scanInfo.getDeviceId()).setName(scanInfo.getName()).setRssi(scanInfo.getRssi()).setIsConnectable((ProtobufModel.IsConnectable) ProtobufModel.IsConnectable.newBuilder().setCode(scanInfo.getConnectable().getCode()).build()).addAllServiceData(createServiceDataEntry(scanInfo.getServiceData())).addAllServiceUuids(createServiceUuids(scanInfo.getServiceUuids())).setManufacturerData(AbstractC3722j.k(scanInfo.getManufacturerData())).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DeviceScanInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.DeviceInfo convertToDeviceInfo(ConnectionUpdateSuccess connection) {
        AbstractC4862t.e(connection, "connection");
        GeneratedMessageLite generatedMessageLiteBuild = ProtobufModel.DeviceInfo.newBuilder().setId(connection.getDeviceId()).setConnectionState(connection.getConnectionState()).build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.DeviceInfo) generatedMessageLiteBuild;
    }

    public final ProtobufModel.WriteCharacteristicInfo convertWriteCharacteristicInfo(ProtobufModel.WriteCharacteristicRequest request, String error) {
        AbstractC4862t.e(request, "request");
        ProtobufModel.WriteCharacteristicInfo.Builder characteristic = ProtobufModel.WriteCharacteristicInfo.newBuilder().setCharacteristic(request.getCharacteristic());
        if (error != null) {
            characteristic.setFailure(ProtobufModel.GenericFailure.newBuilder().setCode(CharacteristicErrorType.UNKNOWN.getCode()).setMessage(error));
        }
        GeneratedMessageLite generatedMessageLiteBuild = characteristic.build();
        AbstractC4862t.d(generatedMessageLiteBuild, "build(...)");
        return (ProtobufModel.WriteCharacteristicInfo) generatedMessageLiteBuild;
    }
}
