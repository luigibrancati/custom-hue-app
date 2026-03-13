package s7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import c7.AbstractC3079a;
import i7.AbstractC4365a;
import java.util.BitSet;
import l7.C4963a;
import r7.C5671a;
import s7.k;
import s7.l;
import s7.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44197x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Paint f44198y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f44199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.g[] f44200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.g[] f44201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f44202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f44204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f44205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f44206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f44207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f44208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Region f44209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f44210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f44211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f44212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f44213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C5671a f44214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l.b f44215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f44216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f44217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f44218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f44220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44221w;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements l.b {
        public a() {
        }

        @Override // s7.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f44202d.set(i10, mVar.e());
            g.this.f44200b[i10] = mVar.f(matrix);
        }

        @Override // s7.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f44202d.set(i10 + 4, mVar.e());
            g.this.f44201c[i10] = mVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f44223a;

        public b(float f10) {
            this.f44223a = f10;
        }

        @Override // s7.k.c
        public s7.c a(s7.c cVar) {
            return cVar instanceof i ? cVar : new C5809b(this.f44223a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f44198y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public static int P(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    public static g m(Context context, float f10) {
        int iC = AbstractC4365a.c(context, AbstractC3079a.f25832k, g.class.getSimpleName());
        g gVar = new g();
        gVar.K(context);
        gVar.U(ColorStateList.valueOf(iC));
        gVar.T(f10);
        return gVar;
    }

    public int A() {
        return (int) (((double) this.f44199a.f44243s) * Math.cos(Math.toRadians(r4.f44244t)));
    }

    public k B() {
        return this.f44199a.f44225a;
    }

    public final float C() {
        if (J()) {
            return this.f44213o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float D() {
        return this.f44199a.f44225a.r().a(u());
    }

    public float E() {
        return this.f44199a.f44225a.t().a(u());
    }

    public float F() {
        return this.f44199a.f44240p;
    }

    public float G() {
        return w() + F();
    }

    public final boolean H() {
        c cVar = this.f44199a;
        int i10 = cVar.f44241q;
        if (i10 == 1 || cVar.f44242r <= 0) {
            return false;
        }
        return i10 == 2 || R();
    }

    public final boolean I() {
        Paint.Style style = this.f44199a.f44246v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean J() {
        Paint.Style style = this.f44199a.f44246v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f44213o.getStrokeWidth() > 0.0f;
    }

    public void K(Context context) {
        this.f44199a.f44226b = new C4963a(context);
        e0();
    }

    public final void L() {
        super.invalidateSelf();
    }

    public boolean M() {
        C4963a c4963a = this.f44199a.f44226b;
        return c4963a != null && c4963a.d();
    }

    public boolean N() {
        return this.f44199a.f44225a.u(u());
    }

    public final void O(Canvas canvas) {
        if (H()) {
            canvas.save();
            Q(canvas);
            if (!this.f44221w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f44220v.width() - getBounds().width());
            int iHeight = (int) (this.f44220v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f44220v.width()) + (this.f44199a.f44242r * 2) + iWidth, ((int) this.f44220v.height()) + (this.f44199a.f44242r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f44199a.f44242r) - iWidth;
            float f11 = (getBounds().top - this.f44199a.f44242r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void Q(Canvas canvas) {
        canvas.translate(z(), A());
    }

    public boolean R() {
        if (N()) {
            return false;
        }
        this.f44205g.isConvex();
        return false;
    }

    public void S(s7.c cVar) {
        setShapeAppearanceModel(this.f44199a.f44225a.x(cVar));
    }

    public void T(float f10) {
        c cVar = this.f44199a;
        if (cVar.f44239o != f10) {
            cVar.f44239o = f10;
            e0();
        }
    }

    public void U(ColorStateList colorStateList) {
        c cVar = this.f44199a;
        if (cVar.f44228d != colorStateList) {
            cVar.f44228d = colorStateList;
            onStateChange(getState());
        }
    }

    public void V(float f10) {
        c cVar = this.f44199a;
        if (cVar.f44235k != f10) {
            cVar.f44235k = f10;
            this.f44203e = true;
            invalidateSelf();
        }
    }

    public void W(int i10, int i11, int i12, int i13) {
        c cVar = this.f44199a;
        if (cVar.f44233i == null) {
            cVar.f44233i = new Rect();
        }
        this.f44199a.f44233i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void X(float f10) {
        c cVar = this.f44199a;
        if (cVar.f44238n != f10) {
            cVar.f44238n = f10;
            e0();
        }
    }

    public void Y(float f10, int i10) {
        b0(f10);
        a0(ColorStateList.valueOf(i10));
    }

    public void Z(float f10, ColorStateList colorStateList) {
        b0(f10);
        a0(colorStateList);
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f44199a;
        if (cVar.f44229e != colorStateList) {
            cVar.f44229e = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        this.f44199a.f44236l = f10;
        invalidateSelf();
    }

    public final boolean c0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f44199a.f44228d == null || color2 == (colorForState2 = this.f44199a.f44228d.getColorForState(iArr, (color2 = this.f44212n.getColor())))) {
            z10 = false;
        } else {
            this.f44212n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f44199a.f44229e == null || color == (colorForState = this.f44199a.f44229e.getColorForState(iArr, (color = this.f44213o.getColor())))) {
            return z10;
        }
        this.f44213o.setColor(colorForState);
        return true;
    }

    public final boolean d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f44217s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f44218t;
        c cVar = this.f44199a;
        this.f44217s = k(cVar.f44231g, cVar.f44232h, this.f44212n, true);
        c cVar2 = this.f44199a;
        this.f44218t = k(cVar2.f44230f, cVar2.f44232h, this.f44213o, false);
        c cVar3 = this.f44199a;
        if (cVar3.f44245u) {
            this.f44214p.d(cVar3.f44231g.getColorForState(getState(), 0));
        }
        return (X0.c.a(porterDuffColorFilter, this.f44217s) && X0.c.a(porterDuffColorFilter2, this.f44218t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f44212n.setColorFilter(this.f44217s);
        int alpha = this.f44212n.getAlpha();
        this.f44212n.setAlpha(P(alpha, this.f44199a.f44237m));
        this.f44213o.setColorFilter(this.f44218t);
        this.f44213o.setStrokeWidth(this.f44199a.f44236l);
        int alpha2 = this.f44213o.getAlpha();
        this.f44213o.setAlpha(P(alpha2, this.f44199a.f44237m));
        if (this.f44203e) {
            i();
            g(u(), this.f44205g);
            this.f44203e = false;
        }
        O(canvas);
        if (I()) {
            o(canvas);
        }
        if (J()) {
            r(canvas);
        }
        this.f44212n.setAlpha(alpha);
        this.f44213o.setAlpha(alpha2);
    }

    public final void e0() {
        float fG = G();
        this.f44199a.f44242r = (int) Math.ceil(0.75f * fG);
        this.f44199a.f44243s = (int) Math.ceil(fG * 0.25f);
        d0();
        L();
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f44219u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f44199a.f44234j != 1.0f) {
            this.f44204f.reset();
            Matrix matrix = this.f44204f;
            float f10 = this.f44199a.f44234j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f44204f);
        }
        path.computeBounds(this.f44220v, true);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f44199a.f44237m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f44199a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f44199a.f44241q == 2) {
            return;
        }
        if (N()) {
            outline.setRoundRect(getBounds(), D() * this.f44199a.f44235k);
        } else {
            g(u(), this.f44205g);
            this.f44205g.isConvex();
            try {
                outline.setConvexPath(this.f44205g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f44199a.f44233i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f44209k.set(getBounds());
        g(u(), this.f44205g);
        this.f44210l.setPath(this.f44205g, this.f44209k);
        this.f44209k.op(this.f44210l, Region.Op.DIFFERENCE);
        return this.f44209k;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.f44216r;
        c cVar = this.f44199a;
        lVar.e(cVar.f44225a, cVar.f44235k, rectF, this.f44215q, path);
    }

    public final void i() {
        k kVarY = B().y(new b(-C()));
        this.f44211m = kVarY;
        this.f44216r.d(kVarY, this.f44199a.f44235k, v(), this.f44206h);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f44203e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f44199a.f44231g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f44199a.f44230f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f44199a.f44229e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f44199a.f44228d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f44219u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public int l(int i10) {
        float fG = G() + y();
        C4963a c4963a = this.f44199a.f44226b;
        return c4963a != null ? c4963a.c(i10, fG) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f44199a = new c(this.f44199a);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f44202d.cardinality() > 0) {
            Log.w(f44197x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f44199a.f44243s != 0) {
            canvas.drawPath(this.f44205g, this.f44214p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f44200b[i10].b(this.f44214p, this.f44199a.f44242r, canvas);
            this.f44201c[i10].b(this.f44214p, this.f44199a.f44242r, canvas);
        }
        if (this.f44221w) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f44205g, f44198y);
            canvas.translate(iZ, iA);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.f44212n, this.f44205g, this.f44199a.f44225a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f44203e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, n7.C5147j.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = c0(iArr) || d0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f44199a.f44225a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f44199a.f44235k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(Canvas canvas) {
        q(canvas, this.f44213o, this.f44206h, this.f44211m, v());
    }

    public float s() {
        return this.f44199a.f44225a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f44199a;
        if (cVar.f44237m != i10) {
            cVar.f44237m = i10;
            L();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44199a.f44227c = colorFilter;
        L();
    }

    @Override // s7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f44199a.f44225a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f44199a.f44231g = colorStateList;
        d0();
        L();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f44199a;
        if (cVar.f44232h != mode) {
            cVar.f44232h = mode;
            d0();
            L();
        }
    }

    public float t() {
        return this.f44199a.f44225a.l().a(u());
    }

    public RectF u() {
        this.f44207i.set(getBounds());
        return this.f44207i;
    }

    public final RectF v() {
        this.f44208j.set(u());
        float fC = C();
        this.f44208j.inset(fC, fC);
        return this.f44208j;
    }

    public float w() {
        return this.f44199a.f44239o;
    }

    public ColorStateList x() {
        return this.f44199a.f44228d;
    }

    public float y() {
        return this.f44199a.f44238n;
    }

    public int z() {
        return (int) (((double) this.f44199a.f44243s) * Math.sin(Math.toRadians(r4.f44244t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    public g(c cVar) {
        l lVar;
        this.f44200b = new m.g[4];
        this.f44201c = new m.g[4];
        this.f44202d = new BitSet(8);
        this.f44204f = new Matrix();
        this.f44205g = new Path();
        this.f44206h = new Path();
        this.f44207i = new RectF();
        this.f44208j = new RectF();
        this.f44209k = new Region();
        this.f44210l = new Region();
        Paint paint = new Paint(1);
        this.f44212n = paint;
        Paint paint2 = new Paint(1);
        this.f44213o = paint2;
        this.f44214p = new C5671a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f44216r = lVar;
        this.f44220v = new RectF();
        this.f44221w = true;
        this.f44199a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        d0();
        c0(getState());
        this.f44215q = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f44225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C4963a f44226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f44227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f44228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f44229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f44230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f44231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f44232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f44233i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f44234j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f44235k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f44236l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f44237m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f44238n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f44239o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f44240p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f44241q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f44242r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f44243s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f44244t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f44245u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f44246v;

        public c(k kVar, C4963a c4963a) {
            this.f44228d = null;
            this.f44229e = null;
            this.f44230f = null;
            this.f44231g = null;
            this.f44232h = PorterDuff.Mode.SRC_IN;
            this.f44233i = null;
            this.f44234j = 1.0f;
            this.f44235k = 1.0f;
            this.f44237m = 255;
            this.f44238n = 0.0f;
            this.f44239o = 0.0f;
            this.f44240p = 0.0f;
            this.f44241q = 0;
            this.f44242r = 0;
            this.f44243s = 0;
            this.f44244t = 0;
            this.f44245u = false;
            this.f44246v = Paint.Style.FILL_AND_STROKE;
            this.f44225a = kVar;
            this.f44226b = c4963a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f44203e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f44228d = null;
            this.f44229e = null;
            this.f44230f = null;
            this.f44231g = null;
            this.f44232h = PorterDuff.Mode.SRC_IN;
            this.f44233i = null;
            this.f44234j = 1.0f;
            this.f44235k = 1.0f;
            this.f44237m = 255;
            this.f44238n = 0.0f;
            this.f44239o = 0.0f;
            this.f44240p = 0.0f;
            this.f44241q = 0;
            this.f44242r = 0;
            this.f44243s = 0;
            this.f44244t = 0;
            this.f44245u = false;
            this.f44246v = Paint.Style.FILL_AND_STROKE;
            this.f44225a = cVar.f44225a;
            this.f44226b = cVar.f44226b;
            this.f44236l = cVar.f44236l;
            this.f44227c = cVar.f44227c;
            this.f44228d = cVar.f44228d;
            this.f44229e = cVar.f44229e;
            this.f44232h = cVar.f44232h;
            this.f44231g = cVar.f44231g;
            this.f44237m = cVar.f44237m;
            this.f44234j = cVar.f44234j;
            this.f44243s = cVar.f44243s;
            this.f44241q = cVar.f44241q;
            this.f44245u = cVar.f44245u;
            this.f44235k = cVar.f44235k;
            this.f44238n = cVar.f44238n;
            this.f44239o = cVar.f44239o;
            this.f44240p = cVar.f44240p;
            this.f44242r = cVar.f44242r;
            this.f44244t = cVar.f44244t;
            this.f44230f = cVar.f44230f;
            this.f44246v = cVar.f44246v;
            if (cVar.f44233i != null) {
                this.f44233i = new Rect(cVar.f44233i);
            }
        }
    }
}
