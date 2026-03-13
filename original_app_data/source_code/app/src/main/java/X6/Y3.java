package X6;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y3 implements InterfaceC2478r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2416j3 f18657a;

    public Y3(Z3 z32, C2416j3 c2416j3) {
        this.f18657a = c2416j3;
        Objects.requireNonNull(z32);
    }

    @Override // X6.InterfaceC2478r2
    public final boolean zza() {
        return Log.isLoggable(this.f18657a.a().z(), 3);
    }
}
