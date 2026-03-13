package yd;

import Lc.a0;
import fd.c;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.c f48651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd.g f48652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f48653c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final fd.c f48654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f48655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final kd.b f48656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c.EnumC0446c f48657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f48658h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fd.c classProto, hd.c nameResolver, hd.g typeTable, a0 a0Var, a aVar) {
            super(nameResolver, typeTable, a0Var, null);
            AbstractC4862t.e(classProto, "classProto");
            AbstractC4862t.e(nameResolver, "nameResolver");
            AbstractC4862t.e(typeTable, "typeTable");
            this.f48654d = classProto;
            this.f48655e = aVar;
            this.f48656f = x.a(nameResolver, classProto.A0());
            c.EnumC0446c enumC0446c = (c.EnumC0446c) hd.b.f36543f.d(classProto.z0());
            this.f48657g = enumC0446c == null ? c.EnumC0446c.CLASS : enumC0446c;
            Boolean boolD = hd.b.f36544g.d(classProto.z0());
            AbstractC4862t.d(boolD, "IS_INNER.get(classProto.flags)");
            this.f48658h = boolD.booleanValue();
        }

        @Override // yd.z
        public kd.c a() {
            kd.c cVarB = this.f48656f.b();
            AbstractC4862t.d(cVarB, "classId.asSingleFqName()");
            return cVarB;
        }

        public final kd.b e() {
            return this.f48656f;
        }

        public final fd.c f() {
            return this.f48654d;
        }

        public final c.EnumC0446c g() {
            return this.f48657g;
        }

        public final a h() {
            return this.f48655e;
        }

        public final boolean i() {
            return this.f48658h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final kd.c f48659d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kd.c fqName, hd.c nameResolver, hd.g typeTable, a0 a0Var) {
            super(nameResolver, typeTable, a0Var, null);
            AbstractC4862t.e(fqName, "fqName");
            AbstractC4862t.e(nameResolver, "nameResolver");
            AbstractC4862t.e(typeTable, "typeTable");
            this.f48659d = fqName;
        }

        @Override // yd.z
        public kd.c a() {
            return this.f48659d;
        }
    }

    public /* synthetic */ z(hd.c cVar, hd.g gVar, a0 a0Var, AbstractC4854k abstractC4854k) {
        this(cVar, gVar, a0Var);
    }

    public abstract kd.c a();

    public final hd.c b() {
        return this.f48651a;
    }

    public final a0 c() {
        return this.f48653c;
    }

    public final hd.g d() {
        return this.f48652b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    public z(hd.c cVar, hd.g gVar, a0 a0Var) {
        this.f48651a = cVar;
        this.f48652b = gVar;
        this.f48653c = a0Var;
    }
}
