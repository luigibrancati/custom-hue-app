package org.apache.tika.pipes.pipesiterator;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.pipes.FetchEmitTuple;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CallablePipesIterator implements Callable<Long> {
    private final int numConsumers;
    private final PipesIterator pipesIterator;
    private final ArrayBlockingQueue<FetchEmitTuple> queue;
    private final long timeoutMillis;

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue) {
        this(pipesIterator, arrayBlockingQueue, -1L);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, long j10) {
        this(pipesIterator, arrayBlockingQueue, j10, 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Long call() throws InterruptedException, TimeoutException {
        long j10 = 0;
        int i10 = 0;
        if (this.timeoutMillis > 0) {
            Iterator<FetchEmitTuple> it = this.pipesIterator.iterator();
            while (it.hasNext()) {
                if (!this.queue.offer(it.next(), this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer tuple");
                }
                j10++;
            }
            while (i10 < this.numConsumers) {
                if (!this.queue.offer(PipesIterator.COMPLETED_SEMAPHORE, this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer the completed semaphore");
                }
                i10++;
            }
        } else {
            Iterator<FetchEmitTuple> it2 = this.pipesIterator.iterator();
            while (it2.hasNext()) {
                this.queue.put(it2.next());
                j10++;
            }
            while (i10 < this.numConsumers) {
                this.queue.put(PipesIterator.COMPLETED_SEMAPHORE);
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, long j10, int i10) {
        this.pipesIterator = pipesIterator;
        this.queue = arrayBlockingQueue;
        this.timeoutMillis = j10;
        this.numConsumers = i10;
    }
}
