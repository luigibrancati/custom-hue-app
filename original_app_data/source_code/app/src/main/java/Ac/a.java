package Ac;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC4862t;
import zc.AbstractC6556a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC6556a {
    @Override // zc.AbstractC6558c
    public int e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // zc.AbstractC6558c
    public long g(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // zc.AbstractC6556a
    public Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC4862t.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
