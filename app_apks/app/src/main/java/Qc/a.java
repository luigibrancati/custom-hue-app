package Qc;

import Oc.C1819m;
import dd.AbstractC3912q;
import dd.C3903h;
import dd.InterfaceC3913r;
import ed.C3979a;
import gc.C4179C;
import gc.C4205s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import td.C5881d;
import vd.C6093b;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3903h f14259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f14261c;

    public a(C3903h resolver, g kotlinClassFinder) {
        AbstractC4862t.e(resolver, "resolver");
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        this.f14259a = resolver;
        this.f14260b = kotlinClassFinder;
        this.f14261c = new ConcurrentHashMap();
    }

    public final InterfaceC6099h a(f fileClass) {
        Collection collectionD;
        AbstractC4862t.e(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f14261c;
        kd.b bVarC = fileClass.c();
        Object obj = concurrentHashMap.get(bVarC);
        if (obj == null) {
            kd.c cVarH = fileClass.c().h();
            AbstractC4862t.d(cVarH, "fileClass.classId.packageFqName");
            if (fileClass.e().c() == C3979a.EnumC0429a.MULTIFILE_CLASS) {
                List listF = fileClass.e().f();
                collectionD = new ArrayList();
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    kd.b bVarM = kd.b.m(C5881d.d((String) it.next()).e());
                    AbstractC4862t.d(bVarM, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    InterfaceC3913r interfaceC3913rB = AbstractC3912q.b(this.f14260b, bVarM);
                    if (interfaceC3913rB != null) {
                        collectionD.add(interfaceC3913rB);
                    }
                }
            } else {
                collectionD = C4205s.d(fileClass);
            }
            C1819m c1819m = new C1819m(this.f14259a.d().p(), cVarH);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionD.iterator();
            while (it2.hasNext()) {
                InterfaceC6099h interfaceC6099hB = this.f14259a.b(c1819m, (InterfaceC3913r) it2.next());
                if (interfaceC6099hB != null) {
                    arrayList.add(interfaceC6099hB);
                }
            }
            List listV0 = C4179C.V0(arrayList);
            InterfaceC6099h interfaceC6099hA = C6093b.f45968d.a("package " + cVarH + " (" + fileClass + ')', listV0);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarC, interfaceC6099hA);
            obj = objPutIfAbsent == null ? interfaceC6099hA : objPutIfAbsent;
        }
        AbstractC4862t.d(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return (InterfaceC6099h) obj;
    }
}
