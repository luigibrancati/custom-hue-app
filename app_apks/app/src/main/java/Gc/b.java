package Gc;

import fc.InterfaceC4028k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f4697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f4698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4699e;

    public b(Class cls, Map map, InterfaceC4028k interfaceC4028k, InterfaceC4028k interfaceC4028k2, List list) {
        this.f4695a = cls;
        this.f4696b = map;
        this.f4697c = interfaceC4028k;
        this.f4698d = interfaceC4028k2;
        this.f4699e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return c.i(this.f4695a, this.f4696b, this.f4697c, this.f4698d, this.f4699e, obj, method, objArr);
    }
}
