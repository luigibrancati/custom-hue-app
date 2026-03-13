package org.apache.tika.exception;

import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WriteLimitReachedException extends SAXException {
    private static final int MAX_DEPTH = 100;
    private final int writeLimit;

    public WriteLimitReachedException(int i10) {
        this.writeLimit = i10;
    }

    public static boolean isWriteLimitReached(Throwable th) {
        return isWriteLimitReached(th, 0);
    }

    public static void throwIfWriteLimitReached(Exception exc) throws SAXException {
        throwIfWriteLimitReached(exc, 0);
    }

    @Override // org.xml.sax.SAXException, java.lang.Throwable
    public String getMessage() {
        return "Your document contained more than " + this.writeLimit + " characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).";
    }

    private static boolean isWriteLimitReached(Throwable th, int i10) {
        if (th == null || i10 > 100) {
            return false;
        }
        if (th instanceof WriteLimitReachedException) {
            return true;
        }
        return isWriteLimitReached(th.getCause(), i10 + 1);
    }

    private static void throwIfWriteLimitReached(Throwable th, int i10) throws SAXException {
        if (th != null && i10 <= 100) {
            if (th instanceof WriteLimitReachedException) {
                throw ((SAXException) th);
            }
            throwIfWriteLimitReached(th.getCause(), i10 + 1);
        }
    }
}
