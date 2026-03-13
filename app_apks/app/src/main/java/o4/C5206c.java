package o4;

import F4.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: o4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5206c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f41166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D4.a f41167c;

    public C5206c(String library) {
        AbstractC4862t.e(library, "library");
        this.f41165a = library;
        this.f41166b = f.a.Enrichment;
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f41167c = aVar;
    }

    @Override // F4.f
    public void e(D4.a aVar) {
        super.e(aVar);
    }

    @Override // F4.f
    public E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        if (event.x() == null) {
            event.m0(this.f41165a);
        } else {
            event.m0(this.f41165a + '_' + event.x());
        }
        return super.g(event);
    }

    @Override // F4.f
    public f.a getType() {
        return this.f41166b;
    }
}
