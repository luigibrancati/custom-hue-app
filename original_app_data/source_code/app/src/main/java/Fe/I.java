package Fe;

import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class I extends C0841c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Socket f4079o;

    public I(Socket socket) {
        AbstractC4862t.e(socket, "socket");
        this.f4079o = socket;
    }

    @Override // Fe.C0841c
    public void B() {
        try {
            this.f4079o.close();
        } catch (AssertionError e10) {
            if (!v.d(e10)) {
                throw e10;
            }
            w.f4157a.log(Level.WARNING, "Failed to close timed out socket " + this.f4079o, (Throwable) e10);
        } catch (Exception e11) {
            w.f4157a.log(Level.WARNING, "Failed to close timed out socket " + this.f4079o, (Throwable) e11);
        }
    }

    @Override // Fe.C0841c
    public IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
