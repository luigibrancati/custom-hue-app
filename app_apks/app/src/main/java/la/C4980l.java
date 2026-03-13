package la;

/* JADX INFO: renamed from: la.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4980l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4980l f40002b = new C4980l("CONNECTION_STATE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4980l f40003c = new C4980l("SERVICE_DISCOVERY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4980l f40004d = new C4980l("CHARACTERISTIC_READ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4980l f40005e = new C4980l("CHARACTERISTIC_WRITE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C4980l f40006f = new C4980l("CHARACTERISTIC_LONG_WRITE");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4980l f40007g = new C4980l("CHARACTERISTIC_CHANGED");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4980l f40008h = new C4980l("DESCRIPTOR_READ");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4980l f40009i = new C4980l("DESCRIPTOR_WRITE");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C4980l f40010j = new C4980l("RELIABLE_WRITE_COMPLETED");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C4980l f40011k = new C4980l("READ_RSSI");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C4980l f40012l = new C4980l("ON_MTU_CHANGED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C4980l f40013m = new C4980l("CONNECTION_PRIORITY_CHANGE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40014a;

    public C4980l(String str) {
        this.f40014a = str;
    }

    public String toString() {
        return "BleGattOperation{description='" + this.f40014a + "'}";
    }
}
