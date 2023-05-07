package com.shvedov.pictureinpicturemode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerControlView = findViewById<PlayerView>(R.id.player_view)
        val player = ExoPlayer.Builder(this).build()
        player.setMediaItem(
            MediaItem.fromUri("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4")
        )
        playerControlView.player = player
        player.prepare()
        player.play()
    }
}