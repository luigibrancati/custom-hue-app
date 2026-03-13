package H1;

import D1.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5121a;

    public c(int i10) {
        this.f5121a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f5121a == ((c) obj).f5121a;
    }

    public int hashCode() {
        return this.f5121a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f5121a;
    }
}
