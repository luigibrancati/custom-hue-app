package org.apache.tika.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentUtils {
    public static Future execute(ParseContext parseContext, Runnable runnable) {
        ExecutorService executorService = (ExecutorService) parseContext.get(ExecutorService.class);
        if (executorService != null) {
            return executorService.submit(runnable);
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        new Thread(futureTask, "Tika Thread").start();
        return futureTask;
    }
}
