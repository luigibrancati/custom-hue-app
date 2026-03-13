package X6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2538y6 extends AbstractC6157a {
    public static final Parcelable.Creator<C2538y6> CREATOR = new C2546z6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19324a;

    public C2538y6(List list) {
        this.f19324a = list;
    }

    public static C2538y6 d(EnumC2346a5... enumC2346a5Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC2346a5Arr[0].zza()));
        return new C2538y6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f19324a;
        int iA = w6.c.a(parcel);
        w6.c.p(parcel, 1, list, false);
        w6.c.b(parcel, iA);
    }
}
