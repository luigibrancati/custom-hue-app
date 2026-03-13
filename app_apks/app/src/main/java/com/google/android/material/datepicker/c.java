package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c7.AbstractC3079a;
import p7.AbstractC5402c;
import p7.C5401b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f30656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f30658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f30659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f30660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f30661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f30662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f30663h;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5401b.c(context, AbstractC3079a.f25840s, h.class.getCanonicalName()), c7.j.f26345w2);
        this.f30656a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26366z2, 0));
        this.f30662g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26352x2, 0));
        this.f30657b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26359y2, 0));
        this.f30658c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f25994A2, 0));
        ColorStateList colorStateListA = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, c7.j.f26001B2);
        this.f30659d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26015D2, 0));
        this.f30660e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26008C2, 0));
        this.f30661f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c7.j.f26022E2, 0));
        Paint paint = new Paint();
        this.f30663h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
