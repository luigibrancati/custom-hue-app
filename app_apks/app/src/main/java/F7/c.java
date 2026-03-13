package F7;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import rb.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3766a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3767b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3768c = new HashMap();

    public CompletableFuture b(Object obj) {
        k.d(obj, "Parameter 'id' was null.");
        synchronized (this.f3766a) {
            try {
                WeakReference weakReference = (WeakReference) this.f3767b.get(obj);
                if (weakReference != null) {
                    Object obj2 = weakReference.get();
                    if (obj2 != null) {
                        return CompletableFuture.completedFuture(obj2);
                    }
                    this.f3767b.remove(obj);
                }
                return (CompletableFuture) this.f3768c.get(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Void c(Object obj, CompletableFuture completableFuture, Object obj2, Throwable th) {
        synchronized (this) {
            synchronized (this.f3766a) {
                try {
                    if (((CompletableFuture) this.f3768c.get(obj)) == completableFuture) {
                        this.f3768c.remove(obj);
                        if (th == null) {
                            this.f3767b.put(obj, new WeakReference(obj2));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    public void d(final Object obj, final CompletableFuture completableFuture) {
        k.d(obj, "Parameter 'id' was null.");
        k.d(completableFuture, "Parameter 'futureResource' was null.");
        if (!completableFuture.isDone()) {
            synchronized (this.f3766a) {
                this.f3768c.put(obj, completableFuture);
                this.f3767b.remove(obj);
            }
            completableFuture.handle(new BiFunction() { // from class: F7.b
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return this.f3763a.c(obj, completableFuture, obj2, (Throwable) obj3);
                }
            });
            return;
        }
        if (completableFuture.isCompletedExceptionally()) {
            return;
        }
        Object objC = k.c(completableFuture.getNow(null));
        synchronized (this.f3766a) {
            this.f3767b.put(obj, new WeakReference(objC));
            this.f3768c.remove(obj);
        }
    }
}
