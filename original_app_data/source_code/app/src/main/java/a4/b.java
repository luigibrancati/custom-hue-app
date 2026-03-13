package a4;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20938a = a.f20939a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f20939a = new a();

        public final b a() {
            return new i();
        }
    }

    void b(Bitmap bitmap);

    Bitmap c(int i10, int i11, Bitmap.Config config);

    Bitmap removeLast();
}
