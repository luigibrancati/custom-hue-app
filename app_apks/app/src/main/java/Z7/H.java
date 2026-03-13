package Z7;

import e8.C3950A;
import g8.C4160a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4160a f20334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3950A f20335b;

    public H(C3950A c3950a, C4160a c4160a) {
        this.f20335b = c3950a;
        this.f20334a = c4160a;
    }

    public static H b(C3950A c3950a) {
        return new H(c3950a, N.b(c3950a.U()));
    }

    public static H c(C3950A c3950a) {
        return new H(c3950a, N.h(c3950a.U()));
    }

    @Override // Z7.K
    public C4160a a() {
        return this.f20334a;
    }

    public C3950A d() {
        return this.f20335b;
    }
}
