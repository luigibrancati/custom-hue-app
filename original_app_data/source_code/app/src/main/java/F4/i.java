package F4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.a f3756b;

    public i(j type, E4.a aVar) {
        AbstractC4862t.e(type, "type");
        this.f3755a = type;
        this.f3756b = aVar;
    }

    public final E4.a a() {
        return this.f3756b;
    }

    public final j b() {
        return this.f3755a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3755a == iVar.f3755a && AbstractC4862t.a(this.f3756b, iVar.f3756b);
    }

    public int hashCode() {
        int iHashCode = this.f3755a.hashCode() * 31;
        E4.a aVar = this.f3756b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "WriteQueueMessage(type=" + this.f3755a + ", event=" + this.f3756b + ')';
    }
}
