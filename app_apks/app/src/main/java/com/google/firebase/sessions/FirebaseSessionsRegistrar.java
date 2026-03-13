package com.google.firebase.sessions;

import P8.h;
import Rd.I;
import Y5.j;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.b;
import g1.C4078M;
import gc.C4206t;
import h8.C4288f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import n8.InterfaceC5149a;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.q;
import p9.C5436l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo8/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final E appContext;
    private static final E backgroundDispatcher;
    private static final E blockingDispatcher;
    private static final E firebaseApp;
    private static final E firebaseInstallationsApi;
    private static final E firebaseSessionsComponent;
    private static final E transportFactory;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        E eB = E.b(Context.class);
        AbstractC4862t.d(eB, "unqualified(...)");
        appContext = eB;
        E eB2 = E.b(C4288f.class);
        AbstractC4862t.d(eB2, "unqualified(...)");
        firebaseApp = eB2;
        E eB3 = E.b(h.class);
        AbstractC4862t.d(eB3, "unqualified(...)");
        firebaseInstallationsApi = eB3;
        E eA = E.a(InterfaceC5149a.class, I.class);
        AbstractC4862t.d(eA, "qualified(...)");
        backgroundDispatcher = eA;
        E eA2 = E.a(n8.b.class, I.class);
        AbstractC4862t.d(eA2, "qualified(...)");
        blockingDispatcher = eA2;
        E eB4 = E.b(j.class);
        AbstractC4862t.d(eB4, "unqualified(...)");
        transportFactory = eB4;
        E eB5 = E.b(b.class);
        AbstractC4862t.d(eB5, "unqualified(...)");
        firebaseSessionsComponent = eB5;
        try {
            C4078M.f34858a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5436l getComponents$lambda$0(InterfaceC5234d interfaceC5234d) {
        return ((b) interfaceC5234d.g(firebaseSessionsComponent)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(InterfaceC5234d interfaceC5234d) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objG = interfaceC5234d.g(appContext);
        AbstractC4862t.d(objG, "get(...)");
        b.a aVarF = aVarA.f((Context) objG);
        Object objG2 = interfaceC5234d.g(backgroundDispatcher);
        AbstractC4862t.d(objG2, "get(...)");
        b.a aVarB = aVarF.b((InterfaceC4992i) objG2);
        Object objG3 = interfaceC5234d.g(blockingDispatcher);
        AbstractC4862t.d(objG3, "get(...)");
        b.a aVarA2 = aVarB.a((InterfaceC4992i) objG3);
        Object objG4 = interfaceC5234d.g(firebaseApp);
        AbstractC4862t.d(objG4, "get(...)");
        b.a aVarD = aVarA2.d((C4288f) objG4);
        Object objG5 = interfaceC5234d.g(firebaseInstallationsApi);
        AbstractC4862t.d(objG5, "get(...)");
        b.a aVarC = aVarD.c((h) objG5);
        O8.b bVarB = interfaceC5234d.b(transportFactory);
        AbstractC4862t.d(bVarB, "getProvider(...)");
        return aVarC.e(bVarB).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        return C4206t.n(C5233c.c(C5436l.class).h(LIBRARY_NAME).b(q.l(firebaseSessionsComponent)).f(new o8.g() { // from class: p9.q
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC5234d);
            }
        }).e().d(), C5233c.c(b.class).h("fire-sessions-component").b(q.l(appContext)).b(q.l(backgroundDispatcher)).b(q.l(blockingDispatcher)).b(q.l(firebaseApp)).b(q.l(firebaseInstallationsApi)).b(q.n(transportFactory)).f(new o8.g() { // from class: p9.r
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC5234d);
            }
        }).d(), j9.h.b(LIBRARY_NAME, "3.0.3"));
    }
}
