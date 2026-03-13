package E3;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import fc.C4015H;
import gc.C4206t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.l;
import z3.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f3248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.d f3249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f3250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f3251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f3252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f3253f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements l {
        public a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public final void i(WindowLayoutInfo p02) {
            AbstractC4862t.e(p02, "p0");
            ((MulticastConsumer) this.receiver).accept(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((WindowLayoutInfo) obj);
            return C4015H.f34254a;
        }
    }

    public d(WindowLayoutComponent component, z3.d consumerAdapter) {
        AbstractC4862t.e(component, "component");
        AbstractC4862t.e(consumerAdapter, "consumerAdapter");
        this.f3248a = component;
        this.f3249b = consumerAdapter;
        this.f3250c = new ReentrantLock();
        this.f3251d = new LinkedHashMap();
        this.f3252e = new LinkedHashMap();
        this.f3253f = new LinkedHashMap();
    }

    @Override // E3.c, D3.a
    public void a(X0.a callback) {
        AbstractC4862t.e(callback, "callback");
        ReentrantLock reentrantLock = this.f3250c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f3252e.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f3251d.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            this.f3252e.remove(callback);
            if (multicastConsumer.b()) {
                this.f3251d.remove(context);
                d.b bVar = (d.b) this.f3253f.remove(multicastConsumer);
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // E3.c, D3.a
    public void b(Context context, Executor executor, X0.a callback) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(callback, "callback");
        ReentrantLock reentrantLock = this.f3250c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f3251d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.f3252e.put(callback, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f3251d.put(context, multicastConsumer2);
                this.f3252e.put(callback, context);
                multicastConsumer2.a(callback);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(C4206t.k()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f3253f.put(multicastConsumer2, this.f3249b.c(this.f3248a, M.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final WindowLayoutComponent e() {
        return this.f3248a;
    }
}
