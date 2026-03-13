package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.l0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC3686h extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = AbstractC3692n.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements l0.a {
        public a() {
        }

        @Override // com.google.firebase.messaging.l0.a
        public Task a(Intent intent) {
            return AbstractServiceC3686h.this.d(intent);
        }
    }

    public static /* synthetic */ void a(AbstractServiceC3686h abstractServiceC3686h, Intent intent, C2878l c2878l) {
        abstractServiceC3686h.getClass();
        try {
            abstractServiceC3686h.handleIntent(intent);
        } finally {
            c2878l.c(null);
        }
    }

    public final void c(Intent intent) {
        if (intent != null) {
            j0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task d(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.e(null);
        }
        final C2878l c2878l = new C2878l();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC3686h.a(this.f31739a, intent, c2878l);
            }
        });
        return c2878l.a();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new l0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        Task taskD = d(startCommandIntent);
        if (taskD.p()) {
            c(intent);
            return 2;
        }
        taskD.c(new X2.g(), new InterfaceC2872f() { // from class: com.google.firebase.messaging.f
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                this.f31732a.c(intent);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
