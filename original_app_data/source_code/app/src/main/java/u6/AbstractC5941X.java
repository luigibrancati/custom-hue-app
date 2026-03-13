package u6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b7.C2878l;
import com.google.android.gms.common.api.Status;
import t6.C5844b;

/* JADX INFO: renamed from: u6.X, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5941X extends AbstractC5931M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2878l f45132b;

    public AbstractC5941X(int i10, C2878l c2878l) {
        super(i10);
        this.f45132b = c2878l;
    }

    @Override // u6.AbstractC5947b0
    public final void a(Status status) {
        this.f45132b.d(new C5844b(status));
    }

    @Override // u6.AbstractC5947b0
    public final void b(Exception exc) {
        this.f45132b.d(exc);
    }

    @Override // u6.AbstractC5947b0
    public final void d(C5919A c5919a) throws DeadObjectException {
        try {
            h(c5919a);
        } catch (DeadObjectException e10) {
            a(AbstractC5947b0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(AbstractC5947b0.e(e11));
        } catch (RuntimeException e12) {
            this.f45132b.d(e12);
        }
    }

    public abstract void h(C5919A c5919a);
}
