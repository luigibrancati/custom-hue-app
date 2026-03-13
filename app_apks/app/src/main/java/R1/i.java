package R1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14422c;

    public i(String str, List list, boolean z10) {
        this.f14420a = str;
        this.f14421b = Collections.unmodifiableList(list);
        this.f14422c = z10;
    }
}
