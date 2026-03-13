package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ImageView.ScaleType f33466u = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Bitmap.Config f33467v = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f33468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f33469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f33470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f33471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f33472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f33473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f33477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BitmapShader f33478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f33481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f33482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorFilter f33483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f33485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f33486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f33487t;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.f33487t) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.f33469b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c() {
        Paint paint = this.f33471d;
        if (paint != null) {
            paint.setColorFilter(this.f33483p);
        }
    }

    public final RectF d() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r0 - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((r1 - iMin) / 2.0f);
        float f10 = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    public final Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f33467v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f33467v);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final boolean f(float f10, float f11) {
        return this.f33469b.isEmpty() || Math.pow((double) (f10 - this.f33469b.centerX()), 2.0d) + Math.pow((double) (f11 - this.f33469b.centerY()), 2.0d) <= Math.pow((double) this.f33482o, 2.0d);
    }

    public final void g() {
        super.setScaleType(f33466u);
        this.f33484q = true;
        setOutlineProvider(new b());
        if (this.f33485r) {
            i();
            this.f33485r = false;
        }
    }

    public int getBorderColor() {
        return this.f33474g;
    }

    public int getBorderWidth() {
        return this.f33475h;
    }

    public int getCircleBackgroundColor() {
        return this.f33476i;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f33483p;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f33466u;
    }

    public final void h() {
        if (this.f33487t) {
            this.f33477j = null;
        } else {
            this.f33477j = e(getDrawable());
        }
        i();
    }

    public final void i() {
        int i10;
        if (!this.f33484q) {
            this.f33485r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f33477j == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f33477j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33478k = new BitmapShader(bitmap, tileMode, tileMode);
        this.f33471d.setAntiAlias(true);
        this.f33471d.setDither(true);
        this.f33471d.setFilterBitmap(true);
        this.f33471d.setShader(this.f33478k);
        this.f33472e.setStyle(Paint.Style.STROKE);
        this.f33472e.setAntiAlias(true);
        this.f33472e.setColor(this.f33474g);
        this.f33472e.setStrokeWidth(this.f33475h);
        this.f33473f.setStyle(Paint.Style.FILL);
        this.f33473f.setAntiAlias(true);
        this.f33473f.setColor(this.f33476i);
        this.f33480m = this.f33477j.getHeight();
        this.f33479l = this.f33477j.getWidth();
        this.f33469b.set(d());
        this.f33482o = Math.min((this.f33469b.height() - this.f33475h) / 2.0f, (this.f33469b.width() - this.f33475h) / 2.0f);
        this.f33468a.set(this.f33469b);
        if (!this.f33486s && (i10 = this.f33475h) > 0) {
            this.f33468a.inset(i10 - 1.0f, i10 - 1.0f);
        }
        this.f33481n = Math.min(this.f33468a.height() / 2.0f, this.f33468a.width() / 2.0f);
        c();
        j();
        invalidate();
    }

    public final void j() {
        float fWidth;
        float fHeight;
        this.f33470c.set(null);
        float fWidth2 = 0.0f;
        if (this.f33479l * this.f33468a.height() > this.f33468a.width() * this.f33480m) {
            fWidth = this.f33468a.height() / this.f33480m;
            fHeight = 0.0f;
            fWidth2 = (this.f33468a.width() - (this.f33479l * fWidth)) * 0.5f;
        } else {
            fWidth = this.f33468a.width() / this.f33479l;
            fHeight = (this.f33468a.height() - (this.f33480m * fWidth)) * 0.5f;
        }
        this.f33470c.setScale(fWidth, fWidth);
        Matrix matrix = this.f33470c;
        RectF rectF = this.f33468a;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.f33478k.setLocalMatrix(this.f33470c);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f33487t) {
            super.onDraw(canvas);
            return;
        }
        if (this.f33477j == null) {
            return;
        }
        if (this.f33476i != 0) {
            canvas.drawCircle(this.f33468a.centerX(), this.f33468a.centerY(), this.f33481n, this.f33473f);
        }
        canvas.drawCircle(this.f33468a.centerX(), this.f33468a.centerY(), this.f33481n, this.f33471d);
        if (this.f33475h > 0) {
            canvas.drawCircle(this.f33469b.centerX(), this.f33469b.centerY(), this.f33482o, this.f33472e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f33487t ? super.onTouchEvent(motionEvent) : f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i10) {
        if (i10 == this.f33474g) {
            return;
        }
        this.f33474g = i10;
        this.f33472e.setColor(i10);
        invalidate();
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 == this.f33486s) {
            return;
        }
        this.f33486s = z10;
        i();
    }

    public void setBorderWidth(int i10) {
        if (i10 == this.f33475h) {
            return;
        }
        this.f33475h = i10;
        i();
    }

    public void setCircleBackgroundColor(int i10) {
        if (i10 == this.f33476i) {
            return;
        }
        this.f33476i = i10;
        this.f33473f.setColor(i10);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i10) {
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f33483p) {
            return;
        }
        this.f33483p = colorFilter;
        c();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.f33487t == z10) {
            return;
        }
        this.f33487t = z10;
        h();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        i();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        i();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f33466u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33468a = new RectF();
        this.f33469b = new RectF();
        this.f33470c = new Matrix();
        this.f33471d = new Paint();
        this.f33472e = new Paint();
        this.f33473f = new Paint();
        this.f33474g = -16777216;
        this.f33475h = 0;
        this.f33476i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ta.a.f16274a, i10, 0);
        this.f33475h = typedArrayObtainStyledAttributes.getDimensionPixelSize(Ta.a.f16277d, 0);
        this.f33474g = typedArrayObtainStyledAttributes.getColor(Ta.a.f16275b, -16777216);
        this.f33486s = typedArrayObtainStyledAttributes.getBoolean(Ta.a.f16276c, false);
        this.f33476i = typedArrayObtainStyledAttributes.getColor(Ta.a.f16278e, 0);
        typedArrayObtainStyledAttributes.recycle();
        g();
    }
}
