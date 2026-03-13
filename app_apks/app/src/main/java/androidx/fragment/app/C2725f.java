package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC2741w;
import androidx.fragment.app.C2725f;
import androidx.fragment.app.a0;
import b0.C2777a;
import d.C3794b;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2725f extends a0 {

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends a0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f23243d;

        /* JADX INFO: renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class AnimationAnimationListenerC0293a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0.d f23244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f23245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f23246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f23247d;

            public AnimationAnimationListenerC0293a(a0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f23244a = dVar;
                this.f23245b = viewGroup;
                this.f23246c = view;
                this.f23247d = aVar;
            }

            public static final void b(ViewGroup container, View view, a this$0) {
                AbstractC4862t.e(container, "$container");
                AbstractC4862t.e(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC4862t.e(animation, "animation");
                final ViewGroup viewGroup = this.f23245b;
                final View view = this.f23246c;
                final a aVar = this.f23247d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2725f.a.AnimationAnimationListenerC0293a.b(viewGroup, view, aVar);
                    }
                });
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f23244a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC4862t.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC4862t.e(animation, "animation");
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f23244a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            AbstractC4862t.e(animationInfo, "animationInfo");
            this.f23243d = animationInfo;
        }

        @Override // androidx.fragment.app.a0.b
        public void c(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            a0.d dVarA = this.f23243d.a();
            View view = dVarA.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f23243d.a().e(this);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.a0.b
        public void d(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            if (this.f23243d.b()) {
                this.f23243d.a().e(this);
                return;
            }
            Context context = container.getContext();
            a0.d dVarA = this.f23243d.a();
            View view = dVarA.h().mView;
            b bVar = this.f23243d;
            AbstractC4862t.d(context, "context");
            AbstractC2741w.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f23375a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.g() != a0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f23243d.a().e(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC2741w.b bVar2 = new AbstractC2741w.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0293a(dVarA, container, view, this));
            view.startAnimation(bVar2);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b h() {
            return this.f23243d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends C0294f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC2741w.a f23250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0.d operation, boolean z10) {
            super(operation);
            AbstractC4862t.e(operation, "operation");
            this.f23248b = z10;
        }

        public final AbstractC2741w.a c(Context context) {
            AbstractC4862t.e(context, "context");
            if (this.f23249c) {
                return this.f23250d;
            }
            AbstractC2741w.a aVarB = AbstractC2741w.b(context, a().h(), a().g() == a0.d.b.VISIBLE, this.f23248b);
            this.f23250d = aVarB;
            this.f23249c = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends a0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f23251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AnimatorSet f23252e;

        /* JADX INFO: renamed from: androidx.fragment.app.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f23253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f23254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f23255c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0.d f23256d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f23257e;

            public a(ViewGroup viewGroup, View view, boolean z10, a0.d dVar, c cVar) {
                this.f23253a = viewGroup;
                this.f23254b = view;
                this.f23255c = z10;
                this.f23256d = dVar;
                this.f23257e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                AbstractC4862t.e(anim, "anim");
                this.f23253a.endViewTransition(this.f23254b);
                if (this.f23255c || this.f23256d.g() == a0.d.b.GONE) {
                    a0.d.b bVarG = this.f23256d.g();
                    View viewToAnimate = this.f23254b;
                    AbstractC4862t.d(viewToAnimate, "viewToAnimate");
                    bVarG.b(viewToAnimate, this.f23253a);
                }
                this.f23257e.h().a().e(this.f23257e);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f23256d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            AbstractC4862t.e(animatorInfo, "animatorInfo");
            this.f23251d = animatorInfo;
        }

        @Override // androidx.fragment.app.a0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.a0.b
        public void c(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            AnimatorSet animatorSet = this.f23252e;
            if (animatorSet == null) {
                this.f23251d.a().e(this);
                return;
            }
            a0.d dVarA = this.f23251d.a();
            if (dVarA.m()) {
                e.f23259a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (J.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(dVarA);
                sb2.append(" has been canceled");
                sb2.append(dVarA.m() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.a0.b
        public void d(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            a0.d dVarA = this.f23251d.a();
            AnimatorSet animatorSet = this.f23252e;
            if (animatorSet == null) {
                this.f23251d.a().e(this);
                return;
            }
            animatorSet.start();
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // androidx.fragment.app.a0.b
        public void e(C3794b backEvent, ViewGroup container) {
            AbstractC4862t.e(backEvent, "backEvent");
            AbstractC4862t.e(container, "container");
            a0.d dVarA = this.f23251d.a();
            AnimatorSet animatorSet = this.f23252e;
            if (animatorSet == null) {
                this.f23251d.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.h().mTransitioning) {
                return;
            }
            if (J.L0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + dVarA);
            }
            long jA = d.f23258a.a(animatorSet);
            long jA2 = (long) (backEvent.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (J.L0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + dVarA);
            }
            e.f23259a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.a0.b
        public void f(ViewGroup container) {
            c cVar;
            AbstractC4862t.e(container, "container");
            if (this.f23251d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f23251d;
            AbstractC4862t.d(context, "context");
            AbstractC2741w.a aVarC = bVar.c(context);
            this.f23252e = aVarC != null ? aVarC.f23376b : null;
            a0.d dVarA = this.f23251d.a();
            ComponentCallbacksC2736q componentCallbacksC2736qH = dVarA.h();
            boolean z10 = dVarA.g() == a0.d.b.GONE;
            View view = componentCallbacksC2736qH.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f23252e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f23252e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f23251d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f23258a = new d();

        public final long a(AnimatorSet animatorSet) {
            AbstractC4862t.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f23259a = new e();

        public final void a(AnimatorSet animatorSet) {
            AbstractC4862t.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            AbstractC4862t.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0294f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0.d f23260a;

        public C0294f(a0.d operation) {
            AbstractC4862t.e(operation, "operation");
            this.f23260a = operation;
        }

        public final a0.d a() {
            return this.f23260a;
        }

        public final boolean b() {
            View view = this.f23260a.h().mView;
            a0.d.b bVarA = view != null ? a0.d.b.Companion.a(view) : null;
            a0.d.b bVarG = this.f23260a.g();
            if (bVarA == bVarG) {
                return true;
            }
            a0.d.b bVar = a0.d.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends a0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f23261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a0.d f23262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a0.d f23263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final V f23264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f23265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList f23266i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f23267j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C2777a f23268k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList f23269l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList f23270m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final C2777a f23271n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final C2777a f23272o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f23273p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final U0.d f23274q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f23275r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f23276s;

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f23278b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f23279c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f23278b = viewGroup;
                this.f23279c = obj;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m6invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() {
                g.this.v().e(this.f23278b, this.f23279c);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f23281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f23282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.L f23283d;

            /* JADX INFO: renamed from: androidx.fragment.app.f$g$b$a */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f23284a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f23285b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f23286c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f23284a = gVar;
                    this.f23285b = obj;
                    this.f23286c = viewGroup;
                }

                public static final void c(g this$0, ViewGroup container) {
                    AbstractC4862t.e(this$0, "this$0");
                    AbstractC4862t.e(container, "$container");
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        a0.d dVarA = ((h) it.next()).a();
                        View view = dVarA.h().getView();
                        if (view != null) {
                            dVarA.g().b(view, container);
                        }
                    }
                }

                public static final void e(g this$0) {
                    AbstractC4862t.e(this$0, "this$0");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(this$0);
                    }
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m8invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m8invoke() {
                    List listW = this.f23284a.w();
                    if (listW == null || !listW.isEmpty()) {
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().m()) {
                                if (J.L0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                U0.d dVar = new U0.d();
                                V v10 = this.f23284a.v();
                                ComponentCallbacksC2736q componentCallbacksC2736qH = ((h) this.f23284a.w().get(0)).a().h();
                                Object obj = this.f23285b;
                                final g gVar = this.f23284a;
                                v10.w(componentCallbacksC2736qH, obj, dVar, new Runnable() { // from class: androidx.fragment.app.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C2725f.g.b.a.e(gVar);
                                    }
                                });
                                dVar.a();
                                return;
                            }
                        }
                    }
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    V v11 = this.f23284a.v();
                    Object objS = this.f23284a.s();
                    AbstractC4862t.b(objS);
                    final g gVar2 = this.f23284a;
                    final ViewGroup viewGroup = this.f23286c;
                    v11.d(objS, new Runnable() { // from class: androidx.fragment.app.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2725f.g.b.a.c(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.L l10) {
                super(0);
                this.f23281b = viewGroup;
                this.f23282c = obj;
                this.f23283d = l10;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7invoke() {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f23281b, this.f23282c));
                if (g.this.s() == null) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    g.this.D(true);
                    return;
                }
                this.f23283d.f39776a = new a(g.this, this.f23282c, this.f23281b);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }
        }

        public g(List transitionInfos, a0.d dVar, a0.d dVar2, V transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C2777a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C2777a firstOutViews, C2777a lastInViews, boolean z10) {
            AbstractC4862t.e(transitionInfos, "transitionInfos");
            AbstractC4862t.e(transitionImpl, "transitionImpl");
            AbstractC4862t.e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            AbstractC4862t.e(sharedElementLastInViews, "sharedElementLastInViews");
            AbstractC4862t.e(sharedElementNameMapping, "sharedElementNameMapping");
            AbstractC4862t.e(enteringNames, "enteringNames");
            AbstractC4862t.e(exitingNames, "exitingNames");
            AbstractC4862t.e(firstOutViews, "firstOutViews");
            AbstractC4862t.e(lastInViews, "lastInViews");
            this.f23261d = transitionInfos;
            this.f23262e = dVar;
            this.f23263f = dVar2;
            this.f23264g = transitionImpl;
            this.f23265h = obj;
            this.f23266i = sharedElementFirstOutViews;
            this.f23267j = sharedElementLastInViews;
            this.f23268k = sharedElementNameMapping;
            this.f23269l = enteringNames;
            this.f23270m = exitingNames;
            this.f23271n = firstOutViews;
            this.f23272o = lastInViews;
            this.f23273p = z10;
            this.f23274q = new U0.d();
        }

        public static final void A(a0.d operation, g this$0) {
            AbstractC4862t.e(operation, "$operation");
            AbstractC4862t.e(this$0, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        public static final void p(a0.d dVar, a0.d dVar2, g this$0) {
            AbstractC4862t.e(this$0, "this$0");
            T.a(dVar.h(), dVar2.h(), this$0.f23273p, this$0.f23272o, false);
        }

        public static final void q(V impl, View view, Rect lastInEpicenterRect) {
            AbstractC4862t.e(impl, "$impl");
            AbstractC4862t.e(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        public static final void r(ArrayList transitioningViews) {
            AbstractC4862t.e(transitioningViews, "$transitioningViews");
            T.e(transitioningViews, 4);
        }

        public static final void y(a0.d operation, g this$0) {
            AbstractC4862t.e(operation, "$operation");
            AbstractC4862t.e(this$0, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        public static final void z(kotlin.jvm.internal.L seekCancelLambda) {
            AbstractC4862t.e(seekCancelLambda, "$seekCancelLambda");
            InterfaceC6082a interfaceC6082a = (InterfaceC6082a) seekCancelLambda.f39776a;
            if (interfaceC6082a != null) {
                interfaceC6082a.invoke();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, InterfaceC6082a interfaceC6082a) {
            T.e(arrayList, 4);
            ArrayList arrayListQ = this.f23264g.q(this.f23267j);
            if (J.L0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : this.f23266i) {
                    AbstractC4862t.d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + Y0.E.D(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : this.f23267j) {
                    AbstractC4862t.d(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + Y0.E.D(view2));
                }
            }
            interfaceC6082a.invoke();
            this.f23264g.y(viewGroup, this.f23266i, this.f23267j, arrayListQ, this.f23268k);
            T.e(arrayList, 0);
            this.f23264g.A(this.f23265h, this.f23266i, this.f23267j);
        }

        public final void C(Object obj) {
            this.f23275r = obj;
        }

        public final void D(boolean z10) {
            this.f23276s = z10;
        }

        @Override // androidx.fragment.app.a0.b
        public boolean b() {
            if (!this.f23264g.m()) {
                return false;
            }
            List<h> list = this.f23261d;
            if (list == null || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f23264g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f23265h;
            return obj == null || this.f23264g.n(obj);
        }

        @Override // androidx.fragment.app.a0.b
        public void c(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            this.f23274q.a();
        }

        @Override // androidx.fragment.app.a0.b
        public void d(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            if (!container.isLaidOut() || this.f23276s) {
                for (h hVar : this.f23261d) {
                    a0.d dVarA = hVar.a();
                    if (J.L0(2)) {
                        if (this.f23276s) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + dVarA);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + dVarA);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f23276s = false;
                return;
            }
            Object obj = this.f23275r;
            if (obj != null) {
                V v10 = this.f23264g;
                AbstractC4862t.b(obj);
                v10.c(obj);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f23262e + " to " + this.f23263f);
                    return;
                }
                return;
            }
            C4034q c4034qO = o(container, this.f23263f, this.f23262e);
            ArrayList arrayList = (ArrayList) c4034qO.a();
            Object objB = c4034qO.b();
            List list = this.f23261d;
            ArrayList<a0.d> arrayList2 = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final a0.d dVar : arrayList2) {
                this.f23264g.w(dVar.h(), objB, this.f23274q, new Runnable() { // from class: androidx.fragment.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2725f.g.y(dVar, this);
                    }
                });
            }
            B(arrayList, container, new a(container, objB));
            if (J.L0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f23262e + " to " + this.f23263f);
            }
        }

        @Override // androidx.fragment.app.a0.b
        public void e(C3794b backEvent, ViewGroup container) {
            AbstractC4862t.e(backEvent, "backEvent");
            AbstractC4862t.e(container, "container");
            Object obj = this.f23275r;
            if (obj != null) {
                this.f23264g.t(obj, backEvent.a());
            }
        }

        @Override // androidx.fragment.app.a0.b
        public void f(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f23261d.iterator();
                while (it.hasNext()) {
                    a0.d dVarA = ((h) it.next()).a();
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (x() && this.f23265h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f23265h + " between " + this.f23262e + " and " + this.f23263f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
                C4034q c4034qO = o(container, this.f23263f, this.f23262e);
                ArrayList arrayList = (ArrayList) c4034qO.a();
                Object objB = c4034qO.b();
                List list = this.f23261d;
                ArrayList<a0.d> arrayList2 = new ArrayList(C4207u.v(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final a0.d dVar : arrayList2) {
                    this.f23264g.x(dVar.h(), objB, this.f23274q, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2725f.g.z(l10);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2725f.g.A(dVar, this);
                        }
                    });
                }
                B(arrayList, container, new b(container, objB, l10));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (Y0.I.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC4862t.d(child, "child");
                    n(arrayList, child);
                }
            }
        }

        public final C4034q o(ViewGroup viewGroup, a0.d dVar, final a0.d dVar2) {
            final a0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f23261d.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f23268k.isEmpty() && this.f23265h != null) {
                    T.a(dVar3.h(), dVar2.h(), this.f23273p, this.f23271n, true);
                    Y0.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2725f.g.p(dVar3, dVar2, this);
                        }
                    });
                    this.f23266i.addAll(this.f23271n.values());
                    if (!this.f23270m.isEmpty()) {
                        Object obj = this.f23270m.get(0);
                        AbstractC4862t.d(obj, "exitingNames[0]");
                        view2 = (View) this.f23271n.get((String) obj);
                        this.f23264g.v(this.f23265h, view2);
                    }
                    this.f23267j.addAll(this.f23272o.values());
                    if (!this.f23269l.isEmpty()) {
                        Object obj2 = this.f23269l.get(0);
                        AbstractC4862t.d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f23272o.get((String) obj2);
                        if (view3 != null) {
                            final V v10 = this.f23264g;
                            Y0.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2725f.g.q(v10, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f23264g.z(this.f23265h, view, this.f23266i);
                    V v11 = this.f23264g;
                    Object obj3 = this.f23265h;
                    v11.s(obj3, null, null, null, null, obj3, this.f23267j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f23261d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                a0.d dVarA = hVar.a();
                boolean z11 = z10;
                Object objH = this.f23264g.h(hVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = dVarA.h().mView;
                    AbstractC4862t.d(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f23265h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(C4179C.Z0(this.f23266i));
                        } else {
                            arrayList2.removeAll(C4179C.Z0(this.f23267j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f23264g.a(objH, view);
                    } else {
                        this.f23264g.b(objH, arrayList2);
                        this.f23264g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.g() == a0.d.b.GONE) {
                            dVarA.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.h().mView);
                            this.f23264g.r(objH, dVarA.h().mView, arrayList3);
                            Y0.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2725f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.g() == a0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.f23264g.u(objH, rect);
                        }
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList2) {
                                AbstractC4862t.d(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f23264g.v(objH, view2);
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList2) {
                                AbstractC4862t.d(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        objP = this.f23264g.p(objP, objH, null);
                    } else {
                        objP2 = this.f23264g.p(objP2, objH, null);
                    }
                    dVar3 = dVar;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z10 = z11;
                }
            }
            Object objO = this.f23264g.o(objP, objP2, this.f23265h);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO + " for container " + viewGroup);
            }
            return new C4034q(arrayList, objO);
        }

        public final Object s() {
            return this.f23275r;
        }

        public final a0.d t() {
            return this.f23262e;
        }

        public final a0.d u() {
            return this.f23263f;
        }

        public final V v() {
            return this.f23264g;
        }

        public final List w() {
            return this.f23261d;
        }

        public final boolean x() {
            List list = this.f23261d;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends C0294f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f23287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f23289d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a0.d operation, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation);
            AbstractC4862t.e(operation, "operation");
            a0.d.b bVarG = operation.g();
            a0.d.b bVar = a0.d.b.VISIBLE;
            if (bVarG == bVar) {
                ComponentCallbacksC2736q componentCallbacksC2736qH = operation.h();
                returnTransition = z10 ? componentCallbacksC2736qH.getReenterTransition() : componentCallbacksC2736qH.getEnterTransition();
            } else {
                ComponentCallbacksC2736q componentCallbacksC2736qH2 = operation.h();
                returnTransition = z10 ? componentCallbacksC2736qH2.getReturnTransition() : componentCallbacksC2736qH2.getExitTransition();
            }
            this.f23287b = returnTransition;
            this.f23288c = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f23289d = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        public final V c() {
            V vD = d(this.f23287b);
            V vD2 = d(this.f23289d);
            if (vD == null || vD2 == null || vD == vD2) {
                return vD == null ? vD2 : vD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f23287b + " which uses a different Transition  type than its shared element transition " + this.f23289d).toString());
        }

        public final V d(Object obj) {
            if (obj == null) {
                return null;
            }
            V v10 = T.f23157b;
            if (v10 != null && v10.g(obj)) {
                return v10;
            }
            V v11 = T.f23158c;
            if (v11 != null && v11.g(obj)) {
                return v11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f23289d;
        }

        public final Object f() {
            return this.f23287b;
        }

        public final boolean g() {
            return this.f23289d != null;
        }

        public final boolean h() {
            return this.f23288c;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f23290a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f23290a = collection;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC4862t.e(entry, "entry");
            return Boolean.valueOf(C4179C.Y(this.f23290a, Y0.E.D((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2725f(ViewGroup container) {
        super(container);
        AbstractC4862t.e(container, "container");
    }

    public static final void G(C2725f this$0, a0.d operation) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.e(operation, "$operation");
        this$0.c(operation);
    }

    public final void F(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc.y.C(arrayList2, ((b) it.next()).a().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            a0.d dVarA = bVar.a();
            AbstractC4862t.d(context, "context");
            AbstractC2741w.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f23376b == null) {
                    arrayList.add(bVar);
                } else {
                    ComponentCallbacksC2736q componentCallbacksC2736qH = dVarA.h();
                    if (dVarA.f().isEmpty()) {
                        if (dVarA.g() == a0.d.b.GONE) {
                            dVarA.q(false);
                        }
                        dVarA.b(new c(bVar));
                        z10 = true;
                    } else if (J.L0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + componentCallbacksC2736qH + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            a0.d dVarA2 = bVar2.a();
            ComponentCallbacksC2736q componentCallbacksC2736qH2 = dVarA2.h();
            if (zIsEmpty) {
                if (!z10) {
                    dVarA2.b(new a(bVar2));
                } else if (J.L0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC2736qH2 + " as Animations cannot run alongside Animators.");
                }
            } else if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC2736qH2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void H(List list, boolean z10, a0.d dVar, a0.d dVar2) {
        ArrayList arrayList;
        V v10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        Object obj;
        int i10;
        String strB;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).b()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((h) obj3).c() != null) {
                arrayList5.add(obj3);
            }
        }
        Object obj4 = null;
        ArrayList arrayList6 = arrayList5;
        V v11 = null;
        for (h hVar : arrayList5) {
            V vC = hVar.c();
            if (v11 != null && vC != v11) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            v11 = vC;
        }
        if (v11 == null) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        C2777a c2777a = new C2777a();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayList<String> arrayList10 = new ArrayList<>();
        C2777a c2777a2 = new C2777a();
        C2777a c2777a3 = new C2777a();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (!hVar2.g() || dVar == null || dVar2 == null) {
                arrayList = arrayList6;
                v10 = v11;
                arrayList2 = arrayList7;
                arrayList3 = arrayList8;
                it = it2;
            } else {
                Object objB = v11.B(v11.h(hVar2.e()));
                arrayList10 = dVar2.h().getSharedElementSourceNames();
                AbstractC4862t.d(arrayList10, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames = dVar.h().getSharedElementSourceNames();
                AbstractC4862t.d(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = dVar.h().getSharedElementTargetNames();
                AbstractC4862t.d(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                arrayList = arrayList6;
                v10 = v11;
                int i11 = 0;
                while (i11 < size) {
                    ArrayList arrayList11 = arrayList7;
                    int iIndexOf = arrayList10.indexOf(sharedElementTargetNames.get(i11));
                    if (iIndexOf != -1) {
                        arrayList10.set(iIndexOf, sharedElementSourceNames.get(i11));
                    }
                    i11++;
                    arrayList7 = arrayList11;
                }
                arrayList2 = arrayList7;
                arrayList9 = dVar2.h().getSharedElementTargetNames();
                AbstractC4862t.d(arrayList9, "lastIn.fragment.sharedElementTargetNames");
                C4034q c4034qA = !z10 ? AbstractC4040w.a(dVar.h().getExitTransitionCallback(), dVar2.h().getEnterTransitionCallback()) : AbstractC4040w.a(dVar.h().getEnterTransitionCallback(), dVar2.h().getExitTransitionCallback());
                androidx.core.app.x xVar = (androidx.core.app.x) c4034qA.a();
                androidx.core.app.x xVar2 = (androidx.core.app.x) c4034qA.b();
                int size2 = arrayList10.size();
                int i12 = 0;
                while (true) {
                    arrayList3 = arrayList8;
                    if (i12 >= size2) {
                        break;
                    }
                    Iterator it3 = it2;
                    String str = arrayList10.get(i12);
                    AbstractC4862t.d(str, "exitingNames[i]");
                    String str2 = arrayList9.get(i12);
                    AbstractC4862t.d(str2, "enteringNames[i]");
                    c2777a.put(str, str2);
                    i12++;
                    arrayList8 = arrayList3;
                    it2 = it3;
                }
                it = it2;
                int i13 = 2;
                if (J.L0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator<String> it4 = arrayList9.iterator();
                    while (true) {
                        i10 = i13;
                        if (!it4.hasNext()) {
                            break;
                        }
                        Iterator<String> it5 = it4;
                        Log.v("FragmentManager", "Name: " + it4.next());
                        objB = objB;
                        i13 = i10;
                        it4 = it5;
                    }
                    obj = objB;
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it6 = arrayList10.iterator(); it6.hasNext(); it6 = it6) {
                        Log.v("FragmentManager", "Name: " + it6.next());
                    }
                } else {
                    obj = objB;
                    i10 = 2;
                }
                View view = dVar.h().mView;
                AbstractC4862t.d(view, "firstOut.fragment.mView");
                I(c2777a2, view);
                c2777a2.n(arrayList10);
                if (xVar != null) {
                    if (J.L0(i10)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + dVar);
                    }
                    xVar.d(arrayList10, c2777a2);
                    int size3 = arrayList10.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i14 = size3 - 1;
                            Object obj5 = arrayList10.get(size3);
                            AbstractC4862t.d(obj5, "exitingNames[i]");
                            Object obj6 = (String) obj5;
                            View view2 = (View) c2777a2.get(obj6);
                            if (view2 == null) {
                                c2777a.remove(obj6);
                            } else if (!AbstractC4862t.a(obj6, Y0.E.D(view2))) {
                                c2777a.put(Y0.E.D(view2), (String) c2777a.remove(obj6));
                            }
                            if (i14 < 0) {
                                break;
                            } else {
                                size3 = i14;
                            }
                        }
                    }
                } else {
                    c2777a.n(c2777a2.keySet());
                }
                View view3 = dVar2.h().mView;
                AbstractC4862t.d(view3, "lastIn.fragment.mView");
                I(c2777a3, view3);
                c2777a3.n(arrayList9);
                c2777a3.n(c2777a.values());
                if (xVar2 != null) {
                    if (J.L0(i10)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + dVar2);
                    }
                    xVar2.d(arrayList9, c2777a3);
                    int size4 = arrayList9.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i15 = size4 - 1;
                            String str3 = arrayList9.get(size4);
                            AbstractC4862t.d(str3, "enteringNames[i]");
                            String str4 = str3;
                            View view4 = (View) c2777a3.get(str4);
                            if (view4 == null) {
                                String strB2 = T.b(c2777a, str4);
                                if (strB2 != null) {
                                    c2777a.remove(strB2);
                                }
                            } else if (!AbstractC4862t.a(str4, Y0.E.D(view4)) && (strB = T.b(c2777a, str4)) != null) {
                                c2777a.put(strB, Y0.E.D(view4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size4 = i15;
                            }
                        }
                    }
                } else {
                    T.d(c2777a, c2777a3);
                }
                Collection collectionKeySet = c2777a.keySet();
                AbstractC4862t.d(collectionKeySet, "sharedElementNameMapping.keys");
                J(c2777a2, collectionKeySet);
                Collection collectionValues = c2777a.values();
                AbstractC4862t.d(collectionValues, "sharedElementNameMapping.values");
                J(c2777a3, collectionValues);
                if (c2777a.isEmpty()) {
                    Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList6 = arrayList;
                    v11 = v10;
                    arrayList7 = arrayList2;
                    arrayList8 = arrayList3;
                    it2 = it;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            arrayList6 = arrayList;
            v11 = v10;
            arrayList7 = arrayList2;
            arrayList8 = arrayList3;
            it2 = it;
        }
        ArrayList arrayList12 = arrayList6;
        V v12 = v11;
        ArrayList arrayList13 = arrayList7;
        ArrayList arrayList14 = arrayList8;
        if (obj4 == null) {
            if (arrayList12.isEmpty()) {
                return;
            }
            Iterator it7 = arrayList12.iterator();
            while (it7.hasNext()) {
                if (((h) it7.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList12, dVar, dVar2, v12, obj4, arrayList13, arrayList14, c2777a, arrayList9, arrayList10, c2777a2, c2777a3, z10);
        Iterator it8 = arrayList12.iterator();
        while (it8.hasNext()) {
            ((h) it8.next()).a().b(gVar);
        }
    }

    public final void I(Map map, View view) {
        String strD = Y0.E.D(view);
        if (strD != null) {
            map.put(strD, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC4862t.d(child, "child");
                    I(map, child);
                }
            }
        }
    }

    public final void J(C2777a c2777a, Collection collection) {
        Set entries = c2777a.entrySet();
        AbstractC4862t.d(entries, "entries");
        gc.y.M(entries, new i(collection));
    }

    public final void K(List list) {
        ComponentCallbacksC2736q componentCallbacksC2736qH = ((a0.d) C4179C.s0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.d dVar = (a0.d) it.next();
            dVar.h().mAnimationInfo.f23349c = componentCallbacksC2736qH.mAnimationInfo.f23349c;
            dVar.h().mAnimationInfo.f23350d = componentCallbacksC2736qH.mAnimationInfo.f23350d;
            dVar.h().mAnimationInfo.f23351e = componentCallbacksC2736qH.mAnimationInfo.f23351e;
            dVar.h().mAnimationInfo.f23352f = componentCallbacksC2736qH.mAnimationInfo.f23352f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    @Override // androidx.fragment.app.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2725f.d(java.util.List, boolean):void");
    }
}
