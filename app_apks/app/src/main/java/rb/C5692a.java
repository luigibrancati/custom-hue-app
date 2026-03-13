package rb;

import android.util.Log;

/* JADX INFO: renamed from: rb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5692a extends AbstractC5695d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43938e = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f43939b = p.x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f43940c = p.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f43941d = new j();

    public C5692a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        if ((r0 + r5.f43972c) >= 0.0f) goto L44;
     */
    @Override // rb.AbstractC5695d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(rb.m r18, rb.n r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.C5692a.d(rb.m, rb.n):boolean");
    }

    @Override // rb.AbstractC5695d
    public AbstractC5695d e(o oVar) {
        k.d(oVar, "Parameter \"transformProvider\" was null.");
        C5692a c5692a = new C5692a();
        f(oVar, c5692a);
        return c5692a;
    }

    @Override // rb.AbstractC5695d
    public void f(o oVar, AbstractC5695d abstractC5695d) {
        k.d(oVar, "Parameter \"transformProvider\" was null.");
        k.d(abstractC5695d, "Parameter \"result\" was null.");
        if (!(abstractC5695d instanceof C5692a)) {
            Log.w(f43938e, "Cannot pass CollisionShape of a type other than Box into Box.transform.");
            return;
        }
        if (abstractC5695d == this) {
            throw new IllegalArgumentException("Box cannot transform itself.");
        }
        C5692a c5692a = (C5692a) abstractC5695d;
        j jVarP = oVar.p();
        c5692a.f43939b.p(jVarP.h(this.f43939b));
        p pVar = new p();
        jVarP.b(pVar);
        p pVar2 = c5692a.f43940c;
        p pVar3 = this.f43940c;
        pVar2.f43970a = pVar3.f43970a * pVar.f43970a;
        pVar2.f43971b = pVar3.f43971b * pVar.f43971b;
        pVar2.f43972c = pVar3.f43972c * pVar.f43972c;
        jVarP.a(pVar, c5692a.f43941d);
        j jVar = this.f43941d;
        j jVar2 = c5692a.f43941d;
        j.e(jVar, jVar2, jVar2);
    }

    public p g() {
        return new p(this.f43939b);
    }

    public p h() {
        return i().n(0.5f);
    }

    public p i() {
        return new p(this.f43940c);
    }

    @Override // rb.AbstractC5695d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5692a b() {
        return new C5692a(i(), g());
    }

    public void k(p pVar) {
        k.d(pVar, "Parameter \"center\" was null.");
        this.f43939b.p(pVar);
        c();
    }

    public void l(p pVar) {
        k.d(pVar, "Parameter \"size\" was null.");
        this.f43940c.p(pVar);
        c();
    }

    public C5692a(p pVar, p pVar2) {
        k.d(pVar2, "Parameter \"center\" was null.");
        k.d(pVar, "Parameter \"size\" was null.");
        k(pVar2);
        l(pVar);
    }
}
