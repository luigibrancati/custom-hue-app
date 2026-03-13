package O4;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1614t f10984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1593i f10985c;

    public O(C1593i c1593i, String str, InterfaceC1614t interfaceC1614t) {
        this.f10983a = str;
        this.f10984b = interfaceC1614t;
        this.f10985c = c1593i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Y yG0 = this.f10985c.G0(this.f10983a);
        this.f10984b.a(yG0.a(), yG0.b());
        return null;
    }
}
