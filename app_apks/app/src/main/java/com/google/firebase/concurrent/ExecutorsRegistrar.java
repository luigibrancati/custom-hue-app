package com.google.firebase.concurrent;

import O8.b;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import n8.InterfaceC5149a;
import n8.c;
import n8.d;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.g;
import o8.w;
import p8.ScheduledExecutorServiceC5422o;
import p8.ThreadFactoryC5409b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f31590a = new w(new b() { // from class: p8.q
        @Override // O8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f31591b = new w(new b() { // from class: p8.r
        @Override // O8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f31592c = new w(new b() { // from class: p8.s
        @Override // O8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f31593d = new w(new b() { // from class: p8.t
        @Override // O8.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC5234d interfaceC5234d) {
        return (ScheduledExecutorService) f31591b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC5234d interfaceC5234d) {
        return (ScheduledExecutorService) f31592c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC5234d interfaceC5234d) {
        return (ScheduledExecutorService) f31590a.get();
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i10) {
        return new ThreadFactoryC5409b(str, i10, null);
    }

    public static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC5409b(str, i10, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC5422o(executorService, (ScheduledExecutorService) f31593d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C5233c.f(E.a(InterfaceC5149a.class, ScheduledExecutorService.class), E.a(InterfaceC5149a.class, ExecutorService.class), E.a(InterfaceC5149a.class, Executor.class)).f(new g() { // from class: p8.u
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return ExecutorsRegistrar.g(interfaceC5234d);
            }
        }).d(), C5233c.f(E.a(n8.b.class, ScheduledExecutorService.class), E.a(n8.b.class, ExecutorService.class), E.a(n8.b.class, Executor.class)).f(new g() { // from class: p8.v
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return ExecutorsRegistrar.e(interfaceC5234d);
            }
        }).d(), C5233c.f(E.a(c.class, ScheduledExecutorService.class), E.a(c.class, ExecutorService.class), E.a(c.class, Executor.class)).f(new g() { // from class: p8.w
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return ExecutorsRegistrar.a(interfaceC5234d);
            }
        }).d(), C5233c.e(E.a(d.class, Executor.class)).f(new g() { // from class: p8.x
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return EnumC5407A.INSTANCE;
            }
        }).d());
    }
}
