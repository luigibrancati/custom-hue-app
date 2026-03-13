package O4;

import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.InterfaceC3584o1;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: O4.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1596j0 implements InterfaceC3584o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f11097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1606o0 f11098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11099d;

    public C1596j0(C1606o0 c1606o0, int i10, Consumer consumer, Runnable runnable) {
        this.f11099d = i10;
        this.f11096a = consumer;
        this.f11097b = runnable;
        this.f11098c = c1606o0;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3584o1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C1606o0 c1606o0 = this.f11098c;
        if (!C1606o0.x1(iIntValue)) {
            this.f11097b.run();
        } else {
            this.f11096a.accept(c1606o0.y1(this.f11099d, num.intValue()));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3584o1
    public final void b(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f11098c.A1(114, 28, com.android.billingclient.api.d.f26617G);
            AbstractC3524e1.l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f11098c.A1(107, 28, com.android.billingclient.api.d.f26617G);
            AbstractC3524e1.l("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f11097b.run();
    }
}
