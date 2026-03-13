package Fe;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final H a() {
        return x.a();
    }

    public static final InterfaceC0844f b(H h10) {
        return x.b(h10);
    }

    public static final InterfaceC0845g c(J j10) {
        return x.c(j10);
    }

    public static final boolean d(AssertionError assertionError) {
        return w.b(assertionError);
    }

    public static final H e(File file, boolean z10) {
        return w.c(file, z10);
    }

    public static final H f(OutputStream outputStream) {
        return w.d(outputStream);
    }

    public static final H g(Socket socket) {
        return w.e(socket);
    }

    public static final J i(File file) {
        return w.g(file);
    }

    public static final J j(InputStream inputStream) {
        return w.h(inputStream);
    }

    public static final J k(Socket socket) {
        return w.i(socket);
    }
}
