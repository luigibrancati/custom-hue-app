package u6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b7.C2878l;
import com.google.android.gms.common.api.Status;
import s6.C5785d;

/* JADX INFO: renamed from: u6.Z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5943Z extends AbstractC5931M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5970p f45134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2878l f45135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5969o f45136d;

    public C5943Z(int i10, AbstractC5970p abstractC5970p, C2878l c2878l, InterfaceC5969o interfaceC5969o) {
        super(i10);
        this.f45135c = c2878l;
        this.f45134b = abstractC5970p;
        this.f45136d = interfaceC5969o;
        if (i10 == 2 && abstractC5970p.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // u6.AbstractC5947b0
    public final void a(Status status) {
        this.f45135c.d(this.f45136d.a(status));
    }

    @Override // u6.AbstractC5947b0
    public final void b(Exception exc) {
        this.f45135c.d(exc);
    }

    @Override // u6.AbstractC5947b0
    public final void c(C5973s c5973s, boolean z10) {
        c5973s.a(this.f45135c, z10);
    }

    @Override // u6.AbstractC5947b0
    public final void d(C5919A c5919a) throws DeadObjectException {
        try {
            this.f45134b.b(c5919a.t(), this.f45135c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(AbstractC5947b0.e(e11));
        } catch (RuntimeException e12) {
            this.f45135c.d(e12);
        }
    }

    @Override // u6.AbstractC5931M
    public final C5785d[] f(C5919A c5919a) {
        return this.f45134b.d();
    }

    @Override // u6.AbstractC5931M
    public final boolean g(C5919A c5919a) {
        return this.f45134b.c();
    }
}
