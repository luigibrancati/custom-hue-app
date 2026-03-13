package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends android.support.v4.os.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f21286e;

    @Override // android.support.v4.os.a
    public void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.b(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f21286e.a(this.f21285d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f21286e.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f21286e.a(this.f21285d);
        }
    }
}
