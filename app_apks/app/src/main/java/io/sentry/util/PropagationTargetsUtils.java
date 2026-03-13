package io.sentry.util;

import java.net.URI;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PropagationTargetsUtils {
    public static boolean contain(List<String> list, String str) {
        if (list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contain(List<String> list, URI uri) {
        return contain(list, uri.toString());
    }
}
