package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j extends RecyclerView.A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f24522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f24523l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f24525n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f24520i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f24521j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24524m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24526o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24527p = 0;

    public j(Context context) {
        this.f24523l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f24524m) {
            this.f24525n = v(this.f24523l);
            this.f24524m = true;
        }
        return this.f24525n;
    }

    public int B() {
        PointF pointF = this.f24522k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public void C(RecyclerView.A.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f24522k = pointFA;
        this.f24526o = (int) (pointFA.x * 10000.0f);
        this.f24527p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f24526o * 1.2f), (int) (this.f24527p * 1.2f), (int) (x(10000) * 1.2f), this.f24520i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void l(int i10, int i11, RecyclerView.B b10, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f24526o = y(this.f24526o, i10);
        int iY = y(this.f24527p, i11);
        this.f24527p = iY;
        if (this.f24526o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void n() {
        this.f24527p = 0;
        this.f24526o = 0;
        this.f24522k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f24521j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.R(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.U(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.f0(), pVarE.p0() - pVarE.g0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.m()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.V(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.P(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.h0(), pVarE.X() - pVarE.e0(), i10);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    public final int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    public int z() {
        PointF pointF = this.f24522k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void m() {
    }
}
