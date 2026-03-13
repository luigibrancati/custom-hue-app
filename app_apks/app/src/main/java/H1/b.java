package H1;

import D1.u;
import G1.AbstractC0853a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5120d;

    public b(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f5117a = str;
        this.f5118b = bArr;
        this.f5119c = i10;
        this.f5120d = i11;
    }

    public static String e(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        J7.g.f(',').b(sb2, list);
        return sb2.toString();
    }

    public static void f(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                AbstractC0853a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                AbstractC0853a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                AbstractC0853a.a(z10);
                break;
            case "auxiliary.tracks.map":
                AbstractC0853a.a(i10 == 0);
                break;
        }
    }

    public List d() {
        AbstractC0853a.h(this.f5117a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f5118b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f5118b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5117a.equals(bVar.f5117a) && Arrays.equals(this.f5118b, bVar.f5118b) && this.f5119c == bVar.f5119c && this.f5120d == bVar.f5120d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f5117a.hashCode()) * 31) + Arrays.hashCode(this.f5118b)) * 31) + this.f5119c) * 31) + this.f5120d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f5120d
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            G1.C r0 = new G1.C
            byte[] r1 = r3.f5118b
            r0.<init>(r1)
            long r0 = r0.S()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f5118b
            r1 = 0
            r0 = r0[r1]
            int r0 = java.lang.Byte.toUnsignedInt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f5118b
            int r0 = N7.g.h(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f5118b
            int r0 = N7.g.h(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f5118b
            java.lang.String r0 = G1.M.H(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f5117a
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.d()
            java.lang.String r0 = e(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f5118b
            java.lang.String r0 = G1.M.l1(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r3 = r3.f5117a
            r1.append(r3)
            java.lang.String r3 = ", value="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.b.toString():java.lang.String");
    }
}
