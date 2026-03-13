package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends android.support.v4.os.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f21290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f21291f;

    @Override // android.support.v4.os.a
    public void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.b(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f21291f.a(this.f21289d, this.f21290e);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray == null) {
            this.f21291f.a(this.f21289d, this.f21290e);
            return;
        }
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        this.f21291f.b(this.f21289d, this.f21290e, arrayList);
    }
}
