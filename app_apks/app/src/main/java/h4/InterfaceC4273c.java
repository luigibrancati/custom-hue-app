package h4;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC4862t;
import n4.g;
import n4.l;

/* JADX INFO: renamed from: h4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4273c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36248a = a.f36249a;

    /* JADX INFO: renamed from: h4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f36249a = new a();

        public final InterfaceC4273c a(Context context, boolean z10, b listener, l lVar) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(listener, "listener");
            if (!z10) {
                return C4271a.f36246b;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) L0.a.k(context, ConnectivityManager.class);
            if (connectivityManager == null || L0.a.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                if (lVar != null && lVar.getLevel() <= 5) {
                    lVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
                }
                return C4271a.f36246b;
            }
            try {
                return new C4274d(connectivityManager, listener);
            } catch (Exception e10) {
                if (lVar != null) {
                    g.a(lVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
                }
                return C4271a.f36246b;
            }
        }
    }

    /* JADX INFO: renamed from: h4.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(boolean z10);
    }

    boolean a();

    void shutdown();
}
