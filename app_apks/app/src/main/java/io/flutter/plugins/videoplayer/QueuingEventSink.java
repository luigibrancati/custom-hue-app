package io.flutter.plugins.videoplayer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class QueuingEventSink {
    private PigeonEventSink<PlatformVideoEvent> delegate;
    private final ArrayList<Object> eventQueue = new ArrayList<>();
    private boolean done = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class EndOfStreamEvent {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ErrorEvent {
        String code;
        Object details;
        String message;

        public ErrorEvent(String str, String str2, Object obj) {
            this.code = str;
            this.message = str2;
            this.details = obj;
        }
    }

    private void enqueue(Object obj) {
        if (this.done) {
            return;
        }
        this.eventQueue.add(obj);
    }

    private void maybeFlush() {
        if (this.delegate == null) {
            return;
        }
        for (Object obj : this.eventQueue) {
            if (obj instanceof EndOfStreamEvent) {
                this.delegate.endOfStream();
            } else if (obj instanceof ErrorEvent) {
                ErrorEvent errorEvent = (ErrorEvent) obj;
                this.delegate.error(errorEvent.code, errorEvent.message, errorEvent.details);
            } else {
                this.delegate.success((PlatformVideoEvent) obj);
            }
        }
        this.eventQueue.clear();
    }

    public void endOfStream() {
        enqueue(new EndOfStreamEvent());
        maybeFlush();
        this.done = true;
    }

    public void error(String str, String str2, Object obj) {
        enqueue(new ErrorEvent(str, str2, obj));
        maybeFlush();
    }

    public void setDelegate(PigeonEventSink<PlatformVideoEvent> pigeonEventSink) {
        this.delegate = pigeonEventSink;
        maybeFlush();
    }

    public void success(PlatformVideoEvent platformVideoEvent) {
        enqueue(platformVideoEvent);
        maybeFlush();
    }
}
