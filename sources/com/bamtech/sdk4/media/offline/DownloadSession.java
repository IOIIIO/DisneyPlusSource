package com.bamtech.sdk4.media.offline;

import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\rH&J?\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H'¢\u0006\u0002\u0010\u0018J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001fH&J\u0012\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020%H&J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0019\u001a\u00020\u001aH&J(\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070)0(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006H&J\u0016\u0010+\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadSession;", "", "cancelAllDownloads", "Lio/reactivex/Completable;", "getActiveDownloadTasks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/media/offline/DownloadTask;", "getDownloadTask", "Lio/reactivex/Maybe;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "cachedMediaId", "", "getPredictedDownloadSize", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "constraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "audioTracks", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleTracks", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "(Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/offline/VariantConstraints;Ljava/util/List;Ljava/util/List;)Ljava/lang/Long;", "request", "Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "interruptAllDownloads", "removeAllCachedMedia", "removeCachedMedia", "media", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "renewAllLicenses", "renewLicense", "cachedMedia", "resumeAllDownloads", "ignorePaused", "", "startDownload", "startDownloads", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "requests", "suspendAllDownloads", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadSession.kt */
public interface DownloadSession {
    Completable renewLicense(CachedMedia cachedMedia);
}