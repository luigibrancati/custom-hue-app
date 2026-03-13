package zc;

import java.util.Random;

/* JADX INFO: renamed from: zc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6556a extends AbstractC6558c {
    @Override // zc.AbstractC6558c
    public int b(int i10) {
        return AbstractC6559d.f(h().nextInt(), i10);
    }

    @Override // zc.AbstractC6558c
    public int c() {
        return h().nextInt();
    }

    @Override // zc.AbstractC6558c
    public int d(int i10) {
        return h().nextInt(i10);
    }

    @Override // zc.AbstractC6558c
    public long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
