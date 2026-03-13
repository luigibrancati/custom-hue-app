package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.m;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationFactory;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroid/app/Notification;", "createNotification", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroid/app/Notification;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeNotificationFactory implements IBrazeNotificationFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroidx/core/app/m$e;", "populateNotificationBuilder", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$e;", "Lcom/braze/push/BrazeNotificationFactory;", "getInstance", "()Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", "instance", "internalInstance", "Lcom/braze/push/BrazeNotificationFactory;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
            return "Using BrazeNotificationPayload: " + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$1() {
            return "BrazeNotificationPayload has null context. Not creating notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$2() {
            return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        public final m.e populateNotificationBuilder(final BrazeNotificationPayload payload) {
            AbstractC4862t.e(payload, "payload");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$0(payload);
                }
            }, 6, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.n
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$1();
                    }
                }, 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.o
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$2();
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            m.e eVarG = new m.e(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload)).g(true);
            AbstractC4862t.d(eVarG, "setAutoCancel(...)");
            BrazeNotificationUtils.setTitleIfPresent(eVarG, payload);
            BrazeNotificationUtils.setContentIfPresent(eVarG, payload);
            BrazeNotificationUtils.setTickerIfPresent(eVarG, payload);
            BrazeNotificationUtils.setSetShowWhen(eVarG, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, eVarG, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, eVarG, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, eVarG);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(eVarG, payload);
            BrazeNotificationStyleFactory.INSTANCE.setStyleIfSupported(eVarG, payload);
            BrazeNotificationActionUtils.addNotificationActions(eVarG, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(eVarG, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(eVarG, payload);
            return eVarG;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createNotification$lambda$0() {
        return "Notification could not be built. Returning null as created notification";
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        m.e eVarPopulateNotificationBuilder = INSTANCE.populateNotificationBuilder(payload);
        if (eVarPopulateNotificationBuilder != null) {
            return eVarPopulateNotificationBuilder.d();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationFactory.createNotification$lambda$0();
            }
        }, 6, (Object) null);
        return null;
    }
}
