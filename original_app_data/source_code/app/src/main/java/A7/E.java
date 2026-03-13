package A7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum E implements z {
    INSTANCE;

    private static final AtomicReference zzb = new AtomicReference(null);

    public final void a(A a10) {
        zzb.set(a10);
    }

    @Override // A7.z
    public final A zza() {
        return (A) zzb.get();
    }
}
