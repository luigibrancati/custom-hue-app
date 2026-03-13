package org.apache.tika.pipes;

import java.io.Closeable;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PipesReporter implements Closeable {
    public static final PipesReporter NO_OP_REPORTER = new PipesReporter() { // from class: org.apache.tika.pipes.PipesReporter.1
        @Override // org.apache.tika.pipes.PipesReporter
        public void error(String str) {
        }

        @Override // org.apache.tika.pipes.PipesReporter
        public void error(Throwable th) {
        }

        @Override // org.apache.tika.pipes.PipesReporter
        public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j10) {
        }
    };

    public abstract void error(String str);

    public abstract void error(Throwable th);

    public abstract void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j10);

    public void report(TotalCountResult totalCountResult) {
    }

    public boolean supportsTotalCount() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
