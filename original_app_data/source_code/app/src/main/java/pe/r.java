package pe;

import gc.C4204q;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42857a = a.f42859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f42858b = new a.C0571a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f42859a = new a();

        /* JADX INFO: renamed from: pe.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0571a implements r {
            @Override // pe.r
            public List a(String hostname) throws UnknownHostException {
                AbstractC4862t.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    AbstractC4862t.d(allByName, "getAllByName(...)");
                    return C4204q.O0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }
    }

    List a(String str);
}
