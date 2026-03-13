package u6;

import android.app.Activity;
import b0.C2778b;
import com.google.android.gms.common.GoogleApiAvailability;
import s6.C5783b;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5974t extends AbstractDialogInterfaceOnCancelListenerC5955f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2778b f45222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5952e f45223g;

    public C5974t(InterfaceC5958h interfaceC5958h, C5952e c5952e, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC5958h, googleApiAvailability);
        this.f45222f = new C2778b();
        this.f45223g = c5952e;
        this.f45179a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void t(Activity activity, C5952e c5952e, C5946b c5946b) {
        InterfaceC5958h interfaceC5958hC = AbstractC5956g.c(activity);
        C5974t c5974t = (C5974t) interfaceC5958hC.b("ConnectionlessLifecycleHelper", C5974t.class);
        if (c5974t == null) {
            c5974t = new C5974t(interfaceC5958hC, c5952e, GoogleApiAvailability.m());
        }
        AbstractC6056k.m(c5946b, "ApiKey cannot be null");
        c5974t.f45222f.add(c5946b);
        c5952e.p(c5974t);
    }

    @Override // u6.AbstractC5956g
    public final void h() {
        super.h();
        v();
    }

    @Override // u6.AbstractDialogInterfaceOnCancelListenerC5955f0, u6.AbstractC5956g
    public final void j() {
        super.j();
        v();
    }

    @Override // u6.AbstractDialogInterfaceOnCancelListenerC5955f0, u6.AbstractC5956g
    public final void k() {
        super.k();
        this.f45223g.q(this);
    }

    @Override // u6.AbstractDialogInterfaceOnCancelListenerC5955f0
    public final void o(C5783b c5783b, int i10) {
        this.f45223g.y(c5783b, i10);
    }

    @Override // u6.AbstractDialogInterfaceOnCancelListenerC5955f0
    public final void p() {
        this.f45223g.s();
    }

    public final C2778b u() {
        return this.f45222f;
    }

    public final void v() {
        if (this.f45222f.isEmpty()) {
            return;
        }
        this.f45223g.p(this);
    }
}
