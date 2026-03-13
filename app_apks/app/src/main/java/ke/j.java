package ke;

import android.util.Base64;
import java.util.Collections;
import java.util.Map;
import ne.AbstractC5177b;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39728a;

    public j(String str) {
        this.f39728a = (String) p.e(str, "mClientSecret cannot be null");
    }

    @Override // ke.i
    public final Map a(String str) {
        return Collections.singletonMap("Authorization", "Basic " + Base64.encodeToString((AbstractC5177b.c(str) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + AbstractC5177b.c(this.f39728a)).getBytes(), 2));
    }

    @Override // ke.i
    public final Map b(String str) {
        return null;
    }
}
