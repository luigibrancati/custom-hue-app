package F4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f3751a;

    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(f plugin) {
        AbstractC4862t.e(plugin, "plugin");
        this.f3751a.add(plugin);
    }

    public final void b(l closure) {
        AbstractC4862t.e(closure, "closure");
        for (f fVar : this.f3751a) {
            AbstractC4862t.b(fVar);
            closure.invoke(fVar);
        }
    }

    public final E4.a c(E4.a event) {
        AbstractC4862t.e(event, "event");
        for (f fVar : this.f3751a) {
            if (event != null) {
                if (fVar instanceof a) {
                    try {
                        ((a) fVar).j(event);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (fVar instanceof c) {
                    event = fVar.g(event);
                    if (event instanceof E4.d) {
                        AbstractC4862t.c(event, "null cannot be cast to non-null type com.amplitude.core.events.IdentifyEvent");
                        event = ((c) fVar).c((E4.d) event);
                    } else if (event instanceof E4.c) {
                        AbstractC4862t.c(event, "null cannot be cast to non-null type com.amplitude.core.events.GroupIdentifyEvent");
                        event = ((c) fVar).f((E4.c) event);
                    } else if (event instanceof E4.h) {
                        AbstractC4862t.c(event, "null cannot be cast to non-null type com.amplitude.core.events.RevenueEvent");
                        event = ((c) fVar).d((E4.h) event);
                    } else if (event != null) {
                        AbstractC4862t.c(event, "null cannot be cast to non-null type com.amplitude.core.events.BaseEvent");
                        event = ((c) fVar).b(event);
                    }
                } else {
                    event = fVar.g(event);
                }
            }
        }
        return event;
    }

    public d(CopyOnWriteArrayList plugins) {
        AbstractC4862t.e(plugins, "plugins");
        this.f3751a = plugins;
    }

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }
}
