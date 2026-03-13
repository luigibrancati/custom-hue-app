package M8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9385b;

    public a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f9384a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f9385b = list;
    }

    @Override // M8.p
    public List b() {
        return this.f9385b;
    }

    @Override // M8.p
    public String c() {
        return this.f9384a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9384a.equals(pVar.c()) && this.f9385b.equals(pVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f9385b.hashCode() ^ ((this.f9384a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f9384a + ", usedDates=" + this.f9385b + "}";
    }
}
