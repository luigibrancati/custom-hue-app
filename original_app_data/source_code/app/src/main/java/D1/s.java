package D1;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f1994a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f1995b = "media3.common";

    public static synchronized void a(String str) {
        if (f1994a.add(str)) {
            f1995b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f1995b;
    }
}
