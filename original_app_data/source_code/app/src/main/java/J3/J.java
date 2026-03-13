package J3;

import I3.AbstractC0890u;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5972b;

    static {
        String strI = AbstractC0890u.i("WrkDbPathHelper");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f5971a = strI;
        f5972b = new String[]{"-journal", "-shm", "-wal"};
    }
}
