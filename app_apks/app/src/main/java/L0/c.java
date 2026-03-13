package L0;

import X0.h;
import android.content.LocusId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f8231b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public c(String str) {
        this.f8230a = (String) h.k(str, "id cannot be empty");
        this.f8231b = a.a(str);
    }

    public final String a() {
        return this.f8230a.length() + "_chars";
    }

    public LocusId b() {
        return this.f8231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f8230a;
        return str == null ? cVar.f8230a == null : str.equals(cVar.f8230a);
    }

    public int hashCode() {
        String str = this.f8230a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
