package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31772a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Task a(Intent intent);
    }

    public l0(a aVar) {
        this.f31772a = aVar;
    }

    public void b(final o0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f31772a.a(aVar.f31786a).c(new X2.g(), new InterfaceC2872f() { // from class: com.google.firebase.messaging.k0
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                aVar.d();
            }
        });
    }
}
