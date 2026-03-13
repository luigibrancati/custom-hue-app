package o8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41290a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f41290a = list;
    }
}
