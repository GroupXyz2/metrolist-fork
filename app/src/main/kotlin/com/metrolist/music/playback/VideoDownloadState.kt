/**
 * Metrolist Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.metrolist.music.playback

sealed class VideoDownloadState {
    object Idle : VideoDownloadState()
    data class Downloading(val progress: Float) : VideoDownloadState()
    object Downloaded : VideoDownloadState()
    object Error : VideoDownloadState()
}
