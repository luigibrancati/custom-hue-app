package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import h.AbstractC4262a;
import h.AbstractC4264c;
import j.AbstractC4666a;
import p.C5336O;

/* JADX INFO: renamed from: p.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5348j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f41944b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5348j f41945c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5336O f41946a;

    /* JADX INFO: renamed from: p.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C5336O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f41947a = {h.e.f35849R, h.e.f35847P, h.e.f35851a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f41948b = {h.e.f35865o, h.e.f35833B, h.e.f35870t, h.e.f35866p, h.e.f35867q, h.e.f35869s, h.e.f35868r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f41949c = {h.e.f35846O, h.e.f35848Q, h.e.f35861k, h.e.f35842K, h.e.f35843L, h.e.f35844M, h.e.f35845N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f41950d = {h.e.f35873w, h.e.f35859i, h.e.f35872v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f41951e = {h.e.f35841J, h.e.f35850S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f41952f = {h.e.f35853c, h.e.f35857g, h.e.f35854d, h.e.f35858h};

        @Override // p.C5336O.c
        public Drawable a(C5336O c5336o, Context context, int i10) {
            if (i10 == h.e.f35860j) {
                return new LayerDrawable(new Drawable[]{c5336o.i(context, h.e.f35859i), c5336o.i(context, h.e.f35861k)});
            }
            if (i10 == h.e.f35875y) {
                return l(c5336o, context, h.d.f35829c);
            }
            if (i10 == h.e.f35874x) {
                return l(c5336o, context, h.d.f35830d);
            }
            if (i10 == h.e.f35876z) {
                return l(c5336o, context, h.d.f35831e);
            }
            return null;
        }

        @Override // p.C5336O.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == h.e.f35863m) {
                return AbstractC4666a.a(context, AbstractC4264c.f35823e);
            }
            if (i10 == h.e.f35840I) {
                return AbstractC4666a.a(context, AbstractC4264c.f35826h);
            }
            if (i10 == h.e.f35839H) {
                return k(context);
            }
            if (i10 == h.e.f35856f) {
                return j(context);
            }
            if (i10 == h.e.f35852b) {
                return g(context);
            }
            if (i10 == h.e.f35855e) {
                return i(context);
            }
            if (i10 == h.e.f35835D || i10 == h.e.f35836E) {
                return AbstractC4666a.a(context, AbstractC4264c.f35825g);
            }
            if (f(this.f41948b, i10)) {
                return S.e(context, AbstractC4262a.f35812u);
            }
            if (f(this.f41951e, i10)) {
                return AbstractC4666a.a(context, AbstractC4264c.f35822d);
            }
            if (f(this.f41952f, i10)) {
                return AbstractC4666a.a(context, AbstractC4264c.f35821c);
            }
            if (i10 == h.e.f35832A) {
                return AbstractC4666a.a(context, AbstractC4264c.f35824f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[RETURN] */
        @Override // p.C5336O.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
            /*
                r5 = this;
                android.graphics.PorterDuff$Mode r0 = p.C5348j.a()
                int[] r1 = r5.f41947a
                boolean r1 = r5.f(r1, r7)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L14
                int r5 = h.AbstractC4262a.f35812u
            L11:
                r1 = r2
            L12:
                r7 = r4
                goto L49
            L14:
                int[] r1 = r5.f41949c
                boolean r1 = r5.f(r1, r7)
                if (r1 == 0) goto L1f
                int r5 = h.AbstractC4262a.f35810s
                goto L11
            L1f:
                int[] r1 = r5.f41950d
                boolean r5 = r5.f(r1, r7)
                r1 = 16842801(0x1010031, float:2.3693695E-38)
                if (r5 == 0) goto L2e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2c:
                r5 = r1
                goto L11
            L2e:
                int r5 = h.e.f35871u
                if (r7 != r5) goto L41
                r5 = 1109603123(0x42233333, float:40.8)
                int r5 = java.lang.Math.round(r5)
                r7 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r7
                r7 = r5
                r5 = r1
                r1 = r2
                goto L49
            L41:
                int r5 = h.e.f35862l
                if (r7 != r5) goto L46
                goto L2c
            L46:
                r5 = r3
                r1 = r5
                goto L12
            L49:
                if (r1 == 0) goto L60
                android.graphics.drawable.Drawable r8 = r8.mutate()
                int r5 = p.S.c(r6, r5)
                android.graphics.PorterDuffColorFilter r5 = p.C5348j.e(r5, r0)
                r8.setColorFilter(r5)
                if (r7 == r4) goto L5f
                r8.setAlpha(r7)
            L5f:
                return r2
            L60:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C5348j.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // p.C5336O.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == h.e.f35839H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p.C5336O.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == h.e.f35834C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), S.c(context, AbstractC4262a.f35812u), C5348j.f41944b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), S.c(context, AbstractC4262a.f35812u), C5348j.f41944b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), S.c(context, AbstractC4262a.f35810s), C5348j.f41944b);
                return true;
            }
            if (i10 != h.e.f35875y && i10 != h.e.f35874x && i10 != h.e.f35876z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), S.b(context, AbstractC4262a.f35812u), C5348j.f41944b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), S.c(context, AbstractC4262a.f35810s), C5348j.f41944b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), S.c(context, AbstractC4262a.f35810s), C5348j.f41944b);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i10) {
            int iC = S.c(context, AbstractC4262a.f35811t);
            return new ColorStateList(new int[][]{S.f41872b, S.f41875e, S.f41873c, S.f41879i}, new int[]{S.b(context, AbstractC4262a.f35809r), O0.a.f(iC, i10), O0.a.f(iC, i10), i10});
        }

        public final ColorStateList i(Context context) {
            return h(context, S.c(context, AbstractC4262a.f35808q));
        }

        public final ColorStateList j(Context context) {
            return h(context, S.c(context, AbstractC4262a.f35809r));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = S.e(context, AbstractC4262a.f35813v);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = S.f41872b;
                iArr2[0] = S.b(context, AbstractC4262a.f35813v);
                iArr[1] = S.f41876f;
                iArr2[1] = S.c(context, AbstractC4262a.f35810s);
                iArr[2] = S.f41879i;
                iArr2[2] = S.c(context, AbstractC4262a.f35813v);
            } else {
                int[] iArr3 = S.f41872b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = S.f41876f;
                iArr2[1] = S.c(context, AbstractC4262a.f35810s);
                iArr[2] = S.f41879i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(C5336O c5336o, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = c5336o.i(context, h.e.f35837F);
            Drawable drawableI2 = c5336o.i(context, h.e.f35838G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C5348j.f41944b;
            }
            drawableMutate.setColorFilter(C5348j.e(i10, mode));
        }
    }

    public static synchronized C5348j b() {
        try {
            if (f41945c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41945c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return C5336O.k(i10, mode);
    }

    public static synchronized void h() {
        if (f41945c == null) {
            C5348j c5348j = new C5348j();
            f41945c = c5348j;
            c5348j.f41946a = C5336O.g();
            f41945c.f41946a.t(new a());
        }
    }

    public static void i(Drawable drawable, U u10, int[] iArr) {
        C5336O.v(drawable, u10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f41946a.i(context, i10);
    }

    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f41946a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(Context context, int i10) {
        return this.f41946a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f41946a.r(context);
    }
}
