package ra;

import android.bluetooth.le.ScanRecord;
import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import ta.H;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class w implements ua.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScanRecord f43910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f43911b;

    public w(ScanRecord scanRecord, H h10) {
        this.f43910a = scanRecord;
        this.f43911b = h10;
    }

    @Override // ua.e
    public String a() {
        return this.f43910a.getDeviceName();
    }

    @Override // ua.e
    public byte[] b(int i10) {
        return this.f43910a.getManufacturerSpecificData(i10);
    }

    @Override // ua.e
    public SparseArray c() {
        return this.f43910a.getManufacturerSpecificData();
    }

    @Override // ua.e
    public List d() {
        return this.f43910a.getServiceUuids();
    }

    @Override // ua.e
    public Map e() {
        return this.f43910a.getServiceData();
    }

    @Override // ua.e
    public byte[] f() {
        return this.f43910a.getBytes();
    }

    @Override // ua.e
    public List g() {
        return this.f43910a.getServiceSolicitationUuids();
    }

    @Override // ua.e
    public byte[] h(ParcelUuid parcelUuid) {
        return this.f43910a.getServiceData(parcelUuid);
    }
}
