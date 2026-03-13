package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.util.Log;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t22\u0010\b\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/sentry/android/replay/WindowManagerSpy;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "swap", "Lfc/H;", "swapWindowManagerGlobalMViews", "(Lvc/l;)V", "Ljava/lang/Class;", "windowManagerClass$delegate", "Lfc/k;", "getWindowManagerClass", "()Ljava/lang/Class;", "windowManagerClass", "windowManagerInstance$delegate", "getWindowManagerInstance", "()Ljava/lang/Object;", "windowManagerInstance", "Ljava/lang/reflect/Field;", "mViewsField$delegate", "getMViewsField", "()Ljava/lang/reflect/Field;", "mViewsField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WindowManagerSpy {
    public static final int $stable;
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();

    /* JADX INFO: renamed from: mViewsField$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k mViewsField;

    /* JADX INFO: renamed from: windowManagerClass$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k windowManagerClass;

    /* JADX INFO: renamed from: windowManagerInstance$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k windowManagerInstance;

    static {
        EnumC4031n enumC4031n = EnumC4031n.NONE;
        windowManagerClass = C4029l.a(enumC4031n, WindowManagerSpy$windowManagerClass$2.INSTANCE);
        windowManagerInstance = C4029l.a(enumC4031n, WindowManagerSpy$windowManagerInstance$2.INSTANCE);
        mViewsField = C4029l.a(enumC4031n, WindowManagerSpy$mViewsField$2.INSTANCE);
        $stable = 8;
    }

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance.getValue();
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void swapWindowManagerGlobalMViews(l swap) {
        Field mViewsField2;
        AbstractC4862t.e(swap, "swap");
        try {
            Object windowManagerInstance2 = getWindowManagerInstance();
            if (windowManagerInstance2 == null || (mViewsField2 = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField2.get(windowManagerInstance2);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField2.set(windowManagerInstance2, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
