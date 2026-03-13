package r3;

import X0.h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import u1.C5907b;

/* JADX INFO: renamed from: r3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5529b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f43521g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f43522h = new C5907b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43523i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f43524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f43525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f43526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animator f43527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f43528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43529f;

    /* JADX INFO: renamed from: r3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f43530a;

        public a(c cVar) {
            this.f43530a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5529b.this.n(fFloatValue, this.f43530a);
            C5529b.this.b(fFloatValue, this.f43530a, false);
            C5529b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: r3.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f43534a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f43535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f43536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f43537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f43538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f43539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f43540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f43541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f43542i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f43543j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f43544k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f43545l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f43546m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f43547n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f43548o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f43549p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f43550q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f43551r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f43552s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f43553t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f43554u;

        public c() {
            Paint paint = new Paint();
            this.f43535b = paint;
            Paint paint2 = new Paint();
            this.f43536c = paint2;
            Paint paint3 = new Paint();
            this.f43537d = paint3;
            this.f43538e = 0.0f;
            this.f43539f = 0.0f;
            this.f43540g = 0.0f;
            this.f43541h = 5.0f;
            this.f43549p = 1.0f;
            this.f43553t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f43544k = this.f43538e;
            this.f43545l = this.f43539f;
            this.f43546m = this.f43540g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f43534a;
            float f10 = this.f43550q;
            float fMin = (this.f43541h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f43551r * this.f43549p) / 2.0f, this.f43541h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f43538e;
            float f12 = this.f43540g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f43539f + f12) * 360.0f) - f13;
            this.f43535b.setColor(this.f43554u);
            this.f43535b.setAlpha(this.f43553t);
            float f15 = this.f43541h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f43537d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f43535b);
            b(canvas, f13, f14, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f43547n) {
                Path path = this.f43548o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f43548o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f43551r * this.f43549p) / 2.0f;
                this.f43548o.moveTo(0.0f, 0.0f);
                this.f43548o.lineTo(this.f43551r * this.f43549p, 0.0f);
                Path path3 = this.f43548o;
                float f13 = this.f43551r;
                float f14 = this.f43549p;
                path3.lineTo((f13 * f14) / 2.0f, this.f43552s * f14);
                this.f43548o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f43541h / 2.0f));
                this.f43548o.close();
                this.f43536c.setColor(this.f43554u);
                this.f43536c.setAlpha(this.f43553t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f43548o, this.f43536c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f43553t;
        }

        public float d() {
            return this.f43539f;
        }

        public int e() {
            return this.f43542i[f()];
        }

        public int f() {
            return (this.f43543j + 1) % this.f43542i.length;
        }

        public float g() {
            return this.f43538e;
        }

        public int h() {
            return this.f43542i[this.f43543j];
        }

        public float i() {
            return this.f43545l;
        }

        public float j() {
            return this.f43546m;
        }

        public float k() {
            return this.f43544k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f43544k = 0.0f;
            this.f43545l = 0.0f;
            this.f43546m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f43553t = i10;
        }

        public void o(float f10, float f11) {
            this.f43551r = (int) f10;
            this.f43552s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f43549p) {
                this.f43549p = f10;
            }
        }

        public void q(float f10) {
            this.f43550q = f10;
        }

        public void r(int i10) {
            this.f43554u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.f43535b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f43543j = i10;
            this.f43554u = this.f43542i[i10];
        }

        public void u(int[] iArr) {
            this.f43542i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f43539f = f10;
        }

        public void w(float f10) {
            this.f43540g = f10;
        }

        public void x(boolean z10) {
            if (this.f43547n != z10) {
                this.f43547n = z10;
            }
        }

        public void y(float f10) {
            this.f43538e = f10;
        }

        public void z(float f10) {
            this.f43541h = f10;
            this.f43535b.setStrokeWidth(f10);
        }
    }

    public C5529b(Context context) {
        this.f43526c = ((Context) h.g(context)).getResources();
        c cVar = new c();
        this.f43524a = cVar;
        cVar.u(f43523i);
        k(2.5f);
        m();
    }

    public final void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f43529f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f43522h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f43522h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f43528e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public final int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r5) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r0) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r1) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r7))));
    }

    public void d(boolean z10) {
        this.f43524a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f43525b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f43524a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f43524a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f43524a.u(iArr);
        this.f43524a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f43524a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f43524a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.f43525b = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f43524a;
        float f14 = this.f43526c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f43527d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f43524a.y(f10);
        this.f43524a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f43524a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f43524a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f43521g);
        valueAnimatorOfFloat.addListener(new C0586b(cVar));
        this.f43527d = valueAnimatorOfFloat;
    }

    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f43524a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43524a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f43527d.cancel();
        this.f43524a.A();
        if (this.f43524a.d() != this.f43524a.g()) {
            this.f43529f = true;
            this.f43527d.setDuration(666L);
            this.f43527d.start();
        } else {
            this.f43524a.t(0);
            this.f43524a.m();
            this.f43527d.setDuration(1332L);
            this.f43527d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f43527d.cancel();
        h(0.0f);
        this.f43524a.x(false);
        this.f43524a.t(0);
        this.f43524a.m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: r3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0586b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f43532a;

        public C0586b(c cVar) {
            this.f43532a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C5529b.this.b(1.0f, this.f43532a, true);
            this.f43532a.A();
            this.f43532a.l();
            C5529b c5529b = C5529b.this;
            if (!c5529b.f43529f) {
                c5529b.f43528e += 1.0f;
                return;
            }
            c5529b.f43529f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f43532a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5529b.this.f43528e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
