package Sd;

import Rd.J0;
import Wd.InterfaceC2338s;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements InterfaceC2338s {
    @Override // Wd.InterfaceC2338s
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Wd.InterfaceC2338s
    public J0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Wd.InterfaceC2338s
    public int c() {
        return 1073741823;
    }
}
