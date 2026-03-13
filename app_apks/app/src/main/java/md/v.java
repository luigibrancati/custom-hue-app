package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class v extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40389a;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f40389a = null;
    }

    public k a() {
        return new k(getMessage());
    }
}
