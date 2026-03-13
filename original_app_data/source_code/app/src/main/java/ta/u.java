package ta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cc.AbstractC3096a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f44894b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.m {

        /* JADX INFO: renamed from: ta.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0609a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Eb.l f44896a;

            public C0609a(Eb.l lVar) {
                this.f44896a = lVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f44896a.c(Boolean.valueOf(u.this.f44894b.a()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Jb.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BroadcastReceiver f44898a;

            public b(BroadcastReceiver broadcastReceiver) {
                this.f44898a = broadcastReceiver;
            }

            @Override // Jb.c
            public void cancel() {
                u.this.f44893a.unregisterReceiver(this.f44898a);
            }
        }

        public a() {
        }

        @Override // Eb.m
        public void a(Eb.l lVar) {
            boolean zA = u.this.f44894b.a();
            C0609a c0609a = new C0609a(lVar);
            lVar.c(Boolean.valueOf(zA));
            u.this.f44893a.registerReceiver(c0609a, new IntentFilter("android.location.MODE_CHANGED"));
            lVar.k(new b(c0609a));
        }
    }

    public u(Context context, w wVar) {
        this.f44893a = context;
        this.f44894b = wVar;
    }

    public Eb.k a() {
        return Eb.k.m(new a()).t().w0(AbstractC3096a.d()).K0(AbstractC3096a.d());
    }
}
