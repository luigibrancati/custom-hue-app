package Bc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f809e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f810f = new i(1, 0);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final i a() {
            return i.f810f;
        }

        public a() {
        }
    }

    public i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // Bc.g
    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return c() == iVar.c() && d() == iVar.d();
    }

    @Override // Bc.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (c() ^ (c() >>> 32))) + (d() ^ (d() >>> 32)));
    }

    @Override // Bc.g
    public boolean isEmpty() {
        return c() > d();
    }

    @Override // Bc.g
    public String toString() {
        return c() + ".." + d();
    }
}
