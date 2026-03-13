package fc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: fc.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4016I implements InterfaceC4028k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC6082a f34255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34256b;

    public C4016I(InterfaceC6082a initializer) {
        AbstractC4862t.e(initializer, "initializer");
        this.f34255a = initializer;
        this.f34256b = C4011D.f34248a;
    }

    @Override // fc.InterfaceC4028k
    public Object getValue() {
        if (this.f34256b == C4011D.f34248a) {
            InterfaceC6082a interfaceC6082a = this.f34255a;
            AbstractC4862t.b(interfaceC6082a);
            this.f34256b = interfaceC6082a.invoke();
            this.f34255a = null;
        }
        return this.f34256b;
    }

    @Override // fc.InterfaceC4028k
    public boolean isInitialized() {
        return this.f34256b != C4011D.f34248a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
