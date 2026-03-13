package Z9;

import O6.C1704k5;
import R9.AbstractC2108f;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.y;
import b7.C2868b;
import b7.InterfaceC2873g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.AbstractC6056k;
import v6.C6051f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Closeable, InterfaceC2757m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C6051f f20415f = new C6051f("MobileVisionBase", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20416a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2108f f20417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2868b f20418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f20419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Task f20420e;

    public e(AbstractC2108f abstractC2108f, Executor executor) {
        this.f20417b = abstractC2108f;
        C2868b c2868b = new C2868b();
        this.f20418c = c2868b;
        this.f20419d = executor;
        abstractC2108f.c();
        this.f20420e = abstractC2108f.a(executor, new Callable() { // from class: Z9.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6051f c6051f = e.f20415f;
                return null;
            }
        }, c2868b.b()).e(new InterfaceC2873g() { // from class: Z9.h
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                e.f20415f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    public synchronized Task b(final Y9.a aVar) {
        AbstractC6056k.m(aVar, "InputImage can not be null");
        if (this.f20416a.get()) {
            return Tasks.d(new N9.a("This detector is already closed!", 14));
        }
        if (aVar.l() < 32 || aVar.h() < 32) {
            return Tasks.d(new N9.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f20417b.a(this.f20419d, new Callable() { // from class: Z9.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20421a.c(aVar);
            }
        }, this.f20418c.b());
    }

    public final /* synthetic */ Object c(Y9.a aVar) {
        C1704k5 c1704k5F = C1704k5.f("detectorTaskWithResource#run");
        c1704k5F.b();
        try {
            Object objI = this.f20417b.i(aVar);
            c1704k5F.close();
            return objI;
        } catch (Throwable th) {
            try {
                c1704k5F.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, T9.a
    @y(AbstractC2754j.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f20416a.getAndSet(true)) {
            return;
        }
        this.f20418c.a();
        this.f20417b.e(this.f20419d);
    }
}
