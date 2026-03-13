package c6;

import android.content.Context;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f25811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f25812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f25813c;

    public j(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        this.f25811a = interfaceC3978a;
        this.f25812b = interfaceC3978a2;
        this.f25813c = interfaceC3978a3;
    }

    public static j a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        return new j(interfaceC3978a, interfaceC3978a2, interfaceC3978a3);
    }

    public static i c(Context context, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2) {
        return new i(context, interfaceC4957a, interfaceC4957a2);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f25811a.get(), (InterfaceC4957a) this.f25812b.get(), (InterfaceC4957a) this.f25813c.get());
    }
}
