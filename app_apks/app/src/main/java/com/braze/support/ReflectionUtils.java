package com.braze.support;

import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import fc.C4034q;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u000eJG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\n2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/braze/support/ReflectionUtils;", "", "<init>", "()V", "Ljava/lang/Class;", "clazz", "", "methodName", "", "parameterTypes", "Ljava/lang/reflect/Method;", "getMethodQuietly", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "receiver", "method", "args", "Lfc/q;", "", "invokeMethodQuietly", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lfc/q;", "doesMethodExist", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Z", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean doesMethodExist(String className, String methodName, Class<?>... parameterTypes) {
        AbstractC4862t.e(className, "className");
        AbstractC4862t.e(methodName, "methodName");
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        return getMethodQuietly(className, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length)) != null;
    }

    public static final Method getMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        AbstractC4862t.e(clazz, "clazz");
        AbstractC4862t.e(methodName, "methodName");
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28624D, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.n0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ReflectionUtils.getMethodQuietly$lambda$0();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$0() {
        return "Failed getMethodQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$1() {
        return "Failed getMethodQuietly";
    }

    public static final C4034q invokeMethodQuietly(Object receiver, Method method, Object... args) {
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(args, "args");
        try {
            return new C4034q(Boolean.TRUE, method.invoke(receiver, Arrays.copyOf(args, args.length)));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28624D, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.m0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ReflectionUtils.invokeMethodQuietly$lambda$5();
                }
            }, 4, (Object) null);
            return new C4034q(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeMethodQuietly$lambda$5() {
        return "Failed invokeMethodQuietly";
    }

    public static final Method getMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        AbstractC4862t.e(className, "className");
        AbstractC4862t.e(methodName, "methodName");
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            AbstractC4862t.b(cls);
            return getMethodQuietly(cls, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28624D, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.l0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ReflectionUtils.getMethodQuietly$lambda$1();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
