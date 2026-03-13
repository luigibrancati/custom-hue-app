package H1;

import G1.C;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5116c;

    public a(int i10, int i11, String str) {
        this.f5114a = i10;
        this.f5115b = i11;
        this.f5116c = str;
    }

    public static a a(C c10) {
        String str;
        c10.b0(2);
        int iL = c10.L();
        int i10 = iL >> 1;
        int iL2 = ((c10.L() >> 3) & 31) | ((iL & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iL2 < 10 ? ".0" : ".");
        sb2.append(iL2);
        return new a(i10, iL2, sb2.toString());
    }
}
