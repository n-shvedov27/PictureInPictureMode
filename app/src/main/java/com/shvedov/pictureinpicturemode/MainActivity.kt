package com.shvedov.pictureinpicturemode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerControlView = findViewById<PlayerView>(R.id.player_view)
        val player = ExoPlayer.Builder(this).build()
        player.repeatMode = Player.REPEAT_MODE_ONE
        player.setMediaItem(
            MediaItem.fromUri("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4")
        )
        playerControlView.player = player
        player.prepare()
        player.play()
    }
}