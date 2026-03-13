package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: s6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5783b extends AbstractC6157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f44148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f44150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5783b f44145f = new C5783b(0);
    public static final Parcelable.Creator<C5783b> CREATOR = new C5793l();

    public C5783b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f44146a = i10;
        this.f44147b = i11;
        this.f44148c = pendingIntent;
        this.f44149d = str;
        this.f44150e = num;
    }

    public static String n(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public Integer d() {
        return this.f44150e;
    }

    public int e() {
        return this.f44147b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5783b)) {
            return false;
        }
        C5783b c5783b = (C5783b) obj;
        return this.f44147b == c5783b.f44147b && AbstractC6055j.a(this.f44148c, c5783b.f44148c) && AbstractC6055j.a(this.f44149d, c5783b.f44149d) && AbstractC6055j.a(this.f44150e, c5783b.f44150e);
    }

    public String f() {
        return this.f44149d;
    }

    public PendingIntent h() {
        return this.f44148c;
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f44147b), this.f44148c, this.f44149d, this.f44150e);
    }

    public boolean k() {
        return (this.f44147b == 0 || this.f44148c == null) ? false : true;
    }

    public boolean l() {
        return this.f44147b == 0;
    }

    public String toString() {
        AbstractC6055j.a aVarC = AbstractC6055j.c(this);
        aVarC.a("statusCode", n(this.f44147b));
        aVarC.a("resolution", this.f44148c);
        aVarC.a("message", this.f44149d);
        aVarC.a("clientMethodKey", this.f44150e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f44146a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, e());
        w6.c.u(parcel, 3, h(), i10, false);
        w6.c.w(parcel, 4, f(), false);
        w6.c.q(parcel, 5, d(), false);
        w6.c.b(parcel, iA);
    }

    public C5783b(int i10) {
        this(i10, null, null);
    }

    public C5783b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C5783b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
