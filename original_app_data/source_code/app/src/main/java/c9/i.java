package c9;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import f9.C4003a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Trace f26393a;

    public i(Trace trace) {
        this.f26393a = trace;
    }

    public TraceMetric a() {
        TraceMetric.b bVarU = TraceMetric.newBuilder().v(this.f26393a.e()).t(this.f26393a.g().e()).u(this.f26393a.g().d(this.f26393a.d()));
        for (f fVar : this.f26393a.c().values()) {
            bVarU.r(fVar.b(), fVar.a());
        }
        List listH = this.f26393a.h();
        if (!listH.isEmpty()) {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                bVarU.o(new i((Trace) it.next()).a());
            }
        }
        bVarU.q(this.f26393a.getAttributes());
        PerfSession[] perfSessionArrB = C4003a.b(this.f26393a.f());
        if (perfSessionArrB != null) {
            bVarU.j(Arrays.asList(perfSessionArrB));
        }
        return (TraceMetric) bVarU.build();
    }
}
