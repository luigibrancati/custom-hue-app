package R1;

import a2.L;
import android.net.Uri;
import e2.k;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        l a(Q1.g gVar, e2.k kVar, k kVar2, e2.e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean a(Uri uri, k.c cVar, boolean z10);

        void f();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f14500a;

        public c(Uri uri) {
            this.f14500a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f14501a;

        public d(Uri uri) {
            this.f14501a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void g(f fVar);
    }

    void a(Uri uri);

    void b(Uri uri);

    long c();

    h d();

    void e(Uri uri);

    void f(b bVar);

    boolean g(Uri uri);

    boolean h();

    boolean i(Uri uri, long j10);

    void j(b bVar);

    void k();

    void l(Uri uri, L.a aVar, e eVar);

    f m(Uri uri, boolean z10);

    void stop();
}
