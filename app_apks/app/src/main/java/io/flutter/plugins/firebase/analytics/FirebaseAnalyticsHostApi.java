package io.flutter.plugins.firebase.analytics;

import fc.C4015H;
import fc.C4029l;
import fc.C4035r;
import fc.InterfaceC4028k;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.sentry.ProfilingTraceData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u0000 $2\u00020\u0001:\u0001$J?\u0010\t\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001d\u001a\u00020\u00072\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001d\u0010\nJA\u0010\u001f\u001a\u00020\u00072\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001f\u0010\nJ+\u0010 \u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b \u0010\u0017J+\u0010!\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b!\u0010\u0017J?\u0010#\u001a\u00020\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b#\u0010\n¨\u0006%À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "", "", "", "event", "Lkotlin/Function1;", "Lfc/r;", "Lfc/H;", "callback", "logEvent", "(Ljava/util/Map;Lvc/l;)V", Constants.USER_ID, "setUserId", "(Ljava/lang/String;Lvc/l;)V", "name", "value", "setUserProperty", "(Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "", "enabled", "setAnalyticsCollectionEnabled", "(ZLvc/l;)V", "resetAnalyticsData", "(Lvc/l;)V", "", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "setSessionTimeoutDuration", "(JLvc/l;)V", "consent", "setConsent", Constants.PARAMETERS, "setDefaultEventParameters", "getAppInstanceId", "getSessionId", "arguments", "initiateOnDeviceConversionMeasurement", "Companion", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FirebaseAnalyticsHostApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "api", "", "messageChannelSuffix", "Lfc/H;", "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;Ljava/lang/String;)V", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lfc/k;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final InterfaceC4028k codec = C4029l.b(new InterfaceC6082a() { // from class: io.flutter.plugins.firebase.analytics.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return FirebaseAnalyticsHostApi.Companion.codec_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GeneratedAndroidFirebaseAnalyticsPigeonCodec codec_delegate$lambda$0() {
            return new GeneratedAndroidFirebaseAnalyticsPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, firebaseAnalyticsHostApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$lambda$11(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            firebaseAnalyticsHostApi.setAnalyticsCollectionEnabled(((Boolean) obj2).booleanValue(), new vc.l() { // from class: io.flutter.plugins.firebase.analytics.h
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11$lambda$10(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$12$lambda$11$lambda$10(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$15$lambda$14(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            firebaseAnalyticsHostApi.resetAnalyticsData(new vc.l() { // from class: io.flutter.plugins.firebase.analytics.e
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14$lambda$13(reply, (C4035r) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$15$lambda$14$lambda$13(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$18$lambda$17(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            firebaseAnalyticsHostApi.setSessionTimeoutDuration(((Long) obj2).longValue(), new vc.l() { // from class: io.flutter.plugins.firebase.analytics.o
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17$lambda$16(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$18$lambda$17$lambda$16(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$21$lambda$20(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            firebaseAnalyticsHostApi.setConsent((Map) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.analytics.k
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20$lambda$19(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$21$lambda$20$lambda$19(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$24$lambda$23(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setDefaultEventParameters((Map) ((List) obj).get(0), new vc.l() { // from class: io.flutter.plugins.firebase.analytics.g
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23$lambda$22(reply, (C4035r) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$24$lambda$23$lambda$22(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$27$lambda$26(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            firebaseAnalyticsHostApi.getAppInstanceId(new vc.l() { // from class: io.flutter.plugins.firebase.analytics.n
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26$lambda$25(reply, (C4035r) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$27$lambda$26$lambda$25(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((String) objJ));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$lambda$2(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            firebaseAnalyticsHostApi.logEvent((Map) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.analytics.i
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2$lambda$1(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$3$lambda$2$lambda$1(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$30$lambda$29(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            firebaseAnalyticsHostApi.getSessionId(new vc.l() { // from class: io.flutter.plugins.firebase.analytics.c
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29$lambda$28(reply, (C4035r) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$30$lambda$29$lambda$28(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                Object objJ = c4035r.j();
                if (C4035r.g(objJ)) {
                    objJ = null;
                }
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult((Long) objJ));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$33$lambda$32(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            firebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement((Map) obj2, new vc.l() { // from class: io.flutter.plugins.firebase.analytics.d
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32$lambda$31(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$33$lambda$32$lambda$31(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$lambda$5(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            firebaseAnalyticsHostApi.setUserId((String) ((List) obj).get(0), new vc.l() { // from class: io.flutter.plugins.firebase.analytics.m
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5$lambda$4(reply, (C4035r) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$6$lambda$5$lambda$4(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$lambda$8(FirebaseAnalyticsHostApi firebaseAnalyticsHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            firebaseAnalyticsHostApi.setUserProperty((String) obj2, (String) list.get(1), new vc.l() { // from class: io.flutter.plugins.firebase.analytics.j
                @Override // vc.l
                public final Object invoke(Object obj3) {
                    return FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8$lambda$7(reply, (C4035r) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H setUp$lambda$9$lambda$8$lambda$7(BasicMessageChannel.Reply reply, C4035r c4035r) {
            Throwable thE = C4035r.e(c4035r.j());
            if (thE != null) {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapError(thE));
            } else {
                reply.reply(GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.wrapResult(null));
            }
            return C4015H.f34254a;
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) codec.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, FirebaseAnalyticsHostApi firebaseAnalyticsHostApi) {
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, firebaseAnalyticsHostApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final FirebaseAnalyticsHostApi api, String messageChannelSuffix) {
            String str;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            AbstractC4862t.e(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent" + str, getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$lambda$2(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId" + str, getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$lambda$5(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$lambda$8(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled" + str, getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.r
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$12$lambda$11(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData" + str, getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$15$lambda$14(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration" + str, getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$18$lambda$17(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent" + str, getCodec());
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$21$lambda$20(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters" + str, getCodec());
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$24$lambda$23(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId" + str, getCodec());
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.w
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$27$lambda$26(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId" + str, getCodec());
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$30$lambda$29(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement" + str, getCodec());
            if (api != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.analytics.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        FirebaseAnalyticsHostApi.Companion.setUp$lambda$33$lambda$32(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
        }
    }

    void getAppInstanceId(vc.l callback);

    void getSessionId(vc.l callback);

    void initiateOnDeviceConversionMeasurement(Map<String, String> arguments, vc.l callback);

    void logEvent(Map<String, ? extends Object> event, vc.l callback);

    void resetAnalyticsData(vc.l callback);

    void setAnalyticsCollectionEnabled(boolean enabled, vc.l callback);

    void setConsent(Map<String, Boolean> consent, vc.l callback);

    void setDefaultEventParameters(Map<String, ? extends Object> parameters, vc.l callback);

    void setSessionTimeoutDuration(long timeout, vc.l callback);

    void setUserId(String userId, vc.l callback);

    void setUserProperty(String name, String value, vc.l callback);
}
