package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import v3.AbstractC6037a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC6037a abstractC6037a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f22666a = abstractC6037a.p(iconCompat.f22666a, 1);
        iconCompat.f22668c = abstractC6037a.j(iconCompat.f22668c, 2);
        iconCompat.f22669d = abstractC6037a.r(iconCompat.f22669d, 3);
        iconCompat.f22670e = abstractC6037a.p(iconCompat.f22670e, 4);
        iconCompat.f22671f = abstractC6037a.p(iconCompat.f22671f, 5);
        iconCompat.f22672g = (ColorStateList) abstractC6037a.r(iconCompat.f22672g, 6);
        iconCompat.f22674i = abstractC6037a.t(iconCompat.f22674i, 7);
        iconCompat.f22675j = abstractC6037a.t(iconCompat.f22675j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC6037a abstractC6037a) {
        abstractC6037a.x(true, true);
        iconCompat.q(abstractC6037a.f());
        int i10 = iconCompat.f22666a;
        if (-1 != i10) {
            abstractC6037a.F(i10, 1);
        }
        byte[] bArr = iconCompat.f22668c;
        if (bArr != null) {
            abstractC6037a.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f22669d;
        if (parcelable != null) {
            abstractC6037a.H(parcelable, 3);
        }
        int i11 = iconCompat.f22670e;
        if (i11 != 0) {
            abstractC6037a.F(i11, 4);
        }
        int i12 = iconCompat.f22671f;
        if (i12 != 0) {
            abstractC6037a.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f22672g;
        if (colorStateList != null) {
            abstractC6037a.H(colorStateList, 6);
        }
        String str = iconCompat.f22674i;
        if (str != null) {
            abstractC6037a.J(str, 7);
        }
        String str2 = iconCompat.f22675j;
        if (str2 != null) {
            abstractC6037a.J(str2, 8);
        }
    }
}
