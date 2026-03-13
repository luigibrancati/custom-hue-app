package D1;

import G1.M;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1861c = M.z0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1862d = M.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1864b;

    public q(String str, String str2) {
        this.f1863a = M.P0(str);
        this.f1864b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (Objects.equals(this.f1863a, qVar.f1863a) && Objects.equals(this.f1864b, qVar.f1864b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f1864b.hashCode() * 31;
        String str = this.f1863a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
