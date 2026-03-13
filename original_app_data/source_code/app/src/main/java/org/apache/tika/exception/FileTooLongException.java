package org.apache.tika.exception;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j10, long j11) {
        return "File is " + j10 + " bytes, but " + j11 + " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.";
    }

    public FileTooLongException(long j10, long j11) {
        super(msg(j10, j11));
    }
}
