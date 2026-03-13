package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.O;
import i3.C4345f;
import i3.InterfaceC4348i;
import kotlin.jvm.internal.AbstractC4862t;
import y1.AbstractC6382a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6382a.c f23397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6382a.c f23398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6382a.c f23399c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements O.c {
        @Override // androidx.lifecycle.O.c
        public N b(Cc.d modelClass, AbstractC6382a extras) {
            AbstractC4862t.e(modelClass, "modelClass");
            AbstractC4862t.e(extras, "extras");
            return new I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements AbstractC6382a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements AbstractC6382a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements AbstractC6382a.c {
    }

    static {
        AbstractC6382a.C0671a c0671a = AbstractC6382a.f48333b;
        f23397a = new b();
        f23398b = new c();
        f23399c = new d();
    }

    public static final C a(InterfaceC4348i interfaceC4348i, Q q10, String str, Bundle bundle) {
        H hD = d(interfaceC4348i);
        I iE = e(q10);
        C c10 = (C) iE.e().get(str);
        if (c10 != null) {
            return c10;
        }
        C cA = C.f23390c.a(hD.c(str), bundle);
        iE.e().put(str, cA);
        return cA;
    }

    public static final C b(AbstractC6382a abstractC6382a) {
        AbstractC4862t.e(abstractC6382a, "<this>");
        InterfaceC4348i interfaceC4348i = (InterfaceC4348i) abstractC6382a.a(f23397a);
        if (interfaceC4348i == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Q q10 = (Q) abstractC6382a.a(f23398b);
        if (q10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC6382a.a(f23399c);
        String str = (String) abstractC6382a.a(O.f23421c);
        if (str != null) {
            return a(interfaceC4348i, q10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final void c(InterfaceC4348i interfaceC4348i) {
        AbstractC4862t.e(interfaceC4348i, "<this>");
        AbstractC2754j.b bVarB = interfaceC4348i.getLifecycle().b();
        if (bVarB != AbstractC2754j.b.INITIALIZED && bVarB != AbstractC2754j.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC4348i.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            H h10 = new H(interfaceC4348i.getSavedStateRegistry(), (Q) interfaceC4348i);
            interfaceC4348i.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", h10);
            interfaceC4348i.getLifecycle().a(new D(h10));
        }
    }

    public static final H d(InterfaceC4348i interfaceC4348i) {
        AbstractC4862t.e(interfaceC4348i, "<this>");
        C4345f.b bVarB = interfaceC4348i.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        H h10 = bVarB instanceof H ? (H) bVarB : null;
        if (h10 != null) {
            return h10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final I e(Q q10) {
        AbstractC4862t.e(q10, "<this>");
        return (I) O.b.b(O.f23420b, q10, new a(), null, 4, null).c("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.M.b(I.class));
    }
}
