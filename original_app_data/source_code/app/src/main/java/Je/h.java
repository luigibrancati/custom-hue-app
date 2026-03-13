package Je;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f6506a;

    public h(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f6506a = serializable;
    }

    public static boolean b(Throwable th, Object obj) {
        return obj != null && (th instanceof h) && obj.equals(((h) th).f6506a);
    }

    public static void c(Throwable th, Object obj) throws IOException {
        if (b(th, obj)) {
            throw ((h) th).getCause();
        }
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
