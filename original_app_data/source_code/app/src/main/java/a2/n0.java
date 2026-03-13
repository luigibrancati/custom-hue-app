package a2;

import K7.AbstractC1081v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f20861d = new n0(new D1.E[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20862e = G1.M.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1081v f20864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20865c;

    public n0(D1.E... eArr) {
        this.f20864b = AbstractC1081v.w(eArr);
        this.f20863a = eArr.length;
        e();
    }

    public D1.E b(int i10) {
        return (D1.E) this.f20864b.get(i10);
    }

    public AbstractC1081v c() {
        return AbstractC1081v.v(K7.D.k(this.f20864b, new J7.f() { // from class: a2.m0
            @Override // J7.f
            public final Object apply(Object obj) {
                return Integer.valueOf(((D1.E) obj).f1493c);
            }
        }));
    }

    public int d(D1.E e10) {
        int iIndexOf = this.f20864b.indexOf(e10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final void e() {
        int i10 = 0;
        while (i10 < this.f20864b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f20864b.size(); i12++) {
                if (((D1.E) this.f20864b.get(i10)).equals(this.f20864b.get(i12))) {
                    G1.t.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f20863a == n0Var.f20863a && this.f20864b.equals(n0Var.f20864b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f20865c == 0) {
            this.f20865c = this.f20864b.hashCode();
        }
        return this.f20865c;
    }

    public String toString() {
        return this.f20864b.toString();
    }
}
