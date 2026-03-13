package G1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class E implements InterfaceC0860h {
    @Override // G1.InterfaceC0860h
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // G1.InterfaceC0860h
    public long b() {
        return System.nanoTime();
    }

    @Override // G1.InterfaceC0860h
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // G1.InterfaceC0860h
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // G1.InterfaceC0860h
    public p e(Looper looper, Handler.Callback callback) {
        return new F(new Handler(looper, callback));
    }

    @Override // G1.InterfaceC0860h
    public void f() {
    }
}
