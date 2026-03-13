package D1;

import G1.AbstractC0853a;
import G1.M;
import java.util.Objects;

/* JADX INFO: renamed from: D1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0752j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0752j f1711e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1712f = M.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1713g = M.z0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1714h = M.z0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f1715i = M.z0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1719d;

    /* JADX INFO: renamed from: D1.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1723d;

        public b(int i10) {
            this.f1720a = i10;
        }

        public C0752j e() {
            AbstractC0853a.a(this.f1721b <= this.f1722c);
            return new C0752j(this);
        }

        public b f(int i10) {
            this.f1722c = i10;
            return this;
        }

        public b g(int i10) {
            this.f1721b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0752j)) {
            return false;
        }
        C0752j c0752j = (C0752j) obj;
        return this.f1716a == c0752j.f1716a && this.f1717b == c0752j.f1717b && this.f1718c == c0752j.f1718c && Objects.equals(this.f1719d, c0752j.f1719d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f1716a) * 31) + this.f1717b) * 31) + this.f1718c) * 31;
        String str = this.f1719d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public C0752j(b bVar) {
        this.f1716a = bVar.f1720a;
        this.f1717b = bVar.f1721b;
        this.f1718c = bVar.f1722c;
        this.f1719d = bVar.f1723d;
    }
}
