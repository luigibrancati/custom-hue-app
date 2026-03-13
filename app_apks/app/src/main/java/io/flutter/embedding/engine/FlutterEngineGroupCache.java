package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineGroupCache {
    private static volatile FlutterEngineGroupCache instance;
    private final Map<String, FlutterEngineGroup> cachedEngineGroups = new HashMap();

    public static FlutterEngineGroupCache getInstance() {
        if (instance == null) {
            synchronized (FlutterEngineGroupCache.class) {
                try {
                    if (instance == null) {
                        instance = new FlutterEngineGroupCache();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public void clear() {
        this.cachedEngineGroups.clear();
    }

    public boolean contains(String str) {
        return this.cachedEngineGroups.containsKey(str);
    }

    public FlutterEngineGroup get(String str) {
        return this.cachedEngineGroups.get(str);
    }

    public void put(String str, FlutterEngineGroup flutterEngineGroup) {
        if (flutterEngineGroup != null) {
            this.cachedEngineGroups.put(str, flutterEngineGroup);
        } else {
            this.cachedEngineGroups.remove(str);
        }
    }

    public void remove(String str) {
        put(str, null);
    }
}
