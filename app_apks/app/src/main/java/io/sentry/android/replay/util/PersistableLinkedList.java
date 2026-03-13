package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/util/PersistableLinkedList;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lio/sentry/rrweb/RRWebEvent;", "", "propertyName", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Ljava/util/concurrent/ScheduledExecutorService;", "persistingExecutor", "Lkotlin/Function0;", "Lio/sentry/android/replay/ReplayCache;", "cacheProvider", "<init>", "(Ljava/lang/String;Lio/sentry/SentryOptions;Ljava/util/concurrent/ScheduledExecutorService;Lvc/a;)V", "Lfc/H;", "persistRecording", "()V", "", "elements", "", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Lio/sentry/rrweb/RRWebEvent;)Z", "remove", "()Lio/sentry/rrweb/RRWebEvent;", "Ljava/lang/String;", "Lio/sentry/SentryOptions;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lvc/a;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class PersistableLinkedList extends ConcurrentLinkedDeque<RRWebEvent> {
    public static final int $stable = 8;
    private final InterfaceC6082a cacheProvider;
    private final SentryOptions options;
    private final ScheduledExecutorService persistingExecutor;
    private final String propertyName;

    public PersistableLinkedList(String propertyName, SentryOptions options, ScheduledExecutorService persistingExecutor, InterfaceC6082a cacheProvider) {
        AbstractC4862t.e(propertyName, "propertyName");
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(persistingExecutor, "persistingExecutor");
        AbstractC4862t.e(cacheProvider, "cacheProvider");
        this.propertyName = propertyName;
        this.options = options;
        this.persistingExecutor = persistingExecutor;
        this.cacheProvider = cacheProvider;
    }

    private final void persistRecording() throws Exception {
        final ReplayCache replayCache = (ReplayCache) this.cacheProvider.invoke();
        if (replayCache == null) {
            return;
        }
        final ReplayRecording replayRecording = new ReplayRecording();
        replayRecording.setPayload(new ArrayList(this));
        if (this.options.getThreadChecker().isMainThread()) {
            this.persistingExecutor.submit(new Runnable() { // from class: io.sentry.android.replay.util.b
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    PersistableLinkedList.persistRecording$lambda$1(this.f38686a, replayRecording, replayCache);
                }
            });
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList persistableLinkedList, ReplayRecording replayRecording, ReplayCache replayCache) throws Exception {
        StringWriter stringWriter = new StringWriter();
        persistableLinkedList.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(persistableLinkedList.propertyName, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(Collection<? extends RRWebEvent> elements) throws Exception {
        AbstractC4862t.e(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(RRWebEvent rRWebEvent) {
        return super.contains((Object) rRWebEvent);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(RRWebEvent element) throws Exception {
        AbstractC4862t.e(element, "element");
        boolean zAdd = super.add(element);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return contains((RRWebEvent) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(RRWebEvent rRWebEvent) {
        return super.remove((Object) rRWebEvent);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return remove((RRWebEvent) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    public RRWebEvent remove() throws Exception {
        RRWebEvent rRWebEvent = (RRWebEvent) super.remove();
        persistRecording();
        AbstractC4862t.b(rRWebEvent);
        return rRWebEvent;
    }
}
