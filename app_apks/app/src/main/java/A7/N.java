package A7;

import B7.a0;
import B7.c0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends a0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static N f182j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f185i;

    public N(Context context, z zVar) {
        super(new c0("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f183g = new Handler(Looper.getMainLooper());
        this.f185i = new LinkedHashSet();
        this.f184h = zVar;
    }

    public static synchronized N h(Context context) {
        try {
            if (f182j == null) {
                f182j = new N(context, E.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f182j;
    }

    @Override // B7.a0
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC0679c abstractC0679cJ = AbstractC0679c.j(bundleExtra);
        this.f712a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", abstractC0679cJ);
        A aZza = this.f184h.zza();
        if (abstractC0679cJ.e() != 3 || aZza == null) {
            j(abstractC0679cJ);
        } else {
            aZza.a(abstractC0679cJ.i(), new L(this, abstractC0679cJ, intent, context));
        }
    }

    public final synchronized void j(AbstractC0679c abstractC0679c) {
        try {
            Iterator it = new LinkedHashSet(this.f185i).iterator();
            while (it.hasNext()) {
                ((InterfaceC0680d) it.next()).onStateUpdate(abstractC0679c);
            }
            super.e(abstractC0679c);
        } catch (Throwable th) {
            throw th;
        }
    }
}
