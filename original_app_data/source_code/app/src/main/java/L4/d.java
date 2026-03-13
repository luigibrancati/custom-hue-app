package L4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8570b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8571c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f8572d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8573a = new e();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final d a(String instanceName) {
            d dVar;
            AbstractC4862t.e(instanceName, "instanceName");
            synchronized (d.f8571c) {
                try {
                    Map map = d.f8572d;
                    Object dVar2 = map.get(instanceName);
                    if (dVar2 == null) {
                        dVar2 = new d();
                        map.put(instanceName, dVar2);
                    }
                    dVar = (d) dVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        public a() {
        }
    }

    public final b c() {
        return this.f8573a;
    }
}
