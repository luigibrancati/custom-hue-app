package K4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    void a(k kVar, Object obj, String str);

    boolean b(c cVar, Object obj, String str);

    void c(l lVar, Object obj, String str);

    void d(d dVar, Object obj, String str);

    default Boolean e(b response, Object events, String eventsString) {
        AbstractC4862t.e(response, "response");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        if (response instanceof j) {
            g((j) response, events, eventsString);
            return null;
        }
        if (response instanceof c) {
            return Boolean.valueOf(b((c) response, events, eventsString));
        }
        if (response instanceof h) {
            f((h) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof l) {
            c((l) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof k) {
            a((k) response, events, eventsString);
            return Boolean.TRUE;
        }
        d((d) response, events, eventsString);
        return Boolean.TRUE;
    }

    void f(h hVar, Object obj, String str);

    void g(j jVar, Object obj, String str);
}
