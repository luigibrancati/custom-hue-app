package u6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: u6.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentC5959h0 extends Fragment implements InterfaceC5958h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f45182b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5963j0 f45183a = new C5963j0();

    public static FragmentC5959h0 d(Activity activity) {
        FragmentC5959h0 fragmentC5959h0;
        WeakHashMap weakHashMap = f45182b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC5959h0 = (FragmentC5959h0) weakReference.get()) != null) {
            return fragmentC5959h0;
        }
        try {
            FragmentC5959h0 fragmentC5959h02 = (FragmentC5959h0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC5959h02 == null || fragmentC5959h02.isRemoving()) {
                fragmentC5959h02 = new FragmentC5959h0();
                activity.getFragmentManager().beginTransaction().add(fragmentC5959h02, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC5959h02));
            return fragmentC5959h02;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // u6.InterfaceC5958h
    public final void a(String str, AbstractC5956g abstractC5956g) {
        this.f45183a.b(str, abstractC5956g);
    }

    @Override // u6.InterfaceC5958h
    public final AbstractC5956g b(String str, Class cls) {
        return this.f45183a.a(str, cls);
    }

    @Override // u6.InterfaceC5958h
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f45183a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f45183a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45183a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f45183a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f45183a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f45183a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f45183a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f45183a.h();
    }
}
