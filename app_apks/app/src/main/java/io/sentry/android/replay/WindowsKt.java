package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"phoneWindow", "Landroid/view/Window;", "Landroid/view/View;", "getPhoneWindow", "(Landroid/view/View;)Landroid/view/Window;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowsKt {
    public static final Window getPhoneWindow(View view) {
        AbstractC4862t.e(view, "<this>");
        WindowSpy windowSpy = WindowSpy.INSTANCE;
        View rootView = view.getRootView();
        AbstractC4862t.d(rootView, "getRootView(...)");
        return windowSpy.pullWindow(rootView);
    }
}
