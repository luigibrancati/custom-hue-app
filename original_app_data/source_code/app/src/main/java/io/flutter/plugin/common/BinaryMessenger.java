package io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface BinaryMessenger {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface BinaryMessageHandler {
        void onMessage(ByteBuffer byteBuffer, BinaryReply binaryReply);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface BinaryReply {
        void reply(ByteBuffer byteBuffer);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface TaskQueue {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public TaskQueueOptions setIsSerial(boolean z10) {
            this.isSerial = z10;
            return this;
        }
    }

    default void disableBufferingIncomingMessages() {
        throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    default void enableBufferingIncomingMessages() {
        throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    default TaskQueue makeBackgroundTaskQueue() {
        return makeBackgroundTaskQueue(new TaskQueueOptions());
    }

    void send(String str, ByteBuffer byteBuffer);

    void send(String str, ByteBuffer byteBuffer, BinaryReply binaryReply);

    void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler);

    default void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler, TaskQueue taskQueue) {
        if (taskQueue != null) {
            throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
        }
        setMessageHandler(str, binaryMessageHandler);
    }

    default TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }
}
