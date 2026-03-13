package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EventChannel {
    private static final String TAG = "EventChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface EventSink {
        void endOfStream();

        void error(String str, String str2, Object obj);

        void success(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class IncomingStreamRequestHandler implements BinaryMessenger.BinaryMessageHandler {
        private final AtomicReference<EventSink> activeSink = new AtomicReference<>(null);
        private final StreamHandler handler;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class EventSinkImplementation implements EventSink {
            final AtomicBoolean hasEnded;

            private EventSinkImplementation() {
                this.hasEnded = new AtomicBoolean(false);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void endOfStream() {
                if (this.hasEnded.getAndSet(true) || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, null);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void error(String str, String str2, Object obj) {
                if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void success(Object obj) {
                if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeSuccessEnvelope(obj));
            }
        }

        public IncomingStreamRequestHandler(StreamHandler streamHandler) {
            this.handler = streamHandler;
        }

        private void onCancel(Object obj, BinaryMessenger.BinaryReply binaryReply) {
            if (this.activeSink.getAndSet(null) == null) {
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.handler.onCancel(obj);
                binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (RuntimeException e10) {
                Log.e(EventChannel.TAG + EventChannel.this.name, "Failed to close event stream", e10);
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", e10.getMessage(), null));
            }
        }

        private void onListen(Object obj, BinaryMessenger.BinaryReply binaryReply) {
            EventSinkImplementation eventSinkImplementation = new EventSinkImplementation();
            if (this.activeSink.getAndSet(eventSinkImplementation) != null) {
                try {
                    this.handler.onCancel(null);
                } catch (RuntimeException e10) {
                    Log.e(EventChannel.TAG + EventChannel.this.name, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.handler.onListen(obj, eventSinkImplementation);
                binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (RuntimeException e11) {
                this.activeSink.set(null);
                Log.e(EventChannel.TAG + EventChannel.this.name, "Failed to open event stream", e11);
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", e11.getMessage(), null));
            }
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            MethodCall methodCallDecodeMethodCall = EventChannel.this.codec.decodeMethodCall(byteBuffer);
            if (methodCallDecodeMethodCall.method.equals("listen")) {
                onListen(methodCallDecodeMethodCall.arguments, binaryReply);
            } else if (methodCallDecodeMethodCall.method.equals("cancel")) {
                onCancel(methodCallDecodeMethodCall.arguments, binaryReply);
            } else {
                binaryReply.reply(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface StreamHandler {
        void onCancel(Object obj);

        void onListen(Object obj, EventSink eventSink);
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    public void setStreamHandler(StreamHandler streamHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null);
        }
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }
}
