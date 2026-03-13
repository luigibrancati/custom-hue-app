package r3;

import Y0.E;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import q3.AbstractC5484a;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5528a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f43515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43517c;

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0585a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f43518a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C5528a f43520c;

        public C0585a(C5528a c5528a, int i10) {
            this.f43520c = c5528a;
            this.f43519b = i10;
            a((int) rect().width());
        }

        public final void a(int i10) {
            float f10 = i10 / 2;
            this.f43518a.setShader(new RadialGradient(f10, f10, this.f43519b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f43520c.getWidth() / 2;
            float height = this.f43520c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f43518a);
            canvas.drawCircle(width, height, r0 - this.f43519b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    public C5528a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f43516b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC5484a.f43111f);
        this.f43517c = typedArrayObtainStyledAttributes.getColor(AbstractC5484a.f43112g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            E.m0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0585a(this, this.f43516b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f43516b, i11, i10, 503316480);
            int i12 = this.f43516b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f43517c);
        E.j0(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f43515a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f43515a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f43515a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f43516b * 2), getMeasuredHeight() + (this.f43516b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f43517c = i10;
        }
    }
}
