package X8;

import androidx.fragment.app.ComponentCallbacksC2736q;
import androidx.fragment.app.J;
import b9.C2898a;
import c9.g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import h9.k;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c extends J.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2898a f19369f = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f19370a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.perf.util.a f19371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f19372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f19373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f19374e;

    public c(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, d dVar) {
        this.f19371b = aVar;
        this.f19372c = kVar;
        this.f19373d = aVar2;
        this.f19374e = dVar;
    }

    @Override // androidx.fragment.app.J.k
    public void f(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        super.f(j10, componentCallbacksC2736q);
        C2898a c2898a = f19369f;
        c2898a.b("FragmentMonitor %s.onFragmentPaused ", componentCallbacksC2736q.getClass().getSimpleName());
        if (!this.f19370a.containsKey(componentCallbacksC2736q)) {
            c2898a.k("FragmentMonitor: missed a fragment trace from %s", componentCallbacksC2736q.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f19370a.get(componentCallbacksC2736q);
        this.f19370a.remove(componentCallbacksC2736q);
        g gVarF = this.f19374e.f(componentCallbacksC2736q);
        if (!gVarF.d()) {
            c2898a.k("onFragmentPaused: recorder failed to trace %s", componentCallbacksC2736q.getClass().getSimpleName());
        } else {
            j.a(trace, (g.a) gVarF.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.J.k
    public void i(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        super.i(j10, componentCallbacksC2736q);
        f19369f.b("FragmentMonitor %s.onFragmentResumed", componentCallbacksC2736q.getClass().getSimpleName());
        Trace trace = new Trace(o(componentCallbacksC2736q), this.f19372c, this.f19371b, this.f19373d);
        trace.start();
        trace.putAttribute("Parent_fragment", componentCallbacksC2736q.getParentFragment() == null ? "No parent" : componentCallbacksC2736q.getParentFragment().getClass().getSimpleName());
        if (componentCallbacksC2736q.getActivity() != null) {
            trace.putAttribute("Hosting_activity", componentCallbacksC2736q.getActivity().getClass().getSimpleName());
        }
        this.f19370a.put(componentCallbacksC2736q, trace);
        this.f19374e.d(componentCallbacksC2736q);
    }

    public String o(ComponentCallbacksC2736q componentCallbacksC2736q) {
        return "_st_" + componentCallbacksC2736q.getClass().getSimpleName();
    }
}
