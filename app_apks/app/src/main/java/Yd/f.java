package Yd;

import Rd.AbstractC2149q0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4854k;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends AbstractC2149q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f20060g;

    public f() {
        this(0, 0, 0L, null, 15, null);
    }

    @Override // Rd.AbstractC2149q0
    public Executor J0() {
        return this.f20060g;
    }

    public final a M0() {
        return new a(this.f20056c, this.f20057d, this.f20058e, this.f20059f);
    }

    public final void Q0(Runnable runnable, boolean z10, boolean z11) {
        this.f20060g.h(runnable, z10, z11);
    }

    public void close() throws InterruptedException {
        this.f20060g.close();
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        a.i(this.f20060g, runnable, false, false, 6, null);
    }

    @Override // Rd.I
    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        a.i(this.f20060g, runnable, false, true, 2, null);
    }

    public /* synthetic */ f(int i10, int i11, long j10, String str, int i12, AbstractC4854k abstractC4854k) {
        this((i12 & 1) != 0 ? j.f20066c : i10, (i12 & 2) != 0 ? j.f20067d : i11, (i12 & 4) != 0 ? j.f20068e : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public f(int i10, int i11, long j10, String str) {
        this.f20056c = i10;
        this.f20057d = i11;
        this.f20058e = j10;
        this.f20059f = str;
        this.f20060g = M0();
    }
}
