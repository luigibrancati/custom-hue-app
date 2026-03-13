package H4;

import F4.f;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5313c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f5314a = f.a.Enrichment;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f5315b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f5315b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
    }

    @Override // F4.f
    public E4.a g(E4.a event) {
        Object obj;
        AbstractC4862t.e(event, "event");
        Map mapQ = event.q();
        if (mapQ != null && (obj = mapQ.get("ampli")) != null) {
            try {
                Object obj2 = ((Map) obj).get("ingestionMetadata");
                AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                Map map = (Map) obj2;
                event.i0(new E4.f((String) map.get("sourceName"), (String) map.get("sourceVersion")));
            } catch (Throwable unused) {
            }
        }
        return event;
    }

    @Override // F4.f
    public f.a getType() {
        return this.f5314a;
    }
}
