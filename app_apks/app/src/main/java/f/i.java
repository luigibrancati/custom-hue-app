package f;

import g.d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34109c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d.e f34113g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d.g f34107a = d.c.f34778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34108b = g.c.f34773b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d.b f34110d = d.b.a.f34776a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34116c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f34119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d.e f34120g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d.g f34114a = d.c.f34778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34115b = g.c.f34773b.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.b f34117d = d.b.a.f34776a;

        public final i a() {
            i iVar = new i();
            iVar.m(this.f34114a);
            iVar.k(this.f34115b);
            iVar.n(this.f34116c);
            iVar.j(this.f34117d);
            iVar.i(this.f34118e);
            iVar.h(this.f34119f);
            iVar.l(this.f34120g);
            return iVar;
        }

        public final a b(d.g mediaType) {
            AbstractC4862t.e(mediaType, "mediaType");
            this.f34114a = mediaType;
            return this;
        }
    }

    public final long a() {
        return this.f34112f;
    }

    public final d.b b() {
        return this.f34110d;
    }

    public final int c() {
        return this.f34108b;
    }

    public final d.e d() {
        return this.f34113g;
    }

    public final d.g e() {
        return this.f34107a;
    }

    public final boolean f() {
        return this.f34111e;
    }

    public final boolean g() {
        return this.f34109c;
    }

    public final void h(long j10) {
        this.f34112f = j10;
    }

    public final void i(boolean z10) {
        this.f34111e = z10;
    }

    public final void j(d.b bVar) {
        AbstractC4862t.e(bVar, "<set-?>");
        this.f34110d = bVar;
    }

    public final void k(int i10) {
        this.f34108b = i10;
    }

    public final void l(d.e eVar) {
        this.f34113g = eVar;
    }

    public final void m(d.g gVar) {
        AbstractC4862t.e(gVar, "<set-?>");
        this.f34107a = gVar;
    }

    public final void n(boolean z10) {
        this.f34109c = z10;
    }
}
