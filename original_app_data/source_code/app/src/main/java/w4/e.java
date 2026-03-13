package w4;

import M4.k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f46184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f46185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A4.a f46186c;

    public e(k source, k destination, A4.a logger) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(destination, "destination");
        AbstractC4862t.e(logger, "logger");
        this.f46184a = source;
        this.f46185b = destination;
        this.f46186c = logger;
    }

    public final void a() {
        try {
            M4.e eVarLoad = this.f46184a.load();
            this.f46186c.a("Loaded old identity: " + eVarLoad);
            if (eVarLoad.b() != null) {
                this.f46185b.a(eVarLoad.b());
            }
            if (eVarLoad.a() != null) {
                this.f46185b.b(eVarLoad.a());
            }
        } catch (Exception e10) {
            this.f46186c.d("Unable to migrate file identity storage: " + e10.getMessage());
        }
    }
}
