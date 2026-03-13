package x9;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import u9.q;
import u9.w;
import u9.x;
import w9.AbstractC6173b;
import w9.B;
import w9.F;
import w9.u;

/* JADX INFO: renamed from: x9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6337i implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47971b;

    /* JADX INFO: renamed from: x9.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f47972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f47973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B f47974c;

        public a(u9.e eVar, Type type, w wVar, Type type2, w wVar2, B b10) {
            this.f47972a = new C6343o(eVar, wVar, type);
            this.f47973b = new C6343o(eVar, wVar2, type2);
            this.f47974c = b10;
        }

        public final String f(u9.j jVar) {
            if (!jVar.p()) {
                if (jVar.l()) {
                    return "null";
                }
                throw new AssertionError();
            }
            u9.o oVarF = jVar.f();
            if (oVarF.A()) {
                return String.valueOf(oVarF.x());
            }
            if (oVarF.y()) {
                return Boolean.toString(oVarF.c());
            }
            if (oVarF.B()) {
                return oVarF.h();
            }
            throw new AssertionError();
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map c(C9.a aVar) throws IOException {
            C9.b bVarC = aVar.C();
            if (bVarC == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            Map map = (Map) this.f47974c.a();
            if (bVarC != C9.b.BEGIN_ARRAY) {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    w9.x.f46439a.a(aVar);
                    Object objC = this.f47972a.c(aVar);
                    if (map.put(objC, this.f47973b.c(aVar)) != null) {
                        throw new q("duplicate key: " + objC);
                    }
                }
                aVar.endObject();
                return map;
            }
            aVar.beginArray();
            while (aVar.hasNext()) {
                aVar.beginArray();
                Object objC2 = this.f47972a.c(aVar);
                if (map.put(objC2, this.f47973b.c(aVar)) != null) {
                    throw new q("duplicate key: " + objC2);
                }
                aVar.endArray();
            }
            aVar.endArray();
            return map;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Map map) throws IOException {
            if (map == null) {
                cVar.C();
                return;
            }
            if (!C6337i.this.f47971b) {
                cVar.f();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.q(String.valueOf(entry.getKey()));
                    this.f47973b.e(cVar, entry.getValue());
                }
                cVar.i();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                u9.j jVarD = this.f47972a.d(entry2.getKey());
                arrayList.add(jVarD);
                arrayList2.add(entry2.getValue());
                z10 |= jVarD.k() || jVarD.n();
            }
            if (!z10) {
                cVar.f();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.q(f((u9.j) arrayList.get(i10)));
                    this.f47973b.e(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.i();
                return;
            }
            cVar.d();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.d();
                F.b((u9.j) arrayList.get(i10), cVar);
                this.f47973b.e(cVar, arrayList2.get(i10));
                cVar.h();
                i10++;
            }
            cVar.h();
        }
    }

    public C6337i(u uVar, boolean z10) {
        this.f47970a = uVar;
        this.f47971b = z10;
    }

    public final w a(u9.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? AbstractC6344p.f48054f : eVar.k(B9.a.b(type));
    }

    @Override // u9.x
    public w create(u9.e eVar, B9.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = AbstractC6173b.j(typeD, clsC);
        return new a(eVar, typeArrJ[0], a(eVar, typeArrJ[0]), typeArrJ[1], eVar.k(B9.a.b(typeArrJ[1])), this.f47970a.t(aVar));
    }
}
