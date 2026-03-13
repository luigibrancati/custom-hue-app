package L;

import L.e1;
import android.util.Range;
import android.util.Size;

/* JADX INFO: renamed from: L.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1110m extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f8129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f8130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E.J f8131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range f8133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1099g0 f8134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8135h;

    /* JADX INFO: renamed from: L.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends e1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f8136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Size f8137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public E.J f8138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f8139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range f8140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1099g0 f8141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f8142g;

        @Override // L.e1.a
        public e1 a() {
            String str = "";
            if (this.f8136a == null) {
                str = " resolution";
            }
            if (this.f8137b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f8138c == null) {
                str = str + " dynamicRange";
            }
            if (this.f8139d == null) {
                str = str + " sessionType";
            }
            if (this.f8140e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f8142g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C1110m(this.f8136a, this.f8137b, this.f8138c, this.f8139d.intValue(), this.f8140e, this.f8141f, this.f8142g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L.e1.a
        public e1.a b(E.J j10) {
            if (j10 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f8138c = j10;
            return this;
        }

        @Override // L.e1.a
        public e1.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f8140e = range;
            return this;
        }

        @Override // L.e1.a
        public e1.a d(InterfaceC1099g0 interfaceC1099g0) {
            this.f8141f = interfaceC1099g0;
            return this;
        }

        @Override // L.e1.a
        public e1.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.f8137b = size;
            return this;
        }

        @Override // L.e1.a
        public e1.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f8136a = size;
            return this;
        }

        @Override // L.e1.a
        public e1.a g(int i10) {
            this.f8139d = Integer.valueOf(i10);
            return this;
        }

        @Override // L.e1.a
        public e1.a h(boolean z10) {
            this.f8142g = Boolean.valueOf(z10);
            return this;
        }

        public b() {
        }

        public b(e1 e1Var) {
            this.f8136a = e1Var.f();
            this.f8137b = e1Var.e();
            this.f8138c = e1Var.b();
            this.f8139d = Integer.valueOf(e1Var.g());
            this.f8140e = e1Var.c();
            this.f8141f = e1Var.d();
            this.f8142g = Boolean.valueOf(e1Var.h());
        }
    }

    @Override // L.e1
    public E.J b() {
        return this.f8131d;
    }

    @Override // L.e1
    public Range c() {
        return this.f8133f;
    }

    @Override // L.e1
    public InterfaceC1099g0 d() {
        return this.f8134g;
    }

    @Override // L.e1
    public Size e() {
        return this.f8130c;
    }

    public boolean equals(Object obj) {
        InterfaceC1099g0 interfaceC1099g0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (this.f8129b.equals(e1Var.f()) && this.f8130c.equals(e1Var.e()) && this.f8131d.equals(e1Var.b()) && this.f8132e == e1Var.g() && this.f8133f.equals(e1Var.c()) && ((interfaceC1099g0 = this.f8134g) != null ? interfaceC1099g0.equals(e1Var.d()) : e1Var.d() == null) && this.f8135h == e1Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // L.e1
    public Size f() {
        return this.f8129b;
    }

    @Override // L.e1
    public int g() {
        return this.f8132e;
    }

    @Override // L.e1
    public boolean h() {
        return this.f8135h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f8129b.hashCode() ^ 1000003) * 1000003) ^ this.f8130c.hashCode()) * 1000003) ^ this.f8131d.hashCode()) * 1000003) ^ this.f8132e) * 1000003) ^ this.f8133f.hashCode()) * 1000003;
        InterfaceC1099g0 interfaceC1099g0 = this.f8134g;
        return (this.f8135h ? 1231 : 1237) ^ ((iHashCode ^ (interfaceC1099g0 == null ? 0 : interfaceC1099g0.hashCode())) * 1000003);
    }

    @Override // L.e1
    public e1.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f8129b + ", originalConfiguredResolution=" + this.f8130c + ", dynamicRange=" + this.f8131d + ", sessionType=" + this.f8132e + ", expectedFrameRateRange=" + this.f8133f + ", implementationOptions=" + this.f8134g + ", zslDisabled=" + this.f8135h + "}";
    }

    public C1110m(Size size, Size size2, E.J j10, int i10, Range range, InterfaceC1099g0 interfaceC1099g0, boolean z10) {
        this.f8129b = size;
        this.f8130c = size2;
        this.f8131d = j10;
        this.f8132e = i10;
        this.f8133f = range;
        this.f8134g = interfaceC1099g0;
        this.f8135h = z10;
    }
}
