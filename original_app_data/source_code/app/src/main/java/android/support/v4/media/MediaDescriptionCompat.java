package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f21293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f21294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f21295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f21296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f21297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f21298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f21299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f21300i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f21302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f21303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f21304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f21305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f21306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f21307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Uri f21308h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f21301a, this.f21302b, this.f21303c, this.f21304d, this.f21305e, this.f21306f, this.f21307g, this.f21308h);
        }

        public d b(CharSequence charSequence) {
            this.f21304d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f21307g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f21305e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f21306f = uri;
            return this;
        }

        public d f(String str) {
            this.f21301a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f21308h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f21303c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f21302b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f21292a = str;
        this.f21293b = charSequence;
        this.f21294c = charSequence2;
        this.f21295d = charSequence3;
        this.f21296e = bitmap;
        this.f21297f = uri;
        this.f21298g = bundle;
        this.f21299h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f21300i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f21300i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f21292a);
        b.p(builderB, this.f21293b);
        b.o(builderB, this.f21294c);
        b.j(builderB, this.f21295d);
        b.l(builderB, this.f21296e);
        b.m(builderB, this.f21297f);
        b.k(builderB, this.f21298g);
        c.b(builderB, this.f21299h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f21300i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    public String c() {
        return this.f21292a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f21293b) + ", " + ((Object) this.f21294c) + ", " + ((Object) this.f21295d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
