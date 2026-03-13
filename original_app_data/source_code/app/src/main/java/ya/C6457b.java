package ya;

import android.content.Intent;
import com.spotify.sdk.android.auth.c;
import com.spotify.sdk.android.auth.d;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.l;

/* JADX INFO: renamed from: ya.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6457b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityPluginBinding f48502a;

    /* JADX INFO: renamed from: ya.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48503a;

        static {
            int[] iArr = new int[d.c.values().length];
            try {
                iArr[d.c.CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.c.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.c.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48503a = iArr;
        }
    }

    public C6457b(ActivityPluginBinding activityBinding) {
        AbstractC4862t.e(activityBinding, "activityBinding");
        this.f48502a = activityBinding;
    }

    public static final boolean c(l lVar, l lVar2, C6457b c6457b, L l10, int i10, int i11, Intent intent) {
        PluginRegistry.ActivityResultListener activityResultListener;
        if (i10 != 1337) {
            return false;
        }
        com.spotify.sdk.android.auth.d dVarF = com.spotify.sdk.android.auth.a.f(i11, intent);
        d.c cVarD = dVarF.d();
        int i12 = cVarD == null ? -1 : a.f48503a[cVarD.ordinal()];
        if (i12 == 1) {
            String strB = dVarF.b();
            AbstractC4862t.d(strB, "getCode(...)");
            lVar.invoke(strB);
        } else if (i12 == 2) {
            String strC = dVarF.c();
            AbstractC4862t.d(strC, "getError(...)");
            lVar2.invoke(strC);
        } else if (i12 != 3) {
            lVar2.invoke("unknown");
        } else {
            lVar2.invoke("cancelled");
        }
        ActivityPluginBinding activityPluginBinding = c6457b.f48502a;
        Object obj = l10.f39776a;
        if (obj == null) {
            AbstractC4862t.p("resultListener");
            activityResultListener = null;
        } else {
            activityResultListener = (PluginRegistry.ActivityResultListener) obj;
        }
        activityPluginBinding.removeActivityResultListener(activityResultListener);
        return true;
    }

    public final void b(c requestInput, final l onAuthenticationCode, final l onError) {
        AbstractC4862t.e(requestInput, "requestInput");
        AbstractC4862t.e(onAuthenticationCode, "onAuthenticationCode");
        AbstractC4862t.e(onError, "onError");
        final L l10 = new L();
        com.spotify.sdk.android.auth.c cVarD = d(requestInput.b(), requestInput.a(), requestInput.c());
        PluginRegistry.ActivityResultListener activityResultListener = new PluginRegistry.ActivityResultListener() { // from class: ya.a
            @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
            public final boolean onActivityResult(int i10, int i11, Intent intent) {
                return C6457b.c(onAuthenticationCode, onError, this, l10, i10, i11, intent);
            }
        };
        l10.f39776a = activityResultListener;
        this.f48502a.addActivityResultListener(activityResultListener);
        com.spotify.sdk.android.auth.a.h(this.f48502a.getActivity(), 1337, cVarD);
    }

    public final com.spotify.sdk.android.auth.c d(String str, String str2, String str3) {
        return new c.b(str, d.c.CODE, str2).c(false).b(new String[]{str3}).a();
    }
}
