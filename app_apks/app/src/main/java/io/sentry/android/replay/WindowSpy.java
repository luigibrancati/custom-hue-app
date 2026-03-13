package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.Window;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/sentry/android/replay/WindowSpy;", "", "<init>", "()V", "Landroid/view/View;", "maybeDecorView", "Landroid/view/Window;", "pullWindow", "(Landroid/view/View;)Landroid/view/Window;", "Ljava/lang/Class;", "decorViewClass$delegate", "Lfc/k;", "getDecorViewClass", "()Ljava/lang/Class;", "decorViewClass", "Ljava/lang/reflect/Field;", "windowField$delegate", "getWindowField", "()Ljava/lang/reflect/Field;", "windowField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PrivateApi"})
public final class WindowSpy {
    public static final int $stable;
    public static final WindowSpy INSTANCE = new WindowSpy();

    /* JADX INFO: renamed from: decorViewClass$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k decorViewClass;

    /* JADX INFO: renamed from: windowField$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k windowField;

    static {
        EnumC4031n enumC4031n = EnumC4031n.NONE;
        decorViewClass = C4029l.a(enumC4031n, WindowSpy$decorViewClass$2.INSTANCE);
        windowField = C4029l.a(enumC4031n, WindowSpy$windowField$2.INSTANCE);
        $stable = 8;
    }

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField.getValue();
    }

    public final Window pullWindow(View maybeDecorView) throws IllegalAccessException {
        Field windowField2;
        AbstractC4862t.e(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass2 = getDecorViewClass();
        if (decorViewClass2 == null || !decorViewClass2.isInstance(maybeDecorView) || (windowField2 = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField2.get(maybeDecorView);
        AbstractC4862t.c(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
