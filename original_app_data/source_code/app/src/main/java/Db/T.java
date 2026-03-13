package Db;

import Db.S;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2391a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f2393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2394d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f2395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2396b;

        public final boolean b(b bVar) {
            return Double.doubleToLongBits(this.f2395a) == Double.doubleToLongBits(bVar.f2395a) && this.f2396b == bVar.f2396b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int iHashCode = Double.hashCode(this.f2395a) + 177573;
            return iHashCode + (iHashCode << 5) + Boolean.hashCode(this.f2396b);
        }

        public String toString() {
            return "StartTimeOffset{timeOffset=" + this.f2395a + ", precise=" + this.f2396b + "}";
        }

        public b(T t10) {
            this.f2395a = t10.f2393c;
            this.f2396b = t10.g() ? t10.f2394d : super.a();
        }
    }

    public T() {
        if (!(this instanceof S.a)) {
            throw new UnsupportedOperationException("Use: new StartTimeOffset.Builder()");
        }
    }

    public S d() {
        if (this.f2391a == 0) {
            return new b();
        }
        throw new IllegalStateException(e());
    }

    public final String e() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2391a & 1) != 0) {
            arrayList.add(RRWebInteractionMoveEvent.Position.JsonKeys.TIME_OFFSET);
        }
        return "Cannot build StartTimeOffset, some of required attributes are not set " + arrayList;
    }

    public S.a f(boolean z10) {
        this.f2394d = z10;
        this.f2392b |= 1;
        return (S.a) this;
    }

    public final boolean g() {
        return (this.f2392b & 1) != 0;
    }

    public S.a h(double d10) {
        this.f2393c = d10;
        this.f2391a &= -2;
        return (S.a) this;
    }
}
