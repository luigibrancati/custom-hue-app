package com.google.firebase.messaging;

import android.util.Log;
import b0.C2777a;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f31668b = new C2777a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Task start();
    }

    public W(Executor executor) {
        this.f31667a = executor;
    }

    public static /* synthetic */ Task a(W w10, String str, Task task) {
        synchronized (w10) {
            w10.f31668b.remove(str);
        }
        return task;
    }

    public synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f31668b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskK = aVar.start().k(this.f31667a, new InterfaceC2869c() { // from class: com.google.firebase.messaging.V
            @Override // b7.InterfaceC2869c
            public final Object a(Task task2) {
                return W.a(this.f31665a, str, task2);
            }
        });
        this.f31668b.put(str, taskK);
        return taskK;
    }
}
