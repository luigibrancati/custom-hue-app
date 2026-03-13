package u6;

import com.google.android.gms.common.api.internal.zacm;
import java.util.Objects;
import s6.C5783b;

/* JADX INFO: renamed from: u6.T, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5937T implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zacm f45128a;

    public RunnableC5937T(zacm zacmVar) {
        Objects.requireNonNull(zacmVar);
        this.f45128a = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45128a.M6().S(new C5783b(4));
    }
}
