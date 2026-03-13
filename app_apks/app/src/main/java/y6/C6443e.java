package y6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: y6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6443e extends AbstractC6157a {
    public static final Parcelable.Creator<C6443e> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f48479a;

    public C6443e(PendingIntent pendingIntent) {
        this.f48479a = pendingIntent;
    }

    public PendingIntent d() {
        return this.f48479a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, d(), i10, false);
        w6.c.b(parcel, iA);
    }
}
