package io.sentry.android.replay.capture;

import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1 extends v implements InterfaceC6082a {
    final /* synthetic */ T $oldValue;
    final /* synthetic */ q $onChange;
    final /* synthetic */ String $propertyName;
    final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(q qVar, String str, T t10, T t11) {
        super(0);
        this.$onChange = qVar;
        this.$propertyName = str;
        this.$oldValue = t10;
        this.$value = t11;
    }

    @Override // vc.InterfaceC6082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m255invoke();
        return C4015H.f34254a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m255invoke() {
        this.$onChange.invoke(this.$propertyName, this.$oldValue, this.$value);
    }
}
