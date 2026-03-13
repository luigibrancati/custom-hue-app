package io.sentry.android.replay;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WindowManagerSpy$windowManagerInstance$2 extends v implements InterfaceC6082a {
    public static final WindowManagerSpy$windowManagerInstance$2 INSTANCE = new WindowManagerSpy$windowManagerInstance$2();

    public WindowManagerSpy$windowManagerInstance$2() {
        super(0);
    }

    @Override // vc.InterfaceC6082a
    public final Object invoke() {
        Method method;
        Class windowManagerClass = WindowManagerSpy.INSTANCE.getWindowManagerClass();
        if (windowManagerClass == null || (method = windowManagerClass.getMethod("getInstance", null)) == null) {
            return null;
        }
        return method.invoke(null, null);
    }
}
