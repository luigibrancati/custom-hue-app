package j0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f38860l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f38861m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f38862n = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vc.l f38863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vc.l f38864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f38865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f38866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38867k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public d(long j10, h hVar, vc.l lVar, vc.l lVar2) {
        super(j10, hVar, null);
        this.f38863g = lVar;
        this.f38864h = lVar2;
        this.f38865i = h.f38880e.a();
        this.f38866j = f38862n;
        this.f38867k = 1;
    }

    @Override // j0.e
    public abstract void a();

    @Override // j0.e
    /* JADX INFO: renamed from: i */
    public vc.l c() {
        return this.f38863g;
    }

    public vc.l j() {
        return this.f38864h;
    }
}
