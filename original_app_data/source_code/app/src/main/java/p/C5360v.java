package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5360v extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5358t f41988a;

    public C5360v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35786E);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f41988a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C5360v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        S.a(this, getContext());
        C5358t c5358t = new C5358t(this);
        this.f41988a = c5358t;
        c5358t.c(attributeSet, i10);
    }
}
