package l9;

import android.content.Context;
import h8.C4288f;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f39967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f39968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f39969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4288f f39970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P8.h f39971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f39972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f39973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.e f39975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f39976j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements k9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k9.c f39977a;

        public a(k9.c cVar) {
            this.f39977a = cVar;
        }

        @Override // k9.d
        public void remove() {
            m.this.d(this.f39977a);
        }
    }

    public m(C4288f c4288f, P8.h hVar, com.google.firebase.remoteconfig.internal.c cVar, e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.e eVar2, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f39967a = linkedHashSet;
        this.f39968b = new com.google.firebase.remoteconfig.internal.d(c4288f, hVar, cVar, eVar, context, str, linkedHashSet, eVar2, scheduledExecutorService);
        this.f39970d = c4288f;
        this.f39969c = cVar;
        this.f39971e = hVar;
        this.f39972f = eVar;
        this.f39973g = context;
        this.f39974h = str;
        this.f39975i = eVar2;
        this.f39976j = scheduledExecutorService;
    }

    public synchronized k9.d b(k9.c cVar) {
        this.f39967a.add(cVar);
        c();
        return new a(cVar);
    }

    public final synchronized void c() {
        if (!this.f39967a.isEmpty()) {
            this.f39968b.C();
        }
    }

    public final synchronized void d(k9.c cVar) {
        this.f39967a.remove(cVar);
    }

    public synchronized void e(boolean z10) {
        this.f39968b.z(z10);
        if (!z10) {
            c();
        }
    }
}
