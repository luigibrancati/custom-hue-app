package q8;

import android.os.Bundle;
import io.sentry.protocol.Message;
import java.util.Locale;
import l8.InterfaceC4964a;
import s8.InterfaceC5811b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e implements InterfaceC4964a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC5811b f43307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC5811b f43308b;

    public static void b(InterfaceC5811b interfaceC5811b, String str, Bundle bundle) {
        if (interfaceC5811b == null) {
            return;
        }
        interfaceC5811b.onEvent(str, bundle);
    }

    @Override // l8.InterfaceC4964a.b
    public void a(int i10, Bundle bundle) {
        String string;
        r8.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(Message.JsonKeys.PARAMS);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f43307a : this.f43308b, str, bundle);
    }

    public void d(InterfaceC5811b interfaceC5811b) {
        this.f43308b = interfaceC5811b;
    }

    public void e(InterfaceC5811b interfaceC5811b) {
        this.f43307a = interfaceC5811b;
    }
}
