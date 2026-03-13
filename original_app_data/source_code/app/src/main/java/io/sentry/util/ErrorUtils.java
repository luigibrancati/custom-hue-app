package io.sentry.util;

import io.sentry.FilterString;
import io.sentry.SentryEvent;
import io.sentry.protocol.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ErrorUtils {
    public static boolean isIgnored(List<FilterString> list, SentryEvent sentryEvent) {
        if (sentryEvent != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Message message = sentryEvent.getMessage();
            if (message != null) {
                String message2 = message.getMessage();
                if (message2 != null) {
                    hashSet.add(message2);
                }
                String formatted = message.getFormatted();
                if (formatted != null) {
                    hashSet.add(formatted);
                }
            }
            Throwable throwable = sentryEvent.getThrowable();
            if (throwable != null) {
                hashSet.add(throwable.toString());
            }
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().getFilterString())) {
                    return true;
                }
            }
            for (FilterString filterString : list) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (filterString.matches((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
