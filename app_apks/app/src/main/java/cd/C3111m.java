package cd;

import dd.y;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4186J;
import gc.C4204q;
import gc.C4207u;
import gc.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: renamed from: cd.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26563a = new LinkedHashMap();

    /* JADX INFO: renamed from: cd.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3111m f26565b;

        /* JADX INFO: renamed from: cd.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0340a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f26566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f26567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C4034q f26568c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26569d;

            public C0340a(a aVar, String functionName) {
                AbstractC4862t.e(functionName, "functionName");
                this.f26569d = aVar;
                this.f26566a = functionName;
                this.f26567b = new ArrayList();
                this.f26568c = AbstractC4040w.a("V", null);
            }

            public final C4034q a() {
                y yVar = y.f33464a;
                String strB = this.f26569d.b();
                String str = this.f26566a;
                List list = this.f26567b;
                ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C4034q) it.next()).e());
                }
                String strK = yVar.k(strB, yVar.j(str, arrayList, (String) this.f26568c.e()));
                C3115q c3115q = (C3115q) this.f26568c.f();
                List list2 = this.f26567b;
                ArrayList arrayList2 = new ArrayList(C4207u.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C3115q) ((C4034q) it2.next()).f());
                }
                return AbstractC4040w.a(strK, new C3109k(c3115q, arrayList2));
            }

            public final void b(String type, C3101e... qualifiers) {
                C3115q c3115q;
                AbstractC4862t.e(type, "type");
                AbstractC4862t.e(qualifiers, "qualifiers");
                List list = this.f26567b;
                if (qualifiers.length == 0) {
                    c3115q = null;
                } else {
                    Iterable<C4186J> iterableC1 = C4204q.c1(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(iterableC1, 10)), 16));
                    for (C4186J c4186j : iterableC1) {
                        linkedHashMap.put(Integer.valueOf(c4186j.c()), (C3101e) c4186j.d());
                    }
                    c3115q = new C3115q(linkedHashMap);
                }
                list.add(AbstractC4040w.a(type, c3115q));
            }

            public final void c(String type, C3101e... qualifiers) {
                AbstractC4862t.e(type, "type");
                AbstractC4862t.e(qualifiers, "qualifiers");
                Iterable<C4186J> iterableC1 = C4204q.c1(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(iterableC1, 10)), 16));
                for (C4186J c4186j : iterableC1) {
                    linkedHashMap.put(Integer.valueOf(c4186j.c()), (C3101e) c4186j.d());
                }
                this.f26568c = AbstractC4040w.a(type, new C3115q(linkedHashMap));
            }

            public final void d(EnumC5882e type) {
                AbstractC4862t.e(type, "type");
                String strP = type.p();
                AbstractC4862t.d(strP, "type.desc");
                this.f26568c = AbstractC4040w.a(strP, null);
            }
        }

        public a(C3111m c3111m, String className) {
            AbstractC4862t.e(className, "className");
            this.f26565b = c3111m;
            this.f26564a = className;
        }

        public final void a(String name, vc.l block) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(block, "block");
            Map map = this.f26565b.f26563a;
            C0340a c0340a = new C0340a(this, name);
            block.invoke(c0340a);
            C4034q c4034qA = c0340a.a();
            map.put(c4034qA.e(), c4034qA.f());
        }

        public final String b() {
            return this.f26564a;
        }
    }

    public final Map b() {
        return this.f26563a;
    }
}
