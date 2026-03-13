package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaBrowser.ItemCallback f21316a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends MediaBrowser.ItemCallback {
        public a() {
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            c.this.a(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            c.this.b(MediaBrowserCompat$MediaItem.a(mediaItem));
        }
    }

    public void a(String str) {
    }

    public void b(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
    }
}
