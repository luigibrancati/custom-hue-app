package J2;

import G1.AbstractC0853a;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5909f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f5904a = i10;
        this.f5905b = i11;
        this.f5906c = i12;
        this.f5907d = i13;
        this.f5908e = i14;
        this.f5909f = i15;
    }

    public static a a(String str) {
        AbstractC0853a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strE = J7.c.e(strArrSplit[i15].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, i14, strArrSplit.length);
    }
}
