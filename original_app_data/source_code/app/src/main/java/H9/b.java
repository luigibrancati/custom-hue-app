package H9;

import H9.a;
import S6.C2197c;
import U6.C2275b;
import U6.C2291s;
import U6.r;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b extends H9.a implements C2197c.h, C2197c.l, C2197c.m, C2197c.b, C2197c.i {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2197c.h f5338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2197c.i f5339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C2197c.l f5340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C2197c.m f5341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2197c.b f5342g;

        public a() {
            super();
        }

        public r i(C2275b c2275b) {
            r rVarC = b.this.f5332a.c(c2275b);
            super.a(rVarC);
            return rVarC;
        }

        public r j(C2291s c2291s) {
            r rVarC = b.this.f5332a.c(c2291s);
            super.a(rVarC);
            return rVarC;
        }

        public boolean k(r rVar) {
            return super.c(rVar);
        }

        public void l(C2197c.h hVar) {
            this.f5338c = hVar;
        }

        public void m(C2197c.i iVar) {
            this.f5339d = iVar;
        }

        public void n(C2197c.l lVar) {
            this.f5340e = lVar;
        }

        public void o(C2197c.m mVar) {
            this.f5341f = mVar;
        }
    }

    public b(C2197c c2197c) {
        super(c2197c);
    }

    @Override // S6.C2197c.i
    public void a(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5339d == null) {
            return;
        }
        aVar.f5339d.a(rVar);
    }

    @Override // S6.C2197c.b
    public View b(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5342g == null) {
            return null;
        }
        return aVar.f5342g.b(rVar);
    }

    @Override // S6.C2197c.b
    public View c(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5342g == null) {
            return null;
        }
        return aVar.f5342g.c(rVar);
    }

    @Override // H9.a
    public /* bridge */ /* synthetic */ boolean d(Object obj) {
        return super.d(obj);
    }

    @Override // H9.a
    public void f() {
        C2197c c2197c = this.f5332a;
        if (c2197c != null) {
            c2197c.G(this);
            this.f5332a.H(this);
            this.f5332a.K(this);
            this.f5332a.L(this);
            this.f5332a.u(this);
        }
    }

    public a g() {
        return new a();
    }

    @Override // H9.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(r rVar) {
        rVar.g();
    }

    @Override // S6.C2197c.h
    public void onInfoWindowClick(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5338c == null) {
            return;
        }
        aVar.f5338c.onInfoWindowClick(rVar);
    }

    @Override // S6.C2197c.l
    public boolean onMarkerClick(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5340e == null) {
            return false;
        }
        return aVar.f5340e.onMarkerClick(rVar);
    }

    @Override // S6.C2197c.m
    public void onMarkerDrag(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5341f == null) {
            return;
        }
        aVar.f5341f.onMarkerDrag(rVar);
    }

    @Override // S6.C2197c.m
    public void onMarkerDragEnd(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5341f == null) {
            return;
        }
        aVar.f5341f.onMarkerDragEnd(rVar);
    }

    @Override // S6.C2197c.m
    public void onMarkerDragStart(r rVar) {
        a aVar = (a) this.f5334c.get(rVar);
        if (aVar == null || aVar.f5341f == null) {
            return;
        }
        aVar.f5341f.onMarkerDragStart(rVar);
    }
}
