package C8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f1175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f1176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1177h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1180c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f1178a = z10;
            this.f1179b = z11;
            this.f1180c = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1182b;

        public b(int i10, int i11) {
            this.f1181a = i10;
            this.f1182b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f1172c = j10;
        this.f1170a = bVar;
        this.f1171b = aVar;
        this.f1173d = i10;
        this.f1174e = i11;
        this.f1175f = d10;
        this.f1176g = d11;
        this.f1177h = i12;
    }

    public boolean a(long j10) {
        return this.f1172c < j10;
    }
}
