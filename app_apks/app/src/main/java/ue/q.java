package ue;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import pe.E;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f45689a = new LinkedHashSet();

    public final synchronized void a(E route) {
        AbstractC4862t.e(route, "route");
        this.f45689a.remove(route);
    }

    public final synchronized void b(E failedRoute) {
        AbstractC4862t.e(failedRoute, "failedRoute");
        this.f45689a.add(failedRoute);
    }

    public final synchronized boolean c(E route) {
        AbstractC4862t.e(route, "route");
        return this.f45689a.contains(route);
    }
}
