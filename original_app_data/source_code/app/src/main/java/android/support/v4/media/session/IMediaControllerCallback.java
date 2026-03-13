package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void C6(PlaybackStateCompat playbackStateCompat);

    void K3(ParcelableVolumeInfo parcelableVolumeInfo);

    void O2(int i10);

    void Y4(boolean z10);

    void c1();

    void k2();

    void l1(List list);

    void l5(boolean z10);

    void m2(MediaMetadataCompat mediaMetadataCompat);

    void o5(CharSequence charSequence);

    void onEvent(String str, Bundle bundle);

    void onRepeatModeChanged(int i10);

    void p4(Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IMediaControllerCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IMediaControllerCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21318a;

            public a(IBinder iBinder) {
                this.f21318a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21318a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) ? new a(iBinder) : (IMediaControllerCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 1:
                    onEvent(parcel.readString(), (Bundle) a.b(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    k2();
                    return true;
                case 3:
                    C6((PlaybackStateCompat) a.b(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    m2((MediaMetadataCompat) a.b(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    l1(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    o5((CharSequence) a.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    p4((Bundle) a.b(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    K3((ParcelableVolumeInfo) a.b(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    l5(parcel.readInt() != 0);
                    return true;
                case 11:
                    Y4(parcel.readInt() != 0);
                    return true;
                case 12:
                    O2(parcel.readInt());
                    return true;
                case 13:
                    c1();
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
