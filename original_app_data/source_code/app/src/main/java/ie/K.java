package ie;

import he.AbstractC4304b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class K {
    public static final J a(AbstractC4304b json, String source) {
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(source, "source");
        return !json.c().a() ? new J(source) : new L(source);
    }
}
