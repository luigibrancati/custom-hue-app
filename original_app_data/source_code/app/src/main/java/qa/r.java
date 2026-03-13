package qa;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import la.C4981m;
import pa.AbstractC5451b;
import ra.C5685a;
import ra.C5689e;
import ra.C5690f;
import ta.F;
import ua.C6013d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5690f f43397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5685a f43398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua.g f43399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5689e f43400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6013d[] f43401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Eb.l f43402g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            Eb.l lVar;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ra.o oVarC = r.this.f43397b.c((ScanResult) it.next());
                if (r.this.f43400e.b(oVarC) && (lVar = r.this.f43402g) != null) {
                    lVar.c(oVarC);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            Eb.l lVar = r.this.f43402g;
            if (lVar != null) {
                lVar.d(new C4981m(r.w(i10)));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            Eb.l lVar;
            if (!r.this.f43400e.a() && ma.q.l(3) && ma.q.i()) {
                ScanRecord scanRecord = scanResult.getScanRecord();
                ma.q.b("%s, name=%s, rssi=%d, data=%s", AbstractC5451b.d(scanResult.getDevice().getAddress()), scanResult.getDevice().getName(), Integer.valueOf(scanResult.getRssi()), AbstractC5451b.a(scanRecord != null ? scanRecord.getBytes() : null));
            }
            ra.o oVarA = r.this.f43397b.a(i10, scanResult);
            if (!r.this.f43400e.b(oVarA) || (lVar = r.this.f43402g) == null) {
                return;
            }
            lVar.c(oVarA);
        }
    }

    public r(F f10, C5690f c5690f, C5685a c5685a, ua.g gVar, C5689e c5689e, C6013d[] c6013dArr) {
        super(f10);
        this.f43397b = c5690f;
        this.f43399d = gVar;
        this.f43400e = c5689e;
        this.f43401f = c6013dArr;
        this.f43398c = c5685a;
        this.f43402g = null;
    }

    public static int w(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 6;
        }
        if (i10 == 3) {
            return 7;
        }
        if (i10 == 4) {
            return 8;
        }
        if (i10 == 5) {
            return 9;
        }
        ma.q.q("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new Object[0]);
        return Integer.MAX_VALUE;
    }

    public String toString() {
        String str;
        C6013d[] c6013dArr = this.f43401f;
        boolean z10 = c6013dArr == null || c6013dArr.length == 0;
        boolean zA = this.f43400e.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ScanOperationApi21{");
        String str2 = "";
        if (z10) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> nativeFilters=" + Arrays.toString(this.f43401f);
        }
        sb2.append(str);
        sb2.append((z10 || zA) ? "" : " and then ");
        if (!zA) {
            str2 = "ANY_MUST_MATCH -> " + this.f43400e;
        }
        sb2.append(str2);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // qa.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ScanCallback p(Eb.l lVar) {
        this.f43402g = lVar;
        return new a();
    }

    @Override // qa.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean q(F f10, ScanCallback scanCallback) {
        if (this.f43400e.a()) {
            ma.q.b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        f10.d(this.f43398c.c(this.f43401f), this.f43398c.d(this.f43399d), scanCallback);
        return true;
    }

    @Override // qa.p
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(F f10, ScanCallback scanCallback) {
        f10.f(scanCallback);
        Eb.l lVar = this.f43402g;
        if (lVar != null) {
            lVar.a();
            this.f43402g = null;
        }
    }
}
