package Bc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f799e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f800f = new f(1, 0);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a() {
            return f.f800f;
        }

        public a() {
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // Bc.d
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return c() == fVar.c() && d() == fVar.d();
    }

    @Override // Bc.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    @Override // Bc.d
    public boolean isEmpty() {
        return c() > d();
    }

    public boolean k(int i10) {
        return c() <= i10 && i10 <= d();
    }

    public Integer l() {
        return Integer.valueOf(d());
    }

    public Integer n() {
        return Integer.valueOf(c());
    }

    @Override // Bc.d
    public String toString() {
        return c() + ".." + d();
    }
}
