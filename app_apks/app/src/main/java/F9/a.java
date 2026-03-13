package F9;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f3769a = new ReentrantReadWriteLock();

    @Override // F9.b
    public void lock() {
        this.f3769a.writeLock().lock();
    }

    @Override // F9.b
    public void unlock() {
        this.f3769a.writeLock().unlock();
    }
}
