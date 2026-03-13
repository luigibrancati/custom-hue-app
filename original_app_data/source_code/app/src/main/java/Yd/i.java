package Yd;

import Rd.Q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f20063c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f20063c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20063c.run();
    }

    public String toString() {
        return "Task[" + Q.a(this.f20063c) + '@' + Q.b(this.f20063c) + ", " + this.f20061a + ", " + j.c(this.f20062b) + ']';
    }
}
