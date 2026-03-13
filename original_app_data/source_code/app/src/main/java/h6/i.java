package h6;

import android.content.Context;
import d6.AbstractC3833d;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import i6.AbstractC4364f;
import i6.x;
import j6.InterfaceC4725d;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f36277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f36278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f36279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f36280d;

    public i(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        this.f36277a = interfaceC3978a;
        this.f36278b = interfaceC3978a2;
        this.f36279c = interfaceC3978a3;
        this.f36280d = interfaceC3978a4;
    }

    public static i a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        return new i(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4);
    }

    public static x c(Context context, InterfaceC4725d interfaceC4725d, AbstractC4364f abstractC4364f, InterfaceC4957a interfaceC4957a) {
        return (x) AbstractC3833d.d(h.a(context, interfaceC4725d, abstractC4364f, interfaceC4957a));
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f36277a.get(), (InterfaceC4725d) this.f36278b.get(), (AbstractC4364f) this.f36279c.get(), (InterfaceC4957a) this.f36280d.get());
    }
}
