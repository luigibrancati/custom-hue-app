package Ne;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends e {
    private final Serializable tag;

    public f(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // Ne.e
    public void handleIOException(IOException iOException) throws Je.h {
        throw new Je.h(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        return Je.h.b(th, this.tag);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        Je.h.c(th, this.tag);
    }
}
