package t7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import s7.k;

/* JADX INFO: renamed from: t7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5856b extends s7.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f44774A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f44775z;

    public C5856b(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.f44775z = new Paint(1);
        j0();
        this.f44774A = new RectF();
    }

    public boolean f0() {
        return !this.f44774A.isEmpty();
    }

    public void g0() {
        h0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void h0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f44774A;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void i0(RectF rectF) {
        h0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void j0() {
        this.f44775z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f44775z.setColor(-1);
        this.f44775z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // s7.g
    public void r(Canvas canvas) {
        if (this.f44774A.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f44774A);
        super.r(canvas);
        canvas.restore();
    }
}
