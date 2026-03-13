package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.S;
import fc.C4029l;
import fc.InterfaceC4028k;
import i3.AbstractC4352m;
import i3.C4345f;
import i3.C4347h;
import i3.InterfaceC4348i;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class w extends Dialog implements InterfaceC2758n, InterfaceC3789H, S2.d, InterfaceC4348i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2759o f32770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4347h f32771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f32772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f32773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, int i10) {
        super(context, i10);
        AbstractC4862t.e(context, "context");
        this.f32771b = C4347h.f37074c.b(this);
        this.f32772c = C4029l.b(new InterfaceC6082a() { // from class: d.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return w.m(this.f32767a);
            }
        });
        this.f32773d = C4029l.b(new InterfaceC6082a() { // from class: d.u
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return w.k(this.f32768a);
            }
        });
    }

    private final S2.a i() {
        return (S2.a) this.f32772c.getValue();
    }

    public static final C3788G k(final w wVar) {
        return new C3788G(new Runnable() { // from class: d.v
            @Override // java.lang.Runnable
            public final void run() {
                w.l(this.f32769a);
            }
        });
    }

    public static final void l(w wVar) {
        super.onBackPressed();
    }

    public static final S2.a m(w wVar) {
        S2.a aVar = new S2.a();
        wVar.h().c(aVar);
        return aVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC4862t.e(view, "view");
        j();
        super.addContentView(view, layoutParams);
    }

    public final C2759o g() {
        C2759o c2759o = this.f32770a;
        if (c2759o != null) {
            return c2759o;
        }
        C2759o c2759o2 = new C2759o(this);
        this.f32770a = c2759o2;
        return c2759o2;
    }

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return g();
    }

    @Override // d.InterfaceC3789H
    public final C3788G getOnBackPressedDispatcher() {
        return (C3788G) this.f32773d.getValue();
    }

    @Override // i3.InterfaceC4348i
    public C4345f getSavedStateRegistry() {
        return this.f32771b.b();
    }

    public S2.c h() {
        return getOnBackPressedDispatcher().g();
    }

    public void j() {
        Window window = getWindow();
        AbstractC4862t.b(window);
        View decorView = window.getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        S.b(decorView, this);
        Window window2 = getWindow();
        AbstractC4862t.b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC4862t.d(decorView2, "getDecorView(...)");
        AbstractC3792K.a(decorView2, this);
        Window window3 = getWindow();
        AbstractC4862t.b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC4862t.d(decorView3, "getDecorView(...)");
        AbstractC4352m.a(decorView3, this);
        Window window4 = getWindow();
        AbstractC4862t.b(window4);
        View decorView4 = window4.getDecorView();
        AbstractC4862t.d(decorView4, "getDecorView(...)");
        S2.r.a(decorView4, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        i().m();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C3788G onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC4862t.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.i(onBackInvokedDispatcher);
        }
        this.f32771b.d(bundle);
        g().h(AbstractC2754j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC4862t.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f32771b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        g().h(AbstractC2754j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        g().h(AbstractC2754j.a.ON_DESTROY);
        this.f32770a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        j();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC4862t.e(view, "view");
        j();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC4862t.e(view, "view");
        j();
        super.setContentView(view, layoutParams);
    }
}
