package ta;

import android.content.ContentResolver;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44869b;

    public m(X3.a aVar, X3.a aVar2) {
        this.f44868a = aVar;
        this.f44869b = aVar2;
    }

    public static m a(X3.a aVar, X3.a aVar2) {
        return new m(aVar, aVar2);
    }

    public static l c(ContentResolver contentResolver, LocationManager locationManager) {
        return new l(contentResolver, locationManager);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c((ContentResolver) this.f44868a.get(), (LocationManager) this.f44869b.get());
    }
}
