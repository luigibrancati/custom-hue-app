package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileReader extends InputStreamReader {
    public SentryFileReader(String str) {
        super(new SentryFileInputStream(str));
    }

    public SentryFileReader(File file) {
        super(new SentryFileInputStream(file));
    }

    public SentryFileReader(FileDescriptor fileDescriptor) {
        super(new SentryFileInputStream(fileDescriptor));
    }

    public SentryFileReader(File file, IScopes iScopes) {
        super(new SentryFileInputStream(file, iScopes));
    }
}
