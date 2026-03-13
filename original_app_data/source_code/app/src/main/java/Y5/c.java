package Y5;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19785a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f19785a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f19785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f19785a.equals(((c) obj).f19785a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19785a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f19785a + "\"}";
    }
}
