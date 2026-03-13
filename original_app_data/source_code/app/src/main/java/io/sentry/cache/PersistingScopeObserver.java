package io.sentry.cache;

import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.cache.tape.QueueFile;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PersistingScopeObserver extends ScopeObserverAdapter {
    public static final String BREADCRUMBS_FILENAME = "breadcrumbs.json";
    public static final String CONTEXTS_FILENAME = "contexts.json";
    public static final String EXTRAS_FILENAME = "extras.json";
    public static final String FINGERPRINT_FILENAME = "fingerprint.json";
    public static final String LEVEL_FILENAME = "level.json";
    public static final String REPLAY_FILENAME = "replay.json";
    public static final String REQUEST_FILENAME = "request.json";
    public static final String SCOPE_CACHE = ".scope-cache";
    public static final String TAGS_FILENAME = "tags.json";
    public static final String TRACE_FILENAME = "trace.json";
    public static final String TRANSACTION_FILENAME = "transaction.json";
    public static final String USER_FILENAME = "user.json";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final LazyEvaluator<ObjectQueue<Breadcrumb>> breadcrumbsQueue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.cache.k
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return PersistingScopeObserver.j(this.f38714a);
        }
    });
    private SentryOptions options;

    public PersistingScopeObserver(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public static /* synthetic */ void b(PersistingScopeObserver persistingScopeObserver, SpanContext spanContext, IScope iScope) {
        if (spanContext != null) {
            persistingScopeObserver.store(spanContext, TRACE_FILENAME);
        } else {
            persistingScopeObserver.getClass();
            persistingScopeObserver.store(iScope.getPropagationContext().toSpanContext(), TRACE_FILENAME);
        }
    }

    public static /* synthetic */ void c(PersistingScopeObserver persistingScopeObserver, User user) {
        if (user == null) {
            persistingScopeObserver.delete(USER_FILENAME);
        } else {
            persistingScopeObserver.store(user, USER_FILENAME);
        }
    }

    private void delete(String str) {
        CacheUtils.delete(this.options, SCOPE_CACHE, str);
    }

    public static /* synthetic */ void g(PersistingScopeObserver persistingScopeObserver) {
        persistingScopeObserver.getClass();
        try {
            persistingScopeObserver.breadcrumbsQueue.getValue().clear();
        } catch (IOException e10) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void h(PersistingScopeObserver persistingScopeObserver, String str) {
        if (str == null) {
            persistingScopeObserver.delete(TRANSACTION_FILENAME);
        } else {
            persistingScopeObserver.store(str, TRANSACTION_FILENAME);
        }
    }

    public static /* synthetic */ void i(PersistingScopeObserver persistingScopeObserver, Request request) {
        if (request == null) {
            persistingScopeObserver.delete(REQUEST_FILENAME);
        } else {
            persistingScopeObserver.store(request, REQUEST_FILENAME);
        }
    }

    public static /* synthetic */ ObjectQueue j(PersistingScopeObserver persistingScopeObserver) {
        QueueFile queueFileBuild;
        File fileEnsureCacheDir = CacheUtils.ensureCacheDir(persistingScopeObserver.options, SCOPE_CACHE);
        if (fileEnsureCacheDir == null) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return ObjectQueue.createEmpty();
        }
        File file = new File(fileEnsureCacheDir, BREADCRUMBS_FILENAME);
        try {
            try {
                queueFileBuild = new QueueFile.Builder(file).size(persistingScopeObserver.options.getMaxBreadcrumbs()).build();
            } catch (IOException unused) {
                file.delete();
                queueFileBuild = new QueueFile.Builder(file).size(persistingScopeObserver.options.getMaxBreadcrumbs()).build();
            }
            return ObjectQueue.create(queueFileBuild, new ObjectQueue.Converter<Breadcrumb>() { // from class: io.sentry.cache.PersistingScopeObserver.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public Breadcrumb from(byte[] bArr) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), PersistingScopeObserver.UTF_8));
                        try {
                            Breadcrumb breadcrumb = (Breadcrumb) PersistingScopeObserver.this.options.getSerializer().deserialize(bufferedReader, Breadcrumb.class);
                            bufferedReader.close();
                            return breadcrumb;
                        } finally {
                        }
                    } catch (Throwable th) {
                        PersistingScopeObserver.this.options.getLogger().log(SentryLevel.ERROR, th, "Error reading entity from scope cache", new Object[0]);
                        return null;
                    }
                }

                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public void toStream(Breadcrumb breadcrumb, OutputStream outputStream) throws IOException {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, PersistingScopeObserver.UTF_8));
                    try {
                        PersistingScopeObserver.this.options.getSerializer().serialize(breadcrumb, bufferedWriter);
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (IOException e10) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e10);
            return ObjectQueue.createEmpty();
        }
    }

    public static /* synthetic */ void k(PersistingScopeObserver persistingScopeObserver, SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            persistingScopeObserver.delete(LEVEL_FILENAME);
        } else {
            persistingScopeObserver.store(sentryLevel, LEVEL_FILENAME);
        }
    }

    public static /* synthetic */ void l(PersistingScopeObserver persistingScopeObserver, Runnable runnable) {
        persistingScopeObserver.getClass();
        try {
            runnable.run();
        } catch (Throwable th) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
        }
    }

    public static /* synthetic */ void n(PersistingScopeObserver persistingScopeObserver, Breadcrumb breadcrumb) {
        persistingScopeObserver.getClass();
        try {
            persistingScopeObserver.breadcrumbsQueue.getValue().add(breadcrumb);
        } catch (IOException e10) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    private void serializeToDisk(final Runnable runnable) {
        if (this.options.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        PersistingScopeObserver.l(this.f38717a, runnable);
                    }
                });
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void store(T t10, String str) {
        store(this.options, t10, str);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(final Breadcrumb breadcrumb) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.n(this.f38725a, breadcrumb);
            }
        });
    }

    public <T> T read(SentryOptions sentryOptions, String str, Class<T> cls) {
        if (!str.equals(BREADCRUMBS_FILENAME)) {
            return (T) CacheUtils.read(sentryOptions, SCOPE_CACHE, str, cls, null);
        }
        try {
            return cls.cast(this.breadcrumbsQueue.getValue().asList());
        } catch (IOException unused) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void resetCache() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        delete(USER_FILENAME);
        delete(LEVEL_FILENAME);
        delete(REQUEST_FILENAME);
        delete(FINGERPRINT_FILENAME);
        delete(CONTEXTS_FILENAME);
        delete(EXTRAS_FILENAME);
        delete("tags.json");
        delete(TRACE_FILENAME);
        delete(TRANSACTION_FILENAME);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setBreadcrumbs(Collection<Breadcrumb> collection) {
        if (collection.isEmpty()) {
            serializeToDisk(new Runnable() { // from class: io.sentry.cache.h
                @Override // java.lang.Runnable
                public final void run() {
                    PersistingScopeObserver.g(this.f38709a);
                }
            });
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setContexts(final Contexts contexts) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f38702a.store(contexts, PersistingScopeObserver.CONTEXTS_FILENAME);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtras(final Map<String, Object> map) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f38704a.store(map, PersistingScopeObserver.EXTRAS_FILENAME);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setFingerprint(final Collection<String> collection) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f38723a.store(collection, PersistingScopeObserver.FINGERPRINT_FILENAME);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setLevel(final SentryLevel sentryLevel) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.k(this.f38715a, sentryLevel);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setReplayId(final SentryId sentryId) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f38700a.store(sentryId, PersistingScopeObserver.REPLAY_FILENAME);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setRequest(final Request request) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.i(this.f38721a, request);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTags(final Map<String, String> map) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f38719a.store(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(final SpanContext spanContext, final IScope iScope) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.g
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.b(this.f38706a, spanContext, iScope);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTransaction(final String str) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.h(this.f38710a, str);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(final User user) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.c(this.f38712a, user);
            }
        });
    }

    public static <T> void store(SentryOptions sentryOptions, T t10, String str) {
        CacheUtils.store(sentryOptions, t10, SCOPE_CACHE, str);
    }
}
