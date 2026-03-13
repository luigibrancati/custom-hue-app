package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t6.InterfaceC5851i;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC6157a implements InterfaceC5851i {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20300b;

    public f(List list, String str) {
        this.f20299a = list;
        this.f20300b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f20299a;
        int iA = w6.c.a(parcel);
        w6.c.y(parcel, 1, list, false);
        w6.c.w(parcel, 2, this.f20300b, false);
        w6.c.b(parcel, iA);
    }
}
