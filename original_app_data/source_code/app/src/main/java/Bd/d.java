package Bd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f813b;

    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Lock a() {
        return this.f813b;
    }

    @Override // Bd.k
    public void lock() {
        this.f813b.lock();
    }

    @Override // Bd.k
    public void unlock() {
        this.f813b.unlock();
    }

    public d(Lock lock) {
        AbstractC4862t.e(lock, "lock");
        this.f813b = lock;
    }

    public /* synthetic */ d(Lock lock, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
