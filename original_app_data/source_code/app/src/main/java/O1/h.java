package O1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10811e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f10807a = str;
        this.f10808b = str2;
        this.f10809c = str3;
        this.f10810d = str4;
        this.f10811e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f10807a, hVar.f10807a) && Objects.equals(this.f10808b, hVar.f10808b) && Objects.equals(this.f10809c, hVar.f10809c) && Objects.equals(this.f10810d, hVar.f10810d) && Objects.equals(this.f10811e, hVar.f10811e);
    }

    public int hashCode() {
        String str = this.f10807a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10808b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10809c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10810d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f10811e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
