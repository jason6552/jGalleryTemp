package com.soubw.jgallery.listener;

public interface OnJVideoStatusChangeListener {
    /**
     * 媒体播放完成
     */
    void onMediaCompletion();

    /**
     * 媒体准备完成
     */
    void onMediaPrepared();
}
