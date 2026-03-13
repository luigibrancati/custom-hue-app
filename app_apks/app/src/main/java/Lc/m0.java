package Lc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f8756a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f8757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f8758c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f8759c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f8760c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f8761c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f8762c = new d();

        public d() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f8763c = new e();

        public e() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f8764c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // Lc.n0
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f8765c = new g();

        public g() {
            super(TikaCoreProperties.PROTECTED, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f8766c = new h();

        public h() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f8767c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = gc.P.c();
        mapC.put(f.f8764c, 0);
        mapC.put(e.f8763c, 0);
        mapC.put(b.f8760c, 1);
        mapC.put(g.f8765c, 1);
        h hVar = h.f8766c;
        mapC.put(hVar, 2);
        f8757b = gc.P.b(mapC);
        f8758c = hVar;
    }

    public final Integer a(n0 first, n0 second) {
        AbstractC4862t.e(first, "first");
        AbstractC4862t.e(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f8757b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || AbstractC4862t.a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(n0 visibility) {
        AbstractC4862t.e(visibility, "visibility");
        return visibility == e.f8763c || visibility == f.f8764c;
    }
}
