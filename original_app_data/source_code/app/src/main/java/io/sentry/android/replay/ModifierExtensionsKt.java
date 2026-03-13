package io.sentry.android.replay;

import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import l0.InterfaceC4869e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import vc.l;
import x0.AbstractC6285e;
import x0.InterfaceC6289i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Ll0/e;", "sentryReplayMask", "(Ll0/e;)Ll0/e;", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ModifierExtensionsKt {

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayMask$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/i;", "Lfc/H;", "invoke", "(Lx0/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends v implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6289i) obj);
            return C4015H.f34254a;
        }

        public final void invoke(InterfaceC6289i semantics) {
            AbstractC4862t.e(semantics, "$this$semantics");
            semantics.c(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), MimeTypesReaderMetKeys.MATCH_MASK_ATTR);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayUnmask$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/i;", "Lfc/H;", "invoke", "(Lx0/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46191 extends v implements l {
        public static final C46191 INSTANCE = new C46191();

        public C46191() {
            super(1);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6289i) obj);
            return C4015H.f34254a;
        }

        public final void invoke(InterfaceC6289i semantics) {
            AbstractC4862t.e(semantics, "$this$semantics");
            semantics.c(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
        }
    }

    public static final InterfaceC4869e sentryReplayMask(InterfaceC4869e interfaceC4869e) {
        AbstractC4862t.e(interfaceC4869e, "<this>");
        return AbstractC6285e.c(interfaceC4869e, false, AnonymousClass1.INSTANCE, 1, null);
    }

    public static final InterfaceC4869e sentryReplayUnmask(InterfaceC4869e interfaceC4869e) {
        AbstractC4862t.e(interfaceC4869e, "<this>");
        return AbstractC6285e.c(interfaceC4869e, false, C46191.INSTANCE, 1, null);
    }
}
