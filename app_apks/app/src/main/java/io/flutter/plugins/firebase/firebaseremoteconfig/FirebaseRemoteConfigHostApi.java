package io.flutter.plugins.firebase.firebaseremoteconfig;

import fc.C4015H;
import fc.C4029l;
import fc.C4035r;
import fc.InterfaceC4028k;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ1\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ1\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\f\u0010\tJ9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0015\u0010\tJG\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0017\u0010\u0014J?\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\u0007\u001a\"\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0018\u0010\tJ=\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0007\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00110\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigHostApi;", "", "", "appName", "Lkotlin/Function1;", "Lfc/r;", "Lfc/H;", "callback", "fetch", "(Ljava/lang/String;Lvc/l;)V", "", "fetchAndActivate", "activate", "Lio/flutter/plugins/firebase/firebaseremoteconfig/RemoteConfigPigeonSettings;", "settings", "setConfigSettings", "(Ljava/lang/String;Lio/flutter/plugins/firebase/firebaseremoteconfig/RemoteConfigPigeonSettings;Lvc/l;)V", "", "defaultParameters", "setDefaults", "(Ljava/lang/String;Ljava/util/Map;Lvc/l;)V", "ensureInitialized", "customSignals", "setCustomSignals", "getAll", "getProperties", "Companion", "firebase_remote_config_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FirebaseRemoteConfigHostApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigHostApi$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigHostApi;", "api", "", "messageChannelSuffix", "Lfc/H;", "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigHostApi;Ljava/lang/String;)V", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lfc/k;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "firebase_remote_config_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final InterfaceC4028k codec = C4029l.b(new InterfaceC6082a() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return FirebaseRemoteConfigHostApi.Companion.codec_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GeneratedAndroidFirebaseRemoteConfigPigeonCodec codec_delegate$lambda$0() {
            return new GeneratedAndroidFirebaseRemoteConfigPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, firebaseRemoteConfigHostApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$lambda$11(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
            firebaseRemoteConfigHostApi.setConfigSettings((String) obj2, (RemoteConfigPigeonSettings) obj3, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.g
                @Override // vc.l
                public final Object invoke(Object obj4) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11$lambda$10(reply, (C4035r) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$12$lambda$11$lambda$10(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$15$lambda$14(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseRemoteConfigHostApi.setDefaults((String) obj2, (Map) obj3, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.b
                @Override // vc.l
                public final Object invoke(Object obj4) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14$lambda$13(reply, (C4035r) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$15$lambda$14$lambda$13(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$18$lambda$17(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.ensureInitialized((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.f
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17$lambda$16(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$18$lambda$17$lambda$16(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$21$lambda$20(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseRemoteConfigHostApi.setCustomSignals((String) obj2, (Map) obj3, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.i
                @Override // vc.l
                public final Object invoke(Object obj4) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20$lambda$19(reply, (C4035r) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$21$lambda$20$lambda$19(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$24$lambda$23(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.getAll((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.h
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23$lambda$22(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$24$lambda$23$lambda$22(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Map) objJ));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$27$lambda$26(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.getProperties((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.e
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26$lambda$25(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$27$lambda$26$lambda$25(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Map) objJ));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$lambda$2(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.fetch((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.j
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2$lambda$1(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$3$lambda$2$lambda$1(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$lambda$5(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.fetchAndActivate((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.d
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5$lambda$4(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$6$lambda$5$lambda$4(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Boolean) objJ));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$lambda$8(FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseRemoteConfigHostApi.activate((String) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.s
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8$lambda$7(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$9$lambda$8$lambda$7(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.wrapResult((Boolean) objJ));
            }
            return C4015H.f34254a;
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, FirebaseRemoteConfigHostApi firebaseRemoteConfigHostApi) {
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, firebaseRemoteConfigHostApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final FirebaseRemoteConfigHostApi api, String messageChannelSuffix) {
            String str;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            AbstractC4862t.e(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetch" + str, getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$3$lambda$2(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetchAndActivate" + str, getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$6$lambda$5(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.activate" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$9$lambda$8(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setConfigSettings" + str, getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$12$lambda$11(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setDefaults" + str, getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$15$lambda$14(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.ensureInitialized" + str, getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$18$lambda$17(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setCustomSignals" + str, getCodec());
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$21$lambda$20(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getAll" + str, getCodec());
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$24$lambda$23(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getProperties" + str, getCodec());
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.r
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseRemoteConfigHostApi.Companion.setUp$lambda$27$lambda$26(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
        }
    }

    void activate(String appName, vc.l callback);

    void ensureInitialized(String appName, vc.l callback);

    void fetch(String appName, vc.l callback);

    void fetchAndActivate(String appName, vc.l callback);

    void getAll(String appName, vc.l callback);

    void getProperties(String appName, vc.l callback);

    void setConfigSettings(String appName, RemoteConfigPigeonSettings settings, vc.l callback);

    void setCustomSignals(String appName, Map<String, ? extends Object> customSignals, vc.l callback);

    void setDefaults(String appName, Map<String, ? extends Object> defaultParameters, vc.l callback);
}
