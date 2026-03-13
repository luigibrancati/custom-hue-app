package t4;

import androidx.fragment.app.ActivityC2740v;
import androidx.fragment.app.ComponentCallbacksC2736q;
import androidx.fragment.app.J;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4035r;
import gc.Q;
import kotlin.jvm.internal.AbstractC4862t;
import vc.p;
import z4.C6510i;

/* JADX INFO: renamed from: t4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5840a extends J.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f44744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f44745b;

    public C5840a(p track, A4.a logger) {
        AbstractC4862t.e(track, "track");
        AbstractC4862t.e(logger, "logger");
        this.f44744a = track;
        this.f44745b = logger;
    }

    @Override // androidx.fragment.app.J.k
    public void i(J fm, ComponentCallbacksC2736q f10) {
        Object objB;
        AbstractC4862t.e(fm, "fm");
        AbstractC4862t.e(f10, "f");
        super.i(fm, f10);
        String canonicalName = f10.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = f10.getClass().getSimpleName();
        }
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(f10.getResources().getResourceEntryName(f10.getId()));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        Throwable thE = C4035r.e(objB);
        if (thE != null) {
            this.f44745b.d("Failed to get resource entry name: " + thE);
        }
        if (C4035r.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        ActivityC2740v activity = f10.getActivity();
        this.f44744a.invoke("[Amplitude] Fragment Viewed", Q.l(AbstractC4040w.a("[Amplitude] Fragment Class", canonicalName), AbstractC4040w.a("[Amplitude] Fragment Identifier", str), AbstractC4040w.a("[Amplitude] Screen Name", activity != null ? C6510i.f48764c.a(activity) : null), AbstractC4040w.a("[Amplitude] Fragment Tag", f10.getTag())));
    }
}
