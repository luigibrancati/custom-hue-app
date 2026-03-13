package Yc;

import Nd.t;
import bd.InterfaceC2915g;
import bd.InterfaceC2922n;
import bd.p;
import bd.r;
import bd.w;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2915g f19885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f19886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f19887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f19889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f19890f;

    /* JADX INFO: renamed from: Yc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0252a extends v implements vc.l {
        public C0252a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r m10) {
            AbstractC4862t.e(m10, "m");
            return Boolean.valueOf(((Boolean) a.this.f19886b.invoke(m10)).booleanValue() && !p.c(m10));
        }
    }

    public a(InterfaceC2915g jClass, vc.l memberFilter) {
        AbstractC4862t.e(jClass, "jClass");
        AbstractC4862t.e(memberFilter, "memberFilter");
        this.f19885a = jClass;
        this.f19886b = memberFilter;
        C0252a c0252a = new C0252a();
        this.f19887c = c0252a;
        Nd.h hVarY = t.y(C4179C.X(jClass.B()), c0252a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVarY) {
            kd.f name = ((r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f19888d = linkedHashMap;
        Nd.h hVarY2 = t.y(C4179C.X(this.f19885a.x()), this.f19886b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : hVarY2) {
            linkedHashMap2.put(((InterfaceC2922n) obj2).getName(), obj2);
        }
        this.f19889e = linkedHashMap2;
        Collection collectionG = this.f19885a.g();
        vc.l lVar = this.f19886b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionG) {
            if (((Boolean) lVar.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((w) obj4).getName(), obj4);
        }
        this.f19890f = linkedHashMap3;
    }

    @Override // Yc.b
    public Set a() {
        Nd.h hVarY = t.y(C4179C.X(this.f19885a.B()), this.f19887c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarY.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Yc.b
    public InterfaceC2922n b(kd.f name) {
        AbstractC4862t.e(name, "name");
        return (InterfaceC2922n) this.f19889e.get(name);
    }

    @Override // Yc.b
    public Collection c(kd.f name) {
        AbstractC4862t.e(name, "name");
        List list = (List) this.f19888d.get(name);
        return list != null ? list : C4206t.k();
    }

    @Override // Yc.b
    public Set d() {
        return this.f19890f.keySet();
    }

    @Override // Yc.b
    public Set e() {
        Nd.h hVarY = t.y(C4179C.X(this.f19885a.x()), this.f19886b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarY.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC2922n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Yc.b
    public w f(kd.f name) {
        AbstractC4862t.e(name, "name");
        return (w) this.f19890f.get(name);
    }
}
