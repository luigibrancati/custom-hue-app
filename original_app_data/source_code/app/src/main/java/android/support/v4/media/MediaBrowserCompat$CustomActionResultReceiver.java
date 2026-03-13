package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends android.support.v4.os.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f21283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f21284f;

    @Override // android.support.v4.os.a
    public void a(int i10, Bundle bundle) {
        if (this.f21284f == null) {
            return;
        }
        MediaSessionCompat.a(bundle);
        if (i10 == -1) {
            this.f21284f.a(this.f21282d, this.f21283e, bundle);
            return;
        }
        if (i10 == 0) {
            this.f21284f.c(this.f21282d, this.f21283e, bundle);
            return;
        }
        if (i10 == 1) {
            this.f21284f.b(this.f21282d, this.f21283e, bundle);
            return;
        }
        Log.w("MediaBrowserCompat", "Unknown result code: " + i10 + " (extras=" + this.f21283e + ", resultData=" + bundle + ")");
    }
}
