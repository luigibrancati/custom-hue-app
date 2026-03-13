package x3;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f47358a;

    public j(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f47358a = webSettingsBoundaryInterface;
    }

    public void a(int i10) {
        this.f47358a.setForceDark(i10);
    }

    public void b(int i10) {
        this.f47358a.setForceDarkBehavior(i10);
    }

    public void c(boolean z10) {
        this.f47358a.setPaymentRequestEnabled(z10);
    }
}
