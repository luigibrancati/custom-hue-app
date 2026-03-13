package com.signify.hue.flutterreactiveble.ble;

import android.os.ParcelUuid;
import com.signify.hue.flutterreactiveble.model.ScanMode;
import com.signify.hue.flutterreactiveble.utils.Duration;
import dc.C3890a;
import io.sentry.ProfilingTraceData;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0004J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J5\u0010+\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020'H&¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020'H&¢\u0006\u0004\b-\u0010,J%\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\"H&¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002020\fH&¢\u0006\u0004\b3\u00104J%\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b:\u0010\u001cR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@À\u0006\u0003"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "", "Lfc/H;", "initializeClient", "()V", "", "Landroid/os/ParcelUuid;", "services", "Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "scanMode", "", "requireLocationServicesEnabled", "LEb/k;", "Lcom/signify/hue/flutterreactiveble/ble/ScanInfo;", "scanForDevices", "(Ljava/util/List;Lcom/signify/hue/flutterreactiveble/model/ScanMode;Z)LEb/k;", "", "deviceId", "Lcom/signify/hue/flutterreactiveble/utils/Duration;", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "connectToDevice", "(Ljava/lang/String;Lcom/signify/hue/flutterreactiveble/utils/Duration;)V", "disconnectDevice", "(Ljava/lang/String;)V", "disconnectAllDevices", "LEb/r;", "Lka/Q;", "discoverServices", "(Ljava/lang/String;)LEb/r;", "LEb/a;", "clearGattCache", "(Ljava/lang/String;)LEb/a;", "Ljava/util/UUID;", "characteristicId", "", "characteristicInstanceId", "Lcom/signify/hue/flutterreactiveble/ble/CharOperationResult;", "readCharacteristic", "(Ljava/lang/String;Ljava/util/UUID;I)LEb/r;", "", "setupNotification", "(Ljava/lang/String;Ljava/util/UUID;I)LEb/k;", "value", "writeCharacteristicWithResponse", "(Ljava/lang/String;Ljava/util/UUID;I[B)LEb/r;", "writeCharacteristicWithoutResponse", RRWebVideoEvent.JsonKeys.SIZE, "Lcom/signify/hue/flutterreactiveble/ble/MtuNegotiateResult;", "negotiateMtuSize", "(Ljava/lang/String;I)LEb/r;", "Lcom/signify/hue/flutterreactiveble/ble/BleStatus;", "observeBleStatus", "()LEb/k;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;", "priority", "Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPriorityResult;", "requestConnectionPriority", "(Ljava/lang/String;Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;)LEb/r;", "readRssi", "Ldc/a;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdate;", "getConnectionUpdateSubject", "()Ldc/a;", "connectionUpdateSubject", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BleClient {
    Eb.a clearGattCache(String deviceId);

    void connectToDevice(String deviceId, Duration timeout);

    void disconnectAllDevices();

    void disconnectDevice(String deviceId);

    Eb.r discoverServices(String deviceId);

    C3890a getConnectionUpdateSubject();

    void initializeClient();

    Eb.r negotiateMtuSize(String deviceId, int size);

    Eb.k observeBleStatus();

    Eb.r readCharacteristic(String deviceId, UUID characteristicId, int characteristicInstanceId);

    Eb.r readRssi(String deviceId);

    Eb.r requestConnectionPriority(String deviceId, ConnectionPriority priority);

    Eb.k scanForDevices(List<ParcelUuid> services, ScanMode scanMode, boolean requireLocationServicesEnabled);

    Eb.k setupNotification(String deviceId, UUID characteristicId, int characteristicInstanceId);

    Eb.r writeCharacteristicWithResponse(String deviceId, UUID characteristicId, int characteristicInstanceId, byte[] value);

    Eb.r writeCharacteristicWithoutResponse(String deviceId, UUID characteristicId, int characteristicInstanceId, byte[] value);
}
