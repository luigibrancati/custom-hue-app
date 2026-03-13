package com.google.firebase.sessions;

import P8.h;
import Rd.M;
import Rd.N;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.b;
import f1.AbstractC3985a;
import g1.C4078M;
import g1.C4094d;
import g1.C4100j;
import g1.InterfaceC4087W;
import g1.InterfaceC4099i;
import gc.C4206t;
import h1.C4268b;
import h8.C4288f;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import p9.C5426b;
import p9.C5436l;
import p9.F;
import p9.J;
import p9.SessionData;
import p9.T;
import p9.X;
import p9.Y;
import p9.Z;
import p9.a0;
import s9.SessionConfigs;
import s9.i;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        a a(InterfaceC4992i interfaceC4992i);

        a b(InterfaceC4992i interfaceC4992i);

        b build();

        a c(h hVar);

        a d(C4288f c4288f);

        a e(O8.b bVar);

        a f(Context context);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0375b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32014a = a.f32015a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f32015a = new a();

            public static /* synthetic */ InterfaceC4099i g(a aVar, InterfaceC4087W interfaceC4087W, C4268b c4268b, List list, M m10, InterfaceC6082a interfaceC6082a, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = C4206t.k();
                }
                return aVar.f(interfaceC4087W, c4268b, list, m10, interfaceC6082a);
            }

            public static final SessionConfigs k(C4094d ex) {
                AbstractC4862t.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return i.f44370a.b();
            }

            public static final File l(Context context) throws IOException {
                File fileA = AbstractC3985a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                f32015a.i(fileA);
                return fileA;
            }

            public static final SessionData n(F f10, C4094d ex) {
                AbstractC4862t.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return f10.b();
            }

            public static final File o(Context context) throws IOException {
                File fileA = AbstractC3985a.a(context, "firebaseSessions/sessionDataStore.data");
                f32015a.i(fileA);
                return fileA;
            }

            public final C5426b e(C4288f firebaseApp) {
                AbstractC4862t.e(firebaseApp, "firebaseApp");
                return J.f42331a.b(firebaseApp);
            }

            public final InterfaceC4099i f(InterfaceC4087W interfaceC4087W, C4268b c4268b, List list, M m10, InterfaceC6082a interfaceC6082a) {
                return h() ? C4078M.f34858a.b(interfaceC4087W, c4268b, list, m10, interfaceC6082a) : C4100j.f34942a.a(interfaceC4087W, c4268b, list, m10, interfaceC6082a);
            }

            public final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            public final void i(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && AbstractC4862t.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                try {
                    Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                } catch (Exception e10) {
                    throw new IOException("Failed to create directory: " + parentFile, e10);
                }
            }

            public final InterfaceC4099i j(final Context appContext, InterfaceC4992i blockingDispatcher) {
                AbstractC4862t.e(appContext, "appContext");
                AbstractC4862t.e(blockingDispatcher, "blockingDispatcher");
                return g(this, i.f44370a, new C4268b(new l() { // from class: p9.m
                    @Override // vc.l
                    public final Object invoke(Object obj) {
                        return b.InterfaceC0375b.a.k((C4094d) obj);
                    }
                }), null, N.a(blockingDispatcher), new InterfaceC6082a() { // from class: p9.n
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return b.InterfaceC0375b.a.l(appContext);
                    }
                }, 4, null);
            }

            public final InterfaceC4099i m(final Context appContext, InterfaceC4992i blockingDispatcher, final F sessionDataSerializer) {
                AbstractC4862t.e(appContext, "appContext");
                AbstractC4862t.e(blockingDispatcher, "blockingDispatcher");
                AbstractC4862t.e(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new C4268b(new l() { // from class: p9.o
                    @Override // vc.l
                    public final Object invoke(Object obj) {
                        return b.InterfaceC0375b.a.n(sessionDataSerializer, (C4094d) obj);
                    }
                }), null, N.a(blockingDispatcher), new InterfaceC6082a() { // from class: p9.p
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return b.InterfaceC0375b.a.o(appContext);
                    }
                }, 4, null);
            }

            public final X p() {
                return Y.f42420a;
            }

            public final Z q() {
                return a0.f42427a;
            }
        }
    }

    T a();

    C5436l b();
}
