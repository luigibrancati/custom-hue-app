package Jd;

import Cd.E;
import Cd.M;
import Jd.f;
import Lc.InterfaceC1196y;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6481c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6482d = new a();

        /* JADX INFO: renamed from: Jd.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0111a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0111a f6483a = new C0111a();

            public C0111a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(Ic.g gVar) {
                AbstractC4862t.e(gVar, "$this$null");
                M booleanType = gVar.n();
                AbstractC4862t.d(booleanType, "booleanType");
                return booleanType;
            }
        }

        public a() {
            super("Boolean", C0111a.f6483a, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f6484d = new b();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f6485a = new a();

            public a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(Ic.g gVar) {
                AbstractC4862t.e(gVar, "$this$null");
                M intType = gVar.D();
                AbstractC4862t.d(intType, "intType");
                return intType;
            }
        }

        public b() {
            super("Int", a.f6485a, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f6486d = new c();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f6487a = new a();

            public a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(Ic.g gVar) {
                AbstractC4862t.e(gVar, "$this$null");
                M unitType = gVar.Z();
                AbstractC4862t.d(unitType, "unitType");
                return unitType;
            }
        }

        public c() {
            super("Unit", a.f6487a, null);
        }
    }

    public /* synthetic */ r(String str, vc.l lVar, AbstractC4854k abstractC4854k) {
        this(str, lVar);
    }

    @Override // Jd.f
    public boolean a(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        return AbstractC4862t.a(functionDescriptor.getReturnType(), this.f6480b.invoke(AbstractC5823c.j(functionDescriptor)));
    }

    @Override // Jd.f
    public String b(InterfaceC1196y interfaceC1196y) {
        return f.a.a(this, interfaceC1196y);
    }

    @Override // Jd.f
    public String getDescription() {
        return this.f6481c;
    }

    public r(String str, vc.l lVar) {
        this.f6479a = str;
        this.f6480b = lVar;
        this.f6481c = "must return " + str;
    }
}
