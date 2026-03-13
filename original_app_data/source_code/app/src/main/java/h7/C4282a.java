package h7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import c1.AbstractC2929c;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import i7.AbstractC4365a;
import n7.l;
import n7.n;
import p.C5344f;
import p7.AbstractC5402c;
import u7.AbstractC5981a;

/* JADX INFO: renamed from: h7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4282a extends C5344f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36281h = i.f25985j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[][] f36282i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f36283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36285g;

    public C4282a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25824c);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f36283e == null) {
            int[][] iArr = f36282i;
            int[] iArr2 = new int[iArr.length];
            int iD = AbstractC4365a.d(this, AbstractC3079a.f25827f);
            int iD2 = AbstractC4365a.d(this, AbstractC3079a.f25832k);
            int iD3 = AbstractC4365a.d(this, AbstractC3079a.f25829h);
            iArr2[0] = AbstractC4365a.h(iD2, iD, 1.0f);
            iArr2[1] = AbstractC4365a.h(iD2, iD3, 0.54f);
            iArr2[2] = AbstractC4365a.h(iD2, iD3, 0.38f);
            iArr2[3] = AbstractC4365a.h(iD2, iD3, 0.38f);
            this.f36283e = new ColorStateList(iArr, iArr2);
        }
        return this.f36283e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36284f && AbstractC2929c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f36285g || !TextUtils.isEmpty(getText()) || (drawableA = AbstractC2929c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            P0.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f36285g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f36284f = z10;
        if (z10) {
            AbstractC2929c.c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2929c.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4282a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36281h;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26113R2, i10, i11, new int[0]);
        if (typedArrayH.hasValue(j.f26120S2)) {
            AbstractC2929c.c(this, AbstractC5402c.a(context2, typedArrayH, j.f26120S2));
        }
        this.f36284f = typedArrayH.getBoolean(j.f26134U2, false);
        this.f36285g = typedArrayH.getBoolean(j.f26127T2, true);
        typedArrayH.recycle();
    }
}
