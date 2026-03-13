package oa;

import android.bluetooth.BluetoothGatt;
import ta.C5871i;

/* JADX INFO: renamed from: oa.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5252d {
    public static int a() {
        return 3;
    }

    public static int b() {
        return 23;
    }

    public static BluetoothGatt c(C5249a c5249a) {
        return c5249a.a();
    }

    public static C5871i d() {
        return new C5871i(1, 2, 4, 8, 16, 32, 64);
    }

    public static AbstractC5246D e(boolean z10, X3.a aVar, X3.a aVar2) {
        return z10 ? (AbstractC5246D) aVar.get() : (AbstractC5246D) aVar2.get();
    }

    public static qa.x f(Eb.q qVar, ka.S s10) {
        return new qa.x(s10.f39479b, s10.f39478a, qVar);
    }
}
