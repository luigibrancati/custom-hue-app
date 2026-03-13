package K6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC6157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f7501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1053s f7495g = new C1053s(null);
    public static final Parcelable.Creator<H> CREATOR = new f0();

    static {
        Process.myUid();
        Process.myPid();
    }

    public H(int i10, String packageName, String str, String str2, List list, H h10) {
        AbstractC4862t.e(packageName, "packageName");
        if (h10 != null && h10.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f7496a = i10;
        this.f7497b = packageName;
        this.f7498c = str;
        this.f7499d = str2 == null ? h10 != null ? h10.f7499d : null : str2;
        if (list == null) {
            list = h10 != null ? h10.f7500e : null;
            if (list == null) {
                list = c0.n();
                AbstractC4862t.d(list, "of(...)");
            }
        }
        AbstractC4862t.e(list, "<this>");
        c0 c0VarP = c0.p(list);
        AbstractC4862t.d(c0VarP, "copyOf(...)");
        this.f7500e = c0VarP;
        this.f7501f = h10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h10 = (H) obj;
            if (this.f7496a == h10.f7496a && AbstractC4862t.a(this.f7497b, h10.f7497b) && AbstractC4862t.a(this.f7498c, h10.f7498c) && AbstractC4862t.a(this.f7499d, h10.f7499d) && AbstractC4862t.a(this.f7501f, h10.f7501f) && AbstractC4862t.a(this.f7500e, h10.f7500e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7496a), this.f7497b, this.f7498c, this.f7499d, this.f7501f});
    }

    public final String toString() {
        int length = this.f7497b.length() + 18;
        String str = this.f7498c;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f7496a);
        sb2.append("/");
        sb2.append(this.f7497b);
        String str2 = this.f7498c;
        if (str2 != null) {
            sb2.append("[");
            if (Od.C.P(str2, this.f7497b, false, 2, null)) {
                sb2.append((CharSequence) str2, this.f7497b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f7499d != null) {
            sb2.append("/");
            String str3 = this.f7499d;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4862t.e(dest, "dest");
        int i11 = this.f7496a;
        int iA = w6.c.a(dest);
        w6.c.n(dest, 1, i11);
        w6.c.w(dest, 3, this.f7497b, false);
        w6.c.w(dest, 4, this.f7498c, false);
        w6.c.w(dest, 6, this.f7499d, false);
        w6.c.u(dest, 7, this.f7501f, i10, false);
        w6.c.A(dest, 8, this.f7500e, false);
        w6.c.b(dest, iA);
    }

    public final boolean zza() {
        return this.f7501f != null;
    }
}
