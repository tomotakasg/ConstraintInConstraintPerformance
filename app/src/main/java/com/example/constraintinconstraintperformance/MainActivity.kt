package com.example.constraintinconstraintperformance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * https://developer.android.com/topic/performance/rendering/inspect-gpu-rendering?hl=ja
 * GPU オーバードローをデバッグ
 * GPU レンダリングのプロファイル作成
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}