package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2754j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import s1.C5706c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2744z f23128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f23129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f23130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f23138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f23140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f23142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f23143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f23144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f23146s;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ComponentCallbacksC2736q f23148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC2754j.b f23154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public AbstractC2754j.b f23155i;

        public a() {
        }

        public a(int i10, ComponentCallbacksC2736q componentCallbacksC2736q) {
            this.f23147a = i10;
            this.f23148b = componentCallbacksC2736q;
            this.f23149c = false;
            AbstractC2754j.b bVar = AbstractC2754j.b.RESUMED;
            this.f23154h = bVar;
            this.f23155i = bVar;
        }

        public a(int i10, ComponentCallbacksC2736q componentCallbacksC2736q, boolean z10) {
            this.f23147a = i10;
            this.f23148b = componentCallbacksC2736q;
            this.f23149c = z10;
            AbstractC2754j.b bVar = AbstractC2754j.b.RESUMED;
            this.f23154h = bVar;
            this.f23155i = bVar;
        }
    }

    @Deprecated
    public S() {
        this.f23130c = new ArrayList();
        this.f23137j = true;
        this.f23145r = false;
        this.f23128a = null;
        this.f23129b = null;
    }

    public S b(int i10, ComponentCallbacksC2736q componentCallbacksC2736q, String str) {
        k(i10, componentCallbacksC2736q, str, 1);
        return this;
    }

    public final S c(ViewGroup viewGroup, ComponentCallbacksC2736q componentCallbacksC2736q, String str) {
        componentCallbacksC2736q.mContainer = viewGroup;
        componentCallbacksC2736q.mInDynamicContainer = true;
        return b(viewGroup.getId(), componentCallbacksC2736q, str);
    }

    public S d(ComponentCallbacksC2736q componentCallbacksC2736q, String str) {
        k(0, componentCallbacksC2736q, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f23130c.add(aVar);
        aVar.f23150d = this.f23131d;
        aVar.f23151e = this.f23132e;
        aVar.f23152f = this.f23133f;
        aVar.f23153g = this.f23134g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public S j() {
        if (this.f23136i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f23137j = false;
        return this;
    }

    public void k(int i10, ComponentCallbacksC2736q componentCallbacksC2736q, String str, int i11) {
        String str2 = componentCallbacksC2736q.mPreviousWho;
        if (str2 != null) {
            C5706c.f(componentCallbacksC2736q, str2);
        }
        Class<?> cls = componentCallbacksC2736q.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC2736q.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC2736q + ": was " + componentCallbacksC2736q.mTag + " now " + str);
            }
            componentCallbacksC2736q.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC2736q + " with tag " + str + " to container view with no id");
            }
            int i12 = componentCallbacksC2736q.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC2736q + ": was " + componentCallbacksC2736q.mFragmentId + " now " + i10);
            }
            componentCallbacksC2736q.mFragmentId = i10;
            componentCallbacksC2736q.mContainerId = i10;
        }
        e(new a(i11, componentCallbacksC2736q));
    }

    public S l(ComponentCallbacksC2736q componentCallbacksC2736q) {
        e(new a(3, componentCallbacksC2736q));
        return this;
    }

    public S m(int i10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        return n(i10, componentCallbacksC2736q, null);
    }

    public S n(int i10, ComponentCallbacksC2736q componentCallbacksC2736q, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i10, componentCallbacksC2736q, str, 2);
        return this;
    }

    public S o(boolean z10, Runnable runnable) {
        if (!z10) {
            j();
        }
        if (this.f23146s == null) {
            this.f23146s = new ArrayList();
        }
        this.f23146s.add(runnable);
        return this;
    }

    public S p(boolean z10) {
        this.f23145r = z10;
        return this;
    }

    public S(C2744z c2744z, ClassLoader classLoader) {
        this.f23130c = new ArrayList();
        this.f23137j = true;
        this.f23145r = false;
        this.f23128a = c2744z;
        this.f23129b = classLoader;
    }
}
