package O1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f10761f;

    public a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f10756a = j10;
        this.f10757b = i10;
        this.f10758c = Collections.unmodifiableList(list);
        this.f10759d = Collections.unmodifiableList(list2);
        this.f10760e = Collections.unmodifiableList(list3);
        this.f10761f = Collections.unmodifiableList(list4);
    }
}
