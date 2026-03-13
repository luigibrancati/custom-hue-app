package L;

import E.InterfaceC0811s;
import E.InterfaceC0815u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class B0 implements InterfaceC0811s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7886b;

    public B0(int i10) {
        this.f7886b = i10;
    }

    @Override // E.InterfaceC0811s
    public List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0815u interfaceC0815u = (InterfaceC0815u) it.next();
            X0.h.b(interfaceC0815u instanceof I, "The camera info doesn't contain internal implementation.");
            if (interfaceC0815u.f() == this.f7886b) {
                arrayList.add(interfaceC0815u);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f7886b;
    }
}
