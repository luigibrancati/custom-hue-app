package org.apache.tika.pipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositePipesReporter extends PipesReporter implements Initializable {
    private List<PipesReporter> pipesReporters = new ArrayList();

    @Field
    public void addPipesReporter(PipesReporter pipesReporter) {
        this.pipesReporters.add(pipesReporter);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        List<PipesReporter> list = this.pipesReporters;
        if (list == null) {
            throw new TikaConfigException("must specify 'pipesReporters'");
        }
        if (list.size() == 0) {
            throw new TikaConfigException("must specify at least one pipes reporter");
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        IOException e10 = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().error(th);
        }
    }

    public List<PipesReporter> getPipesReporters() {
        return this.pipesReporters;
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j10) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().report(fetchEmitTuple, pipesResult, j10);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public boolean supportsTotalCount() {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            if (it.next().supportsTotalCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().error(str);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(TotalCountResult totalCountResult) {
        Iterator<PipesReporter> it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            it.next().report(totalCountResult);
        }
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }
}
