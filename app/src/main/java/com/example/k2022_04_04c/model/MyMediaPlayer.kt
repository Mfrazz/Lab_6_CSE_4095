package com.example.k2022_03_08_rv.model

import android.media.AudioAttributes
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel


class MyMediaPlayer {
    private  var mediaPlayer: MediaPlayer =  MediaPlayer()

    fun setUpRadio(url: String) {
        mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
        }
        //mediaPlayer.setOnCompletionListener {
        //    it.release()
        //}
        //setAndPrepareRadioLink(url)
    }

    private fun setAndPrepareRadioLink(url: String) {
        with(mediaPlayer) {
            reset()
            setDataSource(url)
            prepareAsync()
        }
    }

    fun pause() {
        mediaPlayer.pause()
        mediaPlayer.reset()
    }

    fun start() {
        mediaPlayer.start()
    }

    fun prepareAndPlayStation(uri: String) {
        mediaPlayer.reset()
        mediaPlayer.setDataSource(uri)
        mediaPlayer.setOnPreparedListener {
            it.start()
        }
        mediaPlayer.prepareAsync()
    }

}