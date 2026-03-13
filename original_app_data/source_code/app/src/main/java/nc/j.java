package nc;

import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends AbstractC5157a {
    public j(InterfaceC4988e interfaceC4988e) {
        super(interfaceC4988e);
        if (interfaceC4988e != null && interfaceC4988e.getContext() != C4993j.f40088a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return C4993j.f40088a;
    }
}
