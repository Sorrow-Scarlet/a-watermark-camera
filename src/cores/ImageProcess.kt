package com.gowork.a_watermark_camera.cores

import android.media.Image

interface ImageProcess
{
    // 选择，读取，处理，保存

    fun selectImage(image: Image)
    fun readImage()
    fun processImage()
    fun saveImage()
}

