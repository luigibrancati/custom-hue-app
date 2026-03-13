package R6;

import K6.O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: R6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2074i extends AbstractC6157a {
    public static final Parcelable.Creator<C2074i> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14806c;

    /* JADX INFO: renamed from: R6.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f14807a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14808b = 5;

        public a a(InterfaceC2069d interfaceC2069d) {
            AbstractC6056k.b(interfaceC2069d instanceof O, "Geofence must be created using Geofence.Builder.");
            this.f14807a.add((O) interfaceC2069d);
            return this;
        }

        public C2074i b() {
            AbstractC6056k.b(!this.f14807a.isEmpty(), "No geofence has been added to this request.");
            return new C2074i(new ArrayList(this.f14807a), this.f14808b, null);
        }

        public a c(int i10) {
            this.f14808b = i10 & 7;
            return this;
        }
    }

    public C2074i(List list, int i10, String str) {
        this.f14804a = list;
        this.f14805b = i10;
        this.f14806c = str;
    }

    public int d() {
        return this.f14805b;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f14804a);
        int length = strValueOf.length();
        int i10 = this.f14805b;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i10).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(strValueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14804a;
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 1, list, false);
        w6.c.n(parcel, 2, d());
        w6.c.w(parcel, 4, this.f14806c, false);
        w6.c.b(parcel, iA);
    }
}
