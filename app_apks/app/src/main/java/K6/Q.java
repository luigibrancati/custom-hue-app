package K6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends AbstractC6157a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f7525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7526c;

    public Q(List list, PendingIntent pendingIntent, String str) {
        this.f7524a = list == null ? c0.n() : c0.p(list);
        this.f7525b = pendingIntent;
        this.f7526c = str;
    }

    public static Q d(List list) {
        AbstractC6056k.m(list, "geofence can't be null.");
        AbstractC6056k.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new Q(list, null, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7524a;
        int iA = w6.c.a(parcel);
        w6.c.y(parcel, 1, list, false);
        w6.c.u(parcel, 2, this.f7525b, i10, false);
        w6.c.w(parcel, 3, this.f7526c, false);
        w6.c.b(parcel, iA);
    }
}
