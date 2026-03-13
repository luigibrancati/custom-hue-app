package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class FileOutputStreamInitData {
    final boolean append;
    final FileOutputStream delegate;
    final File file;
    final SentryOptions options;
    final ISpan span;

    public FileOutputStreamInitData(File file, boolean z10, ISpan iSpan, FileOutputStream fileOutputStream, SentryOptions sentryOptions) {
        this.file = file;
        this.append = z10;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.options = sentryOptions;
    }
}
