package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";
    private final MessageCodec<T> codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t10) {
                        binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t10));
                    }
                });
            } catch (RuntimeException e10) {
                Log.e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e10);
                binaryReply.reply(null);
            }
        }

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(ByteBuffer byteBuffer) {
            try {
                this.callback.reply((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e10) {
                Log.e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e10);
            }
        }

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MessageHandler<T> {
        void onMessage(T t10, Reply<T> reply);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Reply<T> {
        void reply(T t10);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
        byteBufferAllocateDirect.put(bArr);
        return byteBufferAllocateDirect;
    }

    public void resizeChannelBuffer(int i10) {
        resizeChannelBuffer(this.messenger, this.name, i10);
    }

    public void send(T t10) {
        send(t10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setMessageHandler(MessageHandler<T> messageHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : 0);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z10) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z10);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    public static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String str, int i10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(str, Integer.valueOf(i10))))));
    }

    public static void setWarnsOnChannelOverflow(BinaryMessenger binaryMessenger, String str, boolean z10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("overflow", Arrays.asList(str, Boolean.valueOf(!z10))))));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void send(T t10, Reply<T> reply) {
        this.messenger.send(this.name, this.codec.encodeMessage(t10), reply != null ? new IncomingReplyHandler(reply) : null);
    }
}
