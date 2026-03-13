package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;
import y1.AbstractC6382a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f23420b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6382a.c f23421c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.d f23422a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ O b(b bVar, Q q10, c cVar, AbstractC6382a abstractC6382a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = z1.f.f48702a.b(q10);
            }
            if ((i10 & 4) != 0) {
                abstractC6382a = z1.f.f48702a.a(q10);
            }
            return bVar.a(q10, cVar, abstractC6382a);
        }

        public final O a(Q owner, c factory, AbstractC6382a extras) {
            AbstractC4862t.e(owner, "owner");
            AbstractC4862t.e(factory, "factory");
            AbstractC4862t.e(extras, "extras");
            return new O(owner.getViewModelStore(), factory, extras);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23427a = a.f23428a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f23428a = new a();
        }

        default N a(Class modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            return c(modelClass);
        }

        default N b(Cc.d modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            return a(AbstractC6017a.b(modelClass), extras);
        }

        default N c(Class modelClass) {
            AbstractC4862t.e(modelClass, "modelClass");
            return z1.f.f48702a.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static d f23430c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23429b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AbstractC6382a.c f23431d = O.f23421c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final d a() {
                if (d.f23430c == null) {
                    d.f23430c = new d();
                }
                d dVar = d.f23430c;
                AbstractC4862t.b(dVar);
                return dVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.O.c
        public N a(Class modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            return c(modelClass);
        }

        @Override // androidx.lifecycle.O.c
        public N b(Cc.d modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            return a(AbstractC6017a.b(modelClass), extras);
        }

        @Override // androidx.lifecycle.O.c
        public N c(Class modelClass) {
            AbstractC4862t.e(modelClass, "modelClass");
            return z1.c.f48697a.a(modelClass);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public void d(N viewModel) {
            AbstractC4862t.e(viewModel, "viewModel");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements AbstractC6382a.c {
    }

    static {
        AbstractC6382a.C0671a c0671a = AbstractC6382a.f48333b;
        f23421c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(P store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC4862t.e(store, "store");
        AbstractC4862t.e(factory, "factory");
    }

    public final N a(Cc.d modelClass) {
        AbstractC4862t.e(modelClass, "modelClass");
        return y1.d.e(this.f23422a, modelClass, null, 2, null);
    }

    public N b(Class modelClass) {
        AbstractC4862t.e(modelClass, "modelClass");
        return a(AbstractC6017a.e(modelClass));
    }

    public final N c(String key, Cc.d modelClass) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(modelClass, "modelClass");
        return this.f23422a.d(modelClass, key);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0295a f23423f = new C0295a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static a f23424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AbstractC6382a.c f23425h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Application f23426e;

        /* JADX INFO: renamed from: androidx.lifecycle.O$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0295a {
            public /* synthetic */ C0295a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final a a(Application application) {
                AbstractC4862t.e(application, "application");
                if (a.f23424g == null) {
                    a.f23424g = new a(application);
                }
                a aVar = a.f23424g;
                AbstractC4862t.b(aVar);
                return aVar;
            }

            public C0295a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements AbstractC6382a.c {
        }

        static {
            AbstractC6382a.C0671a c0671a = AbstractC6382a.f48333b;
            f23425h = new b();
        }

        public a(Application application, int i10) {
            this.f23426e = application;
        }

        @Override // androidx.lifecycle.O.d, androidx.lifecycle.O.c
        public N a(Class modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            if (this.f23426e != null) {
                return c(modelClass);
            }
            Application application = (Application) extras.a(f23425h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC2745a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.c(modelClass);
        }

        @Override // androidx.lifecycle.O.d, androidx.lifecycle.O.c
        public N c(Class modelClass) {
            AbstractC4862t.e(modelClass, "modelClass");
            Application application = this.f23426e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final N h(Class cls, Application application) {
            if (!AbstractC2745a.class.isAssignableFrom(cls)) {
                return super.c(cls);
            }
            try {
                N n10 = (N) cls.getConstructor(Application.class).newInstance(application);
                AbstractC4862t.b(n10);
                return n10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC4862t.e(application, "application");
        }
    }

    public O(y1.d dVar) {
        this.f23422a = dVar;
    }

    public /* synthetic */ O(P p10, c cVar, AbstractC6382a abstractC6382a, int i10, AbstractC4854k abstractC4854k) {
        this(p10, cVar, (i10 & 4) != 0 ? AbstractC6382a.b.f48335c : abstractC6382a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(P store, c factory, AbstractC6382a defaultCreationExtras) {
        this(new y1.d(store, factory, defaultCreationExtras));
        AbstractC4862t.e(store, "store");
        AbstractC4862t.e(factory, "factory");
        AbstractC4862t.e(defaultCreationExtras, "defaultCreationExtras");
    }
}
