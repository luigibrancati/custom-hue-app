package g4;

import Rd.InterfaceC2166z0;
import androidx.lifecycle.AbstractC2754j;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4139a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2754j f35438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2166z0 f35439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4139a(AbstractC2754j lifecycle, InterfaceC2166z0 job) {
        super(null);
        AbstractC4862t.e(lifecycle, "lifecycle");
        AbstractC4862t.e(job, "job");
        this.f35438a = lifecycle;
        this.f35439b = job;
    }

    @Override // g4.r
    public void a() {
        this.f35438a.c(this);
    }

    @Override // g4.r
    public void b() {
        InterfaceC2166z0.a.a(this.f35439b, null, 1, null);
    }
}
