package u6;

import com.google.android.gms.common.api.internal.zacm;
import java.util.Objects;

/* JADX INFO: renamed from: u6.U, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5938U implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z6.j f45129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zacm f45130b;

    public RunnableC5938U(zacm zacmVar, Z6.j jVar) {
        this.f45129a = jVar;
        Objects.requireNonNull(zacmVar);
        this.f45130b = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45130b.L6(this.f45129a);
    }
}
