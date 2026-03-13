package d7;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import u1.C5906a;
import u1.C5907b;
import u1.C5908c;

/* JADX INFO: renamed from: d7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3834a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f33146a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f33147b = new C5907b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f33148c = new C5906a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f33149d = new C5908c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f33150e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
