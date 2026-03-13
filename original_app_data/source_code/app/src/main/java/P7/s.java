package P7;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f13165a = new CopyOnWriteArrayList();

    public static r a(String str) throws GeneralSecurityException {
        for (r rVar : f13165a) {
            if (rVar.a(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
