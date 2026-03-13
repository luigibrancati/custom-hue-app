package i;

import N0.f;
import Y0.AbstractC2555i;
import Y0.AbstractC2556j;
import Y0.E;
import Y0.M;
import Y0.O;
import Y0.S;
import Y0.w;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2758n;
import b0.J;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h.AbstractC4262a;
import h.AbstractC4264c;
import j.AbstractC4666a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import n.AbstractC5057b;
import n.C5059d;
import n.C5060e;
import n.C5061f;
import n.C5062g;
import org.xmlpull.v1.XmlPullParser;
import p.C5348j;
import p.InterfaceC5327F;
import p.W;
import p.b0;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractC4312e implements e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f36645A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewGroup f36646B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f36647C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f36648D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f36649E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f36650F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f36651G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f36652H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f36653I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f36654J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f36655P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f36656Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public q[] f36657R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public q f36658S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f36659T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f36660V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f36661W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f36662X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Configuration f36663Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f36664Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f36665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f36666k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f36667k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f36668l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f36669l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f36670m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f36671m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC4310c f36672n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public n f36673n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC4308a f36674o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public n f36675o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuInflater f36676p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f36677p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f36678q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f36679q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC5327F f36680r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Runnable f36681r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f36682s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f36683s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f36684t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f36685t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC5057b f36686u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f36687u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f36688v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public i.m f36689v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f36690w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public i.o f36691w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f36692x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedDispatcher f36693x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public M f36694y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public OnBackInvokedCallback f36695y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f36696z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final J f36644z0 = new J();

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f36641A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final int[] f36642B0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final boolean f36643C0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f36679q0 & 1) != 0) {
                gVar.f0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f36679q0 & RecognitionOptions.AZTEC) != 0) {
                gVar2.f0(108);
            }
            g gVar3 = g.this;
            gVar3.f36677p0 = false;
            gVar3.f36679q0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements w {
        public b() {
        }

        @Override // Y0.w
        public S a(View view, S s10) {
            int iK = s10.k();
            int iC1 = g.this.c1(s10, null);
            if (iK != iC1) {
                s10 = s10.p(s10.i(), iC1, s10.j(), s10.h());
            }
            return E.S(view, s10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends O {
            public a() {
            }

            @Override // Y0.O, Y0.N
            public void b(View view) {
                g.this.f36688v.setAlpha(1.0f);
                g.this.f36694y.g(null);
                g.this.f36694y = null;
            }

            @Override // Y0.O, Y0.N
            public void c(View view) {
                g.this.f36688v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f36690w.showAtLocation(gVar.f36688v, 55, 0, 0);
            g.this.g0();
            if (!g.this.R0()) {
                g.this.f36688v.setAlpha(1.0f);
                g.this.f36688v.setVisibility(0);
            } else {
                g.this.f36688v.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f36694y = E.e(gVar2.f36688v).b(1.0f);
                g.this.f36694y.g(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends O {
        public e() {
        }

        @Override // Y0.O, Y0.N
        public void b(View view) {
            g.this.f36688v.setAlpha(1.0f);
            g.this.f36694y.g(null);
            g.this.f36694y = null;
        }

        @Override // Y0.O, Y0.N
        public void c(View view) {
            g.this.f36688v.setVisibility(0);
            if (g.this.f36688v.getParent() instanceof View) {
                E.c0((View) g.this.f36688v.getParent());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            g.this.W(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0 = g.this.s0();
            if (callbackS0 == null) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: i.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0479g implements AbstractC5057b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC5057b.a f36704a;

        /* JADX INFO: renamed from: i.g$g$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends O {
            public a() {
            }

            @Override // Y0.O, Y0.N
            public void b(View view) {
                g.this.f36688v.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f36690w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f36688v.getParent() instanceof View) {
                    E.c0((View) g.this.f36688v.getParent());
                }
                g.this.f36688v.k();
                g.this.f36694y.g(null);
                g gVar2 = g.this;
                gVar2.f36694y = null;
                E.c0(gVar2.f36646B);
            }
        }

        public C0479g(AbstractC5057b.a aVar) {
            this.f36704a = aVar;
        }

        @Override // n.AbstractC5057b.a
        public boolean a(AbstractC5057b abstractC5057b, Menu menu) {
            return this.f36704a.a(abstractC5057b, menu);
        }

        @Override // n.AbstractC5057b.a
        public boolean b(AbstractC5057b abstractC5057b, Menu menu) {
            E.c0(g.this.f36646B);
            return this.f36704a.b(abstractC5057b, menu);
        }

        @Override // n.AbstractC5057b.a
        public boolean c(AbstractC5057b abstractC5057b, MenuItem menuItem) {
            return this.f36704a.c(abstractC5057b, menuItem);
        }

        @Override // n.AbstractC5057b.a
        public void d(AbstractC5057b abstractC5057b) {
            this.f36704a.d(abstractC5057b);
            g gVar = g.this;
            if (gVar.f36690w != null) {
                gVar.f36668l.getDecorView().removeCallbacks(g.this.f36692x);
            }
            g gVar2 = g.this;
            if (gVar2.f36688v != null) {
                gVar2.g0();
                g gVar3 = g.this;
                gVar3.f36694y = E.e(gVar3.f36688v).b(0.0f);
                g.this.f36694y.g(new a());
            }
            g gVar4 = g.this;
            InterfaceC4310c interfaceC4310c = gVar4.f36672n;
            if (interfaceC4310c != null) {
                interfaceC4310c.c(gVar4.f36686u);
            }
            g gVar5 = g.this;
            gVar5.f36686u = null;
            E.c0(gVar5.f36646B);
            g.this.a1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static U0.h b(Configuration configuration) {
            return U0.h.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(U0.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.h()));
        }

        public static void d(Configuration configuration, U0.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.h()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: i.j
                public final void onBackInvoked() {
                    gVar.A0();
                }
            };
            i.i.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            i.i.a(obj).unregisterOnBackInvokedCallback(i.h.a(obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class l extends n.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f36707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36709d;

        public l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f36708c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f36708c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f36707b = true;
                callback.onContentChanged();
            } finally {
                this.f36707b = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f36709d = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f36709d = false;
            }
        }

        @Override // n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f36708c ? a().dispatchKeyEvent(keyEvent) : g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        public final ActionMode e(ActionMode.Callback callback) {
            C5061f.a aVar = new C5061f.a(g.this.f36666k, callback);
            AbstractC5057b abstractC5057bU0 = g.this.U0(aVar);
            if (abstractC5057bU0 != null) {
                return aVar.e(abstractC5057bU0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f36707b) {
                a().onContentChanged();
            }
        }

        @Override // n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // n.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g.this.G0(i10);
            return true;
        }

        @Override // n.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f36709d) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                g.this.H0(i10);
            }
        }

        @Override // n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            q qVarQ0 = g.this.q0(0, true);
            if (qVarQ0 == null || (eVar = qVarQ0.f36728j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (g.this.y0() && i10 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class m extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f36711c;

        public m(Context context) {
            super();
            this.f36711c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // i.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // i.g.n
        public int c() {
            return h.a(this.f36711c) ? 2 : 1;
        }

        @Override // i.g.n
        public void d() {
            g.this.Q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f36713a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        public n() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f36713a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f36666k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f36713a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f36713a == null) {
                this.f36713a = new a();
            }
            g.this.f36666k.registerReceiver(this.f36713a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class o extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i.r f36716c;

        public o(i.r rVar) {
            super();
            this.f36716c = rVar;
        }

        @Override // i.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // i.g.n
        public int c() {
            return this.f36716c.d() ? 2 : 1;
        }

        @Override // i.g.n
        public void d() {
            g.this.Q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        public final boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC4666a.b(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ViewGroup f36725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public View f36726h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public View f36727i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f36728j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f36729k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Context f36730l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36731m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36732n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f36733o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f36734p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f36735q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f36736r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f36737s;

        public q(int i10) {
            this.f36719a = i10;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f36728j == null) {
                return null;
            }
            if (this.f36729k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f36730l, h.g.f35917j);
                this.f36729k = cVar;
                cVar.d(aVar);
                this.f36728j.b(this.f36729k);
            }
            return this.f36729k.j(this.f36725g);
        }

        public boolean b() {
            if (this.f36726h == null) {
                return false;
            }
            return this.f36727i != null || this.f36729k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f36728j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f36729k);
            }
            this.f36728j = eVar;
            if (eVar == null || (cVar = this.f36729k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC4262a.f35792a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(AbstractC4262a.f35784C, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(h.i.f35938a, true);
            }
            C5059d c5059d = new C5059d(context, 0);
            c5059d.getTheme().setTo(themeNewTheme);
            this.f36730l = c5059d;
            TypedArray typedArrayObtainStyledAttributes = c5059d.obtainStyledAttributes(h.j.f36167y0);
            this.f36720b = typedArrayObtainStyledAttributes.getResourceId(h.j.f35947B0, 0);
            this.f36724f = typedArrayObtainStyledAttributes.getResourceId(h.j.f35942A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class r implements i.a {
        public r() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z11 = eVarD != eVar;
            g gVar = g.this;
            if (z11) {
                eVar = eVarD;
            }
            q qVarJ0 = gVar.j0(eVar);
            if (qVarJ0 != null) {
                if (!z11) {
                    g.this.Z(qVarJ0, z10);
                } else {
                    g.this.V(qVarJ0.f36719a, qVarJ0, eVarD);
                    g.this.Z(qVarJ0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0;
            if (eVar != eVar.D()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.f36651G || (callbackS0 = gVar.s0()) == null || g.this.f36662X) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public g(Activity activity, InterfaceC4310c interfaceC4310c) {
        this(activity, null, interfaceC4310c, activity);
    }

    public static Configuration k0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            i.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            j.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    public boolean A0() {
        boolean z10 = this.f36659T;
        this.f36659T = false;
        q qVarQ0 = q0(0, false);
        if (qVarQ0 != null && qVarQ0.f36733o) {
            if (!z10) {
                Z(qVarQ0, true);
            }
            return true;
        }
        AbstractC5057b abstractC5057b = this.f36686u;
        if (abstractC5057b != null) {
            abstractC5057b.c();
            return true;
        }
        AbstractC4308a abstractC4308aR = r();
        return abstractC4308aR != null && abstractC4308aR.g();
    }

    @Override // i.AbstractC4312e
    public void B() {
        P(true, false);
    }

    public boolean B0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f36659T = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // i.AbstractC4312e
    public void C() {
        AbstractC4308a abstractC4308aR = r();
        if (abstractC4308aR != null) {
            abstractC4308aR.r(false);
        }
    }

    public final boolean C0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarQ0 = q0(i10, true);
        if (qVarQ0.f36733o) {
            return false;
        }
        return M0(qVarQ0, keyEvent);
    }

    public boolean D0(int i10, KeyEvent keyEvent) {
        AbstractC4308a abstractC4308aR = r();
        if (abstractC4308aR != null && abstractC4308aR.n(i10, keyEvent)) {
            return true;
        }
        q qVar = this.f36658S;
        if (qVar != null && L0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.f36658S;
            if (qVar2 != null) {
                qVar2.f36732n = true;
            }
            return true;
        }
        if (this.f36658S == null) {
            q qVarQ0 = q0(0, true);
            M0(qVarQ0, keyEvent);
            boolean zL0 = L0(qVarQ0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarQ0.f36731m = false;
            if (zL0) {
                return true;
            }
        }
        return false;
    }

    public boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    @Override // i.AbstractC4312e
    public boolean F(int i10) {
        int iO0 = O0(i10);
        if (this.f36655P && iO0 == 108) {
            return false;
        }
        if (this.f36651G && iO0 == 1) {
            this.f36651G = false;
        }
        if (iO0 == 1) {
            W0();
            this.f36655P = true;
            return true;
        }
        if (iO0 == 2) {
            W0();
            this.f36649E = true;
            return true;
        }
        if (iO0 == 5) {
            W0();
            this.f36650F = true;
            return true;
        }
        if (iO0 == 10) {
            W0();
            this.f36653I = true;
            return true;
        }
        if (iO0 == 108) {
            W0();
            this.f36651G = true;
            return true;
        }
        if (iO0 != 109) {
            return this.f36668l.requestFeature(iO0);
        }
        W0();
        this.f36652H = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            n.b r0 = r4.f36686u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            i.g$q r2 = r4.q0(r5, r0)
            if (r5 != 0) goto L43
            p.F r5 = r4.f36680r
            if (r5 == 0) goto L43
            boolean r5 = r5.a()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f36666k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            p.F r5 = r4.f36680r
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f36662X
            if (r5 != 0) goto L62
            boolean r5 = r4.M0(r2, r6)
            if (r5 == 0) goto L62
            p.F r5 = r4.f36680r
            boolean r0 = r5.c()
            goto L68
        L3c:
            p.F r5 = r4.f36680r
            boolean r0 = r5.b()
            goto L68
        L43:
            boolean r5 = r2.f36733o
            if (r5 != 0) goto L64
            boolean r3 = r2.f36732n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f36731m
            if (r5 == 0) goto L62
            boolean r5 = r2.f36736r
            if (r5 == 0) goto L5b
            r2.f36731m = r1
            boolean r5 = r4.M0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.J0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.Z(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r4 = r4.f36666k
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L7e
            r4.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.F0(int, android.view.KeyEvent):boolean");
    }

    @Override // i.AbstractC4312e
    public void G(int i10) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f36646B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f36666k).inflate(i10, viewGroup);
        this.f36670m.c(this.f36668l.getCallback());
    }

    public void G0(int i10) {
        AbstractC4308a abstractC4308aR;
        if (i10 != 108 || (abstractC4308aR = r()) == null) {
            return;
        }
        abstractC4308aR.h(true);
    }

    @Override // i.AbstractC4312e
    public void H(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f36646B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f36670m.c(this.f36668l.getCallback());
    }

    public void H0(int i10) {
        if (i10 == 108) {
            AbstractC4308a abstractC4308aR = r();
            if (abstractC4308aR != null) {
                abstractC4308aR.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            q qVarQ0 = q0(i10, true);
            if (qVarQ0.f36733o) {
                Z(qVarQ0, false);
            }
        }
    }

    @Override // i.AbstractC4312e
    public void I(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f36646B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f36670m.c(this.f36668l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // i.AbstractC4312e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.J(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f36693x0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f36695y0
            if (r1 == 0) goto L11
            i.g.k.c(r0, r1)
            r0 = 0
            r2.f36695y0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f36665j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f36665j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = i.g.k.a(r3)
            r2.f36693x0 = r3
            goto L2e
        L2c:
            r2.f36693x0 = r3
        L2e:
            r2.a1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.J(android.window.OnBackInvokedDispatcher):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(i.g.q r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.J0(i.g$q, android.view.KeyEvent):void");
    }

    @Override // i.AbstractC4312e
    public void K(int i10) {
        this.f36667k0 = i10;
    }

    public final AbstractC4308a K0() {
        return this.f36674o;
    }

    @Override // i.AbstractC4312e
    public final void L(CharSequence charSequence) {
        this.f36678q = charSequence;
        InterfaceC5327F interfaceC5327F = this.f36680r;
        if (interfaceC5327F != null) {
            interfaceC5327F.setWindowTitle(charSequence);
            return;
        }
        if (K0() != null) {
            K0().s(charSequence);
            return;
        }
        TextView textView = this.f36647C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean L0(q qVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f36731m || M0(qVar, keyEvent)) && (eVar = qVar.f36728j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f36680r == null) {
            Z(qVar, true);
        }
        return zPerformShortcut;
    }

    public final boolean M0(q qVar, KeyEvent keyEvent) {
        InterfaceC5327F interfaceC5327F;
        InterfaceC5327F interfaceC5327F2;
        InterfaceC5327F interfaceC5327F3;
        if (this.f36662X) {
            return false;
        }
        if (qVar.f36731m) {
            return true;
        }
        q qVar2 = this.f36658S;
        if (qVar2 != null && qVar2 != qVar) {
            Z(qVar2, false);
        }
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null) {
            qVar.f36727i = callbackS0.onCreatePanelView(qVar.f36719a);
        }
        int i10 = qVar.f36719a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC5327F3 = this.f36680r) != null) {
            interfaceC5327F3.f();
        }
        if (qVar.f36727i == null) {
            if (z10) {
                K0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f36728j;
            if (eVar == null || qVar.f36736r) {
                if (eVar == null && (!w0(qVar) || qVar.f36728j == null)) {
                    return false;
                }
                if (z10 && this.f36680r != null) {
                    if (this.f36682s == null) {
                        this.f36682s = new f();
                    }
                    this.f36680r.d(qVar.f36728j, this.f36682s);
                }
                qVar.f36728j.e0();
                if (!callbackS0.onCreatePanelMenu(qVar.f36719a, qVar.f36728j)) {
                    qVar.c(null);
                    if (z10 && (interfaceC5327F = this.f36680r) != null) {
                        interfaceC5327F.d(null, this.f36682s);
                    }
                    return false;
                }
                qVar.f36736r = false;
            }
            qVar.f36728j.e0();
            Bundle bundle = qVar.f36737s;
            if (bundle != null) {
                qVar.f36728j.Q(bundle);
                qVar.f36737s = null;
            }
            if (!callbackS0.onPreparePanel(0, qVar.f36727i, qVar.f36728j)) {
                if (z10 && (interfaceC5327F2 = this.f36680r) != null) {
                    interfaceC5327F2.d(null, this.f36682s);
                }
                qVar.f36728j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f36734p = z11;
            qVar.f36728j.setQwertyMode(z11);
            qVar.f36728j.d0();
        }
        qVar.f36731m = true;
        qVar.f36732n = false;
        this.f36658S = qVar;
        return true;
    }

    public final void N0(boolean z10) {
        InterfaceC5327F interfaceC5327F = this.f36680r;
        if (interfaceC5327F == null || !interfaceC5327F.a() || (ViewConfiguration.get(this.f36666k).hasPermanentMenuKey() && !this.f36680r.g())) {
            q qVarQ0 = q0(0, true);
            qVarQ0.f36735q = true;
            Z(qVarQ0, false);
            J0(qVarQ0, null);
            return;
        }
        Window.Callback callbackS0 = s0();
        if (this.f36680r.e() && z10) {
            this.f36680r.b();
            if (this.f36662X) {
                return;
            }
            callbackS0.onPanelClosed(108, q0(0, true).f36728j);
            return;
        }
        if (callbackS0 == null || this.f36662X) {
            return;
        }
        if (this.f36677p0 && (this.f36679q0 & 1) != 0) {
            this.f36668l.getDecorView().removeCallbacks(this.f36681r0);
            this.f36681r0.run();
        }
        q qVarQ02 = q0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarQ02.f36728j;
        if (eVar == null || qVarQ02.f36736r || !callbackS0.onPreparePanel(0, qVarQ02.f36727i, eVar)) {
            return;
        }
        callbackS0.onMenuOpened(108, qVarQ02.f36728j);
        this.f36680r.c();
    }

    public final boolean O(boolean z10) {
        return P(z10, true);
    }

    public final int O0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean P(boolean z10, boolean z11) {
        if (this.f36662X) {
            return false;
        }
        int iU = U();
        int iZ0 = z0(this.f36666k, iU);
        U0.h hVarT = Build.VERSION.SDK_INT < 33 ? T(this.f36666k) : null;
        if (!z11 && hVarT != null) {
            hVarT = p0(this.f36666k.getResources().getConfiguration());
        }
        boolean zZ0 = Z0(iZ0, hVarT, z10);
        if (iU == 0) {
            o0(this.f36666k).e();
        } else {
            n nVar = this.f36673n0;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iU == 3) {
            n0(this.f36666k).e();
            return zZ0;
        }
        n nVar2 = this.f36675o0;
        if (nVar2 != null) {
            nVar2.a();
        }
        return zZ0;
    }

    public void P0(Configuration configuration, U0.h hVar) {
        i.d(configuration, hVar);
    }

    public boolean Q() {
        return O(true);
    }

    public void Q0(U0.h hVar) {
        i.c(hVar);
    }

    public final void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f36646B.findViewById(R.id.content);
        View decorView = this.f36668l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f36666k.obtainStyledAttributes(h.j.f36167y0);
        typedArrayObtainStyledAttributes.getValue(h.j.f35983K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(h.j.f35987L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f35975I0)) {
            typedArrayObtainStyledAttributes.getValue(h.j.f35975I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f35979J0)) {
            typedArrayObtainStyledAttributes.getValue(h.j.f35979J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f35967G0)) {
            typedArrayObtainStyledAttributes.getValue(h.j.f35967G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f35971H0)) {
            typedArrayObtainStyledAttributes.getValue(h.j.f35971H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean R0() {
        ViewGroup viewGroup;
        return this.f36645A && (viewGroup = this.f36646B) != null && viewGroup.isLaidOut();
    }

    public final void S(Window window) {
        if (this.f36668l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f36670m = lVar;
        window.setCallback(lVar);
        W wU = W.u(this.f36666k, null, f36642B0);
        Drawable drawableH = wU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        wU.x();
        this.f36668l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f36693x0 != null) {
            return;
        }
        J(null);
    }

    public final boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f36668l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public U0.h T(Context context) {
        U0.h hVarQ;
        if (Build.VERSION.SDK_INT >= 33 || (hVarQ = AbstractC4312e.q()) == null) {
            return null;
        }
        U0.h hVarP0 = p0(context.getApplicationContext().getResources().getConfiguration());
        U0.h hVarB = i.p.b(hVarQ, hVarP0);
        return hVarB.f() ? hVarP0 : hVarB;
    }

    public boolean T0() {
        if (this.f36693x0 == null) {
            return false;
        }
        q qVarQ0 = q0(0, false);
        return (qVarQ0 != null && qVarQ0.f36733o) || this.f36686u != null;
    }

    public final int U() {
        int i10 = this.f36664Z;
        return i10 != -100 ? i10 : AbstractC4312e.m();
    }

    public AbstractC5057b U0(AbstractC5057b.a aVar) {
        InterfaceC4310c interfaceC4310c;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC5057b abstractC5057b = this.f36686u;
        if (abstractC5057b != null) {
            abstractC5057b.c();
        }
        C0479g c0479g = new C0479g(aVar);
        AbstractC4308a abstractC4308aR = r();
        if (abstractC4308aR != null) {
            AbstractC5057b abstractC5057bT = abstractC4308aR.t(c0479g);
            this.f36686u = abstractC5057bT;
            if (abstractC5057bT != null && (interfaceC4310c = this.f36672n) != null) {
                interfaceC4310c.d(abstractC5057bT);
            }
        }
        if (this.f36686u == null) {
            this.f36686u = V0(c0479g);
        }
        a1();
        return this.f36686u;
    }

    public void V(int i10, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.f36657R;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                menu = qVar.f36728j;
            }
        }
        if ((qVar == null || qVar.f36733o) && !this.f36662X) {
            this.f36670m.d(this.f36668l.getCallback(), i10, menu);
        }
    }

    public AbstractC5057b V0(AbstractC5057b.a aVar) {
        AbstractC5057b abstractC5057bB;
        Context c5059d;
        InterfaceC4310c interfaceC4310c;
        g0();
        AbstractC5057b abstractC5057b = this.f36686u;
        if (abstractC5057b != null) {
            abstractC5057b.c();
        }
        if (!(aVar instanceof C0479g)) {
            aVar = new C0479g(aVar);
        }
        InterfaceC4310c interfaceC4310c2 = this.f36672n;
        if (interfaceC4310c2 == null || this.f36662X) {
            abstractC5057bB = null;
        } else {
            try {
                abstractC5057bB = interfaceC4310c2.b(aVar);
            } catch (AbstractMethodError unused) {
                abstractC5057bB = null;
            }
        }
        if (abstractC5057bB != null) {
            this.f36686u = abstractC5057bB;
        } else {
            if (this.f36688v == null) {
                if (this.f36654J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f36666k.getTheme();
                    theme.resolveAttribute(AbstractC4262a.f35795d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f36666k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c5059d = new C5059d(this.f36666k, 0);
                        c5059d.getTheme().setTo(themeNewTheme);
                    } else {
                        c5059d = this.f36666k;
                    }
                    this.f36688v = new ActionBarContextView(c5059d);
                    PopupWindow popupWindow = new PopupWindow(c5059d, (AttributeSet) null, AbstractC4262a.f35797f);
                    this.f36690w = popupWindow;
                    c1.h.b(popupWindow, 2);
                    this.f36690w.setContentView(this.f36688v);
                    this.f36690w.setWidth(-1);
                    c5059d.getTheme().resolveAttribute(AbstractC4262a.f35793b, typedValue, true);
                    this.f36688v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c5059d.getResources().getDisplayMetrics()));
                    this.f36690w.setHeight(-2);
                    this.f36692x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f36646B.findViewById(h.f.f35889h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(l0()));
                        this.f36688v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f36688v != null) {
                g0();
                this.f36688v.k();
                C5060e c5060e = new C5060e(this.f36688v.getContext(), this.f36688v, aVar, this.f36690w == null);
                if (aVar.a(c5060e, c5060e.e())) {
                    c5060e.k();
                    this.f36688v.h(c5060e);
                    this.f36686u = c5060e;
                    if (R0()) {
                        this.f36688v.setAlpha(0.0f);
                        M mB = E.e(this.f36688v).b(1.0f);
                        this.f36694y = mB;
                        mB.g(new e());
                    } else {
                        this.f36688v.setAlpha(1.0f);
                        this.f36688v.setVisibility(0);
                        if (this.f36688v.getParent() instanceof View) {
                            E.c0((View) this.f36688v.getParent());
                        }
                    }
                    if (this.f36690w != null) {
                        this.f36668l.getDecorView().post(this.f36692x);
                    }
                } else {
                    this.f36686u = null;
                }
            }
        }
        AbstractC5057b abstractC5057b2 = this.f36686u;
        if (abstractC5057b2 != null && (interfaceC4310c = this.f36672n) != null) {
            interfaceC4310c.d(abstractC5057b2);
        }
        a1();
        return this.f36686u;
    }

    public void W(androidx.appcompat.view.menu.e eVar) {
        if (this.f36656Q) {
            return;
        }
        this.f36656Q = true;
        this.f36680r.l();
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null && !this.f36662X) {
            callbackS0.onPanelClosed(108, eVar);
        }
        this.f36656Q = false;
    }

    public final void W0() {
        if (this.f36645A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        n nVar = this.f36673n0;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f36675o0;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    public final ActivityC4309b X0() {
        for (Context baseContext = this.f36666k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ActivityC4309b) {
                return (ActivityC4309b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void Y(int i10) {
        Z(q0(i10, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(Configuration configuration) {
        Activity activity = (Activity) this.f36665j;
        if (activity instanceof InterfaceC2758n) {
            if (((InterfaceC2758n) activity).getLifecycle().b().b(AbstractC2754j.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f36661W || this.f36662X) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    public void Z(q qVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC5327F interfaceC5327F;
        if (z10 && qVar.f36719a == 0 && (interfaceC5327F = this.f36680r) != null && interfaceC5327F.e()) {
            W(qVar.f36728j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f36666k.getSystemService("window");
        if (windowManager != null && qVar.f36733o && (viewGroup = qVar.f36725g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                V(qVar.f36719a, qVar, null);
            }
        }
        qVar.f36731m = false;
        qVar.f36732n = false;
        qVar.f36733o = false;
        qVar.f36726h = null;
        qVar.f36735q = true;
        if (this.f36658S == qVar) {
            this.f36658S = null;
        }
        if (qVar.f36719a == 0) {
            a1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z0(int r10, U0.h r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.f36666k
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r9 = r0.a0(r1, r2, r3, r4, r5)
            android.content.Context r10 = r0.f36666k
            int r10 = r0.m0(r10)
            android.content.res.Configuration r11 = r0.f36663Y
            if (r11 != 0) goto L1f
            android.content.Context r11 = r0.f36666k
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
        L1f:
            int r1 = r11.uiMode
            r1 = r1 & 48
            int r4 = r9.uiMode
            r4 = r4 & 48
            U0.h r11 = r0.p0(r11)
            r5 = 0
            if (r3 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            U0.h r6 = r0.p0(r9)
        L34:
            r7 = 0
            if (r1 == r4) goto L3a
            r1 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r1 = r7
        L3b:
            if (r6 == 0) goto L45
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L45
            r1 = r1 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r11 = ~r10
            r11 = r11 & r1
            r8 = 1
            if (r11 == 0) goto L86
            if (r12 == 0) goto L86
            boolean r11 = r0.f36660V
            if (r11 == 0) goto L86
            boolean r11 = i.g.f36643C0
            if (r11 != 0) goto L58
            boolean r11 = r0.f36661W
            if (r11 == 0) goto L86
        L58:
            java.lang.Object r11 = r0.f36665j
            boolean r12 = r11 instanceof android.app.Activity
            if (r12 == 0) goto L86
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L86
            r11 = r1 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r0.f36665j
            android.app.Activity r11 = (android.app.Activity) r11
            android.view.Window r11 = r11.getWindow()
            android.view.View r11 = r11.getDecorView()
            int r9 = r9.getLayoutDirection()
            r11.setLayoutDirection(r9)
        L7d:
            java.lang.Object r9 = r0.f36665j
            android.app.Activity r9 = (android.app.Activity) r9
            androidx.core.app.a.u(r9)
            r9 = r8
            goto L87
        L86:
            r9 = r7
        L87:
            if (r9 != 0) goto L94
            if (r1 == 0) goto L94
            r9 = r1 & r10
            if (r9 != r1) goto L90
            r7 = r8
        L90:
            r0.b1(r4, r6, r7, r5)
            goto L95
        L94:
            r8 = r9
        L95:
            if (r8 == 0) goto Lb1
            java.lang.Object r9 = r0.f36665j
            boolean r10 = r9 instanceof i.ActivityC4309b
            if (r10 == 0) goto Lb1
            r10 = r1 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto La6
            i.b r9 = (i.ActivityC4309b) r9
            r9.U(r2)
        La6:
            r9 = r1 & 4
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r0.f36665j
            i.b r9 = (i.ActivityC4309b) r9
            r9.T(r3)
        Lb1:
            if (r6 == 0) goto Lc4
            android.content.Context r9 = r0.f36666k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            U0.h r9 = r0.p0(r9)
            r0.Q0(r9)
        Lc4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.Z0(int, U0.h, boolean):boolean");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q qVarJ0;
        Window.Callback callbackS0 = s0();
        if (callbackS0 == null || this.f36662X || (qVarJ0 = j0(eVar.D())) == null) {
            return false;
        }
        return callbackS0.onMenuItemSelected(qVarJ0.f36719a, menuItem);
    }

    public final Configuration a0(Context context, int i10, U0.h hVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            P0(configuration2, hVar);
        }
        return configuration2;
    }

    public void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zT0 = T0();
            if (zT0 && this.f36695y0 == null) {
                this.f36695y0 = k.b(this.f36693x0, this);
            } else {
                if (zT0 || (onBackInvokedCallback = this.f36695y0) == null) {
                    return;
                }
                k.c(this.f36693x0, onBackInvokedCallback);
                this.f36695y0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        N0(true);
    }

    public final ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f36666k.obtainStyledAttributes(h.j.f36167y0);
        if (!typedArrayObtainStyledAttributes.hasValue(h.j.f35955D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f35991M0, false)) {
            F(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(h.j.f35955D0, false)) {
            F(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f35959E0, false)) {
            F(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f35963F0, false)) {
            F(10);
        }
        this.f36654J = typedArrayObtainStyledAttributes.getBoolean(h.j.f36172z0, false);
        typedArrayObtainStyledAttributes.recycle();
        i0();
        this.f36668l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f36666k);
        if (this.f36655P) {
            viewGroup = this.f36653I ? (ViewGroup) layoutInflaterFrom.inflate(h.g.f35922o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(h.g.f35921n, (ViewGroup) null);
        } else if (this.f36654J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(h.g.f35913f, (ViewGroup) null);
            this.f36652H = false;
            this.f36651G = false;
        } else if (this.f36651G) {
            TypedValue typedValue = new TypedValue();
            this.f36666k.getTheme().resolveAttribute(AbstractC4262a.f35795d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5059d(this.f36666k, typedValue.resourceId) : this.f36666k).inflate(h.g.f35923p, (ViewGroup) null);
            InterfaceC5327F interfaceC5327F = (InterfaceC5327F) viewGroup.findViewById(h.f.f35897p);
            this.f36680r = interfaceC5327F;
            interfaceC5327F.setWindowCallback(s0());
            if (this.f36652H) {
                this.f36680r.h(109);
            }
            if (this.f36649E) {
                this.f36680r.h(2);
            }
            if (this.f36650F) {
                this.f36680r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f36651G + ", windowActionBarOverlay: " + this.f36652H + ", android:windowIsFloating: " + this.f36654J + ", windowActionModeOverlay: " + this.f36653I + ", windowNoTitle: " + this.f36655P + " }");
        }
        E.q0(viewGroup, new b());
        if (this.f36680r == null) {
            this.f36647C = (TextView) viewGroup.findViewById(h.f.f35878B);
        }
        c0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.f35883b);
        ViewGroup viewGroup2 = (ViewGroup) this.f36668l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f36668l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void b1(int i10, U0.h hVar, boolean z10, Configuration configuration) {
        Resources resources = this.f36666k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            P0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.f36667k0;
        if (i11 != 0) {
            this.f36666k.setTheme(i11);
            this.f36666k.getTheme().applyStyle(this.f36667k0, true);
        }
        if (z10 && (this.f36665j instanceof Activity)) {
            Y0(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f36689v0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f36666k.obtainStyledAttributes(h.j.f36167y0);
            String string = typedArrayObtainStyledAttributes.getString(h.j.f35951C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f36689v0 = new i.m();
            } else {
                try {
                    this.f36689v0 = (i.m) this.f36666k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f36689v0 = new i.m();
                }
            }
        }
        boolean z11 = f36641A0;
        boolean zS0 = false;
        if (z11) {
            if (this.f36691w0 == null) {
                this.f36691w0 = new i.o();
            }
            if (this.f36691w0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zS0 = S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zS0 = true;
                }
                z10 = zS0;
            }
        } else {
            z10 = zS0;
        }
        return this.f36689v0.r(view, str, context, attributeSet, z10, z11, true, b0.c());
    }

    public final int c1(S s10, Rect rect) {
        boolean z10;
        boolean z11;
        int iK = s10 != null ? s10.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f36688v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36688v.getLayoutParams();
            if (this.f36688v.isShown()) {
                if (this.f36685t0 == null) {
                    this.f36685t0 = new Rect();
                    this.f36687u0 = new Rect();
                }
                Rect rect2 = this.f36685t0;
                Rect rect3 = this.f36687u0;
                if (s10 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(s10.i(), s10.k(), s10.j(), s10.h());
                }
                c0.a(this.f36646B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                S sB = E.B(this.f36646B);
                int i13 = sB == null ? 0 : sB.i();
                int iJ = sB == null ? 0 : sB.j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f36648D != null) {
                    View view = this.f36648D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != iJ) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = i13;
                            marginLayoutParams2.rightMargin = iJ;
                            this.f36648D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f36666k);
                    this.f36648D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i13;
                    layoutParams.rightMargin = iJ;
                    this.f36646B.addView(this.f36648D, -1, layoutParams);
                }
                View view3 = this.f36648D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    d1(this.f36648D);
                }
                if (!this.f36653I && z) {
                    iK = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f36688v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f36648D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iK;
    }

    public void d0() {
        androidx.appcompat.view.menu.e eVar;
        InterfaceC5327F interfaceC5327F = this.f36680r;
        if (interfaceC5327F != null) {
            interfaceC5327F.l();
        }
        if (this.f36690w != null) {
            this.f36668l.getDecorView().removeCallbacks(this.f36692x);
            if (this.f36690w.isShowing()) {
                try {
                    this.f36690w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f36690w = null;
        }
        g0();
        q qVarQ0 = q0(0, false);
        if (qVarQ0 == null || (eVar = qVarQ0.f36728j) == null) {
            return;
        }
        eVar.close();
    }

    public final void d1(View view) {
        view.setBackgroundColor((E.F(view) & 8192) != 0 ? L0.a.d(this.f36666k, AbstractC4264c.f35820b) : L0.a.d(this.f36666k, AbstractC4264c.f35819a));
    }

    @Override // i.AbstractC4312e
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.f36646B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f36670m.c(this.f36668l.getCallback());
    }

    public boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f36665j;
        if (((obj instanceof AbstractC2555i.a) || (obj instanceof i.l)) && (decorView = this.f36668l.getDecorView()) != null && AbstractC2555i.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f36670m.b(this.f36668l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    public void f0(int i10) {
        q qVarQ0;
        q qVarQ02 = q0(i10, true);
        if (qVarQ02.f36728j != null) {
            Bundle bundle = new Bundle();
            qVarQ02.f36728j.R(bundle);
            if (bundle.size() > 0) {
                qVarQ02.f36737s = bundle;
            }
            qVarQ02.f36728j.e0();
            qVarQ02.f36728j.clear();
        }
        qVarQ02.f36736r = true;
        qVarQ02.f36735q = true;
        if ((i10 != 108 && i10 != 0) || this.f36680r == null || (qVarQ0 = q0(0, false)) == null) {
            return;
        }
        qVarQ0.f36731m = false;
        M0(qVarQ0, null);
    }

    @Override // i.AbstractC4312e
    public Context g(Context context) {
        g gVar;
        Context context2;
        this.f36660V = true;
        int iZ0 = z0(context, U());
        if (AbstractC4312e.u(context)) {
            AbstractC4312e.N(context);
        }
        U0.h hVarT = T(context);
        if (context instanceof ContextThemeWrapper) {
            gVar = this;
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(gVar.a0(context2, iZ0, hVarT, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            gVar = this;
            context2 = context;
        }
        if (context2 instanceof C5059d) {
            try {
                ((C5059d) context2).a(gVar.a0(context2, iZ0, hVarT, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f36643C0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationA0 = gVar.a0(context2, iZ0, hVarT, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        C5059d c5059d = new C5059d(context2, h.i.f35939b);
        c5059d.a(configurationA0);
        try {
            if (context2.getTheme() != null) {
                f.C0149f.a(c5059d.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(c5059d);
    }

    public void g0() {
        M m10 = this.f36694y;
        if (m10 != null) {
            m10.c();
        }
    }

    public final void h0() {
        if (this.f36645A) {
            return;
        }
        this.f36646B = b0();
        CharSequence charSequenceR0 = r0();
        if (!TextUtils.isEmpty(charSequenceR0)) {
            InterfaceC5327F interfaceC5327F = this.f36680r;
            if (interfaceC5327F != null) {
                interfaceC5327F.setWindowTitle(charSequenceR0);
            } else if (K0() != null) {
                K0().s(charSequenceR0);
            } else {
                TextView textView = this.f36647C;
                if (textView != null) {
                    textView.setText(charSequenceR0);
                }
            }
        }
        R();
        I0(this.f36646B);
        this.f36645A = true;
        q qVarQ0 = q0(0, false);
        if (this.f36662X) {
            return;
        }
        if (qVarQ0 == null || qVarQ0.f36728j == null) {
            x0(108);
        }
    }

    public final void i0() {
        if (this.f36668l == null) {
            Object obj = this.f36665j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.f36668l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // i.AbstractC4312e
    public View j(int i10) {
        h0();
        return this.f36668l.findViewById(i10);
    }

    public q j0(Menu menu) {
        q[] qVarArr = this.f36657R;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f36728j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // i.AbstractC4312e
    public Context l() {
        return this.f36666k;
    }

    public final Context l0() {
        AbstractC4308a abstractC4308aR = r();
        Context contextJ = abstractC4308aR != null ? abstractC4308aR.j() : null;
        return contextJ == null ? this.f36666k : contextJ;
    }

    public final int m0(Context context) {
        if (!this.f36671m0 && (this.f36665j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f36665j.getClass()), 269221888);
                if (activityInfo != null) {
                    this.f36669l0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f36669l0 = 0;
            }
        }
        this.f36671m0 = true;
        return this.f36669l0;
    }

    @Override // i.AbstractC4312e
    public int n() {
        return this.f36664Z;
    }

    public final n n0(Context context) {
        if (this.f36675o0 == null) {
            this.f36675o0 = new m(context);
        }
        return this.f36675o0;
    }

    public final n o0(Context context) {
        if (this.f36673n0 == null) {
            this.f36673n0 = new o(i.r.a(context));
        }
        return this.f36673n0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    @Override // i.AbstractC4312e
    public MenuInflater p() {
        if (this.f36676p == null) {
            t0();
            AbstractC4308a abstractC4308a = this.f36674o;
            this.f36676p = new C5062g(abstractC4308a != null ? abstractC4308a.j() : this.f36666k);
        }
        return this.f36676p;
    }

    public U0.h p0(Configuration configuration) {
        return i.b(configuration);
    }

    public q q0(int i10, boolean z10) {
        q[] qVarArr = this.f36657R;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f36657R = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i10);
        qVarArr[i10] = qVar2;
        return qVar2;
    }

    @Override // i.AbstractC4312e
    public AbstractC4308a r() {
        t0();
        return this.f36674o;
    }

    public final CharSequence r0() {
        Object obj = this.f36665j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f36678q;
    }

    @Override // i.AbstractC4312e
    public void s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f36666k);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC2556j.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final Window.Callback s0() {
        return this.f36668l.getCallback();
    }

    @Override // i.AbstractC4312e
    public void t() {
        if (K0() == null || r().k()) {
            return;
        }
        x0(0);
    }

    public final void t0() {
        h0();
        if (this.f36651G && this.f36674o == null) {
            Object obj = this.f36665j;
            if (obj instanceof Activity) {
                this.f36674o = new s((Activity) this.f36665j, this.f36652H);
            } else if (obj instanceof Dialog) {
                this.f36674o = new s((Dialog) this.f36665j);
            }
            AbstractC4308a abstractC4308a = this.f36674o;
            if (abstractC4308a != null) {
                abstractC4308a.q(this.f36683s0);
            }
        }
    }

    public final boolean u0(q qVar) {
        View view = qVar.f36727i;
        if (view != null) {
            qVar.f36726h = view;
            return true;
        }
        if (qVar.f36728j == null) {
            return false;
        }
        if (this.f36684t == null) {
            this.f36684t = new r();
        }
        View view2 = (View) qVar.a(this.f36684t);
        qVar.f36726h = view2;
        return view2 != null;
    }

    @Override // i.AbstractC4312e
    public void v(Configuration configuration) {
        AbstractC4308a abstractC4308aR;
        if (this.f36651G && this.f36645A && (abstractC4308aR = r()) != null) {
            abstractC4308aR.l(configuration);
        }
        C5348j.b().g(this.f36666k);
        this.f36663Y = new Configuration(this.f36666k.getResources().getConfiguration());
        P(false, false);
    }

    public final boolean v0(q qVar) {
        qVar.d(l0());
        qVar.f36725g = new p(qVar.f36730l);
        qVar.f36721c = 81;
        return true;
    }

    @Override // i.AbstractC4312e
    public void w(Bundle bundle) {
        String strC;
        this.f36660V = true;
        O(false);
        i0();
        Object obj = this.f36665j;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC4308a abstractC4308aK0 = K0();
                if (abstractC4308aK0 == null) {
                    this.f36683s0 = true;
                } else {
                    abstractC4308aK0.q(true);
                }
            }
            AbstractC4312e.d(this);
        }
        this.f36663Y = new Configuration(this.f36666k.getResources().getConfiguration());
        this.f36661W = true;
    }

    public final boolean w0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f36666k;
        int i10 = qVar.f36719a;
        if ((i10 == 0 || i10 == 108) && this.f36680r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC4262a.f35795d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC4262a.f35796e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC4262a.f35796e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C5059d c5059d = new C5059d(context, 0);
                c5059d.getTheme().setTo(themeNewTheme);
                context = c5059d;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // i.AbstractC4312e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36665j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            i.AbstractC4312e.D(r3)
        L9:
            boolean r0 = r3.f36677p0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f36668l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f36681r0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f36662X = r0
            int r0 = r3.f36664Z
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f36665j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            b0.J r0 = i.g.f36644z0
            java.lang.Object r1 = r3.f36665j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f36664Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            b0.J r0 = i.g.f36644z0
            java.lang.Object r1 = r3.f36665j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            i.a r0 = r3.f36674o
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.x():void");
    }

    public final void x0(int i10) {
        this.f36679q0 = (1 << i10) | this.f36679q0;
        if (this.f36677p0) {
            return;
        }
        E.X(this.f36668l.getDecorView(), this.f36681r0);
        this.f36677p0 = true;
    }

    @Override // i.AbstractC4312e
    public void y(Bundle bundle) {
        h0();
    }

    public boolean y0() {
        return this.f36696z;
    }

    @Override // i.AbstractC4312e
    public void z() {
        AbstractC4308a abstractC4308aR = r();
        if (abstractC4308aR != null) {
            abstractC4308aR.r(true);
        }
    }

    public int z0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return o0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return n0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    public g(Dialog dialog, InterfaceC4310c interfaceC4310c) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC4310c, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public g(Context context, Window window, InterfaceC4310c interfaceC4310c, Object obj) {
        ActivityC4309b activityC4309bX0;
        this.f36694y = null;
        this.f36696z = true;
        this.f36664Z = -100;
        this.f36681r0 = new a();
        this.f36666k = context;
        this.f36672n = interfaceC4310c;
        this.f36665j = obj;
        if (this.f36664Z == -100 && (obj instanceof Dialog) && (activityC4309bX0 = X0()) != null) {
            this.f36664Z = activityC4309bX0.P().n();
        }
        if (this.f36664Z == -100) {
            J j10 = f36644z0;
            Integer num = (Integer) j10.get(obj.getClass().getName());
            if (num != null) {
                this.f36664Z = num.intValue();
                j10.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        C5348j.h();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.d0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // i.AbstractC4312e
    public void A(Bundle bundle) {
    }

    public void I0(ViewGroup viewGroup) {
    }
}
