package org.apache.tika.exception;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AccessPermissionException extends TikaException {
    public AccessPermissionException() {
        super("Unable to process: content extraction is not allowed");
    }

    public AccessPermissionException(Throwable th) {
        super("Unable to process: content extraction is not allowed", th);
    }

    public AccessPermissionException(String str) {
        super(str);
    }

    public AccessPermissionException(String str, Throwable th) {
        super(str, th);
    }
}
