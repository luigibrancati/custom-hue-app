package Fc;

import gc.C4206t;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0828c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0826a f3856a = AbstractC0827b.a(d.f3864a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0826a f3857b = AbstractC0827b.a(e.f3865a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0826a f3858c = AbstractC0827b.a(a.f3861a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0826a f3859d = AbstractC0827b.a(C0057c.f3863a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC0826a f3860e = AbstractC0827b.a(b.f3862a);

    /* JADX INFO: renamed from: Fc.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3861a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cc.p invoke(Class it) {
            AbstractC4862t.e(it, "it");
            return Dc.c.b(AbstractC0828c.a(it), C4206t.k(), false, C4206t.k());
        }
    }

    /* JADX INFO: renamed from: Fc.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3862a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke(Class it) {
            AbstractC4862t.e(it, "it");
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: renamed from: Fc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0057c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0057c f3863a = new C0057c();

        public C0057c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cc.p invoke(Class it) {
            AbstractC4862t.e(it, "it");
            return Dc.c.b(AbstractC0828c.a(it), C4206t.k(), true, C4206t.k());
        }
    }

    /* JADX INFO: renamed from: Fc.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3864a = new d();

        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0836k invoke(Class it) {
            AbstractC4862t.e(it, "it");
            return new C0836k(it);
        }
    }

    /* JADX INFO: renamed from: Fc.c$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f3865a = new e();

        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(Class it) {
            AbstractC4862t.e(it, "it");
            return new t(it);
        }
    }

    public static final C0836k a(Class jClass) {
        AbstractC4862t.e(jClass, "jClass");
        Object objA = f3856a.a(jClass);
        AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C0836k) objA;
    }

    public static final Cc.g b(Class jClass) {
        AbstractC4862t.e(jClass, "jClass");
        return (Cc.g) f3857b.a(jClass);
    }
}
