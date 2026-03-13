package M9;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9421b;

    public c(Context context) {
        super(context);
        this.f9420a = 0;
        this.f9421b = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f9421b / 2, this.f9420a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f9420a = measuredWidth - measuredHeight;
            this.f9421b = 0;
        } else {
            this.f9420a = 0;
            this.f9421b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }
}
