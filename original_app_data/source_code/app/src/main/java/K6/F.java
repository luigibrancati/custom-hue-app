package K6;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;
import u6.C5960i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends zzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f7490a;

    public F(B b10) {
        this.f7490a = b10;
    }

    public final /* synthetic */ B I6() {
        return this.f7490a;
    }

    public final F K(C5960i c5960i) {
        this.f7490a.a(c5960i);
        return this;
    }

    public final void X() {
        this.f7490a.zza().a();
    }

    @Override // R6.K
    public final void Z3(LocationResult locationResult) {
        this.f7490a.zza().c(new C(this, locationResult));
    }

    @Override // R6.K
    public final void e() {
        this.f7490a.zza().c(new E(this));
    }

    @Override // R6.K
    public final void t1(LocationAvailability locationAvailability) {
        this.f7490a.zza().c(new D(this, locationAvailability));
    }
}
