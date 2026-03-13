package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t6.InterfaceC5851i;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends AbstractC6157a implements InterfaceC5851i {
    public static final Parcelable.Creator<n> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f14823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f14824b;

    public n(Status status, o oVar) {
        this.f14823a = status;
        this.f14824b = oVar;
    }

    public o d() {
        return this.f14824b;
    }

    public Status e() {
        return this.f14823a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, e(), i10, false);
        w6.c.u(parcel, 2, d(), i10, false);
        w6.c.b(parcel, iA);
    }
}
