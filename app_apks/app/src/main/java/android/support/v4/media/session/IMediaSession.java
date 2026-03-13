package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void B5(boolean z10);

    void C0(Uri uri, Bundle bundle);

    CharSequence C4();

    int D2();

    void D3(int i10);

    void F1(String str, Bundle bundle);

    void G2(int i10);

    String H3();

    void J4(IMediaControllerCallback iMediaControllerCallback);

    boolean K2();

    void M1(Uri uri, Bundle bundle);

    PendingIntent O0();

    void P3(IMediaControllerCallback iMediaControllerCallback);

    void T(float f10);

    void T4();

    int U0();

    void U2(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void U3(RatingCompat ratingCompat);

    PlaybackStateCompat W();

    void W3(int i10, int i11, String str);

    void X2();

    List X5();

    void a4(MediaDescriptionCompat mediaDescriptionCompat);

    boolean b4();

    boolean c2(KeyEvent keyEvent);

    void c4(MediaDescriptionCompat mediaDescriptionCompat);

    void d0(int i10);

    int e0();

    long g6();

    Bundle getExtras();

    MediaMetadataCompat getMetadata();

    String getTag();

    void h2(RatingCompat ratingCompat, Bundle bundle);

    void h4(String str, Bundle bundle);

    void l2(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    ParcelableVolumeInfo l6();

    void n0(String str, Bundle bundle);

    void next();

    void o3(long j10);

    void p3(boolean z10);

    void pause();

    void play();

    void previous();

    void s1(String str, Bundle bundle);

    void seekTo(long j10);

    void stop();

    void t5(int i10, int i11, String str);

    void u();

    Bundle v1();

    boolean y0();

    void y1(String str, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IMediaSession {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IMediaSession {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21319a;

            public a(IBinder iBinder) {
                this.f21319a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21319a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) ? new a(iBinder) : (IMediaSession) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i10) {
                case 1:
                    U2(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) a.d(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zC2 = c2((KeyEvent) a.d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zC2 ? 1 : 0);
                    return true;
                case 3:
                    P3(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    J4(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zB4 = b4();
                    parcel2.writeNoException();
                    parcel2.writeInt(zB4 ? 1 : 0);
                    return true;
                case 6:
                    String strH3 = H3();
                    parcel2.writeNoException();
                    parcel2.writeString(strH3);
                    return true;
                case 7:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    PendingIntent pendingIntentO0 = O0();
                    parcel2.writeNoException();
                    a.f(parcel2, pendingIntentO0, 1);
                    return true;
                case 9:
                    long jG6 = g6();
                    parcel2.writeNoException();
                    parcel2.writeLong(jG6);
                    return true;
                case 10:
                    ParcelableVolumeInfo parcelableVolumeInfoL6 = l6();
                    parcel2.writeNoException();
                    a.f(parcel2, parcelableVolumeInfoL6, 1);
                    return true;
                case 11:
                    t5(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    W3(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    y1(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    F1(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    M1((Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    o3(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    T4();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    X2();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    U3((RatingCompat) a.d(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    n0(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    a.f(parcel2, metadata, 1);
                    return true;
                case 28:
                    PlaybackStateCompat playbackStateCompatW = W();
                    parcel2.writeNoException();
                    a.f(parcel2, playbackStateCompatW, 1);
                    return true;
                case 29:
                    List listX5 = X5();
                    parcel2.writeNoException();
                    a.e(parcel2, listX5, 1);
                    return true;
                case Build.API_LEVELS.API_30 /* 30 */:
                    CharSequence charSequenceC4 = C4();
                    parcel2.writeNoException();
                    if (charSequenceC4 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceC4, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    a.f(parcel2, extras, 1);
                    return true;
                case 32:
                    int iU0 = U0();
                    parcel2.writeNoException();
                    parcel2.writeInt(iU0);
                    return true;
                case 33:
                    u();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    s1(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    h4(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    C0((Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int iE0 = e0();
                    parcel2.writeNoException();
                    parcel2.writeInt(iE0);
                    return true;
                case 38:
                    boolean zY0 = y0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zY0 ? 1 : 0);
                    return true;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    d0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    p3(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    c4((MediaDescriptionCompat) a.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    l2((MediaDescriptionCompat) a.d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    a4((MediaDescriptionCompat) a.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    G2(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    boolean zK2 = K2();
                    parcel2.writeNoException();
                    parcel2.writeInt(zK2 ? 1 : 0);
                    return true;
                case 46:
                    B5(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int iD2 = D2();
                    parcel2.writeNoException();
                    parcel2.writeInt(iD2);
                    return true;
                case 48:
                    D3(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    T(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    Bundle bundleV1 = v1();
                    parcel2.writeNoException();
                    a.f(parcel2, bundleV1, 1);
                    return true;
                case 51:
                    h2((RatingCompat) a.d(parcel, RatingCompat.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
