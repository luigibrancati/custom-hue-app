package xe;

import Fe.C0846h;
import Od.C;
import kotlin.jvm.internal.AbstractC4862t;
import qe.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48153a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0846h f48154b = C0846h.f4117d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f48155c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f48156d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f48157e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC4862t.d(binaryString, "toBinaryString(...)");
            strArr[i10] = C.K(p.h("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f48157e = strArr;
        String[] strArr2 = f48156d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f48156d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f48156d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f48156d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f48157e[i16];
            }
        }
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f48157e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f48156d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    AbstractC4862t.b(str);
                } else {
                    str = f48157e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : C.L(str2, "PRIORITY", "COMPRESSED", false, 4, null) : C.L(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f48157e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f48155c;
        return i10 < strArr.length ? strArr[i10] : p.h("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return p.h("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }

    public final String d(boolean z10, int i10, int i11, long j10) {
        return p.h("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(8), Long.valueOf(j10));
    }
}
