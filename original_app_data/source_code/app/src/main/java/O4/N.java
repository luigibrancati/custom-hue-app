package O4;

import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1616u f10978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1593i f10979c;

    public N(C1593i c1593i, String str, InterfaceC1616u interfaceC1616u) {
        this.f10977a = str;
        this.f10978b = interfaceC1616u;
        this.f10979c = c1593i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        F0 f0H0 = this.f10979c.h0(this.f10977a, 9);
        if (f0H0.b() != null) {
            this.f10978b.a(f0H0.a(), f0H0.b());
            return null;
        }
        this.f10978b.a(f0H0.a(), AbstractC3541h0.s());
        return null;
    }
}
