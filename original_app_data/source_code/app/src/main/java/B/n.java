package B;

import L.X0;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f513b = false;

    public n(X0 x02) {
        this.f512a = x02.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f513b = false;
    }

    public void b() {
        this.f513b = true;
    }

    public boolean c(int i10) {
        return this.f513b && i10 == 0 && this.f512a;
    }
}
