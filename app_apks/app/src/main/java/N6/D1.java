package N6;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f9695a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f9697c;

    public D1(Class cls) {
        this.f9696b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f9697c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f9695a) {
            try {
                Logger logger2 = this.f9697c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f9696b);
                this.f9697c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
