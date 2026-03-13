package u9;

import java.util.Set;
import w9.z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f45472a = new z(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f45472a.equals(this.f45472a);
        }
        return true;
    }

    public int hashCode() {
        return this.f45472a.hashCode();
    }

    public void r(String str, j jVar) {
        z zVar = this.f45472a;
        if (jVar == null) {
            jVar = l.f45471a;
        }
        zVar.put(str, jVar);
    }

    public Set s() {
        return this.f45472a.entrySet();
    }

    public boolean t(String str) {
        return this.f45472a.containsKey(str);
    }

    public j v(String str) {
        return (j) this.f45472a.remove(str);
    }
}
