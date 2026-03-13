package u6;

import android.util.Log;
import java.util.Objects;
import s6.C5783b;

/* JADX INFO: renamed from: u6.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5921C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5783b f45095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5922D f45096b;

    public RunnableC5921C(C5922D c5922d, C5783b c5783b) {
        this.f45095a = c5783b;
        Objects.requireNonNull(c5922d);
        this.f45096b = c5922d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5922D c5922d = this.f45096b;
        C5919A c5919a = (C5919A) c5922d.f45102f.c().get(c5922d.d());
        if (c5919a == null) {
            return;
        }
        if (!this.f45095a.l()) {
            c5919a.q(this.f45095a, null);
            return;
        }
        c5922d.e(true);
        if (c5922d.c().h()) {
            c5922d.b();
            return;
        }
        try {
            c5922d.c().j(null, c5922d.c().i());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f45096b.c().a("Failed to get service from broker.");
            c5919a.q(new C5783b(10), null);
        }
    }
}
