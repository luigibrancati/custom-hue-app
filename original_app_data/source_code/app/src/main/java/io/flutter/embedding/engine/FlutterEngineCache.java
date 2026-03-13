package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineCache {
    private static FlutterEngineCache instance;
    private final Map<String, FlutterEngine> cachedEngines = new HashMap();

    public static FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new FlutterEngineCache();
        }
        return instance;
    }

    public void clear() {
        this.cachedEngines.clear();
    }

    public boolean contains(String str) {
        return this.cachedEngines.containsKey(str);
    }

    public FlutterEngine get(String str) {
        return this.cachedEngines.get(str);
    }

    public void put(String str, FlutterEngine flutterEngine) {
        if (flutterEngine != null) {
            this.cachedEngines.put(str, flutterEngine);
        } else {
            this.cachedEngines.remove(str);
        }
    }

    public void remove(String str) {
        put(str, null);
    }
}
