package a9;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21199a;

    public f(C2656a c2656a) {
        this.f21199a = c2656a;
    }

    public static f a(C2656a c2656a) {
        return new f(c2656a);
    }

    public static RemoteConfigManager c(C2656a c2656a) {
        return (RemoteConfigManager) Sa.b.c(c2656a.e());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f21199a);
    }
}
