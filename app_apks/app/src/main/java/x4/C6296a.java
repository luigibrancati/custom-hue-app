package x4;

import kotlin.jvm.internal.AbstractC4862t;
import p4.C5387a;
import p4.C5391e;

/* JADX INFO: renamed from: x4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6296a extends F4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f47437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5387a f47438c;

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f47437b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        C5387a c5387aA = C5387a.f42183c.a(amplitude.l().l());
        this.f47438c = c5387aA;
        if (c5387aA == null) {
            AbstractC4862t.p("connector");
            c5387aA = null;
        }
        c5387aA.d().b(new C5391e(amplitude.w().c(), amplitude.w().b(), null, 4, null));
    }

    @Override // F4.e
    public void h(String str) {
        C5387a c5387a = this.f47438c;
        if (c5387a == null) {
            AbstractC4862t.p("connector");
            c5387a = null;
        }
        c5387a.d().a().b(str).commit();
    }

    @Override // F4.e
    public void i(String str) {
        C5387a c5387a = this.f47438c;
        if (c5387a == null) {
            AbstractC4862t.p("connector");
            c5387a = null;
        }
        c5387a.d().a().a(str).commit();
    }
}
