package d7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: d7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3837d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f33155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33157e;

    public C3837d(long j10, long j11) {
        this.f33155c = null;
        this.f33156d = 0;
        this.f33157e = 1;
        this.f33153a = j10;
        this.f33154b = j11;
    }

    public static C3837d a(ValueAnimator valueAnimator) {
        C3837d c3837d = new C3837d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        c3837d.f33156d = valueAnimator.getRepeatCount();
        c3837d.f33157e = valueAnimator.getRepeatMode();
        return c3837d;
    }

    public static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C3834a.f33147b : interpolator instanceof AccelerateInterpolator ? C3834a.f33148c : interpolator instanceof DecelerateInterpolator ? C3834a.f33149d : interpolator;
    }

    public long b() {
        return this.f33153a;
    }

    public long c() {
        return this.f33154b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f33155c;
        return timeInterpolator != null ? timeInterpolator : C3834a.f33147b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3837d)) {
            return false;
        }
        C3837d c3837d = (C3837d) obj;
        if (b() == c3837d.b() && c() == c3837d.c() && f() == c3837d.f() && g() == c3837d.g()) {
            return d().getClass().equals(c3837d.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f33156d;
    }

    public int g() {
        return this.f33157e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public C3837d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33156d = 0;
        this.f33157e = 1;
        this.f33153a = j10;
        this.f33154b = j11;
        this.f33155c = timeInterpolator;
    }
}
