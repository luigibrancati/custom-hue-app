package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC2758n;
import i3.AbstractC4352m;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2734o extends ComponentCallbacksC2736q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f23306a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23315j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Dialog f23317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23320o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f23307b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f23308c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DialogInterface.OnDismissListener f23309d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23310e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23311f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23312g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23313h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23314i = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.x f23316k = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23321p = false;

    /* JADX INFO: renamed from: androidx.fragment.app.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC2734o.this.f23309d.onDismiss(DialogInterfaceOnCancelListenerC2734o.this.f23317l);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2734o.this.f23317l != null) {
                DialogInterfaceOnCancelListenerC2734o dialogInterfaceOnCancelListenerC2734o = DialogInterfaceOnCancelListenerC2734o.this;
                dialogInterfaceOnCancelListenerC2734o.onCancel(dialogInterfaceOnCancelListenerC2734o.f23317l);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2734o.this.f23317l != null) {
                DialogInterfaceOnCancelListenerC2734o dialogInterfaceOnCancelListenerC2734o = DialogInterfaceOnCancelListenerC2734o.this;
                dialogInterfaceOnCancelListenerC2734o.onDismiss(dialogInterfaceOnCancelListenerC2734o.f23317l);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements androidx.lifecycle.x {
        public d() {
        }

        @Override // androidx.lifecycle.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC2758n interfaceC2758n) {
            if (interfaceC2758n == null || !DialogInterfaceOnCancelListenerC2734o.this.f23313h) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC2734o.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC2734o.this.f23317l != null) {
                if (J.L0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC2734o.this.f23317l);
                }
                DialogInterfaceOnCancelListenerC2734o.this.f23317l.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends AbstractC2742x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2742x f23326a;

        public e(AbstractC2742x abstractC2742x) {
            this.f23326a = abstractC2742x;
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public View c(int i10) {
            return this.f23326a.d() ? this.f23326a.c(i10) : DialogInterfaceOnCancelListenerC2734o.this.s(i10);
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public boolean d() {
            return this.f23326a.d() || DialogInterfaceOnCancelListenerC2734o.this.t();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public AbstractC2742x createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        if (this.f23319n) {
            return;
        }
        this.f23319n = true;
        this.f23320o = false;
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f23317l.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f23306a.getLooper()) {
                    onDismiss(this.f23317l);
                } else {
                    this.f23306a.post(this.f23307b);
                }
            }
        }
        this.f23318m = true;
        if (this.f23314i >= 0) {
            if (z12) {
                getParentFragmentManager().c1(this.f23314i, 1);
            } else {
                getParentFragmentManager().a1(this.f23314i, 1, z10);
            }
            this.f23314i = -1;
            return;
        }
        S sP = getParentFragmentManager().p();
        sP.p(true);
        sP.l(this);
        if (z12) {
            sP.h();
        } else if (z10) {
            sP.g();
        } else {
            sP.f();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f23316k);
        if (this.f23320o) {
            return;
        }
        this.f23319n = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23306a = new Handler();
        this.f23313h = this.mContainerId == 0;
        if (bundle != null) {
            this.f23310e = bundle.getInt("android:style", 0);
            this.f23311f = bundle.getInt("android:theme", 0);
            this.f23312g = bundle.getBoolean("android:cancelable", true);
            this.f23313h = bundle.getBoolean("android:showsDialog", this.f23313h);
            this.f23314i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            this.f23318m = true;
            dialog.setOnDismissListener(null);
            this.f23317l.dismiss();
            if (!this.f23319n) {
                onDismiss(this.f23317l);
            }
            this.f23317l = null;
            this.f23321p = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onDetach() {
        super.onDetach();
        if (!this.f23320o && !this.f23319n) {
            this.f23319n = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f23316k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f23318m) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        o(true, true, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f23313h && !this.f23315j) {
            u(bundle);
            if (J.L0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f23317l;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (J.L0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f23313h) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f23310e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f23311f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f23312g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f23313h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f23314i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            this.f23318m = false;
            dialog.show();
            View decorView = this.f23317l.getWindow().getDecorView();
            androidx.lifecycle.S.b(decorView, this);
            androidx.lifecycle.T.a(decorView, this);
            AbstractC4352m.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f23317l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f23317l.onRestoreInstanceState(bundle2);
    }

    public Dialog p() {
        return this.f23317l;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f23317l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f23317l.onRestoreInstanceState(bundle2);
    }

    public int q() {
        return this.f23311f;
    }

    public Dialog r(Bundle bundle) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.w(requireContext(), q());
    }

    public View s(int i10) {
        Dialog dialog = this.f23317l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    public boolean t() {
        return this.f23321p;
    }

    public final void u(Bundle bundle) {
        if (this.f23313h && !this.f23321p) {
            try {
                this.f23315j = true;
                Dialog dialogR = r(bundle);
                this.f23317l = dialogR;
                if (this.f23313h) {
                    x(dialogR, this.f23310e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f23317l.setOwnerActivity((Activity) context);
                    }
                    this.f23317l.setCancelable(this.f23312g);
                    this.f23317l.setOnCancelListener(this.f23308c);
                    this.f23317l.setOnDismissListener(this.f23309d);
                    this.f23321p = true;
                } else {
                    this.f23317l = null;
                }
                this.f23315j = false;
            } catch (Throwable th) {
                this.f23315j = false;
                throw th;
            }
        }
    }

    public final Dialog v() {
        Dialog dialogP = p();
        if (dialogP != null) {
            return dialogP;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void w(boolean z10) {
        this.f23313h = z10;
    }

    public void x(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void y(J j10, String str) {
        this.f23319n = false;
        this.f23320o = true;
        S sP = j10.p();
        sP.p(true);
        sP.d(this, str);
        sP.f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
