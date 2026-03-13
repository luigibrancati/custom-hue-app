package Fc;

import gc.C4179C;
import gc.C4204q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import jc.C4757a;
import jd.AbstractC4763d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fc.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0833h {

    /* JADX INFO: renamed from: Fc.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC0833h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f3870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f3871b;

        /* JADX INFO: renamed from: Fc.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0058a extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0058a f3872a = new C0058a();

            public C0058a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                AbstractC4862t.d(returnType, "it.returnType");
                return Rc.d.b(returnType);
            }
        }

        /* JADX INFO: renamed from: Fc.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4757a.a(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) {
            super(null);
            AbstractC4862t.e(jClass, "jClass");
            this.f3870a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            AbstractC4862t.d(declaredMethods, "jClass.declaredMethods");
            this.f3871b = C4204q.D0(declaredMethods, new b());
        }

        @Override // Fc.AbstractC0833h
        public String a() {
            return C4179C.q0(this.f3871b, "", "<init>(", ")V", 0, null, C0058a.f3872a, 24, null);
        }

        public final List b() {
            return this.f3871b;
        }
    }

    /* JADX INFO: renamed from: Fc.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC0833h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor f3873a;

        /* JADX INFO: renamed from: Fc.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f3874a = new a();

            public a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class it) {
                AbstractC4862t.d(it, "it");
                return Rc.d.b(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            AbstractC4862t.e(constructor, "constructor");
            this.f3873a = constructor;
        }

        @Override // Fc.AbstractC0833h
        public String a() {
            Class<?>[] parameterTypes = this.f3873a.getParameterTypes();
            AbstractC4862t.d(parameterTypes, "constructor.parameterTypes");
            return C4204q.q0(parameterTypes, "", "<init>(", ")V", 0, null, a.f3874a, 24, null);
        }

        public final Constructor b() {
            return this.f3873a;
        }
    }

    /* JADX INFO: renamed from: Fc.h$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC0833h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f3875a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            AbstractC4862t.e(method, "method");
            this.f3875a = method;
        }

        @Override // Fc.AbstractC0833h
        public String a() {
            return J.b(this.f3875a);
        }

        public final Method b() {
            return this.f3875a;
        }
    }

    /* JADX INFO: renamed from: Fc.h$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC0833h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC4763d.b f3876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC4763d.b signature) {
            super(null);
            AbstractC4862t.e(signature, "signature");
            this.f3876a = signature;
            this.f3877b = signature.a();
        }

        @Override // Fc.AbstractC0833h
        public String a() {
            return this.f3877b;
        }

        public final String b() {
            return this.f3876a.b();
        }
    }

    /* JADX INFO: renamed from: Fc.h$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC0833h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC4763d.b f3878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3879b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC4763d.b signature) {
            super(null);
            AbstractC4862t.e(signature, "signature");
            this.f3878a = signature;
            this.f3879b = signature.a();
        }

        @Override // Fc.AbstractC0833h
        public String a() {
            return this.f3879b;
        }

        public final String b() {
            return this.f3878a.b();
        }

        public final String c() {
            return this.f3878a.c();
        }
    }

    public /* synthetic */ AbstractC0833h(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract String a();

    public AbstractC0833h() {
    }
}
