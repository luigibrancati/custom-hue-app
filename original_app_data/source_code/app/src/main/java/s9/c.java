package s9;

import android.content.Context;
import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f44329a;

    public c(InterfaceC3978a interfaceC3978a) {
        this.f44329a = interfaceC3978a;
    }

    public static c a(InterfaceC3978a interfaceC3978a) {
        return new c(interfaceC3978a);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((Context) this.f44329a.get());
    }
}
