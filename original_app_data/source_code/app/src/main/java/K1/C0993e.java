package K1;

import G1.InterfaceC0860h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: renamed from: K1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0993e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.p f7044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7045d;

    /* JADX INFO: renamed from: K1.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f7046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G1.p f7047b;

        public a(G1.p pVar, b bVar) {
            this.f7047b = pVar;
            this.f7046a = bVar;
        }

        public final void b() {
            if (C0993e.this.f7045d) {
                this.f7046a.v();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f7047b.i(new Runnable() { // from class: K1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7031a.b();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: K1.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void v();
    }

    public C0993e(Context context, Looper looper, Looper looper2, b bVar, InterfaceC0860h interfaceC0860h) {
        this.f7042a = context.getApplicationContext();
        this.f7044c = interfaceC0860h.e(looper, null);
        this.f7043b = new a(interfaceC0860h.e(looper2, null), bVar);
    }

    public void d(boolean z10) {
        if (z10 == this.f7045d) {
            return;
        }
        if (z10) {
            this.f7044c.i(new Runnable() { // from class: K1.b
                @Override // java.lang.Runnable
                public final void run() {
                    C0993e c0993e = this.f7009a;
                    c0993e.f7042a.registerReceiver(c0993e.f7043b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f7045d = true;
        } else {
            this.f7044c.i(new Runnable() { // from class: K1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0993e c0993e = this.f7015a;
                    c0993e.f7042a.unregisterReceiver(c0993e.f7043b);
                }
            });
            this.f7045d = false;
        }
    }
}
