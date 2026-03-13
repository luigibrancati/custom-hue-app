package I1;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5430a;

    public g(int i10) {
        this.f5430a = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof g) && ((g) cause).f5430a == 2008) {
                return true;
            }
        }
        return false;
    }

    public g(Throwable th, int i10) {
        super(th);
        this.f5430a = i10;
    }

    public g(String str, int i10) {
        super(str);
        this.f5430a = i10;
    }

    public g(String str, Throwable th, int i10) {
        super(str, th);
        this.f5430a = i10;
    }
}
