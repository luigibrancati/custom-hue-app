package android.support.v4.media;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getDescription();
    }

    public static int b(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getFlags();
    }
}
