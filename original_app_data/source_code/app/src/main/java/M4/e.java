package M4;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9273b;

    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f9273b;
    }

    public final String b() {
        return this.f9272a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC4862t.a(this.f9272a, eVar.f9272a) && AbstractC4862t.a(this.f9273b, eVar.f9273b);
    }

    public int hashCode() {
        String str = this.f9272a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9273b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Identity(userId=" + this.f9272a + ", deviceId=" + this.f9273b + ')';
    }

    public e(String str, String str2) {
        this.f9272a = str;
        this.f9273b = str2;
    }

    public /* synthetic */ e(String str, String str2, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
