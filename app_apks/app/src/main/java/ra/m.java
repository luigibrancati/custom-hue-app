package ra;

import android.bluetooth.le.ScanResult;
import ua.EnumC6011b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m implements j {
    @Override // ra.j
    public EnumC6011b a(ScanResult scanResult) {
        return scanResult.isConnectable() ? EnumC6011b.CONNECTABLE : EnumC6011b.NOT_CONNECTABLE;
    }
}
