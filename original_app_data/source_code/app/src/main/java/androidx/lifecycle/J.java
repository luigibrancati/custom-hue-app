package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.O;
import i3.C4345f;
import i3.InterfaceC4348i;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;
import y1.AbstractC6382a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J extends O.e implements O.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.c f23407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f23408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2754j f23409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4345f f23410f;

    public J() {
        this.f23407c = new O.a();
    }

    @Override // androidx.lifecycle.O.c
    public N a(Class modelClass, AbstractC6382a extras) {
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(extras, "extras");
        String str = (String) extras.a(O.f23421c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(F.f23397a) == null || extras.a(F.f23398b) == null) {
            if (this.f23409e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(O.a.f23425h);
        boolean zIsAssignableFrom = AbstractC2745a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? K.c(modelClass, K.f23412b) : K.c(modelClass, K.f23411a);
        return constructorC == null ? this.f23407c.a(modelClass, extras) : (!zIsAssignableFrom || application == null) ? K.d(modelClass, constructorC, F.b(extras)) : K.d(modelClass, constructorC, application, F.b(extras));
    }

    @Override // androidx.lifecycle.O.c
    public N b(Cc.d modelClass, AbstractC6382a extras) {
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(extras, "extras");
        return a(AbstractC6017a.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.O.c
    public N c(Class modelClass) {
        AbstractC4862t.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.O.e
    public void d(N viewModel) {
        AbstractC4862t.e(viewModel, "viewModel");
        if (this.f23409e != null) {
            C4345f c4345f = this.f23410f;
            AbstractC4862t.b(c4345f);
            AbstractC2754j abstractC2754j = this.f23409e;
            AbstractC4862t.b(abstractC2754j);
            C2753i.a(viewModel, c4345f, abstractC2754j);
        }
    }

    public final N e(String key, Class modelClass) {
        N nD;
        Application application;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC2754j abstractC2754j = this.f23409e;
        if (abstractC2754j == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC2745a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f23406b == null) ? K.c(modelClass, K.f23412b) : K.c(modelClass, K.f23411a);
        if (constructorC == null) {
            return this.f23406b != null ? this.f23407c.c(modelClass) : O.d.f23429b.a().c(modelClass);
        }
        C4345f c4345f = this.f23410f;
        AbstractC4862t.b(c4345f);
        E eB = C2753i.b(c4345f, abstractC2754j, key, this.f23408d);
        if (!zIsAssignableFrom || (application = this.f23406b) == null) {
            nD = K.d(modelClass, constructorC, eB.b());
        } else {
            AbstractC4862t.b(application);
            nD = K.d(modelClass, constructorC, application, eB.b());
        }
        nD.a("androidx.lifecycle.savedstate.vm.tag", eB);
        return nD;
    }

    public J(Application application, InterfaceC4348i owner, Bundle bundle) {
        O.a aVar;
        AbstractC4862t.e(owner, "owner");
        this.f23410f = owner.getSavedStateRegistry();
        this.f23409e = owner.getLifecycle();
        this.f23408d = bundle;
        this.f23406b = application;
        if (application != null) {
            aVar = O.a.f23423f.a(application);
        } else {
            aVar = new O.a();
        }
        this.f23407c = aVar;
    }
}
