package s1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC2736q;
import androidx.fragment.app.J;
import gc.C4179C;
import gc.Q;
import gc.U;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: s1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5706c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5706c f43985a = new C5706c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0591c f43986b = C0591c.f43988d;

    /* JADX INFO: renamed from: s1.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: s1.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: renamed from: s1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0591c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43987c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0591c f43988d = new C0591c(U.d(), null, Q.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f43989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f43990b;

        /* JADX INFO: renamed from: s1.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        public C0591c(Set flags, b bVar, Map allowedViolations) {
            AbstractC4862t.e(flags, "flags");
            AbstractC4862t.e(allowedViolations, "allowedViolations");
            this.f43989a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f43990b = linkedHashMap;
        }

        public final Set a() {
            return this.f43989a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f43990b;
        }
    }

    public static final void d(String str, m violation) {
        AbstractC4862t.e(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void f(ComponentCallbacksC2736q fragment, String previousFragmentId) {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(previousFragmentId, "previousFragmentId");
        C5704a c5704a = new C5704a(fragment, previousFragmentId);
        C5706c c5706c = f43985a;
        c5706c.e(c5704a);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_FRAGMENT_REUSE) && c5706c.q(c0591cB, fragment.getClass(), c5704a.getClass())) {
            c5706c.c(c0591cB, c5704a);
        }
    }

    public static final void g(ComponentCallbacksC2736q fragment, ViewGroup viewGroup) {
        AbstractC4862t.e(fragment, "fragment");
        C5707d c5707d = new C5707d(fragment, viewGroup);
        C5706c c5706c = f43985a;
        c5706c.e(c5707d);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c5706c.q(c0591cB, fragment.getClass(), c5707d.getClass())) {
            c5706c.c(c0591cB, c5707d);
        }
    }

    public static final void h(ComponentCallbacksC2736q fragment) {
        AbstractC4862t.e(fragment, "fragment");
        C5708e c5708e = new C5708e(fragment);
        C5706c c5706c = f43985a;
        c5706c.e(c5708e);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c5706c.q(c0591cB, fragment.getClass(), c5708e.getClass())) {
            c5706c.c(c0591cB, c5708e);
        }
    }

    public static final void i(ComponentCallbacksC2736q fragment) {
        AbstractC4862t.e(fragment, "fragment");
        C5709f c5709f = new C5709f(fragment);
        C5706c c5706c = f43985a;
        c5706c.e(c5709f);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c5706c.q(c0591cB, fragment.getClass(), c5709f.getClass())) {
            c5706c.c(c0591cB, c5709f);
        }
    }

    public static final void j(ComponentCallbacksC2736q fragment) {
        AbstractC4862t.e(fragment, "fragment");
        g gVar = new g(fragment);
        C5706c c5706c = f43985a;
        c5706c.e(gVar);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c5706c.q(c0591cB, fragment.getClass(), gVar.getClass())) {
            c5706c.c(c0591cB, gVar);
        }
    }

    public static final void k(ComponentCallbacksC2736q fragment) {
        AbstractC4862t.e(fragment, "fragment");
        i iVar = new i(fragment);
        C5706c c5706c = f43985a;
        c5706c.e(iVar);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c5706c.q(c0591cB, fragment.getClass(), iVar.getClass())) {
            c5706c.c(c0591cB, iVar);
        }
    }

    public static final void l(ComponentCallbacksC2736q violatingFragment, ComponentCallbacksC2736q targetFragment, int i10) {
        AbstractC4862t.e(violatingFragment, "violatingFragment");
        AbstractC4862t.e(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i10);
        C5706c c5706c = f43985a;
        c5706c.e(jVar);
        C0591c c0591cB = c5706c.b(violatingFragment);
        if (c0591cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c5706c.q(c0591cB, violatingFragment.getClass(), jVar.getClass())) {
            c5706c.c(c0591cB, jVar);
        }
    }

    public static final void m(ComponentCallbacksC2736q fragment, boolean z10) {
        AbstractC4862t.e(fragment, "fragment");
        k kVar = new k(fragment, z10);
        C5706c c5706c = f43985a;
        c5706c.e(kVar);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c5706c.q(c0591cB, fragment.getClass(), kVar.getClass())) {
            c5706c.c(c0591cB, kVar);
        }
    }

    public static final void n(ComponentCallbacksC2736q fragment, ViewGroup container) {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(container, "container");
        n nVar = new n(fragment, container);
        C5706c c5706c = f43985a;
        c5706c.e(nVar);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c5706c.q(c0591cB, fragment.getClass(), nVar.getClass())) {
            c5706c.c(c0591cB, nVar);
        }
    }

    public static final void o(ComponentCallbacksC2736q fragment, ComponentCallbacksC2736q expectedParentFragment, int i10) {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i10);
        C5706c c5706c = f43985a;
        c5706c.e(oVar);
        C0591c c0591cB = c5706c.b(fragment);
        if (c0591cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c5706c.q(c0591cB, fragment.getClass(), oVar.getClass())) {
            c5706c.c(c0591cB, oVar);
        }
    }

    public final C0591c b(ComponentCallbacksC2736q componentCallbacksC2736q) {
        while (componentCallbacksC2736q != null) {
            if (componentCallbacksC2736q.isAdded()) {
                J parentFragmentManager = componentCallbacksC2736q.getParentFragmentManager();
                AbstractC4862t.d(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.E0() != null) {
                    C0591c c0591cE0 = parentFragmentManager.E0();
                    AbstractC4862t.b(c0591cE0);
                    return c0591cE0;
                }
            }
            componentCallbacksC2736q = componentCallbacksC2736q.getParentFragment();
        }
        return f43986b;
    }

    public final void c(C0591c c0591c, final m mVar) {
        ComponentCallbacksC2736q componentCallbacksC2736qA = mVar.a();
        final String name = componentCallbacksC2736qA.getClass().getName();
        if (c0591c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        c0591c.b();
        if (c0591c.a().contains(a.PENALTY_DEATH)) {
            p(componentCallbacksC2736qA, new Runnable() { // from class: s1.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5706c.d(name, mVar);
                }
            });
        }
    }

    public final void e(m mVar) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public final void p(ComponentCallbacksC2736q componentCallbacksC2736q, Runnable runnable) {
        if (!componentCallbacksC2736q.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerH = componentCallbacksC2736q.getParentFragmentManager().y0().h();
        if (AbstractC4862t.a(handlerH.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerH.post(runnable);
        }
    }

    public final boolean q(C0591c c0591c, Class cls, Class cls2) {
        Set set = (Set) c0591c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC4862t.a(cls2.getSuperclass(), m.class) || !C4179C.Y(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
