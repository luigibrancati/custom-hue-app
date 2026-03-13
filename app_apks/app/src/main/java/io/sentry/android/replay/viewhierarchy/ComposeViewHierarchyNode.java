package io.sentry.android.replay.viewhierarchy;

import Od.F;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.v4.media.session.a;
import android.view.View;
import androidx.compose.ui.node.b;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import s0.AbstractC5703a;
import u0.AbstractC5896e;
import u0.InterfaceC5895d;
import vc.l;
import x0.AbstractC6284d;
import x0.C6281a;
import x0.C6283c;
import x0.C6286f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\n*\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode;", "", "<init>", "()V", "Landroidx/compose/ui/node/b;", "node", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "retrieveSemanticsConfiguration$sentry_android_replay_release", "(Landroidx/compose/ui/node/b;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "retrieveSemanticsConfiguration", "", "isImage", "config", "", "getProxyClassName", "(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "shouldMask", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/SentryOptions;)Z", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parent", "", "distance", "isComposeRoot", "fromComposeNode", "(Landroidx/compose/ui/node/b;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;IZLio/sentry/SentryOptions;)Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parentNode", "Lfc/H;", "traverse", "(Landroidx/compose/ui/node/b;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZLio/sentry/SentryOptions;)V", "Landroid/view/View;", "view", "fromView", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/SentryOptions;)Z", "Ljava/lang/reflect/Method;", "getSemanticsConfigurationMethod$delegate", "Lfc/k;", "getGetSemanticsConfigurationMethod", "()Ljava/lang/reflect/Method;", "getSemanticsConfigurationMethod", "semanticsRetrievalErrorLogged", "Z", "Ljava/lang/ref/WeakReference;", "Lu0/d;", "_rootCoordinates", "Ljava/lang/ref/WeakReference;", "get_rootCoordinates$annotations", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class ComposeViewHierarchyNode {
    private static WeakReference<InterfaceC5895d> _rootCoordinates;
    private static boolean semanticsRetrievalErrorLogged;
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();

    /* JADX INFO: renamed from: getSemanticsConfigurationMethod$delegate, reason: from kotlin metadata */
    private static final InterfaceC4028k getSemanticsConfigurationMethod = C4029l.b(ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2.INSTANCE);
    public static final int $stable = 8;

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(b node, ViewHierarchyNode parent, int distance, boolean isComposeRoot, SentryOptions options) {
        C6281a c6281a;
        l lVar;
        if (!node.T() || !node.R()) {
            return null;
        }
        if (isComposeRoot) {
            _rootCoordinates = new WeakReference<>(AbstractC5896e.a(node.j()));
        }
        InterfaceC5895d interfaceC5895dJ = node.j();
        WeakReference<InterfaceC5895d> weakReference = _rootCoordinates;
        Rect rectBoundsInWindow = NodesKt.boundsInWindow(interfaceC5895dJ, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release = retrieveSemanticsConfiguration$sentry_android_replay_release(node);
            boolean z10 = !node.getOuterCoordinator$ui_release().J0() && (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.d(C6286f.f47289a.b())) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0;
            boolean z11 = (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.d(C6283c.f47242a.b())) || (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.d(C6286f.f47289a.a()));
            if ((semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.d(C6286f.f47289a.c())) || z11) {
                boolean z12 = z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, options);
                if (parent != null) {
                    parent.setImportantForCaptureToAncestors(true);
                }
                ArrayList arrayList = new ArrayList();
                if (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && (c6281a = (C6281a) AbstractC6284d.a(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, C6283c.f47242a.a())) != null && (lVar = (l) c6281a.a()) != null) {
                }
                TextAttributes textAttributesFindTextAttributes = NodesKt.findTextAttributes(node);
                textAttributesFindTextAttributes.getColor();
                textAttributesFindTextAttributes.getHasFillModifier();
                a.a(C4179C.j0(arrayList));
                z0.l.f48688a.a();
                return new ViewHierarchyNode.TextViewHierarchyNode(null, null, 0, 0, rectBoundsInWindow.left, rectBoundsInWindow.top, node.M(), node.n(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z12, true, z10, rectBoundsInWindow, 12, null);
            }
            AbstractC5703a abstractC5703aFindPainter = NodesKt.findPainter(node);
            if (abstractC5703aFindPainter == null) {
                boolean z13 = false;
                if (z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, options)) {
                    z13 = true;
                }
                float f10 = rectBoundsInWindow.left;
                float f11 = rectBoundsInWindow.top;
                int iM = node.M();
                float elevation = 0.0f;
                int iN = node.n();
                if (parent != null) {
                    elevation = parent.getElevation();
                }
                return new ViewHierarchyNode.GenericViewHierarchyNode(f10, f11, iM, iN, elevation, distance, parent, z13, false, z10, rectBoundsInWindow);
            }
            boolean z14 = z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, true, options);
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            float f12 = rectBoundsInWindow.left;
            float f13 = rectBoundsInWindow.top;
            boolean z15 = false;
            int iM2 = node.M();
            int iN2 = node.n();
            float elevation2 = parent != null ? parent.getElevation() : 0.0f;
            if (z14 && NodesKt.isMaskable(abstractC5703aFindPainter)) {
                z15 = true;
            }
            return new ViewHierarchyNode.ImageViewHierarchyNode(f12, f13, iM2, iN2, elevation2, distance, parent, z15, true, z10, rectBoundsInWindow);
        } catch (Throwable th) {
            float elevation3 = 0.0f;
            if (!semanticsRetrievalErrorLogged) {
                semanticsRetrievalErrorLogged = true;
                options.getLogger().log(SentryLevel.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            float f14 = rectBoundsInWindow.left;
            float f15 = rectBoundsInWindow.top;
            int iM3 = node.M();
            int iN3 = node.n();
            if (parent != null) {
                elevation3 = parent.getElevation();
            }
            return new ViewHierarchyNode.GenericViewHierarchyNode(f14, f15, iM3, iN3, elevation3, distance, parent, true, false, !node.getOuterCoordinator$ui_release().J0() && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0, rectBoundsInWindow);
        }
    }

    private final Method getGetSemanticsConfigurationMethod() {
        return (Method) getSemanticsConfigurationMethod.getValue();
    }

    private final String getProxyClassName(boolean isImage, SemanticsConfiguration config) {
        if (isImage) {
            return SentryReplayOptions.IMAGE_VIEW_CLASS_NAME;
        }
        if (config == null) {
            return "android.view.View";
        }
        C6286f c6286f = C6286f.f47289a;
        return (config.d(c6286f.c()) || config.d(C6283c.f47242a.b()) || config.d(c6286f.a())) ? SentryReplayOptions.TEXT_VIEW_CLASS_NAME : "android.view.View";
    }

    public static final SemanticsConfiguration retrieveSemanticsConfiguration$sentry_android_replay_release(b node) {
        AbstractC4862t.e(node, "node");
        Method getSemanticsConfigurationMethod2 = INSTANCE.getGetSemanticsConfigurationMethod();
        return getSemanticsConfigurationMethod2 != null ? (SemanticsConfiguration) getSemanticsConfigurationMethod2.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean shouldMask(SemanticsConfiguration semanticsConfiguration, boolean z10, SentryOptions sentryOptions) {
        String str = semanticsConfiguration != null ? (String) AbstractC6284d.a(semanticsConfiguration, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (AbstractC4862t.a(str, "unmask")) {
            return false;
        }
        if (AbstractC4862t.a(str, MimeTypesReaderMetKeys.MATCH_MASK_ATTR)) {
            return true;
        }
        String proxyClassName = getProxyClassName(z10, semanticsConfiguration);
        if (sentryOptions.getSessionReplay().getUnmaskViewClasses().contains(proxyClassName)) {
            return false;
        }
        return sentryOptions.getSessionReplay().getMaskViewClasses().contains(proxyClassName);
    }

    private final void traverse(b bVar, ViewHierarchyNode viewHierarchyNode, boolean z10, SentryOptions sentryOptions) {
        List children$ui_release = bVar.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar2 = (b) children$ui_release.get(i10);
            ComposeViewHierarchyNode composeViewHierarchyNode = this;
            ViewHierarchyNode viewHierarchyNode2 = viewHierarchyNode;
            boolean z11 = z10;
            SentryOptions sentryOptions2 = sentryOptions;
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = composeViewHierarchyNode.fromComposeNode(bVar2, viewHierarchyNode2, i10, z11, sentryOptions2);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                composeViewHierarchyNode.traverse(bVar2, viewHierarchyNodeFromComposeNode, false, sentryOptions2);
            }
            i10++;
            this = composeViewHierarchyNode;
            viewHierarchyNode = viewHierarchyNode2;
            z10 = z11;
            sentryOptions = sentryOptions2;
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    public final boolean fromView(View view, ViewHierarchyNode parent, SentryOptions options) {
        AbstractC4862t.e(view, "view");
        AbstractC4862t.e(options, "options");
        String name = view.getClass().getName();
        AbstractC4862t.d(name, "getName(...)");
        F.V(name, "AndroidComposeView", false, 2, null);
        return false;
    }

    private static /* synthetic */ void get_rootCoordinates$annotations() {
    }
}
