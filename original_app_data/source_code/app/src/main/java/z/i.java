package z;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48672a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        void d(String str);

        void e();

        void f(int i10);

        Object g();

        Surface getSurface();
    }

    public i(int i10, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f48672a = new m(i10, surface);
        } else {
            this.f48672a = new l(i10, surface);
        }
    }

    public static i i(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarI = Build.VERSION.SDK_INT >= 33 ? m.i((OutputConfiguration) obj) : l.h((OutputConfiguration) obj);
        if (aVarI == null) {
            return null;
        }
        return new i(aVarI);
    }

    public void a(Surface surface) {
        this.f48672a.b(surface);
    }

    public void b() {
        this.f48672a.e();
    }

    public Surface c() {
        return this.f48672a.getSurface();
    }

    public void d(long j10) {
        this.f48672a.c(j10);
    }

    public void e(int i10) {
        this.f48672a.f(i10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f48672a.equals(((i) obj).f48672a);
        }
        return false;
    }

    public void f(String str) {
        this.f48672a.d(str);
    }

    public void g(long j10) {
        this.f48672a.a(j10);
    }

    public Object h() {
        return this.f48672a.g();
    }

    public int hashCode() {
        return this.f48672a.hashCode();
    }

    public i(OutputConfiguration outputConfiguration) {
        this.f48672a = m.i(outputConfiguration);
    }

    public i(a aVar) {
        this.f48672a = aVar;
    }
}
