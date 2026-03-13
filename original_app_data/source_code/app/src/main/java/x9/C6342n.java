package x9;

import u9.w;
import u9.x;
import w9.AbstractC6172a;
import w9.F;

/* JADX INFO: renamed from: x9.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6342n extends AbstractC6341m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.i f48010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.e f48011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B9.a f48012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f48013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f48014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile w f48016g;

    /* JADX INFO: renamed from: x9.n$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements u9.h {
        public b() {
        }
    }

    /* JADX INFO: renamed from: x9.n$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B9.a f48018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f48020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u9.i f48021d;

        public c(Object obj, B9.a aVar, boolean z10, Class cls) {
            u9.i iVar = obj instanceof u9.i ? (u9.i) obj : null;
            this.f48021d = iVar;
            AbstractC6172a.a(iVar != null);
            this.f48018a = aVar;
            this.f48019b = z10;
            this.f48020c = cls;
        }

        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            B9.a aVar2 = this.f48018a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f48019b && this.f48018a.d() == aVar.c()) : this.f48020c.isAssignableFrom(aVar.c())) {
                return new C6342n(null, this.f48021d, eVar, aVar, this);
            }
            return null;
        }
    }

    public C6342n(u9.p pVar, u9.i iVar, u9.e eVar, B9.a aVar, x xVar, boolean z10) {
        this.f48014e = new b();
        this.f48010a = iVar;
        this.f48011b = eVar;
        this.f48012c = aVar;
        this.f48013d = xVar;
        this.f48015f = z10;
    }

    private w g() {
        w wVar = this.f48016g;
        if (wVar != null) {
            return wVar;
        }
        w wVarM = this.f48011b.m(this.f48013d, this.f48012c);
        this.f48016g = wVarM;
        return wVarM;
    }

    public static x h(B9.a aVar, Object obj) {
        return new c(obj, aVar, aVar.d() == aVar.c(), null);
    }

    @Override // u9.w
    public Object c(C9.a aVar) {
        if (this.f48010a == null) {
            return g().c(aVar);
        }
        u9.j jVarA = F.a(aVar);
        if (this.f48015f && jVarA.l()) {
            return null;
        }
        return this.f48010a.a(jVarA, this.f48012c.d(), this.f48014e);
    }

    @Override // u9.w
    public void e(C9.c cVar, Object obj) {
        g().e(cVar, obj);
    }

    @Override // x9.AbstractC6341m
    public w f() {
        return g();
    }

    public C6342n(u9.p pVar, u9.i iVar, u9.e eVar, B9.a aVar, x xVar) {
        this(pVar, iVar, eVar, aVar, xVar, true);
    }
}
