package K4;

import J4.p;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JSONObject response) {
        super(g.FAILED, null);
        AbstractC4862t.e(response, "response");
        this.f7457c = p.c(response, "error", "");
    }

    public final String b() {
        return this.f7457c;
    }
}
