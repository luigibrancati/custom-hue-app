package x2;

import D1.u;
import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1074n;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import x2.C6293c;

/* JADX INFO: renamed from: x2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6293c implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47343a;

    /* JADX INFO: renamed from: x2.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f47344d = new Comparator() { // from class: x2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C6293c.a aVar = (C6293c.a) obj;
                C6293c.a aVar2 = (C6293c.a) obj2;
                return AbstractC1074n.j().e(aVar.f47345a, aVar2.f47345a).e(aVar.f47346b, aVar2.f47346b).d(aVar.f47347c, aVar2.f47347c).i();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47347c;

        public a(long j10, long j11, int i10) {
            AbstractC0853a.a(j10 < j11);
            this.f47345a = j10;
            this.f47346b = j11;
            this.f47347c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f47345a == aVar.f47345a && this.f47346b == aVar.f47346b && this.f47347c == aVar.f47347c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f47345a), Long.valueOf(this.f47346b), Integer.valueOf(this.f47347c));
        }

        public String toString() {
            return M.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f47345a), Long.valueOf(this.f47346b), Integer.valueOf(this.f47347c));
        }
    }

    public C6293c(List list) {
        this.f47343a = list;
        AbstractC0853a.a(!d(list));
    }

    public static boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((a) list.get(0)).f47346b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f47345a < j10) {
                return true;
            }
            j10 = ((a) list.get(i10)).f47346b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6293c.class != obj.getClass()) {
            return false;
        }
        return this.f47343a.equals(((C6293c) obj).f47343a);
    }

    public int hashCode() {
        return this.f47343a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f47343a;
    }
}
