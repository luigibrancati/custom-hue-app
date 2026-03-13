package Db;

import Db.InterfaceC0771s;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: Db.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0772t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2634a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f2637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0756c f2639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2640g;

    /* JADX INFO: renamed from: Db.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0771s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f2642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC0756c f2644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f2645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile transient a f2646f;

        /* JADX INFO: renamed from: Db.t$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f2647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2648b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2649c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2650d;

            public a() {
            }

            public final String a() {
                ArrayList arrayList = new ArrayList();
                if (this.f2648b == -1) {
                    arrayList.add("independent");
                }
                if (this.f2650d == -1) {
                    arrayList.add("gap");
                }
                return "Cannot build PartialSegment, attribute initializers form cycle" + arrayList;
            }

            public void b(boolean z10) {
                this.f2649c = z10;
                this.f2650d = 1;
            }

            public boolean c() {
                int i10 = this.f2650d;
                if (i10 == -1) {
                    throw new IllegalStateException(a());
                }
                if (i10 == 0) {
                    this.f2650d = -1;
                    this.f2649c = b.this.f();
                    this.f2650d = 1;
                }
                return this.f2649c;
            }

            public void d(boolean z10) {
                this.f2647a = z10;
                this.f2648b = 1;
            }

            public boolean e() {
                int i10 = this.f2648b;
                if (i10 == -1) {
                    throw new IllegalStateException(a());
                }
                if (i10 == 0) {
                    this.f2648b = -1;
                    this.f2647a = b.this.g();
                    this.f2648b = 1;
                }
                return this.f2647a;
            }
        }

        public final boolean e(b bVar) {
            return this.f2641a.equals(bVar.f2641a) && Double.doubleToLongBits(this.f2642b) == Double.doubleToLongBits(bVar.f2642b) && this.f2643c == bVar.f2643c && Objects.equals(this.f2644d, bVar.f2644d) && this.f2645e == bVar.f2645e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && e((b) obj);
        }

        public final boolean f() {
            return super.b();
        }

        public final boolean g() {
            return super.a();
        }

        public int hashCode() {
            int iHashCode = this.f2641a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Double.hashCode(this.f2642b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Boolean.hashCode(this.f2643c);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2644d);
            return iHashCode4 + (iHashCode4 << 5) + Boolean.hashCode(this.f2645e);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PartialSegment{");
            sb2.append("uri=");
            sb2.append(this.f2641a);
            sb2.append(", ");
            sb2.append("duration=");
            sb2.append(this.f2642b);
            sb2.append(", ");
            sb2.append("independent=");
            sb2.append(this.f2643c);
            if (this.f2644d != null) {
                sb2.append(", ");
                sb2.append("byterange=");
                sb2.append(this.f2644d);
            }
            sb2.append(", ");
            sb2.append("gap=");
            sb2.append(this.f2645e);
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0772t abstractC0772t) {
            this.f2646f = new a();
            this.f2641a = abstractC0772t.f2636c;
            this.f2642b = abstractC0772t.f2637d;
            this.f2644d = abstractC0772t.f2639f;
            if (abstractC0772t.o()) {
                this.f2646f.d(abstractC0772t.f2638e);
            }
            if (abstractC0772t.m()) {
                this.f2646f.b(abstractC0772t.f2640g);
            }
            this.f2643c = this.f2646f.e();
            this.f2645e = this.f2646f.c();
            this.f2646f = null;
        }
    }

    public AbstractC0772t() {
        if (!(this instanceof InterfaceC0771s.a)) {
            throw new UnsupportedOperationException("Use: new PartialSegment.Builder()");
        }
    }

    public InterfaceC0771s h() {
        if (this.f2634a == 0) {
            return new b();
        }
        throw new IllegalStateException(k());
    }

    public InterfaceC0771s.a i(InterfaceC0756c interfaceC0756c) {
        Objects.requireNonNull(interfaceC0756c, "byterange");
        this.f2639f = interfaceC0756c;
        return (InterfaceC0771s.a) this;
    }

    public InterfaceC0771s.a j(double d10) {
        this.f2637d = d10;
        this.f2634a &= -3;
        return (InterfaceC0771s.a) this;
    }

    public final String k() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2634a & 1) != 0) {
            arrayList.add("uri");
        }
        if ((this.f2634a & 2) != 0) {
            arrayList.add("duration");
        }
        return "Cannot build PartialSegment, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0771s.a l(boolean z10) {
        this.f2640g = z10;
        this.f2635b |= 2;
        return (InterfaceC0771s.a) this;
    }

    public final boolean m() {
        return (this.f2635b & 2) != 0;
    }

    public InterfaceC0771s.a n(boolean z10) {
        this.f2638e = z10;
        this.f2635b |= 1;
        return (InterfaceC0771s.a) this;
    }

    public final boolean o() {
        return (this.f2635b & 1) != 0;
    }

    public InterfaceC0771s.a p(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2636c = str;
        this.f2634a &= -2;
        return (InterfaceC0771s.a) this;
    }
}
