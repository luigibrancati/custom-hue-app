package f9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.PerfSession;
import i9.f;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: f9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4003a implements Parcelable {
    public static final Parcelable.Creator<C4003a> CREATOR = new C0441a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f34231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34232c;

    /* JADX INFO: renamed from: f9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0441a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4003a createFromParcel(Parcel parcel) {
            return new C4003a(parcel, (C0441a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4003a[] newArray(int i10) {
            return new C4003a[i10];
        }
    }

    public /* synthetic */ C4003a(Parcel parcel, C0441a c0441a) {
        this(parcel);
    }

    public static PerfSession[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        PerfSession[] perfSessionArr = new PerfSession[list.size()];
        PerfSession perfSessionA = ((C4003a) list.get(0)).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            PerfSession perfSessionA2 = ((C4003a) list.get(i10)).a();
            if (z10 || !((C4003a) list.get(i10)).g()) {
                perfSessionArr[i10] = perfSessionA2;
            } else {
                perfSessionArr[0] = perfSessionA2;
                perfSessionArr[i10] = perfSessionA;
                z10 = true;
            }
        }
        if (!z10) {
            perfSessionArr[0] = perfSessionA;
        }
        return perfSessionArr;
    }

    public static C4003a c(String str) {
        C4003a c4003a = new C4003a(str.replace("-", ""), new com.google.firebase.perf.util.a());
        c4003a.i(j());
        return c4003a;
    }

    public static boolean j() {
        Y8.a aVarG = Y8.a.g();
        return aVarG.K() && Math.random() < aVarG.D();
    }

    public PerfSession a() {
        PerfSession.c cVarM = PerfSession.newBuilder().m(this.f34230a);
        if (this.f34232c) {
            cVarM.j(f.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (PerfSession) cVarM.build();
    }

    public l d() {
        return this.f34231b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f34232c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f34231b.c()) > Y8.a.g().A();
    }

    public boolean g() {
        return this.f34232c;
    }

    public String h() {
        return this.f34230a;
    }

    public void i(boolean z10) {
        this.f34232c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f34230a);
        parcel.writeByte(this.f34232c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f34231b, 0);
    }

    public C4003a(String str, com.google.firebase.perf.util.a aVar) {
        this.f34232c = false;
        this.f34230a = str;
        this.f34231b = aVar.a();
    }

    public C4003a(Parcel parcel) {
        this.f34232c = false;
        this.f34230a = parcel.readString();
        this.f34232c = parcel.readByte() != 0;
        this.f34231b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
