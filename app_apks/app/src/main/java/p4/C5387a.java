package p4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5387a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0560a f42183c = new C0560a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f42184d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f42185e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5392f f42186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5389c f42187b;

    /* JADX INFO: renamed from: p4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0560a {
        public /* synthetic */ C0560a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C5387a a(String instanceName) {
            C5387a c5387a;
            AbstractC4862t.e(instanceName, "instanceName");
            synchronized (C5387a.f42184d) {
                try {
                    Map map = C5387a.f42185e;
                    Object c5387a2 = map.get(instanceName);
                    if (c5387a2 == null) {
                        c5387a2 = new C5387a(null);
                        map.put(instanceName, c5387a2);
                    }
                    c5387a = (C5387a) c5387a2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c5387a;
        }

        public C0560a() {
        }
    }

    public /* synthetic */ C5387a(AbstractC4854k abstractC4854k) {
        this();
    }

    public final InterfaceC5389c c() {
        return this.f42187b;
    }

    public final InterfaceC5392f d() {
        return this.f42186a;
    }

    public C5387a() {
        this.f42186a = new C5393g();
        this.f42187b = new C5390d();
    }
}
