package O3;

import I3.AbstractC0890u;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f10926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f10927g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            AbstractC4862t.e(network, "network");
            AbstractC4862t.e(capabilities, "capabilities");
            AbstractC0890u.e().a(k.f10929a, "Network capabilities changed: " + capabilities);
            j.this.g(k.d(capabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC4862t.e(network, "network");
            AbstractC0890u.e().a(k.f10929a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f10926f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, S3.b taskExecutor) {
        super(context, taskExecutor);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f10926f = (ConnectivityManager) systemService;
        this.f10927g = new a();
    }

    @Override // O3.h
    public void h() {
        try {
            AbstractC0890u.e().a(k.f10929a, "Registering network callback");
            R3.m.a(this.f10926f, this.f10927g);
        } catch (IllegalArgumentException e10) {
            AbstractC0890u.e().d(k.f10929a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC0890u.e().d(k.f10929a, "Received exception while registering network callback", e11);
        }
    }

    @Override // O3.h
    public void i() {
        try {
            AbstractC0890u.e().a(k.f10929a, "Unregistering network callback");
            this.f10926f.unregisterNetworkCallback(this.f10927g);
        } catch (IllegalArgumentException e10) {
            AbstractC0890u.e().d(k.f10929a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC0890u.e().d(k.f10929a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // O3.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public M3.f e() {
        return k.c(this.f10926f);
    }
}
