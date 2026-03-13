package androidx.constraintlayout.widget;

import F0.e;
import H0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F0.a f22181k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f22181k = new F0.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f4960a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f5002h1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f4996g1) {
                    this.f22181k.L0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == d.f5008i1) {
                    this.f22181k.N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f22294d = this.f22181k;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public void f(e eVar, boolean z10) {
        m(eVar, this.f22179i, z10);
    }

    public int getMargin() {
        return this.f22181k.J0();
    }

    public int getType() {
        return this.f22179i;
    }

    public boolean l() {
        return this.f22181k.H0();
    }

    public final void m(e eVar, int i10, boolean z10) {
        this.f22180j = i10;
        if (z10) {
            int i11 = this.f22179i;
            if (i11 == 5) {
                this.f22180j = 1;
            } else if (i11 == 6) {
                this.f22180j = 0;
            }
        } else {
            int i12 = this.f22179i;
            if (i12 == 5) {
                this.f22180j = 0;
            } else if (i12 == 6) {
                this.f22180j = 1;
            }
        }
        if (eVar instanceof F0.a) {
            ((F0.a) eVar).M0(this.f22180j);
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f22181k.L0(z10);
    }

    public void setDpMargin(int i10) {
        this.f22181k.N0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f22181k.N0(i10);
    }

    public void setType(int i10) {
        this.f22179i = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
