package Db;

import Db.F;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2345a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2347c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2349b;

        public final boolean b(b bVar) {
            return this.f2348a == bVar.f2348a && this.f2349b == bVar.f2349b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int i10 = this.f2348a + 177573;
            return i10 + (i10 << 5) + this.f2349b;
        }

        public String toString() {
            return "Resolution{width=" + this.f2348a + ", height=" + this.f2349b + "}";
        }

        public b(G g10) {
            this.f2348a = g10.f2346b;
            this.f2349b = g10.f2347c;
        }
    }

    public G() {
        if (!(this instanceof F.a)) {
            throw new UnsupportedOperationException("Use: new Resolution.Builder()");
        }
    }

    public F c() {
        if (this.f2345a == 0) {
            return new b();
        }
        throw new IllegalStateException(d());
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2345a & 1) != 0) {
            arrayList.add("width");
        }
        if ((this.f2345a & 2) != 0) {
            arrayList.add("height");
        }
        return "Cannot build Resolution, some of required attributes are not set " + arrayList;
    }

    public final F.a e(int i10) {
        this.f2347c = i10;
        this.f2345a &= -3;
        return (F.a) this;
    }

    public final F.a f(int i10) {
        this.f2346b = i10;
        this.f2345a &= -2;
        return (F.a) this;
    }
}
