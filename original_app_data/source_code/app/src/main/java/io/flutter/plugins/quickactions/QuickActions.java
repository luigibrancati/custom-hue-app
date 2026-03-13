package io.flutter.plugins.quickactions;

import M0.c;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.quickactions.Messages;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class QuickActions implements Messages.AndroidQuickActionsApi {
    static final String EXTRA_ACTION = "some unique action key";
    private Activity activity;
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class UiThreadExecutor implements Executor {
        private final Handler handler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    public QuickActions(Context context) {
        this.context = context;
    }

    public static /* synthetic */ void e(boolean z10, Messages.VoidResult voidResult) {
        if (z10) {
            voidResult.success();
        } else {
            voidResult.error(new Messages.FlutterError("quick_action_setshortcutitems_failure", "Exception thrown when setting dynamic shortcuts", null));
        }
    }

    private Intent getIntentToOpenMainActivity(String str) {
        return this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName()).setAction("android.intent.action.RUN").putExtra(EXTRA_ACTION, str).addFlags(268435456).addFlags(536870912);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShortcutItems$1(List list, Executor executor, final Messages.VoidResult voidResult) {
        final boolean z10;
        try {
            M0.e.f(this.context, list);
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        executor.execute(new Runnable() { // from class: io.flutter.plugins.quickactions.f
            @Override // java.lang.Runnable
            public final void run() {
                QuickActions.e(z10, voidResult);
            }
        });
    }

    private int loadResourceId(Context context, String str) {
        if (str == null) {
            return 0;
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "drawable", packageName);
        return identifier == 0 ? resources.getIdentifier(str, "mipmap", packageName) : identifier;
    }

    @SuppressLint({"UseRequiresApi"})
    @TargetApi(25)
    private List<M0.c> shortcutItemMessageToShortcutInfo(List<Messages.ShortcutItemMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (Messages.ShortcutItemMessage shortcutItemMessage : list) {
            String icon = shortcutItemMessage.getIcon();
            String type = shortcutItemMessage.getType();
            String localizedTitle = shortcutItemMessage.getLocalizedTitle();
            c.b bVar = new c.b(this.context, type);
            int iLoadResourceId = loadResourceId(this.context, icon);
            Intent intentToOpenMainActivity = getIntentToOpenMainActivity(type);
            if (iLoadResourceId > 0) {
                bVar.b(IconCompat.j(this.context, iLoadResourceId));
            }
            arrayList.add(bVar.e(localizedTitle).f(localizedTitle).c(intentToOpenMainActivity).a());
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.quickactions.Messages.AndroidQuickActionsApi
    public void clearShortcutItems() {
        if (isVersionAllowed()) {
            M0.e.c(this.context);
        }
    }

    public Activity getActivity() {
        return this.activity;
    }

    @Override // io.flutter.plugins.quickactions.Messages.AndroidQuickActionsApi
    public String getLaunchAction() {
        if (!isVersionAllowed()) {
            return null;
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new Messages.FlutterError("quick_action_getlaunchaction_no_activity", "There is no activity available when launching action", null);
        }
        Intent intent = activity.getIntent();
        String stringExtra = intent.getStringExtra(EXTRA_ACTION);
        if (stringExtra != null && !stringExtra.isEmpty()) {
            M0.e.e(this.context, stringExtra);
            intent.removeExtra(EXTRA_ACTION);
        }
        return stringExtra;
    }

    public boolean isVersionAllowed() {
        return true;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.quickactions.Messages.AndroidQuickActionsApi
    public void setShortcutItems(List<Messages.ShortcutItemMessage> list, final Messages.VoidResult voidResult) {
        if (!isVersionAllowed()) {
            voidResult.success();
            return;
        }
        final List<M0.c> listShortcutItemMessageToShortcutInfo = shortcutItemMessageToShortcutInfo(list);
        final UiThreadExecutor uiThreadExecutor = new UiThreadExecutor();
        new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: io.flutter.plugins.quickactions.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f37995a.lambda$setShortcutItems$1(listShortcutItemMessageToShortcutInfo, uiThreadExecutor, voidResult);
            }
        });
    }
}
