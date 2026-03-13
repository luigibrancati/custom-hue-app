package mb;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: renamed from: mb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5038c {
    public static final void a(Session session, l config) {
        AbstractC4862t.e(session, "<this>");
        AbstractC4862t.e(config, "config");
        Config config2 = session.getConfig();
        AbstractC4862t.d(config2, "getConfig(...)");
        config.invoke(config2);
        session.configure(config2);
    }
}
