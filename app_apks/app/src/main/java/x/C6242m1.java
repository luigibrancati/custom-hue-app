package x;

import B0.c;
import E.InterfaceC0802n;
import L.InterfaceC1099g0;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import w.C6107a;
import x.C6266v;
import y.C6378n;

/* JADX INFO: renamed from: x.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6242m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f47073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6245n1 f47074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f47075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47076d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f47077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C6266v.c f47078f;

    public C6242m1(C6266v c6266v, C6378n c6378n, Executor executor) {
        this.f47073a = c6266v;
        this.f47074b = new C6245n1(c6378n, 0);
        this.f47075c = executor;
    }

    public final void a() {
        c.a aVar = this.f47077e;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a("Cancelled by another setExposureCompensationIndex()"));
            this.f47077e = null;
        }
        C6266v.c cVar = this.f47078f;
        if (cVar != null) {
            this.f47073a.d0(cVar);
            this.f47078f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f47076d) {
            return;
        }
        this.f47076d = z10;
        if (z10) {
            return;
        }
        this.f47074b.b(0);
        a();
    }

    public void c(C6107a.C0631a c0631a) {
        c0631a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f47074b.a()), InterfaceC1099g0.c.REQUIRED);
    }
}
