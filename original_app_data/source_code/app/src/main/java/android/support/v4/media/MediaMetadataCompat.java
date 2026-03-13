package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import b0.C2777a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2777a f21309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f21310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f21311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f21312e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f21313a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C2777a c2777a = new C2777a();
        f21309b = c2777a;
        c2777a.put("android.media.metadata.TITLE", 1);
        c2777a.put("android.media.metadata.ARTIST", 1);
        c2777a.put("android.media.metadata.DURATION", 0);
        c2777a.put("android.media.metadata.ALBUM", 1);
        c2777a.put("android.media.metadata.AUTHOR", 1);
        c2777a.put("android.media.metadata.WRITER", 1);
        c2777a.put("android.media.metadata.COMPOSER", 1);
        c2777a.put("android.media.metadata.COMPILATION", 1);
        c2777a.put("android.media.metadata.DATE", 1);
        c2777a.put("android.media.metadata.YEAR", 0);
        c2777a.put("android.media.metadata.GENRE", 1);
        c2777a.put("android.media.metadata.TRACK_NUMBER", 0);
        c2777a.put("android.media.metadata.NUM_TRACKS", 0);
        c2777a.put("android.media.metadata.DISC_NUMBER", 0);
        c2777a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c2777a.put("android.media.metadata.ART", 2);
        c2777a.put("android.media.metadata.ART_URI", 1);
        c2777a.put("android.media.metadata.ALBUM_ART", 2);
        c2777a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c2777a.put("android.media.metadata.USER_RATING", 3);
        c2777a.put("android.media.metadata.RATING", 3);
        c2777a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c2777a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c2777a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c2777a.put("android.media.metadata.DISPLAY_ICON", 2);
        c2777a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c2777a.put("android.media.metadata.MEDIA_ID", 1);
        c2777a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c2777a.put("android.media.metadata.MEDIA_URI", 1);
        c2777a.put("android.media.metadata.ADVERTISEMENT", 0);
        c2777a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f21310c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f21311d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f21312e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f21313a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f21313a);
    }
}
