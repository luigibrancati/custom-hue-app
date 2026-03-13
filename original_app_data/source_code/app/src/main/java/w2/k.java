package w2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46125d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f46123b = str;
        this.f46124c = str2;
        this.f46125d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f46124c, kVar.f46124c) && Objects.equals(this.f46123b, kVar.f46123b) && Objects.equals(this.f46125d, kVar.f46125d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f46123b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46124c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46125d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": domain=" + this.f46123b + ", description=" + this.f46124c;
    }
}
