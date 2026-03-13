package s7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f44274a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f44275b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f44276c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f44277d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f44278e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f44279f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f44280g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f44281h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f44282i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f44283j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f44284k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44285l = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f44286a = new l();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f44287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f44288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f44289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f44290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f44291e;

        public c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f44290d = bVar;
            this.f44287a = kVar;
            this.f44291e = f10;
            this.f44289c = rectF;
            this.f44288b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f44274a[i10] = new m();
            this.f44275b[i10] = new Matrix();
            this.f44276c[i10] = new Matrix();
        }
    }

    public static l k() {
        return a.f44286a;
    }

    public final float a(int i10) {
        return (i10 + 1) * 90;
    }

    public final void b(c cVar, int i10) {
        this.f44281h[0] = this.f44274a[i10].k();
        this.f44281h[1] = this.f44274a[i10].l();
        this.f44275b[i10].mapPoints(this.f44281h);
        if (i10 == 0) {
            Path path = cVar.f44288b;
            float[] fArr = this.f44281h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f44288b;
            float[] fArr2 = this.f44281h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f44274a[i10].d(this.f44275b[i10], cVar.f44288b);
        b bVar = cVar.f44290d;
        if (bVar != null) {
            bVar.a(this.f44274a[i10], this.f44275b[i10], i10);
        }
    }

    public final void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f44281h[0] = this.f44274a[i10].i();
        this.f44281h[1] = this.f44274a[i10].j();
        this.f44275b[i10].mapPoints(this.f44281h);
        this.f44282i[0] = this.f44274a[i11].k();
        this.f44282i[1] = this.f44274a[i11].l();
        this.f44275b[i11].mapPoints(this.f44282i);
        float f10 = this.f44281h[0];
        float[] fArr = this.f44282i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f44289c, i10);
        this.f44280g.n(0.0f, 0.0f);
        f fVarJ = j(i10, cVar.f44287a);
        fVarJ.b(fMax, fI, cVar.f44291e, this.f44280g);
        this.f44283j.reset();
        this.f44280g.d(this.f44276c[i10], this.f44283j);
        if (this.f44285l && (fVarJ.a() || l(this.f44283j, i10) || l(this.f44283j, i11))) {
            Path path = this.f44283j;
            path.op(path, this.f44279f, Path.Op.DIFFERENCE);
            this.f44281h[0] = this.f44280g.k();
            this.f44281h[1] = this.f44280g.l();
            this.f44276c[i10].mapPoints(this.f44281h);
            Path path2 = this.f44278e;
            float[] fArr2 = this.f44281h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f44280g.d(this.f44276c[i10], this.f44278e);
        } else {
            this.f44280g.d(this.f44276c[i10], cVar.f44288b);
        }
        b bVar = cVar.f44290d;
        if (bVar != null) {
            bVar.b(this.f44280g, this.f44276c[i10], i10);
        }
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f44278e.rewind();
        this.f44279f.rewind();
        this.f44279f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f44278e.close();
        if (this.f44278e.isEmpty()) {
            return;
        }
        path.op(this.f44278e, Path.Op.UNION);
    }

    public final void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final s7.c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(RectF rectF, int i10) {
        float[] fArr = this.f44281h;
        m mVar = this.f44274a[i10];
        fArr[0] = mVar.f44294c;
        fArr[1] = mVar.f44295d;
        this.f44275b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f44281h[0]) : Math.abs(rectF.centerY() - this.f44281h[1]);
    }

    public final f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i10) {
        this.f44284k.reset();
        this.f44274a[i10].d(this.f44275b[i10], this.f44284k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f44284k.computeBounds(rectF, true);
        path.op(this.f44284k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(c cVar, int i10) {
        h(i10, cVar.f44287a).c(this.f44274a[i10], 90.0f, cVar.f44291e, cVar.f44289c, g(i10, cVar.f44287a));
        float fA = a(i10);
        this.f44275b[i10].reset();
        f(i10, cVar.f44289c, this.f44277d);
        Matrix matrix = this.f44275b[i10];
        PointF pointF = this.f44277d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f44275b[i10].preRotate(fA);
    }

    public final void n(int i10) {
        this.f44281h[0] = this.f44274a[i10].i();
        this.f44281h[1] = this.f44274a[i10].j();
        this.f44275b[i10].mapPoints(this.f44281h);
        float fA = a(i10);
        this.f44276c[i10].reset();
        Matrix matrix = this.f44276c[i10];
        float[] fArr = this.f44281h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f44276c[i10].preRotate(fA);
    }
}
