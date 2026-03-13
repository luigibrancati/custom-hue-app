package M4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9281c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f9282d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f9283e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9285b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final g a(f configuration) {
            g gVar;
            AbstractC4862t.e(configuration, "configuration");
            synchronized (g.f9282d) {
                try {
                    Map map = g.f9283e;
                    String strE = configuration.e();
                    Object gVar2 = map.get(strE);
                    if (gVar2 == null) {
                        gVar2 = new g(configuration, null);
                        map.put(strE, gVar2);
                    }
                    gVar = (g) gVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }

        public a() {
        }
    }

    public /* synthetic */ g(f fVar, AbstractC4854k abstractC4854k) {
        this(fVar);
    }

    public final i c() {
        return this.f9285b;
    }

    public g(f fVar) {
        this.f9284a = fVar;
        this.f9285b = new j(fVar.d().a(fVar));
    }
}
