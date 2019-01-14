package com.aorong.jarvis.play2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.soubw.jgallery.JGallery
import com.soubw.jgallery.config.DataType
import com.soubw.jgallery.config.PageTransformer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val jGallery = JGallery(this)
        setContentView(jGallery)

        val data = arrayListOf(
            "http://img2.ph.126.net/W_ARfKat8Kd980IaCadAfA==/6630180459815284013.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1547201969176&di=1d1bb1d35e3e8a5e051312c3164f8142&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201503%2F06%2F20150306115211_5HQv3.jpeg",
            "http://resource.qipa.com/joke/gif/20190111/o_1d0t77p3s1tagpfl18ibt13sod46.gif",
            "http://img2.ph.126.net/W_ARfKat8Kd980IaCadAfA==/6630180459815284013.jpg",  "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1547201969176&di=1d1bb1d35e3e8a5e051312c3164f8142&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201503%2F06%2F20150306115211_5HQv3.jpeg",  "http://img2.ph.126.net/W_ARfKat8Kd980IaCadAfA==/6630180459815284013.jpg",
//            "http://resource.qipa.com/video/201901/5c393edc1327f.mp4",
//            "http://resource.qipa.com/video/201812/5c176997e3885.mp4",
            "http://ww2.sinaimg.cn/mw690/92077a4bgw1f5q72gjc6wj20qo140n7v.jpg"
            )

        val type = arrayListOf(
            DataType.NORMAL_IMAGE,
            DataType.NORMAL_IMAGE,
            DataType.GIF_IMAGE,
            DataType.NORMAL_IMAGE,
            DataType.NORMAL_IMAGE,
            DataType.NORMAL_IMAGE,
//            DataType.NET_VIDEO,
//            DataType.NET_VIDEO,
            DataType.NORMAL_IMAGE
            )

        val pre = arrayListOf(
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
        )

        jGallery.setData(data,type,pre)
        jGallery.setAutoPlay(true)
    }
}
