package p9;

import android.content.Context;
import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f42310b;

    public B(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        this.f42309a = interfaceC3978a;
        this.f42310b = interfaceC3978a2;
    }

    public static B a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        return new B(interfaceC3978a, interfaceC3978a2);
    }

    public static C5424A c(Context context, Z z10) {
        return new C5424A(context, z10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5424A get() {
        return c((Context) this.f42309a.get(), (Z) this.f42310b.get());
    }
}
