package j4;

import Rd.C2142n;
import Rd.InterfaceC2138l;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import vc.l;

/* JADX INFO: renamed from: j4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4691j extends InterfaceC4690i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38984b = a.f38985a;

    /* JADX INFO: renamed from: j4.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f38985a = new a();

        public static /* synthetic */ InterfaceC4691j b(a aVar, View view, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return aVar.a(view, z10);
        }

        public final InterfaceC4691j a(View view, boolean z10) {
            AbstractC4862t.e(view, "view");
            return new C4687f(view, z10);
        }
    }

    /* JADX INFO: renamed from: j4.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: j4.j$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4691j f38986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver f38987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0508b f38988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC4691j interfaceC4691j, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC0508b viewTreeObserverOnPreDrawListenerC0508b) {
                super(1);
                this.f38986a = interfaceC4691j;
                this.f38987b = viewTreeObserver;
                this.f38988c = viewTreeObserverOnPreDrawListenerC0508b;
            }

            public final void a(Throwable th) {
                InterfaceC4691j interfaceC4691j = this.f38986a;
                ViewTreeObserver viewTreeObserver = this.f38987b;
                AbstractC4862t.d(viewTreeObserver, "viewTreeObserver");
                b.g(interfaceC4691j, viewTreeObserver, this.f38988c);
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: j4.j$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class ViewTreeObserverOnPreDrawListenerC0508b implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f38989a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4691j f38990b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver f38991c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2138l f38992d;

            public ViewTreeObserverOnPreDrawListenerC0508b(InterfaceC4691j interfaceC4691j, ViewTreeObserver viewTreeObserver, InterfaceC2138l interfaceC2138l) {
                this.f38990b = interfaceC4691j;
                this.f38991c = viewTreeObserver;
                this.f38992d = interfaceC2138l;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C4684c c4684cE = b.e(this.f38990b);
                if (c4684cE != null) {
                    InterfaceC4691j interfaceC4691j = this.f38990b;
                    ViewTreeObserver viewTreeObserver = this.f38991c;
                    AbstractC4862t.d(viewTreeObserver, "viewTreeObserver");
                    b.g(interfaceC4691j, viewTreeObserver, this);
                    if (!this.f38989a) {
                        this.f38989a = true;
                        this.f38992d.resumeWith(C4035r.b(c4684cE));
                    }
                }
                return true;
            }
        }

        public static int c(InterfaceC4691j interfaceC4691j, int i10, int i11, int i12, boolean z10) {
            int i13 = i10 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i11 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (i10 != -2) {
                return -1;
            }
            DisplayMetrics displayMetrics = interfaceC4691j.getView().getContext().getResources().getDisplayMetrics();
            return z10 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        public static int d(InterfaceC4691j interfaceC4691j) {
            ViewGroup.LayoutParams layoutParams = interfaceC4691j.getView().getLayoutParams();
            return c(interfaceC4691j, layoutParams == null ? -1 : layoutParams.height, interfaceC4691j.getView().getHeight(), interfaceC4691j.b() ? interfaceC4691j.getView().getPaddingTop() + interfaceC4691j.getView().getPaddingBottom() : 0, false);
        }

        public static C4684c e(InterfaceC4691j interfaceC4691j) {
            int iD;
            int iF = f(interfaceC4691j);
            if (iF > 0 && (iD = d(interfaceC4691j)) > 0) {
                return new C4684c(iF, iD);
            }
            return null;
        }

        public static int f(InterfaceC4691j interfaceC4691j) {
            ViewGroup.LayoutParams layoutParams = interfaceC4691j.getView().getLayoutParams();
            return c(interfaceC4691j, layoutParams == null ? -1 : layoutParams.width, interfaceC4691j.getView().getWidth(), interfaceC4691j.b() ? interfaceC4691j.getView().getPaddingLeft() + interfaceC4691j.getView().getPaddingRight() : 0, true);
        }

        public static void g(InterfaceC4691j interfaceC4691j, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                interfaceC4691j.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static Object h(InterfaceC4691j interfaceC4691j, InterfaceC4988e interfaceC4988e) {
            C4684c c4684cE = e(interfaceC4691j);
            if (c4684cE != null) {
                return c4684cE;
            }
            C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
            c2142n.E();
            ViewTreeObserver viewTreeObserver = interfaceC4691j.getView().getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0508b viewTreeObserverOnPreDrawListenerC0508b = new ViewTreeObserverOnPreDrawListenerC0508b(interfaceC4691j, viewTreeObserver, c2142n);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0508b);
            c2142n.b(new a(interfaceC4691j, viewTreeObserver, viewTreeObserverOnPreDrawListenerC0508b));
            Object objW = c2142n.w();
            if (objW == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objW;
        }
    }

    boolean b();

    View getView();
}
