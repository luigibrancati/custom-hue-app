package p9;

import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42371a;

    public S(InterfaceC3978a interfaceC3978a) {
        this.f42371a = interfaceC3978a;
    }

    public static S a(InterfaceC3978a interfaceC3978a) {
        return new S(interfaceC3978a);
    }

    public static Q c(T t10) {
        return new Q(t10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Q get() {
        return c((T) this.f42371a.get());
    }
}
