package x;

import E.AbstractC0807p0;
import E.C0803n0;
import E.C0817v;
import E.C0821x;
import L.AbstractC1087a0;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.WebrtcBuildVersion;
import y.C6369e;

/* JADX INFO: renamed from: x.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6272x implements L.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f47191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1087a0 f47192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.Z f47193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.t f47194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6236k1 f47195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f47196g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P.m f47198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final E.G f47199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N0 f47200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0817v f47201l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f47197h = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f47202m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f47203n = new ArrayList();

    public C6272x(Context context, AbstractC1087a0 abstractC1087a0, C0817v c0817v, long j10, E.G g10, P.m mVar) throws C0803n0 {
        this.f47190a = context;
        this.f47192c = abstractC1087a0;
        y.t tVarB = y.t.b(context, abstractC1087a0.c());
        this.f47194e = tVarB;
        this.f47195f = C6236k1.c(context);
        C.a aVar = new C.a(tVarB);
        this.f47191b = aVar;
        L.Z z10 = new L.Z(aVar, 1);
        this.f47193d = z10;
        aVar.a(z10);
        this.f47196g = j10;
        this.f47198i = mVar;
        this.f47199j = g10;
        this.f47201l = c0817v;
        try {
            List listAsList = Arrays.asList(tVarB.d());
            this.f47200k = new N0(listAsList, tVarB, abstractC1087a0.b());
            e(listAsList);
        } catch (C6369e e10) {
            throw new C0803n0(W0.a(e10));
        }
    }

    @Override // L.H
    public L.J b(String str) {
        synchronized (this.f47202m) {
            if (!this.f47203n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new S(this.f47190a, this.f47194e, str, h(str), this.f47191b, this.f47193d, this.f47192c.b(), this.f47192c.c(), this.f47195f, this.f47196g, this.f47199j);
    }

    @Override // L.H
    public L.P0 c() {
        return this.f47200k;
    }

    @Override // L.H
    public Set d() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f47202m) {
            linkedHashSet = new LinkedHashSet(this.f47203n);
        }
        return linkedHashSet;
    }

    @Override // L.L
    public void e(List list) throws C0803n0 {
        try {
            List listG = g(U0.b(this, this.f47201l, new ArrayList(list)));
            synchronized (this.f47202m) {
                try {
                    if (this.f47203n.equals(listG)) {
                        return;
                    }
                    AbstractC0807p0.a("Camera2CameraFactory", "Updated available camera list: " + this.f47203n + " -> " + listG);
                    this.f47203n = listG;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0803n0 e10) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e10);
            throw e10;
        }
    }

    @Override // L.H
    public F.a f() {
        return this.f47191b;
    }

    public final List g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals(WebrtcBuildVersion.maint_version) || str.equals("1")) {
                arrayList.add(str);
            } else if (T0.a(this.f47194e, str)) {
                arrayList.add(str);
            } else {
                AbstractC0807p0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public Y h(String str) throws C0821x {
        try {
            Y y10 = (Y) this.f47197h.get(str);
            if (y10 != null) {
                return y10;
            }
            Y y11 = new Y(str, this.f47194e, this.f47198i);
            this.f47197h.put(str, y11);
            return y11;
        } catch (C6369e e10) {
            throw W0.a(e10);
        }
    }

    @Override // L.H
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.t a() {
        return this.f47194e;
    }

    @Override // L.H
    public void shutdown() {
        this.f47191b.shutdown();
        this.f47200k.g();
    }
}
