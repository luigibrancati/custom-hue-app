package org.apache.tika.exception;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EncryptedDocumentException extends TikaException {
    public EncryptedDocumentException() {
        super("Unable to process: document is encrypted");
    }

    public EncryptedDocumentException(Throwable th) {
        super("Unable to process: document is encrypted", th);
    }

    public EncryptedDocumentException(String str) {
        super(str);
    }

    public EncryptedDocumentException(String str, Throwable th) {
        super(str, th);
    }
}
