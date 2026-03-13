package rb;

import cb.C3091b;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f43968a = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f43969b = new p();

    public float a() {
        return this.f43968a;
    }

    public p b() {
        return new p(this.f43969b);
    }

    public C3091b c() {
        return AbstractC6555a.s(b());
    }

    public void d(float f10) {
        this.f43968a = f10;
    }

    public void e(p pVar) {
        k.d(pVar, "Parameter \"point\" was null.");
        this.f43969b.p(pVar);
    }
}
