package W3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17823a;

    public f(int i10) {
        this.f17823a = new ArrayList(i10);
    }

    public static f c(int i10) {
        return new f(i10);
    }

    public f a(Object obj) {
        this.f17823a.add(e.c(obj, "Set contributions cannot be null"));
        return this;
    }

    public Set b() {
        return this.f17823a.isEmpty() ? Collections.EMPTY_SET : this.f17823a.size() == 1 ? Collections.singleton(this.f17823a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f17823a));
    }
}
