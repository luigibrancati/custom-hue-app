package r7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: r7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5671a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43804i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f43805j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f43806k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f43807l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f43808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f43809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f43810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f43814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f43815h;

    public C5671a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f43814g;
        if (z10) {
            int[] iArr = f43806k;
            iArr[0] = 0;
            iArr[1] = this.f43813f;
            iArr[2] = this.f43812e;
            iArr[3] = this.f43811d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f43806k;
            iArr2[0] = 0;
            iArr2[1] = this.f43811d;
            iArr2[2] = this.f43812e;
            iArr2[3] = this.f43813f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f43807l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f43809b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f43806k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f43815h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f43809b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f43804i;
        iArr[0] = this.f43813f;
        iArr[1] = this.f43812e;
        iArr[2] = this.f43811d;
        Paint paint = this.f43810c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f43805j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f43810c);
        canvas.restore();
    }

    public Paint c() {
        return this.f43808a;
    }

    public void d(int i10) {
        this.f43811d = O0.a.j(i10, 68);
        this.f43812e = O0.a.j(i10, 20);
        this.f43813f = O0.a.j(i10, 0);
        this.f43808a.setColor(this.f43811d);
    }

    public C5671a(int i10) {
        this.f43814g = new Path();
        this.f43815h = new Paint();
        this.f43808a = new Paint();
        d(i10);
        this.f43815h.setColor(0);
        Paint paint = new Paint(4);
        this.f43809b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f43810c = new Paint(paint);
    }
}
