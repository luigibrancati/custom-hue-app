package com.amplitude.android.internal.locators;

import A4.a;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import s4.C5717c;
import v4.InterfaceC6039b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/amplitude/android/internal/locators/ComposeViewTargetLocator;", "Lv4/b;", "LA4/a;", SentryEvent.JsonKeys.LOGGER, "<init>", "(LA4/a;)V", "", "Lfc/q;", "", "targetPosition", "Ls4/c$a;", "targetType", "Ls4/c;", "a", "(Ljava/lang/Object;Lfc/q;Ls4/c$a;)Ls4/c;", "LA4/a;", "Lb;", "Lfc/k;", "getComposeLayoutNodeBoundsHelper", "()Lb;", "composeLayoutNodeBoundsHelper", "c", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeViewTargetLocator implements InterfaceC6039b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k composeLayoutNodeBoundsHelper;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final defpackage.b invoke() {
            return new defpackage.b(ComposeViewTargetLocator.this.logger);
        }
    }

    public ComposeViewTargetLocator(a logger) {
        AbstractC4862t.e(logger, "logger");
        this.logger = logger;
        this.composeLayoutNodeBoundsHelper = C4029l.b(new b());
    }

    @Override // v4.InterfaceC6039b
    public C5717c a(Object obj, C4034q targetPosition, C5717c.a targetType) {
        AbstractC4862t.e(obj, "<this>");
        AbstractC4862t.e(targetPosition, "targetPosition");
        AbstractC4862t.e(targetType, "targetType");
        return null;
    }
}
