package p;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5362x extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5363y f41989a;

    public C5362x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35787F);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f41989a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f41989a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f41989a.g(canvas);
    }

    public C5362x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        S.a(this, getContext());
        C5363y c5363y = new C5363y(this);
        this.f41989a = c5363y;
        c5363y.c(attributeSet, i10);
    }
}
