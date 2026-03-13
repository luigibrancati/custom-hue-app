package X0;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17987b;

    public d(Object obj, Object obj2) {
        this.f17986a = obj;
        this.f17987b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f17986a, this.f17986a) && c.a(dVar.f17987b, this.f17987b);
    }

    public int hashCode() {
        Object obj = this.f17986a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f17987b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f17986a + StringUtils.SPACE + this.f17987b + "}";
    }
}
