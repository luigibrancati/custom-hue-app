package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22805a;

    public f0(K k10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f22805a = null;
    }

    public C2715v a() {
        return new C2715v(getMessage());
    }
}
