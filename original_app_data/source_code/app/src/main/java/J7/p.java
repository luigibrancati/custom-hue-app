package J7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements o, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6297a;

        @Override // J7.o
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f6297a.size(); i10++) {
                if (!((o) this.f6297a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6297a.equals(((b) obj).f6297a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6297a.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.f6297a);
        }

        public b(List list) {
            this.f6297a = list;
        }
    }

    public static o b(o oVar, o oVar2) {
        return new b(c((o) n.j(oVar), (o) n.j(oVar2)));
    }

    public static List c(o oVar, o oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
