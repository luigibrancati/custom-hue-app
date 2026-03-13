package Q4;

import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13899a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.images.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.audio.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[P.external.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[P.files.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13899a = iArr;
        }
    }

    public static final Uri b(P p10) {
        switch (a.f13899a[p10.ordinal()]) {
            case 1:
                return MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            case 2:
                return Uri.parse("content://com.android.externalstorage.documents/tree/primary%3APictures");
            case 3:
                return Uri.parse("content://com.android.externalstorage.documents/tree/primary%3AMovies");
            case 4:
                return Uri.parse("content://com.android.externalstorage.documents/tree/primary%3AMusic");
            case 5:
                return Uri.parse("content://com.android.externalstorage.documents/tree/secondary%3A");
            case 6:
                return Uri.parse("content://com.android.externalstorage.documents/tree/primary%3A");
            default:
                return null;
        }
    }
}
