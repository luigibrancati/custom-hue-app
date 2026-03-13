package nc;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: nc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5160d extends AbstractC5157a {
    private final InterfaceC4992i _context;
    private transient InterfaceC4988e intercepted;

    public AbstractC5160d(InterfaceC4988e interfaceC4988e, InterfaceC4992i interfaceC4992i) {
        super(interfaceC4988e);
        this._context = interfaceC4992i;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        InterfaceC4992i interfaceC4992i = this._context;
        AbstractC4862t.b(interfaceC4992i);
        return interfaceC4992i;
    }

    public final InterfaceC4988e intercepted() {
        InterfaceC4988e interfaceC4988eG0 = this.intercepted;
        if (interfaceC4988eG0 == null) {
            InterfaceC4989f interfaceC4989f = (InterfaceC4989f) getContext().get(InterfaceC4989f.f40086j0);
            if (interfaceC4989f == null || (interfaceC4988eG0 = interfaceC4989f.g0(this)) == null) {
                interfaceC4988eG0 = this;
            }
            this.intercepted = interfaceC4988eG0;
        }
        return interfaceC4988eG0;
    }

    @Override // nc.AbstractC5157a
    public void releaseIntercepted() {
        InterfaceC4988e interfaceC4988e = this.intercepted;
        if (interfaceC4988e != null && interfaceC4988e != this) {
            InterfaceC4992i.b bVar = getContext().get(InterfaceC4989f.f40086j0);
            AbstractC4862t.b(bVar);
            ((InterfaceC4989f) bVar).o(interfaceC4988e);
        }
        this.intercepted = C5159c.f40766a;
    }

    public AbstractC5160d(InterfaceC4988e interfaceC4988e) {
        this(interfaceC4988e, interfaceC4988e != null ? interfaceC4988e.getContext() : null);
    }
}
