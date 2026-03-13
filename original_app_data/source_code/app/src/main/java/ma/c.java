package ma;

import android.bluetooth.BluetoothDevice;
import ea.C3974b;
import java.util.concurrent.TimeUnit;
import ka.N;
import oa.InterfaceC5260l;
import qa.x;
import ta.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC5260l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3974b f40233a;

        public a(C3974b c3974b) {
            this.f40233a = c3974b;
        }

        @Override // oa.InterfaceC5260l
        public void a(N.a aVar) {
            this.f40233a.accept(aVar);
        }
    }

    public static BluetoothDevice a(String str, F f10) {
        return f10.a(str);
    }

    public static InterfaceC5260l b(C3974b c3974b) {
        return new a(c3974b);
    }

    public static C3974b c() {
        return C3974b.S0(N.a.DISCONNECTED);
    }

    public static x d(Eb.q qVar) {
        return new x(35L, TimeUnit.SECONDS, qVar);
    }

    public static x e(Eb.q qVar) {
        return new x(10L, TimeUnit.SECONDS, qVar);
    }
}
