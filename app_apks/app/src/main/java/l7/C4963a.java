package l7;

import android.content.Context;
import android.graphics.Color;
import c7.AbstractC3079a;
import i7.AbstractC4365a;
import p7.C5401b;

/* JADX INFO: renamed from: l7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4963a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39899f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39904e;

    public C4963a(Context context) {
        this(C5401b.b(context, AbstractC3079a.f25836o, false), AbstractC4365a.b(context, AbstractC3079a.f25835n, 0), AbstractC4365a.b(context, AbstractC3079a.f25834m, 0), AbstractC4365a.b(context, AbstractC3079a.f25832k, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        if (this.f39904e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iH = AbstractC4365a.h(O0.a.j(i10, 255), this.f39901b, fA);
        if (fA > 0.0f && (i11 = this.f39902c) != 0) {
            iH = AbstractC4365a.g(iH, O0.a.j(i11, f39899f));
        }
        return O0.a.j(iH, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f39900a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f39900a;
    }

    public final boolean e(int i10) {
        return O0.a.j(i10, 255) == this.f39903d;
    }

    public C4963a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f39900a = z10;
        this.f39901b = i10;
        this.f39902c = i11;
        this.f39903d = i12;
        this.f39904e = f10;
    }
}
