package Q4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationConfig f13757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap f13758c;

    public B(String name, NotificationConfig notificationConfig) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(notificationConfig, "notificationConfig");
        this.f13756a = name;
        this.f13757b = notificationConfig;
        this.f13758c = new ConcurrentHashMap();
    }

    public final int a() {
        return (h() * 1000) + g();
    }

    public final boolean b() {
        return f() > 0;
    }

    public final String c() {
        return this.f13756a;
    }

    public final NotificationConfig d() {
        return this.f13757b;
    }

    public final int e() {
        return ("groupNotification" + this.f13756a).hashCode();
    }

    public final int f() {
        ConcurrentHashMap concurrentHashMap = this.f13758c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((G) entry.getValue()) == G.error) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public final int g() {
        ConcurrentHashMap concurrentHashMap = this.f13758c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((G) entry.getValue()) != G.running) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public final int h() {
        return this.f13758c.size();
    }

    public final double i() {
        if (h() == 0) {
            return 2.0d;
        }
        return ((double) g()) / ((double) h());
    }

    public final Set j() {
        ConcurrentHashMap concurrentHashMap = this.f13758c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((G) entry.getValue()) == G.running) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public final boolean k() {
        return g() == h();
    }

    public final boolean l(Task task, G notificationType) {
        AbstractC4862t.e(task, "task");
        AbstractC4862t.e(notificationType, "notificationType");
        if (this.f13758c.get(task) == notificationType) {
            return false;
        }
        int iA = a();
        this.f13758c.put(task, notificationType);
        return iA != a();
    }
}
