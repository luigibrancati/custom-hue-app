package B0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f559c = f.I();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f560d;

        public void a(Runnable runnable, Executor executor) {
            f fVar = this.f559c;
            if (fVar != null) {
                fVar.b(runnable, executor);
            }
        }

        public void b() {
            this.f557a = null;
            this.f558b = null;
            this.f559c.E(null);
        }

        public boolean c(Object obj) {
            this.f560d = true;
            d dVar = this.f558b;
            boolean z10 = dVar != null && dVar.d(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f560d = true;
            d dVar = this.f558b;
            boolean z10 = dVar != null && dVar.c(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f557a = null;
            this.f558b = null;
            this.f559c = null;
        }

        public boolean f(Throwable th) {
            this.f560d = true;
            d dVar = this.f558b;
            boolean z10 = dVar != null && dVar.e(th);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            f fVar;
            d dVar = this.f558b;
            if (dVar != null && !dVar.isDone()) {
                dVar.e(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f557a));
            }
            if (this.f560d || (fVar = this.f559c) == null) {
                return;
            }
            fVar.E(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: B0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0018c {
        Object a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements O7.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B0.a f562b = new a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends B0.a {
            public a() {
            }

            @Override // B0.a
            public String B() {
                a aVar = (a) d.this.f561a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f557a + "]";
            }
        }

        public d(a aVar) {
            this.f561a = new WeakReference(aVar);
        }

        @Override // O7.e
        public void b(Runnable runnable, Executor executor) {
            this.f562b.b(runnable, executor);
        }

        public boolean c(boolean z10) {
            return this.f562b.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f561a.get();
            boolean zCancel = this.f562b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        public boolean d(Object obj) {
            return this.f562b.E(obj);
        }

        public boolean e(Throwable th) {
            return this.f562b.F(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f562b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f562b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f562b.isDone();
        }

        public String toString() {
            return this.f562b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f562b.get(j10, timeUnit);
        }
    }

    public static O7.e a(InterfaceC0018c interfaceC0018c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f558b = dVar;
        aVar.f557a = interfaceC0018c.getClass();
        try {
            Object objA = interfaceC0018c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f557a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.e(e10);
            return dVar;
        }
    }
}
