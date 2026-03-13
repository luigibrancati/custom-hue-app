package Fe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f4157a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        AbstractC4862t.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? Od.F.V(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final H c(File file, boolean z10) {
        AbstractC4862t.e(file, "<this>");
        return v.f(new FileOutputStream(file, z10));
    }

    public static final H d(OutputStream outputStream) {
        AbstractC4862t.e(outputStream, "<this>");
        return new z(outputStream, new K());
    }

    public static final H e(Socket socket) throws IOException {
        AbstractC4862t.e(socket, "<this>");
        I i10 = new I(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC4862t.d(outputStream, "getOutputStream(...)");
        return i10.z(new z(outputStream, i10));
    }

    public static /* synthetic */ H f(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return v.e(file, z10);
    }

    public static final J g(File file) {
        AbstractC4862t.e(file, "<this>");
        return new r(new FileInputStream(file), K.f4081e);
    }

    public static final J h(InputStream inputStream) {
        AbstractC4862t.e(inputStream, "<this>");
        return new r(inputStream, new K());
    }

    public static final J i(Socket socket) throws IOException {
        AbstractC4862t.e(socket, "<this>");
        I i10 = new I(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC4862t.d(inputStream, "getInputStream(...)");
        return i10.A(new r(inputStream, i10));
    }
}
