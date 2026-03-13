package Db;

import Db.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2387b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2386a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2388c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2390b;

        public final boolean a(b bVar) {
            return this.f2389a == bVar.f2389a && this.f2390b.equals(bVar.f2390b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f2389a) + 177573;
            return iHashCode + (iHashCode << 5) + this.f2390b.hashCode();
        }

        public String toString() {
            return "Skip{skippedSegments=" + this.f2389a + ", recentlyRemovedDateRanges=" + this.f2390b + "}";
        }

        public b(Q q10) {
            this.f2389a = q10.f2387b;
            this.f2390b = Q.f(true, q10.f2388c);
        }
    }

    public Q() {
        if (!(this instanceof P.a)) {
            throw new UnsupportedOperationException("Use: new Skip.Builder()");
        }
    }

    public static List f(boolean z10, List list) {
        int size = list.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        if (size == 1) {
            return Collections.singletonList(list.get(0));
        }
        if (z10) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
    }

    public final P.a d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2388c;
            Objects.requireNonNull(str, "recentlyRemovedDateRanges element");
            list.add(str);
        }
        return (P.a) this;
    }

    public P e() {
        if (this.f2386a == 0) {
            return new b();
        }
        throw new IllegalStateException(g());
    }

    public final String g() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2386a & 1) != 0) {
            arrayList.add("skippedSegments");
        }
        return "Cannot build Skip, some of required attributes are not set " + arrayList;
    }

    public P.a h(Iterable iterable) {
        this.f2388c.clear();
        return d(iterable);
    }

    public P.a i(long j10) {
        this.f2387b = j10;
        this.f2386a &= -2;
        return (P.a) this;
    }
}
