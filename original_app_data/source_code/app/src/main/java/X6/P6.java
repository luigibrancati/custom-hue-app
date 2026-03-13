package X6;

import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R6 f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18475b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18476c = d();

    public P6(R6 r62) {
        this.f18474a = r62;
    }

    public final void a() {
        this.f18475b++;
        this.f18476c = d();
    }

    public final boolean b() {
        return this.f18474a.e().a() >= this.f18476c;
    }

    public final /* synthetic */ long c() {
        return this.f18476c;
    }

    public final long d() {
        R6 r62 = this.f18474a;
        AbstractC6056k.l(r62);
        long jLongValue = ((Long) AbstractC2383f2.f18923v.b(null)).longValue();
        long jLongValue2 = ((Long) AbstractC2383f2.f18925w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f18475b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return r62.e().a() + Math.min(jLongValue, jLongValue2);
    }
}
