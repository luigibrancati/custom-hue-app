package u6;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: u6.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5961i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5956g f45189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5963j0 f45191c;

    public RunnableC5961i0(C5963j0 c5963j0, AbstractC5956g abstractC5956g, String str) {
        this.f45189a = abstractC5956g;
        this.f45190b = str;
        Objects.requireNonNull(c5963j0);
        this.f45191c = c5963j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C5963j0 c5963j0 = this.f45191c;
        if (c5963j0.k() > 0) {
            AbstractC5956g abstractC5956g = this.f45189a;
            if (c5963j0.l() != null) {
                bundle = c5963j0.l().getBundle(this.f45190b);
            } else {
                bundle = null;
            }
            abstractC5956g.f(bundle);
        }
        if (c5963j0.k() >= 2) {
            this.f45189a.j();
        }
        if (c5963j0.k() >= 3) {
            this.f45189a.h();
        }
        if (c5963j0.k() >= 4) {
            this.f45189a.k();
        }
        if (c5963j0.k() >= 5) {
            this.f45189a.g();
        }
    }
}
