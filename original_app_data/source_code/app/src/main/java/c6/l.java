package c6;

import android.content.Context;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f25819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f25820b;

    public l(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        this.f25819a = interfaceC3978a;
        this.f25820b = interfaceC3978a2;
    }

    public static l a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        return new l(interfaceC3978a, interfaceC3978a2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f25819a.get(), this.f25820b.get());
    }
}
