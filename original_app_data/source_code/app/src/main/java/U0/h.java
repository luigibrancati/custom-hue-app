package U0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f16576b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16577a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f16578a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }
    }

    public h(i iVar) {
        this.f16577a = iVar;
    }

    public static h a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static h d() {
        return i(b.b());
    }

    public static h e() {
        return f16576b;
    }

    public static h i(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale c(int i10) {
        return this.f16577a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f16577a.equals(((h) obj).f16577a);
    }

    public boolean f() {
        return this.f16577a.isEmpty();
    }

    public int g() {
        return this.f16577a.size();
    }

    public String h() {
        return this.f16577a.a();
    }

    public int hashCode() {
        return this.f16577a.hashCode();
    }

    public String toString() {
        return this.f16577a.toString();
    }
}
