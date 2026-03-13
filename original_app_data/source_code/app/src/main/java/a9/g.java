package a9;

import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21200a;

    public g(C2656a c2656a) {
        this.f21200a = c2656a;
    }

    public static g a(C2656a c2656a) {
        return new g(c2656a);
    }

    public static SessionManager c(C2656a c2656a) {
        return (SessionManager) Sa.b.c(c2656a.f());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f21200a);
    }
}
