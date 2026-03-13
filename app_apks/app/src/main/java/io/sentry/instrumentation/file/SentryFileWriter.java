package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(String str) {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(String str, boolean z10) {
        super(new SentryFileOutputStream(str, z10));
    }

    public SentryFileWriter(File file) {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(File file, boolean z10) {
        super(new SentryFileOutputStream(file, z10));
    }

    public SentryFileWriter(FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(File file, boolean z10, IScopes iScopes) {
        super(new SentryFileOutputStream(file, z10, iScopes));
    }
}
