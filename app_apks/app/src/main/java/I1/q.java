package I1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class q extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5503c;

    public q(j jVar, int i10, int i11) {
        super(b(i10, i11));
        this.f5502b = jVar;
        this.f5503c = i11;
    }

    public static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static q c(IOException iOException, j jVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !J7.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new p(iOException, jVar) : new q(iOException, jVar, i11, i10);
    }

    public q(String str, j jVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f5502b = jVar;
        this.f5503c = i11;
    }

    public q(IOException iOException, j jVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f5502b = jVar;
        this.f5503c = i11;
    }

    public q(String str, IOException iOException, j jVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f5502b = jVar;
        this.f5503c = i11;
    }
}
