package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDescriptionCompat f21288b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }
    }

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(mediaDescriptionCompat.c())) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f21287a = i10;
        this.f21288b = mediaDescriptionCompat;
    }

    public static MediaBrowserCompat$MediaItem a(Object obj) {
        if (obj == null) {
            return null;
        }
        MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
        return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.a(android.support.v4.media.a.a(mediaItem)), android.support.v4.media.a.b(mediaItem));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f21287a + ", mDescription=" + this.f21288b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21287a);
        this.f21288b.writeToParcel(parcel, i10);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f21287a = parcel.readInt();
        this.f21288b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
