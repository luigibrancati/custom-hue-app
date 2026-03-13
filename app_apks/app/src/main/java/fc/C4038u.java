package fc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: fc.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4038u implements InterfaceC4028k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC6082a f34282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f34283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34284c;

    public C4038u(InterfaceC6082a initializer, Object obj) {
        AbstractC4862t.e(initializer, "initializer");
        this.f34282a = initializer;
        this.f34283b = C4011D.f34248a;
        this.f34284c = obj == null ? this : obj;
    }

    @Override // fc.InterfaceC4028k
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f34283b;
        C4011D c4011d = C4011D.f34248a;
        if (obj != c4011d) {
            return obj;
        }
        synchronized (this.f34284c) {
            objInvoke = this.f34283b;
            if (objInvoke == c4011d) {
                InterfaceC6082a interfaceC6082a = this.f34282a;
                AbstractC4862t.b(interfaceC6082a);
                objInvoke = interfaceC6082a.invoke();
                this.f34283b = objInvoke;
                this.f34282a = null;
            }
        }
        return objInvoke;
    }

    @Override // fc.InterfaceC4028k
    public boolean isInitialized() {
        return this.f34283b != C4011D.f34248a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C4038u(InterfaceC6082a interfaceC6082a, Object obj, int i10, AbstractC4854k abstractC4854k) {
        this(interfaceC6082a, (i10 & 2) != 0 ? null : obj);
    }
}
