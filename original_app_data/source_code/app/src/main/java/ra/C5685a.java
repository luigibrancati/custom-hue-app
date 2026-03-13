package ra;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.ArrayList;
import java.util.List;
import ua.C6013d;

/* JADX INFO: renamed from: ra.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5685a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43866a;

    public C5685a(int i10) {
        this.f43866a = i10;
    }

    public static void a(ua.g gVar, ScanSettings.Builder builder) {
        builder.setCallbackType(gVar.b()).setMatchMode(gVar.d()).setNumOfMatches(gVar.e());
    }

    public static ScanFilter b(C6013d c6013d) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        if (c6013d.l() != null) {
            builder.setServiceData(c6013d.l(), c6013d.j(), c6013d.k());
        }
        if (c6013d.e() != null) {
            builder.setDeviceAddress(c6013d.e());
        }
        return builder.setDeviceName(c6013d.f()).setManufacturerData(c6013d.i(), c6013d.g(), c6013d.h()).setServiceUuid(c6013d.m(), c6013d.n()).build();
    }

    public List c(C6013d... c6013dArr) {
        if (c6013dArr == null || c6013dArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(c6013dArr.length);
        for (C6013d c6013d : c6013dArr) {
            arrayList.add(b(c6013d));
        }
        return arrayList;
    }

    public ScanSettings d(ua.g gVar) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (this.f43866a >= 23) {
            a(gVar, builder);
            if (this.f43866a >= 26) {
                builder.setLegacy(gVar.c());
            }
        }
        return builder.setReportDelay(gVar.f()).setScanMode(gVar.g()).build();
    }
}
