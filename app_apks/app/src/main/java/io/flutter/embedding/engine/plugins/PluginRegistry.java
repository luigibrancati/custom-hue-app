package io.flutter.embedding.engine.plugins;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface PluginRegistry {
    void add(FlutterPlugin flutterPlugin);

    void add(Set<FlutterPlugin> set);

    FlutterPlugin get(Class<? extends FlutterPlugin> cls);

    boolean has(Class<? extends FlutterPlugin> cls);

    void remove(Class<? extends FlutterPlugin> cls);

    void remove(Set<Class<? extends FlutterPlugin>> set);

    void removeAll();
}
