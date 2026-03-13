package A7;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0679c f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f177d;

    public L(N n10, AbstractC0679c abstractC0679c, Intent intent, Context context) {
        this.f177d = n10;
        this.f174a = abstractC0679c;
        this.f175b = intent;
        this.f176c = context;
    }

    @Override // A7.y
    public final void b() {
        if (this.f175b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f177d.f712a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f175b.putExtra("triggered_from_app_after_verification", true);
            this.f176c.sendBroadcast(this.f175b);
        }
    }

    @Override // A7.y
    public final void y(int i10) {
        N n10 = this.f177d;
        n10.f183g.post(new M(n10, this.f174a, 6, i10));
    }

    @Override // A7.y
    public final void zza() {
        N n10 = this.f177d;
        n10.f183g.post(new M(n10, this.f174a, 5, 0));
    }
}
