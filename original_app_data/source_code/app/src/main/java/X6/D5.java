package X6;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c7 f18215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U5 f18216e;

    public D5(U5 u52, AtomicReference atomicReference, String str, String str2, String str3, c7 c7Var) {
        this.f18212a = atomicReference;
        this.f18213b = str2;
        this.f18214c = str3;
        this.f18215d = c7Var;
        Objects.requireNonNull(u52);
        this.f18216e = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        U5 u52;
        InterfaceC2407i2 interfaceC2407i2N;
        AtomicReference atomicReference2 = this.f18212a;
        synchronized (atomicReference2) {
            try {
                try {
                    u52 = this.f18216e;
                    interfaceC2407i2N = u52.N();
                } catch (Throwable th) {
                    this.f18212a.notify();
                    throw th;
                }
            } catch (RemoteException e10) {
                this.f18216e.f18400a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f18213b, e10);
                this.f18212a.set(Collections.EMPTY_LIST);
                atomicReference = this.f18212a;
            }
            if (interfaceC2407i2N == null) {
                u52.f18400a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f18213b, this.f18214c);
                atomicReference2.set(Collections.EMPTY_LIST);
                atomicReference2.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                c7 c7Var = this.f18215d;
                AbstractC6056k.l(c7Var);
                atomicReference2.set(interfaceC2407i2N.u4(this.f18213b, this.f18214c, c7Var));
            } else {
                atomicReference2.set(interfaceC2407i2N.p1(null, this.f18213b, this.f18214c));
            }
            u52.J();
            atomicReference = this.f18212a;
            atomicReference.notify();
        }
    }
}
