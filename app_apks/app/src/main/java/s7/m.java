package s7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r7.C5671a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f44294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f44298g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f44299h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44300i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f44301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f44302c;

        public a(List list, Matrix matrix) {
            this.f44301b = list;
            this.f44302c = matrix;
        }

        @Override // s7.m.g
        public void a(Matrix matrix, C5671a c5671a, int i10, Canvas canvas) {
            Iterator it = this.f44301b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f44302c, c5671a, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f44304b;

        public b(d dVar) {
            this.f44304b = dVar;
        }

        @Override // s7.m.g
        public void a(Matrix matrix, C5671a c5671a, int i10, Canvas canvas) {
            c5671a.a(canvas, matrix, new RectF(this.f44304b.k(), this.f44304b.o(), this.f44304b.l(), this.f44304b.j()), i10, this.f44304b.m(), this.f44304b.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f44305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f44307d;

        public c(e eVar, float f10, float f11) {
            this.f44305b = eVar;
            this.f44306c = f10;
            this.f44307d = f11;
        }

        @Override // s7.m.g
        public void a(Matrix matrix, C5671a c5671a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f44305b.f44316c - this.f44307d, this.f44305b.f44315b - this.f44306c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f44306c, this.f44307d);
            matrix2.preRotate(c());
            c5671a.b(canvas, matrix2, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f44305b.f44316c - this.f44307d) / (this.f44305b.f44315b - this.f44306c)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f44308h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f44311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f44312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f44313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f44314g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // s7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44317a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f44308h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f44312e;
        }

        public final float k() {
            return this.f44309b;
        }

        public final float l() {
            return this.f44311d;
        }

        public final float m() {
            return this.f44313f;
        }

        public final float n() {
            return this.f44314g;
        }

        public final float o() {
            return this.f44310c;
        }

        public final void p(float f10) {
            this.f44312e = f10;
        }

        public final void q(float f10) {
            this.f44309b = f10;
        }

        public final void r(float f10) {
            this.f44311d = f10;
        }

        public final void s(float f10) {
            this.f44313f = f10;
        }

        public final void t(float f10) {
            this.f44314g = f10;
        }

        public final void u(float f10) {
            this.f44310c = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44316c;

        @Override // s7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44317a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f44315b, this.f44316c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f44317a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Matrix f44318a = new Matrix();

        public abstract void a(Matrix matrix, C5671a c5671a, int i10, Canvas canvas);

        public final void b(C5671a c5671a, int i10, Canvas canvas) {
            a(f44318a, c5671a, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f44298g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f44299h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f44299h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f44298g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f44298g.get(i10)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f44300i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f44299h), new Matrix(matrix));
    }

    public final float g() {
        return this.f44296e;
    }

    public final float h() {
        return this.f44297f;
    }

    public float i() {
        return this.f44294c;
    }

    public float j() {
        return this.f44295d;
    }

    public float k() {
        return this.f44292a;
    }

    public float l() {
        return this.f44293b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f44315b = f10;
        eVar.f44316c = f11;
        this.f44298g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f44298g.clear();
        this.f44299h.clear();
        this.f44300i = false;
    }

    public final void p(float f10) {
        this.f44296e = f10;
    }

    public final void q(float f10) {
        this.f44297f = f10;
    }

    public final void r(float f10) {
        this.f44294c = f10;
    }

    public final void s(float f10) {
        this.f44295d = f10;
    }

    public final void t(float f10) {
        this.f44292a = f10;
    }

    public final void u(float f10) {
        this.f44293b = f10;
    }
}
