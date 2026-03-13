package u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: u6.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5927I extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5926H f45107b;

    public C5927I(AbstractC5926H abstractC5926H) {
        this.f45107b = abstractC5926H;
    }

    public final void a(Context context) {
        this.f45106a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f45106a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f45106a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f45107b.a();
            b();
        }
    }
}
