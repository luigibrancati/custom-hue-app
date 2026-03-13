package com.google.android.material.datepicker;

import Y0.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import p7.AbstractC5402c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f30650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f30651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f30652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f30653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s7.k f30655f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, s7.k kVar, Rect rect) {
        X0.h.e(rect.left);
        X0.h.e(rect.top);
        X0.h.e(rect.right);
        X0.h.e(rect.bottom);
        this.f30650a = rect;
        this.f30651b = colorStateList2;
        this.f30652c = colorStateList;
        this.f30653d = colorStateList3;
        this.f30654e = i10;
        this.f30655f = kVar;
    }

    public static b a(Context context, int i10) {
        X0.h.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, c7.j.f26029F2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(c7.j.f26036G2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c7.j.f26050I2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c7.j.f26043H2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c7.j.f26057J2, 0));
        ColorStateList colorStateListA = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, c7.j.f26064K2);
        ColorStateList colorStateListA2 = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, c7.j.f26099P2);
        ColorStateList colorStateListA3 = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, c7.j.f26085N2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c7.j.f26092O2, 0);
        s7.k kVarM = s7.k.b(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26071L2, 0), typedArrayObtainStyledAttributes.getResourceId(c7.j.f26078M2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public void b(TextView textView) {
        s7.g gVar = new s7.g();
        s7.g gVar2 = new s7.g();
        gVar.setShapeAppearanceModel(this.f30655f);
        gVar2.setShapeAppearanceModel(this.f30655f);
        gVar.U(this.f30652c);
        gVar.Z(this.f30654e, this.f30653d);
        textView.setTextColor(this.f30651b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f30651b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f30650a;
        E.j0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
