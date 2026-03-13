package s9;

import ec.InterfaceC3978a;
import lc.InterfaceC4992i;
import p9.C5426b;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f44357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f44358b;

    public f(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        this.f44357a = interfaceC3978a;
        this.f44358b = interfaceC3978a2;
    }

    public static f a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        return new f(interfaceC3978a, interfaceC3978a2);
    }

    public static e c(C5426b c5426b, InterfaceC4992i interfaceC4992i) {
        return new e(c5426b, interfaceC4992i);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((C5426b) this.f44357a.get(), (InterfaceC4992i) this.f44358b.get());
    }
}
