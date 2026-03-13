package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static /* synthetic */ void a(C2878l c2878l) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                Tasks.await(it.next().getValue().didReinitializeFirebaseCore());
            }
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void b(C4288f c4288f, C2878l c2878l) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                map2.put(entry.getKey(), Tasks.await(entry.getValue().getPluginConstantsForFirebaseApp(c4288f)));
            }
            c2878l.c(map2);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static Task<Void> didReinitializeFirebaseCore() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.a(c2878l);
            }
        });
        return c2878l.a();
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C4288f c4288f) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.b(c4288f, c2878l);
            }
        });
        return c2878l.a();
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
