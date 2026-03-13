package com.github.rmtmckenzie.native_device_orientation;

import android.app.Activity;
import com.github.rmtmckenzie.native_device_orientation.a;
import com.github.rmtmckenzie.native_device_orientation.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i implements a.InterfaceC0355a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28922a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f28923b;

    @Override // com.github.rmtmckenzie.native_device_orientation.a.InterfaceC0355a
    public void a(e eVar) {
        this.f28923b.a();
        this.f28923b = null;
        Iterator it = this.f28922a.iterator();
        while (it.hasNext()) {
            ((a.InterfaceC0355a) it.next()).a(eVar);
        }
        this.f28922a.clear();
    }

    public void b(Activity activity, a.InterfaceC0355a interfaceC0355a) {
        this.f28922a.add(interfaceC0355a);
        if (this.f28923b != null) {
            return;
        }
        h hVar = new h(activity, this, h.b.ui);
        this.f28923b = hVar;
        hVar.b();
    }
}
