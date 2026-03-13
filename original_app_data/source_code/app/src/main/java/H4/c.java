package H4;

import F4.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f5316a = f.a.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f5317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L4.b f5318c;

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f5317b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        this.f5318c = L4.d.f8570b.a(amplitude.l().l()).c();
    }

    @Override // F4.f
    public E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        if (event.I0() != null) {
            L4.b bVar = this.f5318c;
            if (bVar == null) {
                AbstractC4862t.p("eventBridge");
                bVar = null;
            }
            bVar.a(L4.f.IDENTIFY, d.a(event));
        }
        return event;
    }

    @Override // F4.f
    public f.a getType() {
        return this.f5316a;
    }
}
