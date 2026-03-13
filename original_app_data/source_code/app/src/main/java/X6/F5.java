package X6;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c7 f18306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U5 f18308f;

    public F5(U5 u52, AtomicReference atomicReference, String str, String str2, String str3, c7 c7Var, boolean z10) {
        this.f18303a = atomicReference;
        this.f18304b = str2;
        this.f18305c = str3;
        this.f18306d = c7Var;
        this.f18307e = z10;
        Objects.requireNonNull(u52);
        this.f18308f = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        U5 u52;
        InterfaceC2407i2 interfaceC2407i2N;
        AtomicReference atomicReference2 = this.f18303a;
        synchronized (atomicReference2) {
            try {
                try {
                    u52 = this.f18308f;
                    interfaceC2407i2N = u52.N();
                } catch (Throwable th) {
                    this.f18303a.notify();
                    throw th;
                }
            } catch (RemoteException e10) {
                this.f18308f.f18400a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f18304b, e10);
                this.f18303a.set(Collections.EMPTY_LIST);
                atomicReference = this.f18303a;
            }
            if (interfaceC2407i2N == null) {
                u52.f18400a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f18304b, this.f18305c);
                atomicReference2.set(Collections.EMPTY_LIST);
                atomicReference2.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                c7 c7Var = this.f18306d;
                AbstractC6056k.l(c7Var);
                atomicReference2.set(interfaceC2407i2N.l3(this.f18304b, this.f18305c, this.f18307e, c7Var));
            } else {
                atomicReference2.set(interfaceC2407i2N.p0(null, this.f18304b, this.f18305c, this.f18307e));
            }
            u52.J();
            atomicReference = this.f18303a;
            atomicReference.notify();
        }
    }
}
