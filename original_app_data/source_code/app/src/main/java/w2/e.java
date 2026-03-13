package w2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46111d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f46109b = str;
        this.f46110c = str2;
        this.f46111d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f46110c, eVar.f46110c) && Objects.equals(this.f46109b, eVar.f46109b) && Objects.equals(this.f46111d, eVar.f46111d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f46109b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46110c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46111d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": language=" + this.f46109b + ", description=" + this.f46110c + ", text=" + this.f46111d;
    }
}
