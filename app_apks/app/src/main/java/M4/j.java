package M4;

import M4.i;
import fc.C4015H;
import gc.C4179C;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock f9287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f9288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f9290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9291f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f9294c;

        public a(e eVar, j jVar) {
            this.f9294c = jVar;
            this.f9292a = eVar.b();
            this.f9293b = eVar.a();
        }

        @Override // M4.i.a
        public i.a a(String str) {
            this.f9292a = str;
            return this;
        }

        @Override // M4.i.a
        public i.a b(String str) {
            this.f9293b = str;
            return this;
        }

        @Override // M4.i.a
        public void commit() {
            i.d(this.f9294c, new e(this.f9292a, this.f9293b), null, 2, null);
        }
    }

    public j(k identityStorage) {
        AbstractC4862t.e(identityStorage, "identityStorage");
        this.f9286a = identityStorage;
        this.f9287b = new ReentrantReadWriteLock(true);
        this.f9288c = new e(null, null, 3, null);
        this.f9289d = new Object();
        this.f9290e = new LinkedHashSet();
        b(identityStorage.load(), m.Initialized);
    }

    @Override // M4.i
    public i.a a() {
        return new a(c(), this);
    }

    @Override // M4.i
    public void b(e identity, m updateType) {
        Set<h> setZ0;
        AbstractC4862t.e(identity, "identity");
        AbstractC4862t.e(updateType, "updateType");
        e eVarC = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f9287b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f9288c = identity;
            if (updateType == m.Initialized) {
                this.f9291f = true;
            }
            C4015H c4015h = C4015H.f34254a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            if (AbstractC4862t.a(identity, eVarC)) {
                return;
            }
            synchronized (this.f9289d) {
                setZ0 = C4179C.Z0(this.f9290e);
            }
            if (updateType != m.Initialized) {
                if (!AbstractC4862t.a(identity.b(), eVarC.b())) {
                    this.f9286a.a(identity.b());
                }
                if (!AbstractC4862t.a(identity.a(), eVarC.a())) {
                    this.f9286a.b(identity.a());
                }
            }
            for (h hVar : setZ0) {
                if (!AbstractC4862t.a(identity.b(), eVarC.b())) {
                    hVar.c(identity.b());
                }
                if (!AbstractC4862t.a(identity.a(), eVarC.a())) {
                    hVar.a(identity.a());
                }
                hVar.b(identity, updateType);
            }
        } catch (Throwable th) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // M4.i
    public e c() {
        ReentrantReadWriteLock.ReadLock lock = this.f9287b.readLock();
        lock.lock();
        try {
            return this.f9288c;
        } finally {
            lock.unlock();
        }
    }

    @Override // M4.i
    public void e(h listener) {
        AbstractC4862t.e(listener, "listener");
        synchronized (this.f9289d) {
            this.f9290e.add(listener);
        }
    }

    @Override // M4.i
    public boolean isInitialized() {
        return this.f9291f;
    }
}
