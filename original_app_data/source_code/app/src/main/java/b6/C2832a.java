package b6;

import e6.C3940a;
import e6.C3941b;
import e6.C3942c;
import e6.C3943d;
import e6.C3944e;
import e6.C3945f;

/* JADX INFO: renamed from: b6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2832a implements I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I8.a f25286a = new C2832a();

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0329a implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0329a f25287a = new C0329a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25288b = H8.d.a("window").b(K8.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f25289c = H8.d.a("logSourceMetrics").b(K8.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f25290d = H8.d.a("globalMetrics").b(K8.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f25291e = H8.d.a("appNamespace").b(K8.a.b().c(4).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3940a c3940a, H8.f fVar) {
            fVar.e(f25288b, c3940a.d());
            fVar.e(f25289c, c3940a.c());
            fVar.e(f25290d, c3940a.b());
            fVar.e(f25291e, c3940a.a());
        }
    }

    /* JADX INFO: renamed from: b6.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25292a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25293b = H8.d.a("storageMetrics").b(K8.a.b().c(1).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3941b c3941b, H8.f fVar) {
            fVar.e(f25293b, c3941b.a());
        }
    }

    /* JADX INFO: renamed from: b6.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25294a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25295b = H8.d.a("eventsDroppedCount").b(K8.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f25296c = H8.d.a("reason").b(K8.a.b().c(3).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3942c c3942c, H8.f fVar) {
            fVar.b(f25295b, c3942c.a());
            fVar.e(f25296c, c3942c.b());
        }
    }

    /* JADX INFO: renamed from: b6.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25297a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25298b = H8.d.a("logSource").b(K8.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f25299c = H8.d.a("logEventDropped").b(K8.a.b().c(2).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3943d c3943d, H8.f fVar) {
            fVar.e(f25298b, c3943d.b());
            fVar.e(f25299c, c3943d.a());
        }
    }

    /* JADX INFO: renamed from: b6.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25300a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25301b = H8.d.d("clientMetrics");

        @Override // H8.b
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.a.a(obj);
            b(null, (H8.f) obj2);
        }

        public void b(AbstractC2844m abstractC2844m, H8.f fVar) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: b6.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25302a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25303b = H8.d.a("currentCacheSizeBytes").b(K8.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f25304c = H8.d.a("maxCacheSizeBytes").b(K8.a.b().c(2).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3944e c3944e, H8.f fVar) {
            fVar.b(f25303b, c3944e.a());
            fVar.b(f25304c, c3944e.b());
        }
    }

    /* JADX INFO: renamed from: b6.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f25305a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f25306b = H8.d.a("startMs").b(K8.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f25307c = H8.d.a("endMs").b(K8.a.b().c(2).a()).a();

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3945f c3945f, H8.f fVar) {
            fVar.b(f25306b, c3945f.b());
            fVar.b(f25307c, c3945f.a());
        }
    }

    @Override // I8.a
    public void a(I8.b bVar) {
        bVar.a(AbstractC2844m.class, e.f25300a);
        bVar.a(C3940a.class, C0329a.f25287a);
        bVar.a(C3945f.class, g.f25305a);
        bVar.a(C3943d.class, d.f25297a);
        bVar.a(C3942c.class, c.f25294a);
        bVar.a(C3941b.class, b.f25292a);
        bVar.a(C3944e.class, f.f25302a);
    }
}
