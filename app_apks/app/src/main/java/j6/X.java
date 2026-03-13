package j6;

import android.content.Context;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f39048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f39049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f39050c;

    public X(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        this.f39048a = interfaceC3978a;
        this.f39049b = interfaceC3978a2;
        this.f39050c = interfaceC3978a3;
    }

    public static X a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        return new X(interfaceC3978a, interfaceC3978a2, interfaceC3978a3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f39048a.get(), (String) this.f39049b.get(), ((Integer) this.f39050c.get()).intValue());
    }
}
