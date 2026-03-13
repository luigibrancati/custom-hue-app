package h9;

import b9.C2898a;
import com.google.firebase.perf.v1.PerfMetric;

/* JADX INFO: renamed from: h9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4292b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2898a f36323d = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.b f36325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y5.i f36326c;

    public C4292b(O8.b bVar, String str) {
        this.f36324a = str;
        this.f36325b = bVar;
    }

    public final boolean a() {
        if (this.f36326c == null) {
            Y5.j jVar = (Y5.j) this.f36325b.get();
            if (jVar != null) {
                this.f36326c = jVar.a(this.f36324a, PerfMetric.class, Y5.c.b("proto"), new Y5.h() { // from class: h9.a
                    @Override // Y5.h
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                f36323d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f36326c != null;
    }

    public void b(PerfMetric perfMetric) {
        if (a()) {
            this.f36326c.a(Y5.d.f(perfMetric));
        } else {
            f36323d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
