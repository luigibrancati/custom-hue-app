package c3;

import fc.C4025h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2940b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25583c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f25584d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f25585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2941c f25586b;

    /* JADX INFO: renamed from: c3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C2941c c(String str) {
            return new C2941c(str);
        }

        public final ReentrantLock d(String str) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    Map map = C2940b.f25584d;
                    Object reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = (ReentrantLock) reentrantLock2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return reentrantLock;
        }

        public a() {
        }
    }

    public C2940b(String filename, boolean z10) {
        AbstractC4862t.e(filename, "filename");
        a aVar = f25583c;
        this.f25585a = aVar.d(filename);
        this.f25586b = z10 ? aVar.c(filename) : null;
    }

    public final Object b(InterfaceC6082a onLocked, l onLockError) {
        AbstractC4862t.e(onLocked, "onLocked");
        AbstractC4862t.e(onLockError, "onLockError");
        this.f25585a.lock();
        boolean z10 = false;
        try {
            C2941c c2941c = this.f25586b;
            if (c2941c != null) {
                c2941c.a();
            }
            z10 = true;
            try {
                Object objInvoke = onLocked.invoke();
                this.f25585a.unlock();
                return objInvoke;
            } finally {
                C2941c c2941c2 = this.f25586b;
                if (c2941c2 != null) {
                    c2941c2.b();
                }
            }
        } catch (Throwable th) {
            try {
                if (z10) {
                    throw th;
                }
                onLockError.invoke(th);
                throw new C4025h();
            } catch (Throwable th2) {
                this.f25585a.unlock();
                throw th2;
            }
        }
    }
}
