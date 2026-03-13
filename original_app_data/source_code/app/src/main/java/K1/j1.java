package K1;

import K7.AbstractC1085z;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j1 f7191i = new b().h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1085z f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f7193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f7194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7199h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Double f7201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Double f7202c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1085z f7200a = AbstractC1085z.A(1, 5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7203d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7204e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7205f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7206g = true;

        public j1 h() {
            return new j1(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f7192a.equals(j1Var.f7192a) && this.f7197f == j1Var.f7197f && Objects.equals(this.f7193b, j1Var.f7193b) && Objects.equals(this.f7194c, j1Var.f7194c) && this.f7195d == j1Var.f7195d && this.f7198g == j1Var.f7198g && this.f7199h == j1Var.f7199h;
    }

    public int hashCode() {
        return Objects.hash(this.f7192a, this.f7193b, this.f7194c, Boolean.valueOf(this.f7195d), Boolean.valueOf(this.f7197f), Boolean.valueOf(this.f7198g), Boolean.valueOf(this.f7199h));
    }

    public j1(b bVar) {
        this.f7192a = bVar.f7200a;
        this.f7193b = bVar.f7201b;
        this.f7194c = bVar.f7202c;
        this.f7195d = bVar.f7203d;
        this.f7196e = !bVar.f7204e;
        this.f7197f = bVar.f7204e;
        this.f7198g = bVar.f7205f;
        this.f7199h = bVar.f7206g;
    }
}
