package B;

import E.AbstractC0807p0;
import L.X0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TorchFlashRequiredFor3aUpdateQuirk f496a;

    public A(X0 x02) {
        this.f496a = (TorchFlashRequiredFor3aUpdateQuirk) x02.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f496a;
        boolean z10 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.g();
        AbstractC0807p0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }
}
