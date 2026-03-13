package io.flutter.plugins.inapppurchase;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.inapppurchase.Messages;
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
    public interface InAppPurchaseApi {
        static /* synthetic */ void a(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.queryProductDetailsAsync((List) ((ArrayList) obj).get(0), new Result<PlatformProductDetailsResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.7
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformProductDetailsResponse platformProductDetailsResponse) {
                    arrayList.add(0, platformProductDetailsResponse);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void b(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.showAlternativeBillingOnlyInformationDialog(new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.9
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingResult platformBillingResult) {
                    arrayList.add(0, platformBillingResult);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void c(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                inAppPurchaseApi.endConnection();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void d(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync(new Result<PlatformAlternativeBillingOnlyReportingDetailsResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.10
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse) {
                    arrayList.add(0, platformAlternativeBillingOnlyReportingDetailsResponse);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void e(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.consumeAsync((String) ((ArrayList) obj).get(0), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.4
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingResult platformBillingResult) {
                    arrayList.add(0, platformBillingResult);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void f(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync(new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.8
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingResult platformBillingResult) {
                    arrayList.add(0, platformBillingResult);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void g(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, inAppPurchaseApi.isReady());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static /* synthetic */ void h(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.queryPurchasesAsync((PlatformProductType) ((ArrayList) obj).get(0), new Result<PlatformPurchasesResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.5
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformPurchasesResponse platformPurchasesResponse) {
                    arrayList.add(0, platformPurchasesResponse);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void i(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.getBillingConfigAsync(new Result<PlatformBillingConfigResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.2
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingConfigResponse platformBillingConfigResponse) {
                    arrayList.add(0, platformBillingConfigResponse);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void j(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.queryPurchaseHistoryAsync((PlatformProductType) ((ArrayList) obj).get(0), new Result<PlatformPurchaseHistoryResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.6
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse) {
                    arrayList.add(0, platformPurchaseHistoryResponse);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void k(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, inAppPurchaseApi.launchBillingFlow((PlatformBillingFlowParams) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void l(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            inAppPurchaseApi.startConnection((Long) arrayList2.get(0), (PlatformBillingChoiceMode) arrayList2.get(1), (PlatformPendingPurchasesParams) arrayList2.get(2), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.1
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingResult platformBillingResult) {
                    arrayList.add(0, platformBillingResult);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void m(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            inAppPurchaseApi.acknowledgePurchase((String) ((ArrayList) obj).get(0), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.3
                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.Result
                public void success(PlatformBillingResult platformBillingResult) {
                    arrayList.add(0, platformBillingResult);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void n(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, inAppPurchaseApi.isFeatureSupported((PlatformBillingClientFeature) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setUp(BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi) {
            setUp(binaryMessenger, "", inAppPurchaseApi);
        }

        void acknowledgePurchase(String str, Result<PlatformBillingResult> result);

        void consumeAsync(String str, Result<PlatformBillingResult> result);

        void createAlternativeBillingOnlyReportingDetailsAsync(Result<PlatformAlternativeBillingOnlyReportingDetailsResponse> result);

        void endConnection();

        void getBillingConfigAsync(Result<PlatformBillingConfigResponse> result);

        void isAlternativeBillingOnlyAvailableAsync(Result<PlatformBillingResult> result);

        Boolean isFeatureSupported(PlatformBillingClientFeature platformBillingClientFeature);

        Boolean isReady();

        PlatformBillingResult launchBillingFlow(PlatformBillingFlowParams platformBillingFlowParams);

        void queryProductDetailsAsync(List<PlatformQueryProduct> list, Result<PlatformProductDetailsResponse> result);

        void queryPurchaseHistoryAsync(PlatformProductType platformProductType, Result<PlatformPurchaseHistoryResponse> result);

        void queryPurchasesAsync(PlatformProductType platformProductType, Result<PlatformPurchasesResponse> result);

        void showAlternativeBillingOnlyInformationDialog(Result<PlatformBillingResult> result);

        void startConnection(Long l10, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams, Result<PlatformBillingResult> result);

        static void setUp(BinaryMessenger binaryMessenger, String str, final InAppPurchaseApi inAppPurchaseApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.g(this.f37955a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.l(this.f37964a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.c(this.f37965a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.i(this.f37966a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.k(this.f37967a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.m(this.f37968a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.e(this.f37956a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.h(this.f37957a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.j(this.f37958a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.a(this.f37959a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.n(this.f37960a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.f(this.f37961a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.b(this.f37962a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync" + str2, getCodec());
            if (inAppPurchaseApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.InAppPurchaseApi.d(this.f37963a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class InAppPurchaseCallbackApi {
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger) {
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

        public static /* synthetic */ void b(VoidResult voidResult, String str, Object obj) {
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

        public static /* synthetic */ void c(VoidResult voidResult, String str, Object obj) {
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

        public void onBillingServiceDisconnected(Long l10, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.p
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.InAppPurchaseCallbackApi.a(voidResult, str, obj);
                }
            });
        }

        public void onPurchasesUpdated(PlatformPurchasesResponse platformPurchasesResponse, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformPurchasesResponse)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.q
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.InAppPurchaseCallbackApi.b(voidResult, str, obj);
                }
            });
        }

        public void userSelectedalternativeBilling(PlatformUserChoiceDetails platformUserChoiceDetails, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformUserChoiceDetails)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.r
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.InAppPurchaseCallbackApi.c(voidResult, str, obj);
                }
            });
        }

        public InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger, String str) {
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
            switch (b10) {
                case -127:
                    Object value = readValue(byteBuffer);
                    if (value == null) {
                        return null;
                    }
                    return PlatformBillingResponse.values()[((Long) value).intValue()];
                case -126:
                    Object value2 = readValue(byteBuffer);
                    if (value2 == null) {
                        return null;
                    }
                    return PlatformReplacementMode.values()[((Long) value2).intValue()];
                case -125:
                    Object value3 = readValue(byteBuffer);
                    if (value3 == null) {
                        return null;
                    }
                    return PlatformProductType.values()[((Long) value3).intValue()];
                case -124:
                    Object value4 = readValue(byteBuffer);
                    if (value4 == null) {
                        return null;
                    }
                    return PlatformBillingChoiceMode.values()[((Long) value4).intValue()];
                case -123:
                    Object value5 = readValue(byteBuffer);
                    if (value5 == null) {
                        return null;
                    }
                    return PlatformBillingClientFeature.values()[((Long) value5).intValue()];
                case -122:
                    Object value6 = readValue(byteBuffer);
                    if (value6 == null) {
                        return null;
                    }
                    return PlatformPurchaseState.values()[((Long) value6).intValue()];
                case -121:
                    Object value7 = readValue(byteBuffer);
                    if (value7 == null) {
                        return null;
                    }
                    return PlatformRecurrenceMode.values()[((Long) value7).intValue()];
                case -120:
                    return PlatformQueryProduct.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PlatformAccountIdentifiers.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PlatformBillingResult.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PlatformOneTimePurchaseOfferDetails.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PlatformProductDetails.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PlatformProductDetailsResponse.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PlatformAlternativeBillingOnlyReportingDetailsResponse.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PlatformBillingConfigResponse.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PlatformBillingFlowParams.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PlatformPricingPhase.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return PlatformPurchase.fromList((ArrayList) readValue(byteBuffer));
                case -109:
                    return PlatformPendingPurchaseUpdate.fromList((ArrayList) readValue(byteBuffer));
                case -108:
                    return PlatformPurchaseHistoryRecord.fromList((ArrayList) readValue(byteBuffer));
                case -107:
                    return PlatformPurchaseHistoryResponse.fromList((ArrayList) readValue(byteBuffer));
                case -106:
                    return PlatformPurchasesResponse.fromList((ArrayList) readValue(byteBuffer));
                case -105:
                    return PlatformSubscriptionOfferDetails.fromList((ArrayList) readValue(byteBuffer));
                case -104:
                    return PlatformUserChoiceDetails.fromList((ArrayList) readValue(byteBuffer));
                case -103:
                    return PlatformUserChoiceProduct.fromList((ArrayList) readValue(byteBuffer));
                case -102:
                    return PlatformInstallmentPlanDetails.fromList((ArrayList) readValue(byteBuffer));
                case -101:
                    return PlatformPendingPurchasesParams.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PlatformBillingResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformBillingResponse) obj).index));
                return;
            }
            if (obj instanceof PlatformReplacementMode) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformReplacementMode) obj).index));
                return;
            }
            if (obj instanceof PlatformProductType) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformProductType) obj).index));
                return;
            }
            if (obj instanceof PlatformBillingChoiceMode) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformBillingChoiceMode) obj).index));
                return;
            }
            if (obj instanceof PlatformBillingClientFeature) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformBillingClientFeature) obj).index));
                return;
            }
            if (obj instanceof PlatformPurchaseState) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformPurchaseState) obj).index));
                return;
            }
            if (obj instanceof PlatformRecurrenceMode) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformRecurrenceMode) obj).index));
                return;
            }
            if (obj instanceof PlatformQueryProduct) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((PlatformQueryProduct) obj).toList());
                return;
            }
            if (obj instanceof PlatformAccountIdentifiers) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PlatformAccountIdentifiers) obj).toList());
                return;
            }
            if (obj instanceof PlatformBillingResult) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PlatformBillingResult) obj).toList());
                return;
            }
            if (obj instanceof PlatformOneTimePurchaseOfferDetails) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((PlatformOneTimePurchaseOfferDetails) obj).toList());
                return;
            }
            if (obj instanceof PlatformProductDetails) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PlatformProductDetails) obj).toList());
                return;
            }
            if (obj instanceof PlatformProductDetailsResponse) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PlatformProductDetailsResponse) obj).toList());
                return;
            }
            if (obj instanceof PlatformAlternativeBillingOnlyReportingDetailsResponse) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PlatformAlternativeBillingOnlyReportingDetailsResponse) obj).toList());
                return;
            }
            if (obj instanceof PlatformBillingConfigResponse) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PlatformBillingConfigResponse) obj).toList());
                return;
            }
            if (obj instanceof PlatformBillingFlowParams) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PlatformBillingFlowParams) obj).toList());
                return;
            }
            if (obj instanceof PlatformPricingPhase) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PlatformPricingPhase) obj).toList());
                return;
            }
            if (obj instanceof PlatformPurchase) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((PlatformPurchase) obj).toList());
                return;
            }
            if (obj instanceof PlatformPendingPurchaseUpdate) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((PlatformPendingPurchaseUpdate) obj).toList());
                return;
            }
            if (obj instanceof PlatformPurchaseHistoryRecord) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((PlatformPurchaseHistoryRecord) obj).toList());
                return;
            }
            if (obj instanceof PlatformPurchaseHistoryResponse) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((PlatformPurchaseHistoryResponse) obj).toList());
                return;
            }
            if (obj instanceof PlatformPurchasesResponse) {
                byteArrayOutputStream.write(150);
                writeValue(byteArrayOutputStream, ((PlatformPurchasesResponse) obj).toList());
                return;
            }
            if (obj instanceof PlatformSubscriptionOfferDetails) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((PlatformSubscriptionOfferDetails) obj).toList());
                return;
            }
            if (obj instanceof PlatformUserChoiceDetails) {
                byteArrayOutputStream.write(152);
                writeValue(byteArrayOutputStream, ((PlatformUserChoiceDetails) obj).toList());
                return;
            }
            if (obj instanceof PlatformUserChoiceProduct) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((PlatformUserChoiceProduct) obj).toList());
            } else if (obj instanceof PlatformInstallmentPlanDetails) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((PlatformInstallmentPlanDetails) obj).toList());
            } else if (!(obj instanceof PlatformPendingPurchasesParams)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                writeValue(byteArrayOutputStream, ((PlatformPendingPurchasesParams) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformAccountIdentifiers {
        private String obfuscatedAccountId;
        private String obfuscatedProfileId;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String obfuscatedAccountId;
            private String obfuscatedProfileId;

            public PlatformAccountIdentifiers build() {
                PlatformAccountIdentifiers platformAccountIdentifiers = new PlatformAccountIdentifiers();
                platformAccountIdentifiers.setObfuscatedAccountId(this.obfuscatedAccountId);
                platformAccountIdentifiers.setObfuscatedProfileId(this.obfuscatedProfileId);
                return platformAccountIdentifiers;
            }

            @CanIgnoreReturnValue
            public Builder setObfuscatedAccountId(String str) {
                this.obfuscatedAccountId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObfuscatedProfileId(String str) {
                this.obfuscatedProfileId = str;
                return this;
            }
        }

        public static PlatformAccountIdentifiers fromList(ArrayList<Object> arrayList) {
            PlatformAccountIdentifiers platformAccountIdentifiers = new PlatformAccountIdentifiers();
            platformAccountIdentifiers.setObfuscatedAccountId((String) arrayList.get(0));
            platformAccountIdentifiers.setObfuscatedProfileId((String) arrayList.get(1));
            return platformAccountIdentifiers;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformAccountIdentifiers.class == obj.getClass()) {
                PlatformAccountIdentifiers platformAccountIdentifiers = (PlatformAccountIdentifiers) obj;
                if (Objects.equals(this.obfuscatedAccountId, platformAccountIdentifiers.obfuscatedAccountId) && Objects.equals(this.obfuscatedProfileId, platformAccountIdentifiers.obfuscatedProfileId)) {
                    return true;
                }
            }
            return false;
        }

        public String getObfuscatedAccountId() {
            return this.obfuscatedAccountId;
        }

        public String getObfuscatedProfileId() {
            return this.obfuscatedProfileId;
        }

        public int hashCode() {
            return Objects.hash(this.obfuscatedAccountId, this.obfuscatedProfileId);
        }

        public void setObfuscatedAccountId(String str) {
            this.obfuscatedAccountId = str;
        }

        public void setObfuscatedProfileId(String str) {
            this.obfuscatedProfileId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.obfuscatedAccountId);
            arrayList.add(this.obfuscatedProfileId);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformAlternativeBillingOnlyReportingDetailsResponse {
        private PlatformBillingResult billingResult;
        private String externalTransactionToken;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private String externalTransactionToken;

            public PlatformAlternativeBillingOnlyReportingDetailsResponse build() {
                PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = new PlatformAlternativeBillingOnlyReportingDetailsResponse();
                platformAlternativeBillingOnlyReportingDetailsResponse.setBillingResult(this.billingResult);
                platformAlternativeBillingOnlyReportingDetailsResponse.setExternalTransactionToken(this.externalTransactionToken);
                return platformAlternativeBillingOnlyReportingDetailsResponse;
            }

            @CanIgnoreReturnValue
            public Builder setBillingResult(PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExternalTransactionToken(String str) {
                this.externalTransactionToken = str;
                return this;
            }
        }

        public static PlatformAlternativeBillingOnlyReportingDetailsResponse fromList(ArrayList<Object> arrayList) {
            PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = new PlatformAlternativeBillingOnlyReportingDetailsResponse();
            platformAlternativeBillingOnlyReportingDetailsResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformAlternativeBillingOnlyReportingDetailsResponse.setExternalTransactionToken((String) arrayList.get(1));
            return platformAlternativeBillingOnlyReportingDetailsResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformAlternativeBillingOnlyReportingDetailsResponse.class == obj.getClass()) {
                PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = (PlatformAlternativeBillingOnlyReportingDetailsResponse) obj;
                if (this.billingResult.equals(platformAlternativeBillingOnlyReportingDetailsResponse.billingResult) && this.externalTransactionToken.equals(platformAlternativeBillingOnlyReportingDetailsResponse.externalTransactionToken)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        public String getExternalTransactionToken() {
            return this.externalTransactionToken;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.externalTransactionToken);
        }

        public void setBillingResult(PlatformBillingResult platformBillingResult) {
            if (platformBillingResult == null) {
                throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
            }
            this.billingResult = platformBillingResult;
        }

        public void setExternalTransactionToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
            }
            this.externalTransactionToken = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.externalTransactionToken);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformBillingChoiceMode {
        PLAY_BILLING_ONLY(0),
        ALTERNATIVE_BILLING_ONLY(1),
        USER_CHOICE_BILLING(2);

        final int index;

        PlatformBillingChoiceMode(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformBillingClientFeature {
        ALTERNATIVE_BILLING_ONLY(0),
        BILLING_CONFIG(1),
        EXTERNAL_OFFER(2),
        IN_APP_MESSAGING(3),
        PRICE_CHANGE_CONFIRMATION(4),
        PRODUCT_DETAILS(5),
        SUBSCRIPTIONS(6),
        SUBSCRIPTIONS_UPDATE(7);

        final int index;

        PlatformBillingClientFeature(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBillingConfigResponse {
        private PlatformBillingResult billingResult;
        private String countryCode;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private String countryCode;

            public PlatformBillingConfigResponse build() {
                PlatformBillingConfigResponse platformBillingConfigResponse = new PlatformBillingConfigResponse();
                platformBillingConfigResponse.setBillingResult(this.billingResult);
                platformBillingConfigResponse.setCountryCode(this.countryCode);
                return platformBillingConfigResponse;
            }

            @CanIgnoreReturnValue
            public Builder setBillingResult(PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCountryCode(String str) {
                this.countryCode = str;
                return this;
            }
        }

        public static PlatformBillingConfigResponse fromList(ArrayList<Object> arrayList) {
            PlatformBillingConfigResponse platformBillingConfigResponse = new PlatformBillingConfigResponse();
            platformBillingConfigResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformBillingConfigResponse.setCountryCode((String) arrayList.get(1));
            return platformBillingConfigResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBillingConfigResponse.class == obj.getClass()) {
                PlatformBillingConfigResponse platformBillingConfigResponse = (PlatformBillingConfigResponse) obj;
                if (this.billingResult.equals(platformBillingConfigResponse.billingResult) && this.countryCode.equals(platformBillingConfigResponse.countryCode)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.countryCode);
        }

        public void setBillingResult(PlatformBillingResult platformBillingResult) {
            if (platformBillingResult == null) {
                throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
            }
            this.billingResult = platformBillingResult;
        }

        public void setCountryCode(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
            }
            this.countryCode = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.countryCode);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBillingFlowParams {
        private String accountId;
        private String obfuscatedProfileId;
        private String offerToken;
        private String oldProduct;
        private String product;
        private String purchaseToken;
        private PlatformReplacementMode replacementMode;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String accountId;
            private String obfuscatedProfileId;
            private String offerToken;
            private String oldProduct;
            private String product;
            private String purchaseToken;
            private PlatformReplacementMode replacementMode;

            public PlatformBillingFlowParams build() {
                PlatformBillingFlowParams platformBillingFlowParams = new PlatformBillingFlowParams();
                platformBillingFlowParams.setProduct(this.product);
                platformBillingFlowParams.setReplacementMode(this.replacementMode);
                platformBillingFlowParams.setOfferToken(this.offerToken);
                platformBillingFlowParams.setAccountId(this.accountId);
                platformBillingFlowParams.setObfuscatedProfileId(this.obfuscatedProfileId);
                platformBillingFlowParams.setOldProduct(this.oldProduct);
                platformBillingFlowParams.setPurchaseToken(this.purchaseToken);
                return platformBillingFlowParams;
            }

            @CanIgnoreReturnValue
            public Builder setAccountId(String str) {
                this.accountId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObfuscatedProfileId(String str) {
                this.obfuscatedProfileId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOfferToken(String str) {
                this.offerToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOldProduct(String str) {
                this.oldProduct = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProduct(String str) {
                this.product = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseToken(String str) {
                this.purchaseToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setReplacementMode(PlatformReplacementMode platformReplacementMode) {
                this.replacementMode = platformReplacementMode;
                return this;
            }
        }

        public static PlatformBillingFlowParams fromList(ArrayList<Object> arrayList) {
            PlatformBillingFlowParams platformBillingFlowParams = new PlatformBillingFlowParams();
            platformBillingFlowParams.setProduct((String) arrayList.get(0));
            platformBillingFlowParams.setReplacementMode((PlatformReplacementMode) arrayList.get(1));
            platformBillingFlowParams.setOfferToken((String) arrayList.get(2));
            platformBillingFlowParams.setAccountId((String) arrayList.get(3));
            platformBillingFlowParams.setObfuscatedProfileId((String) arrayList.get(4));
            platformBillingFlowParams.setOldProduct((String) arrayList.get(5));
            platformBillingFlowParams.setPurchaseToken((String) arrayList.get(6));
            return platformBillingFlowParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBillingFlowParams.class == obj.getClass()) {
                PlatformBillingFlowParams platformBillingFlowParams = (PlatformBillingFlowParams) obj;
                if (this.product.equals(platformBillingFlowParams.product) && this.replacementMode.equals(platformBillingFlowParams.replacementMode) && Objects.equals(this.offerToken, platformBillingFlowParams.offerToken) && Objects.equals(this.accountId, platformBillingFlowParams.accountId) && Objects.equals(this.obfuscatedProfileId, platformBillingFlowParams.obfuscatedProfileId) && Objects.equals(this.oldProduct, platformBillingFlowParams.oldProduct) && Objects.equals(this.purchaseToken, platformBillingFlowParams.purchaseToken)) {
                    return true;
                }
            }
            return false;
        }

        public String getAccountId() {
            return this.accountId;
        }

        public String getObfuscatedProfileId() {
            return this.obfuscatedProfileId;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public String getOldProduct() {
            return this.oldProduct;
        }

        public String getProduct() {
            return this.product;
        }

        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        public PlatformReplacementMode getReplacementMode() {
            return this.replacementMode;
        }

        public int hashCode() {
            return Objects.hash(this.product, this.replacementMode, this.offerToken, this.accountId, this.obfuscatedProfileId, this.oldProduct, this.purchaseToken);
        }

        public void setAccountId(String str) {
            this.accountId = str;
        }

        public void setObfuscatedProfileId(String str) {
            this.obfuscatedProfileId = str;
        }

        public void setOfferToken(String str) {
            this.offerToken = str;
        }

        public void setOldProduct(String str) {
            this.oldProduct = str;
        }

        public void setProduct(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"product\" is null.");
            }
            this.product = str;
        }

        public void setPurchaseToken(String str) {
            this.purchaseToken = str;
        }

        public void setReplacementMode(PlatformReplacementMode platformReplacementMode) {
            if (platformReplacementMode == null) {
                throw new IllegalStateException("Nonnull field \"replacementMode\" is null.");
            }
            this.replacementMode = platformReplacementMode;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.product);
            arrayList.add(this.replacementMode);
            arrayList.add(this.offerToken);
            arrayList.add(this.accountId);
            arrayList.add(this.obfuscatedProfileId);
            arrayList.add(this.oldProduct);
            arrayList.add(this.purchaseToken);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformBillingResponse {
        SERVICE_TIMEOUT(0),
        FEATURE_NOT_SUPPORTED(1),
        SERVICE_DISCONNECTED(2),
        OK(3),
        USER_CANCELED(4),
        SERVICE_UNAVAILABLE(5),
        BILLING_UNAVAILABLE(6),
        ITEM_UNAVAILABLE(7),
        DEVELOPER_ERROR(8),
        ERROR(9),
        ITEM_ALREADY_OWNED(10),
        ITEM_NOT_OWNED(11),
        NETWORK_ERROR(12);

        final int index;

        PlatformBillingResponse(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBillingResult {
        private String debugMessage;
        private PlatformBillingResponse responseCode;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String debugMessage;
            private PlatformBillingResponse responseCode;

            public PlatformBillingResult build() {
                PlatformBillingResult platformBillingResult = new PlatformBillingResult();
                platformBillingResult.setResponseCode(this.responseCode);
                platformBillingResult.setDebugMessage(this.debugMessage);
                return platformBillingResult;
            }

            @CanIgnoreReturnValue
            public Builder setDebugMessage(String str) {
                this.debugMessage = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setResponseCode(PlatformBillingResponse platformBillingResponse) {
                this.responseCode = platformBillingResponse;
                return this;
            }
        }

        public static PlatformBillingResult fromList(ArrayList<Object> arrayList) {
            PlatformBillingResult platformBillingResult = new PlatformBillingResult();
            platformBillingResult.setResponseCode((PlatformBillingResponse) arrayList.get(0));
            platformBillingResult.setDebugMessage((String) arrayList.get(1));
            return platformBillingResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBillingResult.class == obj.getClass()) {
                PlatformBillingResult platformBillingResult = (PlatformBillingResult) obj;
                if (this.responseCode.equals(platformBillingResult.responseCode) && this.debugMessage.equals(platformBillingResult.debugMessage)) {
                    return true;
                }
            }
            return false;
        }

        public String getDebugMessage() {
            return this.debugMessage;
        }

        public PlatformBillingResponse getResponseCode() {
            return this.responseCode;
        }

        public int hashCode() {
            return Objects.hash(this.responseCode, this.debugMessage);
        }

        public void setDebugMessage(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
            }
            this.debugMessage = str;
        }

        public void setResponseCode(PlatformBillingResponse platformBillingResponse) {
            if (platformBillingResponse == null) {
                throw new IllegalStateException("Nonnull field \"responseCode\" is null.");
            }
            this.responseCode = platformBillingResponse;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.responseCode);
            arrayList.add(this.debugMessage);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformInstallmentPlanDetails {
        private Long commitmentPaymentsCount;
        private Long subsequentCommitmentPaymentsCount;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Long commitmentPaymentsCount;
            private Long subsequentCommitmentPaymentsCount;

            public PlatformInstallmentPlanDetails build() {
                PlatformInstallmentPlanDetails platformInstallmentPlanDetails = new PlatformInstallmentPlanDetails();
                platformInstallmentPlanDetails.setCommitmentPaymentsCount(this.commitmentPaymentsCount);
                platformInstallmentPlanDetails.setSubsequentCommitmentPaymentsCount(this.subsequentCommitmentPaymentsCount);
                return platformInstallmentPlanDetails;
            }

            @CanIgnoreReturnValue
            public Builder setCommitmentPaymentsCount(Long l10) {
                this.commitmentPaymentsCount = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSubsequentCommitmentPaymentsCount(Long l10) {
                this.subsequentCommitmentPaymentsCount = l10;
                return this;
            }
        }

        public static PlatformInstallmentPlanDetails fromList(ArrayList<Object> arrayList) {
            PlatformInstallmentPlanDetails platformInstallmentPlanDetails = new PlatformInstallmentPlanDetails();
            platformInstallmentPlanDetails.setCommitmentPaymentsCount((Long) arrayList.get(0));
            platformInstallmentPlanDetails.setSubsequentCommitmentPaymentsCount((Long) arrayList.get(1));
            return platformInstallmentPlanDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformInstallmentPlanDetails.class == obj.getClass()) {
                PlatformInstallmentPlanDetails platformInstallmentPlanDetails = (PlatformInstallmentPlanDetails) obj;
                if (this.commitmentPaymentsCount.equals(platformInstallmentPlanDetails.commitmentPaymentsCount) && this.subsequentCommitmentPaymentsCount.equals(platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount)) {
                    return true;
                }
            }
            return false;
        }

        public Long getCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        public Long getSubsequentCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }

        public int hashCode() {
            return Objects.hash(this.commitmentPaymentsCount, this.subsequentCommitmentPaymentsCount);
        }

        public void setCommitmentPaymentsCount(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"commitmentPaymentsCount\" is null.");
            }
            this.commitmentPaymentsCount = l10;
        }

        public void setSubsequentCommitmentPaymentsCount(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"subsequentCommitmentPaymentsCount\" is null.");
            }
            this.subsequentCommitmentPaymentsCount = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.commitmentPaymentsCount);
            arrayList.add(this.subsequentCommitmentPaymentsCount);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformOneTimePurchaseOfferDetails {
        private String formattedPrice;
        private Long priceAmountMicros;
        private String priceCurrencyCode;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String formattedPrice;
            private Long priceAmountMicros;
            private String priceCurrencyCode;

            public PlatformOneTimePurchaseOfferDetails build() {
                PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = new PlatformOneTimePurchaseOfferDetails();
                platformOneTimePurchaseOfferDetails.setPriceAmountMicros(this.priceAmountMicros);
                platformOneTimePurchaseOfferDetails.setFormattedPrice(this.formattedPrice);
                platformOneTimePurchaseOfferDetails.setPriceCurrencyCode(this.priceCurrencyCode);
                return platformOneTimePurchaseOfferDetails;
            }

            @CanIgnoreReturnValue
            public Builder setFormattedPrice(String str) {
                this.formattedPrice = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPriceAmountMicros(Long l10) {
                this.priceAmountMicros = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPriceCurrencyCode(String str) {
                this.priceCurrencyCode = str;
                return this;
            }
        }

        public static PlatformOneTimePurchaseOfferDetails fromList(ArrayList<Object> arrayList) {
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = new PlatformOneTimePurchaseOfferDetails();
            platformOneTimePurchaseOfferDetails.setPriceAmountMicros((Long) arrayList.get(0));
            platformOneTimePurchaseOfferDetails.setFormattedPrice((String) arrayList.get(1));
            platformOneTimePurchaseOfferDetails.setPriceCurrencyCode((String) arrayList.get(2));
            return platformOneTimePurchaseOfferDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformOneTimePurchaseOfferDetails.class == obj.getClass()) {
                PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = (PlatformOneTimePurchaseOfferDetails) obj;
                if (this.priceAmountMicros.equals(platformOneTimePurchaseOfferDetails.priceAmountMicros) && this.formattedPrice.equals(platformOneTimePurchaseOfferDetails.formattedPrice) && this.priceCurrencyCode.equals(platformOneTimePurchaseOfferDetails.priceCurrencyCode)) {
                    return true;
                }
            }
            return false;
        }

        public String getFormattedPrice() {
            return this.formattedPrice;
        }

        public Long getPriceAmountMicros() {
            return this.priceAmountMicros;
        }

        public String getPriceCurrencyCode() {
            return this.priceCurrencyCode;
        }

        public int hashCode() {
            return Objects.hash(this.priceAmountMicros, this.formattedPrice, this.priceCurrencyCode);
        }

        public void setFormattedPrice(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
            }
            this.formattedPrice = str;
        }

        public void setPriceAmountMicros(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
            }
            this.priceAmountMicros = l10;
        }

        public void setPriceCurrencyCode(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
            }
            this.priceCurrencyCode = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.priceAmountMicros);
            arrayList.add(this.formattedPrice);
            arrayList.add(this.priceCurrencyCode);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPendingPurchaseUpdate {
        private List<String> products;
        private String purchaseToken;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private List<String> products;
            private String purchaseToken;

            public PlatformPendingPurchaseUpdate build() {
                PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = new PlatformPendingPurchaseUpdate();
                platformPendingPurchaseUpdate.setProducts(this.products);
                platformPendingPurchaseUpdate.setPurchaseToken(this.purchaseToken);
                return platformPendingPurchaseUpdate;
            }

            @CanIgnoreReturnValue
            public Builder setProducts(List<String> list) {
                this.products = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseToken(String str) {
                this.purchaseToken = str;
                return this;
            }
        }

        public static PlatformPendingPurchaseUpdate fromList(ArrayList<Object> arrayList) {
            PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = new PlatformPendingPurchaseUpdate();
            platformPendingPurchaseUpdate.setProducts((List) arrayList.get(0));
            platformPendingPurchaseUpdate.setPurchaseToken((String) arrayList.get(1));
            return platformPendingPurchaseUpdate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPendingPurchaseUpdate.class == obj.getClass()) {
                PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = (PlatformPendingPurchaseUpdate) obj;
                if (this.products.equals(platformPendingPurchaseUpdate.products) && this.purchaseToken.equals(platformPendingPurchaseUpdate.purchaseToken)) {
                    return true;
                }
            }
            return false;
        }

        public List<String> getProducts() {
            return this.products;
        }

        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        public int hashCode() {
            return Objects.hash(this.products, this.purchaseToken);
        }

        public void setProducts(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"products\" is null.");
            }
            this.products = list;
        }

        public void setPurchaseToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            this.purchaseToken = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.products);
            arrayList.add(this.purchaseToken);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPendingPurchasesParams {
        private Boolean enablePrepaidPlans;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean enablePrepaidPlans;

            public PlatformPendingPurchasesParams build() {
                PlatformPendingPurchasesParams platformPendingPurchasesParams = new PlatformPendingPurchasesParams();
                platformPendingPurchasesParams.setEnablePrepaidPlans(this.enablePrepaidPlans);
                return platformPendingPurchasesParams;
            }

            @CanIgnoreReturnValue
            public Builder setEnablePrepaidPlans(Boolean bool) {
                this.enablePrepaidPlans = bool;
                return this;
            }
        }

        public static PlatformPendingPurchasesParams fromList(ArrayList<Object> arrayList) {
            PlatformPendingPurchasesParams platformPendingPurchasesParams = new PlatformPendingPurchasesParams();
            platformPendingPurchasesParams.setEnablePrepaidPlans((Boolean) arrayList.get(0));
            return platformPendingPurchasesParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPendingPurchasesParams.class != obj.getClass()) {
                return false;
            }
            return this.enablePrepaidPlans.equals(((PlatformPendingPurchasesParams) obj).enablePrepaidPlans);
        }

        public Boolean getEnablePrepaidPlans() {
            return this.enablePrepaidPlans;
        }

        public int hashCode() {
            return Objects.hash(this.enablePrepaidPlans);
        }

        public void setEnablePrepaidPlans(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enablePrepaidPlans\" is null.");
            }
            this.enablePrepaidPlans = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.enablePrepaidPlans);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPricingPhase {
        private Long billingCycleCount;
        private String billingPeriod;
        private String formattedPrice;
        private Long priceAmountMicros;
        private String priceCurrencyCode;
        private PlatformRecurrenceMode recurrenceMode;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Long billingCycleCount;
            private String billingPeriod;
            private String formattedPrice;
            private Long priceAmountMicros;
            private String priceCurrencyCode;
            private PlatformRecurrenceMode recurrenceMode;

            public PlatformPricingPhase build() {
                PlatformPricingPhase platformPricingPhase = new PlatformPricingPhase();
                platformPricingPhase.setBillingCycleCount(this.billingCycleCount);
                platformPricingPhase.setRecurrenceMode(this.recurrenceMode);
                platformPricingPhase.setPriceAmountMicros(this.priceAmountMicros);
                platformPricingPhase.setBillingPeriod(this.billingPeriod);
                platformPricingPhase.setFormattedPrice(this.formattedPrice);
                platformPricingPhase.setPriceCurrencyCode(this.priceCurrencyCode);
                return platformPricingPhase;
            }

            @CanIgnoreReturnValue
            public Builder setBillingCycleCount(Long l10) {
                this.billingCycleCount = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setBillingPeriod(String str) {
                this.billingPeriod = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setFormattedPrice(String str) {
                this.formattedPrice = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPriceAmountMicros(Long l10) {
                this.priceAmountMicros = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPriceCurrencyCode(String str) {
                this.priceCurrencyCode = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRecurrenceMode(PlatformRecurrenceMode platformRecurrenceMode) {
                this.recurrenceMode = platformRecurrenceMode;
                return this;
            }
        }

        public static PlatformPricingPhase fromList(ArrayList<Object> arrayList) {
            PlatformPricingPhase platformPricingPhase = new PlatformPricingPhase();
            platformPricingPhase.setBillingCycleCount((Long) arrayList.get(0));
            platformPricingPhase.setRecurrenceMode((PlatformRecurrenceMode) arrayList.get(1));
            platformPricingPhase.setPriceAmountMicros((Long) arrayList.get(2));
            platformPricingPhase.setBillingPeriod((String) arrayList.get(3));
            platformPricingPhase.setFormattedPrice((String) arrayList.get(4));
            platformPricingPhase.setPriceCurrencyCode((String) arrayList.get(5));
            return platformPricingPhase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPricingPhase.class == obj.getClass()) {
                PlatformPricingPhase platformPricingPhase = (PlatformPricingPhase) obj;
                if (this.billingCycleCount.equals(platformPricingPhase.billingCycleCount) && this.recurrenceMode.equals(platformPricingPhase.recurrenceMode) && this.priceAmountMicros.equals(platformPricingPhase.priceAmountMicros) && this.billingPeriod.equals(platformPricingPhase.billingPeriod) && this.formattedPrice.equals(platformPricingPhase.formattedPrice) && this.priceCurrencyCode.equals(platformPricingPhase.priceCurrencyCode)) {
                    return true;
                }
            }
            return false;
        }

        public Long getBillingCycleCount() {
            return this.billingCycleCount;
        }

        public String getBillingPeriod() {
            return this.billingPeriod;
        }

        public String getFormattedPrice() {
            return this.formattedPrice;
        }

        public Long getPriceAmountMicros() {
            return this.priceAmountMicros;
        }

        public String getPriceCurrencyCode() {
            return this.priceCurrencyCode;
        }

        public PlatformRecurrenceMode getRecurrenceMode() {
            return this.recurrenceMode;
        }

        public int hashCode() {
            return Objects.hash(this.billingCycleCount, this.recurrenceMode, this.priceAmountMicros, this.billingPeriod, this.formattedPrice, this.priceCurrencyCode);
        }

        public void setBillingCycleCount(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"billingCycleCount\" is null.");
            }
            this.billingCycleCount = l10;
        }

        public void setBillingPeriod(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
            }
            this.billingPeriod = str;
        }

        public void setFormattedPrice(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
            }
            this.formattedPrice = str;
        }

        public void setPriceAmountMicros(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
            }
            this.priceAmountMicros = l10;
        }

        public void setPriceCurrencyCode(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
            }
            this.priceCurrencyCode = str;
        }

        public void setRecurrenceMode(PlatformRecurrenceMode platformRecurrenceMode) {
            if (platformRecurrenceMode == null) {
                throw new IllegalStateException("Nonnull field \"recurrenceMode\" is null.");
            }
            this.recurrenceMode = platformRecurrenceMode;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.billingCycleCount);
            arrayList.add(this.recurrenceMode);
            arrayList.add(this.priceAmountMicros);
            arrayList.add(this.billingPeriod);
            arrayList.add(this.formattedPrice);
            arrayList.add(this.priceCurrencyCode);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformProductDetails {
        private String description;
        private String name;
        private PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        private String productId;
        private PlatformProductType productType;
        private List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
        private String title;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String description;
            private String name;
            private PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
            private String productId;
            private PlatformProductType productType;
            private List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
            private String title;

            public PlatformProductDetails build() {
                PlatformProductDetails platformProductDetails = new PlatformProductDetails();
                platformProductDetails.setDescription(this.description);
                platformProductDetails.setName(this.name);
                platformProductDetails.setProductId(this.productId);
                platformProductDetails.setProductType(this.productType);
                platformProductDetails.setTitle(this.title);
                platformProductDetails.setOneTimePurchaseOfferDetails(this.oneTimePurchaseOfferDetails);
                platformProductDetails.setSubscriptionOfferDetails(this.subscriptionOfferDetails);
                return platformProductDetails;
            }

            @CanIgnoreReturnValue
            public Builder setDescription(String str) {
                this.description = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOneTimePurchaseOfferDetails(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails) {
                this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProductId(String str) {
                this.productId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProductType(PlatformProductType platformProductType) {
                this.productType = platformProductType;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSubscriptionOfferDetails(List<PlatformSubscriptionOfferDetails> list) {
                this.subscriptionOfferDetails = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }
        }

        public static PlatformProductDetails fromList(ArrayList<Object> arrayList) {
            PlatformProductDetails platformProductDetails = new PlatformProductDetails();
            platformProductDetails.setDescription((String) arrayList.get(0));
            platformProductDetails.setName((String) arrayList.get(1));
            platformProductDetails.setProductId((String) arrayList.get(2));
            platformProductDetails.setProductType((PlatformProductType) arrayList.get(3));
            platformProductDetails.setTitle((String) arrayList.get(4));
            platformProductDetails.setOneTimePurchaseOfferDetails((PlatformOneTimePurchaseOfferDetails) arrayList.get(5));
            platformProductDetails.setSubscriptionOfferDetails((List) arrayList.get(6));
            return platformProductDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformProductDetails.class == obj.getClass()) {
                PlatformProductDetails platformProductDetails = (PlatformProductDetails) obj;
                if (this.description.equals(platformProductDetails.description) && this.name.equals(platformProductDetails.name) && this.productId.equals(platformProductDetails.productId) && this.productType.equals(platformProductDetails.productType) && this.title.equals(platformProductDetails.title) && Objects.equals(this.oneTimePurchaseOfferDetails, platformProductDetails.oneTimePurchaseOfferDetails) && Objects.equals(this.subscriptionOfferDetails, platformProductDetails.subscriptionOfferDetails)) {
                    return true;
                }
            }
            return false;
        }

        public String getDescription() {
            return this.description;
        }

        public String getName() {
            return this.name;
        }

        public PlatformOneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
            return this.oneTimePurchaseOfferDetails;
        }

        public String getProductId() {
            return this.productId;
        }

        public PlatformProductType getProductType() {
            return this.productType;
        }

        public List<PlatformSubscriptionOfferDetails> getSubscriptionOfferDetails() {
            return this.subscriptionOfferDetails;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.description, this.name, this.productId, this.productType, this.title, this.oneTimePurchaseOfferDetails, this.subscriptionOfferDetails);
        }

        public void setDescription(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.name = str;
        }

        public void setOneTimePurchaseOfferDetails(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails) {
            this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
        }

        public void setProductId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            this.productId = str;
        }

        public void setProductType(PlatformProductType platformProductType) {
            if (platformProductType == null) {
                throw new IllegalStateException("Nonnull field \"productType\" is null.");
            }
            this.productType = platformProductType;
        }

        public void setSubscriptionOfferDetails(List<PlatformSubscriptionOfferDetails> list) {
            this.subscriptionOfferDetails = list;
        }

        public void setTitle(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"title\" is null.");
            }
            this.title = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.description);
            arrayList.add(this.name);
            arrayList.add(this.productId);
            arrayList.add(this.productType);
            arrayList.add(this.title);
            arrayList.add(this.oneTimePurchaseOfferDetails);
            arrayList.add(this.subscriptionOfferDetails);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformProductDetailsResponse {
        private PlatformBillingResult billingResult;
        private List<PlatformProductDetails> productDetails;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformProductDetails> productDetails;

            public PlatformProductDetailsResponse build() {
                PlatformProductDetailsResponse platformProductDetailsResponse = new PlatformProductDetailsResponse();
                platformProductDetailsResponse.setBillingResult(this.billingResult);
                platformProductDetailsResponse.setProductDetails(this.productDetails);
                return platformProductDetailsResponse;
            }

            @CanIgnoreReturnValue
            public Builder setBillingResult(PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProductDetails(List<PlatformProductDetails> list) {
                this.productDetails = list;
                return this;
            }
        }

        public static PlatformProductDetailsResponse fromList(ArrayList<Object> arrayList) {
            PlatformProductDetailsResponse platformProductDetailsResponse = new PlatformProductDetailsResponse();
            platformProductDetailsResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformProductDetailsResponse.setProductDetails((List) arrayList.get(1));
            return platformProductDetailsResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformProductDetailsResponse.class == obj.getClass()) {
                PlatformProductDetailsResponse platformProductDetailsResponse = (PlatformProductDetailsResponse) obj;
                if (this.billingResult.equals(platformProductDetailsResponse.billingResult) && this.productDetails.equals(platformProductDetailsResponse.productDetails)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        public List<PlatformProductDetails> getProductDetails() {
            return this.productDetails;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.productDetails);
        }

        public void setBillingResult(PlatformBillingResult platformBillingResult) {
            if (platformBillingResult == null) {
                throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
            }
            this.billingResult = platformBillingResult;
        }

        public void setProductDetails(List<PlatformProductDetails> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"productDetails\" is null.");
            }
            this.productDetails = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.productDetails);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformProductType {
        INAPP(0),
        SUBS(1);

        final int index;

        PlatformProductType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPurchase {
        private PlatformAccountIdentifiers accountIdentifiers;
        private String developerPayload;
        private Boolean isAcknowledged;
        private Boolean isAutoRenewing;
        private String orderId;
        private String originalJson;
        private String packageName;
        private PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
        private List<String> products;
        private PlatformPurchaseState purchaseState;
        private Long purchaseTime;
        private String purchaseToken;
        private Long quantity;
        private String signature;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformAccountIdentifiers accountIdentifiers;
            private String developerPayload;
            private Boolean isAcknowledged;
            private Boolean isAutoRenewing;
            private String orderId;
            private String originalJson;
            private String packageName;
            private PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
            private List<String> products;
            private PlatformPurchaseState purchaseState;
            private Long purchaseTime;
            private String purchaseToken;
            private Long quantity;
            private String signature;

            public PlatformPurchase build() {
                PlatformPurchase platformPurchase = new PlatformPurchase();
                platformPurchase.setOrderId(this.orderId);
                platformPurchase.setPackageName(this.packageName);
                platformPurchase.setPurchaseTime(this.purchaseTime);
                platformPurchase.setPurchaseToken(this.purchaseToken);
                platformPurchase.setSignature(this.signature);
                platformPurchase.setProducts(this.products);
                platformPurchase.setIsAutoRenewing(this.isAutoRenewing);
                platformPurchase.setOriginalJson(this.originalJson);
                platformPurchase.setDeveloperPayload(this.developerPayload);
                platformPurchase.setIsAcknowledged(this.isAcknowledged);
                platformPurchase.setQuantity(this.quantity);
                platformPurchase.setPurchaseState(this.purchaseState);
                platformPurchase.setAccountIdentifiers(this.accountIdentifiers);
                platformPurchase.setPendingPurchaseUpdate(this.pendingPurchaseUpdate);
                return platformPurchase;
            }

            @CanIgnoreReturnValue
            public Builder setAccountIdentifiers(PlatformAccountIdentifiers platformAccountIdentifiers) {
                this.accountIdentifiers = platformAccountIdentifiers;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeveloperPayload(String str) {
                this.developerPayload = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsAcknowledged(Boolean bool) {
                this.isAcknowledged = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsAutoRenewing(Boolean bool) {
                this.isAutoRenewing = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOrderId(String str) {
                this.orderId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOriginalJson(String str) {
                this.originalJson = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPackageName(String str) {
                this.packageName = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPendingPurchaseUpdate(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
                this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProducts(List<String> list) {
                this.products = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseState(PlatformPurchaseState platformPurchaseState) {
                this.purchaseState = platformPurchaseState;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseTime(Long l10) {
                this.purchaseTime = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseToken(String str) {
                this.purchaseToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setQuantity(Long l10) {
                this.quantity = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSignature(String str) {
                this.signature = str;
                return this;
            }
        }

        public static PlatformPurchase fromList(ArrayList<Object> arrayList) {
            PlatformPurchase platformPurchase = new PlatformPurchase();
            platformPurchase.setOrderId((String) arrayList.get(0));
            platformPurchase.setPackageName((String) arrayList.get(1));
            platformPurchase.setPurchaseTime((Long) arrayList.get(2));
            platformPurchase.setPurchaseToken((String) arrayList.get(3));
            platformPurchase.setSignature((String) arrayList.get(4));
            platformPurchase.setProducts((List) arrayList.get(5));
            platformPurchase.setIsAutoRenewing((Boolean) arrayList.get(6));
            platformPurchase.setOriginalJson((String) arrayList.get(7));
            platformPurchase.setDeveloperPayload((String) arrayList.get(8));
            platformPurchase.setIsAcknowledged((Boolean) arrayList.get(9));
            platformPurchase.setQuantity((Long) arrayList.get(10));
            platformPurchase.setPurchaseState((PlatformPurchaseState) arrayList.get(11));
            platformPurchase.setAccountIdentifiers((PlatformAccountIdentifiers) arrayList.get(12));
            platformPurchase.setPendingPurchaseUpdate((PlatformPendingPurchaseUpdate) arrayList.get(13));
            return platformPurchase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPurchase.class == obj.getClass()) {
                PlatformPurchase platformPurchase = (PlatformPurchase) obj;
                if (Objects.equals(this.orderId, platformPurchase.orderId) && this.packageName.equals(platformPurchase.packageName) && this.purchaseTime.equals(platformPurchase.purchaseTime) && this.purchaseToken.equals(platformPurchase.purchaseToken) && this.signature.equals(platformPurchase.signature) && this.products.equals(platformPurchase.products) && this.isAutoRenewing.equals(platformPurchase.isAutoRenewing) && this.originalJson.equals(platformPurchase.originalJson) && this.developerPayload.equals(platformPurchase.developerPayload) && this.isAcknowledged.equals(platformPurchase.isAcknowledged) && this.quantity.equals(platformPurchase.quantity) && this.purchaseState.equals(platformPurchase.purchaseState) && Objects.equals(this.accountIdentifiers, platformPurchase.accountIdentifiers) && Objects.equals(this.pendingPurchaseUpdate, platformPurchase.pendingPurchaseUpdate)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformAccountIdentifiers getAccountIdentifiers() {
            return this.accountIdentifiers;
        }

        public String getDeveloperPayload() {
            return this.developerPayload;
        }

        public Boolean getIsAcknowledged() {
            return this.isAcknowledged;
        }

        public Boolean getIsAutoRenewing() {
            return this.isAutoRenewing;
        }

        public String getOrderId() {
            return this.orderId;
        }

        public String getOriginalJson() {
            return this.originalJson;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public PlatformPendingPurchaseUpdate getPendingPurchaseUpdate() {
            return this.pendingPurchaseUpdate;
        }

        public List<String> getProducts() {
            return this.products;
        }

        public PlatformPurchaseState getPurchaseState() {
            return this.purchaseState;
        }

        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public String getSignature() {
            return this.signature;
        }

        public int hashCode() {
            return Objects.hash(this.orderId, this.packageName, this.purchaseTime, this.purchaseToken, this.signature, this.products, this.isAutoRenewing, this.originalJson, this.developerPayload, this.isAcknowledged, this.quantity, this.purchaseState, this.accountIdentifiers, this.pendingPurchaseUpdate);
        }

        public void setAccountIdentifiers(PlatformAccountIdentifiers platformAccountIdentifiers) {
            this.accountIdentifiers = platformAccountIdentifiers;
        }

        public void setDeveloperPayload(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
            }
            this.developerPayload = str;
        }

        public void setIsAcknowledged(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAcknowledged\" is null.");
            }
            this.isAcknowledged = bool;
        }

        public void setIsAutoRenewing(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAutoRenewing\" is null.");
            }
            this.isAutoRenewing = bool;
        }

        public void setOrderId(String str) {
            this.orderId = str;
        }

        public void setOriginalJson(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            this.originalJson = str;
        }

        public void setPackageName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"packageName\" is null.");
            }
            this.packageName = str;
        }

        public void setPendingPurchaseUpdate(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
            this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
        }

        public void setProducts(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"products\" is null.");
            }
            this.products = list;
        }

        public void setPurchaseState(PlatformPurchaseState platformPurchaseState) {
            if (platformPurchaseState == null) {
                throw new IllegalStateException("Nonnull field \"purchaseState\" is null.");
            }
            this.purchaseState = platformPurchaseState;
        }

        public void setPurchaseTime(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
            }
            this.purchaseTime = l10;
        }

        public void setPurchaseToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            this.purchaseToken = str;
        }

        public void setQuantity(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"quantity\" is null.");
            }
            this.quantity = l10;
        }

        public void setSignature(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            this.signature = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.orderId);
            arrayList.add(this.packageName);
            arrayList.add(this.purchaseTime);
            arrayList.add(this.purchaseToken);
            arrayList.add(this.signature);
            arrayList.add(this.products);
            arrayList.add(this.isAutoRenewing);
            arrayList.add(this.originalJson);
            arrayList.add(this.developerPayload);
            arrayList.add(this.isAcknowledged);
            arrayList.add(this.quantity);
            arrayList.add(this.purchaseState);
            arrayList.add(this.accountIdentifiers);
            arrayList.add(this.pendingPurchaseUpdate);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPurchaseHistoryRecord {
        private String developerPayload;
        private String originalJson;
        private List<String> products;
        private Long purchaseTime;
        private String purchaseToken;
        private Long quantity;
        private String signature;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String developerPayload;
            private String originalJson;
            private List<String> products;
            private Long purchaseTime;
            private String purchaseToken;
            private Long quantity;
            private String signature;

            public PlatformPurchaseHistoryRecord build() {
                PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = new PlatformPurchaseHistoryRecord();
                platformPurchaseHistoryRecord.setQuantity(this.quantity);
                platformPurchaseHistoryRecord.setPurchaseTime(this.purchaseTime);
                platformPurchaseHistoryRecord.setDeveloperPayload(this.developerPayload);
                platformPurchaseHistoryRecord.setOriginalJson(this.originalJson);
                platformPurchaseHistoryRecord.setPurchaseToken(this.purchaseToken);
                platformPurchaseHistoryRecord.setSignature(this.signature);
                platformPurchaseHistoryRecord.setProducts(this.products);
                return platformPurchaseHistoryRecord;
            }

            @CanIgnoreReturnValue
            public Builder setDeveloperPayload(String str) {
                this.developerPayload = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOriginalJson(String str) {
                this.originalJson = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProducts(List<String> list) {
                this.products = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseTime(Long l10) {
                this.purchaseTime = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchaseToken(String str) {
                this.purchaseToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setQuantity(Long l10) {
                this.quantity = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSignature(String str) {
                this.signature = str;
                return this;
            }
        }

        public static PlatformPurchaseHistoryRecord fromList(ArrayList<Object> arrayList) {
            PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = new PlatformPurchaseHistoryRecord();
            platformPurchaseHistoryRecord.setQuantity((Long) arrayList.get(0));
            platformPurchaseHistoryRecord.setPurchaseTime((Long) arrayList.get(1));
            platformPurchaseHistoryRecord.setDeveloperPayload((String) arrayList.get(2));
            platformPurchaseHistoryRecord.setOriginalJson((String) arrayList.get(3));
            platformPurchaseHistoryRecord.setPurchaseToken((String) arrayList.get(4));
            platformPurchaseHistoryRecord.setSignature((String) arrayList.get(5));
            platformPurchaseHistoryRecord.setProducts((List) arrayList.get(6));
            return platformPurchaseHistoryRecord;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPurchaseHistoryRecord.class == obj.getClass()) {
                PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = (PlatformPurchaseHistoryRecord) obj;
                if (this.quantity.equals(platformPurchaseHistoryRecord.quantity) && this.purchaseTime.equals(platformPurchaseHistoryRecord.purchaseTime) && Objects.equals(this.developerPayload, platformPurchaseHistoryRecord.developerPayload) && this.originalJson.equals(platformPurchaseHistoryRecord.originalJson) && this.purchaseToken.equals(platformPurchaseHistoryRecord.purchaseToken) && this.signature.equals(platformPurchaseHistoryRecord.signature) && this.products.equals(platformPurchaseHistoryRecord.products)) {
                    return true;
                }
            }
            return false;
        }

        public String getDeveloperPayload() {
            return this.developerPayload;
        }

        public String getOriginalJson() {
            return this.originalJson;
        }

        public List<String> getProducts() {
            return this.products;
        }

        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public String getSignature() {
            return this.signature;
        }

        public int hashCode() {
            return Objects.hash(this.quantity, this.purchaseTime, this.developerPayload, this.originalJson, this.purchaseToken, this.signature, this.products);
        }

        public void setDeveloperPayload(String str) {
            this.developerPayload = str;
        }

        public void setOriginalJson(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            this.originalJson = str;
        }

        public void setProducts(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"products\" is null.");
            }
            this.products = list;
        }

        public void setPurchaseTime(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
            }
            this.purchaseTime = l10;
        }

        public void setPurchaseToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            this.purchaseToken = str;
        }

        public void setQuantity(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"quantity\" is null.");
            }
            this.quantity = l10;
        }

        public void setSignature(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            this.signature = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.quantity);
            arrayList.add(this.purchaseTime);
            arrayList.add(this.developerPayload);
            arrayList.add(this.originalJson);
            arrayList.add(this.purchaseToken);
            arrayList.add(this.signature);
            arrayList.add(this.products);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPurchaseHistoryResponse {
        private PlatformBillingResult billingResult;
        private List<PlatformPurchaseHistoryRecord> purchases;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformPurchaseHistoryRecord> purchases;

            public PlatformPurchaseHistoryResponse build() {
                PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = new PlatformPurchaseHistoryResponse();
                platformPurchaseHistoryResponse.setBillingResult(this.billingResult);
                platformPurchaseHistoryResponse.setPurchases(this.purchases);
                return platformPurchaseHistoryResponse;
            }

            @CanIgnoreReturnValue
            public Builder setBillingResult(PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchases(List<PlatformPurchaseHistoryRecord> list) {
                this.purchases = list;
                return this;
            }
        }

        public static PlatformPurchaseHistoryResponse fromList(ArrayList<Object> arrayList) {
            PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = new PlatformPurchaseHistoryResponse();
            platformPurchaseHistoryResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformPurchaseHistoryResponse.setPurchases((List) arrayList.get(1));
            return platformPurchaseHistoryResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPurchaseHistoryResponse.class == obj.getClass()) {
                PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = (PlatformPurchaseHistoryResponse) obj;
                if (this.billingResult.equals(platformPurchaseHistoryResponse.billingResult) && this.purchases.equals(platformPurchaseHistoryResponse.purchases)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        public List<PlatformPurchaseHistoryRecord> getPurchases() {
            return this.purchases;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.purchases);
        }

        public void setBillingResult(PlatformBillingResult platformBillingResult) {
            if (platformBillingResult == null) {
                throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
            }
            this.billingResult = platformBillingResult;
        }

        public void setPurchases(List<PlatformPurchaseHistoryRecord> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"purchases\" is null.");
            }
            this.purchases = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.purchases);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformPurchaseState {
        UNSPECIFIED(0),
        PURCHASED(1),
        PENDING(2);

        final int index;

        PlatformPurchaseState(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPurchasesResponse {
        private PlatformBillingResult billingResult;
        private List<PlatformPurchase> purchases;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformPurchase> purchases;

            public PlatformPurchasesResponse build() {
                PlatformPurchasesResponse platformPurchasesResponse = new PlatformPurchasesResponse();
                platformPurchasesResponse.setBillingResult(this.billingResult);
                platformPurchasesResponse.setPurchases(this.purchases);
                return platformPurchasesResponse;
            }

            @CanIgnoreReturnValue
            public Builder setBillingResult(PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPurchases(List<PlatformPurchase> list) {
                this.purchases = list;
                return this;
            }
        }

        public static PlatformPurchasesResponse fromList(ArrayList<Object> arrayList) {
            PlatformPurchasesResponse platformPurchasesResponse = new PlatformPurchasesResponse();
            platformPurchasesResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformPurchasesResponse.setPurchases((List) arrayList.get(1));
            return platformPurchasesResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPurchasesResponse.class == obj.getClass()) {
                PlatformPurchasesResponse platformPurchasesResponse = (PlatformPurchasesResponse) obj;
                if (this.billingResult.equals(platformPurchasesResponse.billingResult) && this.purchases.equals(platformPurchasesResponse.purchases)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        public List<PlatformPurchase> getPurchases() {
            return this.purchases;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.purchases);
        }

        public void setBillingResult(PlatformBillingResult platformBillingResult) {
            if (platformBillingResult == null) {
                throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
            }
            this.billingResult = platformBillingResult;
        }

        public void setPurchases(List<PlatformPurchase> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"purchases\" is null.");
            }
            this.purchases = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.purchases);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformQueryProduct {
        private String productId;
        private PlatformProductType productType;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String productId;
            private PlatformProductType productType;

            public PlatformQueryProduct build() {
                PlatformQueryProduct platformQueryProduct = new PlatformQueryProduct();
                platformQueryProduct.setProductId(this.productId);
                platformQueryProduct.setProductType(this.productType);
                return platformQueryProduct;
            }

            @CanIgnoreReturnValue
            public Builder setProductId(String str) {
                this.productId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProductType(PlatformProductType platformProductType) {
                this.productType = platformProductType;
                return this;
            }
        }

        public static PlatformQueryProduct fromList(ArrayList<Object> arrayList) {
            PlatformQueryProduct platformQueryProduct = new PlatformQueryProduct();
            platformQueryProduct.setProductId((String) arrayList.get(0));
            platformQueryProduct.setProductType((PlatformProductType) arrayList.get(1));
            return platformQueryProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformQueryProduct.class == obj.getClass()) {
                PlatformQueryProduct platformQueryProduct = (PlatformQueryProduct) obj;
                if (this.productId.equals(platformQueryProduct.productId) && this.productType.equals(platformQueryProduct.productType)) {
                    return true;
                }
            }
            return false;
        }

        public String getProductId() {
            return this.productId;
        }

        public PlatformProductType getProductType() {
            return this.productType;
        }

        public int hashCode() {
            return Objects.hash(this.productId, this.productType);
        }

        public void setProductId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            this.productId = str;
        }

        public void setProductType(PlatformProductType platformProductType) {
            if (platformProductType == null) {
                throw new IllegalStateException("Nonnull field \"productType\" is null.");
            }
            this.productType = platformProductType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.productId);
            arrayList.add(this.productType);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformRecurrenceMode {
        FINITE_RECURRING(0),
        INFINITE_RECURRING(1),
        NON_RECURRING(2);

        final int index;

        PlatformRecurrenceMode(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformReplacementMode {
        UNKNOWN_REPLACEMENT_MODE(0),
        WITH_TIME_PRORATION(1),
        CHARGE_PRORATED_PRICE(2),
        WITHOUT_PRORATION(3),
        DEFERRED(4),
        CHARGE_FULL_PRICE(5);

        final int index;

        PlatformReplacementMode(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformSubscriptionOfferDetails {
        private String basePlanId;
        private PlatformInstallmentPlanDetails installmentPlanDetails;
        private String offerId;
        private List<String> offerTags;
        private String offerToken;
        private List<PlatformPricingPhase> pricingPhases;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String basePlanId;
            private PlatformInstallmentPlanDetails installmentPlanDetails;
            private String offerId;
            private List<String> offerTags;
            private String offerToken;
            private List<PlatformPricingPhase> pricingPhases;

            public PlatformSubscriptionOfferDetails build() {
                PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = new PlatformSubscriptionOfferDetails();
                platformSubscriptionOfferDetails.setBasePlanId(this.basePlanId);
                platformSubscriptionOfferDetails.setOfferId(this.offerId);
                platformSubscriptionOfferDetails.setOfferToken(this.offerToken);
                platformSubscriptionOfferDetails.setOfferTags(this.offerTags);
                platformSubscriptionOfferDetails.setPricingPhases(this.pricingPhases);
                platformSubscriptionOfferDetails.setInstallmentPlanDetails(this.installmentPlanDetails);
                return platformSubscriptionOfferDetails;
            }

            @CanIgnoreReturnValue
            public Builder setBasePlanId(String str) {
                this.basePlanId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInstallmentPlanDetails(PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
                this.installmentPlanDetails = platformInstallmentPlanDetails;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOfferId(String str) {
                this.offerId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOfferTags(List<String> list) {
                this.offerTags = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOfferToken(String str) {
                this.offerToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPricingPhases(List<PlatformPricingPhase> list) {
                this.pricingPhases = list;
                return this;
            }
        }

        public static PlatformSubscriptionOfferDetails fromList(ArrayList<Object> arrayList) {
            PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = new PlatformSubscriptionOfferDetails();
            platformSubscriptionOfferDetails.setBasePlanId((String) arrayList.get(0));
            platformSubscriptionOfferDetails.setOfferId((String) arrayList.get(1));
            platformSubscriptionOfferDetails.setOfferToken((String) arrayList.get(2));
            platformSubscriptionOfferDetails.setOfferTags((List) arrayList.get(3));
            platformSubscriptionOfferDetails.setPricingPhases((List) arrayList.get(4));
            platformSubscriptionOfferDetails.setInstallmentPlanDetails((PlatformInstallmentPlanDetails) arrayList.get(5));
            return platformSubscriptionOfferDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformSubscriptionOfferDetails.class == obj.getClass()) {
                PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = (PlatformSubscriptionOfferDetails) obj;
                if (this.basePlanId.equals(platformSubscriptionOfferDetails.basePlanId) && Objects.equals(this.offerId, platformSubscriptionOfferDetails.offerId) && this.offerToken.equals(platformSubscriptionOfferDetails.offerToken) && this.offerTags.equals(platformSubscriptionOfferDetails.offerTags) && this.pricingPhases.equals(platformSubscriptionOfferDetails.pricingPhases) && Objects.equals(this.installmentPlanDetails, platformSubscriptionOfferDetails.installmentPlanDetails)) {
                    return true;
                }
            }
            return false;
        }

        public String getBasePlanId() {
            return this.basePlanId;
        }

        public PlatformInstallmentPlanDetails getInstallmentPlanDetails() {
            return this.installmentPlanDetails;
        }

        public String getOfferId() {
            return this.offerId;
        }

        public List<String> getOfferTags() {
            return this.offerTags;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public List<PlatformPricingPhase> getPricingPhases() {
            return this.pricingPhases;
        }

        public int hashCode() {
            return Objects.hash(this.basePlanId, this.offerId, this.offerToken, this.offerTags, this.pricingPhases, this.installmentPlanDetails);
        }

        public void setBasePlanId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
            }
            this.basePlanId = str;
        }

        public void setInstallmentPlanDetails(PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
            this.installmentPlanDetails = platformInstallmentPlanDetails;
        }

        public void setOfferId(String str) {
            this.offerId = str;
        }

        public void setOfferTags(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
            }
            this.offerTags = list;
        }

        public void setOfferToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
            }
            this.offerToken = str;
        }

        public void setPricingPhases(List<PlatformPricingPhase> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"pricingPhases\" is null.");
            }
            this.pricingPhases = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.basePlanId);
            arrayList.add(this.offerId);
            arrayList.add(this.offerToken);
            arrayList.add(this.offerTags);
            arrayList.add(this.pricingPhases);
            arrayList.add(this.installmentPlanDetails);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformUserChoiceDetails {
        private String externalTransactionToken;
        private String originalExternalTransactionId;
        private List<PlatformUserChoiceProduct> products;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String externalTransactionToken;
            private String originalExternalTransactionId;
            private List<PlatformUserChoiceProduct> products;

            public PlatformUserChoiceDetails build() {
                PlatformUserChoiceDetails platformUserChoiceDetails = new PlatformUserChoiceDetails();
                platformUserChoiceDetails.setOriginalExternalTransactionId(this.originalExternalTransactionId);
                platformUserChoiceDetails.setExternalTransactionToken(this.externalTransactionToken);
                platformUserChoiceDetails.setProducts(this.products);
                return platformUserChoiceDetails;
            }

            @CanIgnoreReturnValue
            public Builder setExternalTransactionToken(String str) {
                this.externalTransactionToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOriginalExternalTransactionId(String str) {
                this.originalExternalTransactionId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setProducts(List<PlatformUserChoiceProduct> list) {
                this.products = list;
                return this;
            }
        }

        public static PlatformUserChoiceDetails fromList(ArrayList<Object> arrayList) {
            PlatformUserChoiceDetails platformUserChoiceDetails = new PlatformUserChoiceDetails();
            platformUserChoiceDetails.setOriginalExternalTransactionId((String) arrayList.get(0));
            platformUserChoiceDetails.setExternalTransactionToken((String) arrayList.get(1));
            platformUserChoiceDetails.setProducts((List) arrayList.get(2));
            return platformUserChoiceDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformUserChoiceDetails.class == obj.getClass()) {
                PlatformUserChoiceDetails platformUserChoiceDetails = (PlatformUserChoiceDetails) obj;
                if (Objects.equals(this.originalExternalTransactionId, platformUserChoiceDetails.originalExternalTransactionId) && this.externalTransactionToken.equals(platformUserChoiceDetails.externalTransactionToken) && this.products.equals(platformUserChoiceDetails.products)) {
                    return true;
                }
            }
            return false;
        }

        public String getExternalTransactionToken() {
            return this.externalTransactionToken;
        }

        public String getOriginalExternalTransactionId() {
            return this.originalExternalTransactionId;
        }

        public List<PlatformUserChoiceProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return Objects.hash(this.originalExternalTransactionId, this.externalTransactionToken, this.products);
        }

        public void setExternalTransactionToken(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
            }
            this.externalTransactionToken = str;
        }

        public void setOriginalExternalTransactionId(String str) {
            this.originalExternalTransactionId = str;
        }

        public void setProducts(List<PlatformUserChoiceProduct> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"products\" is null.");
            }
            this.products = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.originalExternalTransactionId);
            arrayList.add(this.externalTransactionToken);
            arrayList.add(this.products);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformUserChoiceProduct {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f37951id;
        private String offerToken;
        private PlatformProductType type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private String f37952id;
            private String offerToken;
            private PlatformProductType type;

            public PlatformUserChoiceProduct build() {
                PlatformUserChoiceProduct platformUserChoiceProduct = new PlatformUserChoiceProduct();
                platformUserChoiceProduct.setId(this.f37952id);
                platformUserChoiceProduct.setOfferToken(this.offerToken);
                platformUserChoiceProduct.setType(this.type);
                return platformUserChoiceProduct;
            }

            @CanIgnoreReturnValue
            public Builder setId(String str) {
                this.f37952id = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOfferToken(String str) {
                this.offerToken = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setType(PlatformProductType platformProductType) {
                this.type = platformProductType;
                return this;
            }
        }

        public static PlatformUserChoiceProduct fromList(ArrayList<Object> arrayList) {
            PlatformUserChoiceProduct platformUserChoiceProduct = new PlatformUserChoiceProduct();
            platformUserChoiceProduct.setId((String) arrayList.get(0));
            platformUserChoiceProduct.setOfferToken((String) arrayList.get(1));
            platformUserChoiceProduct.setType((PlatformProductType) arrayList.get(2));
            return platformUserChoiceProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformUserChoiceProduct.class == obj.getClass()) {
                PlatformUserChoiceProduct platformUserChoiceProduct = (PlatformUserChoiceProduct) obj;
                if (this.f37951id.equals(platformUserChoiceProduct.f37951id) && Objects.equals(this.offerToken, platformUserChoiceProduct.offerToken) && this.type.equals(platformUserChoiceProduct.type)) {
                    return true;
                }
            }
            return false;
        }

        public String getId() {
            return this.f37951id;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public PlatformProductType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.f37951id, this.offerToken, this.type);
        }

        public void setId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f37951id = str;
        }

        public void setOfferToken(String str) {
            this.offerToken = str;
        }

        public void setType(PlatformProductType platformProductType) {
            if (platformProductType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = platformProductType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f37951id);
            arrayList.add(this.offerToken);
            arrayList.add(this.type);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
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
