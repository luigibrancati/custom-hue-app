package w8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46373a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46374b;

    public k(int i10) {
        this.f46374b = i10;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(((j) listB.get(i10)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f46373a));
    }

    public synchronized boolean c(List list) {
        this.f46373a.clear();
        if (list.size() <= this.f46374b) {
            return this.f46373a.addAll(list);
        }
        r8.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f46374b);
        return this.f46373a.addAll(list.subList(0, this.f46374b));
    }
}
