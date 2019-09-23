package com.ld.kt.luban

class ImageBean constructor(originArg: String, thumbArg: String, image: String) {
    private var originArg: String = originArg
    private var thumbArg: String = thumbArg
    private var image: String = image

    private var extra: String?

    init {
        this.extra = null
    }

    constructor(originArg: String, thumbArg: String, image: String, extra: String) : this(originArg, thumbArg, image) {
        this.extra = extra
    }


}