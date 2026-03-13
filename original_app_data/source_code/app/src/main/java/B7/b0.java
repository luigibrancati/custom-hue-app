package B7;

import java.util.HashSet;
import java.util.Set;
import v7.InterfaceC6071a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f718a = new HashSet();

    public final synchronized void a(InterfaceC6071a interfaceC6071a) {
        this.f718a.add(interfaceC6071a);
    }

    public final synchronized void b(InterfaceC6071a interfaceC6071a) {
        this.f718a.remove(interfaceC6071a);
    }
}
