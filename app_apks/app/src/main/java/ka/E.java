package ka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cc.AbstractC3096a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class E extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.k f39427a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f39428a;

        /* JADX INFO: renamed from: ka.E$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0512a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Eb.l f39430a;

            public C0512a(Eb.l lVar) {
                this.f39430a = lVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b bVarO0 = E.O0(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                ma.q.k("Adapter state changed: %s", bVarO0);
                this.f39430a.c(bVarO0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Jb.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BroadcastReceiver f39432a;

            public b(BroadcastReceiver broadcastReceiver) {
                this.f39432a = broadcastReceiver;
            }

            @Override // Jb.c
            public void cancel() {
                a.this.f39428a.unregisterReceiver(this.f39432a);
            }
        }

        public a(Context context) {
            this.f39428a = context;
        }

        @Override // Eb.m
        public void a(Eb.l lVar) {
            C0512a c0512a = new C0512a(lVar);
            this.f39428a.registerReceiver(c0512a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            lVar.k(new b(c0512a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39434c = new b(true, "STATE_ON");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f39435d = new b(false, "STATE_OFF");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f39436e = new b(false, "STATE_TURNING_ON");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f39437f = new b(false, "STATE_TURNING_OFF");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f39438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39439b;

        public b(boolean z10, String str) {
            this.f39438a = z10;
            this.f39439b = str;
        }

        public boolean a() {
            return this.f39438a;
        }

        public String toString() {
            return this.f39439b;
        }
    }

    public E(Context context) {
        this.f39427a = Eb.k.m(new a(context)).w0(AbstractC3096a.d()).K0(AbstractC3096a.d()).p0();
    }

    public static b O0(int i10) {
        switch (i10) {
            case 11:
                return b.f39436e;
            case 12:
                return b.f39434c;
            case 13:
                return b.f39437f;
            default:
                return b.f39435d;
        }
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f39427a.f(pVar);
    }
}
