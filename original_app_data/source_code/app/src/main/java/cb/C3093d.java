package cb;

import Od.v;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3093d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26471e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3092c f26472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3092c f26473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3092c f26474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3092c f26475d;

    /* JADX INFO: renamed from: cb.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C3093d() {
        this((C3092c) null, (C3092c) null, (C3092c) null, (C3092c) null, 15, (AbstractC4854k) null);
    }

    public final C3093d a(float f10) {
        C3092c c3092c = this.f26472a;
        C3092c c3092c2 = new C3092c(c3092c.b() / f10, c3092c.c() / f10, c3092c.d() / f10, c3092c.a() / f10);
        C3092c c3092c3 = this.f26473b;
        C3092c c3092c4 = new C3092c(c3092c3.b() / f10, c3092c3.c() / f10, c3092c3.d() / f10, c3092c3.a() / f10);
        C3092c c3092c5 = this.f26474c;
        C3092c c3092c6 = new C3092c(c3092c5.b() / f10, c3092c5.c() / f10, c3092c5.d() / f10, c3092c5.a() / f10);
        C3092c c3092c7 = this.f26475d;
        return new C3093d(c3092c2, c3092c4, c3092c6, new C3092c(c3092c7.b() / f10, c3092c7.c() / f10, c3092c7.d() / f10, c3092c7.a() / f10));
    }

    public final C3092c b() {
        return this.f26475d;
    }

    public final C3092c c() {
        return this.f26472a;
    }

    public final C3092c d() {
        return this.f26473b;
    }

    public final C3092c e() {
        return this.f26474c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3093d)) {
            return false;
        }
        C3093d c3093d = (C3093d) obj;
        return AbstractC4862t.a(this.f26472a, c3093d.f26472a) && AbstractC4862t.a(this.f26473b, c3093d.f26473b) && AbstractC4862t.a(this.f26474c, c3093d.f26474c) && AbstractC4862t.a(this.f26475d, c3093d.f26475d);
    }

    public final C3092c f(C3092c v10) {
        AbstractC4862t.e(v10, "v");
        return new C3092c((this.f26472a.b() * v10.b()) + (this.f26473b.b() * v10.c()) + (this.f26474c.b() * v10.d()) + (this.f26475d.b() * v10.a()), (this.f26472a.c() * v10.b()) + (this.f26473b.c() * v10.c()) + (this.f26474c.c() * v10.d()) + (this.f26475d.c() * v10.a()), (this.f26472a.d() * v10.b()) + (this.f26473b.d() * v10.c()) + (this.f26474c.d() * v10.d()) + (this.f26475d.d() * v10.a()), (this.f26472a.a() * v10.b()) + (this.f26473b.a() * v10.c()) + (this.f26474c.a() * v10.d()) + (this.f26475d.a() * v10.a()));
    }

    public final C3093d g(C3093d m10) {
        AbstractC4862t.e(m10, "m");
        return new C3093d(new C3092c((this.f26472a.b() * m10.f26472a.b()) + (this.f26473b.b() * m10.f26472a.c()) + (this.f26474c.b() * m10.f26472a.d()) + (this.f26475d.b() * m10.f26472a.a()), (this.f26472a.c() * m10.f26472a.b()) + (this.f26473b.c() * m10.f26472a.c()) + (this.f26474c.c() * m10.f26472a.d()) + (this.f26475d.c() * m10.f26472a.a()), (this.f26472a.d() * m10.f26472a.b()) + (this.f26473b.d() * m10.f26472a.c()) + (this.f26474c.d() * m10.f26472a.d()) + (this.f26475d.d() * m10.f26472a.a()), (this.f26472a.a() * m10.f26472a.b()) + (this.f26473b.a() * m10.f26472a.c()) + (this.f26474c.a() * m10.f26472a.d()) + (this.f26475d.a() * m10.f26472a.a())), new C3092c((this.f26472a.b() * m10.f26473b.b()) + (this.f26473b.b() * m10.f26473b.c()) + (this.f26474c.b() * m10.f26473b.d()) + (this.f26475d.b() * m10.f26473b.a()), (this.f26472a.c() * m10.f26473b.b()) + (this.f26473b.c() * m10.f26473b.c()) + (this.f26474c.c() * m10.f26473b.d()) + (this.f26475d.c() * m10.f26473b.a()), (this.f26472a.d() * m10.f26473b.b()) + (this.f26473b.d() * m10.f26473b.c()) + (this.f26474c.d() * m10.f26473b.d()) + (this.f26475d.d() * m10.f26473b.a()), (this.f26472a.a() * m10.f26473b.b()) + (this.f26473b.a() * m10.f26473b.c()) + (this.f26474c.a() * m10.f26473b.d()) + (this.f26475d.a() * m10.f26473b.a())), new C3092c((this.f26472a.b() * m10.f26474c.b()) + (this.f26473b.b() * m10.f26474c.c()) + (this.f26474c.b() * m10.f26474c.d()) + (this.f26475d.b() * m10.f26474c.a()), (this.f26472a.c() * m10.f26474c.b()) + (this.f26473b.c() * m10.f26474c.c()) + (this.f26474c.c() * m10.f26474c.d()) + (this.f26475d.c() * m10.f26474c.a()), (this.f26472a.d() * m10.f26474c.b()) + (this.f26473b.d() * m10.f26474c.c()) + (this.f26474c.d() * m10.f26474c.d()) + (this.f26475d.d() * m10.f26474c.a()), (this.f26472a.a() * m10.f26474c.b()) + (this.f26473b.a() * m10.f26474c.c()) + (this.f26474c.a() * m10.f26474c.d()) + (this.f26475d.a() * m10.f26474c.a())), new C3092c((this.f26472a.b() * m10.f26475d.b()) + (this.f26473b.b() * m10.f26475d.c()) + (this.f26474c.b() * m10.f26475d.d()) + (this.f26475d.b() * m10.f26475d.a()), (this.f26472a.c() * m10.f26475d.b()) + (this.f26473b.c() * m10.f26475d.c()) + (this.f26474c.c() * m10.f26475d.d()) + (this.f26475d.c() * m10.f26475d.a()), (this.f26472a.d() * m10.f26475d.b()) + (this.f26473b.d() * m10.f26475d.c()) + (this.f26474c.d() * m10.f26475d.d()) + (this.f26475d.d() * m10.f26475d.a()), (this.f26472a.a() * m10.f26475d.b()) + (this.f26473b.a() * m10.f26475d.c()) + (this.f26474c.a() * m10.f26475d.d()) + (this.f26475d.a() * m10.f26475d.a())));
    }

    public final C3095f h() {
        return AbstractC3094e.b(this);
    }

    public int hashCode() {
        return (((((this.f26472a.hashCode() * 31) + this.f26473b.hashCode()) * 31) + this.f26474c.hashCode()) * 31) + this.f26475d.hashCode();
    }

    public String toString() {
        return v.n("\n            |" + this.f26472a.b() + ' ' + this.f26473b.b() + ' ' + this.f26474c.b() + ' ' + this.f26475d.b() + "|\n            |" + this.f26472a.c() + ' ' + this.f26473b.c() + ' ' + this.f26474c.c() + ' ' + this.f26475d.c() + "|\n            |" + this.f26472a.d() + ' ' + this.f26473b.d() + ' ' + this.f26474c.d() + ' ' + this.f26475d.d() + "|\n            |" + this.f26472a.a() + ' ' + this.f26473b.a() + ' ' + this.f26474c.a() + ' ' + this.f26475d.a() + "|\n            ");
    }

    public C3093d(C3092c x10, C3092c y10, C3092c z10, C3092c w10) {
        AbstractC4862t.e(x10, "x");
        AbstractC4862t.e(y10, "y");
        AbstractC4862t.e(z10, "z");
        AbstractC4862t.e(w10, "w");
        this.f26472a = x10;
        this.f26473b = y10;
        this.f26474c = z10;
        this.f26475d = w10;
    }

    public /* synthetic */ C3093d(C3092c c3092c, C3092c c3092c2, C3092c c3092c3, C3092c c3092c4, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new C3092c(1.0f, 0.0f, 0.0f, 0.0f, 14, null) : c3092c, (i10 & 2) != 0 ? new C3092c(0.0f, 1.0f, 0.0f, 0.0f, 13, null) : c3092c2, (i10 & 4) != 0 ? new C3092c(0.0f, 0.0f, 1.0f, 0.0f, 11, null) : c3092c3, (i10 & 8) != 0 ? new C3092c(0.0f, 0.0f, 0.0f, 1.0f, 7, null) : c3092c4);
    }

    public /* synthetic */ C3093d(C3091b c3091b, C3091b c3091b2, C3091b c3091b3, C3091b c3091b4, int i10, AbstractC4854k abstractC4854k) {
        this(c3091b, c3091b2, c3091b3, (i10 & 8) != 0 ? new C3091b(0.0f, 0.0f, 0.0f, 7, null) : c3091b4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3093d(C3091b right, C3091b up, C3091b forward, C3091b position) {
        this(new C3092c(right, 0.0f, 2, (AbstractC4854k) null), new C3092c(up, 0.0f, 2, (AbstractC4854k) null), new C3092c(forward, 0.0f, 2, (AbstractC4854k) null), new C3092c(position, 1.0f));
        AbstractC4862t.e(right, "right");
        AbstractC4862t.e(up, "up");
        AbstractC4862t.e(forward, "forward");
        AbstractC4862t.e(position, "position");
    }
}
