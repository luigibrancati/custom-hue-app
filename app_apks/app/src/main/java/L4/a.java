package L4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f8565e;

    public a(String eventType, Map map, Map map2, Map map3, Map map4) {
        AbstractC4862t.e(eventType, "eventType");
        this.f8561a = eventType;
        this.f8562b = map;
        this.f8563c = map2;
        this.f8564d = map3;
        this.f8565e = map4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(this.f8561a, aVar.f8561a) && AbstractC4862t.a(this.f8562b, aVar.f8562b) && AbstractC4862t.a(this.f8563c, aVar.f8563c) && AbstractC4862t.a(this.f8564d, aVar.f8564d) && AbstractC4862t.a(this.f8565e, aVar.f8565e);
    }

    public int hashCode() {
        int iHashCode = this.f8561a.hashCode() * 31;
        Map map = this.f8562b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f8563c;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f8564d;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f8565e;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "Event(eventType=" + this.f8561a + ", eventProperties=" + this.f8562b + ", userProperties=" + this.f8563c + ", groups=" + this.f8564d + ", groupProperties=" + this.f8565e + ')';
    }
}
