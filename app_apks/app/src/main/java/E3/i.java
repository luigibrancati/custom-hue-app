package E3;

import C3.s;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import fc.C4015H;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements X0.a, Consumer2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f3259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f3260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3261d;

    public i(Context context) {
        AbstractC4862t.e(context, "context");
        this.f3258a = context;
        this.f3259b = new ReentrantLock();
        this.f3261d = new LinkedHashSet();
    }

    @Override // X0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo value) {
        AbstractC4862t.e(value, "value");
        ReentrantLock reentrantLock = this.f3259b;
        reentrantLock.lock();
        try {
            s sVarC = h.f3257a.c(this.f3258a, value);
            this.f3260c = sVarC;
            Iterator it = this.f3261d.iterator();
            while (it.hasNext()) {
                ((X0.a) it.next()).accept(sVarC);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        ReentrantLock reentrantLock = this.f3259b;
        reentrantLock.lock();
        try {
            s sVar = this.f3260c;
            if (sVar != null) {
                listener.accept(sVar);
            }
            this.f3261d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f3261d.isEmpty();
    }

    public final void d(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        ReentrantLock reentrantLock = this.f3259b;
        reentrantLock.lock();
        try {
            this.f3261d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
