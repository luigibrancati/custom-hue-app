package Be;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface j {
    boolean a(SSLSocket sSLSocket);

    String b(SSLSocket sSLSocket);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean isSupported();
}
