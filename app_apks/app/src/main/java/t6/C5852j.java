package t6;

import s6.C5785d;

/* JADX INFO: renamed from: t6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5852j extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5785d f44773a;

    public C5852j(C5785d c5785d) {
        this.f44773a = c5785d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f44773a));
    }
}
