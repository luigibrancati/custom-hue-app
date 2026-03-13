package X6;

import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.q6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2475q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.e f19174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19175b;

    public C2475q6(B6.e eVar) {
        AbstractC6056k.l(eVar);
        this.f19174a = eVar;
    }

    public final void a() {
        this.f19175b = this.f19174a.c();
    }

    public final void b() {
        this.f19175b = 0L;
    }

    public final boolean c(long j10) {
        return this.f19175b == 0 || this.f19174a.c() - this.f19175b >= 3600000;
    }
}
