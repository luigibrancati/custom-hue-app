package p7;

import N0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import c7.j;

/* JADX INFO: renamed from: p7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5403d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f42220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f42221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f42222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f42227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f42228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f42229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f42230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f42231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f42232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f42233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42235p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f42236q;

    /* JADX INFO: renamed from: p7.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC5405f f42237a;

        public a(AbstractC5405f abstractC5405f) {
            this.f42237a = abstractC5405f;
        }

        @Override // N0.f.e
        public void f(int i10) {
            C5403d.this.f42235p = true;
            this.f42237a.a(i10);
        }

        @Override // N0.f.e
        public void g(Typeface typeface) {
            C5403d c5403d = C5403d.this;
            c5403d.f42236q = Typeface.create(typeface, c5403d.f42224e);
            C5403d.this.f42235p = true;
            this.f42237a.b(C5403d.this.f42236q, false);
        }
    }

    /* JADX INFO: renamed from: p7.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC5405f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f42240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC5405f f42241c;

        public b(Context context, TextPaint textPaint, AbstractC5405f abstractC5405f) {
            this.f42239a = context;
            this.f42240b = textPaint;
            this.f42241c = abstractC5405f;
        }

        @Override // p7.AbstractC5405f
        public void a(int i10) {
            this.f42241c.a(i10);
        }

        @Override // p7.AbstractC5405f
        public void b(Typeface typeface, boolean z10) {
            C5403d.this.p(this.f42239a, this.f42240b, typeface);
            this.f42241c.b(typeface, z10);
        }
    }

    public C5403d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f26361y4);
        l(typedArrayObtainStyledAttributes.getDimension(j.f26368z4, 0.0f));
        k(AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26010C4));
        this.f42220a = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26017D4);
        this.f42221b = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26024E4);
        this.f42224e = typedArrayObtainStyledAttributes.getInt(j.f26003B4, 0);
        this.f42225f = typedArrayObtainStyledAttributes.getInt(j.f25996A4, 1);
        int iE = AbstractC5402c.e(typedArrayObtainStyledAttributes, j.f26066K4, j.f26059J4);
        this.f42234o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f42223d = typedArrayObtainStyledAttributes.getString(iE);
        this.f42226g = typedArrayObtainStyledAttributes.getBoolean(j.f26073L4, false);
        this.f42222c = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26031F4);
        this.f42227h = typedArrayObtainStyledAttributes.getFloat(j.f26038G4, 0.0f);
        this.f42228i = typedArrayObtainStyledAttributes.getFloat(j.f26045H4, 0.0f);
        this.f42229j = typedArrayObtainStyledAttributes.getFloat(j.f26052I4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, j.f26193c3);
        this.f42230k = typedArrayObtainStyledAttributes2.hasValue(j.f26201d3);
        this.f42231l = typedArrayObtainStyledAttributes2.getFloat(j.f26201d3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f42236q == null && (str = this.f42223d) != null) {
            this.f42236q = Typeface.create(str, this.f42224e);
        }
        if (this.f42236q == null) {
            int i10 = this.f42225f;
            if (i10 == 1) {
                this.f42236q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f42236q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f42236q = Typeface.DEFAULT;
            } else {
                this.f42236q = Typeface.MONOSPACE;
            }
            this.f42236q = Typeface.create(this.f42236q, this.f42224e);
        }
    }

    public Typeface e() {
        d();
        return this.f42236q;
    }

    public Typeface f(Context context) {
        if (this.f42235p) {
            return this.f42236q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = N0.f.g(context, this.f42234o);
                this.f42236q = typefaceG;
                if (typefaceG != null) {
                    this.f42236q = Typeface.create(typefaceG, this.f42224e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f42223d, e10);
            }
        }
        d();
        this.f42235p = true;
        return this.f42236q;
    }

    public void g(Context context, TextPaint textPaint, AbstractC5405f abstractC5405f) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC5405f));
    }

    public void h(Context context, AbstractC5405f abstractC5405f) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f42234o;
        if (i10 == 0) {
            this.f42235p = true;
        }
        if (this.f42235p) {
            abstractC5405f.b(this.f42236q, true);
            return;
        }
        try {
            N0.f.i(context, i10, new a(abstractC5405f), null);
        } catch (Resources.NotFoundException unused) {
            this.f42235p = true;
            abstractC5405f.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f42223d, e10);
            this.f42235p = true;
            abstractC5405f.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f42232m;
    }

    public float j() {
        return this.f42233n;
    }

    public void k(ColorStateList colorStateList) {
        this.f42232m = colorStateList;
    }

    public void l(float f10) {
        this.f42233n = f10;
    }

    public final boolean m(Context context) {
        if (C5404e.a()) {
            return true;
        }
        int i10 = this.f42234o;
        return (i10 != 0 ? N0.f.c(context, i10) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, AbstractC5405f abstractC5405f) {
        o(context, textPaint, abstractC5405f);
        ColorStateList colorStateList = this.f42232m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f42229j;
        float f11 = this.f42227h;
        float f12 = this.f42228i;
        ColorStateList colorStateList2 = this.f42222c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, AbstractC5405f abstractC5405f) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, abstractC5405f);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = AbstractC5406g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f42224e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f42233n);
        if (this.f42230k) {
            textPaint.setLetterSpacing(this.f42231l);
        }
    }
}
