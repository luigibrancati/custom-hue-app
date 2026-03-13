package L4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8574a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8575b = new LinkedHashMap();

    @Override // L4.b
    public void a(f channel, a event) {
        c cVar;
        AbstractC4862t.e(channel, "channel");
        AbstractC4862t.e(event, "event");
        synchronized (this.f8574a) {
            try {
                Map map = this.f8575b;
                Object cVar2 = map.get(channel);
                if (cVar2 == null) {
                    cVar2 = new c(channel);
                    map.put(channel, cVar2);
                }
                cVar = (c) cVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        cVar.a(event);
    }
}
