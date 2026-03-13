package Rd;

import Wd.AbstractC2330j;
import java.util.concurrent.Executor;
import lc.C4993j;

/* JADX INFO: renamed from: Rd.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC2121c0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f15163a;

    public ExecutorC2121c0(I i10) {
        this.f15163a = i10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        I i10 = this.f15163a;
        C4993j c4993j = C4993j.f40088a;
        if (AbstractC2330j.d(i10, c4993j)) {
            AbstractC2330j.c(this.f15163a, c4993j, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f15163a.toString();
    }
}
