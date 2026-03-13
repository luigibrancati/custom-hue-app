package la;

import java.util.Date;

/* JADX INFO: renamed from: la.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4981m extends C4974f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f40016b;

    public C4981m(int i10) {
        super(a(i10, null));
        this.f40015a = i10;
        this.f40016b = null;
    }

    public static String a(int i10, Date date) {
        return b(i10) + " (code " + i10 + ")" + c(date);
    }

    private static String b(int i10) {
        if (i10 == 2147483646) {
            return "Undocumented scan throttle";
        }
        switch (i10) {
            case 0:
                return "Bluetooth cannot start";
            case 1:
                return "Bluetooth disabled";
            case 2:
                return "Bluetooth not available";
            case 3:
                return "Location Permission missing";
            case 4:
                return "Location Services disabled";
            case 5:
                return "Scan failed because it has already started";
            case 6:
                return "Scan failed because application registration failed";
            case 7:
                return "Scan failed because of an internal error";
            case 8:
                return "Scan failed because feature unsupported";
            case 9:
                return "Scan failed because out of hardware resources";
            default:
                return "Unknown error";
        }
    }

    public static String c(Date date) {
        if (date == null) {
            return "";
        }
        return ", suggested retry date is " + date;
    }

    public C4981m(int i10, Date date) {
        super(a(i10, date));
        this.f40015a = i10;
        this.f40016b = date;
    }

    public C4981m(int i10, Throwable th) {
        super(a(i10, null), th);
        this.f40015a = i10;
        this.f40016b = null;
    }
}
