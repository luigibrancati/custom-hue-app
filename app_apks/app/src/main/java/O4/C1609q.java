package O4;

/* JADX INFO: renamed from: O4.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1609q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11138b;

    /* JADX INFO: renamed from: O4.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11140b;

        public a() {
        }

        public C1609q a() {
            if (!this.f11139a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C1609q(true, this.f11140b);
        }

        public a b() {
            this.f11139a = true;
            return this;
        }

        public a c() {
            this.f11140b = true;
            return this;
        }
    }

    public C1609q(boolean z10, boolean z11) {
        this.f11137a = z10;
        this.f11138b = z11;
    }

    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.f11137a;
    }

    public boolean b() {
        return this.f11138b;
    }
}
