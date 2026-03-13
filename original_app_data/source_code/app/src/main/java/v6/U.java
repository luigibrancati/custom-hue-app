package v6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f45809a;

    public /* synthetic */ U(V v10, byte[] bArr) {
        Objects.requireNonNull(v10);
        this.f45809a = v10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            V v10 = this.f45809a;
            synchronized (v10.f()) {
                try {
                    S s10 = (S) message.obj;
                    T t10 = (T) v10.f().get(s10);
                    if (t10 != null && t10.g()) {
                        if (t10.d()) {
                            t10.a("GmsClientSupervisor");
                        }
                        v10.f().remove(s10);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        V v11 = this.f45809a;
        synchronized (v11.f()) {
            try {
                S s11 = (S) message.obj;
                T t11 = (T) v11.f().get(s11);
                if (t11 != null && t11.e() == 3) {
                    String strValueOf = String.valueOf(s11);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameI = t11.i();
                    if (componentNameI == null) {
                        componentNameI = s11.c();
                    }
                    if (componentNameI == null) {
                        String strB = s11.b();
                        AbstractC6056k.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    t11.onServiceDisconnected(componentNameI);
                }
            } finally {
            }
        }
        return true;
    }
}
