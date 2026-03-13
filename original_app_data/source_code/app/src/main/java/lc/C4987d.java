package lc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.p;

/* JADX INFO: renamed from: lc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4987d implements InterfaceC4992i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f40084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4992i.b f40085b;

    public C4987d(InterfaceC4992i left, InterfaceC4992i.b element) {
        AbstractC4862t.e(left, "left");
        AbstractC4862t.e(element, "element");
        this.f40084a = left;
        this.f40085b = element;
    }

    public static final String l(String acc, InterfaceC4992i.b element) {
        AbstractC4862t.e(acc, "acc");
        AbstractC4862t.e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final int size() {
        int i10 = 2;
        while (true) {
            InterfaceC4992i interfaceC4992i = this.f40084a;
            this = interfaceC4992i instanceof C4987d ? (C4987d) interfaceC4992i : null;
            if (this == null) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean e(InterfaceC4992i.b bVar) {
        return AbstractC4862t.a(get(bVar.getKey()), bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4987d)) {
            return false;
        }
        C4987d c4987d = (C4987d) obj;
        return c4987d.size() == size() && c4987d.j(this);
    }

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, p operation) {
        AbstractC4862t.e(operation, "operation");
        return operation.invoke(this.f40084a.fold(obj, operation), this.f40085b);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        while (true) {
            InterfaceC4992i.b bVar = this.f40085b.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC4992i interfaceC4992i = this.f40084a;
            if (!(interfaceC4992i instanceof C4987d)) {
                return interfaceC4992i.get(key);
            }
            this = (C4987d) interfaceC4992i;
        }
    }

    public int hashCode() {
        return this.f40084a.hashCode() + this.f40085b.hashCode();
    }

    public final boolean j(C4987d c4987d) {
        while (e(c4987d.f40085b)) {
            InterfaceC4992i interfaceC4992i = c4987d.f40084a;
            if (!(interfaceC4992i instanceof C4987d)) {
                AbstractC4862t.c(interfaceC4992i, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((InterfaceC4992i.b) interfaceC4992i);
            }
            c4987d = (C4987d) interfaceC4992i;
        }
        return false;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        if (this.f40085b.get(key) != null) {
            return this.f40084a;
        }
        InterfaceC4992i interfaceC4992iMinusKey = this.f40084a.minusKey(key);
        return interfaceC4992iMinusKey == this.f40084a ? this : interfaceC4992iMinusKey == C4993j.f40088a ? this.f40085b : new C4987d(interfaceC4992iMinusKey, this.f40085b);
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC4992i.a.b(this, interfaceC4992i);
    }

    public String toString() {
        return '[' + ((String) fold("", new p() { // from class: lc.c
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return C4987d.l((String) obj, (InterfaceC4992i.b) obj2);
            }
        })) + ']';
    }
}
