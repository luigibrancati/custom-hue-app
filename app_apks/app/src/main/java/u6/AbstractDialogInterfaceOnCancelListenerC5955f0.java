package u6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;
import s6.C5783b;

/* JADX INFO: renamed from: u6.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC5955f0 extends AbstractC5956g implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f45175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f45176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f45177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleApiAvailability f45178e;

    public AbstractDialogInterfaceOnCancelListenerC5955f0(InterfaceC5958h interfaceC5958h, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC5958h);
        this.f45176c = new AtomicReference(null);
        this.f45177d = new H6.e(Looper.getMainLooper());
        this.f45178e = googleApiAvailability;
    }

    public static final int n(C5949c0 c5949c0) {
        if (c5949c0 == null) {
            return -1;
        }
        return c5949c0.a();
    }

    @Override // u6.AbstractC5956g
    public final void e(int i10, int i11, Intent intent) {
        C5949c0 c5949c0 = (C5949c0) this.f45176c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f45178e.g(b());
                if (iG == 0) {
                    r();
                    return;
                } else {
                    if (c5949c0 == null) {
                        return;
                    }
                    if (c5949c0.b().e() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            r();
            return;
        } else if (i11 == 0) {
            if (c5949c0 != null) {
                s(new C5783b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c5949c0.b().toString()), n(c5949c0));
                return;
            }
            return;
        }
        if (c5949c0 != null) {
            s(c5949c0.b(), c5949c0.a());
        }
    }

    @Override // u6.AbstractC5956g
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f45176c.set(bundle.getBoolean("resolving_error", false) ? new C5949c0(new C5783b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // u6.AbstractC5956g
    public final void i(Bundle bundle) {
        super.i(bundle);
        C5949c0 c5949c0 = (C5949c0) this.f45176c.get();
        if (c5949c0 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c5949c0.a());
        bundle.putInt("failed_status", c5949c0.b().e());
        bundle.putParcelable("failed_resolution", c5949c0.b().h());
    }

    @Override // u6.AbstractC5956g
    public void j() {
        super.j();
        this.f45175b = true;
    }

    @Override // u6.AbstractC5956g
    public void k() {
        super.k();
        this.f45175b = false;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void r() {
        this.f45176c.set(null);
        p();
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void s(C5783b c5783b, int i10) {
        this.f45176c.set(null);
        o(c5783b, i10);
    }

    public abstract void o(C5783b c5783b, int i10);

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        s(new C5783b(13, null), n((C5949c0) this.f45176c.get()));
    }

    public abstract void p();

    public final void q(C5783b c5783b, int i10) {
        C5949c0 c5949c0 = new C5949c0(c5783b, i10);
        if (T1.e.a(this.f45176c, null, c5949c0)) {
            this.f45177d.post(new RunnableC5953e0(this, c5949c0));
        }
    }
}
