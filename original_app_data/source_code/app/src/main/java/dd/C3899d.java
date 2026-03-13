package dd;

import Cd.E;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.J;
import Lc.a0;
import Lc.j0;
import Od.F;
import dd.InterfaceC3913r;
import gc.C4179C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import qd.C5515a;
import yd.C6472e;

/* JADX INFO: renamed from: dd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3899d extends AbstractC3896a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f33395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f33396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6472e f33397e;

    /* JADX INFO: renamed from: dd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class a implements InterfaceC3913r.a {

        /* JADX INFO: renamed from: dd.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0410a implements InterfaceC3913r.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3913r.a f33399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3913r.a f33400b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f33401c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kd.f f33402d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ArrayList f33403e;

            public C0410a(InterfaceC3913r.a aVar, a aVar2, kd.f fVar, ArrayList arrayList) {
                this.f33400b = aVar;
                this.f33401c = aVar2;
                this.f33402d = fVar;
                this.f33403e = arrayList;
                this.f33399a = aVar;
            }

            @Override // dd.InterfaceC3913r.a
            public void a() {
                this.f33400b.a();
                this.f33401c.h(this.f33402d, new C5515a((Mc.c) C4179C.F0(this.f33403e)));
            }

            @Override // dd.InterfaceC3913r.a
            public InterfaceC3913r.b b(kd.f fVar) {
                return this.f33399a.b(fVar);
            }

            @Override // dd.InterfaceC3913r.a
            public InterfaceC3913r.a c(kd.f fVar, kd.b classId) {
                AbstractC4862t.e(classId, "classId");
                return this.f33399a.c(fVar, classId);
            }

            @Override // dd.InterfaceC3913r.a
            public void d(kd.f fVar, kd.b enumClassId, kd.f enumEntryName) {
                AbstractC4862t.e(enumClassId, "enumClassId");
                AbstractC4862t.e(enumEntryName, "enumEntryName");
                this.f33399a.d(fVar, enumClassId, enumEntryName);
            }

            @Override // dd.InterfaceC3913r.a
            public void e(kd.f fVar, qd.f value) {
                AbstractC4862t.e(value, "value");
                this.f33399a.e(fVar, value);
            }

            @Override // dd.InterfaceC3913r.a
            public void f(kd.f fVar, Object obj) {
                this.f33399a.f(fVar, obj);
            }
        }

        /* JADX INFO: renamed from: dd.d$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements InterfaceC3913r.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f33404a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3899d f33405b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kd.f f33406c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f33407d;

            /* JADX INFO: renamed from: dd.d$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0411a implements InterfaceC3913r.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3913r.a f33408a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3913r.a f33409b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f33410c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ArrayList f33411d;

                public C0411a(InterfaceC3913r.a aVar, b bVar, ArrayList arrayList) {
                    this.f33409b = aVar;
                    this.f33410c = bVar;
                    this.f33411d = arrayList;
                    this.f33408a = aVar;
                }

                @Override // dd.InterfaceC3913r.a
                public void a() {
                    this.f33409b.a();
                    this.f33410c.f33404a.add(new C5515a((Mc.c) C4179C.F0(this.f33411d)));
                }

                @Override // dd.InterfaceC3913r.a
                public InterfaceC3913r.b b(kd.f fVar) {
                    return this.f33408a.b(fVar);
                }

                @Override // dd.InterfaceC3913r.a
                public InterfaceC3913r.a c(kd.f fVar, kd.b classId) {
                    AbstractC4862t.e(classId, "classId");
                    return this.f33408a.c(fVar, classId);
                }

                @Override // dd.InterfaceC3913r.a
                public void d(kd.f fVar, kd.b enumClassId, kd.f enumEntryName) {
                    AbstractC4862t.e(enumClassId, "enumClassId");
                    AbstractC4862t.e(enumEntryName, "enumEntryName");
                    this.f33408a.d(fVar, enumClassId, enumEntryName);
                }

                @Override // dd.InterfaceC3913r.a
                public void e(kd.f fVar, qd.f value) {
                    AbstractC4862t.e(value, "value");
                    this.f33408a.e(fVar, value);
                }

                @Override // dd.InterfaceC3913r.a
                public void f(kd.f fVar, Object obj) {
                    this.f33408a.f(fVar, obj);
                }
            }

            public b(C3899d c3899d, kd.f fVar, a aVar) {
                this.f33405b = c3899d;
                this.f33406c = fVar;
                this.f33407d = aVar;
            }

            @Override // dd.InterfaceC3913r.b
            public void a() {
                this.f33407d.g(this.f33406c, this.f33404a);
            }

            @Override // dd.InterfaceC3913r.b
            public void b(qd.f value) {
                AbstractC4862t.e(value, "value");
                this.f33404a.add(new qd.p(value));
            }

            @Override // dd.InterfaceC3913r.b
            public void c(kd.b enumClassId, kd.f enumEntryName) {
                AbstractC4862t.e(enumClassId, "enumClassId");
                AbstractC4862t.e(enumEntryName, "enumEntryName");
                this.f33404a.add(new qd.j(enumClassId, enumEntryName));
            }

            @Override // dd.InterfaceC3913r.b
            public void d(Object obj) {
                this.f33404a.add(this.f33405b.I(this.f33406c, obj));
            }

            @Override // dd.InterfaceC3913r.b
            public InterfaceC3913r.a e(kd.b classId) {
                AbstractC4862t.e(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C3899d c3899d = this.f33405b;
                a0 NO_SOURCE = a0.f8746a;
                AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
                InterfaceC3913r.a aVarV = c3899d.v(classId, NO_SOURCE, arrayList);
                AbstractC4862t.b(aVarV);
                return new C0411a(aVarV, this, arrayList);
            }
        }

        public a() {
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.b b(kd.f fVar) {
            return new b(C3899d.this, fVar, this);
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.a c(kd.f fVar, kd.b classId) {
            AbstractC4862t.e(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C3899d c3899d = C3899d.this;
            a0 NO_SOURCE = a0.f8746a;
            AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
            InterfaceC3913r.a aVarV = c3899d.v(classId, NO_SOURCE, arrayList);
            AbstractC4862t.b(aVarV);
            return new C0410a(aVarV, this, fVar, arrayList);
        }

        @Override // dd.InterfaceC3913r.a
        public void d(kd.f fVar, kd.b enumClassId, kd.f enumEntryName) {
            AbstractC4862t.e(enumClassId, "enumClassId");
            AbstractC4862t.e(enumEntryName, "enumEntryName");
            h(fVar, new qd.j(enumClassId, enumEntryName));
        }

        @Override // dd.InterfaceC3913r.a
        public void e(kd.f fVar, qd.f value) {
            AbstractC4862t.e(value, "value");
            h(fVar, new qd.p(value));
        }

        @Override // dd.InterfaceC3913r.a
        public void f(kd.f fVar, Object obj) {
            h(fVar, C3899d.this.I(fVar, obj));
        }

        public abstract void g(kd.f fVar, ArrayList arrayList);

        public abstract void h(kd.f fVar, qd.g gVar);
    }

    /* JADX INFO: renamed from: dd.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f33412b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1177e f33414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kd.b f33415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f33416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a0 f33417g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1177e interfaceC1177e, kd.b bVar, List list, a0 a0Var) {
            super();
            this.f33414d = interfaceC1177e;
            this.f33415e = bVar;
            this.f33416f = list;
            this.f33417g = a0Var;
            this.f33412b = new HashMap();
        }

        @Override // dd.InterfaceC3913r.a
        public void a() {
            if (C3899d.this.C(this.f33415e, this.f33412b) || C3899d.this.u(this.f33415e)) {
                return;
            }
            this.f33416f.add(new Mc.d(this.f33414d.p(), this.f33412b, this.f33417g));
        }

        @Override // dd.C3899d.a
        public void g(kd.f fVar, ArrayList elements) {
            AbstractC4862t.e(elements, "elements");
            if (fVar == null) {
                return;
            }
            j0 j0VarB = Vc.a.b(fVar, this.f33414d);
            if (j0VarB != null) {
                HashMap map = this.f33412b;
                qd.h hVar = qd.h.f43439a;
                List listC = Md.a.c(elements);
                E type = j0VarB.getType();
                AbstractC4862t.d(type, "parameter.type");
                map.put(fVar, hVar.a(listC, type));
                return;
            }
            if (C3899d.this.u(this.f33415e) && AbstractC4862t.a(fVar.b(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C5515a) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f33416f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((Mc.c) ((C5515a) it.next()).b());
                }
            }
        }

        @Override // dd.C3899d.a
        public void h(kd.f fVar, qd.g value) {
            AbstractC4862t.e(value, "value");
            if (fVar != null) {
                this.f33412b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3899d(G module, J notFoundClasses, Bd.n storageManager, InterfaceC3911p kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        this.f33395c = module;
        this.f33396d = notFoundClasses;
        this.f33397e = new C6472e(module, notFoundClasses);
    }

    public final qd.g I(kd.f fVar, Object obj) {
        qd.g gVarC = qd.h.f43439a.c(obj);
        if (gVarC != null) {
            return gVarC;
        }
        return qd.k.f43444b.a("Unsupported annotation argument: " + fVar);
    }

    @Override // dd.AbstractC3896a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public qd.g E(String desc, Object initializer) {
        AbstractC4862t.e(desc, "desc");
        AbstractC4862t.e(initializer, "initializer");
        if (F.V("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return qd.h.f43439a.c(initializer);
    }

    @Override // dd.AbstractC3897b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Mc.c y(fd.b proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        return this.f33397e.a(proto, nameResolver);
    }

    public final InterfaceC1177e L(kd.b bVar) {
        return AbstractC1195x.c(this.f33395c, bVar, this.f33396d);
    }

    @Override // dd.AbstractC3896a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public qd.g G(qd.g constant) {
        AbstractC4862t.e(constant, "constant");
        return constant instanceof qd.d ? new qd.v(((Number) ((qd.d) constant).b()).byteValue()) : constant instanceof qd.t ? new qd.y(((Number) ((qd.t) constant).b()).shortValue()) : constant instanceof qd.m ? new qd.w(((Number) ((qd.m) constant).b()).intValue()) : constant instanceof qd.q ? new qd.x(((Number) ((qd.q) constant).b()).longValue()) : constant;
    }

    @Override // dd.AbstractC3897b
    public InterfaceC3913r.a v(kd.b annotationClassId, a0 source, List result) {
        AbstractC4862t.e(annotationClassId, "annotationClassId");
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(result, "result");
        return new b(L(annotationClassId), annotationClassId, result, source);
    }
}
