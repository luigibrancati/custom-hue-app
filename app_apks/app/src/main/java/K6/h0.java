package K6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t6.InterfaceC5851i;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends AbstractC6157a implements InterfaceC5851i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f7553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f7552b = new h0(Status.f29020f);
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    public h0(Status status) {
        this.f7553a = status;
    }

    public final Status d() {
        return this.f7553a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f7553a, i10, false);
        w6.c.b(parcel, iA);
    }
}
