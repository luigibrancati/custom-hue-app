package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: R6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2077l extends AbstractC6157a {
    public static final Parcelable.Creator<C2077l> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14819c;

    /* JADX INFO: renamed from: R6.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f14820a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14821b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14822c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f14820a.add(locationRequest);
            }
            return this;
        }

        public C2077l b() {
            return new C2077l(this.f14820a, this.f14821b, this.f14822c);
        }
    }

    public C2077l(List list, boolean z10, boolean z11) {
        this.f14817a = list;
        this.f14818b = z10;
        this.f14819c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14817a;
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 1, Collections.unmodifiableList(list), false);
        w6.c.c(parcel, 2, this.f14818b);
        w6.c.c(parcel, 3, this.f14819c);
        w6.c.b(parcel, iA);
    }
}
