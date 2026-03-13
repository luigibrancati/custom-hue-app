package m9;

import android.util.Log;
import b7.InterfaceC2874h;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import k9.q;
import o9.AbstractC5241e;
import o9.InterfaceC5242f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l9.e f40226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5032a f40227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f40228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f40229d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(l9.e eVar, C5032a c5032a, Executor executor) {
        this.f40226a = eVar;
        this.f40227b = c5032a;
        this.f40228c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, final InterfaceC5242f interfaceC5242f, com.google.firebase.remoteconfig.internal.b bVar) {
        eVar.getClass();
        try {
            com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) task.m();
            if (bVar2 != null) {
                final AbstractC5241e abstractC5241eB = eVar.f40227b.b(bVar2);
                eVar.f40228c.execute(new Runnable() { // from class: m9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC5242f.a(abstractC5241eB);
                    }
                });
            }
        } catch (q e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void d(com.google.firebase.remoteconfig.internal.b bVar) {
        try {
            final AbstractC5241e abstractC5241eB = this.f40227b.b(bVar);
            for (final InterfaceC5242f interfaceC5242f : this.f40229d) {
                this.f40228c.execute(new Runnable() { // from class: m9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC5242f.a(abstractC5241eB);
                    }
                });
            }
        } catch (q e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void e(final InterfaceC5242f interfaceC5242f) {
        this.f40229d.add(interfaceC5242f);
        final Task taskE = this.f40226a.e();
        taskE.i(this.f40228c, new InterfaceC2874h() { // from class: m9.c
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                e.a(this.f40221a, taskE, interfaceC5242f, (com.google.firebase.remoteconfig.internal.b) obj);
            }
        });
    }
}
