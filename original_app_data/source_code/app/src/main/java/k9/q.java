package k9;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class q extends h8.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39294a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i10) {
            this.value = i10;
        }
    }

    public q(String str) {
        super(str);
        this.f39294a = a.UNKNOWN;
    }

    public q(String str, Throwable th) {
        super(str, th);
        this.f39294a = a.UNKNOWN;
    }

    public q(String str, a aVar) {
        super(str);
        this.f39294a = aVar;
    }

    public q(String str, Throwable th, a aVar) {
        super(str, th);
        this.f39294a = aVar;
    }
}
