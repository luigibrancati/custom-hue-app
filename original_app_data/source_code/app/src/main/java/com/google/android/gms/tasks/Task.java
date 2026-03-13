package com.google.android.gms.tasks;

import android.app.Activity;
import b7.InterfaceC2869c;
import b7.InterfaceC2871e;
import b7.InterfaceC2872f;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import b7.InterfaceC2877k;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Task<TResult> {
    public Task a(Executor executor, InterfaceC2871e interfaceC2871e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task b(InterfaceC2872f interfaceC2872f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task c(Executor executor, InterfaceC2872f interfaceC2872f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task d(Activity activity, InterfaceC2873g interfaceC2873g);

    public abstract Task e(InterfaceC2873g interfaceC2873g);

    public abstract Task f(Executor executor, InterfaceC2873g interfaceC2873g);

    public abstract Task g(Activity activity, InterfaceC2874h interfaceC2874h);

    public abstract Task h(InterfaceC2874h interfaceC2874h);

    public abstract Task i(Executor executor, InterfaceC2874h interfaceC2874h);

    public Task j(Executor executor, InterfaceC2869c interfaceC2869c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task k(Executor executor, InterfaceC2869c interfaceC2869c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception l();

    public abstract Object m();

    public abstract Object n(Class cls);

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public Task r(InterfaceC2877k interfaceC2877k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task s(Executor executor, InterfaceC2877k interfaceC2877k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
