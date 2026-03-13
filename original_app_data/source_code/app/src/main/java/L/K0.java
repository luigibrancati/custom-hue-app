package L;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f7908a = new HashSet();

    public void a(List list) {
        this.f7908a.addAll(list);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract K0 clone();

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f7908a));
    }
}
