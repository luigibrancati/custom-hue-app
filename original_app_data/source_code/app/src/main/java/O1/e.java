package O1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10796c;

    public e(String str, String str2, String str3) {
        this.f10794a = str;
        this.f10795b = str2;
        this.f10796c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f10794a, eVar.f10794a) && Objects.equals(this.f10795b, eVar.f10795b) && Objects.equals(this.f10796c, eVar.f10796c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f10794a.hashCode() * 31;
        String str = this.f10795b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10796c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
