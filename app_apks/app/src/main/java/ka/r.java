package ka;

import android.content.Context;
import android.location.LocationManager;
import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39504a;

    public r(X3.a aVar) {
        this.f39504a = aVar;
    }

    public static r a(X3.a aVar) {
        return new r(aVar);
    }

    public static LocationManager c(Context context) {
        return (LocationManager) W3.e.d(InterfaceC4817a.c.q(context));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LocationManager get() {
        return c((Context) this.f39504a.get());
    }
}
