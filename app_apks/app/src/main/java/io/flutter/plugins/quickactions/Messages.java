package io.flutter.plugins.quickactions;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.quickactions.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AndroidQuickActionsApi {
        static /* synthetic */ void a(AndroidQuickActionsApi androidQuickActionsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, androidQuickActionsApi.getLaunchAction());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void b(AndroidQuickActionsApi androidQuickActionsApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            androidQuickActionsApi.setShortcutItems((List) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.quickactions.Messages.AndroidQuickActionsApi.1
                @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void c(AndroidQuickActionsApi androidQuickActionsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                androidQuickActionsApi.clearShortcutItems();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(BinaryMessenger binaryMessenger, AndroidQuickActionsApi androidQuickActionsApi) {
            setUp(binaryMessenger, "", androidQuickActionsApi);
        }

        void clearShortcutItems();

        String getLaunchAction();

        void setShortcutItems(List<ShortcutItemMessage> list, VoidResult voidResult);

        static void setUp(BinaryMessenger binaryMessenger, String str, final AndroidQuickActionsApi androidQuickActionsApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.getLaunchAction" + str2, getCodec());
            if (androidQuickActionsApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.quickactions.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidQuickActionsApi.a(this.f37990a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.setShortcutItems" + str2, getCodec());
            if (androidQuickActionsApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.quickactions.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidQuickActionsApi.b(this.f37991a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.clearShortcutItems" + str2, getCodec());
            if (androidQuickActionsApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.quickactions.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.AndroidQuickActionsApi.c(this.f37992a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AndroidQuickActionsFlutterApi {
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public AndroidQuickActionsFlutterApi(BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public static /* synthetic */ void a(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        public void launchAction(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsFlutterApi.launchAction" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.quickactions.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.AndroidQuickActionsFlutterApi.a(voidResult, str2, obj);
                }
            });
        }

        public AndroidQuickActionsFlutterApi(BinaryMessenger binaryMessenger, String str) {
            String str2;
            this.binaryMessenger = binaryMessenger;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            this.messageChannelSuffix = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NullableResult<T> {
        void error(Throwable th);

        void success(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != -127 ? super.readValueOfType(b10, byteBuffer) : ShortcutItemMessage.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof ShortcutItemMessage)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((ShortcutItemMessage) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ShortcutItemMessage {
        private String icon;
        private String localizedTitle;
        private String type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String icon;
            private String localizedTitle;
            private String type;

            public ShortcutItemMessage build() {
                ShortcutItemMessage shortcutItemMessage = new ShortcutItemMessage();
                shortcutItemMessage.setType(this.type);
                shortcutItemMessage.setLocalizedTitle(this.localizedTitle);
                shortcutItemMessage.setIcon(this.icon);
                return shortcutItemMessage;
            }

            @CanIgnoreReturnValue
            public Builder setIcon(String str) {
                this.icon = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLocalizedTitle(String str) {
                this.localizedTitle = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setType(String str) {
                this.type = str;
                return this;
            }
        }

        public static ShortcutItemMessage fromList(ArrayList<Object> arrayList) {
            ShortcutItemMessage shortcutItemMessage = new ShortcutItemMessage();
            shortcutItemMessage.setType((String) arrayList.get(0));
            shortcutItemMessage.setLocalizedTitle((String) arrayList.get(1));
            shortcutItemMessage.setIcon((String) arrayList.get(2));
            return shortcutItemMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ShortcutItemMessage.class == obj.getClass()) {
                ShortcutItemMessage shortcutItemMessage = (ShortcutItemMessage) obj;
                if (this.type.equals(shortcutItemMessage.type) && this.localizedTitle.equals(shortcutItemMessage.localizedTitle) && Objects.equals(this.icon, shortcutItemMessage.icon)) {
                    return true;
                }
            }
            return false;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getLocalizedTitle() {
            return this.localizedTitle;
        }

        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.localizedTitle, this.icon);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setLocalizedTitle(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"localizedTitle\" is null.");
            }
            this.localizedTitle = str;
        }

        public void setType(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.localizedTitle);
            arrayList.add(this.icon);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface VoidResult {
        void error(Throwable th);

        void success();
    }

    public static FlutterError createConnectionError(String str) {
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
