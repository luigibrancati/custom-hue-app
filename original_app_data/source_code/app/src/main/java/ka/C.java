package ka;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f39416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f39417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f39418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f39419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f39420f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f39421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f39422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f39423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f39424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f39425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f39426f;

        public C a() {
            return new C(this.f39421a, this.f39422b, this.f39423c, this.f39424d, this.f39425e, this.f39426f);
        }

        public a b(Integer num) {
            this.f39421a = num;
            return this;
        }

        public a c(Integer num) {
            this.f39422b = num;
            return this;
        }

        public a d(Boolean bool) {
            this.f39424d = bool;
            return this;
        }

        public a e(Integer num) {
            this.f39423c = num;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(int i10, String str, String str2);
    }

    public C(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, b bVar) {
        this.f39415a = num;
        this.f39416b = num2;
        this.f39417c = num3;
        this.f39418d = bool;
        this.f39419e = bool2;
        this.f39420f = bVar;
    }

    public Integer a() {
        return this.f39415a;
    }

    public b b() {
        return this.f39420f;
    }

    public Integer c() {
        return this.f39416b;
    }

    public Boolean d() {
        return this.f39418d;
    }

    public Boolean e() {
        return this.f39419e;
    }

    public Integer f() {
        return this.f39417c;
    }

    public String toString() {
        return "LogOptions{logLevel=" + this.f39415a + ", macAddressLogSetting=" + this.f39416b + ", uuidLogSetting=" + this.f39417c + ", shouldLogAttributeValues=" + this.f39418d + ", shouldLogScannedPeripherals=" + this.f39419e + ", logger=" + this.f39420f + '}';
    }
}
