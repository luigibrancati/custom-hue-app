package p9;

import android.content.Context;
import android.os.Process;
import fc.AbstractC4040w;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import p9.InterfaceC5446w;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: p9.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5424A implements InterfaceC5446w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f42304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f42306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f42307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42308f;

    public C5424A(Context appContext, final Z uuidGenerator) {
        AbstractC4862t.e(appContext, "appContext");
        AbstractC4862t.e(uuidGenerator, "uuidGenerator");
        this.f42303a = appContext;
        this.f42304b = C4029l.b(new InterfaceC6082a() { // from class: p9.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5424A.p(this.f42501a);
            }
        });
        this.f42305c = Process.myPid();
        this.f42306d = C4029l.b(new InterfaceC6082a() { // from class: p9.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5424A.q(uuidGenerator);
            }
        });
        this.f42307e = C4029l.b(new InterfaceC6082a() { // from class: p9.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5424A.o(this.f42503a);
            }
        });
    }

    public static final C o(C5424A c5424a) {
        return D.f42315a.b(c5424a.f42303a);
    }

    public static final String p(C5424A c5424a) {
        return c5424a.l().c();
    }

    public static final String q(Z z10) {
        String string = z10.next().toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    @Override // p9.InterfaceC5446w
    public String a() {
        return (String) this.f42304b.getValue();
    }

    @Override // p9.InterfaceC5446w
    public boolean b(Map processDataMap) {
        AbstractC4862t.e(processDataMap, "processDataMap");
        ProcessData processData = (ProcessData) processDataMap.get(a());
        return (processData != null && processData.getPid() == k() && AbstractC4862t.a(processData.getUuid(), m())) ? false : true;
    }

    @Override // p9.InterfaceC5446w
    public Map c(Map map) {
        Map mapW;
        if (map != null && (mapW = gc.Q.w(map)) != null) {
            mapW.put(a(), new ProcessData(Process.myPid(), m()));
            Map mapU = gc.Q.u(mapW);
            if (mapU != null) {
                return mapU;
            }
        }
        return gc.P.f(AbstractC4040w.a(a(), new ProcessData(Process.myPid(), m())));
    }

    @Override // p9.InterfaceC5446w
    public void d() {
        this.f42308f = true;
    }

    @Override // p9.InterfaceC5446w
    public boolean e(Map processDataMap) {
        AbstractC4862t.e(processDataMap, "processDataMap");
        if (this.f42308f) {
            return false;
        }
        List<C> listJ = j();
        ArrayList<C4034q> arrayList = new ArrayList();
        for (C c10 : listJ) {
            ProcessData processData = (ProcessData) processDataMap.get(c10.c());
            C4034q c4034q = processData != null ? new C4034q(c10, processData) : null;
            if (c4034q != null) {
                arrayList.add(c4034q);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (C4034q c4034q2 : arrayList) {
            if (!n((C) c4034q2.a(), (ProcessData) c4034q2.b())) {
                return false;
            }
        }
        return true;
    }

    @Override // p9.InterfaceC5446w
    public Map f() {
        return InterfaceC5446w.a.a(this);
    }

    public final List j() {
        return D.f42315a.a(this.f42303a);
    }

    public int k() {
        return this.f42305c;
    }

    public final C l() {
        return (C) this.f42307e.getValue();
    }

    public String m() {
        return (String) this.f42306d.getValue();
    }

    public final boolean n(C c10, ProcessData processData) {
        return AbstractC4862t.a(a(), c10.c()) ? (c10.b() == processData.getPid() && AbstractC4862t.a(m(), processData.getUuid())) ? false : true : c10.b() != processData.getPid();
    }
}
