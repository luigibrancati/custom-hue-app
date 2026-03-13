package com.hiennv.flutter_callkit_incoming;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiennv.flutter_callkit_incoming.Utils;
import gc.y;
import io.sentry.ProfileChunk;
import java.lang.ref.WeakReference;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/Utils;", "", "<init>", "()V", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Utils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ObjectMapper mapper;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0019\"\u0014\b\u0001\u0010\u001c*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a*\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/Utils$Companion;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getGsonInstance", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "", "dp", "dpToPx", "(F)F", "px", "pxToDp", "", "getScreenWidth", "()I", "getScreenHeight", "Landroid/content/Context;", "context", "getNavigationBarHeight", "(Landroid/content/Context;)I", "getStatusBarHeight", "Lfc/H;", "backToForeground", "(Landroid/content/Context;)V", "T", "", "Ljava/lang/ref/WeakReference;", "C", "reapCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", "", "isTablet", "(Landroid/content/Context;)Z", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean reapCollection$lambda$0(WeakReference it) {
            AbstractC4862t.e(it, "it");
            return it.get() == null;
        }

        public final void backToForeground(Context context) {
            AbstractC4862t.e(context, "context");
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            Intent intentCloneFilter = launchIntentForPackage != null ? launchIntentForPackage.cloneFilter() : null;
            if (intentCloneFilter != null) {
                intentCloneFilter.addFlags(131072);
            }
            if (intentCloneFilter != null) {
                intentCloneFilter.addFlags(268435456);
            }
            context.startActivity(intentCloneFilter);
        }

        public final float dpToPx(float dp) {
            return dp * Resources.getSystem().getDisplayMetrics().density;
        }

        public final ObjectMapper getGsonInstance() {
            if (Utils.mapper == null) {
                Utils.mapper = new ObjectMapper();
            }
            ObjectMapper objectMapper = Utils.mapper;
            AbstractC4862t.b(objectMapper);
            return objectMapper;
        }

        public final int getNavigationBarHeight(Context context) {
            AbstractC4862t.e(context, "context");
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ProfileChunk.PLATFORM_ANDROID);
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public final int getScreenHeight() {
            return Resources.getSystem().getDisplayMetrics().heightPixels;
        }

        public final int getScreenWidth() {
            return Resources.getSystem().getDisplayMetrics().widthPixels;
        }

        public final int getStatusBarHeight(Context context) {
            AbstractC4862t.e(context, "context");
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", ProfileChunk.PLATFORM_ANDROID);
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public final boolean isTablet(Context context) {
            AbstractC4862t.e(context, "context");
            return context.getResources().getBoolean(R.bool.isTablet);
        }

        public final float pxToDp(float px) {
            return px / Resources.getSystem().getDisplayMetrics().density;
        }

        public final <T, C extends Collection<WeakReference<T>>> C reapCollection(C c10) {
            AbstractC4862t.e(c10, "<this>");
            y.H(c10, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.q
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Utils.Companion.reapCollection$lambda$0((WeakReference) obj));
                }
            });
            return c10;
        }

        private Companion() {
        }
    }

    public static final float dpToPx(float f10) {
        return INSTANCE.dpToPx(f10);
    }

    public static final int getScreenHeight() {
        return INSTANCE.getScreenHeight();
    }

    public static final int getScreenWidth() {
        return INSTANCE.getScreenWidth();
    }

    public static final float pxToDp(float f10) {
        return INSTANCE.pxToDp(f10);
    }
}
