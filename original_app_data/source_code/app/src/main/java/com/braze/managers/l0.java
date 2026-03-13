package com.braze.managers;

import android.content.Context;
import b7.InterfaceC2872f;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f27948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f27949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f27950d;

    public l0(Context context, q0 registrationDataProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(registrationDataProvider, "registrationDataProvider");
        this.f27947a = context;
        this.f27948b = registrationDataProvider;
        this.f27949c = C4029l.b(new InterfaceC6082a() { // from class: c5.Y1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(com.braze.managers.l0.c());
            }
        });
        this.f27950d = C4029l.b(new InterfaceC6082a() { // from class: c5.Z1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(com.braze.managers.l0.d());
            }
        });
    }

    public static final String b(String str) {
        return "Automatically obtained Firebase Cloud Messaging push token: " + str;
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Failed to get push token via instance id";
    }

    public static final String j() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public final void a(String firebaseSenderId) {
        AbstractC4862t.e(firebaseSenderId, "firebaseSenderId");
        try {
            if (((Boolean) this.f27950d.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().b(new InterfaceC2872f() { // from class: c5.W1
                    @Override // b7.InterfaceC2872f
                    public final void a(Task task) {
                        com.braze.managers.l0.a(this.f25690a, task);
                    }
                });
            } else if (((Boolean) this.f27949c.getValue()).booleanValue()) {
                c(firebaseSenderId);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.X1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.l0.e();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final String d(String str) {
        return "Registering for Firebase Cloud Messaging token using sender id: " + str;
    }

    public final void c(final String str) {
        l0 l0Var;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.c2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.l0.d(str);
            }
        }, 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.d2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.l0.j();
                    }
                }, 7, (Object) null);
                return;
            }
            C4034q c4034qInvokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!((Boolean) c4034qInvokeMethodQuietly.e()).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.e2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.l0.k();
                    }
                }, 7, (Object) null);
                return;
            }
            Object objF = c4034qInvokeMethodQuietly.f();
            if (objF == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.R1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.l0.f();
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(objF.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.S1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.l0.g();
                    }
                }, 7, (Object) null);
                return;
            }
            C4034q c4034qInvokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(objF, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!((Boolean) c4034qInvokeMethodQuietly2.e()).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.T1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.l0.h();
                    }
                }, 7, (Object) null);
                return;
            }
            final Object objF2 = c4034qInvokeMethodQuietly2.f();
            if (objF2 instanceof String) {
                l0Var = this;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) l0Var, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.U1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.l0.a(objF2);
                        }
                    }, 6, (Object) null);
                    ((z0) l0Var.f27948b).a((String) objF2);
                } catch (Exception e10) {
                    e = e10;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.f28625E, (Throwable) e, false, new InterfaceC6082a() { // from class: c5.V1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.l0.i();
                        }
                    }, 4, (Object) null);
                }
            }
        } catch (Exception e11) {
            e = e11;
            l0Var = this;
        }
    }

    public static final void a(l0 l0Var, final Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.a2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.l0.a(task);
                }
            }, 6, (Object) null);
            return;
        }
        final String str = (String) task.m();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l0Var, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.b2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.l0.b(str);
            }
        }, 6, (Object) null);
        ((z0) l0Var.f27948b).a(str);
    }

    public static final String a(Task task) {
        return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + task.l();
    }

    public final boolean a() {
        if (com.braze.support.p.b(this.f27947a)) {
            return ((Boolean) this.f27950d.getValue()).booleanValue() || ((Boolean) this.f27949c.getValue()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Q1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.l0.b();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return "Automatically obtained Firebase Cloud Messaging token: " + obj;
    }
}
