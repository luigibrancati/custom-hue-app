package ke;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: ke.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4841c {
    public static String a(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.a(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(StringUtils.SPACE, linkedHashSet);
    }
}
