package dd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: renamed from: dd.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3908m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f33440a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f33441b = new d(EnumC5882e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f33442c = new d(EnumC5882e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f33443d = new d(EnumC5882e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f33444e = new d(EnumC5882e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f33445f = new d(EnumC5882e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f33446g = new d(EnumC5882e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f33447h = new d(EnumC5882e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f33448i = new d(EnumC5882e.DOUBLE);

    /* JADX INFO: renamed from: dd.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC3908m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AbstractC3908m f33449j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3908m elementType) {
            super(null);
            AbstractC4862t.e(elementType, "elementType");
            this.f33449j = elementType;
        }

        public final AbstractC3908m i() {
            return this.f33449j;
        }
    }

    /* JADX INFO: renamed from: dd.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final d a() {
            return AbstractC3908m.f33441b;
        }

        public final d b() {
            return AbstractC3908m.f33443d;
        }

        public final d c() {
            return AbstractC3908m.f33442c;
        }

        public final d d() {
            return AbstractC3908m.f33448i;
        }

        public final d e() {
            return AbstractC3908m.f33446g;
        }

        public final d f() {
            return AbstractC3908m.f33445f;
        }

        public final d g() {
            return AbstractC3908m.f33447h;
        }

        public final d h() {
            return AbstractC3908m.f33444e;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: dd.m$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3908m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f33450j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            AbstractC4862t.e(internalName, "internalName");
            this.f33450j = internalName;
        }

        public final String i() {
            return this.f33450j;
        }
    }

    /* JADX INFO: renamed from: dd.m$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC3908m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final EnumC5882e f33451j;

        public d(EnumC5882e enumC5882e) {
            super(null);
            this.f33451j = enumC5882e;
        }

        public final EnumC5882e i() {
            return this.f33451j;
        }
    }

    public /* synthetic */ AbstractC3908m(AbstractC4854k abstractC4854k) {
        this();
    }

    public String toString() {
        return C3910o.f33452a.d(this);
    }

    public AbstractC3908m() {
    }
}
