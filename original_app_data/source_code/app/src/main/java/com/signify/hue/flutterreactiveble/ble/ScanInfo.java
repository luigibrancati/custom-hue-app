package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020\u0006H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ScanInfo;", "", "deviceId", "", "name", "rssi", "", "connectable", "Lcom/signify/hue/flutterreactiveble/ble/Connectable;", "serviceData", "", "Ljava/util/UUID;", "", "serviceUuids", "", "manufacturerData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/signify/hue/flutterreactiveble/ble/Connectable;Ljava/util/Map;Ljava/util/List;[B)V", "getDeviceId", "()Ljava/lang/String;", "getName", "getRssi", "()I", "getConnectable", "()Lcom/signify/hue/flutterreactiveble/ble/Connectable;", "getServiceData", "()Ljava/util/Map;", "getServiceUuids", "()Ljava/util/List;", "getManufacturerData", "()[B", "equals", "", Request.JsonKeys.OTHER, "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScanInfo {
    private final Connectable connectable;
    private final String deviceId;
    private final byte[] manufacturerData;
    private final String name;
    private final int rssi;
    private final Map<UUID, byte[]> serviceData;
    private final List<UUID> serviceUuids;

    public ScanInfo(String deviceId, String name, int i10, Connectable connectable, Map<UUID, byte[]> serviceData, List<UUID> serviceUuids, byte[] manufacturerData) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(connectable, "connectable");
        AbstractC4862t.e(serviceData, "serviceData");
        AbstractC4862t.e(serviceUuids, "serviceUuids");
        AbstractC4862t.e(manufacturerData, "manufacturerData");
        this.deviceId = deviceId;
        this.name = name;
        this.rssi = i10;
        this.connectable = connectable;
        this.serviceData = serviceData;
        this.serviceUuids = serviceUuids;
        this.manufacturerData = manufacturerData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScanInfo copy$default(ScanInfo scanInfo, String str, String str2, int i10, Connectable connectable, Map map, List list, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = scanInfo.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = scanInfo.name;
        }
        if ((i11 & 4) != 0) {
            i10 = scanInfo.rssi;
        }
        if ((i11 & 8) != 0) {
            connectable = scanInfo.connectable;
        }
        if ((i11 & 16) != 0) {
            map = scanInfo.serviceData;
        }
        if ((i11 & 32) != 0) {
            list = scanInfo.serviceUuids;
        }
        if ((i11 & 64) != 0) {
            bArr = scanInfo.manufacturerData;
        }
        List list2 = list;
        byte[] bArr2 = bArr;
        Map map2 = map;
        int i12 = i10;
        return scanInfo.copy(str, str2, i12, connectable, map2, list2, bArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Connectable getConnectable() {
        return this.connectable;
    }

    public final Map<UUID, byte[]> component5() {
        return this.serviceData;
    }

    public final List<UUID> component6() {
        return this.serviceUuids;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final byte[] getManufacturerData() {
        return this.manufacturerData;
    }

    public final ScanInfo copy(String deviceId, String name, int rssi, Connectable connectable, Map<UUID, byte[]> serviceData, List<UUID> serviceUuids, byte[] manufacturerData) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(connectable, "connectable");
        AbstractC4862t.e(serviceData, "serviceData");
        AbstractC4862t.e(serviceUuids, "serviceUuids");
        AbstractC4862t.e(manufacturerData, "manufacturerData");
        return new ScanInfo(deviceId, name, rssi, connectable, serviceData, serviceUuids, manufacturerData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbstractC4862t.a(ScanInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(other, "null cannot be cast to non-null type com.signify.hue.flutterreactiveble.ble.ScanInfo");
        ScanInfo scanInfo = (ScanInfo) other;
        return AbstractC4862t.a(this.deviceId, scanInfo.deviceId) && AbstractC4862t.a(this.name, scanInfo.name) && this.rssi == scanInfo.rssi && this.connectable == scanInfo.connectable && AbstractC4862t.a(this.serviceData, scanInfo.serviceData) && AbstractC4862t.a(this.serviceUuids, scanInfo.serviceUuids) && Arrays.equals(this.manufacturerData, scanInfo.manufacturerData);
    }

    public final Connectable getConnectable() {
        return this.connectable;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final byte[] getManufacturerData() {
        return this.manufacturerData;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final Map<UUID, byte[]> getServiceData() {
        return this.serviceData;
    }

    public final List<UUID> getServiceUuids() {
        return this.serviceUuids;
    }

    public int hashCode() {
        return (((((((((((this.deviceId.hashCode() * 31) + this.name.hashCode()) * 31) + this.rssi) * 31) + this.connectable.hashCode()) * 31) + this.serviceData.hashCode()) * 31) + this.serviceUuids.hashCode()) * 31) + Arrays.hashCode(this.manufacturerData);
    }

    public String toString() {
        return "ScanInfo(deviceId=" + this.deviceId + ", name=" + this.name + ", rssi=" + this.rssi + ", connectable=" + this.connectable + ", serviceData=" + this.serviceData + ", serviceUuids=" + this.serviceUuids + ", manufacturerData=" + Arrays.toString(this.manufacturerData) + ')';
    }
}
