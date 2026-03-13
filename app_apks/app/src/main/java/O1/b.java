package O1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10765d;

    public b(String str, String str2, int i10, int i11) {
        this.f10762a = str;
        this.f10763b = str2;
        this.f10764c = i10;
        this.f10765d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10764c == bVar.f10764c && this.f10765d == bVar.f10765d && Objects.equals(this.f10762a, bVar.f10762a) && Objects.equals(this.f10763b, bVar.f10763b);
    }

    public int hashCode() {
        return Objects.hash(this.f10762a, this.f10763b, Integer.valueOf(this.f10764c), Integer.valueOf(this.f10765d));
    }
}
