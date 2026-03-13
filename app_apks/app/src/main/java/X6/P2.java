package X6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbp;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P2 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2 f18471b;

    public P2(Q2 q22, String str) {
        Objects.requireNonNull(q22);
        this.f18471b = q22;
        this.f18470a = str;
    }

    public final /* synthetic */ String a() {
        return this.f18470a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f18471b.f18480a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.Q qZzb = zzbp.zzb(iBinder);
            if (qZzb == null) {
                this.f18471b.f18480a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            C2416j3 c2416j3 = this.f18471b.f18480a;
            c2416j3.a().w().a("Install Referrer Service connected");
            c2416j3.b().t(new O2(this, qZzb, this));
        } catch (RuntimeException e10) {
            this.f18471b.f18480a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f18471b.f18480a.a().w().a("Install Referrer Service disconnected");
    }
}
