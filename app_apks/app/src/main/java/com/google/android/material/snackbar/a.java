package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f30796c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30797a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f30798b = new Handler(Looper.getMainLooper(), new C0362a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0362a implements Handler.Callback {
        public C0362a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            android.support.v4.media.session.a.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
    }

    public static a b() {
        if (f30796c == null) {
            f30796c = new a();
        }
        return f30796c;
    }

    public final boolean a(c cVar, int i10) {
        throw null;
    }

    public void c(c cVar) {
        synchronized (this.f30797a) {
            a(cVar, 2);
        }
    }

    public final boolean d(b bVar) {
        return false;
    }

    public void e(b bVar) {
        synchronized (this.f30797a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f30797a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
