package com.braze;

import Od.C;
import Od.F;
import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.DataStoreKey;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.managers.i1;
import com.braze.managers.j1;
import com.braze.managers.n0;
import com.braze.managers.o0;
import com.braze.managers.q0;
import com.braze.managers.r;
import com.braze.managers.r0;
import com.braze.managers.v0;
import com.braze.managers.y0;
import com.braze.managers.z0;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.n3;
import com.braze.storage.s0;
import com.braze.storage.t0;
import com.braze.storage.v2;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import fc.C4015H;
import gc.C4206t;
import gc.C4207u;
import gc.T;
import gc.U;
import io.sentry.clientreport.DiscardedEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0095\u00022\u00020\u0001:\u0002\u0095\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010$\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J?\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J-\u00105\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u00104\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u00107\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u0013J\u000f\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u0013J\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\u0013J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u0004\u0018\u00010>2\u0006\u0010A\u001a\u00020\u0018H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u0018H\u0016¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u00020\u000b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180=H\u0016¢\u0006\u0004\bG\u0010HJ-\u0010G\u001a\u00020\u000b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180=2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010IH\u0016¢\u0006\u0004\bG\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010A\u001a\u00020\u0018H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010P\u001a\u00020\u0018H\u0016¢\u0006\u0004\bQ\u0010\u001bJ!\u0010S\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u00182\b\u0010R\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bS\u00109J\u000f\u0010T\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010\u0013J\u001d\u0010X\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0UH\u0016¢\u0006\u0004\bX\u0010YJ\u001d\u0010[\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020Z0UH\u0016¢\u0006\u0004\b[\u0010YJ\u001d\u0010]\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\\0UH\u0016¢\u0006\u0004\b]\u0010YJ\u001d\u0010^\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020J0UH\u0016¢\u0006\u0004\b^\u0010YJ\u001d\u0010`\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020_0UH\u0016¢\u0006\u0004\b`\u0010YJ\u001d\u0010b\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020a0UH\u0016¢\u0006\u0004\bb\u0010YJ\u001d\u0010d\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020c0UH\u0016¢\u0006\u0004\bd\u0010YJ1\u0010h\u001a\u00020\u000b\"\u0004\b\u0000\u0010e2\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000U2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000fH\u0016¢\u0006\u0004\bh\u0010iJ3\u0010j\u001a\u00020\u000b\"\u0004\b\u0000\u0010e2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010U2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000fH\u0016¢\u0006\u0004\bj\u0010iJ\u0019\u0010l\u001a\u00020\u000b2\b\u0010k\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bl\u0010EJ#\u0010l\u001a\u00020\u000b2\b\u0010k\u001a\u0004\u0018\u00010\u00182\b\u0010m\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bl\u00109J\u001d\u0010o\u001a\u00020\u000b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020n0IH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010=H\u0016¢\u0006\u0004\br\u0010@J\u001b\u0010t\u001a\u0004\u0018\u00010q2\b\u0010s\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bt\u0010uJ\u001b\u0010t\u001a\u0004\u0018\u00010q2\b\u0010w\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\bt\u0010xJ\u001b\u0010{\u001a\u0004\u0018\u00010z2\b\u0010y\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\u000bH\u0016¢\u0006\u0004\b}\u0010\u0013J$\u0010\u0080\u0001\u001a\u00020\u000b2\b\u0010~\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u007f\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0082\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0083\u0001\u0010EJ\u001a\u0010\u0086\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0085\u0001\u0010\rJ$\u0010\u0089\u0001\u001a\u00020\u000b2\u0007\u0010\u0087\u0001\u001a\u00020\u00182\b\u0010k\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0005\b\u0088\u0001\u00109J\u0011\u0010\u008b\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008a\u0001\u0010\u0013J\u0011\u0010\u008d\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008c\u0001\u0010\u0013J\u0019\u0010\u008f\u0001\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0005\b\u008e\u0001\u00101J\u0011\u0010\u0091\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0090\u0001\u0010\u0013J\u0011\u0010\u0093\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0092\u0001\u0010\u0013J\u001b\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0094\u0001\u001a\u00020VH\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001b\u0010\u0099\u0001\u001a\u00020\u000b2\u0007\u0010\u0094\u0001\u001a\u00020VH\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0096\u0001J&\u0010 \u0001\u001a\u00020\u000b2\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J$\u0010¥\u0001\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00182\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010¨\u0001\u001a\u00020\u000b2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010ª\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b©\u0001\u0010\u0013J\u001a\u0010\u00ad\u0001\u001a\u00020\u000b2\u0007\u0010«\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\b¬\u0001\u0010EJ\u001a\u0010°\u0001\u001a\u00020\t2\u0007\u0010®\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\b¯\u0001\u0010\u001bJz\u0010½\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010e2\u0007\u0010±\u0001\u001a\u00028\u00002\u000e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180²\u00012\t\b\u0002\u0010´\u0001\u001a\u00020\t2\t\b\u0002\u0010µ\u0001\u001a\u00020\t2\t\b\u0002\u0010¶\u0001\u001a\u00020\t2&\u0010º\u0001\u001a!\b\u0001\u0012\u0005\u0012\u00030¸\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000¹\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010·\u0001H\u0001¢\u0006\u0006\b»\u0001\u0010¼\u0001JS\u0010À\u0001\u001a\u00020\u000b2\u000e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180²\u00012\t\b\u0002\u0010´\u0001\u001a\u00020\t2\t\b\u0002\u0010µ\u0001\u001a\u00020\t2\t\b\u0002\u0010¶\u0001\u001a\u00020\t2\u000e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0²\u0001H\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001b\u0010Ä\u0001\u001a\u00030Á\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001R4\u0010Ç\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Å\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ò\u0001\u001a\u00020n8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R2\u0010Ô\u0001\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÔ\u0001\u0010Õ\u0001\u0012\u0005\bÚ\u0001\u0010\u0013\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Û\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R1\u0010Þ\u0001\u001a\u00030Ý\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÞ\u0001\u0010ß\u0001\u0012\u0005\bä\u0001\u0010\u0013\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R1\u0010æ\u0001\u001a\u00030å\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bæ\u0001\u0010ç\u0001\u0012\u0005\bì\u0001\u0010\u0013\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R1\u0010î\u0001\u001a\u00030í\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bî\u0001\u0010ï\u0001\u0012\u0005\bô\u0001\u0010\u0013\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R1\u0010õ\u0001\u001a\u00030Á\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bõ\u0001\u0010ö\u0001\u0012\u0005\bû\u0001\u0010\u0013\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R1\u0010ý\u0001\u001a\u00030ü\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bý\u0001\u0010þ\u0001\u0012\u0005\b\u0083\u0002\u0010\u0013\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R1\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u0012\u0005\b\u008b\u0002\u0010\u0013\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0019\u0010\u008e\u0002\u001a\u0004\u0018\u00010Z8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0017\u0010\u0091\u0002\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R-\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u00182\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0002\u0010\u0090\u0002\"\u0005\b\u0093\u0002\u0010E¨\u0006\u0096\u0002"}, d2 = {"Lcom/braze/Braze;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/managers/n0;", "getDeviceDataProvider", "()Lcom/braze/managers/n0;", "", "isOffline", "Lfc/H;", "setSyncPolicyOfflineStatus", "(Z)V", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "()V", "Lcom/braze/managers/j1;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lcom/braze/managers/j1;)V", "", "key", "isEphemeralEventKey", "(Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "openSession", "(Landroid/app/Activity;)V", "closeSession", io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "logCustomEvent", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", "currencyCode", "Ljava/math/BigDecimal;", "price", "", DiscardedEvent.JsonKeys.QUANTITY, "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "Landroid/content/Intent;", "intent", "logPushNotificationOpened", "(Landroid/content/Intent;)V", "campaignId", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", "id", "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "(Ljava/lang/String;)V", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "logBannerImpression", "buttonId", "logBannerClick", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", io.flutter.plugins.firebase.analytics.Constants.USER_ID, "changeUser", "sdkAuthSignature", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "contentCardString", "deserializeContentCard", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "contentCardJson", "(Lorg/json/JSONObject;)Lcom/braze/models/cards/Card;", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "requestLocationInitialization", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "signature", "setSdkAuthenticationSignature", "ignoreRateLimit", "requestGeofenceRefresh$android_sdk_base_release", "requestGeofenceRefresh", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "requestGeofencesInitialization$android_sdk_base_release", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "validateAndStorePushId", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfDelayedInitEnabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "LRd/M;", "Llc/e;", "block", "runForResult$android_sdk_base_release", "(Ljava/lang/Object;Lvc/a;ZZZLvc/p;)Ljava/lang/Object;", "runForResult", "run$android_sdk_base_release", "(Lvc/a;ZZZLvc/a;)V", "run", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lcom/braze/images/IBrazeImageLoader;", "value", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lcom/braze/configuration/e;", "offlineUserStorageProvider", "Lcom/braze/configuration/e;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lcom/braze/managers/o0;", "deviceIdProvider", "Lcom/braze/managers/o0;", "getDeviceIdProvider$android_sdk_base_release", "()Lcom/braze/managers/o0;", "setDeviceIdProvider$android_sdk_base_release", "(Lcom/braze/managers/o0;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "externalIEventMessenger", "Lcom/braze/events/e;", "getExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lcom/braze/managers/q0;", "registrationDataProvider", "Lcom/braze/managers/q0;", "getRegistrationDataProvider$android_sdk_base_release", "()Lcom/braze/managers/q0;", "setRegistrationDataProvider$android_sdk_base_release", "(Lcom/braze/managers/q0;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lcom/braze/managers/v0;", "pushDeliveryManager", "Lcom/braze/managers/v0;", "getPushDeliveryManager$android_sdk_base_release", "()Lcom/braze/managers/v0;", "setPushDeliveryManager$android_sdk_base_release", "(Lcom/braze/managers/v0;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lcom/braze/managers/r0;", "udm", "Lcom/braze/managers/r0;", "getUdm$android_sdk_base_release", "()Lcom/braze/managers/r0;", "setUdm$android_sdk_base_release", "(Lcom/braze/managers/r0;)V", "getUdm$android_sdk_base_release$annotations", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "getDeviceId", "()Ljava/lang/String;", "deviceId", "getRegisteredPushToken", "setRegisteredPushToken", "registeredPushToken", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Braze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static t0 delayedInitializationProvider;
    private static n0 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static v2 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static com.braze.events.e staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public o0 deviceIdProvider;
    private com.braze.events.e externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private com.braze.configuration.e offlineUserStorageProvider;
    public v0 pushDeliveryManager;
    public q0 registrationDataProvider;
    public r0 udm;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = T.c("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = U.h("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\bJ\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\bJ\u0019\u0010+\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b-\u0010.J\u001f\u00106\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u00020\rH\u0001¢\u0006\u0004\b8\u00109R*\u0010;\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010B\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bG\u0010\u0003\u001a\u0004\b-\u0010D\"\u0004\bE\u0010FR*\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010\u0003\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010Q\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0003\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010\\\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b[\u0010\u0003\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u00109R\u001a\u0010]\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0003\u001a\u0004\b]\u0010\u000fR\u001a\u0010_\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010\u0003\u001a\u0004\b_\u0010\u000fR\u001a\u0010a\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010\u0003\u001a\u0004\ba\u0010\u000fR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00150f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00150f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010mR\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020 0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfc/H;", "clearSharedPreferencesData", "(Landroid/content/Context;)V", "clearDataStoreData", "Lcom/braze/storage/v2;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lcom/braze/storage/v2;", "", "shouldAllowSingletonInitialization", "()Z", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "Lcom/braze/configuration/BrazeConfig;", "config", "configure", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfig;)Z", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "enableSdk", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Lcom/braze/storage/t0;", "getDelayedInitializationProvider$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/storage/t0;", "getDelayedInitializationProvider", "Landroid/content/Intent;", "intent", "Lcom/braze/managers/m0;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lcom/braze/managers/m0;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "sdkEnablementProvider", "Lcom/braze/storage/v2;", "getSdkEnablementProvider$android_sdk_base_release", "()Lcom/braze/storage/v2;", "setSdkEnablementProvider$android_sdk_base_release", "(Lcom/braze/storage/v2;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "delayedInitializationProvider", "Lcom/braze/storage/t0;", "()Lcom/braze/storage/t0;", "setDelayedInitializationProvider$android_sdk_base_release", "(Lcom/braze/storage/t0;)V", "getDelayedInitializationProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lcom/braze/events/e;", "staticExternalIEventMessenger", "Lcom/braze/events/e;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "isDelayedInitializationEnabled", "isDelayedInitializationEnabled$annotations", "isSdkDisabledOrDelayed", "isSdkDisabledOrDelayed$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "Z", "areOutboundNetworkRequestsOffline", "", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$5() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$6() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$3() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$4() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z10) {
            return "Braze SDK outbound network requests are now " + (z10 ? "disabled" : "enabled");
        }

        private final void clearDataStoreData(Context context) {
            try {
                DataStoreProvider.INSTANCE.shutdownAllDataStores(context);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.P2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.clearDataStoreData$lambda$41();
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearDataStoreData$lambda$41() {
            return "Failed to delete DataStore data for the Braze SDK.";
        }

        private final void clearSharedPreferencesData(Context context) {
            File[] fileArrListFiles;
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: R4.H2
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        return Braze.Companion.clearSharedPreferencesData$lambda$37(file2, str);
                    }
                })) != null) {
                    for (final File file2 : fileArrListFiles) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.I2
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return Braze.Companion.clearSharedPreferencesData$lambda$39$lambda$38(file2);
                            }
                        }, 6, (Object) null);
                        AbstractC4862t.b(file2);
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.J2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.clearSharedPreferencesData$lambda$40();
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean clearSharedPreferencesData$lambda$37(File file, String name) {
            AbstractC4862t.e(name, "name");
            if (!C.P(name, "persistent", false, 2, null)) {
                if (C.P(name, "com.appboy", false, 2, null) && !AbstractC4862t.a(name, "com.appboy.override.configuration.cache")) {
                    return true;
                }
                if (C.P(name, "com.braze", false, 2, null) && !AbstractC4862t.a(name, "com.braze.override.configuration.cache")) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$39$lambda$38(File file) {
            return "Deleting shared prefs file at: " + file.getAbsolutePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$40() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$15(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$16() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$17() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$25() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$26() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$27() {
            return "disableSdk has finished";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$24() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$28() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$29() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$14$lambda$13$lambda$12() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$9() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$8$lambda$7() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v2 getSdkEnablementProvider(Context context) {
            v2 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            v2 v2Var = new v2(context);
            setSdkEnablementProvider$android_sdk_base_release(v2Var);
            return v2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$47() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$43$lambda$42(String str, Uri brazeEndpoint) {
            String authority;
            AbstractC4862t.e(brazeEndpoint, "brazeEndpoint");
            Uri uri = str != null ? Uri.parse(str) : null;
            String scheme = uri != null ? uri.getScheme() : null;
            boolean z10 = scheme == null || F.k0(scheme) || (authority = uri.getAuthority()) == null || F.k0(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z10 || uri.getScheme() == null) {
                builder.scheme(brazeEndpoint.getScheme());
            } else {
                builder.scheme(uri.getScheme());
            }
            if (z10) {
                builder.encodedAuthority(str);
            } else if (uri.getEncodedAuthority() != null) {
                builder.encodedAuthority(uri.getEncodedAuthority());
            } else {
                builder.encodedAuthority(brazeEndpoint.getEncodedAuthority());
            }
            if (z10 || uri.getPath() == null) {
                builder.path(brazeEndpoint.getPath());
            } else {
                builder.path(uri.getPath() + brazeEndpoint.getPath());
            }
            return builder.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.z2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.shouldAllowSingletonInitialization$lambda$44();
                    }
                }, 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.A2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.shouldAllowSingletonInitialization$lambda$45();
                    }
                }, 7, (Object) null);
                return true;
            }
            if (!AbstractC4862t.a(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.B2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.shouldAllowSingletonInitialization$lambda$46();
                }
            }, 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$44() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$45() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$46() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$48() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$49() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$50() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$52() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$36() {
            return "Failed to delete data from the internal storage cache.";
        }

        public final boolean configure(Context context, final BrazeConfig config) {
            AbstractC4862t.e(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28626I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.F2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.configure$lambda$15(config);
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && AbstractC4862t.a(Boolean.TRUE, braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Q2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.Companion.configure$lambda$18$lambda$16();
                        }
                    }, 6, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.V2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.Companion.configure$lambda$18$lambda$17();
                        }
                    }, 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void disableSdk(Context context) {
            AbstractC4862t.e(context, "context");
            getSdkEnablementProvider(context).b(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Y2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.disableSdk$lambda$25();
                }
            }, 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Z2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.disableSdk$lambda$26();
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.a3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.disableSdk$lambda$27();
                }
            }, 6, (Object) null);
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.D2
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21();
                                }
                            }, 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.E2
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22();
                                }
                            }, 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.G2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$24();
                }
            }, 6, (Object) null);
            return false;
        }

        public final void enableSdk(Context context) {
            AbstractC4862t.e(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.W2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.enableSdk$lambda$28();
                }
            }, 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.X2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.enableSdk$lambda$29();
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            AbstractC4862t.e(brazeEndpoint, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.S2
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return Braze.Companion.getApiEndpoint$lambda$14$lambda$13$lambda$12();
                            }
                        }, 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            AbstractC4862t.e(configurationProvider, "configurationProvider");
            try {
                return configurationProvider.getBrazeApiKey().f28070a;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.T2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.getConfiguredApiKey$lambda$9();
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final t0 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
        }

        public final Braze getInstance(Context context) {
            AbstractC4862t.e(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.INSTANCE;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new com.braze.events.d(new v2(context), new t0(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.u2
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return Braze.Companion.getInstance$lambda$8$lambda$7();
                                }
                            }, 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Braze braze2 = Braze.instance;
            AbstractC4862t.c(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final v2 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final com.braze.events.e getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDelayedInitializationEnabled() {
            t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.K2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion._get_isDelayedInitializationEnabled_$lambda$5();
                    }
                }, 7, (Object) null);
                return false;
            }
            boolean zC = delayedInitializationProvider$android_sdk_base_release.c();
            if (zC) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.L2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion._get_isDelayedInitializationEnabled_$lambda$6();
                    }
                }, 6, (Object) null);
            }
            return zC;
        }

        public final boolean isDisabled() {
            v2 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.M2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion._get_isDisabled_$lambda$2();
                    }
                }, 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && AbstractC4862t.a(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.N2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion._get_isDisabled_$lambda$3();
                    }
                }, 6, (Object) null);
                return true;
            }
            boolean zA = sdkEnablementProvider$android_sdk_base_release.a();
            if (zA) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.O2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion._get_isDisabled_$lambda$4();
                    }
                }, 6, (Object) null);
            }
            return zA;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, com.braze.managers.m0 brazeManager) {
            AbstractC4862t.e(intent, "intent");
            AbstractC4862t.e(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
            if (stringExtra == null || !AbstractC4862t.a(stringExtra, "true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.U2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion.requestTriggersIfInAppMessageTestPush$lambda$47();
                }
            }, 6, (Object) null);
            com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
            jVar.f28100b = Boolean.TRUE;
            ((r) brazeManager).a(jVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: R4.R2
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        return Braze.Companion.setConfiguredCustomEndpoint$lambda$43$lambda$42(configuredCustomEndpoint, uri);
                    }
                });
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(t0 t0Var) {
            Braze.delayedInitializationProvider = t0Var;
        }

        public final void setEndpointProvider(IBrazeEndpointProvider endpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = endpointProvider;
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(final boolean z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.y2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z10);
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z10;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z10);
                    C4015H c4015h = C4015H.f34254a;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(v2 v2Var) {
            Braze.sdkEnablementProvider = v2Var;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(com.braze.events.e eVar) {
            Braze.staticExternalIEventMessenger = eVar;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.b3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.stopInstance$lambda$48();
                    }
                }, 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.v2
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return Braze.Companion.stopInstance$lambda$51$lambda$49();
                            }
                        }, 6, (Object) null);
                        ((com.braze.events.d) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.w2
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return Braze.Companion.stopInstance$lambda$51$lambda$50();
                            }
                        }, 7, (Object) null);
                        com.braze.coroutine.f.f27586a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                com.braze.storage.p pVar = ((j1) braze.getUdm$android_sdk_base_release()).f27908D;
                                pVar.f28531i.clear();
                                pVar.f28530h.clear();
                                com.braze.managers.k0 k0Var = ((j1) braze.getUdm$android_sdk_base_release()).f27906B;
                                k0Var.getClass();
                                k0Var.f27944f = C4206t.k();
                                com.braze.managers.j jVar = ((j1) braze.getUdm$android_sdk_base_release()).f27907C;
                                jVar.getClass();
                                jVar.f27902f = C4206t.k();
                            }
                            com.braze.dispatch.f fVar = ((j1) braze.getUdm$android_sdk_base_release()).f27929r;
                            synchronized (fVar) {
                                fVar.f27610l = true;
                                fVar.b();
                                fVar.f();
                            }
                            com.braze.managers.h0 h0Var = ((j1) braze.getUdm$android_sdk_base_release()).f27931t;
                            h0Var.f27874b = true;
                            h0Var.f27873a.f28602c = true;
                            ((j1) braze.getUdm$android_sdk_base_release()).f27937z.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.x2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.stopInstance$lambda$52();
                    }
                }, 4, (Object) null);
            }
        }

        public final void wipeData(Context context) {
            Companion companion;
            AbstractC4862t.e(context, "context");
            stopInstance$android_sdk_base_release(true);
            try {
                com.braze.triggers.managers.b.f28722e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
                companion = this;
            } catch (Exception e10) {
                companion = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.C2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.Companion.wipeData$lambda$36();
                    }
                }, 4, (Object) null);
            }
            companion.clearSharedPreferencesData(context);
            companion.clearDataStoreData(context);
        }

        private Companion() {
        }

        public final t0 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            AbstractC4862t.e(context, "context");
            t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            t0 t0Var = new t0(context);
            setDelayedInitializationProvider$android_sdk_base_release(t0Var);
            return t0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Braze(final android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4862t.e(r11, r0)
            r10.<init>()
            com.braze.images.DefaultBrazeImageLoader r0 = new com.braze.images.DefaultBrazeImageLoader
            android.content.Context r2 = r11.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r2, r3)
            r0.<init>(r2)
            r10.imageLoader = r0
            long r8 = java.lang.System.nanoTime()
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            R4.a r5 = new R4.a
            r5.<init>()
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r10
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r2 = r11.getApplicationContext()
            r10.applicationContext = r2
            java.lang.String r2 = android.os.Build.MODEL
            if (r2 == 0) goto L60
            java.util.Set<java.lang.String> r3 = com.braze.Braze.KNOWN_APP_CRAWLER_DEVICE_MODELS
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r2.toLowerCase(r4)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r4, r5)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L60
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.f28626I
            R4.J0 r5 = new R4.J0
            r5.<init>()
            r6 = 6
            r7 = 0
            r2 = r3
            r3 = 0
            r4 = 0
            r1 = r10
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r6 = r0
            com.braze.Braze$Companion r0 = com.braze.Braze.INSTANCE
            r0.enableMockNetworkRequestsAndDropEventsMode()
            goto L61
        L60:
            r6 = r0
        L61:
            com.braze.events.e r0 = com.braze.Braze.staticExternalIEventMessenger
            if (r0 != 0) goto L79
            com.braze.events.d r0 = new com.braze.events.d
            com.braze.storage.v2 r2 = new com.braze.storage.v2
            android.content.Context r3 = r10.applicationContext
            r2.<init>(r3)
            com.braze.storage.t0 r3 = new com.braze.storage.t0
            android.content.Context r4 = r10.applicationContext
            r3.<init>(r4)
            r4 = 0
            r0.<init>(r2, r3, r4)
        L79:
            r10.externalIEventMessenger = r0
            R4.U0 r0 = new R4.U0
            r0.<init>()
            R4.f1 r5 = new R4.f1
            r5.<init>()
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r0
            r0 = r10
            r0.run$android_sdk_base_release(r1, r2, r3, r4, r5)
            long r0 = java.lang.System.nanoTime()
            R4.q1 r5 = new R4.q1
            r5.<init>()
            r0 = r6
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r1 = r10
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.<init>(android.content.Context):void");
    }

    public static String A() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    public static String A1() {
        return "**                                                                                   **";
    }

    public static String B() {
        return "Finished singleton setup.";
    }

    public static String C() {
        return "**                                                                                   **";
    }

    public static String D() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    public static String D0() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    public static String F() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    public static String F1() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    public static String G() {
        return "Failed to setup pre SDK tasks";
    }

    public static String H1() {
        return "Finished UserDependencyManager creation.";
    }

    public static String L1() {
        return "**                                   !! WARNING !!                                   **";
    }

    public static String O0() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    public static String P1() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    public static String T1() {
        return "Failed to startup user dependency manager.";
    }

    public static String U() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cachedContentCardsUpdatedEvent_$lambda$37() {
        return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_deviceId_$lambda$29() {
        return "Failed to retrieve the device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H _init_$lambda$27(Braze braze, Context context) {
        Braze braze2;
        com.braze.configuration.e eVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || F.k0(configuredApiKey)));
        t0 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        s0 s0Var = delayedInitializationProvider$android_sdk_base_release.f28571a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = s0Var.readBoolean(dataStoreKey, bool);
        Boolean bool3 = Boolean.TRUE;
        if (!AbstractC4862t.a(bool2, bool3) && configurationProvider.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!AbstractC4862t.a(delayedInitializationProvider$android_sdk_base_release.f28571a.readBoolean(dataStoreKey, bool), bool3)) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f28070a;
        braze.setPushDeliveryManager$android_sdk_base_release(new v0(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new com.braze.managers.y(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new com.braze.configuration.e(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new z0(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !F.k0(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.p2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.f0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.A1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.m
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.L1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.n
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.t1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.o
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.A();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.p
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.a0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.q
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.D0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.r
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.o0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.s
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.F1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.t
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.C();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.q2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.U();
                    }
                }, 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                com.braze.managers.l0 l0Var = new com.braze.managers.l0(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (l0Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.r2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.F();
                        }
                    }, 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        l0Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.s2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.p2();
                        }
                    }, 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.b
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.O0();
                    }
                }, 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                com.braze.managers.b bVar = com.braze.managers.c.f27842c;
                Context context2 = braze3.applicationContext;
                AbstractC4862t.e(context2, "context");
                if (bVar.a() && bVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.l0();
                        }
                    }, 6, (Object) null);
                    new com.braze.managers.c(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.d
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.D();
                        }
                    }, 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.e
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.P1();
                    }
                }, 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.G();
                }
            }, 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.l1();
            }
        }, 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
            if (eVar2 == null) {
                AbstractC4862t.p("offlineUserStorageProvider");
                eVar = null;
            } else {
                eVar = eVar2;
            }
            braze.setUserSpecificMemberVariablesAndStartDispatch(new j1(context3, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.H1();
                }
            }, 6, (Object) null);
            braze2 = braze;
        } catch (Exception e11) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: R4.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.T1();
                }
            }, 4, (Object) null);
            braze2.publishError(e11);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.B();
            }
        }, 6, (Object) null);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$28(long j10, long j11) {
        long j12 = j10 - j11;
        return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(j12, TimeUnit.NANOSECONDS) + " ms / " + j12 + " nanos";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$3() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$32(String str) {
        return "Failed to set the push token " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H _set_registeredPushToken_$lambda$36(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28626I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.d2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze._set_registeredPushToken_$lambda$36$lambda$33(str);
            }
        }, 6, (Object) null);
        if (str == null || F.k0(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.f2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze._set_registeredPushToken_$lambda$36$lambda$34();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (AbstractC4862t.a(((z0) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.e2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze._set_registeredPushToken_$lambda$36$lambda$35(str);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        ((z0) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        com.braze.storage.v0 v0Var = ((j1) braze.getUdm$android_sdk_base_release()).f27924m;
        if (v0Var == null) {
            AbstractC4862t.p("deviceCache");
            v0Var = null;
        }
        v0Var.e();
        braze.requestImmediateDataFlush();
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$33(String str) {
        return "Push token registered: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$34() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$35(String str) {
        return "Push token " + str + " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush";
    }

    public static String a0() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$168(String str, String str2) {
        return "Failed to update ContentCard storage provider with single card update. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H addSerializedCardJsonToStorage$lambda$170(final String str, Braze braze, final String str2) {
        if (F.k0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.D0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.addSerializedCardJsonToStorage$lambda$170$lambda$169(str2, str);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).f27908D.a(new com.braze.models.response.c(str), str2);
        ((com.braze.events.d) braze.externalIEventMessenger).b(((j1) braze.getUdm$android_sdk_base_release()).f27908D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$170$lambda$169(String str, String str2) {
        return "Cannot add null or blank card json to storage. Returning. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$125(Class cls) {
        return "Failed to add synchronous subscriber for class: " + cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$185() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$186() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$187(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$130(String str) {
        return "Failed to set external id to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H changeUser$lambda$137(final String str, Braze braze, final String str2) {
        com.braze.configuration.e eVar;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.I1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.changeUser$lambda$137$lambda$131();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.D1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.changeUser$lambda$137$lambda$132(str);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            AbstractC4862t.p("brazeUser");
            brazeUser = null;
        }
        final String userId = brazeUser.getUserId();
        if (AbstractC4862t.a(userId, str)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.E1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.changeUser$lambda$137$lambda$133(str);
                }
            }, 6, (Object) null);
            if (str2 != null && !F.k0(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.F1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.changeUser$lambda$137$lambda$134(str2);
                    }
                }, 7, (Object) null);
                ((j1) braze.getUdm$android_sdk_base_release()).f27933v.b(str2);
            }
        } else {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.G1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.changeUser$lambda$137$lambda$135(userId, str);
                }
            }, 6, (Object) null);
            com.braze.events.d dVar = ((j1) braze.getUdm$android_sdk_base_release()).f27925n;
            ReentrantLock reentrantLock = dVar.f27703h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                y0 y0Var = ((j1) braze.getUdm$android_sdk_base_release()).f27932u;
                y0Var.f28028b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                y0Var.f28028b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((j1) braze.getUdm$android_sdk_base_release()).f27936y.d();
                ((j1) braze.getUdm$android_sdk_base_release()).f27927p.a();
                com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
                if (eVar2 == null) {
                    AbstractC4862t.p("offlineUserStorageProvider");
                    eVar2 = null;
                }
                eVar2.b(str);
                r0 udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                Context context = braze.applicationContext;
                com.braze.configuration.e eVar3 = braze.offlineUserStorageProvider;
                if (eVar3 == null) {
                    AbstractC4862t.p("offlineUserStorageProvider");
                    eVar = null;
                } else {
                    eVar = eVar3;
                }
                braze.setUserSpecificMemberVariablesAndStartDispatch(new j1(context, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !F.k0(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.H1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.changeUser$lambda$137$lambda$136(str2);
                        }
                    }, 7, (Object) null);
                    ((j1) braze.getUdm$android_sdk_base_release()).f27933v.b(str2);
                }
                ((j1) braze.getUdm$android_sdk_base_release()).d().j();
                ((j1) braze.getUdm$android_sdk_base_release()).f27936y.l();
                j1 j1Var = (j1) udm$android_sdk_base_release;
                j1Var.getClass();
                AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new i1(j1Var, null), 3, null);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$131() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$132(String str) {
        return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$133(String str) {
        return "Received request to change current user " + str + " to the same user id. Not changing user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$134(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$135(String str, String str2) {
        return "Changing current user '" + str + "' to new user '" + str2 + ".'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$136(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$41() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$42() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H closeSession$lambda$43(Braze braze, com.braze.managers.a aVar) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(aVar);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$145() {
        return "Cannot deserialize null content card json string. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$146(String str) {
        return "Failed to deserialize content card json string. Payload: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$147(JSONObject jSONObject) {
        return "Failed to deserialize content card json. Payload: " + jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$148(String str) {
        return "Failed to deserialize in-app message json. Payload: " + str;
    }

    public static String f0() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$81() {
        return "Failed to get all feature flags";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$95(String str) {
        return "Failed to get Banner " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCachedContentCards$lambda$143() {
        return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$android_sdk_base_release$default(this, null, new InterfaceC6082a() { // from class: R4.K1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze._get_cachedContentCardsUpdatedEvent_$lambda$37();
            }
        }, false, false, false, new a(this, null), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$216() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$138() {
        return "Failed to retrieve the current user.";
    }

    private final n0 getDeviceDataProvider() {
        n0 xVar = deviceDataProvider;
        if (xVar == null) {
            xVar = new com.braze.managers.x(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = xVar;
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$82(String str) {
        return "Failed to get feature flag " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$179() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H handleInAppMessageTestPush$lambda$180(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((j1) braze.getUdm$android_sdk_base_release()).f27936y);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$181() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H handleInternalBannerRefresh$lambda$182(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27907C.a();
        return C4015H.f34254a;
    }

    private final boolean isEphemeralEventKey(final String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.isEphemeralEventKey$lambda$210();
            }
        }, 6, (Object) null);
        final Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        final boolean zContains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.g0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.isEphemeralEventKey$lambda$211(key, ephemeralEventKeys, zContains);
            }
        }, 6, (Object) null);
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$210() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$211(String str, Set set, boolean z10) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z10;
    }

    public static String l0() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    public static String l1() {
        return "Starting up a new user dependency manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$97(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logBannerClick$lambda$98(Braze braze, String str, String str2) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27907C.a(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$96(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$44(String str) {
        return "Failed to log custom event: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logCustomEvent$lambda$50(Braze braze, final String str, BrazeProperties brazeProperties, final BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Y1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logCustomEvent$lambda$50$lambda$45(str, brazeProperties2);
            }
        }, 6, (Object) null);
        final L l10 = new L();
        l10.f39776a = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((j1) braze.getUdm$android_sdk_base_release()).f27926o)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Z1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logCustomEvent$lambda$50$lambda$46(l10);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.a2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logCustomEvent$lambda$50$lambda$47(l10);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) l10.f39776a);
        l10.f39776a = strEnsureBrazeFieldLength;
        k kVarA = com.braze.models.outgoing.event.b.f28071g.a(strEnsureBrazeFieldLength, brazeProperties);
        if (kVarA == null) {
            return C4015H.f34254a;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.b2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logCustomEvent$lambda$50$lambda$48(str, brazeProperties2);
            }
        }, 6, (Object) null);
        if (braze.isEphemeralEventKey((String) l10.f39776a) ? ((j1) braze.getUdm$android_sdk_base_release()).f27926o.G() : ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(kVarA)) {
            ((j1) braze.getUdm$android_sdk_base_release()).f27911G.a((com.braze.triggers.events.i) new com.braze.triggers.events.a((String) l10.f39776a, brazeProperties, kVarA));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.c2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logCustomEvent$lambda$50$lambda$49(l10);
                }
            }, 6, (Object) null);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$45(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$46(L l10) {
        return "Logged custom event with name " + l10.f39776a + " was invalid. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$47(L l10) {
        return "Custom event with name " + l10.f39776a + " logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$48(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$49(L l10) {
        return "Not passing event with name " + l10.f39776a + " to trigger manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$83() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logFeatureFlagImpression$lambda$84(Braze braze, String str) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27906B.a(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$51(String str) {
        return "Failed to log purchase event of: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPurchase$lambda$54(String str, String str2, BigDecimal bigDecimal, int i10, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i10, ((j1) braze.getUdm$android_sdk_base_release()).f27926o)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.C
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPurchase$lambda$54$lambda$52();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPurchase$lambda$54$lambda$53();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f28071g;
        AbstractC4862t.b(str2);
        AbstractC4862t.b(bigDecimal);
        k kVarA = aVar.a(strEnsureBrazeFieldLength, str2, bigDecimal, i10, brazeProperties);
        if (kVarA == null) {
            return C4015H.f34254a;
        }
        if (((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(kVarA)) {
            ((j1) braze.getUdm$android_sdk_base_release()).f27911G.a((com.braze.triggers.events.i) new com.braze.triggers.events.f(strEnsureBrazeFieldLength, brazeProperties, kVarA));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$52() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$53() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$193(String str) {
        return "Error logging Push Delivery " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPushDelivery$lambda$194(Braze braze, String str, long j10) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$199() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPushMaxCampaign$lambda$200(Braze braze, String str) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.c(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$63() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPushNotificationActionClicked$lambda$67(String campaignId, Braze braze, String actionId, String actionType) throws JSONException {
        if (campaignId == null || F.k0(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.x0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationActionClicked$lambda$67$lambda$64();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (actionId == null || F.k0(actionId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.w0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationActionClicked$lambda$67$lambda$65();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        if (actionType == null || F.k0(actionType)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.v0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationActionClicked$lambda$67$lambda$66();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        int i10 = com.braze.models.outgoing.event.push.a.f28079j;
        AbstractC4862t.e(campaignId, "campaignId");
        AbstractC4862t.e(actionId, "actionId");
        AbstractC4862t.e(actionType, "actionType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", campaignId);
        jSONObject.put("a", actionId);
        com.braze.enums.c cVar = com.braze.enums.d.f27628b;
        com.braze.models.outgoing.event.push.a aVar = new com.braze.models.outgoing.event.push.a(jSONObject, actionType);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(aVar);
            return C4015H.f34254a;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(aVar);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$64() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$65() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$66() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$58(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPushNotificationOpened$lambda$62(Intent intent, Braze braze) throws JSONException {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.n0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationOpened$lambda$62$lambda$59();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        final String campaignId = intent.getStringExtra("cid");
        if (campaignId == null || F.k0(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.q0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationOpened$lambda$62$lambda$61();
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.o0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushNotificationOpened$lambda$62$lambda$60(campaignId);
                }
            }, 6, (Object) null);
            int i10 = com.braze.models.outgoing.event.push.c.f28081j;
            AbstractC4862t.e(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            com.braze.enums.c cVar = com.braze.enums.d.f27628b;
            com.braze.models.outgoing.event.push.c cVar2 = new com.braze.models.outgoing.event.push.c(jSONObject);
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(cVar2);
                return C4015H.f34254a;
            }
            ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(cVar2);
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((j1) braze.getUdm$android_sdk_base_release()).f27936y);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$59() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$60(String str) {
        return "Logging push click. Campaign Id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$61() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$68(String str, String str2) {
        return "Failed to log push story page clicked for pageId: " + str + " campaignId: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H logPushStoryPageClicked$lambda$71(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.r0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.logPushStoryPageClicked$lambda$71$lambda$69();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f28071g;
        AbstractC4862t.b(str);
        AbstractC4862t.b(str2);
        k kVarO = aVar.o(str, str2);
        if (kVarO != null) {
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.s0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.logPushStoryPageClicked$lambda$71$lambda$70();
                    }
                }, 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(kVarO);
                return C4015H.f34254a;
            }
            ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(kVarO);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$69() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$70() {
        return "Enqueuing push story page click to delayed init provider";
    }

    public static String o0() {
        return "**                                        See                                        **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$38() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$39() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H openSession$lambda$40(Braze braze, com.braze.managers.a aVar) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.b(aVar);
        return C4015H.f34254a;
    }

    public static String p2() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$197() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H performPushDeliveryFlush$lambda$198(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(0L);
        return C4015H.f34254a;
    }

    private final void publishError(final Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, throwable, false, new InterfaceC6082a() { // from class: R4.n2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.publishError$lambda$205();
                }
            }, 4, (Object) null);
            return;
        }
        try {
            ((j1) getUdm$android_sdk_base_release()).f27925n.b(throwable, Throwable.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.o2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.publishError$lambda$206(throwable);
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$205() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$206(Throwable th) {
        return "Failed to log throwable: " + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$191(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H reenqueueInAppMessage$lambda$192(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27911G.b(inAppMessageEvent.getTriggerAction());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$78() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H refreshFeatureFlags$lambda$80(Braze braze) {
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.H()) {
            ((j1) braze.getUdm$android_sdk_base_release()).f27906B.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.g2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.refreshFeatureFlags$lambda$80$lambda$79();
                }
            }, 6, (Object) null);
            ((j1) braze.getUdm$android_sdk_base_release()).f27925n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$80$lambda$79() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$126(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
        return "Did remove the background " + cls + org.apache.tika.utils.StringUtils.SPACE + iEventSubscriber + "? " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$127(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
        return "Did remove the synchronous " + cls + org.apache.tika.utils.StringUtils.SPACE + iEventSubscriber + "? " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$129(Class cls) {
        return "Failed to remove " + cls.getName() + " subscriber.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$85() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestBannersRefresh$lambda$94(List list, final Braze braze, final IValueCallback iValueCallback) {
        com.braze.managers.j.f27890h.a(list);
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.d()) {
            final L l10 = new L();
            final L l11 = new L();
            if (iValueCallback != null) {
                l10.f39776a = new IFireOnceEventSubscriber() { // from class: R4.k2
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$88(iValueCallback, l10, l11, braze, (BannersUpdatedEvent) obj);
                    }
                };
                l11.f39776a = new IFireOnceEventSubscriber() { // from class: R4.l2
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$89(iValueCallback, l10, l11, braze, (com.braze.events.internal.b) obj);
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) l10.f39776a;
                if (iFireOnceEventSubscriber != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) l11.f39776a;
                if (iFireOnceEventSubscriber2 != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(com.braze.events.internal.b.class, iFireOnceEventSubscriber2);
                }
            }
            if (!((j1) braze.getUdm$android_sdk_base_release()).f27907C.b(list)) {
                ((j1) braze.getUdm$android_sdk_base_release()).f27925n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
                requestBannersRefresh$lambda$94$unsubscribeLocalListeners(l10, l11, braze);
                if (iValueCallback != null) {
                    iValueCallback.onError();
                }
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.m2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.requestBannersRefresh$lambda$94$lambda$93();
                }
            }, 6, (Object) null);
            ((j1) braze.getUdm$android_sdk_base_release()).f27925n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$88(IValueCallback iValueCallback, L l10, L l11, Braze braze, BannersUpdatedEvent message) {
        AbstractC4862t.e(message, "message");
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(l10, l11, braze);
        iValueCallback.onSuccess(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$89(IValueCallback iValueCallback, L l10, L l11, Braze braze, com.braze.events.internal.b bVar) {
        AbstractC4862t.e(bVar, "<unused var>");
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(l10, l11, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$94$lambda$93() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$94$unsubscribeLocalListeners(L l10, L l11, Braze braze) {
        IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) l10.f39776a;
        if (iFireOnceEventSubscriber != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) l11.f39776a;
        if (iFireOnceEventSubscriber2 != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(com.braze.events.internal.b.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$72() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestContentCardsRefresh$lambda$75(Braze braze) {
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.E()) {
            if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.D()) {
                com.braze.communication.dust.i iVar = (com.braze.communication.dust.i) ((j1) braze.getUdm$android_sdk_base_release()).f27927p.f27864c;
                iVar.getClass();
                long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                long j10 = iVar.f27562c.get();
                long j11 = jNowInMilliseconds - j10;
                InterfaceC2166z0 interfaceC2166z0 = iVar.f27560a;
                if (interfaceC2166z0 != null && interfaceC2166z0.c() && iVar.f27561b.get() && j10 != 0 && j11 > 3000) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.h2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.requestContentCardsRefresh$lambda$75$lambda$73();
                        }
                    }, 6, (Object) null);
                    com.braze.events.e eVar = braze.externalIEventMessenger;
                    com.braze.storage.p pVar = ((j1) braze.getUdm$android_sdk_base_release()).f27908D;
                    pVar.getClass();
                    ((com.braze.events.d) eVar).b(pVar.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
                    return C4015H.f34254a;
                }
            }
            ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(((j1) braze.getUdm$android_sdk_base_release()).f27908D.f28526d, ((j1) braze.getUdm$android_sdk_base_release()).f27908D.f28527e, 0, com.braze.requests.c.f28229d);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.j2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.requestContentCardsRefresh$lambda$75$lambda$74();
                }
            }, 7, (Object) null);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$73() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$74() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$76() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestContentCardsRefreshFromCache$lambda$77(Braze braze) {
        ((com.braze.events.d) braze.externalIEventMessenger).b(((j1) braze.getUdm$android_sdk_base_release()).f27908D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$166(boolean z10) {
        return "Failed to request geofence refresh with rate limit ignore: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestGeofenceRefresh$lambda$167(Braze braze, boolean z10) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27937z.requestGeofenceRefresh(z10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$175() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestGeofencesInitialization$lambda$176(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27937z.initializeGeofences();
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestImmediateDataFlush$lambda$101(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.A
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestImmediateDataFlush$lambda$101$lambda$100();
            }
        }, 6, (Object) null);
        r rVar = ((j1) braze.getUdm$android_sdk_base_release()).f27936y;
        rVar.getClass();
        rVar.a(new com.braze.models.outgoing.j());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$101$lambda$100() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$99() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$153() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$177() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestSingleLocationUpdate$lambda$178(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27905A.f();
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$189(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H retryInAppMessage$lambda$190(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27911G.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return C4015H.f34254a;
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, InterfaceC6082a interfaceC6082a, boolean z10, boolean z11, boolean z12, InterfaceC6082a interfaceC6082a2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        braze.run$android_sdk_base_release(interfaceC6082a, z10, z11, z12, interfaceC6082a2);
    }

    public static /* synthetic */ Object runForResult$android_sdk_base_release$default(Braze braze, Object obj, InterfaceC6082a interfaceC6082a, boolean z10, boolean z11, boolean z12, vc.p pVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return braze.runForResult$android_sdk_base_release(obj, interfaceC6082a, z10, z11, z12, pVar);
    }

    public static String s(String str) {
        return "Device build model matches a known crawler. Enabling mock network request mode. Device it: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$195() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H schedulePushDelivery$lambda$196(Braze braze, long j10) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.a(j10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$154(String str, boolean z10) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final fc.C4015H setGoogleAdvertisingId$lambda$156(com.braze.Braze r8, final java.lang.String r9, final boolean r10) {
        /*
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f28624D
            R4.U1 r5 = new R4.U1
            r5.<init>()
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.managers.n0 r8 = r1.getDeviceDataProvider()
            com.braze.managers.x r8 = (com.braze.managers.x) r8
            if (r9 == 0) goto L22
            r8.getClass()
            boolean r0 = Od.F.k0(r9)
            if (r0 == 0) goto L24
        L22:
            java.lang.String r9 = ""
        L24:
            com.braze.storage.w0 r8 = r8.f28023d
            com.braze.enums.DataStoreKey r0 = com.braze.enums.DataStoreKey.GOOGLE_ADVERTISING_ID
            r8.writeData(r0, r9)
            com.braze.managers.n0 r8 = r1.getDeviceDataProvider()
            com.braze.managers.x r8 = (com.braze.managers.x) r8
            com.braze.storage.w0 r8 = r8.f28023d
            com.braze.enums.DataStoreKey r9 = com.braze.enums.DataStoreKey.AD_TRACKING_ENABLED
            r10 = r10 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8.writeData(r9, r10)
            fc.H r8 = fc.C4015H.f34254a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.setGoogleAdvertisingId$lambda$156(com.braze.Braze, java.lang.String, boolean):fc.H");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$156$lambda$155(String str, boolean z10) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$157(String str) {
        return "Failed to set SDK authentication signature on device.\n" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setSdkAuthenticationSignature$lambda$160(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.G
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSdkAuthenticationSignature$lambda$160$lambda$158(str);
            }
        }, 6, (Object) null);
        if (F.k0(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.I
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.setSdkAuthenticationSignature$lambda$160$lambda$159();
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).f27933v.b(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$158(String str) {
        return "Got new sdk auth signature " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$159() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(final boolean isOffline) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.L1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSyncPolicyOfflineStatus$lambda$202(isOffline);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.N1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSyncPolicyOfflineStatus$lambda$204(this.f14614a, isOffline);
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$202(boolean z10) {
        return "Failed to set sync policy offline to " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setSyncPolicyOfflineStatus$lambda$204(Braze braze, final boolean z10) {
        ((j1) braze.getUdm$android_sdk_base_release()).f27936y.getClass();
        com.braze.dispatch.f fVar = ((j1) braze.getUdm$android_sdk_base_release()).f27929r;
        synchronized (fVar) {
            try {
                fVar.f27610l = z10;
                fVar.b();
                if (z10) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.c0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSyncPolicyOfflineStatus$lambda$204$lambda$203(z10);
            }
        }, 7, (Object) null);
        braze.getImageLoader().setOffline(z10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$204$lambda$203(boolean z10) {
        return "Setting the image loader deny network downloads to " + z10;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(j1 dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        com.braze.coroutine.f fVar = com.braze.coroutine.f.f27586a;
        com.braze.coroutine.f.f27587b = ((j1) getUdm$android_sdk_base_release()).f27925n;
        DataStoreProvider.INSTANCE.setEventPublisher$android_sdk_base_release(((j1) getUdm$android_sdk_base_release()).f27925n);
        n3 n3VarD = ((j1) getUdm$android_sdk_base_release()).d();
        r rVar = ((j1) getUdm$android_sdk_base_release()).f27936y;
        com.braze.configuration.e eVar = this.offlineUserStorageProvider;
        BrazeUser brazeUser = null;
        if (eVar == null) {
            AbstractC4862t.p("offlineUserStorageProvider");
            eVar = null;
        }
        this.brazeUser = new BrazeUser(n3VarD, rVar, eVar.a(), ((j1) getUdm$android_sdk_base_release()).f27905A, ((j1) getUdm$android_sdk_base_release()).f27926o);
        ((j1) getUdm$android_sdk_base_release()).f27928q.a(((j1) getUdm$android_sdk_base_release()).f27925n);
        ((j1) getUdm$android_sdk_base_release()).f27925n.a();
        ((j1) getUdm$android_sdk_base_release()).f27931t.a(((j1) getUdm$android_sdk_base_release()).f27925n);
        ((j1) getUdm$android_sdk_base_release()).f27910F.i();
        com.braze.events.e eVar2 = this.externalIEventMessenger;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 == null) {
            AbstractC4862t.p("brazeUser");
            brazeUser2 = null;
        }
        ((com.braze.events.d) eVar2).b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        com.braze.events.d dVar = ((j1) getUdm$android_sdk_base_release()).f27925n;
        BrazeUser brazeUser3 = this.brazeUser;
        if (brazeUser3 == null) {
            AbstractC4862t.p("brazeUser");
        } else {
            brazeUser = brazeUser3;
        }
        dVar.b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$112() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToBannersUpdates$lambda$114(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.h0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.subscribeToBannersUpdates$lambda$114$lambda$113();
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.d()) {
            com.braze.managers.j jVar = ((j1) braze.getUdm$android_sdk_base_release()).f27907C;
            jVar.getClass();
            List list = jVar.f27902f;
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) jVar.f27898b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
        } else {
            ((j1) braze.getUdm$android_sdk_base_release()).f27925n.b(new BannersUpdatedEvent(C4206t.k()), BannersUpdatedEvent.class);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$114$lambda$113() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$115() {
        return "Failed to add subscriber for Banner updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$121() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToChangeUserEvents$lambda$123(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.U
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.subscribeToChangeUserEvents$lambda$123$lambda$122();
            }
        }, 7, (Object) null);
        com.braze.events.e eVar = braze.externalIEventMessenger;
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            AbstractC4862t.p("brazeUser");
            brazeUser = null;
        }
        ((com.braze.events.d) eVar).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$123$lambda$122() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$124() {
        return "Failed to add subscriber for braze user change events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$104() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToContentCardsUpdates$lambda$106(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.C1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.subscribeToContentCardsUpdates$lambda$106$lambda$105();
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.E()) {
            com.braze.events.e eVar = braze.externalIEventMessenger;
            ((com.braze.events.d) eVar).b(((j1) braze.getUdm$android_sdk_base_release()).f27908D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$106$lambda$105() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$107() {
        return "Failed to add subscriber for Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$108() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H subscribeToFeatureFlagsUpdates$lambda$110(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.m0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.subscribeToFeatureFlagsUpdates$lambda$110$lambda$109();
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).f27926o.H()) {
            com.braze.managers.k0 k0Var = ((j1) braze.getUdm$android_sdk_base_release()).f27906B;
            if (k0Var.f27945g.get()) {
                List list = k0Var.f27944f;
                ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                }
                ((com.braze.events.d) k0Var.f27940b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
            }
        } else {
            ((j1) braze.getUdm$android_sdk_base_release()).f27925n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$110$lambda$109() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$111() {
        return "Failed to add subscriber for Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$102() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$120() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$119() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    public static String t1() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$201() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        boolean z10 = true;
        for (final String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.V
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.verifyProperSdkSetup$lambda$207(str);
                    }
                }, 6, (Object) null);
                z10 = false;
            }
        }
        if (F.k0(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f28070a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.W
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.verifyProperSdkSetup$lambda$208();
                }
            }, 6, (Object) null);
            z10 = false;
        }
        if (z10) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.X
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.verifyProperSdkSetup$lambda$209();
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$207(String str) {
        return "The Braze SDK requires the permission " + str + ". Check your AndroidManifest.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$208() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$209() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(final String serializedCardJson, final String userId) {
        AbstractC4862t.e(serializedCardJson, "serializedCardJson");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.t0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.addSerializedCardJsonToStorage$lambda$168(userId, serializedCardJson);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.u0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.addSerializedCardJsonToStorage$lambda$170(serializedCardJson, this, userId);
            }
        }, 14, null);
    }

    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        AbstractC4862t.e(subscriber, "subscriber");
        AbstractC4862t.e(eventClass, "eventClass");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(eventClass, subscriber);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.b1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.addSingleSynchronousSubscription$lambda$125(eventClass);
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.R1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$185();
                }
            }, 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (final BrazeConfig brazeConfig : pendingConfigurations) {
                if (AbstractC4862t.a(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.S1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$186();
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.T1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$187(brazeConfig);
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void changeUser(String userId) {
        changeUser(userId, null);
    }

    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.O0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.closeSession$lambda$41();
                }
            }, 6, (Object) null);
        } else {
            final com.braze.managers.a aVar = new com.braze.managers.a(activity.getClass());
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.P0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.closeSession$lambda$42();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.Q0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.closeSession$lambda$43(this.f14624a, aVar);
                }
            }, 14, null);
        }
    }

    public Card deserializeContentCard(final String contentCardString) {
        if (contentCardString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.p0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.deserializeContentCard$lambda$145();
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(contentCardString));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.A0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.deserializeContentCard$lambda$146(contentCardString);
                }
            }, 4, (Object) null);
            publishError(e10);
            return null;
        }
    }

    public IInAppMessage deserializeInAppMessageString(final String inAppMessageString) {
        return (IInAppMessage) runForResult$android_sdk_base_release$default(this, null, new InterfaceC6082a() { // from class: R4.z1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.deserializeInAppMessageString$lambda$148(inAppMessageString);
            }
        }, false, false, false, new d(inAppMessageString, this, null), 28, null);
    }

    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$android_sdk_base_release$default(this, C4206t.k(), new InterfaceC6082a() { // from class: R4.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.getAllFeatureFlags$lambda$81();
            }
        }, false, false, false, new f(this, null), 28, null);
    }

    public Banner getBanner(final String id2) {
        AbstractC4862t.e(id2, "id");
        return (Banner) runForResult$android_sdk_base_release$default(this, null, new InterfaceC6082a() { // from class: R4.y1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.getBanner$lambda$95(id2);
            }
        }, false, false, false, new g(this, id2, null), 28, null);
    }

    public List<Card> getCachedContentCards() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.o1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.getCachedContentCards$lambda$143();
            }
        }, 6, (Object) null);
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        AbstractC4862t.p("configurationProvider");
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        AbstractC4862t.e(context, "context");
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.X1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.getConfigurationProviderSafe$lambda$216();
            }
        }, 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        AbstractC4862t.e(completionCallback, "completionCallback");
        try {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new i(completionCallback, this, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.x1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.getCurrentUser$lambda$138();
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e10);
        }
    }

    public String getDeviceId() {
        return (String) runForResult$android_sdk_base_release("", new InterfaceC6082a() { // from class: R4.e0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze._get_deviceId_$lambda$29();
            }
        }, false, false, false, new e(this, null));
    }

    public final o0 getDeviceIdProvider$android_sdk_base_release() {
        o0 o0Var = this.deviceIdProvider;
        if (o0Var != null) {
            return o0Var;
        }
        AbstractC4862t.p("deviceIdProvider");
        return null;
    }

    /* JADX INFO: renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final com.braze.events.e getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    public FeatureFlag getFeatureFlag(final String id2) {
        AbstractC4862t.e(id2, "id");
        return (FeatureFlag) runForResult$android_sdk_base_release$default(this, null, new InterfaceC6082a() { // from class: R4.e1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.getFeatureFlag$lambda$82(id2);
            }
        }, false, false, false, new l(this, id2, null), 28, null);
    }

    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final v0 getPushDeliveryManager$android_sdk_base_release() {
        v0 v0Var = this.pushDeliveryManager;
        if (v0Var != null) {
            return v0Var;
        }
        AbstractC4862t.p("pushDeliveryManager");
        return null;
    }

    public final q0 getRegistrationDataProvider$android_sdk_base_release() {
        q0 q0Var = this.registrationDataProvider;
        if (q0Var != null) {
            return q0Var;
        }
        AbstractC4862t.p("registrationDataProvider");
        return null;
    }

    public final r0 getUdm$android_sdk_base_release() {
        r0 r0Var = this.udm;
        if (r0Var != null) {
            return r0Var;
        }
        AbstractC4862t.p("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(final Intent intent) {
        AbstractC4862t.e(intent, "intent");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.Q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.handleInAppMessageTestPush$lambda$179();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.S
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.handleInAppMessageTestPush$lambda$180(intent, this);
            }
        }, 14, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.y0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.handleInternalBannerRefresh$lambda$181();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.z0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.handleInternalBannerRefresh$lambda$182(this.f14763a);
            }
        }, 14, null);
    }

    /* JADX INFO: renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    public void logBannerClick(final String placementId, final String buttonId) {
        AbstractC4862t.e(placementId, "placementId");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.i1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logBannerClick$lambda$97(placementId);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.j1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logBannerClick$lambda$98(this.f14699a, placementId, buttonId);
            }
        }, 14, null);
    }

    public boolean logBannerImpression(final String placementId) {
        AbstractC4862t.e(placementId, "placementId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.FALSE, new InterfaceC6082a() { // from class: R4.u1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logBannerImpression$lambda$96(placementId);
            }
        }, false, false, false, new m(this, placementId, null), 28, null)).booleanValue();
    }

    public void logCustomEvent(final String eventName, final BrazeProperties properties) {
        final BrazeProperties brazePropertiesClone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.B1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logCustomEvent$lambda$44(eventName);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.M1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logCustomEvent$lambda$50(this.f14605a, eventName, brazePropertiesClone, properties);
            }
        }, 14, null);
    }

    public void logFeatureFlagImpression(final String id2) {
        AbstractC4862t.e(id2, "id");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.c1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logFeatureFlagImpression$lambda$83();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.d1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logFeatureFlagImpression$lambda$84(this.f14672a, id2);
            }
        }, 14, null);
    }

    public void logPurchase(final String productId, final String currencyCode, final BigDecimal price, final int quantity, BrazeProperties properties) {
        final BrazeProperties brazePropertiesClone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.v1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPurchase$lambda$51(productId);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.w1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPurchase$lambda$54(productId, currencyCode, price, quantity, this, brazePropertiesClone);
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(final String campaignId, final long timeInMs) {
        AbstractC4862t.e(campaignId, "campaignId");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.O
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushDelivery$lambda$193(campaignId);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.P
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushDelivery$lambda$194(this.f14620a, campaignId, timeInMs);
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(final String campaign) {
        AbstractC4862t.e(campaign, "campaign");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.k0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushMaxCampaign$lambda$199();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.l0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushMaxCampaign$lambda$200(this.f14709a, campaign);
            }
        }, 14, null);
    }

    public void logPushNotificationActionClicked(final String campaignId, final String actionId, final String actionType) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.i0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushNotificationActionClicked$lambda$63();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.j0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushNotificationActionClicked$lambda$67(campaignId, this, actionId, actionType);
            }
        }, 10, null);
    }

    public void logPushNotificationOpened(final Intent intent) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.a0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushNotificationOpened$lambda$58(intent);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.b0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushNotificationOpened$lambda$62(intent, this);
            }
        }, 10, null);
    }

    public void logPushStoryPageClicked(final String campaignId, final String pageId) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.Y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushStoryPageClicked$lambda$68(pageId, campaignId);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.Z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.logPushStoryPageClicked$lambda$71(campaignId, pageId, this);
            }
        }, 10, null);
    }

    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.S0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.openSession$lambda$38();
                }
            }, 6, (Object) null);
        } else {
            final com.braze.managers.a aVar = new com.braze.managers.a(activity.getClass());
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.T0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.openSession$lambda$39();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.V0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.openSession$lambda$40(this.f14635a, aVar);
                }
            }, 14, null);
        }
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.p1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.performPushDeliveryFlush$lambda$197();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.r1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.performPushDeliveryFlush$lambda$198(this.f14728a);
            }
        }, 14, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        AbstractC4862t.e(pushActionType, "pushActionType");
        AbstractC4862t.e(payload, "payload");
        ((com.braze.events.d) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        AbstractC4862t.e(event, "event");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.reenqueueInAppMessage$lambda$191(event);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.reenqueueInAppMessage$lambda$192(this.f14761a, event);
            }
        }, 14, null);
    }

    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.s1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.refreshFeatureFlags$lambda$78();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.t1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.refreshFeatureFlags$lambda$80(this.f14737a);
            }
        }, 14, null);
    }

    public <T> void removeSingleSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        AbstractC4862t.e(eventClass, "eventClass");
        if (subscriber != null) {
            try {
                final boolean zA = ((com.braze.events.d) this.externalIEventMessenger).a((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Y0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.removeSingleSubscription$lambda$128$lambda$126(eventClass, subscriber, zA);
                    }
                }, 6, (Object) null);
                final boolean zB = ((com.braze.events.d) this.externalIEventMessenger).b((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.Z0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.removeSingleSubscription$lambda$128$lambda$127(eventClass, subscriber, zB);
                    }
                }, 6, (Object) null);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.a1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Braze.removeSingleSubscription$lambda$129(eventClass);
                    }
                }, 4, (Object) null);
                publishError(e10);
            }
        }
    }

    public void requestBannersRefresh(List<String> ids) {
        AbstractC4862t.e(ids, "ids");
        requestBannersRefresh(ids, null);
    }

    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.g1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestContentCardsRefresh$lambda$72();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.h1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestContentCardsRefresh$lambda$75(this.f14689a);
            }
        }, 14, null);
    }

    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.k1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestContentCardsRefreshFromCache$lambda$76();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.l1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestContentCardsRefreshFromCache$lambda$77(this.f14711a);
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(final boolean ignoreRateLimit) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.E0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestGeofenceRefresh$lambda$166(ignoreRateLimit);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.F0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestGeofenceRefresh$lambda$167(this.f14576a, ignoreRateLimit);
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.V1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestGeofencesInitialization$lambda$175();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.W1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestGeofencesInitialization$lambda$176(this.f14639a);
            }
        }, 14, null);
    }

    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.m1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestImmediateDataFlush$lambda$99();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.n1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestImmediateDataFlush$lambda$101(this.f14718a);
            }
        }, 14, null);
    }

    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.R0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestLocationInitialization$lambda$153();
            }
        }, 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.E
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestSingleLocationUpdate$lambda$177();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.F
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestSingleLocationUpdate$lambda$178(this.f14575a);
            }
        }, 14, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        AbstractC4862t.e(event, "event");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.M
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.retryInAppMessage$lambda$189(event);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.N
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.retryInAppMessage$lambda$190(this.f14609a, event);
            }
        }, 14, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(InterfaceC6082a errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, InterfaceC6082a block) {
        InterfaceC6082a interfaceC6082a;
        AbstractC4862t.e(errorLog, "errorLog");
        AbstractC4862t.e(block, "block");
        Braze braze = this;
        try {
            com.braze.coroutine.f fVar = com.braze.coroutine.f.f27586a;
            try {
                p pVar = new p(earlyReturnIfDisabled, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, braze, block, errorLog, null);
                braze = braze;
                interfaceC6082a = errorLog;
                try {
                    AbstractC2132i.d(fVar, null, null, pVar, 3, null);
                } catch (Exception e10) {
                    e = e10;
                    Exception exc = e;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f28628W, (Throwable) exc, false, interfaceC6082a, 4, (Object) null);
                    braze.publishError(exc);
                }
            } catch (Exception e11) {
                e = e11;
                braze = braze;
                interfaceC6082a = errorLog;
            }
        } catch (Exception e12) {
            e = e12;
            interfaceC6082a = errorLog;
        }
    }

    public final <T> T runForResult$android_sdk_base_release(T defaultValueOnException, InterfaceC6082a errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, vc.p block) {
        AbstractC4862t.e(errorLog, "errorLog");
        AbstractC4862t.e(block, "block");
        try {
            return (T) AbstractC2130h.b(null, new t(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 1, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, errorLog, 4, (Object) null);
            publishError(e10);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(final long timeInMs) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.B0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.schedulePushDelivery$lambda$195();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.C0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.schedulePushDelivery$lambda$196(this.f14563a, timeInMs);
            }
        }, 14, null);
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        AbstractC4862t.e(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(o0 o0Var) {
        AbstractC4862t.e(o0Var, "<set-?>");
        this.deviceIdProvider = o0Var;
    }

    public void setGoogleAdvertisingId(final String googleAdvertisingId, final boolean isLimitAdTrackingEnabled) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.G0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setGoogleAdvertisingId$lambda$154(googleAdvertisingId, isLimitAdTrackingEnabled);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.H0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setGoogleAdvertisingId$lambda$156(this.f14590a, googleAdvertisingId, isLimitAdTrackingEnabled);
            }
        }, 14, null);
    }

    public final void setPushDeliveryManager$android_sdk_base_release(v0 v0Var) {
        AbstractC4862t.e(v0Var, "<set-?>");
        this.pushDeliveryManager = v0Var;
    }

    public void setRegisteredPushToken(final String str) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.i2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze._set_registeredPushToken_$lambda$32(str);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.t2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze._set_registeredPushToken_$lambda$36(this.f14738a, str);
            }
        }, 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(q0 q0Var) {
        AbstractC4862t.e(q0Var, "<set-?>");
        this.registrationDataProvider = q0Var;
    }

    public void setSdkAuthenticationSignature(final String signature) {
        AbstractC4862t.e(signature, "signature");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.W0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSdkAuthenticationSignature$lambda$157(signature);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.X0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.setSdkAuthenticationSignature$lambda$160(this.f14643a, signature);
            }
        }, 14, null);
    }

    public final void setUdm$android_sdk_base_release(r0 r0Var) {
        AbstractC4862t.e(r0Var, "<set-?>");
        this.udm = r0Var;
    }

    public void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BannersUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToBannersUpdates$lambda$112();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToBannersUpdates$lambda$114(this.f14745a);
                }
            }, 14, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.x
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToBannersUpdates$lambda$115();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(BrazeUserChangeEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.O1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToChangeUserEvents$lambda$121();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.P1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToChangeUserEvents$lambda$123(this.f14623a);
                }
            }, 14, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.Q1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToChangeUserEvents$lambda$124();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.I0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToContentCardsUpdates$lambda$104();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.K0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToContentCardsUpdates$lambda$106(this.f14601a);
                }
            }, 14, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.L0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToContentCardsUpdates$lambda$107();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.J
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToFeatureFlagsUpdates$lambda$108();
                }
            }, false, false, false, new InterfaceC6082a() { // from class: R4.K
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToFeatureFlagsUpdates$lambda$110(this.f14600a);
                }
            }, 14, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.L
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToFeatureFlagsUpdates$lambda$111();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(InAppMessageEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.A1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToNewInAppMessages$lambda$102();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazePushEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToPushNotificationEvents$lambda$120();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.T
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Braze.subscribeToSdkAuthenticationFailures$lambda$119();
                }
            }, 4, (Object) null);
            publishError(e10);
        }
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        AbstractC4862t.e(pushId, "pushId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.TRUE, new InterfaceC6082a() { // from class: R4.d0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.validateAndStorePushId$lambda$201();
            }
        }, false, false, false, new u(this, pushId, null), 28, null)).booleanValue();
    }

    public void changeUser(final String userId, final String sdkAuthSignature) {
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.changeUser$lambda$130(userId);
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.H
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.changeUser$lambda$137(userId, this, sdkAuthSignature);
            }
        }, 14, null);
    }

    public void requestBannersRefresh(final List<String> ids, final IValueCallback<BannersUpdatedEvent> completionCallback) {
        AbstractC4862t.e(ids, "ids");
        run$android_sdk_base_release$default(this, new InterfaceC6082a() { // from class: R4.M0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestBannersRefresh$lambda$85();
            }
        }, false, false, false, new InterfaceC6082a() { // from class: R4.N0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.requestBannersRefresh$lambda$94(ids, this, completionCallback);
            }
        }, 14, null);
    }

    public Card deserializeContentCard(final JSONObject contentCardJson) {
        return (Card) runForResult$android_sdk_base_release$default(this, null, new InterfaceC6082a() { // from class: R4.J1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Braze.deserializeContentCard$lambda$147(contentCardJson);
            }
        }, false, false, false, new c(this, contentCardJson, null), 28, null);
    }
}
