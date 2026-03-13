package N6;

import H8.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y2 f10136a = new Y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10139d;

    static {
        d.b bVarA = H8.d.a("logEventKey");
        M1 m12 = new M1();
        m12.a(1);
        f10137b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("eventCount");
        M1 m13 = new M1();
        m13.a(2);
        f10138c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("inferenceDurationStats");
        M1 m14 = new M1();
        m14.a(3);
        f10139d = bVarA3.b(m14.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1334h2 c1334h2 = (C1334h2) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10137b, c1334h2.a());
        fVar.e(f10138c, c1334h2.c());
        fVar.e(f10139d, c1334h2.b());
    }
}
