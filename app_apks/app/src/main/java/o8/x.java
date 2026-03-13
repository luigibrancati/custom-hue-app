package o8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class x implements O8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f41300b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f41299a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection collection) {
        this.f41299a.addAll(collection);
    }

    public static x b(Collection collection) {
        return new x((Set) collection);
    }

    public synchronized void a(O8.b bVar) {
        try {
            if (this.f41300b == null) {
                this.f41299a.add(bVar);
            } else {
                this.f41300b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O8.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f41300b == null) {
            synchronized (this) {
                try {
                    if (this.f41300b == null) {
                        this.f41300b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f41300b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f41299a.iterator();
            while (it.hasNext()) {
                this.f41300b.add(((O8.b) it.next()).get());
            }
            this.f41299a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
