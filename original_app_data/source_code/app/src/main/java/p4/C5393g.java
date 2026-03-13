package p4;

import fc.C4015H;
import gc.C4179C;
import gc.Q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC4862t;
import p4.InterfaceC5392f;
import vc.l;

/* JADX INFO: renamed from: p4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5393g implements InterfaceC5392f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f42194a = new ReentrantReadWriteLock(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5391e f42195b = new C5391e(null, null, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42196c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f42197d = new LinkedHashSet();

    /* JADX INFO: renamed from: p4.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC5392f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map f42200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C5391e f42201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C5393g f42202e;

        public a(C5391e c5391e, C5393g c5393g) {
            this.f42201d = c5391e;
            this.f42202e = c5393g;
            this.f42198a = c5391e.b();
            this.f42199b = c5391e.a();
            this.f42200c = c5391e.c();
        }

        @Override // p4.InterfaceC5392f.a
        public InterfaceC5392f.a a(String str) {
            this.f42198a = str;
            return this;
        }

        @Override // p4.InterfaceC5392f.a
        public InterfaceC5392f.a b(String str) {
            this.f42199b = str;
            return this;
        }

        @Override // p4.InterfaceC5392f.a
        public InterfaceC5392f.a c(Map actions) {
            AbstractC4862t.e(actions, "actions");
            Map mapW = Q.w(this.f42200c);
            for (Map.Entry entry : actions.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                int iHashCode = str.hashCode();
                if (iHashCode != 1186238) {
                    if (iHashCode != 146417720) {
                        if (iHashCode == 1142092165 && str.equals("$unset")) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                mapW.remove(((Map.Entry) it.next()).getKey());
                            }
                        }
                    } else if (str.equals("$clearAll")) {
                        mapW.clear();
                    }
                } else if (str.equals("$set")) {
                    mapW.putAll(map);
                }
            }
            this.f42200c = mapW;
            return this;
        }

        @Override // p4.InterfaceC5392f.a
        public void commit() {
            this.f42202e.b(new C5391e(this.f42198a, this.f42199b, this.f42200c));
        }
    }

    @Override // p4.InterfaceC5392f
    public InterfaceC5392f.a a() {
        return new a(c(), this);
    }

    /* JADX WARN: Finally extract failed */
    @Override // p4.InterfaceC5392f
    public void b(C5391e identity) {
        Set setZ0;
        AbstractC4862t.e(identity, "identity");
        C5391e c5391eC = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f42194a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f42195b = identity;
            C4015H c4015h = C4015H.f34254a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            if (AbstractC4862t.a(identity, c5391eC)) {
                return;
            }
            synchronized (this.f42196c) {
                setZ0 = C4179C.Z0(this.f42197d);
            }
            Iterator it = setZ0.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(identity);
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

    public C5391e c() {
        ReentrantReadWriteLock.ReadLock lock = this.f42194a.readLock();
        lock.lock();
        try {
            return this.f42195b;
        } finally {
            lock.unlock();
        }
    }
}
