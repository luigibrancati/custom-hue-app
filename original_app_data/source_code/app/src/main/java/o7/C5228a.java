package o7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c1.AbstractC2929c;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import i7.AbstractC4365a;
import n7.l;
import p.C5359u;
import p7.AbstractC5402c;
import u7.AbstractC5981a;

/* JADX INFO: renamed from: o7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5228a extends C5359u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41220g = i.f25986k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f41221h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f41222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41223f;

    public C5228a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25844w);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41222e == null) {
            int iD = AbstractC4365a.d(this, AbstractC3079a.f25827f);
            int iD2 = AbstractC4365a.d(this, AbstractC3079a.f25829h);
            int iD3 = AbstractC4365a.d(this, AbstractC3079a.f25832k);
            int[][] iArr = f41221h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC4365a.h(iD3, iD, 1.0f);
            iArr2[1] = AbstractC4365a.h(iD3, iD2, 0.54f);
            iArr2[2] = AbstractC4365a.h(iD3, iD2, 0.38f);
            iArr2[3] = AbstractC4365a.h(iD3, iD2, 0.38f);
            this.f41222e = new ColorStateList(iArr, iArr2);
        }
        return this.f41222e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41223f && AbstractC2929c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f41223f = z10;
        if (z10) {
            AbstractC2929c.c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2929c.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5228a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f41220g;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26148W2, i10, i11, new int[0]);
        if (typedArrayH.hasValue(j.f26155X2)) {
            AbstractC2929c.c(this, AbstractC5402c.a(context2, typedArrayH, j.f26155X2));
        }
        this.f41223f = typedArrayH.getBoolean(j.f26162Y2, false);
        typedArrayH.recycle();
    }
}
