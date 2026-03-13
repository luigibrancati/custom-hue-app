package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3692n {
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6.b(str));
    }

    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new C6.b("Firebase-Messaging-Init"));
    }

    public static ExecutorService d() {
        return V8.b.a().a(new C6.b("Firebase-Messaging-Intent-Handle"), V8.c.HIGH_SPEED);
    }

    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new C6.b("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new C6.b("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new C6.b("Firebase-Messaging-Topics-Io"));
    }
}
