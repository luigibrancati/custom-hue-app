package com.google.android.gms.tasks;

import b7.AbstractC2879m;
import b7.C2864M;
import b7.C2866O;
import b7.C2881o;
import b7.C2883q;
import b7.InterfaceC2882p;
import b7.RunnableC2865N;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Tasks {
    public static Object a(Task task, long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC6056k.j();
        AbstractC6056k.h();
        AbstractC6056k.m(task, "Task must not be null");
        AbstractC6056k.m(timeUnit, "TimeUnit must not be null");
        if (task.p()) {
            return k(task);
        }
        C2881o c2881o = new C2881o(null);
        l(task, c2881o);
        if (c2881o.d(j10, timeUnit)) {
            return k(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> TResult await(Task<TResult> task) {
        AbstractC6056k.j();
        AbstractC6056k.h();
        AbstractC6056k.m(task, "Task must not be null");
        if (task.p()) {
            return (TResult) k(task);
        }
        C2881o c2881o = new C2881o(null);
        l(task, c2881o);
        c2881o.b();
        return (TResult) k(task);
    }

    public static Task b(Executor executor, Callable callable) {
        AbstractC6056k.m(executor, "Executor must not be null");
        AbstractC6056k.m(callable, "Callback must not be null");
        C2864M c2864m = new C2864M();
        executor.execute(new RunnableC2865N(c2864m, callable));
        return c2864m;
    }

    public static Task c() {
        C2864M c2864m = new C2864M();
        c2864m.x();
        return c2864m;
    }

    public static Task d(Exception exc) {
        C2864M c2864m = new C2864M();
        c2864m.v(exc);
        return c2864m;
    }

    public static Task e(Object obj) {
        C2864M c2864m = new C2864M();
        c2864m.t(obj);
        return c2864m;
    }

    public static Task f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C2864M c2864m = new C2864M();
        C2883q c2883q = new C2883q(collection.size(), c2864m);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            l((Task) it2.next(), c2883q);
        }
        return c2864m;
    }

    public static Task g(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? e(null) : f(Arrays.asList(taskArr));
    }

    public static Task h(Collection collection) {
        return i(AbstractC2879m.f25415a, collection);
    }

    public static Task i(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.EMPTY_LIST) : f(collection).k(executor, new C2866O(collection));
    }

    public static Task j(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? e(Collections.EMPTY_LIST) : h(Arrays.asList(taskArr));
    }

    public static Object k(Task task) throws ExecutionException {
        if (task.q()) {
            return task.m();
        }
        if (task.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.l());
    }

    public static void l(Task task, InterfaceC2882p interfaceC2882p) {
        Executor executor = AbstractC2879m.f25416b;
        task.i(executor, interfaceC2882p);
        task.f(executor, interfaceC2882p);
        task.a(executor, interfaceC2882p);
    }
}
