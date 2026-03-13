package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2293u extends AbstractC6157a {
    public static final Parcelable.Creator<C2293u> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16729c;

    /* JADX INFO: renamed from: U6.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16730a = -1424587;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16731b = -3857889;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f16732c = new b(-5041134);

        public C2293u a() {
            return new C2293u(this.f16730a, this.f16731b, this.f16732c);
        }

        public a b(int i10) {
            this.f16730a = i10;
            return this;
        }

        public a c(int i10) {
            this.f16731b = i10;
            return this;
        }

        public a d(b bVar) {
            this.f16732c = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: U6.u$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC6157a {
        public static final Parcelable.Creator<b> CREATOR = new a0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2276c f16734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16736d;

        public b(int i10) {
            this.f16736d = -16777216;
            this.f16735c = i10;
        }

        public int d() {
            return this.f16735c;
        }

        public String e() {
            return this.f16733a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f16735c != bVar.f16735c || !Objects.equals(this.f16733a, bVar.f16733a) || this.f16736d != bVar.f16736d) {
                return false;
            }
            C2276c c2276c = this.f16734b;
            if ((c2276c == null && bVar.f16734b != null) || (c2276c != null && bVar.f16734b == null)) {
                return false;
            }
            C2276c c2276c2 = bVar.f16734b;
            if (c2276c == null || c2276c2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.unwrap(c2276c.a()), ObjectWrapper.unwrap(c2276c2.a()));
        }

        public int f() {
            return this.f16736d;
        }

        public int hashCode() {
            return Objects.hash(this.f16733a, this.f16734b, Integer.valueOf(this.f16735c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = w6.c.a(parcel);
            w6.c.w(parcel, 2, e(), false);
            C2276c c2276c = this.f16734b;
            w6.c.m(parcel, 3, c2276c == null ? null : c2276c.a().asBinder(), false);
            w6.c.n(parcel, 4, d());
            w6.c.n(parcel, 5, f());
            w6.c.b(parcel, iA);
        }

        public b(C2276c c2276c) {
            this.f16735c = -5041134;
            this.f16736d = -16777216;
            this.f16734b = c2276c;
        }

        public b(String str) {
            this(str, -16777216);
        }

        public b(String str, int i10) {
            this.f16735c = -5041134;
            this.f16733a = str;
            this.f16736d = i10;
        }

        public b(String str, IBinder iBinder, int i10, int i11) {
            this.f16735c = -5041134;
            this.f16736d = -16777216;
            this.f16733a = str;
            this.f16734b = iBinder == null ? null : new C2276c(IObjectWrapper.Stub.asInterface(iBinder));
            this.f16735c = i10;
            this.f16736d = i11;
        }
    }

    public C2293u(int i10, int i11, b bVar) {
        this.f16727a = i10;
        this.f16728b = i11;
        this.f16729c = bVar;
    }

    public static a d() {
        return new a();
    }

    public int e() {
        return this.f16727a;
    }

    public int f() {
        return this.f16728b;
    }

    public b h() {
        return this.f16729c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, e());
        w6.c.n(parcel, 3, f());
        w6.c.u(parcel, 4, h(), i10, false);
        w6.c.b(parcel, iA);
    }
}
