package org.apache.tika.exception;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ZeroByteFileException extends TikaException {
    public static IgnoreZeroByteFileException IGNORE_ZERO_BYTE_FILE_EXCEPTION = new IgnoreZeroByteFileException();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class IgnoreZeroByteFileException {
    }

    public ZeroByteFileException(String str) {
        super(str);
    }
}
