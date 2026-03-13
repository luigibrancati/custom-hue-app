package Dd;

import Cd.E;
import Cd.i0;
import Cd.t0;
import Lc.InterfaceC1180h;
import Lc.f0;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pd.InterfaceC5461b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements InterfaceC5461b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f2674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC6082a f2675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f2676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f2677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f2678e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2679a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.f2679a = list;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f2679a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            InterfaceC6082a interfaceC6082a = j.this.f2675b;
            if (interfaceC6082a != null) {
                return (List) interfaceC6082a.invoke();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f2681a = list;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f2681a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f2683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f2683b = gVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listO = j.this.o();
            g gVar = this.f2683b;
            ArrayList arrayList = new ArrayList(C4207u.v(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(((t0) it.next()).X0(gVar));
            }
            return arrayList;
        }
    }

    public j(i0 projection, InterfaceC6082a interfaceC6082a, j jVar, f0 f0Var) {
        AbstractC4862t.e(projection, "projection");
        this.f2674a = projection;
        this.f2675b = interfaceC6082a;
        this.f2676c = jVar;
        this.f2677d = f0Var;
        this.f2678e = C4029l.a(EnumC4031n.PUBLICATION, new b());
    }

    @Override // pd.InterfaceC5461b
    public i0 E() {
        return this.f2674a;
    }

    @Override // Cd.e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List o() {
        List listC = c();
        return listC == null ? C4206t.k() : listC;
    }

    public final List c() {
        return (List) this.f2678e.getValue();
    }

    public final void d(List supertypes) {
        AbstractC4862t.e(supertypes, "supertypes");
        this.f2675b = new c(supertypes);
    }

    @Override // Cd.e0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j p(g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 i0VarP = E().p(kotlinTypeRefiner);
        AbstractC4862t.d(i0VarP, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f2675b != null ? new d(kotlinTypeRefiner) : null;
        j jVar = this.f2676c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(i0VarP, dVar, jVar, this.f2677d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f2676c;
        if (jVar2 != null) {
            this = jVar2;
        }
        j jVar3 = jVar.f2676c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return this == jVar;
    }

    @Override // Cd.e0
    public List getParameters() {
        return C4206t.k();
    }

    public int hashCode() {
        j jVar = this.f2676c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // Cd.e0
    public Ic.g n() {
        E type = E().getType();
        AbstractC4862t.d(type, "projection.type");
        return Hd.a.i(type);
    }

    @Override // Cd.e0
    public InterfaceC1180h q() {
        return null;
    }

    @Override // Cd.e0
    public boolean r() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + E() + ')';
    }

    public /* synthetic */ j(i0 i0Var, InterfaceC6082a interfaceC6082a, j jVar, f0 f0Var, int i10, AbstractC4854k abstractC4854k) {
        this(i0Var, (i10 & 2) != 0 ? null : interfaceC6082a, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : f0Var);
    }

    public /* synthetic */ j(i0 i0Var, List list, j jVar, int i10, AbstractC4854k abstractC4854k) {
        this(i0Var, list, (i10 & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i0 projection, List supertypes, j jVar) {
        this(projection, new a(supertypes), jVar, null, 8, null);
        AbstractC4862t.e(projection, "projection");
        AbstractC4862t.e(supertypes, "supertypes");
    }
}
