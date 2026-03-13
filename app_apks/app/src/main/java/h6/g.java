package h6;

import d6.AbstractC3833d;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import i6.AbstractC4364f;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f36276a;

    public g(InterfaceC3978a interfaceC3978a) {
        this.f36276a = interfaceC3978a;
    }

    public static AbstractC4364f a(InterfaceC4957a interfaceC4957a) {
        return (AbstractC4364f) AbstractC3833d.d(AbstractC4281f.a(interfaceC4957a));
    }

    public static g b(InterfaceC3978a interfaceC3978a) {
        return new g(interfaceC3978a);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4364f get() {
        return a((InterfaceC4957a) this.f36276a.get());
    }
}
