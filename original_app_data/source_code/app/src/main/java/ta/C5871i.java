package ta;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: ta.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5871i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f44861h = a();

    public C5871i(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f44854a = i10;
        this.f44855b = i11;
        this.f44856c = i12;
        this.f44857d = i13;
        this.f44858e = i14;
        this.f44859f = i15;
        this.f44860g = i16;
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final int[] a() {
        return new int[]{this.f44854a, this.f44855b, this.f44856c, this.f44857d, this.f44858e, this.f44859f, this.f44860g};
    }

    public String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        for (int i11 : this.f44861h) {
            if (b(i10, i11)) {
                sb2.append(d(i11));
                sb2.append(StringUtils.SPACE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final String d(int i10) {
        if (i10 == this.f44855b) {
            return "READ";
        }
        if (i10 == this.f44857d) {
            return "WRITE";
        }
        if (i10 == this.f44856c) {
            return "WRITE_NO_RESPONSE";
        }
        if (i10 == this.f44860g) {
            return "SIGNED_WRITE";
        }
        if (i10 == this.f44859f) {
            return "INDICATE";
        }
        if (i10 == this.f44854a) {
            return "BROADCAST";
        }
        if (i10 == this.f44858e) {
            return "NOTIFY";
        }
        if (i10 == 0) {
            return "";
        }
        ma.q.d("Unknown property specified (%d)", Integer.valueOf(i10));
        return "UNKNOWN (" + i10 + " -> check android.bluetooth.BluetoothGattCharacteristic)";
    }
}
