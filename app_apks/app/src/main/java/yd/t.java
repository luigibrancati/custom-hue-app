package yd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kd.b f48616d;

    public t(Object obj, Object obj2, String filePath, kd.b classId) {
        AbstractC4862t.e(filePath, "filePath");
        AbstractC4862t.e(classId, "classId");
        this.f48613a = obj;
        this.f48614b = obj2;
        this.f48615c = filePath;
        this.f48616d = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return AbstractC4862t.a(this.f48613a, tVar.f48613a) && AbstractC4862t.a(this.f48614b, tVar.f48614b) && AbstractC4862t.a(this.f48615c, tVar.f48615c) && AbstractC4862t.a(this.f48616d, tVar.f48616d);
    }

    public int hashCode() {
        Object obj = this.f48613a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f48614b;
        return ((((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f48615c.hashCode()) * 31) + this.f48616d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f48613a + ", expectedVersion=" + this.f48614b + ", filePath=" + this.f48615c + ", classId=" + this.f48616d + ')';
    }
}
