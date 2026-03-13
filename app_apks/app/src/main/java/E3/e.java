package E3;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fc.C4015H;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f3254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f3255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f3256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WindowLayoutComponent component, z3.d adapter) {
        super(component, adapter);
        AbstractC4862t.e(component, "component");
        AbstractC4862t.e(adapter, "adapter");
        this.f3254g = new ReentrantLock();
        this.f3255h = new LinkedHashMap();
        this.f3256i = new LinkedHashMap();
    }

    @Override // E3.d, E3.c, D3.a
    public void a(X0.a callback) {
        AbstractC4862t.e(callback, "callback");
        ReentrantLock reentrantLock = this.f3254g;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f3256i.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            i iVar = (i) this.f3255h.get(context);
            if (iVar == null) {
                reentrantLock.unlock();
                return;
            }
            iVar.d(callback);
            this.f3256i.remove(callback);
            if (iVar.c()) {
                this.f3255h.remove(context);
                e().removeWindowLayoutInfoListener(iVar);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // E3.d, E3.c, D3.a
    public void b(Context context, Executor executor, X0.a callback) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(callback, "callback");
        ReentrantLock reentrantLock = this.f3254g;
        reentrantLock.lock();
        try {
            i iVar = (i) this.f3255h.get(context);
            if (iVar != null) {
                iVar.b(callback);
                this.f3256i.put(callback, context);
            } else {
                i iVar2 = new i(context);
                this.f3255h.put(context, iVar2);
                this.f3256i.put(callback, context);
                iVar2.b(callback);
                e().addWindowLayoutInfoListener(context, iVar2);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
