package R3;

import I3.AbstractC0890u;
import J3.C0910s;
import J3.C0916y;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0910s f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0916y f14555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14557d;

    public y(C0910s processor, C0916y token, boolean z10, int i10) {
        AbstractC4862t.e(processor, "processor");
        AbstractC4862t.e(token, "token");
        this.f14554a = processor;
        this.f14555b = token;
        this.f14556c = z10;
        this.f14557d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR = this.f14556c ? this.f14554a.r(this.f14555b, this.f14557d) : this.f14554a.s(this.f14555b, this.f14557d);
        AbstractC0890u.e().a(AbstractC0890u.i("StopWorkRunnable"), "StopWorkRunnable for " + this.f14555b.a().b() + "; Processor.stopWork = " + zR);
    }
}
