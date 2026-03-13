package lc;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.p;

/* JADX INFO: renamed from: lc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4984a implements InterfaceC4992i.b {
    private final InterfaceC4992i.c key;

    public AbstractC4984a(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        this.key = key;
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ <R> R fold(R r10, p pVar) {
        return (R) InterfaceC4992i.b.a.a(this, r10, pVar);
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public /* bridge */ <E extends InterfaceC4992i.b> E get(InterfaceC4992i.c cVar) {
        return (E) InterfaceC4992i.b.a.b(this, cVar);
    }

    @Override // lc.InterfaceC4992i.b
    public InterfaceC4992i.c getKey() {
        return this.key;
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.c(this, cVar);
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC4992i.b.a.d(this, interfaceC4992i);
    }
}
