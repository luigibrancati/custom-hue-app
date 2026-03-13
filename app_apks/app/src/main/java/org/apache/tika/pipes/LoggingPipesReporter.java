package org.apache.tika.pipes;

import af.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LoggingPipesReporter extends PipesReporter {
    af.c LOGGER = e.l(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.q("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j10) {
        this.LOGGER.debug("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j10));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.u("error {}", str);
    }
}
