package x3;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f47355c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47357b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends i {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends i {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public i(String str, String str2) {
        this.f47356a = str;
        this.f47357b = str2;
        f47355c.add(this);
    }
}
