package N6;

import java.util.Arrays;

/* JADX INFO: renamed from: N6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1486t f10499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1486t f10500c;

    public /* synthetic */ C1512v(String str, AbstractC1499u abstractC1499u) {
        C1486t c1486t = new C1486t();
        this.f10499b = c1486t;
        this.f10500c = c1486t;
        str.getClass();
        this.f10498a = str;
    }

    public final C1512v a(Object obj) {
        C1486t c1486t = new C1486t();
        this.f10500c.f10470b = c1486t;
        this.f10500c = c1486t;
        c1486t.f10469a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f10498a);
        sb2.append('{');
        C1486t c1486t = this.f10499b.f10470b;
        String str = "";
        while (c1486t != null) {
            Object obj = c1486t.f10469a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            c1486t = c1486t.f10470b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
